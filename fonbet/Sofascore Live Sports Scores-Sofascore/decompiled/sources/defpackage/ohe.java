package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ohe {
    public static final ohe a;
    public static final ohe b;
    public static final /* synthetic */ ohe[] c;

    static {
        ohe oheVar = new ohe("UNCHANGED", 0);
        a = oheVar;
        ohe oheVar2 = new ohe("TRANSLUCENT", 1);
        ohe oheVar3 = new ohe("OPAQUE", 2);
        b = oheVar3;
        c = new ohe[]{oheVar, oheVar2, oheVar3};
    }

    public static ohe valueOf(String str) {
        return (ohe) Enum.valueOf(ohe.class, str);
    }

    public static ohe[] values() {
        return (ohe[]) c.clone();
    }
}
