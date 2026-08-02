package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class t32 {
    public final i1d a = new i1d(new u32[16], 0);

    /* JADX WARN: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0060 -> B:10:0x0063). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(oqf oqfVar, sq3 sq3Var) {
        s32 s32Var;
        int i;
        int i2;
        oqf oqfVar2;
        int i3;
        Object[] objArr;
        if (sq3Var instanceof s32) {
            s32Var = (s32) sq3Var;
            int i4 = s32Var.x;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                s32Var.x = i4 - Integer.MIN_VALUE;
                Object obj = s32Var.v;
                lu3 lu3Var = lu3.a;
                i = s32Var.x;
                if (i != 0) {
                    y6a.M(obj);
                    i1d i1dVar = this.a;
                    Object[] objArr2 = i1dVar.a;
                    i2 = i1dVar.c;
                    oqfVar2 = oqfVar;
                    i3 = 0;
                    objArr = objArr2;
                    if (i3 < i2) {
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = s32Var.u;
                    i3 = s32Var.t;
                    objArr = s32Var.s;
                    oqf oqfVar3 = s32Var.r;
                    y6a.M(obj);
                    oqfVar2 = oqfVar3;
                    i3++;
                    if (i3 < i2) {
                        u32 u32Var = (u32) objArr[i3];
                        yj1 yj1Var = new yj1(oqfVar2, 16);
                        s32Var.r = oqfVar2;
                        s32Var.s = objArr;
                        s32Var.t = i3;
                        s32Var.u = i2;
                        s32Var.x = 1;
                        if (zm2.l(u32Var, yj1Var, s32Var) == lu3Var) {
                            return lu3Var;
                        }
                        i3++;
                        if (i3 < i2) {
                            return Unit.a;
                        }
                    }
                }
            }
        }
        s32Var = new s32(this, sq3Var);
        Object obj2 = s32Var.v;
        lu3 lu3Var2 = lu3.a;
        i = s32Var.x;
        if (i != 0) {
        }
    }
}
