package com.sofascore.model.newNetwork;

import defpackage.gz8;
import defpackage.hz8;
import defpackage.joa;
import defpackage.jp5;
import defpackage.q5h;
import defpackage.r5h;
import defpackage.uzj;
import defpackage.ypa;
import defpackage.ysa;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0087\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/sofascore/model/newNetwork/TrendingGridTileType;", "", "<init>", "(Ljava/lang/String;I)V", "PAID_AD", "EXTERNAL", "LEAGUE", "PLAYER_SEASON_STATS", "AI_INSIGHTS", "FANTASY", "UNKNOWN", "Companion", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TrendingGridTileType {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ TrendingGridTileType[] $VALUES;

    @NotNull
    private static final joa $cachedSerializer$delegate;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @q5h("PaidAd")
    public static final TrendingGridTileType PAID_AD = new TrendingGridTileType("PAID_AD", 0);

    @q5h("External")
    public static final TrendingGridTileType EXTERNAL = new TrendingGridTileType("EXTERNAL", 1);

    @q5h("League")
    public static final TrendingGridTileType LEAGUE = new TrendingGridTileType("LEAGUE", 2);

    @q5h("PlayerSeasonStats")
    public static final TrendingGridTileType PLAYER_SEASON_STATS = new TrendingGridTileType("PLAYER_SEASON_STATS", 3);

    @q5h("AIInsights")
    public static final TrendingGridTileType AI_INSIGHTS = new TrendingGridTileType("AI_INSIGHTS", 4);

    @q5h("Fantasy")
    public static final TrendingGridTileType FANTASY = new TrendingGridTileType("FANTASY", 5);
    public static final TrendingGridTileType UNKNOWN = new TrendingGridTileType("UNKNOWN", 6);

    private static final /* synthetic */ TrendingGridTileType[] $values() {
        return new TrendingGridTileType[]{PAID_AD, EXTERNAL, LEAGUE, PLAYER_SEASON_STATS, AI_INSIGHTS, FANTASY, UNKNOWN};
    }

    static {
        TrendingGridTileType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = gz8.G($values);
        INSTANCE = new Companion(null);
        $cachedSerializer$delegate = ypa.a(ysa.b, new uzj(3));
    }

    private TrendingGridTileType(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return hz8.F("com.sofascore.model.newNetwork.TrendingGridTileType", values(), new String[]{"PaidAd", "External", "League", "PlayerSeasonStats", "AIInsights", "Fantasy", null}, new Annotation[][]{null, null, null, null, null, null, null});
    }

    @NotNull
    public static jp5 getEntries() {
        return $ENTRIES;
    }

    public static TrendingGridTileType valueOf(String str) {
        return (TrendingGridTileType) Enum.valueOf(TrendingGridTileType.class, str);
    }

    public static TrendingGridTileType[] values() {
        return (TrendingGridTileType[]) $VALUES.clone();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/TrendingGridTileType$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/TrendingGridTileType;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) TrendingGridTileType.$cachedSerializer$delegate.getValue();
        }

        @NotNull
        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        private Companion() {
        }
    }
}
