package defpackage;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class f50 extends xka implements Function2 {
    public static final f50 A;
    public static final f50 B;
    public static final f50 C;
    public static final f50 D;
    public static final f50 E;
    public static final f50 F;
    public static final f50 G;
    public static final f50 H;
    public static final f50 I;
    public static final f50 J;
    public static final f50 K;
    public static final f50 L;
    public static final f50 M;
    public static final f50 j;
    public static final f50 k;
    public static final f50 l;
    public static final f50 m;
    public static final f50 n;
    public static final f50 o;
    public static final f50 p;
    public static final f50 q;
    public static final f50 r;
    public static final f50 s;
    public static final f50 t;
    public static final f50 u;
    public static final f50 v;
    public static final f50 w;
    public static final f50 x;
    public static final f50 y;
    public static final f50 z;
    public final /* synthetic */ int i;

    static {
        int i = 2;
        j = new f50(i, 0);
        k = new f50(i, 1);
        l = new f50(i, 2);
        m = new f50(i, 3);
        n = new f50(i, 4);
        o = new f50(i, 5);
        p = new f50(i, 6);
        q = new f50(i, 7);
        r = new f50(i, 8);
        s = new f50(i, 9);
        t = new f50(i, 10);
        u = new f50(i, 11);
        v = new f50(i, 12);
        w = new f50(i, 13);
        x = new f50(i, 14);
        y = new f50(i, 15);
        z = new f50(i, 16);
        A = new f50(i, 17);
        B = new f50(i, 18);
        C = new f50(i, 19);
        D = new f50(i, 20);
        E = new f50(i, 21);
        F = new f50(i, 22);
        G = new f50(i, 23);
        H = new f50(i, 24);
        I = new f50(i, 25);
        J = new f50(i, 26);
        K = new f50(i, 27);
        L = new f50(i, 28);
        M = new f50(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f50(int i, int i2) {
        super(i);
        this.i = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = 0;
        r2 = false;
        boolean z2 = false;
        switch (this.i) {
            case 0:
                td4.s0((wma) obj).setResetBlock((Function1) obj2);
                break;
            case 1:
                td4.s0((wma) obj).setUpdateBlock((Function1) obj2);
                break;
            case 2:
                td4.s0((wma) obj).setReleaseBlock((Function1) obj2);
                break;
            case 3:
                td4.s0((wma) obj).setUpdateBlock((Function1) obj2);
                break;
            case 4:
                td4.s0((wma) obj).setReleaseBlock((Function1) obj2);
                break;
            case 5:
                td4.s0((wma) obj).setModifier((xtc) obj2);
                break;
            case 6:
                td4.s0((wma) obj).setDensity((kx4) obj2);
                break;
            case 7:
                td4.s0((wma) obj).setLifecycleOwner((u6b) obj2);
                break;
            case 8:
                td4.s0((wma) obj).setSavedStateRegistryOwner((qqg) obj2);
                break;
            case 9:
                rsk s0 = td4.s0((wma) obj);
                int ordinal = ((ema) obj2).ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        zzl.b();
                        break;
                    } else {
                        i = 1;
                    }
                }
                s0.setLayoutDirection(i);
                break;
            case 10:
                long j2 = ((c7a) obj).a;
                long j3 = ((c7a) obj2).a;
                Map map = hwk.a;
                break;
            case 11:
                po5 po5Var = (po5) obj2;
                if (((po5) obj) == po5Var && po5Var == po5.c) {
                    z2 = true;
                }
                break;
            case 12:
                ((nk5) obj).d = (vy8) obj2;
                break;
            case 13:
                ((nk5) obj).e = (ho) obj2;
                break;
            case 14:
                ((ok5) obj).a = (vy8) obj2;
                break;
            case 15:
                ((ok5) obj).b = (e23) obj2;
                break;
            case 16:
                ((pk5) obj).d = (vy8) obj2;
                break;
            case 17:
                ((pk5) obj).f = ((eo) obj2).a;
                break;
            case 18:
                ((pk5) obj).e = ((go) obj2).a;
                break;
            case 19:
                String str = (String) obj;
                uy8 uy8Var = (uy8) obj2;
                if (str.length() == 0) {
                    break;
                } else {
                    break;
                }
            case 20:
                String str2 = (String) obj;
                vtc vtcVar = (vtc) obj2;
                if (str2.length() == 0) {
                    break;
                } else {
                    break;
                }
            case 21:
                of3 of3Var = (of3) obj;
                int intValue = ((Number) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (!av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    av8Var.W();
                }
                break;
            case 22:
                of3 of3Var2 = (of3) obj;
                int intValue2 = ((Number) obj2).intValue();
                av8 av8Var2 = (av8) of3Var2;
                if (!av8Var2.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                    av8Var2.W();
                }
                break;
            case 23:
                of3 of3Var3 = (of3) obj;
                int intValue3 = ((Number) obj2).intValue();
                av8 av8Var3 = (av8) of3Var3;
                if (!av8Var3.T(intValue3 & 1, (intValue3 & 3) != 2)) {
                    av8Var3.W();
                }
                break;
            case 24:
                of3 of3Var4 = (of3) obj;
                int intValue4 = ((Number) obj2).intValue();
                av8 av8Var4 = (av8) of3Var4;
                if (!av8Var4.T(intValue4 & 1, (intValue4 & 3) != 2)) {
                    av8Var4.W();
                }
                break;
            case 25:
                ((Number) obj2).intValue();
                ((wma) ((if3) obj)).getClass();
                break;
            case 26:
                ((wma) ((if3) obj)).a0((kx4) obj2);
                break;
            case 27:
                ema emaVar = (ema) obj2;
                wma wmaVar = (wma) ((if3) obj);
                if (wmaVar.z != emaVar) {
                    wmaVar.z = emaVar;
                    wmaVar.E();
                    wma v2 = wmaVar.v();
                    if (v2 != null) {
                        v2.C();
                    } else {
                        ryd rydVar = wmaVar.n;
                        if (rydVar != null) {
                            ((xy) rydVar).invalidate();
                        }
                    }
                    wmaVar.D();
                    for (wtc wtcVar = (wtc) wmaVar.F.g; wtcVar != null; wtcVar = wtcVar.f) {
                        wtcVar.S();
                    }
                }
                break;
            case 28:
                ((wma) ((if3) obj)).d0((k1c) obj2);
                break;
            default:
                ((wma) ((if3) obj)).e0((xtc) obj2);
                break;
        }
        return Unit.a;
    }
}
