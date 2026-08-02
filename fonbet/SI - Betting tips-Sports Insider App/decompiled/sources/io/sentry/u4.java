package io.sentry;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class u4 {

    /* renamed from: a, reason: collision with root package name */
    public final t f17150a;

    public static io.sentry.protocol.u c(Throwable th2, io.sentry.protocol.m mVar, Long l6, List list, boolean z5) {
        Package r02 = th2.getClass().getPackage();
        String name = th2.getClass().getName();
        io.sentry.protocol.u uVar = new io.sentry.protocol.u();
        String message = th2.getMessage();
        if (r02 != null) {
            name = name.replace(r02.getName() + ".", "");
        }
        String name2 = r02 != null ? r02.getName() : null;
        if (list != null && !list.isEmpty()) {
            io.sentry.protocol.b0 b0Var = new io.sentry.protocol.b0(list);
            if (z5) {
                b0Var.f16751c = Boolean.TRUE;
            }
            uVar.f16919e = b0Var;
        }
        uVar.f16918d = l6;
        uVar.f16915a = name;
        uVar.f16920f = mVar;
        uVar.f16917c = name2;
        uVar.f16916b = message;
        return uVar;
    }

    public void a(Throwable th2, AtomicInteger atomicInteger, HashSet hashSet, ArrayDeque arrayDeque, String str) {
        Thread currentThread;
        io.sentry.protocol.m mVar;
        boolean z5;
        int i5 = atomicInteger.get();
        while (th2 != null && hashSet.add(th2)) {
            if (str == null) {
                str = "chained";
            }
            if (th2 instanceof io.sentry.exception.a) {
                io.sentry.exception.a aVar = (io.sentry.exception.a) th2;
                io.sentry.protocol.m mVar2 = aVar.f16383a;
                Throwable th3 = aVar.f16384b;
                currentThread = aVar.f16385c;
                z5 = aVar.f16386d;
                th2 = th3;
                mVar = mVar2;
            } else {
                io.sentry.protocol.m mVar3 = new io.sentry.protocol.m();
                currentThread = Thread.currentThread();
                mVar = mVar3;
                z5 = false;
            }
            arrayDeque.addFirst(c(th2, mVar, Long.valueOf(currentThread.getId()), this.f17150a.c(th2.getStackTrace(), Boolean.FALSE.equals(mVar.f16858d)), z5));
            if (mVar.f16855a == null) {
                mVar.f16855a = str;
            }
            if (atomicInteger.get() >= 0) {
                mVar.f16863i = Integer.valueOf(i5);
            }
            i5 = atomicInteger.incrementAndGet();
            mVar.f16862h = Integer.valueOf(i5);
            Throwable[] suppressed = th2.getSuppressed();
            if (suppressed != null && suppressed.length > 0) {
                for (Throwable th4 : suppressed) {
                    a(th4, atomicInteger, hashSet, arrayDeque, "suppressed");
                }
            }
            th2 = th2.getCause();
            str = null;
            atomicInteger = atomicInteger;
            hashSet = hashSet;
            arrayDeque = arrayDeque;
        }
    }

    public ArrayList b(Map map, ArrayList arrayList, boolean z5, boolean z7) {
        ArrayList c2;
        Thread currentThread = Thread.currentThread();
        if (map.isEmpty()) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        if (!map.containsKey(currentThread)) {
            map.put(currentThread, currentThread.getStackTrace());
        }
        for (Map.Entry entry : map.entrySet()) {
            Thread thread = (Thread) entry.getKey();
            boolean z10 = (thread == currentThread && !z5) || !(arrayList == null || !arrayList.contains(Long.valueOf(thread.getId())) || z5);
            StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) entry.getValue();
            Thread thread2 = (Thread) entry.getKey();
            io.sentry.protocol.d0 d0Var = new io.sentry.protocol.d0();
            d0Var.f16762c = thread2.getName();
            d0Var.f16761b = Integer.valueOf(thread2.getPriority());
            d0Var.f16760a = Long.valueOf(thread2.getId());
            d0Var.f16766g = Boolean.valueOf(thread2.isDaemon());
            d0Var.f16763d = thread2.getState().name();
            d0Var.f16764e = Boolean.valueOf(z10);
            if (z7 && (c2 = this.f17150a.c(stackTraceElementArr, false)) != null && !c2.isEmpty()) {
                io.sentry.protocol.b0 b0Var = new io.sentry.protocol.b0(c2);
                b0Var.f16751c = Boolean.TRUE;
                d0Var.f16768i = b0Var;
            }
            arrayList2.add(d0Var);
        }
        return arrayList2;
    }
}
