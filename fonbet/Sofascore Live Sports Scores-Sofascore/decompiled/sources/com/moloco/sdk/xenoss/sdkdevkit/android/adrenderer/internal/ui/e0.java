package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import defpackage.av8;
import defpackage.bkh;
import defpackage.d7e;
import defpackage.g28;
import defpackage.lq9;
import defpackage.of3;
import defpackage.s75;
import defpackage.utc;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class e0 implements Function2 {
    public final /* synthetic */ long a;
    public final /* synthetic */ d7e b;
    public final /* synthetic */ String c;
    public final /* synthetic */ long d;

    public e0(long j, d7e d7eVar, String str, long j2) {
        this.a = j;
        this.b = d7eVar;
        this.c = str;
        this.d = j2;
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
        g28 g28Var = bkh.a;
        long j = this.a;
        lq9.a(0, this.d, of3Var, bkh.m(utc.a, s75.b(j), s75.a(j)), this.b, this.c);
        return Unit.a;
    }
}
