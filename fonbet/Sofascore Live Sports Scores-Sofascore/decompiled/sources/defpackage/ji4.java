package defpackage;

import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class ji4 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ Serializable c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ ji4(asf asfVar, long j, esf esfVar, lof lofVar, esf esfVar2, esf esfVar3, fsf fsfVar, fsf fsfVar2, fsf fsfVar3) {
        this.c = asfVar;
        this.b = j;
        this.d = esfVar;
        this.e = lofVar;
        this.f = esfVar2;
        this.g = esfVar3;
        this.h = fsfVar;
        this.i = fsfVar2;
        this.j = fsfVar3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.j;
        Object obj4 = this.i;
        Object obj5 = this.h;
        Object obj6 = this.g;
        Object obj7 = this.f;
        Object obj8 = this.e;
        Object obj9 = this.d;
        Serializable serializable = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                oj4.c((Long) serializable, this.b, (Function1) obj9, (Function1) obj8, (kg2) obj7, (IntRange) obj6, (gi4) obj5, (di4) obj4, (ci4) obj3, (of3) obj, aba.K(1));
                return Unit.a;
            default:
                asf asfVar = (asf) serializable;
                esf esfVar = (esf) obj9;
                lof lofVar = (lof) obj8;
                esf esfVar2 = (esf) obj7;
                esf esfVar3 = (esf) obj6;
                fsf fsfVar = (fsf) obj5;
                fsf fsfVar2 = (fsf) obj4;
                fsf fsfVar3 = (fsf) obj3;
                int intValue = ((Integer) obj).intValue();
                long longValue = ((Long) obj2).longValue();
                if (intValue != 1) {
                    if (intValue == 10) {
                        if (longValue < 4) {
                            is8.e("bad zip: NTFS extra too short");
                            return null;
                        }
                        lofVar.skip(4L);
                        qha.K(lofVar, (int) (longValue - 4), new rol(fsfVar, lofVar, fsfVar2, fsfVar3));
                    }
                } else {
                    if (asfVar.a) {
                        is8.e("bad zip: zip64 extra repeated");
                        return null;
                    }
                    asfVar.a = true;
                    if (longValue < this.b) {
                        is8.e("bad zip: zip64 extra too short");
                        return null;
                    }
                    long j = esfVar.a;
                    if (j == 4294967295L) {
                        j = lofVar.b0();
                    }
                    esfVar.a = j;
                    esfVar2.a = esfVar2.a == 4294967295L ? lofVar.b0() : 0L;
                    esfVar3.a = esfVar3.a == 4294967295L ? lofVar.b0() : 0L;
                }
                return Unit.a;
        }
    }

    public /* synthetic */ ji4(Long l, long j, Function1 function1, Function1 function12, kg2 kg2Var, IntRange intRange, gi4 gi4Var, di4 di4Var, ci4 ci4Var, int i) {
        this.c = l;
        this.b = j;
        this.d = function1;
        this.e = function12;
        this.f = kg2Var;
        this.g = intRange;
        this.h = gi4Var;
        this.i = di4Var;
        this.j = ci4Var;
    }
}
