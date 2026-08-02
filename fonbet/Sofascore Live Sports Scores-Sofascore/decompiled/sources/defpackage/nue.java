package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.newNetwork.PlayerOfTheSeasonResponse;
import com.sofascore.model.newNetwork.statistics.season.player.FootballPlayerSeasonStatistics;
import com.sofascore.results.R;
import com.sofascore.results.player.PlayerActivity;
import com.sofascore.results.view.SofascoreRatingView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class nue extends h6b {
    public static final /* synthetic */ int g = 0;
    public final p12 d;
    public String e;
    public String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nue(Context context) {
        super(context, null, 0);
        context.getClass();
        View root = getRoot();
        int i = R.id.bottom_link;
        LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.bottom_link, root);
        if (linearLayout != null) {
            i = R.id.bottom_link_text;
            if (((TextView) nq8.B(R.id.bottom_link_text, root)) != null) {
                i = R.id.card;
                ConstraintLayout constraintLayout = (ConstraintLayout) nq8.B(R.id.card, root);
                if (constraintLayout != null) {
                    i = R.id.clickable_area;
                    View B = nq8.B(R.id.clickable_area, root);
                    if (B != null) {
                        i = R.id.cup_logo;
                        if (((ImageView) nq8.B(R.id.cup_logo, root)) != null) {
                            i = R.id.info_icon;
                            ImageView imageView = (ImageView) nq8.B(R.id.info_icon, root);
                            if (imageView != null) {
                                i = R.id.player_logo;
                                ImageView imageView2 = (ImageView) nq8.B(R.id.player_logo, root);
                                if (imageView2 != null) {
                                    i = R.id.player_name;
                                    TextView textView = (TextView) nq8.B(R.id.player_name, root);
                                    if (textView != null) {
                                        i = R.id.rating_text;
                                        SofascoreRatingView sofascoreRatingView = (SofascoreRatingView) nq8.B(R.id.rating_text, root);
                                        if (sofascoreRatingView != null) {
                                            i = R.id.team_logo;
                                            ImageView imageView3 = (ImageView) nq8.B(R.id.team_logo, root);
                                            if (imageView3 != null) {
                                                i = R.id.team_name;
                                                TextView textView2 = (TextView) nq8.B(R.id.team_name, root);
                                                if (textView2 != null) {
                                                    i = R.id.title;
                                                    TextView textView3 = (TextView) nq8.B(R.id.title, root);
                                                    if (textView3 != null) {
                                                        this.d = new p12((CardView) root, linearLayout, constraintLayout, B, imageView, imageView2, textView, sofascoreRatingView, imageView3, textView2, textView3);
                                                        this.e = "league_details";
                                                        this.f = "player_of_the_season";
                                                        constraintLayout.setClipToOutline(true);
                                                        setVisibility(8);
                                                        sofascoreRatingView.setTextColor(-1);
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
        yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i)));
        throw null;
    }

    @Override // defpackage.rq4
    public final void e(u6b u6bVar) {
        u6bVar.getClass();
        if (getVisibility() == 0) {
            Context context = getContext();
            context.getClass();
            nv.z0(context, kv.IMPRESSION, this.f, this.e);
        }
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.player_of_the_season_card;
    }

    public final void l(final int i, final int i2, PlayerOfTheSeasonResponse playerOfTheSeasonResponse, String str, Function0 function0, Integer num) {
        Double rating;
        boolean z;
        double d;
        String Q;
        final int i3;
        ty1 ty1Var;
        playerOfTheSeasonResponse.getClass();
        str.getClass();
        FootballPlayerSeasonStatistics statistics = playerOfTheSeasonResponse.getStatistics();
        if (statistics == null || (rating = statistics.getRating()) == null) {
            return;
        }
        double doubleValue = rating.doubleValue();
        setVisibility(0);
        this.f = str.equals(Sports.BASKETBALL) ? "player_of_the_season_basketball" : "player_of_the_season";
        Team team = playerOfTheSeasonResponse.getTeam();
        Gender gender = team != null ? team.getGender() : null;
        boolean equals = str.equals(Sports.FOOTBALL);
        p12 p12Var = this.d;
        TextView textView = (TextView) p12Var.l;
        TextView textView2 = (TextView) p12Var.k;
        ImageView imageView = (ImageView) p12Var.j;
        TextView textView3 = (TextView) p12Var.c;
        ImageView imageView2 = (ImageView) p12Var.h;
        LinearLayout linearLayout = (LinearLayout) p12Var.f;
        ConstraintLayout constraintLayout = (ConstraintLayout) p12Var.b;
        if (playerOfTheSeasonResponse.getPlayerOfTheTournament()) {
            Context context = getContext();
            context.getClass();
            z = equals;
            d = doubleValue;
            Q = hkg.Q(context, R.string.player_of_the_tournament, gender, new Object[0]);
        } else {
            z = equals;
            d = doubleValue;
            Context context2 = getContext();
            context2.getClass();
            Q = hkg.Q(context2, R.string.player_of_the_season, gender, new Object[0]);
        }
        textView.setText(Q);
        linearLayout.setVisibility(z ? 0 : 8);
        if (str.equals(Sports.BASKETBALL)) {
            ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
            if (layoutParams == null) {
                yhk.s("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                return;
            }
            Context context3 = getContext();
            context3.getClass();
            layoutParams.height = ao2.s(120, context3);
            constraintLayout.setLayoutParams(layoutParams);
        }
        if (num != null) {
            constraintLayout.setBackgroundResource(num.intValue());
            i3 = i;
            ty1Var = null;
        } else {
            Context context4 = getContext();
            context4.getClass();
            hkj hkjVar = new hkj(context4);
            i3 = i;
            ty1Var = null;
            hkjVar.c(new qy0(i3, 0), null);
            constraintLayout.setBackground(hkjVar);
        }
        final Player player = playerOfTheSeasonResponse.getPlayer();
        as9.l(imageView2, player.getId(), ty1Var);
        textView3.setText(tba.t(player));
        if (z) {
            final int i4 = 0;
            z8e.a0(imageView2, 1000L, new Function0(this) { // from class: mue
                public final /* synthetic */ nue b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i5 = i4;
                    int i6 = i2;
                    int i7 = i3;
                    Player player2 = player;
                    nue nueVar = this.b;
                    switch (i5) {
                        case 0:
                            nueVar.n();
                            nueVar.o(player2.getId(), i7, i6);
                            break;
                        case 1:
                            nueVar.n();
                            nueVar.o(player2.getId(), i7, i6);
                            break;
                        default:
                            nueVar.n();
                            nueVar.o(player2.getId(), i7, i6);
                            break;
                    }
                    return Unit.a;
                }
            });
            final int i5 = 1;
            z8e.a0(textView3, 1000L, new Function0(this) { // from class: mue
                public final /* synthetic */ nue b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i52 = i5;
                    int i6 = i2;
                    int i7 = i;
                    Player player2 = player;
                    nue nueVar = this.b;
                    switch (i52) {
                        case 0:
                            nueVar.n();
                            nueVar.o(player2.getId(), i7, i6);
                            break;
                        case 1:
                            nueVar.n();
                            nueVar.o(player2.getId(), i7, i6);
                            break;
                        default:
                            nueVar.n();
                            nueVar.o(player2.getId(), i7, i6);
                            break;
                    }
                    return Unit.a;
                }
            });
            z8e.a0(linearLayout, 1000L, new ate(this, 1));
        } else {
            final int i6 = 2;
            z8e.a0((View) p12Var.e, 1000L, new Function0(this) { // from class: mue
                public final /* synthetic */ nue b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i52 = i6;
                    int i62 = i2;
                    int i7 = i;
                    Player player2 = player;
                    nue nueVar = this.b;
                    switch (i52) {
                        case 0:
                            nueVar.n();
                            nueVar.o(player2.getId(), i7, i62);
                            break;
                        case 1:
                            nueVar.n();
                            nueVar.o(player2.getId(), i7, i62);
                            break;
                        default:
                            nueVar.n();
                            nueVar.o(player2.getId(), i7, i62);
                            break;
                    }
                    return Unit.a;
                }
            });
        }
        Team team2 = playerOfTheSeasonResponse.getTeam();
        imageView.setVisibility(team2 != null ? 0 : 8);
        textView2.setVisibility(team2 != null ? 0 : 8);
        if (team2 != null) {
            as9.o(imageView, team2.getId());
            Context context5 = getContext();
            context5.getClass();
            textView2.setText(tba.p(context5, team2));
        }
        z8e.a0((ImageView) p12Var.g, 1000L, function0);
        SofascoreRatingView sofascoreRatingView = (SofascoreRatingView) p12Var.i;
        KProperty[] kPropertyArr = SofascoreRatingView.A;
        sofascoreRatingView.m(d, false);
    }

    public final void n() {
        Context context = getContext();
        context.getClass();
        nv.z0(context, kv.CLICK, this.f, this.e);
    }

    public final void o(int i, int i2, int i3) {
        int i4 = PlayerActivity.Z;
        Context context = getContext();
        context.getClass();
        jle.q(context, i, i2, Integer.valueOf(i3), zxe.d, false, null, null, 480);
    }

    public final void setAnalyticsLocation(@NotNull String str) {
        str.getClass();
        this.e = str;
    }
}
