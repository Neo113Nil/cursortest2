package com.inmobi.media;

import android.view.ViewGroup;
import defpackage.f1d;
import defpackage.fdi;
import defpackage.gdi;
import defpackage.hs4;
import defpackage.k53;
import defpackage.ku3;
import defpackage.rob;
import defpackage.th2;
import defpackage.un0;
import defpackage.weh;
import defpackage.xw3;
import defpackage.yda;
import defpackage.yso;
import defpackage.z45;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Xo {
    public final yda a;
    public final f1d b;

    public Xo(long j, ku3 ku3Var, ViewGroup viewGroup, InterfaceC3880x9 interfaceC3880x9) {
        ku3Var.getClass();
        viewGroup.getClass();
        fdi a = gdi.a(Boolean.FALSE);
        this.b = a;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).a("WindowLifecycleHandler", "WindowLifecycleHandler init - observableView: " + viewGroup + ", isAttachedToWindow: " + viewGroup.isAttachedToWindow());
        }
        th2 q = yso.q(new Zo(viewGroup, null));
        hs4 hs4Var = z45.a;
        this.a = xw3.L(ku3Var, null, null, new V4(un0.K(k53.g0(q, rob.a), ku3Var, weh.a, Boolean.valueOf(viewGroup.isAttachedToWindow())), new Q1(j, viewGroup, interfaceC3880x9, ku3Var, a), null), 3);
    }
}
