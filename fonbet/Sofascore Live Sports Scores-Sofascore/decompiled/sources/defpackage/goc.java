package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class goc {
    public static final /* synthetic */ goc[] a = {new goc("CHAMPION", 0), new goc("FIGHTER", 1), new goc("DIVIDER", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    goc EF5;

    public static goc valueOf(String str) {
        return (goc) Enum.valueOf(goc.class, str);
    }

    public static goc[] values() {
        return (goc[]) a.clone();
    }
}
