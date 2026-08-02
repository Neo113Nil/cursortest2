package io.sentry;

import java.util.ArrayList;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class b3 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final a3 f67766a;

    public b3(@NotNull a3 a3Var) {
        this.f67766a = a3Var;
    }

    final ArrayList a(@NotNull Map map, ArrayList arrayList, boolean z11, boolean z12) {
        ArrayList a11;
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
            boolean z13 = (thread == currentThread && !z11) || !(arrayList == null || !arrayList.contains(Long.valueOf(thread.getId())) || z11);
            StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) entry.getValue();
            Thread thread2 = (Thread) entry.getKey();
            io.sentry.protocol.z zVar = new io.sentry.protocol.z();
            zVar.w(thread2.getName());
            zVar.x(Integer.valueOf(thread2.getPriority()));
            zVar.u(Long.valueOf(thread2.getId()));
            zVar.s(Boolean.valueOf(thread2.isDaemon()));
            zVar.z(thread2.getState().name());
            zVar.q(Boolean.valueOf(z13));
            if (z12 && (a11 = this.f67766a.a(stackTraceElementArr, false)) != null && !a11.isEmpty()) {
                io.sentry.protocol.y yVar = new io.sentry.protocol.y(a11);
                yVar.i();
                zVar.y(yVar);
            }
            arrayList2.add(zVar);
        }
        return arrayList2;
    }
}
