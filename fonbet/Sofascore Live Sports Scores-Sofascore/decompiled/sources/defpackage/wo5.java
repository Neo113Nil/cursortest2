package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class wo5 extends xka implements Function1 {
    public final /* synthetic */ int i;
    public final /* synthetic */ yo5 j;
    public final /* synthetic */ long k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wo5(yo5 yo5Var, long j, int i) {
        super(1);
        this.i = i;
        this.j = yo5Var;
        this.k = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Function1 function1;
        Function1 function12;
        int ordinal;
        int i = this.i;
        long j = 0;
        long j2 = this.k;
        yo5 yo5Var = this.j;
        switch (i) {
            case 0:
                int ordinal2 = ((po5) obj).ordinal();
                if (ordinal2 == 0) {
                    in2 in2Var = yo5Var.t.a.c;
                    if (in2Var != null && (function1 = in2Var.b) != null) {
                        j2 = ((c7a) function1.invoke(new c7a(j2))).a;
                    }
                } else if (ordinal2 != 1) {
                    if (ordinal2 != 2) {
                        zzl.b();
                        return null;
                    }
                    in2 in2Var2 = yo5Var.u.a.c;
                    if (in2Var2 != null && (function12 = in2Var2.b) != null) {
                        j2 = ((c7a) function12.invoke(new c7a(j2))).a;
                    }
                }
                return new c7a(j2);
            case 1:
                po5 po5Var = (po5) obj;
                if (yo5Var.y != null && yo5Var.m1() != null && !Intrinsics.c(yo5Var.y, yo5Var.m1()) && (ordinal = po5Var.ordinal()) != 0 && ordinal != 1) {
                    if (ordinal != 2) {
                        zzl.b();
                        return null;
                    }
                    in2 in2Var3 = yo5Var.u.a.c;
                    if (in2Var3 != null) {
                        Function1 function13 = in2Var3.b;
                        long j3 = this.k;
                        long j4 = ((c7a) function13.invoke(new c7a(j3))).a;
                        io m1 = yo5Var.m1();
                        m1.getClass();
                        ema emaVar = ema.a;
                        long a = m1.a(j3, j4, emaVar);
                        io ioVar = yo5Var.y;
                        ioVar.getClass();
                        j = r6a.c(a, ioVar.a(j3, j4, emaVar));
                    }
                }
                return new r6a(j);
            default:
                po5 po5Var2 = (po5) obj;
                alh alhVar = yo5Var.t.a.b;
                long j5 = alhVar != null ? ((r6a) alhVar.a.invoke(new c7a(j2))).a : 0L;
                alh alhVar2 = yo5Var.u.a.b;
                long j6 = alhVar2 != null ? ((r6a) alhVar2.a.invoke(new c7a(j2))).a : 0L;
                int ordinal3 = po5Var2.ordinal();
                if (ordinal3 == 0) {
                    j = j5;
                } else if (ordinal3 != 1) {
                    if (ordinal3 != 2) {
                        zzl.b();
                        return null;
                    }
                    j = j6;
                }
                return new r6a(j);
        }
    }
}
