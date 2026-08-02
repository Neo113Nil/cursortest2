package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Category;
import com.sofascore.model.mvvm.model.Country;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.PlayerTeamInfo;
import com.sofascore.model.mvvm.model.Referee;
import com.sofascore.model.mvvm.model.Sport;
import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.UniqueStage;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.results.R;
import com.sofascore.results.view.follownotification.FollowButton;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class jwg extends r7 {
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jwg(js2 js2Var, Function2 function2, int i) {
        super(js2Var, function2);
        this.f = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d1  */
    @Override // defpackage.r7, defpackage.p8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(int i, int i2, Object obj) {
        Team team;
        String i3;
        Sport sport;
        PlayerTeamInfo playerTeamInfo;
        Sport sport2;
        Country country;
        String slug;
        int i4 = this.f;
        Context context = this.b;
        Object obj2 = this.d;
        switch (i4) {
            case 0:
                UniqueTournament uniqueTournament = (UniqueTournament) obj;
                uniqueTournament.getClass();
                super.b(i, i2, uniqueTournament);
                js2 js2Var = (js2) obj2;
                as9.q((ImageView) js2Var.c, Integer.valueOf(uniqueTournament.getId()), 0, null);
                ((TextView) js2Var.l).setText(tba.x(uniqueTournament));
                ((Group) js2Var.h).setVisibility(0);
                js2Var.d.setText(uxf.E(uniqueTournament.getUserCount(), 58, false));
                ImageView imageView = (ImageView) js2Var.e;
                imageView.setVisibility(0);
                as9.b(imageView, Integer.valueOf(uniqueTournament.getCategory().getId()), null);
                TextView textView = (TextView) js2Var.m;
                textView.setVisibility(0);
                textView.setText(tba.q(uniqueTournament.getCategory(), context));
                boolean isRecent = uniqueTournament.getIsRecent();
                FollowButton followButton = (FollowButton) js2Var.j;
                if (isRecent) {
                    followButton.setVisibility(8);
                } else {
                    followButton.setVisibility(0);
                    followButton.e(uniqueTournament, wu.SEARCH, null);
                }
                f(uniqueTournament.getCategory().getSport(), true);
                break;
            case 1:
                Player player = (Player) obj;
                player.getClass();
                super.b(i, i2, player);
                js2 js2Var2 = (js2) obj2;
                ImageView imageView2 = (ImageView) js2Var2.c;
                Group group = (Group) js2Var2.h;
                TextView textView2 = (TextView) js2Var2.m;
                ImageView imageView3 = (ImageView) js2Var2.e;
                FollowButton followButton2 = (FollowButton) js2Var2.j;
                as9.l(imageView2, player.getId(), null);
                ((TextView) js2Var2.l).setText(tba.t(player));
                String sportSlug = player.getSportSlug();
                if (!player.getDeceased() && !player.getRetired() && !player.getDisabled()) {
                    Set set = wyh.z;
                    String sportSlug2 = player.getSportSlug();
                    if (sportSlug2 != null) {
                        sportSlug = sportSlug2;
                    }
                    if (CollectionsKt.R(set, sportSlug)) {
                        js2Var2.d.setText(uxf.E(player.getUserCount(), 58, false));
                        group.setVisibility(0);
                        if (player.getIsRecent()) {
                            followButton2.setVisibility(8);
                        } else {
                            followButton2.setVisibility(0);
                            followButton2.e(player, wu.SEARCH, null);
                        }
                        if (player.getDeceased()) {
                            imageView2.clearColorFilter();
                        } else {
                            as9.a(imageView2);
                        }
                        team = player.getTeam();
                        if (team != null) {
                            if (player.getDeceased()) {
                                team = null;
                            }
                            if (team != null) {
                                if (player.getRetired()) {
                                    imageView3.setVisibility(8);
                                } else {
                                    imageView3.setVisibility(0);
                                    as9.o(imageView3, team.getId());
                                }
                                textView2.setVisibility(0);
                                textView2.setText(player.getRetired() ? context.getString(R.string.retired_player) : tba.p(context, team));
                                f(team.getSport(), true);
                                break;
                            }
                        }
                        imageView3.setVisibility(8);
                        textView2.setVisibility(8);
                        Team team2 = player.getTeam();
                        f(team2 != null ? team2.getSport() : null, false);
                        break;
                    }
                }
                group.setVisibility(8);
                followButton2.setVisibility(8);
                if (player.getDeceased()) {
                }
                team = player.getTeam();
                if (team != null) {
                }
                imageView3.setVisibility(8);
                textView2.setVisibility(8);
                Team team22 = player.getTeam();
                f(team22 != null ? team22.getSport() : null, false);
                break;
            case 2:
                Referee referee = (Referee) obj;
                referee.getClass();
                super.b(i, i2, referee);
                js2 js2Var3 = (js2) obj2;
                as9.m((ImageView) js2Var3.c, referee.getId());
                ((TextView) js2Var3.l).setText(tba.u(referee));
                ((ImageView) js2Var3.e).setVisibility(8);
                ((TextView) js2Var3.m).setVisibility(8);
                f(referee.getSport(), false);
                break;
            case 3:
                Sport sport3 = (Sport) obj;
                sport3.getClass();
                super.b(i, i2, sport3);
                js2 js2Var4 = (js2) obj2;
                ImageView imageView4 = (ImageView) js2Var4.c;
                Set set2 = wyh.a;
                imageView4.setImageResource(wyh.a(sport3.getSlug()));
                imageView4.setImageTintList(ColorStateList.valueOf(context.getColor(R.color.n_lv_1)));
                ((TextView) js2Var4.l).setText(wyh.c(context, sport3.getSlug()));
                ((TextView) js2Var4.m).setText(context.getString(R.string.entity_sport));
                ((Group) js2Var4.h).setVisibility(8);
                ((FollowButton) js2Var4.j).setVisibility(8);
                ((ImageView) js2Var4.e).setVisibility(8);
                ((ImageView) js2Var4.f).setVisibility(8);
                ((ConstraintLayout) js2Var4.n).setVisibility(0);
                ((TextView) js2Var4.o).setVisibility(8);
                ((ImageView) js2Var4.g).setVisibility(8);
                break;
            case 4:
                Stage stage = (Stage) obj;
                js2 js2Var5 = (js2) obj2;
                stage.getClass();
                super.b(i, i2, stage);
                Category category = stage.getCategory();
                String slug2 = (category == null || (sport = category.getSport()) == null) ? null : sport.getSlug();
                TextView textView3 = (TextView) js2Var5.l;
                ImageView imageView5 = (ImageView) js2Var5.g;
                ImageView imageView6 = (ImageView) js2Var5.e;
                textView3.setText(stage.getDescription());
                ImageView imageView7 = (ImageView) js2Var5.c;
                Country country2 = stage.getCountry();
                as9.c(imageView7, country2 != null ? country2.getAlpha2() : null, false, null, 6);
                ((Group) js2Var5.h).setVisibility(8);
                ((FollowButton) js2Var5.j).setVisibility(8);
                imageView6.setVisibility(slug2 == null ? 8 : 0);
                if (slug2 != null) {
                    imageView6.setImageDrawable(context.getDrawable(wyh.a(slug2)));
                    z8e.Y(imageView6, context, R.color.n_lv_3);
                }
                TextView textView4 = (TextView) js2Var5.m;
                if (ug5.w(stage.getStartDateTimestamp())) {
                    i3 = context.getString(R.string.yesterday);
                } else if (ug5.u(stage.getStartDateTimestamp())) {
                    i3 = context.getString(R.string.today);
                } else if (ug5.v(stage.getStartDateTimestamp())) {
                    i3 = context.getString(R.string.tomorrow);
                } else {
                    long startDateTimestamp = stage.getStartDateTimestamp();
                    bi4 bi4Var = bi4.PATTERN_DMY_SHORT;
                    ConcurrentHashMap concurrentHashMap = hk4.a;
                    i3 = fc6.i(startDateTimestamp, hk4.a(bi4Var.d()));
                }
                textView4.setText(i3);
                Category category2 = stage.getCategory();
                as9.b(imageView5, category2 != null ? Integer.valueOf(category2.getId()) : null, null);
                TextView textView5 = (TextView) js2Var5.o;
                Category category3 = stage.getCategory();
                textView5.setText(category3 != null ? tba.q(category3, context) : null);
                imageView5.setImageTintList(null);
                break;
            case 5:
                Team team3 = (Team) obj;
                team3.getClass();
                super.b(i, i2, team3);
                js2 js2Var6 = (js2) obj2;
                TextView textView6 = (TextView) js2Var6.l;
                Group group2 = (Group) js2Var6.h;
                TextView textView7 = (TextView) js2Var6.m;
                ImageView imageView8 = (ImageView) js2Var6.e;
                FollowButton followButton3 = (FollowButton) js2Var6.j;
                ImageView imageView9 = (ImageView) js2Var6.c;
                textView6.setText(tba.p(context, team3));
                Sport sport4 = team3.getSport();
                if (sport4 != null && (slug = sport4.getSlug()) != null) {
                    Set set3 = wyh.a;
                    if (!slug.equals(Sports.MMA)) {
                        slug = null;
                    }
                    if (slug != null) {
                        as9.d(imageView9, team3.getId(), team3.getGender(), true);
                        playerTeamInfo = team3.getPlayerTeamInfo();
                        if (playerTeamInfo == null ? Intrinsics.c(playerTeamInfo.getDeceased(), Boolean.TRUE) : false) {
                            group2.setVisibility(0);
                            js2Var6.d.setText(uxf.E(team3.getUserCount(), 58, false));
                            imageView9.clearColorFilter();
                            if (team3.getIsRecent()) {
                                followButton3.setVisibility(8);
                            } else {
                                followButton3.setVisibility(0);
                                followButton3.e(team3, wu.SEARCH, null);
                            }
                        } else {
                            as9.a(imageView9);
                            group2.setVisibility(8);
                            followButton3.setVisibility(8);
                        }
                        sport2 = team3.getSport();
                        if (sport2 != null && qea.y(team3)) {
                            Set set4 = wyh.a;
                            if (!wyh.e(sport2.getSlug())) {
                                textView6.append(" (F)");
                            }
                        }
                        country = team3.getCountry();
                        if ((country == null ? country.getAlpha2() : null) == null && !team3.getNational()) {
                            imageView8.setVisibility(0);
                            as9.c(imageView8, country.getAlpha2(), false, null, 4);
                            textView7.setVisibility(0);
                            Context context2 = ((LinearLayout) js2Var6.i).getContext();
                            context2.getClass();
                            textView7.setText(tv3.c(context2, country.getName()));
                            f(team3.getSport(), true);
                            break;
                        } else {
                            imageView8.setVisibility(8);
                            textView7.setVisibility(8);
                            f(team3.getSport(), false);
                            break;
                        }
                    }
                }
                as9.o(imageView9, team3.getId());
                playerTeamInfo = team3.getPlayerTeamInfo();
                if (playerTeamInfo == null ? Intrinsics.c(playerTeamInfo.getDeceased(), Boolean.TRUE) : false) {
                }
                sport2 = team3.getSport();
                if (sport2 != null) {
                    Set set42 = wyh.a;
                    if (!wyh.e(sport2.getSlug())) {
                    }
                }
                country = team3.getCountry();
                if ((country == null ? country.getAlpha2() : null) == null) {
                }
                imageView8.setVisibility(8);
                textView7.setVisibility(8);
                f(team3.getSport(), false);
                break;
            default:
                UniqueStage uniqueStage = (UniqueStage) obj;
                uniqueStage.getClass();
                super.b(i, i2, uniqueStage);
                js2 js2Var7 = (js2) obj2;
                as9.b((ImageView) js2Var7.c, Integer.valueOf(uniqueStage.getCategory().getId()), null);
                ((TextView) js2Var7.l).setText(uniqueStage.getName());
                ((Group) js2Var7.h).setVisibility(8);
                ((FollowButton) js2Var7.j).setVisibility(8);
                ((ImageView) js2Var7.e).setVisibility(8);
                ((TextView) js2Var7.m).setVisibility(8);
                f(uniqueStage.getCategory().getSport(), false);
                break;
        }
    }
}
