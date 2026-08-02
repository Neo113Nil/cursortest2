package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class azg {
    public static final azg a;
    public static final azg b;
    public static final /* synthetic */ azg[] c;
    public static final /* synthetic */ kp5 d;

    static {
        azg azgVar = new azg("RATINGS", 0);
        a = azgVar;
        azg azgVar2 = new azg("EVENTS", 1);
        b = azgVar2;
        azg[] azgVarArr = {azgVar, azgVar2};
        c = azgVarArr;
        d = new kp5(azgVarArr);
    }

    public static azg valueOf(String str) {
        return (azg) Enum.valueOf(azg.class, str);
    }

    public static azg[] values() {
        return (azg[]) c.clone();
    }
}
