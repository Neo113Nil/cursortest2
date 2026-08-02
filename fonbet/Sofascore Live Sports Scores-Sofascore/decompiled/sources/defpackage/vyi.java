package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class vyi {
    public static final vyi a;
    public static final vyi b;
    public static final vyi c;
    public static final /* synthetic */ vyi[] d;

    static {
        vyi vyiVar = new vyi("WIN", 0);
        a = vyiVar;
        vyi vyiVar2 = new vyi("DRAW", 1);
        b = vyiVar2;
        vyi vyiVar3 = new vyi("LOSS", 2);
        c = vyiVar3;
        d = new vyi[]{vyiVar, vyiVar2, vyiVar3};
    }

    public static vyi valueOf(String str) {
        return (vyi) Enum.valueOf(vyi.class, str);
    }

    public static vyi[] values() {
        return (vyi[]) d.clone();
    }
}
