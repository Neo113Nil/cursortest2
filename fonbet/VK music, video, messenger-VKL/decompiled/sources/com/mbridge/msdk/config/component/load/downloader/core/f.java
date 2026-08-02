package com.mbridge.msdk.config.component.load.downloader.core;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: DownloadRequestQueue.java */
/* loaded from: classes13.dex */
public class f {
    private final ConcurrentHashMap<String, d> a;
    private final ConcurrentHashMap<String, CopyOnWriteArrayList<d>> b;
    private final AtomicInteger c;

    /* compiled from: DownloadRequestQueue.java */
    public static final class b {
        private static final f a = new f();
    }

    public static f a() {
        return b.a;
    }

    private int b() {
        return this.c.incrementAndGet();
    }

    private f() {
        this.a = new ConcurrentHashMap<>();
        this.c = new AtomicInteger();
        this.b = new ConcurrentHashMap<>();
    }

    public synchronized void a(d dVar) {
        try {
            String e = dVar.e();
            dVar.a(b());
            if (this.a.containsKey(e)) {
                dVar.b(dVar.i() != 7 ? 8 : 7);
                if (this.b.containsKey(e)) {
                    CopyOnWriteArrayList<d> copyOnWriteArrayList = this.b.get(e);
                    if (copyOnWriteArrayList != null) {
                        copyOnWriteArrayList.add(dVar);
                        this.b.remove(e);
                        this.b.put(e, copyOnWriteArrayList);
                    }
                } else {
                    CopyOnWriteArrayList<d> copyOnWriteArrayList2 = new CopyOnWriteArrayList<>();
                    copyOnWriteArrayList2.add(dVar);
                    this.b.put(e, copyOnWriteArrayList2);
                }
            } else {
                dVar.b(dVar.i() != 7 ? 2 : 7);
                this.a.put(e, dVar);
                dVar.a(i.b().a().getDownloadTasks().submit(new h(dVar)));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void b(d dVar) {
        CopyOnWriteArrayList<d> remove;
        String e = dVar.e();
        this.a.remove(e);
        if (this.b.containsKey(e) && (remove = this.b.remove(e)) != null && !remove.isEmpty()) {
            d remove2 = remove.remove(0);
            remove2.b(2);
            this.a.put(e, remove2);
            remove2.a(i.b().a().getDownloadTasks().submit(new h(remove2)));
            if (!remove.isEmpty()) {
                this.b.put(e, remove);
            }
        }
    }

    public synchronized void a(String str) {
        CopyOnWriteArrayList<d> copyOnWriteArrayList;
        try {
            if (!TextUtils.isEmpty(str) && this.b.containsKey(str) && (copyOnWriteArrayList = this.b.get(str)) != null && !copyOnWriteArrayList.isEmpty()) {
                Iterator<d> it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    d next = it.next();
                    copyOnWriteArrayList.remove(next);
                    next.b(next.c());
                }
                if (!copyOnWriteArrayList.isEmpty()) {
                    this.b.remove(str);
                    this.b.put(str, copyOnWriteArrayList);
                } else {
                    this.b.remove(str);
                }
            }
            if (!TextUtils.isEmpty(str)) {
                a(this.a.get(str), str);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void c() {
    }

    private void a(d dVar, String str) {
        if (dVar != null) {
            dVar.a(dVar.c());
            this.a.remove(str);
        }
    }
}
