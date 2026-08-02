package com.vungle.ads.internal.task;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class s implements h {
    public static final Handler g = new Handler(Looper.getMainLooper());
    public static final String h = "s";
    public final e a;
    public final Executor b;
    public final n c;
    public final CopyOnWriteArrayList d;
    public final r e;
    public long f;

    public s(e eVar, com.vungle.ads.internal.executor.j jVar, i iVar) {
        eVar.getClass();
        jVar.getClass();
        this.a = eVar;
        this.b = jVar;
        this.c = iVar;
        this.f = Long.MAX_VALUE;
        this.d = new CopyOnWriteArrayList();
        this.e = new r(new WeakReference(this));
    }

    public final synchronized void a(f fVar) {
        try {
            fVar.getClass();
            f a = fVar.a();
            if (a != null) {
                String d = a.d();
                long b = a.b();
                a.g();
                if (a.f()) {
                    Iterator it = this.d.iterator();
                    while (it.hasNext()) {
                        q qVar = (q) it.next();
                        f a2 = qVar.a();
                        if (Intrinsics.c(a2 != null ? a2.d() : null, d)) {
                            boolean z = u.a;
                            String str = h;
                            str.getClass();
                            t.a(str, "replacing pending job with new " + d);
                            this.d.remove(qVar);
                        }
                    }
                }
                this.d.add(new q(SystemClock.uptimeMillis() + b, a));
                a();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void a() {
        try {
            long uptimeMillis = SystemClock.uptimeMillis();
            Iterator it = this.d.iterator();
            long j = Long.MAX_VALUE;
            while (it.hasNext()) {
                q qVar = (q) it.next();
                long j2 = qVar.a;
                if (uptimeMillis >= j2) {
                    this.d.remove(qVar);
                    f fVar = qVar.b;
                    if (fVar != null) {
                        this.b.execute(new g(fVar, this.a, this, this.c));
                    }
                } else {
                    j = Math.min(j, j2);
                }
            }
            if (j != Long.MAX_VALUE && j != this.f) {
                Handler handler = g;
                handler.removeCallbacks(this.e);
                handler.postAtTime(this.e, h, j);
            }
            this.f = j;
        } catch (Throwable th) {
            throw th;
        }
    }
}
