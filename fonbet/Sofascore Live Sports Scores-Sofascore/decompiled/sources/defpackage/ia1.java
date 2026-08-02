package defpackage;

import java.util.List;
import kotlin.collections.b;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'd' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ia1 {
    public static final ia1 c;
    public static final ia1 d;
    public static final ia1 e;
    public static final /* synthetic */ ia1[] f;
    public final wj1 a;
    public final List b;

    static {
        ia1 ia1Var = new ia1("Batting", 0, wj1.b, b.j(uj1.o, uj1.w, uj1.A, uj1.I, uj1.D, uj1.E, uj1.T, uj1.J, uj1.K, uj1.l));
        c = ia1Var;
        wj1 wj1Var = wj1.c;
        uj1 uj1Var = uj1.y1;
        uj1 uj1Var2 = uj1.z1;
        uj1 uj1Var3 = uj1.v0;
        uj1 uj1Var4 = uj1.C0;
        uj1 uj1Var5 = uj1.G0;
        uj1 uj1Var6 = uj1.n0;
        uj1 uj1Var7 = uj1.D0;
        uj1 uj1Var8 = uj1.j0;
        uj1 uj1Var9 = uj1.L0;
        uj1 uj1Var10 = uj1.W0;
        ia1 ia1Var2 = new ia1("Pitching", 1, wj1Var, b.j(uj1Var, uj1Var2, uj1Var3, uj1Var4, uj1Var5, uj1Var6, uj1Var7, uj1Var8, uj1Var9, uj1Var10));
        d = ia1Var2;
        ia1 ia1Var3 = new ia1("PitchingCareer", 2, wj1Var, b.j(uj1Var, uj1.A1, uj1.q0, uj1Var3, uj1Var4, uj1Var5, uj1Var6, uj1Var7, uj1Var8, uj1Var9, uj1Var10));
        e = ia1Var3;
        f = new ia1[]{ia1Var, ia1Var2, ia1Var3};
    }

    public ia1(String str, int i, wj1 wj1Var, List list) {
        this.a = wj1Var;
        this.b = list;
    }

    public static ia1 valueOf(String str) {
        return (ia1) Enum.valueOf(ia1.class, str);
    }

    public static ia1[] values() {
        return (ia1[]) f.clone();
    }
}
