package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class o91 {
    public static final /* synthetic */ o91[] b;
    public static final /* synthetic */ kp5 c;
    public final int a;

    static {
        o91[] o91VarArr = {new o91("TopLeft", 0, 11), new o91("TopRight", 1, 12), new o91("BottomLeft", 2, 13), new o91("BottomRight", 3, 14)};
        b = o91VarArr;
        c = new kp5(o91VarArr);
    }

    public o91(String str, int i, int i2) {
        this.a = i2;
    }

    public static o91 valueOf(String str) {
        return (o91) Enum.valueOf(o91.class, str);
    }

    public static o91[] values() {
        return (o91[]) b.clone();
    }
}
