package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class sb {
    public static final sb a;
    public static final sb b;
    public static final /* synthetic */ sb[] c;

    static {
        sb sbVar = new sb("Full", 0);
        a = sbVar;
        sb sbVar2 = new sb("Dashed", 1);
        b = sbVar2;
        c = new sb[]{sbVar, sbVar2};
    }

    public static sb valueOf(String str) {
        return (sb) Enum.valueOf(sb.class, str);
    }

    public static sb[] values() {
        return (sb[]) c.clone();
    }
}
