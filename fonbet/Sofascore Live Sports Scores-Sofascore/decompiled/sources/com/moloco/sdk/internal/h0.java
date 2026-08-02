package com.moloco.sdk.internal;

import defpackage.ddi;
import defpackage.e1d;
import defpackage.fz8;
import defpackage.ht8;
import defpackage.io;
import defpackage.l98;
import defpackage.ml4;
import defpackage.n12;
import defpackage.of3;
import defpackage.sea;
import defpackage.t3e;
import defpackage.utc;
import defpackage.yqo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class h0 implements ht8 {
    public final /* synthetic */ io a;
    public final /* synthetic */ t3e b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ long e;
    public final /* synthetic */ long f;

    public h0(io ioVar, t3e t3eVar, String str, String str2, long j, long j2) {
        this.a = ioVar;
        this.b = t3eVar;
        this.c = str;
        this.d = str2;
        this.e = j;
        this.f = j2;
    }

    @Override // defpackage.ht8
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        ddi ddiVar = (ddi) obj3;
        Function1 function1 = (Function1) obj4;
        Function0 function0 = (Function0) obj5;
        of3 of3Var = (of3) obj6;
        int intValue = ((Number) obj7).intValue();
        ddiVar.getClass();
        function1.getClass();
        function0.getClass();
        e1d l = sea.l(ddiVar, of3Var, (intValue >> 6) & 14);
        fz8.e(booleanValue, l98.a0(ml4.R(n12.a.a(utc.a, this.a)), this.b), null, null, null, yqo.y(-657845797, of3Var, new g0(function1, l, this.c, this.d, this.e, this.f, function0)), of3Var, ((intValue >> 3) & 14) | 196608, 28);
        return Unit.a;
    }
}
