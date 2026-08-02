package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ksd {
    public static final ksd a;
    public static final ksd b;
    public static final /* synthetic */ ksd[] c;

    static {
        ksd ksdVar = new ksd("NoResultsEmptyState", 0);
        a = ksdVar;
        ksd ksdVar2 = new ksd("NoQueryEmptyState", 1);
        b = ksdVar2;
        c = new ksd[]{ksdVar, ksdVar2};
    }

    public static ksd valueOf(String str) {
        return (ksd) Enum.valueOf(ksd.class, str);
    }

    public static ksd[] values() {
        return (ksd[]) c.clone();
    }
}
