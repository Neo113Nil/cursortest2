package com.sofascore.results.fantasy.onboarding.components.bottomSheet;

import android.os.Parcel;
import android.os.Parcelable;
import com.sofascore.model.fantasy.FantasyCompetitionType;
import com.sofascore.results.R;
import defpackage.ph0;
import defpackage.q9k;
import defpackage.w1l;
import defpackage.wj7;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lcom/sofascore/results/fantasy/onboarding/components/bottomSheet/FantasySectionedInfoType;", "Landroid/os/Parcelable;", "wj7", "WhatIsFantasy", "SeasonCompetitions", "WeeklyCompetitions", "CreateSquadInfo", "Lcom/sofascore/results/fantasy/onboarding/components/bottomSheet/FantasySectionedInfoType$CreateSquadInfo;", "Lcom/sofascore/results/fantasy/onboarding/components/bottomSheet/FantasySectionedInfoType$SeasonCompetitions;", "Lcom/sofascore/results/fantasy/onboarding/components/bottomSheet/FantasySectionedInfoType$WeeklyCompetitions;", "Lcom/sofascore/results/fantasy/onboarding/components/bottomSheet/FantasySectionedInfoType$WhatIsFantasy;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface FantasySectionedInfoType extends Parcelable {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sofascore/results/fantasy/onboarding/components/bottomSheet/FantasySectionedInfoType$CreateSquadInfo;", "Lcom/sofascore/results/fantasy/onboarding/components/bottomSheet/FantasySectionedInfoType;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CreateSquadInfo implements FantasySectionedInfoType {

        @NotNull
        public static final Parcelable.Creator<CreateSquadInfo> CREATOR = new b();
        public final int a;
        public final FantasyCompetitionType b;

        public CreateSquadInfo(int i, FantasyCompetitionType fantasyCompetitionType) {
            fantasyCompetitionType.getClass();
            this.a = i;
            this.b = fantasyCompetitionType;
        }

        @Override // com.sofascore.results.fantasy.onboarding.components.bottomSheet.FantasySectionedInfoType
        public final String Q0() {
            return "create_team";
        }

        @Override // com.sofascore.results.fantasy.onboarding.components.bottomSheet.FantasySectionedInfoType
        public final List X0() {
            wj7 wj7Var = new wj7(R.drawable.ic_leagues_empty, new q9k(R.string.fantasy_pro_tip_title_1), new q9k(R.string.fantasy_pro_tip_text_1));
            FantasyCompetitionType fantasyCompetitionType = FantasyCompetitionType.SEASON;
            FantasyCompetitionType fantasyCompetitionType2 = this.b;
            wj7 wj7Var2 = (fantasyCompetitionType2 == fantasyCompetitionType ? fantasyCompetitionType2 : null) != null ? new wj7(R.drawable.ic_currency, new q9k(R.string.fantasy_pro_tip_title_2), new q9k(R.string.fantasy_pro_tip_text_2)) : null;
            if (fantasyCompetitionType2 != FantasyCompetitionType.WEEKLY) {
                fantasyCompetitionType2 = null;
            }
            return ph0.x(new wj7[]{wj7Var, wj7Var2, fantasyCompetitionType2 != null ? new wj7(R.drawable.ic_euro_x, new q9k(R.string.fantasy_weekly_pro_tip_title_2), new q9k(R.string.fantasy_weekly_pro_tip_text_2)) : null, new wj7(R.drawable.ic_team_outlined, new q9k(R.string.fantasy_pro_tip_title_3), new q9k(R.string.fantasy_pro_tip_text_3)), new wj7(R.drawable.ic_wand, new q9k(R.string.fantasy_pro_tip_title_4), new q9k(R.string.fantasy_pro_tip_text_4))});
        }

        @Override // com.sofascore.results.fantasy.onboarding.components.bottomSheet.FantasySectionedInfoType
        /* renamed from: Z */
        public final Integer getA() {
            return Integer.valueOf(this.a);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CreateSquadInfo)) {
                return false;
            }
            CreateSquadInfo createSquadInfo = (CreateSquadInfo) obj;
            return this.a == createSquadInfo.a && this.b == createSquadInfo.b;
        }

        @Override // com.sofascore.results.fantasy.onboarding.components.bottomSheet.FantasySectionedInfoType
        public final q9k getTitle() {
            return new q9k(R.string.fantasy_what_you_need_to_know);
        }

        public final int hashCode() {
            return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
        }

        @Override // com.sofascore.results.fantasy.onboarding.components.bottomSheet.FantasySectionedInfoType
        /* renamed from: p, reason: from getter */
        public final FantasyCompetitionType getB() {
            return this.b;
        }

        public final String toString() {
            return "CreateSquadInfo(competitionId=" + this.a + ", competitionType=" + this.b + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(this.a);
            parcel.writeString(this.b.name());
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sofascore/results/fantasy/onboarding/components/bottomSheet/FantasySectionedInfoType$SeasonCompetitions;", "Lcom/sofascore/results/fantasy/onboarding/components/bottomSheet/FantasySectionedInfoType;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SeasonCompetitions implements FantasySectionedInfoType {

        @NotNull
        public static final Parcelable.Creator<SeasonCompetitions> CREATOR = new c();
        public final Integer a;

        public SeasonCompetitions(Integer num) {
            this.a = num;
        }

        @Override // com.sofascore.results.fantasy.onboarding.components.bottomSheet.FantasySectionedInfoType
        public final String Q0() {
            return "season_long";
        }

        @Override // com.sofascore.results.fantasy.onboarding.components.bottomSheet.FantasySectionedInfoType
        public final List X0() {
            return kotlin.collections.b.j(new wj7(R.drawable.ic_leagues_empty, new q9k(R.string.fantasy_season_long_intro_title_1), new q9k(R.string.fantasy_season_long_intro_text_1)), new wj7(R.drawable.ic_currency, new q9k(R.string.fantasy_season_long_intro_title_2), new q9k(R.string.fantasy_season_long_intro_text_2)), new wj7(R.drawable.ic_predictions_menu, new q9k(R.string.fantasy_season_long_intro_title_3), new q9k(R.string.fantasy_season_long_intro_text_3)));
        }

        @Override // com.sofascore.results.fantasy.onboarding.components.bottomSheet.FantasySectionedInfoType
        /* renamed from: Z, reason: from getter */
        public final Integer getA() {
            return this.a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SeasonCompetitions) && Intrinsics.c(this.a, ((SeasonCompetitions) obj).a);
        }

        @Override // com.sofascore.results.fantasy.onboarding.components.bottomSheet.FantasySectionedInfoType
        public final q9k getTitle() {
            return new q9k(R.string.fantasy_season_long_competitions);
        }

        public final int hashCode() {
            Integer num = this.a;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        @Override // com.sofascore.results.fantasy.onboarding.components.bottomSheet.FantasySectionedInfoType
        /* renamed from: p */
        public final FantasyCompetitionType getB() {
            return FantasyCompetitionType.SEASON;
        }

        public final String toString() {
            return "SeasonCompetitions(competitionId=" + this.a + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            Integer num = this.a;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                w1l.u(parcel, 1, num);
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sofascore/results/fantasy/onboarding/components/bottomSheet/FantasySectionedInfoType$WeeklyCompetitions;", "Lcom/sofascore/results/fantasy/onboarding/components/bottomSheet/FantasySectionedInfoType;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class WeeklyCompetitions implements FantasySectionedInfoType {

        @NotNull
        public static final Parcelable.Creator<WeeklyCompetitions> CREATOR = new d();
        public final Integer a;

        public WeeklyCompetitions(Integer num) {
            this.a = num;
        }

        @Override // com.sofascore.results.fantasy.onboarding.components.bottomSheet.FantasySectionedInfoType
        public final String Q0() {
            return "weekly";
        }

        @Override // com.sofascore.results.fantasy.onboarding.components.bottomSheet.FantasySectionedInfoType
        public final List X0() {
            return kotlin.collections.b.j(new wj7(R.drawable.ic_leagues_empty, new q9k(R.string.fantasy_elite_faceoff_intro_title_1), new q9k(R.string.fantasy_elite_faceoff_intro_text_1)), new wj7(R.drawable.ic_euro_x, new q9k(R.string.fantasy_elite_faceoff_intro_title_2), new q9k(R.string.fantasy_elite_faceoff_intro_text_2)), new wj7(R.drawable.ic_predictions_menu, new q9k(R.string.fantasy_elite_faceoff_intro_title_3), new q9k(R.string.fantasy_elite_faceoff_intro_text_3)));
        }

        @Override // com.sofascore.results.fantasy.onboarding.components.bottomSheet.FantasySectionedInfoType
        /* renamed from: Z, reason: from getter */
        public final Integer getA() {
            return this.a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof WeeklyCompetitions) && Intrinsics.c(this.a, ((WeeklyCompetitions) obj).a);
        }

        @Override // com.sofascore.results.fantasy.onboarding.components.bottomSheet.FantasySectionedInfoType
        public final q9k getTitle() {
            return new q9k(R.string.fantasy_weekly_competitions);
        }

        public final int hashCode() {
            Integer num = this.a;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        @Override // com.sofascore.results.fantasy.onboarding.components.bottomSheet.FantasySectionedInfoType
        /* renamed from: p */
        public final FantasyCompetitionType getB() {
            return FantasyCompetitionType.WEEKLY;
        }

        public final String toString() {
            return "WeeklyCompetitions(competitionId=" + this.a + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            Integer num = this.a;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                w1l.u(parcel, 1, num);
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sofascore/results/fantasy/onboarding/components/bottomSheet/FantasySectionedInfoType$WhatIsFantasy;", "Lcom/sofascore/results/fantasy/onboarding/components/bottomSheet/FantasySectionedInfoType;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class WhatIsFantasy implements FantasySectionedInfoType {
        public static final WhatIsFantasy a = new WhatIsFantasy();

        @NotNull
        public static final Parcelable.Creator<WhatIsFantasy> CREATOR = new e();

        @Override // com.sofascore.results.fantasy.onboarding.components.bottomSheet.FantasySectionedInfoType
        public final String Q0() {
            return "";
        }

        @Override // com.sofascore.results.fantasy.onboarding.components.bottomSheet.FantasySectionedInfoType
        public final List X0() {
            return kotlin.collections.b.j(new wj7(R.drawable.ic_main_fantasy, new q9k(R.string.fantasy_basics_title), new q9k(R.string.fantasy_basics_body)), new wj7(R.drawable.ic_controller, new q9k(R.string.how_do_you_play), new q9k(R.string.how_do_you_play_body)), new wj7(R.drawable.ic_access_time, new q9k(R.string.when_does_it_start), new q9k(R.string.when_does_it_start_body)));
        }

        @Override // com.sofascore.results.fantasy.onboarding.components.bottomSheet.FantasySectionedInfoType
        /* renamed from: Z */
        public final Integer getA() {
            return null;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof WhatIsFantasy);
        }

        @Override // com.sofascore.results.fantasy.onboarding.components.bottomSheet.FantasySectionedInfoType
        public final q9k getTitle() {
            return new q9k(R.string.what_is_fantasy);
        }

        public final int hashCode() {
            return 999848367;
        }

        @Override // com.sofascore.results.fantasy.onboarding.components.bottomSheet.FantasySectionedInfoType
        /* renamed from: p */
        public final FantasyCompetitionType getB() {
            return null;
        }

        public final String toString() {
            return "WhatIsFantasy";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    String Q0();

    List X0();

    /* renamed from: Z */
    Integer getA();

    q9k getTitle();

    /* renamed from: p */
    FantasyCompetitionType getB();
}
