package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class n91 {
    public static final /* synthetic */ n91[] b;
    public static final /* synthetic */ kp5 c;
    public final int a;

    static {
        n91[] n91VarArr = {new n91("First", 0, 1), new n91("Second", 1, 2), new n91("Third", 2, 3), new n91("Fourth", 3, 4), new n91("Fifth", 4, 5), new n91("Sixth", 5, 6), new n91("Seventh", 6, 7), new n91("Eighth", 7, 8), new n91("Ninth", 8, 9)};
        b = n91VarArr;
        c = new kp5(n91VarArr);
    }

    public n91(String str, int i, int i2) {
        this.a = i2;
    }

    public static n91 valueOf(String str) {
        return (n91) Enum.valueOf(n91.class, str);
    }

    public static n91[] values() {
        return (n91[]) b.clone();
    }
}
