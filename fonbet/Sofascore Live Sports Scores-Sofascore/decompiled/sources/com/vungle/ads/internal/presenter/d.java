package com.vungle.ads.internal.presenter;

import android.content.Context;
import com.vungle.ads.internal.model.h0;
import com.vungle.ads.internal.p0;
import defpackage.xka;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class d extends xka implements Function0 {
    public final /* synthetic */ r a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(r rVar) {
        super(0);
        this.a = rVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        com.vungle.ads.internal.ui.view.k kVar;
        h0 h0Var;
        kVar = this.a.a;
        Context context = kVar.getContext();
        context.getClass();
        h0Var = this.a.b;
        return new p0(context, h0Var);
    }
}
