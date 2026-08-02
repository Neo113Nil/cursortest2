package com.vungle.ads.internal.ui;

import defpackage.xka;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class q extends xka implements Function2 {
    public final /* synthetic */ z a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(z zVar) {
        super(2);
        this.a = zVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        String str = (String) obj2;
        str.getClass();
        this.a.a(str, intValue);
        return Unit.a;
    }
}
