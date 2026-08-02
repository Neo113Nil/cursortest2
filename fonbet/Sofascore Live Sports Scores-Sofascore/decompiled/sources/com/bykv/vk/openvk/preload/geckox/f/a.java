package com.bykv.vk.openvk.preload.geckox.f;

import com.bykv.vk.openvk.preload.geckox.utils.FileLock;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class a {
    private static final Map<String, Lock> a = new HashMap();
    private FileLock b;
    private String c;

    private a(String str, FileLock fileLock) {
        this.c = str;
        this.b = fileLock;
    }

    public static a a(String str) throws Exception {
        Map<String, Lock> map = a;
        synchronized (map) {
            try {
                Lock lock = map.get(str);
                if (lock == null) {
                    lock = new ReentrantLock();
                    map.put(str, lock);
                }
                if (!lock.tryLock()) {
                    return null;
                }
                try {
                    FileLock c = FileLock.c(str);
                    if (c == null) {
                        lock.unlock();
                        return null;
                    }
                    return new a(str, c);
                } catch (Exception e) {
                    lock.lock();
                    com.bykv.vk.openvk.preload.geckox.utils.a.a(new RuntimeException(e));
                    return null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a() {
        Map<String, Lock> map = a;
        synchronized (map) {
            try {
                try {
                    this.b.a();
                    this.b.b();
                    map.get(this.c).unlock();
                } catch (Throwable th) {
                    a.get(this.c).unlock();
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
