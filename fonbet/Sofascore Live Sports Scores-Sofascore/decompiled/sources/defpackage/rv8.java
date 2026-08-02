package defpackage;

import com.ironsource.U3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class rv8 implements tsi {
    public static final rv8 b;
    public static final rv8 c;
    public static final rv8 d;
    public static final /* synthetic */ rv8[] e;
    public static final /* synthetic */ kp5 f;
    public final String a;

    static {
        rv8 rv8Var = new rv8("TOTAL", 0, U3.i.l);
        b = rv8Var;
        rv8 rv8Var2 = new rv8("HOME", 1, "home");
        c = rv8Var2;
        rv8 rv8Var3 = new rv8("AWAY", 2, "away");
        d = rv8Var3;
        rv8[] rv8VarArr = {rv8Var, rv8Var2, rv8Var3};
        e = rv8VarArr;
        f = new kp5(rv8VarArr);
    }

    public rv8(String str, int i, String str2) {
        this.a = str2;
    }

    public static rv8 valueOf(String str) {
        return (rv8) Enum.valueOf(rv8.class, str);
    }

    public static rv8[] values() {
        return (rv8[]) e.clone();
    }

    @Override // defpackage.tsi
    public final String d() {
        return this.a;
    }
}
