package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import android.content.Intent;
import android.webkit.WebView;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.f1;
import defpackage.a99;
import defpackage.av8;
import defpackage.nf3;
import defpackage.ns8;
import defpackage.of3;
import defpackage.os8;
import defpackage.tc3;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KFunction;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class c implements Function2 {
    public final /* synthetic */ MraidActivity a;
    public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.m b;
    public final /* synthetic */ o c;
    public final /* synthetic */ ns8 d;
    public final /* synthetic */ Function2 e;

    public c(MraidActivity mraidActivity, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.m mVar, o oVar, ns8 ns8Var, Function2 function2) {
        this.a = mraidActivity;
        this.b = mVar;
        this.c = oVar;
        this.d = ns8Var;
        this.e = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        of3 of3Var = (of3) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            av8 av8Var = (av8) of3Var;
            if (av8Var.D()) {
                av8Var.W();
                return Unit.a;
            }
        }
        o oVar = this.c;
        WebView webView = oVar.c;
        MraidActivity mraidActivity = this.a;
        Intent intent = mraidActivity.getIntent();
        intent.getClass();
        int intExtra = intent.getIntExtra("CLOSE_DELAY_SECONDS", 0);
        av8 av8Var2 = (av8) of3Var;
        av8Var2.e0(-674007660);
        Object O = av8Var2.O();
        a99 a99Var = nf3.a;
        if (O == a99Var) {
            O = new com.appsflyer.internal.a(13);
            av8Var2.n0(O);
        }
        Function1 function1 = (Function1) O;
        av8Var2.s(false);
        av8Var2.e0(-674005483);
        boolean g = av8Var2.g(oVar);
        Object O2 = av8Var2.O();
        if (g || O2 == a99Var) {
            com.moloco.sdk.internal.publisher.nativead.b bVar = new com.moloco.sdk.internal.publisher.nativead.b(0, oVar, o.class, "onSkipOrClose", "onSkipOrClose()V", 0, 6);
            av8Var2.n0(bVar);
            O2 = bVar;
        }
        av8Var2.s(false);
        Function0 function0 = (Function0) ((KFunction) O2);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.b bVar2 = f.g;
        os8 os8Var = (os8) this.e.invoke(av8Var2, 0);
        tc3 b = f1.b(null, null, 0L, 0L, 0L, null, null, av8Var2, 255);
        av8Var2.e0(-673994329);
        Object O3 = av8Var2.O();
        if (O3 == a99Var) {
            O3 = new com.moloco.sdk.service_locator.h(10);
            av8Var2.n0(O3);
        }
        av8Var2.s(false);
        com.facebook.appevents.j.h(mraidActivity, this.b, webView, intExtra, function1, function0, this.d, bVar2, os8Var, b, (Function0) O3, av8Var2, 24576);
        return Unit.a;
    }
}
