package com.sofascore.model.branding;

import com.ironsource.U3;
import defpackage.gz8;
import defpackage.jp5;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Lcom/sofascore/model/branding/BrandLocation;", "", U3.i.X, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "Header", "MainList", "EventScreen", "LeagueScreen", "TeamScreen", "EventStandings", "PlayerOfTheMatch", "TeamOfTheWeek", "LeagueStandings", "Feed", "Fantasy", "FeaturedTournament", "MatchOfTheWeek", "WhoWillWin", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BrandLocation {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ BrandLocation[] $VALUES;

    @NotNull
    private final String value;
    public static final BrandLocation Header = new BrandLocation("Header", 0, "header");
    public static final BrandLocation MainList = new BrandLocation("MainList", 1, "main_list");
    public static final BrandLocation EventScreen = new BrandLocation("EventScreen", 2, "event_screen");
    public static final BrandLocation LeagueScreen = new BrandLocation("LeagueScreen", 3, "league_screen");
    public static final BrandLocation TeamScreen = new BrandLocation("TeamScreen", 4, "team_screen");
    public static final BrandLocation EventStandings = new BrandLocation("EventStandings", 5, "event_standings");
    public static final BrandLocation PlayerOfTheMatch = new BrandLocation("PlayerOfTheMatch", 6, "event_potm");
    public static final BrandLocation TeamOfTheWeek = new BrandLocation("TeamOfTheWeek", 7, "league_totw");
    public static final BrandLocation LeagueStandings = new BrandLocation("LeagueStandings", 8, "league_standings");
    public static final BrandLocation Feed = new BrandLocation("Feed", 9, "feed");
    public static final BrandLocation Fantasy = new BrandLocation("Fantasy", 10, "fantasy");
    public static final BrandLocation FeaturedTournament = new BrandLocation("FeaturedTournament", 11, "featured_tournament");
    public static final BrandLocation MatchOfTheWeek = new BrandLocation("MatchOfTheWeek", 12, "match_of_the_week");
    public static final BrandLocation WhoWillWin = new BrandLocation("WhoWillWin", 13, "who_will_win");

    private static final /* synthetic */ BrandLocation[] $values() {
        return new BrandLocation[]{Header, MainList, EventScreen, LeagueScreen, TeamScreen, EventStandings, PlayerOfTheMatch, TeamOfTheWeek, LeagueStandings, Feed, Fantasy, FeaturedTournament, MatchOfTheWeek, WhoWillWin};
    }

    static {
        BrandLocation[] $values = $values();
        $VALUES = $values;
        $ENTRIES = gz8.G($values);
    }

    private BrandLocation(String str, int i, String str2) {
        this.value = str2;
    }

    @NotNull
    public static jp5 getEntries() {
        return $ENTRIES;
    }

    public static BrandLocation valueOf(String str) {
        return (BrandLocation) Enum.valueOf(BrandLocation.class, str);
    }

    public static BrandLocation[] values() {
        return (BrandLocation[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
