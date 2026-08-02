package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.model.newNetwork.AdditionalStatistics;
import com.sofascore.model.newNetwork.EventBestPlayer;
import com.sofascore.model.newNetwork.EventBestPlayersResponse;
import com.sofascore.results.R;
import com.sofascore.results.view.SofascoreSmallRatingView;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class od5 extends o8 {
    public static final List e = b.j(Sports.BASKETBALL, Sports.VOLLEYBALL);
    public final nd5 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public od5(Context context) {
        super(context, null, 0);
        context.getClass();
        View root = getRoot();
        int i = R.id.click_container_first;
        View B = nq8.B(R.id.click_container_first, root);
        if (B != null) {
            i = R.id.click_container_second;
            View B2 = nq8.B(R.id.click_container_second, root);
            if (B2 != null) {
                i = R.id.divider_first_side;
                View B3 = nq8.B(R.id.divider_first_side, root);
                if (B3 != null) {
                    i = R.id.divider_first_top;
                    View B4 = nq8.B(R.id.divider_first_top, root);
                    if (B4 != null) {
                        i = R.id.divider_second_side;
                        View B5 = nq8.B(R.id.divider_second_side, root);
                        if (B5 != null) {
                            i = R.id.divider_second_top;
                            View B6 = nq8.B(R.id.divider_second_top, root);
                            if (B6 != null) {
                                i = R.id.image_player_first;
                                ImageView imageView = (ImageView) nq8.B(R.id.image_player_first, root);
                                if (imageView != null) {
                                    i = R.id.image_player_second;
                                    ImageView imageView2 = (ImageView) nq8.B(R.id.image_player_second, root);
                                    if (imageView2 != null) {
                                        i = R.id.player_name_first;
                                        TextView textView = (TextView) nq8.B(R.id.player_name_first, root);
                                        if (textView != null) {
                                            i = R.id.player_name_second;
                                            TextView textView2 = (TextView) nq8.B(R.id.player_name_second, root);
                                            if (textView2 != null) {
                                                i = R.id.rating_first;
                                                SofascoreSmallRatingView sofascoreSmallRatingView = (SofascoreSmallRatingView) nq8.B(R.id.rating_first, root);
                                                if (sofascoreSmallRatingView != null) {
                                                    i = R.id.rating_second;
                                                    SofascoreSmallRatingView sofascoreSmallRatingView2 = (SofascoreSmallRatingView) nq8.B(R.id.rating_second, root);
                                                    if (sofascoreSmallRatingView2 != null) {
                                                        i = R.id.statistic_first_1;
                                                        TextView textView3 = (TextView) nq8.B(R.id.statistic_first_1, root);
                                                        if (textView3 != null) {
                                                            i = R.id.statistic_first_2;
                                                            TextView textView4 = (TextView) nq8.B(R.id.statistic_first_2, root);
                                                            if (textView4 != null) {
                                                                i = R.id.statistic_first_3;
                                                                TextView textView5 = (TextView) nq8.B(R.id.statistic_first_3, root);
                                                                if (textView5 != null) {
                                                                    i = R.id.statistic_first_4;
                                                                    TextView textView6 = (TextView) nq8.B(R.id.statistic_first_4, root);
                                                                    if (textView6 != null) {
                                                                        i = R.id.statistic_first_5;
                                                                        TextView textView7 = (TextView) nq8.B(R.id.statistic_first_5, root);
                                                                        if (textView7 != null) {
                                                                            i = R.id.statistic_label_1;
                                                                            TextView textView8 = (TextView) nq8.B(R.id.statistic_label_1, root);
                                                                            if (textView8 != null) {
                                                                                i = R.id.statistic_label_2;
                                                                                TextView textView9 = (TextView) nq8.B(R.id.statistic_label_2, root);
                                                                                if (textView9 != null) {
                                                                                    i = R.id.statistic_label_3;
                                                                                    TextView textView10 = (TextView) nq8.B(R.id.statistic_label_3, root);
                                                                                    if (textView10 != null) {
                                                                                        i = R.id.statistic_label_4;
                                                                                        TextView textView11 = (TextView) nq8.B(R.id.statistic_label_4, root);
                                                                                        if (textView11 != null) {
                                                                                            i = R.id.statistic_label_5;
                                                                                            TextView textView12 = (TextView) nq8.B(R.id.statistic_label_5, root);
                                                                                            if (textView12 != null) {
                                                                                                i = R.id.statistic_second_1;
                                                                                                TextView textView13 = (TextView) nq8.B(R.id.statistic_second_1, root);
                                                                                                if (textView13 != null) {
                                                                                                    i = R.id.statistic_second_2;
                                                                                                    TextView textView14 = (TextView) nq8.B(R.id.statistic_second_2, root);
                                                                                                    if (textView14 != null) {
                                                                                                        i = R.id.statistic_second_3;
                                                                                                        TextView textView15 = (TextView) nq8.B(R.id.statistic_second_3, root);
                                                                                                        if (textView15 != null) {
                                                                                                            i = R.id.statistic_second_4;
                                                                                                            TextView textView16 = (TextView) nq8.B(R.id.statistic_second_4, root);
                                                                                                            if (textView16 != null) {
                                                                                                                i = R.id.statistic_second_5;
                                                                                                                TextView textView17 = (TextView) nq8.B(R.id.statistic_second_5, root);
                                                                                                                if (textView17 != null) {
                                                                                                                    this.d = new nd5((ConstraintLayout) root, B, B2, B3, B4, B5, B6, imageView, imageView2, textView, textView2, sofascoreSmallRatingView, sofascoreSmallRatingView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14, textView15, textView16, textView17);
                                                                                                                    setVisibility(8);
                                                                                                                    return;
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i)));
        throw null;
    }

    private final List<TextView> getStatisticsFirst() {
        nd5 nd5Var = this.d;
        return b.j(nd5Var.n, nd5Var.o, nd5Var.p, nd5Var.q, nd5Var.r);
    }

    private final List<TextView> getStatisticsSecond() {
        nd5 nd5Var = this.d;
        return b.j(nd5Var.x, nd5Var.y, nd5Var.z, nd5Var.A, nd5Var.B);
    }

    public static List l(AdditionalStatistics additionalStatistics, String str) {
        return Intrinsics.c(str, Sports.BASKETBALL) ? b.j(String.valueOf(yid.m(additionalStatistics.getPoints())), String.valueOf(yid.m(additionalStatistics.getRebounds())), String.valueOf(yid.m(additionalStatistics.getAssists())), String.valueOf(yid.m(additionalStatistics.getSteals())), String.valueOf(yid.m(additionalStatistics.getBlocks()))) : Intrinsics.c(str, Sports.VOLLEYBALL) ? b.j(String.valueOf(yid.m(additionalStatistics.getPointsTotal())), String.valueOf(yid.m(additionalStatistics.getAttackPoints())), String.valueOf(yid.m(additionalStatistics.getAces())), String.valueOf(yid.m(additionalStatistics.getBlockPoints()))) : km5.a;
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.dual_best_players_view;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x015d, code lost:
    
        if (r0 == null) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(Event event, EventBestPlayersResponse eventBestPlayersResponse) {
        AdditionalStatistics additionalStatistics;
        Double rating;
        Unit unit;
        Double rating2;
        if (eventBestPlayersResponse != null) {
            EventBestPlayersResponse eventBestPlayersResponse2 = eventBestPlayersResponse.hasAdditionalStats() ? eventBestPlayersResponse : null;
            if (eventBestPlayersResponse2 != null) {
                int visibility = getVisibility();
                nd5 nd5Var = this.d;
                if (visibility != 0 && Intrinsics.c(ok3.s(event), Sports.VOLLEYBALL)) {
                    nd5Var.s.setText(getContext().getString(R.string.volleyball_points_short));
                    nd5Var.t.setText(getContext().getString(R.string.volleyball_attack_short));
                    nd5Var.u.setText(getContext().getString(R.string.volleyball_aces_short));
                    nd5Var.v.setText(getContext().getString(R.string.volleyball_blocks_short));
                    nd5Var.w.setVisibility(8);
                }
                int i = 0;
                setVisibility(me4.t(StatusKt.STATUS_FINISHED, event) ? 0 : 8);
                EventBestPlayer homeBestPlayer$default = EventBestPlayersResponse.getHomeBestPlayer$default(eventBestPlayersResponse2, null, 1, null);
                EventBestPlayer awayBestPlayer$default = EventBestPlayersResponse.getAwayBestPlayer$default(eventBestPlayersResponse2, null, 1, null);
                ImageView imageView = nd5Var.h;
                SofascoreSmallRatingView sofascoreSmallRatingView = nd5Var.m;
                SofascoreSmallRatingView sofascoreSmallRatingView2 = nd5Var.l;
                as9.l(imageView, homeBestPlayer$default.getPlayer().getId(), null);
                as9.l(nd5Var.i, awayBestPlayer$default.getPlayer().getId(), null);
                View view = nd5Var.b;
                AdditionalStatistics additionalStatistics2 = homeBestPlayer$default.getAdditionalStatistics();
                Double rating3 = additionalStatistics2 != null ? additionalStatistics2.getRating() : null;
                aba.y(view, 0, 3);
                view.setOnClickListener(new rx1(event, this, homeBestPlayer$default, Event.getHomeTeam$default(event, null, 1, null), rating3, 1));
                View view2 = nd5Var.c;
                AdditionalStatistics additionalStatistics3 = awayBestPlayer$default.getAdditionalStatistics();
                Double rating4 = additionalStatistics3 != null ? additionalStatistics3.getRating() : null;
                aba.y(view2, 0, 3);
                view2.setOnClickListener(new rx1(event, this, awayBestPlayer$default, Event.getAwayTeam$default(event, null, 1, null), rating4, 1));
                TextView textView = nd5Var.j;
                String C = tba.C(homeBestPlayer$default.getPlayer());
                if (C == null) {
                    C = tba.t(homeBestPlayer$default.getPlayer());
                }
                textView.setText(C);
                TextView textView2 = nd5Var.k;
                String C2 = tba.C(awayBestPlayer$default.getPlayer());
                if (C2 == null) {
                    C2 = tba.t(awayBestPlayer$default.getPlayer());
                }
                textView2.setText(C2);
                AdditionalStatistics additionalStatistics4 = homeBestPlayer$default.getAdditionalStatistics();
                if (additionalStatistics4 != null && (rating = additionalStatistics4.getRating()) != null) {
                    yea yeaVar = j58.a;
                    if (!j58.k()) {
                        rating = null;
                    }
                    if (rating != null) {
                        double doubleValue = rating.doubleValue();
                        AdditionalStatistics additionalStatistics5 = awayBestPlayer$default.getAdditionalStatistics();
                        if (additionalStatistics5 == null || (rating2 = additionalStatistics5.getRating()) == null) {
                            unit = null;
                        } else {
                            double doubleValue2 = rating2.doubleValue();
                            SofascoreSmallRatingView.k(sofascoreSmallRatingView2, Double.valueOf(doubleValue), 6);
                            SofascoreSmallRatingView.k(sofascoreSmallRatingView, Double.valueOf(doubleValue2), 6);
                            unit = Unit.a;
                        }
                    }
                }
                sofascoreSmallRatingView2.setVisibility(8);
                sofascoreSmallRatingView.setVisibility(8);
                AdditionalStatistics additionalStatistics6 = homeBestPlayer$default.getAdditionalStatistics();
                if (additionalStatistics6 == null || (additionalStatistics = awayBestPlayer$default.getAdditionalStatistics()) == null) {
                    return;
                }
                String s = ok3.s(event);
                List l = l(additionalStatistics6, s);
                int i2 = 0;
                for (Object obj : getStatisticsFirst()) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        b.q();
                        throw null;
                    }
                    TextView textView3 = (TextView) obj;
                    textView3.getClass();
                    haa.N(textView3, (CharSequence) CollectionsKt.a0(i2, l));
                    i2 = i3;
                }
                List l2 = l(additionalStatistics, s);
                for (Object obj2 : getStatisticsSecond()) {
                    int i4 = i + 1;
                    if (i < 0) {
                        b.q();
                        throw null;
                    }
                    TextView textView4 = (TextView) obj2;
                    textView4.getClass();
                    haa.N(textView4, (CharSequence) CollectionsKt.a0(i, l2));
                    i = i4;
                }
                return;
            }
        }
        setVisibility(8);
    }
}
