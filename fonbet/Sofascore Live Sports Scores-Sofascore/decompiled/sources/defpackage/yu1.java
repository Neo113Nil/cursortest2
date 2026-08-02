package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class yu1 {
    public static final /* synthetic */ yu1[] a = {new yu1("BET_BOOST_EVENT_CLICK", 0), new yu1("DROPPING_ODDS_EVENT_CLICK", 1), new yu1("TRENDING_ODDS_EVENT_CLICK", 2), new yu1("STREAKS_TEAM_CLICK", 3), new yu1("H2H_EVENT_CLICK", 4), new yu1("HIGH_VALUE_STREAKS_EVENT_CLICK", 5)};

    /* JADX INFO: Fake field, exist only in values array */
    yu1 EF5;

    public static yu1 valueOf(String str) {
        return (yu1) Enum.valueOf(yu1.class, str);
    }

    public static yu1[] values() {
        return (yu1[]) a.clone();
    }
}
