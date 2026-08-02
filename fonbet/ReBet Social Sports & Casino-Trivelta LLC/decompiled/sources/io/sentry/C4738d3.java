package io.sentry;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: io.sentry.d3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4738d3 {

    /* renamed from: a, reason: collision with root package name */
    public final J3 f52018a;

    public C4738d3(J3 j32) {
        this.f52018a = j32;
    }

    public Deque a(Throwable th2) {
        return b(th2, new AtomicInteger(-1), new HashSet(), new ArrayDeque(), null);
    }

    public Deque b(Throwable th2, AtomicInteger atomicInteger, HashSet hashSet, Deque deque, String str) {
        io.sentry.protocol.m mVar;
        Thread currentThread;
        Throwable th3;
        boolean z10;
        Deque deque2 = deque;
        String str2 = str;
        int i10 = atomicInteger.get();
        Throwable th4 = th2;
        while (th4 != null) {
            HashSet hashSet2 = hashSet;
            if (!hashSet2.add(th4)) {
                break;
            }
            if (str2 == null) {
                str2 = "chained";
            }
            int i11 = 0;
            if (th4 instanceof io.sentry.exception.a) {
                io.sentry.exception.a aVar = (io.sentry.exception.a) th4;
                mVar = aVar.a();
                Throwable c10 = aVar.c();
                currentThread = aVar.b();
                z10 = aVar.d();
                th3 = c10;
            } else {
                mVar = new io.sentry.protocol.m();
                currentThread = Thread.currentThread();
                th3 = th4;
                z10 = false;
            }
            io.sentry.protocol.m mVar2 = mVar;
            deque2.addFirst(c(th3, mVar2, currentThread != null ? Long.valueOf(currentThread.getId()) : null, this.f52018a.a(th3.getStackTrace(), Boolean.FALSE.equals(mVar2.l())), z10));
            if (mVar2.k() == null) {
                mVar2.r(str2);
            }
            if (atomicInteger.get() >= 0) {
                mVar2.p(Integer.valueOf(i10));
            }
            int incrementAndGet = atomicInteger.incrementAndGet();
            mVar2.m(Integer.valueOf(incrementAndGet));
            Throwable[] suppressed = th3.getSuppressed();
            if (suppressed != null && suppressed.length > 0) {
                int length = suppressed.length;
                while (i11 < length) {
                    b(suppressed[i11], atomicInteger, hashSet2, deque2, "suppressed");
                    i11++;
                    hashSet2 = hashSet;
                    deque2 = deque;
                }
            }
            th4 = th3.getCause();
            deque2 = deque;
            str2 = null;
            i10 = incrementAndGet;
        }
        return deque;
    }

    public final io.sentry.protocol.t c(Throwable th2, io.sentry.protocol.m mVar, Long l10, List list, boolean z10) {
        Package r02 = th2.getClass().getPackage();
        String name = th2.getClass().getName();
        io.sentry.protocol.t tVar = new io.sentry.protocol.t();
        String message = th2.getMessage();
        if (r02 != null) {
            name = name.replace(r02.getName() + ".", "");
        }
        String name2 = r02 != null ? r02.getName() : null;
        if (list != null && !list.isEmpty()) {
            io.sentry.protocol.z zVar = new io.sentry.protocol.z(list);
            if (z10) {
                zVar.i(Boolean.TRUE);
            }
            tVar.n(zVar);
        }
        tVar.o(l10);
        tVar.p(name);
        tVar.l(mVar);
        tVar.m(name2);
        tVar.r(message);
        return tVar;
    }

    public List d(Throwable th2) {
        return e(a(th2));
    }

    public final List e(Deque deque) {
        return new ArrayList(deque);
    }

    public List f(io.sentry.protocol.A a10, io.sentry.protocol.m mVar, Throwable th2) {
        io.sentry.protocol.z n10 = a10.n();
        if (n10 == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(c(th2, mVar, a10.l(), n10.e(), true));
        return arrayList;
    }
}
