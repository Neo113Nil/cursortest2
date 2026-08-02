package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import com.moloco.sdk.internal.ortb.model.h0;
import defpackage.av8;
import defpackage.ct8;
import defpackage.nf3;
import defpackage.of3;
import defpackage.xtc;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class g implements ct8 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ u b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ long g;
    public final /* synthetic */ long h;
    public final /* synthetic */ long i;
    public final /* synthetic */ h0 j;
    public final /* synthetic */ Function0 k;

    public g(boolean z, u uVar, boolean z2, int i, int i2, Function0 function0, long j, long j2, long j3, h0 h0Var, Function0 function02) {
        this.a = z;
        this.b = uVar;
        this.c = z2;
        this.d = i;
        this.e = i2;
        this.f = function0;
        this.g = j;
        this.h = j2;
        this.i = j3;
        this.j = h0Var;
        this.k = function02;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        xtc xtcVar = (xtc) obj;
        of3 of3Var = (of3) obj2;
        int intValue = ((Number) obj3).intValue();
        xtcVar.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((av8) of3Var).g(xtcVar) ? 4 : 2;
        }
        if ((intValue & 19) == 18) {
            av8 av8Var = (av8) of3Var;
            if (av8Var.D()) {
                av8Var.W();
                return Unit.a;
            }
        }
        u rVar = this.a ? this.b : new r(this.c, this.d, this.e);
        av8 av8Var2 = (av8) of3Var;
        av8Var2.e0(1166287030);
        Function0 function0 = this.f;
        boolean g = av8Var2.g(function0) | av8Var2.g(null);
        Object O = av8Var2.O();
        if (g || O == nf3.a) {
            O = new f(0, function0);
            av8Var2.n0(O);
        }
        av8Var2.s(false);
        com.facebook.appevents.g.g(rVar, xtcVar, (Function0) O, this.a, this.g, this.h, this.i, this.j, this.k, av8Var2, (intValue << 3) & 112);
        return Unit.a;
    }
}
