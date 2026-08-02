package com.sofascore.model.newNetwork;

import com.sofascore.model.mvvm.model.PlayerKt;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.mvvm.model.StatusKt;
import defpackage.gz8;
import defpackage.jp5;
import defpackage.q5h;
import defpackage.r5h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h(with = FilterValueSerializer.class)
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b%\b\u0087\u0081\u0002\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001'B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&¨\u0006("}, d2 = {"Lcom/sofascore/model/newNetwork/FilterValue;", "", "filterValueId", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getFilterValueId", "()Ljava/lang/String;", "ALL", "CLUB", "NATIONAL", "CSGO", "DOTA2", "LOL", "MEN", "WOMEN", "MIX", "TOP", "PRO", "RUGBY_UNION", "RUGBY_LEAGUE", "RUGBY_UNION_SEVENS", "BEACH_RUGBY", "CONTRIBUTOR", "YOUTH", "COLLEGE", "SINGLES", "DOUBLES", "GRAND_SLAM", "P1000", "P500", "P250", "LOWER", "MAJOR", "MINOR", "NORTH_AMERICA", "EUROPE", "UPCOMING", "FINISHED", "Companion", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FilterValue {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ FilterValue[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private final String filterValueId;

    @q5h(Season.YEAR_ALL_TIME)
    public static final FilterValue ALL = new FilterValue("ALL", 0, Season.YEAR_ALL_TIME);

    @q5h("club")
    public static final FilterValue CLUB = new FilterValue("CLUB", 1, "club");

    @q5h("national")
    public static final FilterValue NATIONAL = new FilterValue("NATIONAL", 2, "national");

    @q5h("csgo")
    public static final FilterValue CSGO = new FilterValue("CSGO", 3, "csgo");

    @q5h("dota2")
    public static final FilterValue DOTA2 = new FilterValue("DOTA2", 4, "dota2");

    @q5h("lol")
    public static final FilterValue LOL = new FilterValue("LOL", 5, "lol");

    @q5h(PlayerKt.FOOTBALL_MIDFIELDER)
    public static final FilterValue MEN = new FilterValue("MEN", 6, PlayerKt.FOOTBALL_MIDFIELDER);

    @q5h("F")
    public static final FilterValue WOMEN = new FilterValue("WOMEN", 7, "F");

    @q5h("X")
    public static final FilterValue MIX = new FilterValue("MIX", 8, "X");

    @q5h("top-competitions")
    public static final FilterValue TOP = new FilterValue("TOP", 9, "top-competitions");

    @q5h("pro")
    public static final FilterValue PRO = new FilterValue("PRO", 10, "pro");

    @q5h("rugby-union")
    public static final FilterValue RUGBY_UNION = new FilterValue("RUGBY_UNION", 11, "rugby-union");

    @q5h("rugby-league")
    public static final FilterValue RUGBY_LEAGUE = new FilterValue("RUGBY_LEAGUE", 12, "rugby-league");

    @q5h("rugby-union-sevens")
    public static final FilterValue RUGBY_UNION_SEVENS = new FilterValue("RUGBY_UNION_SEVENS", 13, "rugby-union-sevens");

    @q5h("beach-rugby")
    public static final FilterValue BEACH_RUGBY = new FilterValue("BEACH_RUGBY", 14, "beach-rugby");

    @q5h("contributor")
    public static final FilterValue CONTRIBUTOR = new FilterValue("CONTRIBUTOR", 15, "contributor");

    @q5h("youth")
    public static final FilterValue YOUTH = new FilterValue("YOUTH", 16, "youth");

    @q5h("college")
    public static final FilterValue COLLEGE = new FilterValue("COLLEGE", 17, "college");

    @q5h("singles")
    public static final FilterValue SINGLES = new FilterValue("SINGLES", 18, "singles");

    @q5h("doubles")
    public static final FilterValue DOUBLES = new FilterValue("DOUBLES", 19, "doubles");

    @q5h("grand-slam")
    public static final FilterValue GRAND_SLAM = new FilterValue("GRAND_SLAM", 20, "grand-slam");

    @q5h("p1000")
    public static final FilterValue P1000 = new FilterValue("P1000", 21, "p1000");

    @q5h("p500")
    public static final FilterValue P500 = new FilterValue("P500", 22, "p500");

    @q5h("p250")
    public static final FilterValue P250 = new FilterValue("P250", 23, "p250");

    @q5h("lower")
    public static final FilterValue LOWER = new FilterValue("LOWER", 24, "lower");

    @q5h("major")
    public static final FilterValue MAJOR = new FilterValue("MAJOR", 25, "major");

    @q5h("minor")
    public static final FilterValue MINOR = new FilterValue("MINOR", 26, "minor");

    @q5h("north-america")
    public static final FilterValue NORTH_AMERICA = new FilterValue("NORTH_AMERICA", 27, "north-america");

    @q5h("europe")
    public static final FilterValue EUROPE = new FilterValue("EUROPE", 28, "europe");

    @q5h("upcoming")
    public static final FilterValue UPCOMING = new FilterValue("UPCOMING", 29, "upcoming");

    @q5h(StatusKt.STATUS_FINISHED)
    public static final FilterValue FINISHED = new FilterValue("FINISHED", 30, StatusKt.STATUS_FINISHED);

    private static final /* synthetic */ FilterValue[] $values() {
        return new FilterValue[]{ALL, CLUB, NATIONAL, CSGO, DOTA2, LOL, MEN, WOMEN, MIX, TOP, PRO, RUGBY_UNION, RUGBY_LEAGUE, RUGBY_UNION_SEVENS, BEACH_RUGBY, CONTRIBUTOR, YOUTH, COLLEGE, SINGLES, DOUBLES, GRAND_SLAM, P1000, P500, P250, LOWER, MAJOR, MINOR, NORTH_AMERICA, EUROPE, UPCOMING, FINISHED};
    }

    static {
        FilterValue[] $values = $values();
        $VALUES = $values;
        $ENTRIES = gz8.G($values);
        INSTANCE = new Companion(null);
    }

    private FilterValue(String str, int i, String str2) {
        this.filterValueId = str2;
    }

    @NotNull
    public static jp5 getEntries() {
        return $ENTRIES;
    }

    public static FilterValue valueOf(String str) {
        return (FilterValue) Enum.valueOf(FilterValue.class, str);
    }

    public static FilterValue[] values() {
        return (FilterValue[]) $VALUES.clone();
    }

    @NotNull
    public final String getFilterValueId() {
        return this.filterValueId;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/FilterValue$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/FilterValue;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return FilterValueSerializer.INSTANCE;
        }

        private Companion() {
        }
    }
}
