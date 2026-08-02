package com.vungle.ads.internal;

import defpackage.xka;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class n1 extends xka implements Function2 {
    public final /* synthetic */ r1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(r1 r1Var) {
        super(2);
        this.a = r1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        if (intValue > 0 && intValue2 > 0) {
            this.a.x = intValue / intValue2;
        }
        return Unit.a;
    }
}
