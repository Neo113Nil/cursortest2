package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import android.app.Activity;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.s0;
import defpackage.dt8;
import defpackage.of3;
import defpackage.xtc;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class v implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ dt8 d;
    public final /* synthetic */ Object e;

    public /* synthetic */ v(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.r rVar, Function0 function0, Function0 function02, xtc xtcVar, int i) {
        this.a = 2;
        this.c = rVar;
        this.d = function0;
        this.e = function02;
        this.b = xtcVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        Object obj4 = this.e;
        dt8 dt8Var = this.d;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                x.a((xtc) obj3, (String) obj5, (Function0) dt8Var, (s0) obj4, (of3) obj, 385);
                break;
            case 1:
                ((Integer) obj2).getClass();
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.x.i((Activity) obj3, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.m) obj5, (Function2) dt8Var, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.t) obj4, (of3) obj, 1);
                break;
            default:
                ((Integer) obj2).getClass();
                com.facebook.appevents.j.m((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.r) obj5, (Function0) dt8Var, (Function0) obj4, (xtc) obj3, (of3) obj, 1);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ v(Object obj, Object obj2, dt8 dt8Var, Object obj3, int i, int i2) {
        this.a = i2;
        this.b = obj;
        this.c = obj2;
        this.d = dt8Var;
        this.e = obj3;
    }
}
