package com.bykv.vk.openvk.preload.geckox.f;

import com.bykv.vk.openvk.preload.geckox.utils.FileLock;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class b {
    private static final Map<String, Lock> a = new HashMap();
    private static ReentrantLock b = new ReentrantLock();
    private String c;
    private FileLock d;

    private b(String str, FileLock fileLock) {
        this.c = str;
        this.d = fileLock;
    }

    public static b a(String str) throws Exception {
        b.lock();
        try {
            FileLock a2 = FileLock.a(str);
            Map<String, Lock> map = a;
            Lock lock = map.get(str);
            if (lock == null) {
                lock = new ReentrantLock();
                map.put(str, lock);
            }
            lock.lock();
            return new b(str, a2);
        } catch (Exception e) {
            b.unlock();
            throw e;
        }
    }

    public final void a() {
        try {
            this.d.a();
            this.d.b();
            Lock lock = a.get(this.c);
            if (lock != null) {
                lock.unlock();
            }
        } finally {
            b.unlock();
        }
    }
}
