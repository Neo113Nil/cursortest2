package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class vye {
    public static final /* synthetic */ vye[] a;
    public static final /* synthetic */ kp5 b;

    static {
        vye[] vyeVarArr = {new vye("ExpandableSet", 0), new vye("Game", 1), new vye("SetPoints", 2)};
        a = vyeVarArr;
        b = new kp5(vyeVarArr);
    }

    public static vye valueOf(String str) {
        return (vye) Enum.valueOf(vye.class, str);
    }

    public static vye[] values() {
        return (vye[]) a.clone();
    }
}
