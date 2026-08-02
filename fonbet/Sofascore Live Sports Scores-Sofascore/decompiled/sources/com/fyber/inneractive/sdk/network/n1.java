package com.fyber.inneractive.sdk.network;

import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class n1 {
    public final WeakReference a;
    public final WeakReference b;
    public final int c;
    public final m1 d = new m1(this);

    public n1(t0 t0Var, Thread thread, int i) {
        this.b = new WeakReference(t0Var);
        this.a = new WeakReference(thread);
        this.c = i;
    }
}
