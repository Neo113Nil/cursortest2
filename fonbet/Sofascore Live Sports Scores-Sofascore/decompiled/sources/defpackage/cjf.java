package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class cjf {
    public static final cjf a;
    public static final cjf b;
    public static final /* synthetic */ cjf[] c;

    static {
        cjf cjfVar = new cjf("ALLOW_HIDE", 0);
        a = cjfVar;
        cjf cjfVar2 = new cjf("ALWAYS_SHOW", 1);
        b = cjfVar2;
        c = new cjf[]{cjfVar, cjfVar2, new cjf("HIDE_EDIT", 2)};
    }

    public static cjf valueOf(String str) {
        return (cjf) Enum.valueOf(cjf.class, str);
    }

    public static cjf[] values() {
        return (cjf[]) c.clone();
    }
}
