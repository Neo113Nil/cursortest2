package com.mbridge.msdk.thrid.okhttp.internal.connection;

import com.mbridge.msdk.thrid.okhttp.c0;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class d {
    private final Set<c0> a = new LinkedHashSet();

    public synchronized void a(c0 c0Var) {
        this.a.remove(c0Var);
    }

    public synchronized void b(c0 c0Var) {
        this.a.add(c0Var);
    }

    public synchronized boolean c(c0 c0Var) {
        return this.a.contains(c0Var);
    }
}
