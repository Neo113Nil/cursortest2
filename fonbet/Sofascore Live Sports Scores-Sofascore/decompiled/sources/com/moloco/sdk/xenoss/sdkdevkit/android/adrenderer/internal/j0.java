package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import defpackage.b98;
import defpackage.dsf;
import defpackage.fsf;
import defpackage.k8f;
import defpackage.kuj;
import defpackage.rq3;
import defpackage.xw3;
import defpackage.yda;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class j0 implements b98 {
    public final /* synthetic */ dsf a;
    public final /* synthetic */ fsf b;
    public final /* synthetic */ k8f c;
    public final /* synthetic */ dsf d;

    public j0(dsf dsfVar, fsf fsfVar, k8f k8fVar, dsf dsfVar2) {
        this.a = dsfVar;
        this.b = fsfVar;
        this.c = k8fVar;
        this.d = dsfVar2;
    }

    @Override // defpackage.b98
    public final Object emit(Object obj, rq3 rq3Var) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        fsf fsfVar = this.b;
        if (booleanValue) {
            dsf dsfVar = this.a;
            if (dsfVar.a != 0 && fsfVar.a == null) {
                dsf dsfVar2 = this.d;
                k8f k8fVar = this.c;
                fsfVar.a = xw3.L(k8fVar, null, null, new kuj(dsfVar, fsfVar, dsfVar2, k8fVar, (rq3) null, 23), 3);
            }
        } else {
            yda ydaVar = (yda) fsfVar.a;
            if (ydaVar != null) {
                ydaVar.e(null);
            }
            fsfVar.a = null;
        }
        return Unit.a;
    }
}
