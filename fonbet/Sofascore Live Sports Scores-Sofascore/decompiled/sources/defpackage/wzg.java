package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class wzg {
    public static final wzg a;
    public static final wzg b;
    public static final /* synthetic */ wzg[] c;

    static {
        wzg wzgVar = new wzg("NONE", 0);
        a = wzgVar;
        wzg wzgVar2 = new wzg("INTEGRITY", 1);
        wzg wzgVar3 = new wzg("PRIVACY_AND_INTEGRITY", 2);
        b = wzgVar3;
        c = new wzg[]{wzgVar, wzgVar2, wzgVar3};
    }

    public static wzg valueOf(String str) {
        return (wzg) Enum.valueOf(wzg.class, str);
    }

    public static wzg[] values() {
        return (wzg[]) c.clone();
    }
}
