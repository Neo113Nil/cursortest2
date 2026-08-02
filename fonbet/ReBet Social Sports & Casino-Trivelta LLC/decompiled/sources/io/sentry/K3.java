package io.sentry;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class K3 {

    /* renamed from: a, reason: collision with root package name */
    public final J3 f50410a;

    public K3(J3 j32) {
        this.f50410a = j32;
    }

    public List a(boolean z10) {
        HashMap hashMap = new HashMap();
        Thread currentThread = Thread.currentThread();
        hashMap.put(currentThread, currentThread.getStackTrace());
        return c(hashMap, null, false, z10);
    }

    public List b(List list, boolean z10, boolean z11) {
        return c(Thread.getAllStackTraces(), list, z10, z11);
    }

    public List c(Map map, List list, boolean z10, boolean z11) {
        Thread currentThread = Thread.currentThread();
        if (map.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (!map.containsKey(currentThread)) {
            map.put(currentThread, currentThread.getStackTrace());
        }
        for (Map.Entry entry : map.entrySet()) {
            Thread thread = (Thread) entry.getKey();
            arrayList.add(d((thread == currentThread && !z10) || !(list == null || !list.contains(Long.valueOf(thread.getId())) || z10), (StackTraceElement[]) entry.getValue(), (Thread) entry.getKey(), z11));
        }
        return arrayList;
    }

    public final io.sentry.protocol.A d(boolean z10, StackTraceElement[] stackTraceElementArr, Thread thread, boolean z11) {
        List a10;
        io.sentry.protocol.A a11 = new io.sentry.protocol.A();
        a11.w(thread.getName());
        a11.x(Integer.valueOf(thread.getPriority()));
        a11.u(Long.valueOf(thread.getId()));
        a11.s(Boolean.valueOf(thread.isDaemon()));
        a11.z(thread.getState().name());
        a11.q(Boolean.valueOf(z10));
        if (z11 && (a10 = this.f50410a.a(stackTraceElementArr, false)) != null && !a10.isEmpty()) {
            io.sentry.protocol.z zVar = new io.sentry.protocol.z(a10);
            zVar.i(Boolean.TRUE);
            a11.y(zVar);
        }
        return a11;
    }
}
