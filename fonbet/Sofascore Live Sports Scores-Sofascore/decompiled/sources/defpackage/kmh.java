package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class kmh {
    public static final kmh a;
    public static final /* synthetic */ kmh[] b;

    static {
        kmh kmhVar = new kmh("Dismissed", 0);
        a = kmhVar;
        b = new kmh[]{kmhVar, new kmh("ActionPerformed", 1)};
    }

    public static kmh valueOf(String str) {
        return (kmh) Enum.valueOf(kmh.class, str);
    }

    public static kmh[] values() {
        return (kmh[]) b.clone();
    }
}
