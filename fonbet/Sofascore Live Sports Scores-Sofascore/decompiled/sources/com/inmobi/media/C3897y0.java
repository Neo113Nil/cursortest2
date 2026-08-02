package com.inmobi.media;

import com.inmobi.adquality.models.AdQualityResult;
import defpackage.a70;
import defpackage.hoi;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.y0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3897y0 extends hoi implements Function2 {
    public int a;
    public final /* synthetic */ AdQualityResult b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3897y0(AdQualityResult adQualityResult, rq3 rq3Var) {
        super(2, rq3Var);
        this.b = adQualityResult;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new C3897y0(this.b, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3897y0(this.b, (rq3) obj2).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.a;
        if (i == 0) {
            y6a.M(obj);
            I0 i0 = (I0) F0.a.getValue();
            String imageLocation = this.b.getImageLocation();
            this.a = 1;
            Object a = i0.a.a("ad_quality_db", "image_location=?", new String[]{imageLocation}, this);
            if (a != lu3Var) {
                a = Unit.a;
            }
            if (a == lu3Var) {
                return lu3Var;
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        return Unit.a;
    }
}
