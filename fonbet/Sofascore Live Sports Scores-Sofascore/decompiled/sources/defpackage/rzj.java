package defpackage;

import com.sofascore.model.newNetwork.TrendingGridTileType;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class rzj {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[TrendingGridTileType.values().length];
        try {
            iArr[TrendingGridTileType.UNKNOWN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TrendingGridTileType.PAID_AD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TrendingGridTileType.EXTERNAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[TrendingGridTileType.LEAGUE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[TrendingGridTileType.FANTASY.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[TrendingGridTileType.PLAYER_SEASON_STATS.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[TrendingGridTileType.AI_INSIGHTS.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        a = iArr;
    }
}
