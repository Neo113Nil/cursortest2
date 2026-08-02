package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import com.moloco.sdk.internal.ortb.model.h0;
import defpackage.ct8;
import defpackage.of3;
import defpackage.r70;
import defpackage.utc;
import defpackage.yqo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class h implements ct8 {
    public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ u d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Function0 h;
    public final /* synthetic */ long i;
    public final /* synthetic */ long j;
    public final /* synthetic */ long k;
    public final /* synthetic */ h0 l;
    public final /* synthetic */ Function0 m;

    public h(com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c cVar, Function1 function1, boolean z, u uVar, boolean z2, int i, int i2, Function0 function0, long j, long j2, long j3, h0 h0Var, Function0 function02) {
        this.a = cVar;
        this.b = function1;
        this.c = z;
        this.d = uVar;
        this.e = z2;
        this.f = i;
        this.g = i2;
        this.h = function0;
        this.i = j;
        this.j = j2;
        this.k = j3;
        this.l = h0Var;
        this.m = function02;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        of3 of3Var = (of3) obj2;
        ((Number) obj3).intValue();
        ((r70) obj).getClass();
        com.facebook.appevents.n.j(utc.a, this.a, this.b, yqo.y(936111551, of3Var, new g(this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m)), of3Var, 3078, 0);
        return Unit.a;
    }
}
