package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class cmc {
    public static final /* synthetic */ cmc[] a = {new cmc("EVENT_CARD", 0), new cmc("ORGANISATION", 1), new cmc("SECTION_HEADER", 2), new cmc("EMPTY_STATE", 3)};

    /* JADX INFO: Fake field, exist only in values array */
    cmc EF5;

    public static cmc valueOf(String str) {
        return (cmc) Enum.valueOf(cmc.class, str);
    }

    public static cmc[] values() {
        return (cmc[]) a.clone();
    }
}
