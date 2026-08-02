package com.inmobi.media;

import android.util.Log;
import android.view.View;
import com.iab.omid.library.inmobi.adsession.AdSession;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import defpackage.dmi;
import defpackage.hoi;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Y0 extends hoi implements Function2 {
    public final /* synthetic */ Oe a;
    public final /* synthetic */ View b;
    public final /* synthetic */ FriendlyObstructionPurpose c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y0(Oe oe, View view, FriendlyObstructionPurpose friendlyObstructionPurpose, rq3 rq3Var) {
        super(2, rq3Var);
        this.a = oe;
        this.b = view;
        this.c = friendlyObstructionPurpose;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new Y0(this.a, this.b, this.c, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Y0) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        try {
            AdSession adSession = this.a.c;
            if (adSession != null) {
                adSession.addFriendlyObstruction(this.b, this.c, null);
            }
        } catch (IllegalArgumentException e) {
            InterfaceC3880x9 interfaceC3880x9 = this.a.b;
            if (interfaceC3880x9 != null) {
                ((C3906y9) interfaceC3880x9).a(AbstractC3406f1.f, dmi.q("Failed to addObstruction. Reason: ", Log.getStackTraceString(e)));
            }
        }
        return Unit.a;
    }
}
