package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class emh {
    public static final emh a;
    public static final /* synthetic */ emh[] b;

    static {
        emh emhVar = new emh("Short", 0);
        a = emhVar;
        b = new emh[]{emhVar, new emh("Long", 1), new emh("Indefinite", 2)};
    }

    public static emh valueOf(String str) {
        return (emh) Enum.valueOf(emh.class, str);
    }

    public static emh[] values() {
        return (emh[]) b.clone();
    }
}
