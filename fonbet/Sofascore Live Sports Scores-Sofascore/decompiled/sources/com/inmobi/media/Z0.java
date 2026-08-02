package com.inmobi.media;

import android.util.Log;
import android.view.ViewGroup;
import com.iab.omid.library.inmobi.adsession.AdSession;
import defpackage.dmi;
import defpackage.hoi;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Z0 extends hoi implements Function2 {
    public final /* synthetic */ AbstractC3406f1 a;
    public final /* synthetic */ ViewGroup b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z0(AbstractC3406f1 abstractC3406f1, ViewGroup viewGroup, rq3 rq3Var) {
        super(2, rq3Var);
        this.a = abstractC3406f1;
        this.b = viewGroup;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new Z0(this.a, this.b, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Z0(this.a, this.b, (rq3) obj2).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        try {
            AdSession adSession = this.a.c;
            if (adSession != null) {
                adSession.registerAdView(this.b);
            }
        } catch (IllegalArgumentException e) {
            InterfaceC3880x9 interfaceC3880x9 = this.a.b;
            if (interfaceC3880x9 != null) {
                ((C3906y9) interfaceC3880x9).a(AbstractC3406f1.f, dmi.q("Failed to registerAdView. ", Log.getStackTraceString(e)));
            }
        }
        return Unit.a;
    }
}
