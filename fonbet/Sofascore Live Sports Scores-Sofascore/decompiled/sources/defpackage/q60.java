package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class q60 extends xka implements Function1 {
    public final /* synthetic */ int i;
    public final /* synthetic */ r60 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q60(r60 r60Var, int i) {
        super(1);
        this.i = i;
        this.j = r60Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long j;
        int i = this.i;
        r60 r60Var = this.j;
        switch (i) {
            case 0:
                long intValue = ((Number) obj).intValue();
                return Integer.valueOf(((int) (r60Var.e() >> 32)) - ((int) (r60Var.d((intValue & 4294967295L) | (intValue << 32), r60Var.e()) >> 32)));
            case 1:
                int intValue2 = ((Number) obj).intValue();
                long j2 = intValue2;
                return Integer.valueOf((-((int) (r60Var.d((j2 & 4294967295L) | (j2 << 32), r60Var.e()) >> 32))) - intValue2);
            case 2:
                long intValue3 = ((Number) obj).intValue();
                return Integer.valueOf(((int) (r60Var.e() & 4294967295L)) - ((int) (r60Var.d((intValue3 & 4294967295L) | (intValue3 << 32), r60Var.e()) & 4294967295L)));
            case 3:
                int intValue4 = ((Number) obj).intValue();
                long j3 = intValue4;
                return Integer.valueOf((-((int) (r60Var.d((j3 & 4294967295L) | (j3 << 32), r60Var.e()) & 4294967295L))) - intValue4);
            case 4:
                int intValue5 = ((Number) obj).intValue();
                cdi cdiVar = (cdi) r60Var.e.g(((eoh) r60Var.a.d).getValue());
                long j4 = intValue5;
                return Integer.valueOf((-((int) (r60Var.d((4294967295L & j4) | (j4 << 32), cdiVar != null ? ((c7a) cdiVar.getValue()).a : 0L) >> 32))) - intValue5);
            case 5:
                int intValue6 = ((Number) obj).intValue();
                cdi cdiVar2 = (cdi) r60Var.e.g(((eoh) r60Var.a.d).getValue());
                j = cdiVar2 != null ? ((c7a) cdiVar2.getValue()).a : 0L;
                long j5 = intValue6;
                return Integer.valueOf((-((int) (r60Var.d((4294967295L & j5) | (j5 << 32), j) >> 32))) + ((int) (j >> 32)));
            case 6:
                int intValue7 = ((Number) obj).intValue();
                cdi cdiVar3 = (cdi) r60Var.e.g(((eoh) r60Var.a.d).getValue());
                long j6 = intValue7;
                return Integer.valueOf((-((int) (r60Var.d((j6 & 4294967295L) | (j6 << 32), cdiVar3 != null ? ((c7a) cdiVar3.getValue()).a : 0L) & 4294967295L))) - intValue7);
            default:
                int intValue8 = ((Number) obj).intValue();
                cdi cdiVar4 = (cdi) r60Var.e.g(((eoh) r60Var.a.d).getValue());
                j = cdiVar4 != null ? ((c7a) cdiVar4.getValue()).a : 0L;
                long j7 = intValue8;
                return Integer.valueOf((-((int) (r60Var.d((j7 & 4294967295L) | (j7 << 32), j) & 4294967295L))) + ((int) (j & 4294967295L)));
        }
    }
}
