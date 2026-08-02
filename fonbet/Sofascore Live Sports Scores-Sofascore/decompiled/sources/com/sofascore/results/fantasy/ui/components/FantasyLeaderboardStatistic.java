package com.sofascore.results.fantasy.ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import com.sofascore.results.R;
import defpackage.wd;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lcom/sofascore/results/fantasy/ui/components/FantasyLeaderboardStatistic;", "Landroid/os/Parcelable;", "", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public enum FantasyLeaderboardStatistic implements Parcelable {
    RoundPoints(R.string.fantasy_round_short, R.string.fantasy_round, 32.0f),
    Points(R.string.points_short, R.string.any_sport_points_long, 48.0f),
    Wins(R.string.win_short, R.string.any_sport_wins_long, 32.0f),
    Draws(R.string.draw_short, R.string.any_sport_draws_long, 32.0f),
    Losses(R.string.losses_short, R.string.any_sport_losses_long, 32.0f),
    PointsFor(R.string.any_sport_points_for_short, R.string.any_sport_points_for_long, 48.0f),
    PointsAgainst(R.string.any_sport_points_against_short, R.string.any_sport_points_against_long, 48.0f),
    H2HPoints(R.string.points_short, R.string.any_sport_points_long, 32.0f);


    @NotNull
    public static final Parcelable.Creator<FantasyLeaderboardStatistic> CREATOR = new wd(15);
    public final int a;
    public final int b;
    public final float c;

    FantasyLeaderboardStatistic(int i, int i2, float f) {
        this.a = i;
        this.b = i2;
        this.c = f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(name());
    }
}
