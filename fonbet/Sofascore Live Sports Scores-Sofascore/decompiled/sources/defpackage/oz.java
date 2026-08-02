package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class oz {
    public static final oz a;
    public static final oz b;
    public static final /* synthetic */ oz[] c;

    static {
        oz ozVar = new oz("SHOW_ORIGINAL", 0);
        a = ozVar;
        oz ozVar2 = new oz("SHOW_TRANSLATED", 1);
        b = ozVar2;
        c = new oz[]{ozVar, ozVar2};
    }

    public static oz valueOf(String str) {
        return (oz) Enum.valueOf(oz.class, str);
    }

    public static oz[] values() {
        return (oz[]) c.clone();
    }
}
