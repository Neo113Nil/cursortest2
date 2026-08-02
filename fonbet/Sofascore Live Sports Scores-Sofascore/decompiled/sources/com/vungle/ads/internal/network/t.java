package com.vungle.ads.internal.network;

import defpackage.k62;
import defpackage.x52;
import defpackage.yzf;
import defpackage.zdc;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class t extends yzf {
    public final /* synthetic */ yzf a;
    public final /* synthetic */ x52 b;

    public t(yzf yzfVar, x52 x52Var) {
        this.a = yzfVar;
        this.b = x52Var;
    }

    @Override // defpackage.yzf
    public final long contentLength() {
        return this.b.b;
    }

    @Override // defpackage.yzf
    public final zdc contentType() {
        return this.a.contentType();
    }

    @Override // defpackage.yzf
    public final void writeTo(k62 k62Var) {
        k62Var.getClass();
        k62Var.i0(this.b.I0());
    }
}
