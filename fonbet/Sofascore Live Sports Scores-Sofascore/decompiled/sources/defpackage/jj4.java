package defpackage;

import java.util.Collection;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.IntRange;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class jj4 implements Function1 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ jj4(u6b u6bVar, int i, Function0 function0, boh bohVar, e1d e1dVar, int i2, e1d e1dVar2) {
        this.d = u6bVar;
        this.b = i;
        this.e = function0;
        this.f = bohVar;
        this.g = e1dVar;
        this.c = i2;
        this.h = e1dVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i;
        int i2 = this.a;
        Object obj2 = this.h;
        Object obj3 = this.g;
        Object obj4 = this.f;
        Object obj5 = this.e;
        Object obj6 = this.d;
        switch (i2) {
            case 0:
                IntRange intRange = (IntRange) obj6;
                kg2 kg2Var = (kg2) obj5;
                Function1 function1 = (Function1) obj4;
                di4 di4Var = (di4) obj3;
                ci4 ci4Var = (ci4) obj2;
                yoa yoaVar = (yoa) obj;
                intRange.getClass();
                if (intRange instanceof Collection) {
                    i = ((Collection) intRange).size();
                } else {
                    v6a it = intRange.iterator();
                    int i3 = 0;
                    while (it.c) {
                        it.next();
                        i3++;
                        if (i3 < 0) {
                            b.p();
                            throw null;
                        }
                    }
                    i = i3;
                }
                yoa.m(yoaVar, i, null, null, new tc3(674613074, new lj4(intRange, kg2Var, this.b, this.c, function1, di4Var, ci4Var), true), 14);
                return Unit.a;
            default:
                u6b u6bVar = (u6b) obj6;
                ((o55) obj).getClass();
                return new le(xw3.L(hda.E(u6bVar), null, null, new zxa(u6bVar, this.b, (Function0) obj5, (boh) obj4, (e1d) obj3, this.c, (e1d) obj2, null), 3), 19);
        }
    }

    public /* synthetic */ jj4(IntRange intRange, kg2 kg2Var, int i, int i2, Function1 function1, di4 di4Var, ci4 ci4Var) {
        this.d = intRange;
        this.e = kg2Var;
        this.b = i;
        this.c = i2;
        this.f = function1;
        this.g = di4Var;
        this.h = ci4Var;
    }
}
