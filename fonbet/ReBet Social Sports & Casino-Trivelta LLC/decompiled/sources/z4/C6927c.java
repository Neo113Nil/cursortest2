package z4;

import com.bumptech.glide.util.k;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: z4.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6927c {

    /* renamed from: a, reason: collision with root package name */
    public final Map f68563a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final b f68564b = new b();

    /* renamed from: z4.c$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final Lock f68565a = new ReentrantLock();

        /* renamed from: b, reason: collision with root package name */
        public int f68566b;
    }

    /* renamed from: z4.c$b */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final Queue f68567a = new ArrayDeque();

        public a a() {
            a aVar;
            synchronized (this.f68567a) {
                aVar = (a) this.f68567a.poll();
            }
            return aVar == null ? new a() : aVar;
        }

        public void b(a aVar) {
            synchronized (this.f68567a) {
                try {
                    if (this.f68567a.size() < 10) {
                        this.f68567a.offer(aVar);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public void a(String str) {
        a aVar;
        synchronized (this) {
            try {
                aVar = (a) this.f68563a.get(str);
                if (aVar == null) {
                    aVar = this.f68564b.a();
                    this.f68563a.put(str, aVar);
                }
                aVar.f68566b++;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        aVar.f68565a.lock();
    }

    public void b(String str) {
        a aVar;
        synchronized (this) {
            try {
                aVar = (a) k.d(this.f68563a.get(str));
                int i10 = aVar.f68566b;
                if (i10 < 1) {
                    throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + aVar.f68566b);
                }
                int i11 = i10 - 1;
                aVar.f68566b = i11;
                if (i11 == 0) {
                    a aVar2 = (a) this.f68563a.remove(str);
                    if (!aVar2.equals(aVar)) {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + aVar + ", but actually removed: " + aVar2 + ", safeKey: " + str);
                    }
                    this.f68564b.b(aVar2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        aVar.f68565a.unlock();
    }
}
