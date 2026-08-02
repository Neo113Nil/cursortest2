package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.imageview.ShapeableImageView;
import com.sofascore.model.buzzer.APIBuzzerTile;
import com.sofascore.model.buzzer.InterestingStatisticsItem;
import com.sofascore.model.mvvm.model.Country;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.results.R;
import com.sofascore.results.event.EventActivity;
import com.sofascore.results.league.LeagueActivity;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class fy4 extends v11 {
    public final /* synthetic */ int g;
    public final int h;
    public final krk i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fy4(View view, View view2, String str, int i) {
        super(view, view2, str);
        this.g = i;
        int i2 = R.id.gradient;
        int i3 = R.id.tournament_image;
        view.getClass();
        view2.getClass();
        str.getClass();
        switch (i) {
            case 1:
                super(view, view2, str);
                ShapeableImageView shapeableImageView = (ShapeableImageView) nq8.B(R.id.full_color, view2);
                if (shapeableImageView != null) {
                    FrameLayout frameLayout = (FrameLayout) nq8.B(R.id.gradient, view2);
                    if (frameLayout != null) {
                        FrameLayout frameLayout2 = (FrameLayout) nq8.B(R.id.overlay, view2);
                        if (frameLayout2 != null) {
                            i2 = R.id.player_image;
                            ImageView imageView = (ImageView) nq8.B(R.id.player_image, view2);
                            if (imageView != null) {
                                i2 = R.id.player_name_text;
                                TextView textView = (TextView) nq8.B(R.id.player_name_text, view2);
                                if (textView != null) {
                                    FrameLayout frameLayout3 = (FrameLayout) nq8.B(R.id.ripple_holder, view2);
                                    if (frameLayout3 != null) {
                                        i2 = R.id.statistic_gradient;
                                        View B = nq8.B(R.id.statistic_gradient, view2);
                                        if (B != null) {
                                            i2 = R.id.statistic_name;
                                            TextView textView2 = (TextView) nq8.B(R.id.statistic_name, view2);
                                            if (textView2 != null) {
                                                i2 = R.id.statistic_value;
                                                TextView textView3 = (TextView) nq8.B(R.id.statistic_value, view2);
                                                if (textView3 != null) {
                                                    this.i = new bu1((ConstraintLayout) view2, shapeableImageView, frameLayout, frameLayout2, imageView, textView, frameLayout3, B, textView2, textView3);
                                                    this.h = this.b.getColor(R.color.surface_P);
                                                    return;
                                                }
                                            }
                                        }
                                    } else {
                                        i2 = R.id.ripple_holder;
                                    }
                                }
                            }
                        } else {
                            i2 = R.id.overlay;
                        }
                    }
                } else {
                    i2 = R.id.full_color;
                }
                yhk.s("Missing required view with ID: ".concat(view2.getResources().getResourceName(i2)));
                throw null;
            case 2:
                super(view, view2, str);
                ShapeableImageView shapeableImageView2 = (ShapeableImageView) nq8.B(R.id.full_color, view2);
                if (shapeableImageView2 != null) {
                    FrameLayout frameLayout4 = (FrameLayout) nq8.B(R.id.overlay, view2);
                    if (frameLayout4 != null) {
                        FrameLayout frameLayout5 = (FrameLayout) nq8.B(R.id.ripple_holder, view2);
                        if (frameLayout5 == null) {
                            i3 = R.id.ripple_holder;
                        } else if (((ImageView) nq8.B(R.id.sofa_rating_image, view2)) != null) {
                            ImageView imageView2 = (ImageView) nq8.B(R.id.tournament_image, view2);
                            if (imageView2 != null) {
                                this.i = new e92((ViewGroup) view2, (Object) shapeableImageView2, (Object) frameLayout4, (Object) frameLayout5, (Object) imageView2, 0);
                                this.h = this.b.getColor(R.color.surface_P);
                                return;
                            }
                        } else {
                            i3 = R.id.sofa_rating_image;
                        }
                    } else {
                        i3 = R.id.overlay;
                    }
                } else {
                    i3 = R.id.full_color;
                }
                yhk.s("Missing required view with ID: ".concat(view2.getResources().getResourceName(i3)));
                throw null;
            case 3:
                super(view, view2, str);
                ShapeableImageView shapeableImageView3 = (ShapeableImageView) nq8.B(R.id.full_color, view2);
                if (shapeableImageView3 != null) {
                    FrameLayout frameLayout6 = (FrameLayout) nq8.B(R.id.overlay, view2);
                    if (frameLayout6 != null) {
                        FrameLayout frameLayout7 = (FrameLayout) nq8.B(R.id.ripple_holder, view2);
                        if (frameLayout7 != null) {
                            int i4 = R.id.round_number;
                            TextView textView4 = (TextView) nq8.B(R.id.round_number, view2);
                            if (textView4 != null) {
                                i4 = R.id.terrain;
                                if (((ImageView) nq8.B(R.id.terrain, view2)) != null) {
                                    ImageView imageView3 = (ImageView) nq8.B(R.id.tournament_image, view2);
                                    if (imageView3 != null) {
                                        this.i = new z82((ConstraintLayout) view2, shapeableImageView3, frameLayout6, frameLayout7, textView4, imageView3);
                                        this.h = this.b.getColor(R.color.surface_P);
                                        return;
                                    }
                                }
                            }
                            i3 = i4;
                        } else {
                            i3 = R.id.ripple_holder;
                        }
                    } else {
                        i3 = R.id.overlay;
                    }
                } else {
                    i3 = R.id.full_color;
                }
                yhk.s("Missing required view with ID: ".concat(view2.getResources().getResourceName(i3)));
                throw null;
            default:
                TextView textView5 = (TextView) nq8.B(R.id.detail_stats_text, view2);
                if (textView5 != null) {
                    ShapeableImageView shapeableImageView4 = (ShapeableImageView) nq8.B(R.id.full_color, view2);
                    if (shapeableImageView4 != null) {
                        FrameLayout frameLayout8 = (FrameLayout) nq8.B(R.id.gradient, view2);
                        if (frameLayout8 != null) {
                            FrameLayout frameLayout9 = (FrameLayout) nq8.B(R.id.overlay, view2);
                            if (frameLayout9 != null) {
                                FrameLayout frameLayout10 = (FrameLayout) nq8.B(R.id.ripple_holder, view2);
                                if (frameLayout10 != null) {
                                    i2 = R.id.statsGraph;
                                    if (((ShapeableImageView) nq8.B(R.id.statsGraph, view2)) != null) {
                                        ImageView imageView4 = (ImageView) nq8.B(R.id.tournament_image, view2);
                                        if (imageView4 != null) {
                                            this.i = new v82((ConstraintLayout) view2, textView5, shapeableImageView4, frameLayout8, frameLayout9, frameLayout10, imageView4, 0);
                                            this.h = this.b.getColor(R.color.surface_P);
                                            return;
                                        }
                                        i2 = R.id.tournament_image;
                                    }
                                } else {
                                    i2 = R.id.ripple_holder;
                                }
                            } else {
                                i2 = R.id.overlay;
                            }
                        }
                    } else {
                        i2 = R.id.full_color;
                    }
                } else {
                    i2 = R.id.detail_stats_text;
                }
                yhk.s("Missing required view with ID: ".concat(view2.getResources().getResourceName(i2)));
                throw null;
        }
    }

    @Override // defpackage.v11
    public final void d(Object obj) {
        String s;
        String alpha2;
        List split$default;
        int i = this.g;
        int i2 = this.h;
        Context context = this.b;
        krk krkVar = this.i;
        switch (i) {
            case 0:
                APIBuzzerTile aPIBuzzerTile = (APIBuzzerTile) obj;
                aPIBuzzerTile.getClass();
                v82 v82Var = (v82) krkVar;
                ((ConstraintLayout) v82Var.b).setClipToOutline(true);
                UniqueTournament uniqueTournament = aPIBuzzerTile.getUniqueTournament();
                if (uniqueTournament != null) {
                    as9.q((ImageView) v82Var.d, Integer.valueOf(uniqueTournament.getId()), 0, null);
                    ShapeableImageView shapeableImageView = (ShapeableImageView) v82Var.h;
                    String I = pco.I(0, Integer.valueOf(uniqueTournament.getId()), hkg.b0(context));
                    apf a = ajh.a(shapeableImageView.getContext());
                    ht9 ht9Var = new ht9(shapeableImageView.getContext());
                    ht9Var.c = I;
                    vt9.f(ht9Var, shapeableImageView);
                    awj[] awjVarArr = {new ty1(i2, 25.0f, 1.5f)};
                    sl6 sl6Var = st9.a;
                    st9.b(ht9Var, ph0.X(awjVarArr));
                    a.a(ht9Var.a());
                }
                ((FrameLayout) v82Var.g).setOnClickListener(new cn(26, this, aPIBuzzerTile));
                break;
            case 1:
                APIBuzzerTile aPIBuzzerTile2 = (APIBuzzerTile) obj;
                aPIBuzzerTile2.getClass();
                bu1 bu1Var = (bu1) krkVar;
                ConstraintLayout constraintLayout = (ConstraintLayout) bu1Var.b;
                ShapeableImageView shapeableImageView2 = (ShapeableImageView) bu1Var.h;
                ImageView imageView = (ImageView) bu1Var.d;
                constraintLayout.setClipToOutline(true);
                Player player = aPIBuzzerTile2.getPlayer();
                if (player != null) {
                    as9.l(imageView, player.getId(), null);
                    String actionValue = aPIBuzzerTile2.getActionValue();
                    if (actionValue != null) {
                        split$default = StringsKt__StringsKt.split$default(actionValue, new String[]{"-"}, false, 0, 6, null);
                        if (split$default.size() == 3) {
                            String R = pco.R(Integer.parseInt((String) CollectionsKt.h0(split$default)));
                            apf a2 = ajh.a(shapeableImageView2.getContext());
                            ht9 ht9Var2 = new ht9(shapeableImageView2.getContext());
                            ht9Var2.c = R;
                            vt9.f(ht9Var2, shapeableImageView2);
                            st9.b(ht9Var2, ph0.X(new awj[]{new ty1(i2, 25.0f, 1.5f)}));
                            a2.a(ht9Var2.a());
                        }
                    }
                }
                Team team = aPIBuzzerTile2.getTeam();
                if (team != null) {
                    as9.o(imageView, team.getId());
                    Country country = team.getCountry();
                    if (country != null && (alpha2 = country.getAlpha2()) != null) {
                        String n = fc6.n((Intrinsics.c(uaa.c, "api.sofascore.com/") ? "https://img.sofascore.com/" : dmi.q("https://", uaa.c)).concat("api/v1/"), "country/", alpha2, "/flag");
                        apf a3 = ajh.a(shapeableImageView2.getContext());
                        ht9 ht9Var3 = new ht9(shapeableImageView2.getContext());
                        ht9Var3.c = n;
                        vt9.f(ht9Var3, shapeableImageView2);
                        awj[] awjVarArr2 = {new ty1(i2, 25.0f, 1.5f)};
                        sl6 sl6Var2 = st9.a;
                        st9.b(ht9Var3, ph0.X(awjVarArr2));
                        a3.a(ht9Var3.a());
                    }
                }
                InterestingStatisticsItem interestingStatistic = aPIBuzzerTile2.getInterestingStatistic();
                if (interestingStatistic != null) {
                    TextView textView = (TextView) bu1Var.g;
                    Event event = aPIBuzzerTile2.getEvent();
                    textView.setText((event == null || (s = ok3.s(event)) == null) ? interestingStatistic.getName() : yaa.D(context, interestingStatistic.getName(), s));
                    ((TextView) bu1Var.k).setText(((int) (interestingStatistic.getValue() * 10.0d)) % 10 == 0 ? String.valueOf((int) interestingStatistic.getValue()) : String.valueOf(interestingStatistic.getValue()));
                }
                ((FrameLayout) bu1Var.j).setOnClickListener(new au7(11, this, aPIBuzzerTile2));
                break;
            case 2:
                APIBuzzerTile aPIBuzzerTile3 = (APIBuzzerTile) obj;
                aPIBuzzerTile3.getClass();
                e92 e92Var = (e92) krkVar;
                ((ConstraintLayout) e92Var.e).setClipToOutline(true);
                UniqueTournament uniqueTournament2 = aPIBuzzerTile3.getUniqueTournament();
                if (uniqueTournament2 != null) {
                    as9.q((ImageView) e92Var.c, Integer.valueOf(uniqueTournament2.getId()), 0, null);
                    ShapeableImageView shapeableImageView3 = (ShapeableImageView) e92Var.d;
                    String I2 = pco.I(0, Integer.valueOf(uniqueTournament2.getId()), hkg.b0(context));
                    apf a4 = ajh.a(shapeableImageView3.getContext());
                    ht9 ht9Var4 = new ht9(shapeableImageView3.getContext());
                    ht9Var4.c = I2;
                    vt9.f(ht9Var4, shapeableImageView3);
                    awj[] awjVarArr3 = {new ty1(i2, 25.0f, 1.5f)};
                    sl6 sl6Var3 = st9.a;
                    st9.b(ht9Var4, ph0.X(awjVarArr3));
                    a4.a(ht9Var4.a());
                }
                ((FrameLayout) e92Var.f).setOnClickListener(new eyd(19, this, aPIBuzzerTile3));
                break;
            default:
                APIBuzzerTile aPIBuzzerTile4 = (APIBuzzerTile) obj;
                aPIBuzzerTile4.getClass();
                z82 z82Var = (z82) krkVar;
                ((ConstraintLayout) z82Var.b).setClipToOutline(true);
                UniqueTournament uniqueTournament3 = aPIBuzzerTile4.getUniqueTournament();
                if (uniqueTournament3 != null) {
                    as9.q((ImageView) z82Var.e, Integer.valueOf(uniqueTournament3.getId()), 0, null);
                    ShapeableImageView shapeableImageView4 = (ShapeableImageView) z82Var.f;
                    String I3 = pco.I(0, Integer.valueOf(uniqueTournament3.getId()), hkg.b0(context));
                    apf a5 = ajh.a(shapeableImageView4.getContext());
                    ht9 ht9Var5 = new ht9(shapeableImageView4.getContext());
                    ht9Var5.c = I3;
                    vt9.f(ht9Var5, shapeableImageView4);
                    awj[] awjVarArr4 = {new ty1(i2, 25.0f, 1.5f)};
                    sl6 sl6Var4 = st9.a;
                    st9.b(ht9Var5, ph0.X(awjVarArr4));
                    a5.a(ht9Var5.a());
                }
                String text = aPIBuzzerTile4.getText();
                if (text != null) {
                    ((TextView) z82Var.d).setText(text);
                }
                ((FrameLayout) z82Var.g).setOnClickListener(new eyd(25, this, aPIBuzzerTile4));
                break;
        }
    }

    @Override // defpackage.v11
    public final void e(Object obj) {
        int i = this.g;
        krk krkVar = this.i;
        Context context = this.b;
        switch (i) {
            case 0:
                ((APIBuzzerTile) obj).getClass();
                int s = ao2.s(12, context);
                int s2 = ao2.s(14, context);
                int s3 = ao2.s(56, context);
                v82 v82Var = (v82) krkVar;
                ViewGroup.LayoutParams layoutParams = ((ImageView) v82Var.d).getLayoutParams();
                layoutParams.getClass();
                tl3 tl3Var = (tl3) layoutParams;
                ((ViewGroup.MarginLayoutParams) tl3Var).width = s3;
                ((ViewGroup.MarginLayoutParams) tl3Var).height = s3;
                ((ViewGroup.MarginLayoutParams) tl3Var).topMargin = s;
                tl3Var.setMarginStart(s);
                TextView textView = (TextView) v82Var.e;
                ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
                layoutParams2.getClass();
                ((tl3) layoutParams2).setMargins(s2, s2, s2, s2);
                textView.setTextSize(2, 14.0f);
                break;
            case 1:
                APIBuzzerTile aPIBuzzerTile = (APIBuzzerTile) obj;
                aPIBuzzerTile.getClass();
                int s4 = ao2.s(12, context);
                int s5 = ao2.s(56, context);
                bu1 bu1Var = (bu1) krkVar;
                ViewGroup.LayoutParams layoutParams3 = ((ImageView) bu1Var.d).getLayoutParams();
                layoutParams3.getClass();
                tl3 tl3Var2 = (tl3) layoutParams3;
                ((ViewGroup.MarginLayoutParams) tl3Var2).width = s5;
                ((ViewGroup.MarginLayoutParams) tl3Var2).height = s5;
                tl3Var2.setMarginStart(s4);
                int s6 = ao2.s(28, context);
                ViewGroup.LayoutParams layoutParams4 = ((View) bu1Var.f).getLayoutParams();
                layoutParams4.getClass();
                ((tl3) layoutParams4).setMarginStart(s6);
                TextView textView2 = (TextView) bu1Var.k;
                ViewGroup.LayoutParams layoutParams5 = textView2.getLayoutParams();
                layoutParams5.getClass();
                ((tl3) layoutParams5).setMarginEnd(s4);
                textView2.setTextSize(2, 28.0f);
                TextView textView3 = (TextView) bu1Var.e;
                ViewGroup.LayoutParams layoutParams6 = textView3.getLayoutParams();
                layoutParams6.getClass();
                ((tl3) layoutParams6).setMargins(s4, s4, s4, s4);
                textView3.setTextSize(2, 14.0f);
                Player player = aPIBuzzerTile.getPlayer();
                if (player != null) {
                    textView3.setText(tba.t(player));
                }
                Team team = aPIBuzzerTile.getTeam();
                if (team != null) {
                    textView3.setText(tba.p(context, team));
                    break;
                }
                break;
            case 2:
                ((APIBuzzerTile) obj).getClass();
                int s7 = ao2.s(12, context);
                int s8 = ao2.s(56, context);
                ViewGroup.LayoutParams layoutParams7 = ((ImageView) ((e92) krkVar).c).getLayoutParams();
                layoutParams7.getClass();
                tl3 tl3Var3 = (tl3) layoutParams7;
                ((ViewGroup.MarginLayoutParams) tl3Var3).width = s8;
                ((ViewGroup.MarginLayoutParams) tl3Var3).height = s8;
                ((ViewGroup.MarginLayoutParams) tl3Var3).topMargin = s7;
                tl3Var3.setMarginStart(s7);
                break;
            default:
                ((APIBuzzerTile) obj).getClass();
                int s9 = ao2.s(12, context);
                int s10 = ao2.s(14, context);
                int s11 = ao2.s(56, context);
                z82 z82Var = (z82) krkVar;
                ViewGroup.LayoutParams layoutParams8 = ((ImageView) z82Var.e).getLayoutParams();
                layoutParams8.getClass();
                tl3 tl3Var4 = (tl3) layoutParams8;
                ((ViewGroup.MarginLayoutParams) tl3Var4).width = s11;
                ((ViewGroup.MarginLayoutParams) tl3Var4).height = s11;
                ((ViewGroup.MarginLayoutParams) tl3Var4).topMargin = s9;
                tl3Var4.setMarginStart(s9);
                TextView textView4 = (TextView) z82Var.d;
                ViewGroup.LayoutParams layoutParams9 = textView4.getLayoutParams();
                layoutParams9.getClass();
                ((tl3) layoutParams9).setMargins(s10, s10, s10, s10);
                textView4.setTextSize(2, 14.0f);
                break;
        }
    }

    @Override // defpackage.v11
    public final void f(Object obj) {
        switch (this.g) {
            case 0:
                ((APIBuzzerTile) obj).getClass();
                break;
            case 1:
                APIBuzzerTile aPIBuzzerTile = (APIBuzzerTile) obj;
                TextView textView = (TextView) ((bu1) this.i).e;
                aPIBuzzerTile.getClass();
                Player player = aPIBuzzerTile.getPlayer();
                if (player != null) {
                    String C = tba.C(player);
                    if (C == null) {
                        C = tba.t(player);
                    }
                    textView.setText(C);
                }
                Team team = aPIBuzzerTile.getTeam();
                if (team != null) {
                    textView.setText(tba.A(this.b, team));
                    break;
                }
                break;
            case 2:
                ((APIBuzzerTile) obj).getClass();
                break;
            default:
                ((APIBuzzerTile) obj).getClass();
                break;
        }
    }

    @Override // defpackage.v11
    public final void g(Context context, Object obj) {
        UniqueTournament uniqueTournament;
        String actionValue;
        List split$default;
        UniqueTournament uniqueTournament2;
        UniqueTournament uniqueTournament3;
        switch (this.g) {
            case 0:
                APIBuzzerTile aPIBuzzerTile = (APIBuzzerTile) obj;
                context.getClass();
                aPIBuzzerTile.getClass();
                int action = aPIBuzzerTile.getAction();
                j82[] j82VarArr = j82.a;
                if (action == 19 && (uniqueTournament = aPIBuzzerTile.getUniqueTournament()) != null) {
                    a99.A(LeagueActivity.h0, context, Integer.valueOf(uniqueTournament.getId()), 0, null, y4b.g, null, null, 4056);
                    break;
                }
                break;
            case 1:
                APIBuzzerTile aPIBuzzerTile2 = (APIBuzzerTile) obj;
                context.getClass();
                aPIBuzzerTile2.getClass();
                int action2 = aPIBuzzerTile2.getAction();
                j82[] j82VarArr2 = j82.a;
                if (action2 != 5) {
                    if (action2 != 16) {
                        if (action2 == 17 && (actionValue = aPIBuzzerTile2.getActionValue()) != null) {
                            split$default = StringsKt__StringsKt.split$default(actionValue, new String[]{"-"}, false, 0, 6, null);
                            if (split$default.size() == 3) {
                                int parseInt = Integer.parseInt((String) split$default.get(0));
                                int parseInt2 = Integer.parseInt((String) split$default.get(1));
                                int parseInt3 = Integer.parseInt((String) split$default.get(2));
                                wxf wxfVar = EventActivity.h0;
                                wxf.B(context, parseInt, null, Integer.valueOf(parseInt2), Integer.valueOf(parseInt3), null, 76);
                                break;
                            }
                        }
                    } else {
                        Event event = aPIBuzzerTile2.getEvent();
                        if (event != null) {
                            wxf wxfVar2 = EventActivity.h0;
                            wxf.B(context, event.getId(), rd6.n, null, null, null, 120);
                            break;
                        }
                    }
                } else {
                    String actionValue2 = aPIBuzzerTile2.getActionValue();
                    if (actionValue2 != null) {
                        wxf wxfVar3 = EventActivity.h0;
                        wxf.B(context, Integer.parseInt(actionValue2), null, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                        break;
                    }
                }
                break;
            case 2:
                APIBuzzerTile aPIBuzzerTile3 = (APIBuzzerTile) obj;
                context.getClass();
                aPIBuzzerTile3.getClass();
                int action3 = aPIBuzzerTile3.getAction();
                j82[] j82VarArr3 = j82.a;
                if (action3 == 8 && (uniqueTournament2 = aPIBuzzerTile3.getUniqueTournament()) != null) {
                    a99.A(LeagueActivity.h0, context, Integer.valueOf(uniqueTournament2.getId()), 0, null, null, null, null, 4088);
                    break;
                }
                break;
            default:
                APIBuzzerTile aPIBuzzerTile4 = (APIBuzzerTile) obj;
                context.getClass();
                aPIBuzzerTile4.getClass();
                int action4 = aPIBuzzerTile4.getAction();
                j82[] j82VarArr4 = j82.a;
                if (action4 == 8 && (uniqueTournament3 = aPIBuzzerTile4.getUniqueTournament()) != null) {
                    a99.A(LeagueActivity.h0, context, Integer.valueOf(uniqueTournament3.getId()), 0, null, null, null, null, 3576);
                    break;
                }
                break;
        }
    }
}
