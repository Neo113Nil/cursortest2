package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.IntRange;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ij4 implements et8 {
    public final /* synthetic */ Long a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ kg2 e;
    public final /* synthetic */ IntRange f;
    public final /* synthetic */ gi4 g;
    public final /* synthetic */ di4 h;
    public final /* synthetic */ ci4 i;
    public final /* synthetic */ ce8 j;

    public ij4(Long l, long j, Function1 function1, Function1 function12, kg2 kg2Var, IntRange intRange, gi4 gi4Var, di4 di4Var, ci4 ci4Var, ce8 ce8Var) {
        this.a = l;
        this.b = j;
        this.c = function1;
        this.d = function12;
        this.e = kg2Var;
        this.f = intRange;
        this.g = gi4Var;
        this.h = di4Var;
        this.i = ci4Var;
        this.j = ce8Var;
    }

    @Override // defpackage.et8
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = ((f55) obj2).a;
        of3 of3Var = (of3) obj3;
        ((Number) obj4).intValue();
        ci4 ci4Var = this.i;
        if (i == 0) {
            av8 av8Var = (av8) of3Var;
            av8Var.d0(1567031954);
            oj4.c(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, ci4Var, av8Var, 0);
            av8Var.s(false);
        } else if (i == 1) {
            av8 av8Var2 = (av8) of3Var;
            av8Var2.d0(1567050592);
            vg4.a(this.a, this.c, this.e, this.f, this.g, this.h, ci4Var, this.j, av8Var2, 0);
            av8Var2.s(false);
        } else {
            av8 av8Var3 = (av8) of3Var;
            av8Var3.d0(1334373351);
            av8Var3.s(false);
        }
        return Unit.a;
    }
}
