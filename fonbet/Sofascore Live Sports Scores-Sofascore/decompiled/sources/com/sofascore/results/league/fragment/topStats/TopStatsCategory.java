package com.sofascore.results.league.fragment.topStats;

import android.os.Parcelable;
import com.sofascore.model.network.response.TeamAverageRatingVersion;
import defpackage.gv9;
import defpackage.gvh;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0003\u0002\u0003\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lcom/sofascore/results/league/fragment/topStats/TopStatsCategory;", "Landroid/os/Parcelable;", "Lcom/sofascore/results/league/fragment/topStats/TopPerformanceCategoryUiModel;", "Lcom/sofascore/results/league/fragment/topStats/TopPlayerCategoryUiModel;", "Lcom/sofascore/results/league/fragment/topStats/TopTeamCategoryUiModel;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface TopStatsCategory extends Parcelable {
    Integer I0();

    Integer P0();

    default TeamAverageRatingVersion a0() {
        return TeamAverageRatingVersion.ORIGINAL;
    }

    gvh e0();

    gv9 f0();

    String g0();

    String r0();
}
