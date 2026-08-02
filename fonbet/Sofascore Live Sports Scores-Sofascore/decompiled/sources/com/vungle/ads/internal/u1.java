package com.vungle.ads.internal;

import android.content.Context;
import com.vungle.ads.internal.model.i3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class u1 extends b1 implements com.vungle.ads.internal.presenter.z {
    public String r;
    public String s;
    public String t;
    public String u;
    public String v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(Context context) {
        super(context);
        context.getClass();
    }

    @Override // com.vungle.ads.internal.s
    public final boolean a(i3 i3Var) {
        i3Var.getClass();
        return i3Var.j();
    }

    public final void b(String str) {
        this.t = str;
    }

    public final void c(String str) {
        this.u = str;
    }

    public final void d(String str) {
        this.r = str;
    }

    public final void e(String str) {
        this.v = str;
    }

    public final String n() {
        return this.s;
    }

    public final String o() {
        return this.t;
    }

    public final String p() {
        return this.u;
    }

    public final String q() {
        return this.r;
    }

    public final String r() {
        return this.v;
    }

    public final void a(String str) {
        this.s = str;
    }

    @Override // com.vungle.ads.internal.b1
    public final com.vungle.ads.internal.presenter.z m() {
        return this;
    }
}
