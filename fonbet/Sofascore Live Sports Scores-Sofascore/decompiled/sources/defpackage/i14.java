package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class i14 {
    public static final f7a f;
    public static final /* synthetic */ i14[] g;
    public static final /* synthetic */ kp5 h;
    public final float a;
    public final float b;
    public final float c;
    public final String d;
    public final String e;

    static {
        i14[] i14VarArr = {new i14("GLANCE", 0, 245.0f, 245.0f, 50.0f, "G", "Glance"), new i14("LEG_GLANCE", 1, 295.0f, 200.0f, 45.0f, "LG", "Leg glance"), new i14("HOOK", 2, 340.0f, 170.0f, 30.0f, "H", "Hook"), new i14("PULL", 3, 10.0f, 130.0f, 40.0f, "P", "Pull"), new i14("ON_DRIVE", 4, 50.0f, 105.0f, 25.0f, "OD", "On drive"), new i14("STRAIGHT_DRIVE", 5, 75.0f, 75.0f, 30.0f, "SD", "Straight drive"), new i14("OFF_DRIVE", 6, 105.0f, 50.0f, 25.0f, "OfD", "Off drive"), new i14("COVER_DRIVE", 7, 130.0f, 10.0f, 40.0f, "CD", "Cover drive"), new i14("CUT_DRIVE", 8, 170.0f, 352.5f, 17.5f, "CtD", "Cut drive"), new i14("SQUARE_CUT", 9, 187.5f, 335.0f, 17.5f, "SqC", "Square cut"), new i14("LATE_CUT", 10, 205.0f, 295.0f, 40.0f, "LC", "Late cut")};
        g = i14VarArr;
        h = new kp5(i14VarArr);
        f = new f7a(20);
    }

    public i14(String str, int i, float f2, float f3, float f4, String str2, String str3) {
        this.a = f2;
        this.b = f3;
        this.c = f4;
        this.d = str2;
        this.e = str3;
    }

    public static i14 valueOf(String str) {
        return (i14) Enum.valueOf(i14.class, str);
    }

    public static i14[] values() {
        return (i14[]) g.clone();
    }
}
