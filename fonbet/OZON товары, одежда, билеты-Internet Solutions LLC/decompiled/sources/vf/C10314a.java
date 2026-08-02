package vf;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: vf.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C10314a implements d {

    /* renamed from: a, reason: collision with root package name */
    private final ReentrantReadWriteLock f102871a = new ReentrantReadWriteLock(false);

    /* renamed from: b, reason: collision with root package name */
    private HashMap f102872b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final AtomicInteger f102873c = new AtomicInteger();

    /* renamed from: vf.a$a, reason: collision with other inner class name */
    static class C2231a {

        /* renamed from: a, reason: collision with root package name */
        private final ArrayList f102874a = new ArrayList(1);

        C2231a(int i11, String str) {
        }

        final synchronized boolean a(int i11) {
            if (this.f102874a.size() >= 256) {
                return false;
            }
            this.f102874a.add(Integer.valueOf(i11));
            return true;
        }
    }

    C10314a() {
        new ArrayList();
    }

    public final void a(String str, boolean z11) {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f102871a;
        reentrantReadWriteLock.readLock().lock();
        HashMap hashMap = this.f102872b;
        try {
            C2231a c2231a = (C2231a) hashMap.get(str);
            AtomicInteger atomicInteger = this.f102873c;
            if (c2231a != null) {
                if (!c2231a.a(z11 ? 1 : 0)) {
                    atomicInteger.incrementAndGet();
                }
                return;
            }
            reentrantReadWriteLock.readLock().unlock();
            reentrantReadWriteLock.writeLock().lock();
            try {
                C2231a c2231a2 = (C2231a) hashMap.get(str);
                if (c2231a2 == null) {
                    if (hashMap.size() >= 256) {
                        atomicInteger.incrementAndGet();
                    } else {
                        c2231a2 = new C2231a(1, str);
                        hashMap.put(str, c2231a2);
                    }
                }
                if (!c2231a2.a(z11 ? 1 : 0)) {
                    atomicInteger.incrementAndGet();
                }
            } finally {
                reentrantReadWriteLock.writeLock().unlock();
            }
        } finally {
            reentrantReadWriteLock.readLock().unlock();
        }
    }
}
