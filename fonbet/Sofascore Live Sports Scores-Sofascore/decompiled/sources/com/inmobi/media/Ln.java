package com.inmobi.media;

import defpackage.b98;
import defpackage.ku3;
import defpackage.rq3;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Ln implements b98 {
    public final /* synthetic */ On a;

    public Ln(ku3 ku3Var, On on) {
        this.a = on;
    }

    @Override // defpackage.b98
    public final Object emit(Object obj, rq3 rq3Var) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        C3906y9 c3906y9 = this.a.c;
        if (c3906y9 != null) {
            c3906y9.a("VideoSurfaceViewabilityController", "Viewability " + booleanValue);
        }
        On on = this.a;
        if (booleanValue) {
            InterfaceC3477hk interfaceC3477hk = on.h;
            if (interfaceC3477hk != null) {
                interfaceC3477hk.a();
            }
        } else {
            InterfaceC3477hk interfaceC3477hk2 = on.h;
            if (interfaceC3477hk2 != null) {
                interfaceC3477hk2.b();
            }
        }
        return Unit.a;
    }
}
