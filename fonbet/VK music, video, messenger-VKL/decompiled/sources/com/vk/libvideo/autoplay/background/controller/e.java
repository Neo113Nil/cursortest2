package com.vk.libvideo.autoplay.background.controller;

import android.app.Activity;
import defpackage.q0;
import xsna.bpn0;
import xsna.c63;
import xsna.hps0;
import xsna.ih80;
import xsna.j20;
import xsna.pa;
import xsna.q4s0;
import xsna.yg5;

/* compiled from: VideoBackgroundHintController.kt */
/* loaded from: classes2.dex */
public final class e extends c63.b {
    public final a b;
    public final pa c;
    public final q4s0 d;
    public final d e;
    public final bpn0 f;
    public hps0 g;

    /* compiled from: VideoBackgroundHintController.kt */
    public static final class a {
        public boolean a;

        public a() {
            this(0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return q0.a(new StringBuilder("State(isVideoHintCanBeShown="), this.a, ')');
        }

        public a(int i) {
            this.a = false;
        }
    }

    public e(a aVar, pa paVar, d dVar, bpn0 bpn0Var) {
        q4s0 q4s0Var = q4s0.a;
        this.b = aVar;
        this.c = paVar;
        this.d = q4s0Var;
        this.e = dVar;
        this.f = bpn0Var;
        c63 c63Var = c63.a;
        aVar.a = c63.f;
    }

    public final void D() {
        c63 c63Var = c63.a;
        Activity b = c63.b();
        if (b != null) {
            hps0 hps0Var = this.g;
            if (hps0Var != null) {
                yg5 yg5Var = hps0Var.b;
                if (yg5Var != null) {
                    yg5Var.T(hps0Var);
                }
                hps0Var.b = null;
                hps0Var.c = null;
            }
            this.g = null;
            ih80.b((ih80) this.f.getValue(), null, new j20(29, this, b), 3);
        }
    }

    @Override // xsna.c63.b
    public final void u() {
        this.b.a = false;
    }

    @Override // xsna.c63.b
    public final void x(Activity activity) {
        this.b.a = true;
    }
}
