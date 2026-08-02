package io.sentry;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class A2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final a3 f66540a;

    public A2(@NotNull a3 a3Var) {
        this.f66540a = a3Var;
    }

    @NotNull
    private static io.sentry.protocol.s b(@NotNull Throwable th2, io.sentry.protocol.l lVar, Long l11, List list, boolean z11) {
        Package r02 = th2.getClass().getPackage();
        String name = th2.getClass().getName();
        io.sentry.protocol.s sVar = new io.sentry.protocol.s();
        String message = th2.getMessage();
        if (r02 != null) {
            name = name.replace(r02.getName() + ".", "");
        }
        String name2 = r02 != null ? r02.getName() : null;
        if (list != null && !list.isEmpty()) {
            io.sentry.protocol.y yVar = new io.sentry.protocol.y(list);
            if (z11) {
                yVar.i();
            }
            sVar.n(yVar);
        }
        sVar.o(l11);
        sVar.p(name);
        sVar.l(lVar);
        sVar.m(name2);
        sVar.r(message);
        return sVar;
    }

    @NotNull
    public static ArrayList c(@NotNull io.sentry.protocol.z zVar, @NotNull io.sentry.protocol.l lVar, @NotNull Throwable th2) {
        io.sentry.protocol.y n11 = zVar.n();
        if (n11 == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(b(th2, lVar, zVar.l(), n11.e(), true));
        return arrayList;
    }

    final void a(@NotNull Throwable th2, @NotNull AtomicInteger atomicInteger, @NotNull HashSet hashSet, @NotNull ArrayDeque arrayDeque, String str) {
        Thread currentThread;
        io.sentry.protocol.l lVar;
        boolean z11;
        int i11 = atomicInteger.get();
        while (th2 != null && hashSet.add(th2)) {
            if (str == null) {
                str = "chained";
            }
            if (th2 instanceof io.sentry.exception.a) {
                io.sentry.exception.a aVar = (io.sentry.exception.a) th2;
                io.sentry.protocol.l a11 = aVar.a();
                Throwable d11 = aVar.d();
                currentThread = aVar.b();
                z11 = aVar.e();
                th2 = d11;
                lVar = a11;
            } else {
                io.sentry.protocol.l lVar2 = new io.sentry.protocol.l();
                currentThread = Thread.currentThread();
                lVar = lVar2;
                z11 = false;
            }
            arrayDeque.addFirst(b(th2, lVar, Long.valueOf(currentThread.getId()), this.f66540a.a(th2.getStackTrace(), Boolean.FALSE.equals(lVar.l())), z11));
            if (lVar.k() == null) {
                lVar.r(str);
            }
            if (atomicInteger.get() >= 0) {
                lVar.p(Integer.valueOf(i11));
            }
            i11 = atomicInteger.incrementAndGet();
            lVar.m(Integer.valueOf(i11));
            Throwable[] suppressed = th2.getSuppressed();
            if (suppressed != null && suppressed.length > 0) {
                for (Throwable th3 : suppressed) {
                    a(th3, atomicInteger, hashSet, arrayDeque, "suppressed");
                }
            }
            th2 = th2.getCause();
            str = null;
            atomicInteger = atomicInteger;
            hashSet = hashSet;
            arrayDeque = arrayDeque;
        }
    }
}
