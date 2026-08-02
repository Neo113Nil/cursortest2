package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.TextureView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzchl extends TextureView {
    public final zzchz a;
    public final zzcij b;

    public zzchl(Context context) {
        super(context);
        this.a = new zzchz();
        this.b = new zzcij(context, this);
    }

    public abstract String h();

    public abstract void i(zzcht zzchtVar);

    public abstract void j(String str);

    public abstract void k();

    public abstract void l();

    public abstract void m();

    public abstract int n();

    public abstract int o();

    public abstract void p(int i);

    public abstract void q(float f, float f2);

    public abstract int r();

    public abstract int s();

    public abstract long t();

    public abstract long u();

    public abstract long v();

    public abstract int w();

    public abstract void x();

    public Integer y() {
        return null;
    }

    public void z(String str, String[] strArr, Integer num) {
        j(str);
    }

    public void A(int i) {
    }

    public void B(int i) {
    }

    public void e(int i) {
    }

    public void f(int i) {
    }

    public void g(int i) {
    }
}
