package com.inmobi.media;

import defpackage.lu3;
import defpackage.rq3;
import java.lang.ref.WeakReference;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.v5, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3824v5 implements InterfaceC3576lg {
    public final /* synthetic */ C3876x5 a;

    public C3824v5(C3876x5 c3876x5) {
        this.a = c3876x5;
    }

    @Override // com.inmobi.media.InterfaceC3576lg
    public final Object a(C3628ng c3628ng, rq3 rq3Var) {
        WeakReference weakReference = (WeakReference) this.a.b.get(c3628ng.a.h);
        InterfaceC3835vg interfaceC3835vg = weakReference != null ? (InterfaceC3835vg) weakReference.get() : null;
        boolean a = AbstractC3706qg.a(c3628ng);
        C3876x5 c3876x5 = this.a;
        if (!a) {
            Object a2 = c3876x5.a(c3628ng, interfaceC3835vg, rq3Var);
            return a2 == lu3.a ? a2 : Unit.a;
        }
        c3876x5.getClass();
        AbstractC3913yg.a(c3628ng, interfaceC3835vg);
        Object a3 = c3876x5.a.a.a("pings", "id=?", new String[]{c3628ng.a.b}, rq3Var);
        lu3 lu3Var = lu3.a;
        if (a3 != lu3Var) {
            a3 = Unit.a;
        }
        if (a3 != lu3Var) {
            a3 = Unit.a;
        }
        return a3 == lu3Var ? a3 : Unit.a;
    }
}
