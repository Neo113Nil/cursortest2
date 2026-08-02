package com.sofascore.model;

import defpackage.ph0;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u001e\n\u0002\u0010 \n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00050$¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0017\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00050$¢\u0006\b\n\u0000\u001a\u0004\b(\u0010&¨\u0006)"}, d2 = {"Lcom/sofascore/model/Sports;", "", "<init>", "()V", "FOOTBALL", "", "BASKETBALL", "TENNIS", "ICE_HOCKEY", "E_SPORTS", "RUGBY", "AMERICAN_FOOTBALL", "VOLLEYBALL", "BASEBALL", "HANDBALL", "MOTORSPORT", "DARTS", "SNOOKER", "WATERPOLO", "FUTSAL", "AUSSIE_RULES", "CRICKET", "BADMINTON", "BANDY", "FLOORBALL", "CYCLING", "TABLE_TENNIS", "BEACH_VOLLEY", "MMA", "MINI_FOOTBALL", "FORMULA_1", "NASCAR", "INDYCAR", "RALLY", "TRENDING", "entries", "", "getEntries", "()Ljava/util/List;", "trendingGridSupported", "getTrendingGridSupported", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Sports {

    @NotNull
    public static final String AMERICAN_FOOTBALL = "american-football";

    @NotNull
    public static final String AUSSIE_RULES = "aussie-rules";

    @NotNull
    public static final String BADMINTON = "badminton";

    @NotNull
    public static final String BANDY = "bandy";

    @NotNull
    public static final String BASEBALL = "baseball";

    @NotNull
    public static final String BASKETBALL = "basketball";

    @NotNull
    public static final String BEACH_VOLLEY = "beach-volley";

    @NotNull
    public static final String CRICKET = "cricket";

    @NotNull
    public static final String CYCLING = "cycling";

    @NotNull
    public static final String DARTS = "darts";

    @NotNull
    public static final String E_SPORTS = "esports";

    @NotNull
    public static final String FLOORBALL = "floorball";

    @NotNull
    public static final String FOOTBALL = "football";

    @NotNull
    public static final String FORMULA_1 = "Formula 1";

    @NotNull
    public static final String FUTSAL = "futsal";

    @NotNull
    public static final String HANDBALL = "handball";

    @NotNull
    public static final String ICE_HOCKEY = "ice-hockey";

    @NotNull
    public static final String INDYCAR = "Indycar";

    @NotNull
    public static final Sports INSTANCE = new Sports();

    @NotNull
    public static final String MINI_FOOTBALL = "minifootball";

    @NotNull
    public static final String MMA = "mma";

    @NotNull
    public static final String MOTORSPORT = "motorsport";

    @NotNull
    public static final String NASCAR = "Nascar";

    @NotNull
    public static final String RALLY = "Rally";

    @NotNull
    public static final String RUGBY = "rugby";

    @NotNull
    public static final String SNOOKER = "snooker";

    @NotNull
    public static final String TABLE_TENNIS = "table-tennis";

    @NotNull
    public static final String TENNIS = "tennis";

    @NotNull
    public static final String TRENDING = "trending";

    @NotNull
    public static final String VOLLEYBALL = "volleyball";

    @NotNull
    public static final String WATERPOLO = "waterpolo";

    @NotNull
    private static final List<String> entries;

    @NotNull
    private static final List<String> trendingGridSupported;

    static {
        List<String> j = b.j(FOOTBALL, TENNIS, BASKETBALL, ICE_HOCKEY, VOLLEYBALL, HANDBALL, E_SPORTS, MMA, BASEBALL, CRICKET, MOTORSPORT, AMERICAN_FOOTBALL, RUGBY, BADMINTON, SNOOKER, DARTS, FUTSAL, MINI_FOOTBALL, TABLE_TENNIS, BEACH_VOLLEY, WATERPOLO, CYCLING, AUSSIE_RULES, FLOORBALL, BANDY);
        entries = j;
        trendingGridSupported = CollectionsKt.t0(j, ph0.a0(new String[]{CRICKET, CYCLING, MOTORSPORT}));
    }

    private Sports() {
    }

    @NotNull
    public final List<String> getEntries() {
        return entries;
    }

    @NotNull
    public final List<String> getTrendingGridSupported() {
        return trendingGridSupported;
    }
}
