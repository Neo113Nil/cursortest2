package com.fyber.inneractive.sdk.network;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class s0 implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Exception b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ t0 d;

    public s0(t0 t0Var, Object obj, Exception exc, boolean z) {
        this.d = t0Var;
        this.a = obj;
        this.b = exc;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.b.a(this.a, this.b, this.c);
    }
}
