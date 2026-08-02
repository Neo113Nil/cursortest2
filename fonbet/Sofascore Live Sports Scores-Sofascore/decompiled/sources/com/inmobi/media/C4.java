package com.inmobi.media;

import defpackage.bea;
import defpackage.k62;
import defpackage.yzf;
import defpackage.zdc;
import kotlin.text.Regex;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class C4 extends yzf {
    public final /* synthetic */ Pi a;

    public C4(Pi pi) {
        this.a = pi;
    }

    @Override // defpackage.yzf
    public final zdc contentType() {
        String a = this.a.a();
        Regex regex = zdc.e;
        return bea.H(a);
    }

    @Override // defpackage.yzf
    public final void writeTo(k62 k62Var) {
        k62Var.getClass();
        this.a.a(k62Var);
    }
}
