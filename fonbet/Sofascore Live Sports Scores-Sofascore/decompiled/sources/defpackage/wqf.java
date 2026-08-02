package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class wqf {
    public static final wqf a;
    public static final wqf b;
    public static final wqf c;
    public static final /* synthetic */ wqf[] d;

    static {
        wqf wqfVar = new wqf("ALLOW", 0);
        a = wqfVar;
        wqf wqfVar2 = new wqf("PREVENT_WHEN_EMPTY", 1);
        b = wqfVar2;
        wqf wqfVar3 = new wqf("PREVENT", 2);
        c = wqfVar3;
        d = new wqf[]{wqfVar, wqfVar2, wqfVar3};
    }

    public static wqf valueOf(String str) {
        return (wqf) Enum.valueOf(wqf.class, str);
    }

    public static wqf[] values() {
        return (wqf[]) d.clone();
    }
}
