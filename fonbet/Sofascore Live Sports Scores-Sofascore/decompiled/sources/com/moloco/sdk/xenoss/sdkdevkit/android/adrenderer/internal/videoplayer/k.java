package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer;

import defpackage.ct8;
import defpackage.hoi;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class k extends hoi implements ct8 {
    public /* synthetic */ boolean r;
    public /* synthetic */ boolean s;
    public final /* synthetic */ l t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, rq3 rq3Var) {
        super(3, rq3Var);
        this.t = lVar;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        k kVar = new k(this.t, (rq3) obj3);
        kVar.r = booleanValue;
        kVar.s = booleanValue2;
        return kVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        j jVar = this.t.a;
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        boolean z = this.r;
        boolean z2 = this.s;
        if (z && z2) {
            jVar.play();
        } else {
            jVar.pause();
        }
        return Unit.a;
    }
}
