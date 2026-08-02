package com.vungle.ads.internal.presenter;

import com.vungle.ads.MraidTemplateError;
import defpackage.xka;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class k extends xka implements Function0 {
    public final /* synthetic */ r a;
    public final /* synthetic */ MraidTemplateError b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(r rVar, MraidTemplateError mraidTemplateError, boolean z, String str) {
        super(0);
        this.a = rVar;
        this.b = mraidTemplateError;
        this.c = z;
        this.d = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.a.a(this.b, this.c, this.d);
        return Unit.a;
    }
}
