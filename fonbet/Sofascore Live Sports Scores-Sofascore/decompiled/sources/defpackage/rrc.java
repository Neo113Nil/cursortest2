package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class rrc {
    public static final rrc a;
    public static final rrc b;
    public static final /* synthetic */ rrc[] c;

    static {
        rrc rrcVar = new rrc("PERCENTAGE", 0);
        a = rrcVar;
        rrc rrcVar2 = new rrc("FRACTIONAL", 1);
        b = rrcVar2;
        c = new rrc[]{rrcVar, rrcVar2};
    }

    public static rrc valueOf(String str) {
        return (rrc) Enum.valueOf(rrc.class, str);
    }

    public static rrc[] values() {
        return (rrc[]) c.clone();
    }
}
