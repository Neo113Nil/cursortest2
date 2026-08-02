package com.inmobi.media;

import com.iab.omid.library.inmobi.adsession.AdEvents;
import com.iab.omid.library.inmobi.adsession.media.VastProperties;
import defpackage.hoi;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.z2, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3925z2 extends hoi implements Function2 {
    public final /* synthetic */ C2 a;
    public final /* synthetic */ VastProperties b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3925z2(C2 c2, VastProperties vastProperties, rq3 rq3Var) {
        super(2, rq3Var);
        this.a = c2;
        this.b = vastProperties;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new C3925z2(this.a, this.b, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3925z2(this.a, this.b, (rq3) obj2).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        AdEvents adEvents = this.a.e;
        if (adEvents != null) {
            adEvents.loaded(this.b);
        }
        return Unit.a;
    }
}
