package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class tu {
    public static final /* synthetic */ tu[] a = {new tu("BUBBLE", 0), new tu("BUBBLE_OTHER", 1), new tu("BUTTON", 2), new tu("TEAM_OF_THE_ROUND", 3)};

    /* JADX INFO: Fake field, exist only in values array */
    tu EF5;

    public static tu valueOf(String str) {
        return (tu) Enum.valueOf(tu.class, str);
    }

    public static tu[] values() {
        return (tu[]) a.clone();
    }
}
