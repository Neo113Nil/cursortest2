package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class pz9 {
    public static final /* synthetic */ pz9[] a;
    public static final /* synthetic */ kp5 b;

    static {
        pz9[] pz9VarArr = {new pz9("SCORING", 0), new pz9("PENALTIES", 1)};
        a = pz9VarArr;
        b = new kp5(pz9VarArr);
    }

    public static pz9 valueOf(String str) {
        return (pz9) Enum.valueOf(pz9.class, str);
    }

    public static pz9[] values() {
        return (pz9[]) a.clone();
    }
}
