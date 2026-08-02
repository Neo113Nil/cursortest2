package com.sofascore.results.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.e;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.appsflyer.internal.i;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.BasketballEvent;
import com.sofascore.model.mvvm.model.Category;
import com.sofascore.model.mvvm.model.Country;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Round;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.model.mvvm.model.StatusTime;
import com.sofascore.model.mvvm.model.SubTeam;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.TennisEvent;
import com.sofascore.model.mvvm.model.Time;
import com.sofascore.model.mvvm.model.Tournament;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.results.R;
import defpackage.aba;
import defpackage.ald;
import defpackage.ao2;
import defpackage.as9;
import defpackage.au7;
import defpackage.av8;
import defpackage.bi4;
import defpackage.bu7;
import defpackage.d7g;
import defpackage.dla;
import defpackage.dmi;
import defpackage.e1d;
import defpackage.eoh;
import defpackage.f6a;
import defpackage.fc6;
import defpackage.hk4;
import defpackage.ke0;
import defpackage.km5;
import defpackage.ku7;
import defpackage.l4a;
import defpackage.m81;
import defpackage.mm3;
import defpackage.nq8;
import defpackage.o3a;
import defpackage.o8;
import defpackage.of3;
import defpackage.ok3;
import defpackage.oyn;
import defpackage.pd0;
import defpackage.ph0;
import defpackage.pn2;
import defpackage.qea;
import defpackage.qh;
import defpackage.rik;
import defpackage.rld;
import defpackage.t62;
import defpackage.tba;
import defpackage.tc3;
import defpackage.tl3;
import defpackage.uaa;
import defpackage.ug5;
import defpackage.vmd;
import defpackage.vxd;
import defpackage.xe6;
import defpackage.xmd;
import defpackage.yaa;
import defpackage.yhk;
import defpackage.yt7;
import defpackage.z8e;
import defpackage.zt7;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Collection;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000eJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0003\u0010\u0004R/\u0010\r\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00058B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/sofascore/results/view/FeaturedMatchView;", "Lo8;", "", "getLayoutId", "()I", "Lxmd;", "<set-?>", InneractiveMediationDefs.GENDER_MALE, "Le1d;", "getOddsState", "()Lxmd;", "setOddsState", "(Lxmd;)V", "oddsState", "bu7", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FeaturedMatchView extends o8 {
    public static final /* synthetic */ int o = 0;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final yt7 k;
    public vmd l;

    /* renamed from: m, reason: from kotlin metadata */
    public final e1d oddsState;
    public boolean n;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FeaturedMatchView(Context context, AttributeSet attributeSet, int i) {
        super(context, r2, 0);
        AttributeSet attributeSet2 = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        this.d = context.getColor(R.color.n_lv_1);
        this.e = context.getColor(R.color.n_lv_3);
        this.f = context.getColor(R.color.live);
        this.g = ao2.s(20, context);
        this.h = ao2.s(28, context);
        this.i = ao2.s(40, context);
        this.j = ao2.s(48, context);
        View root = getRoot();
        int i2 = R.id.additional_text;
        TextView textView = (TextView) nq8.B(R.id.additional_text, root);
        if (textView != null) {
            i2 = R.id.away_logo_barrier;
            if (((Barrier) nq8.B(R.id.away_logo_barrier, root)) != null) {
                i2 = R.id.away_team_flag_1;
                ImageView imageView = (ImageView) nq8.B(R.id.away_team_flag_1, root);
                if (imageView != null) {
                    i2 = R.id.away_team_flag_2;
                    ImageView imageView2 = (ImageView) nq8.B(R.id.away_team_flag_2, root);
                    if (imageView2 != null) {
                        i2 = R.id.away_team_logo_1;
                        ImageView imageView3 = (ImageView) nq8.B(R.id.away_team_logo_1, root);
                        if (imageView3 != null) {
                            i2 = R.id.away_team_logo_2;
                            ImageView imageView4 = (ImageView) nq8.B(R.id.away_team_logo_2, root);
                            if (imageView4 != null) {
                                i2 = R.id.away_team_name_1;
                                TextView textView2 = (TextView) nq8.B(R.id.away_team_name_1, root);
                                if (textView2 != null) {
                                    i2 = R.id.away_team_name_2;
                                    TextView textView3 = (TextView) nq8.B(R.id.away_team_name_2, root);
                                    if (textView3 != null) {
                                        i2 = R.id.away_team_name_container;
                                        if (((LinearLayout) nq8.B(R.id.away_team_name_container, root)) != null) {
                                            i2 = R.id.away_team_seed;
                                            TextView textView4 = (TextView) nq8.B(R.id.away_team_seed, root);
                                            if (textView4 != null) {
                                                i2 = R.id.barrier;
                                                if (((Barrier) nq8.B(R.id.barrier, root)) != null) {
                                                    i2 = R.id.bottom_text;
                                                    TextView textView5 = (TextView) nq8.B(R.id.bottom_text, root);
                                                    if (textView5 != null) {
                                                        i2 = R.id.featured_match_container;
                                                        ConstraintLayout constraintLayout = (ConstraintLayout) nq8.B(R.id.featured_match_container, root);
                                                        if (constraintLayout != null) {
                                                            i2 = R.id.greece_regulations_stub;
                                                            if (((ViewStub) nq8.B(R.id.greece_regulations_stub, root)) != null) {
                                                                i2 = R.id.home_logo_barrier;
                                                                if (((Barrier) nq8.B(R.id.home_logo_barrier, root)) != null) {
                                                                    i2 = R.id.home_team_flag_1;
                                                                    ImageView imageView5 = (ImageView) nq8.B(R.id.home_team_flag_1, root);
                                                                    if (imageView5 != null) {
                                                                        i2 = R.id.home_team_flag_2;
                                                                        ImageView imageView6 = (ImageView) nq8.B(R.id.home_team_flag_2, root);
                                                                        if (imageView6 != null) {
                                                                            i2 = R.id.home_team_logo_1;
                                                                            ImageView imageView7 = (ImageView) nq8.B(R.id.home_team_logo_1, root);
                                                                            if (imageView7 != null) {
                                                                                i2 = R.id.home_team_logo_2;
                                                                                ImageView imageView8 = (ImageView) nq8.B(R.id.home_team_logo_2, root);
                                                                                if (imageView8 != null) {
                                                                                    i2 = R.id.home_team_name_1;
                                                                                    TextView textView6 = (TextView) nq8.B(R.id.home_team_name_1, root);
                                                                                    if (textView6 != null) {
                                                                                        i2 = R.id.home_team_name_2;
                                                                                        TextView textView7 = (TextView) nq8.B(R.id.home_team_name_2, root);
                                                                                        if (textView7 != null) {
                                                                                            i2 = R.id.home_team_name_container;
                                                                                            if (((LinearLayout) nq8.B(R.id.home_team_name_container, root)) != null) {
                                                                                                i2 = R.id.home_team_seed;
                                                                                                TextView textView8 = (TextView) nq8.B(R.id.home_team_seed, root);
                                                                                                if (textView8 != null) {
                                                                                                    i2 = R.id.league_details_row;
                                                                                                    View B = nq8.B(R.id.league_details_row, root);
                                                                                                    if (B != null) {
                                                                                                        pn2 a = pn2.a(B);
                                                                                                        i2 = R.id.main_text;
                                                                                                        TextView textView9 = (TextView) nq8.B(R.id.main_text, root);
                                                                                                        if (textView9 != null) {
                                                                                                            i2 = R.id.odds_container;
                                                                                                            ComposeView composeView = (ComposeView) nq8.B(R.id.odds_container, root);
                                                                                                            if (composeView != null) {
                                                                                                                i2 = R.id.primary_score_away;
                                                                                                                TextView textView10 = (TextView) nq8.B(R.id.primary_score_away, root);
                                                                                                                if (textView10 != null) {
                                                                                                                    i2 = R.id.primary_score_home;
                                                                                                                    TextView textView11 = (TextView) nq8.B(R.id.primary_score_home, root);
                                                                                                                    if (textView11 != null) {
                                                                                                                        i2 = R.id.primary_score_slash;
                                                                                                                        TextView textView12 = (TextView) nq8.B(R.id.primary_score_slash, root);
                                                                                                                        if (textView12 != null) {
                                                                                                                            i2 = R.id.regulations_container;
                                                                                                                            ComposeView composeView2 = (ComposeView) nq8.B(R.id.regulations_container, root);
                                                                                                                            if (composeView2 != null) {
                                                                                                                                i2 = R.id.title;
                                                                                                                                TextView textView13 = (TextView) nq8.B(R.id.title, root);
                                                                                                                                if (textView13 != null) {
                                                                                                                                    this.k = new yt7((LinearLayout) root, textView, imageView, imageView2, imageView3, imageView4, textView2, textView3, textView4, textView5, constraintLayout, imageView5, imageView6, imageView7, imageView8, textView6, textView7, textView8, a, textView9, composeView, textView10, textView11, textView12, composeView2, textView13);
                                                                                                                                    this.oddsState = e.f(null);
                                                                                                                                    aba.y(constraintLayout, 0, 3);
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
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i2)));
        throw null;
    }

    private final xmd getOddsState() {
        return (xmd) ((eoh) this.oddsState).getValue();
    }

    public static final Unit l(int i, FeaturedMatchView featuredMatchView, vmd vmdVar, Boolean bool, of3 of3Var, int i2) {
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(i2 & 1, (i2 & 3) != 2)) {
            ku7.a(i, featuredMatchView.getOddsState(), vmdVar, Intrinsics.c(bool, Boolean.FALSE), av8Var, 0);
        } else {
            av8Var.W();
        }
        return Unit.a;
    }

    private final void setOddsState(xmd xmdVar) {
        ((eoh) this.oddsState).setValue(xmdVar);
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.featured_match_layout;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x05c3, code lost:
    
        if (r1.equals(com.sofascore.model.mvvm.model.StatusKt.STATUS_WILL_CONTINUE) == false) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x05cd, code lost:
    
        r1 = java.lang.Integer.valueOf(r1);
        r2 = com.sofascore.model.mvvm.model.Event.getWinnerCode$default(r4, null, 1, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x05d7, code lost:
    
        if (r2 != null) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x05de, code lost:
    
        if (r2.intValue() != 1) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x05e2, code lost:
    
        if (r1 == null) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x05e4, code lost:
    
        r1 = r1.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x05ea, code lost:
    
        r12.setTextColor(r1);
        r1 = java.lang.Integer.valueOf(r1);
        r2 = null;
        r3 = com.sofascore.model.mvvm.model.Event.getWinnerCode$default(r4, null, 1, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x05f6, code lost:
    
        if (r3 != null) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x05fe, code lost:
    
        if (r3.intValue() != 2) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x0602, code lost:
    
        if (r1 == null) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x0604, code lost:
    
        r1 = r1.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x060a, code lost:
    
        r13.setTextColor(r1);
        r10.setTextColor(r14);
        r11.setVisibility(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x0609, code lost:
    
        r1 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x0601, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x05e9, code lost:
    
        r1 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x05e1, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x05ca, code lost:
    
        if (r1.equals(com.sofascore.model.mvvm.model.StatusKt.STATUS_FINISHED) == false) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x0632, code lost:
    
        if (r1.equals(com.sofascore.model.mvvm.model.StatusKt.STATUS_SUSPENDED) == false) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x07a8, code lost:
    
        r12.setTextColor(r14);
        r13.setTextColor(r14);
        r10.setTextColor(r14);
        r11.setTextColor(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x063a, code lost:
    
        if (r1.equals(com.sofascore.model.mvvm.model.StatusKt.STATUS_INTERRUPTED) == false) goto L190;
     */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0656  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0694  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(bu7 bu7Var, boolean z, vmd vmdVar, boolean z2, Boolean bool, Boolean bool2) {
        ComposeView composeView;
        TextView textView;
        TextView textView2;
        TextView textView3;
        TextView textView4;
        ConstraintLayout constraintLayout;
        String str;
        yt7 yt7Var;
        TextView textView5;
        TextView textView6;
        TextView textView7;
        TextView textView8;
        ConstraintLayout constraintLayout2;
        String str2;
        Collection collection;
        boolean z3;
        ald h;
        String i;
        String j;
        String format;
        ImageView imageView;
        ImageView imageView2;
        ImageView imageView3;
        ConstraintLayout constraintLayout3;
        boolean z4;
        ImageView imageView4;
        ImageView imageView5;
        ImageView imageView6;
        ImageView imageView7;
        Integer F;
        Country country;
        Country country2;
        Country country3;
        Country country4;
        Tournament tournament;
        String y;
        bu7Var.getClass();
        yt7 yt7Var2 = this.k;
        TextView textView9 = (TextView) yt7Var2.w;
        ComposeView composeView2 = yt7Var2.n;
        TextView textView10 = (TextView) yt7Var2.t;
        TextView textView11 = yt7Var2.u;
        TextView textView12 = yt7Var2.v;
        TextView textView13 = (TextView) yt7Var2.s;
        ConstraintLayout constraintLayout4 = yt7Var2.e;
        pn2 pn2Var = (pn2) yt7Var2.A;
        textView9.setVisibility(z ? 0 : 8);
        pn2Var.b.setVisibility(!z ? 0 : 8);
        Event event = bu7Var.a;
        if (this.n) {
            composeView = composeView2;
            textView = textView10;
            textView2 = textView11;
            textView3 = textView12;
            textView4 = textView13;
            constraintLayout = constraintLayout4;
            str = ", ";
            yt7Var = yt7Var2;
        } else {
            this.n = true;
            Tournament tournament2 = event.getTournament();
            Category category = event.getTournament().getCategory();
            Round roundInfo = event.getRoundInfo();
            ImageView imageView8 = yt7Var2.f;
            composeView = composeView2;
            ImageView imageView9 = yt7Var2.z;
            ImageView imageView10 = yt7Var2.k;
            TextView textView14 = yt7Var2.h;
            textView = textView10;
            TextView textView15 = (TextView) yt7Var2.q;
            textView2 = textView11;
            ImageView imageView11 = (ImageView) yt7Var2.y;
            textView3 = textView12;
            ImageView imageView12 = yt7Var2.j;
            textView4 = textView13;
            TextView textView16 = (TextView) yt7Var2.p;
            TextView textView17 = yt7Var2.d;
            constraintLayout4.setClipToOutline(true);
            LinearLayout linearLayout = pn2Var.b;
            TextView textView18 = pn2Var.e;
            if (linearLayout.getVisibility() == 0) {
                imageView = imageView9;
                textView18.setMaxLines(1);
                textView18.setEllipsize(TextUtils.TruncateAt.END);
                imageView3 = imageView12;
                if (Intrinsics.c(ok3.s(event), Sports.DARTS)) {
                    Context context = getContext();
                    context.getClass();
                    y = ok3.t(context, event);
                    imageView2 = imageView11;
                    constraintLayout3 = constraintLayout4;
                    tournament = tournament2;
                } else if (t62.J(category)) {
                    imageView2 = imageView11;
                    constraintLayout3 = constraintLayout4;
                    tournament = tournament2;
                    String w = tba.w(tournament);
                    Regex regex = d7g.a;
                    Context context2 = getContext();
                    context2.getClass();
                    y = dmi.y(w, d7g.b(context2, roundInfo, true, category.getSport().getSlug()));
                } else {
                    Context context3 = getContext();
                    context3.getClass();
                    String u = o3a.u(context3, tournament2);
                    String w2 = tba.w(tournament2);
                    Regex regex2 = d7g.a;
                    tournament = tournament2;
                    Context context4 = getContext();
                    context4.getClass();
                    imageView2 = imageView11;
                    constraintLayout3 = constraintLayout4;
                    y = fc6.n(u, ", ", w2, d7g.b(context4, roundInfo, true, category.getSport().getSlug()));
                }
                textView18.setText(y);
                ImageView imageView13 = pn2Var.d;
                UniqueTournament uniqueTournament = tournament.getUniqueTournament();
                as9.q(imageView13, Integer.valueOf(uniqueTournament != null ? uniqueTournament.getId() : 0), tournament.getId(), null);
                pn2Var.c.setVisibility(0);
                linearLayout.setClickable(true);
                linearLayout.setOnClickListener(new au7(0, event, this));
                aba.y(linearLayout, 0, 3);
            } else {
                imageView = imageView9;
                imageView2 = imageView11;
                imageView3 = imageView12;
                constraintLayout3 = constraintLayout4;
            }
            String slug = event.getTournament().getCategory().getSport().getSlug();
            boolean z5 = Event.getHomeTeam$default(event, null, 1, null).hasSubTeams() && Event.getAwayTeam$default(event, null, 1, null).hasSubTeams();
            Team homeTeam$default = Event.getHomeTeam$default(event, null, 1, null);
            Team awayTeam$default = Event.getAwayTeam$default(event, null, 1, null);
            boolean z6 = Intrinsics.c(slug, Sports.TENNIS) && z5;
            boolean shouldReverseTeams = event.shouldReverseTeams();
            if (z6) {
                textView15.setVisibility(0);
                textView14.setVisibility(0);
                SubTeam subTeam1 = homeTeam$default.getSubTeam1();
                Context context5 = getContext();
                context5.getClass();
                textView16.setText(tba.D(subTeam1, context5));
                textView16.setMaxLines(1);
                SubTeam subTeam2 = homeTeam$default.getSubTeam2();
                Context context6 = getContext();
                context6.getClass();
                textView15.setText(tba.D(subTeam2, context6));
                SubTeam subTeam12 = awayTeam$default.getSubTeam1();
                Context context7 = getContext();
                context7.getClass();
                textView17.setText(tba.D(subTeam12, context7));
                textView17.setMaxLines(1);
                SubTeam subTeam22 = awayTeam$default.getSubTeam2();
                Context context8 = getContext();
                context8.getClass();
                textView14.setText(tba.D(subTeam22, context8));
            } else {
                textView16.setMaxLines(2);
                Context context9 = textView16.getContext();
                context9.getClass();
                textView16.setText(tba.A(context9, homeTeam$default));
                textView17.setMaxLines(2);
                Context context10 = textView17.getContext();
                context10.getClass();
                textView17.setText(qea.K(tba.A(context10, awayTeam$default), shouldReverseTeams));
            }
            Team homeTeam$default2 = Event.getHomeTeam$default(event, null, 1, null);
            Team awayTeam$default2 = Event.getAwayTeam$default(event, null, 1, null);
            boolean z7 = Intrinsics.c(slug, Sports.TENNIS) && z5;
            SubTeam subTeam13 = homeTeam$default2.getSubTeam1();
            SubTeam subTeam23 = homeTeam$default2.getSubTeam2();
            SubTeam subTeam14 = awayTeam$default2.getSubTeam1();
            SubTeam subTeam24 = awayTeam$default2.getSubTeam2();
            if (!z7 || subTeam13 == null || subTeam23 == null || subTeam14 == null || subTeam24 == null) {
                z4 = z5;
                imageView4 = imageView10;
                imageView5 = imageView;
                imageView6 = imageView3;
                constraintLayout = constraintLayout3;
                str = ", ";
                imageView7 = imageView2;
                ViewGroup.LayoutParams layoutParams = imageView7.getLayoutParams();
                int i2 = this.j;
                layoutParams.width = i2;
                layoutParams.height = i2;
                imageView7.setLayoutParams(layoutParams);
                ViewGroup.LayoutParams layoutParams2 = imageView6.getLayoutParams();
                layoutParams2.width = i2;
                layoutParams2.height = i2;
                imageView6.setLayoutParams(layoutParams2);
                as9.o(imageView7, homeTeam$default2.getId());
                as9.o(imageView6, awayTeam$default2.getId());
            } else {
                mm3 mm3Var = new mm3();
                ConstraintLayout constraintLayout5 = constraintLayout3;
                mm3Var.e(constraintLayout5);
                int i3 = this.h;
                z4 = z5;
                mm3Var.r(R.id.home_team_logo_1, 6, i3);
                str = ", ";
                mm3Var.r(R.id.home_team_logo_1, 4, this.g);
                mm3Var.r(R.id.away_team_logo_1, 7, i3);
                mm3Var.a(constraintLayout5);
                ViewGroup.LayoutParams layoutParams3 = imageView2.getLayoutParams();
                int i4 = this.i;
                layoutParams3.width = i4;
                layoutParams3.height = i4;
                imageView7 = imageView2;
                imageView7.setLayoutParams(layoutParams3);
                ViewGroup.LayoutParams layoutParams4 = imageView3.getLayoutParams();
                layoutParams4.width = i4;
                layoutParams4.height = i4;
                imageView6 = imageView3;
                imageView6.setLayoutParams(layoutParams4);
                imageView5 = imageView;
                imageView5.setVisibility(0);
                imageView4 = imageView10;
                imageView4.setVisibility(0);
                as9.o(imageView7, subTeam13.getId());
                as9.o(imageView5, subTeam23.getId());
                as9.o(imageView6, subTeam24.getId());
                as9.o(imageView4, subTeam14.getId());
                textView15.setVisibility(0);
                textView14.setVisibility(0);
                Context context11 = getContext();
                context11.getClass();
                textView16.setText(tba.D(subTeam13, context11));
                textView16.setMaxLines(1);
                Context context12 = getContext();
                context12.getClass();
                textView15.setText(tba.D(subTeam23, context12));
                Context context13 = getContext();
                context13.getClass();
                textView17.setText(tba.D(subTeam14, context13));
                textView17.setMaxLines(1);
                Context context14 = getContext();
                context14.getClass();
                textView14.setText(tba.D(subTeam24, context14));
                constraintLayout = constraintLayout5;
            }
            if (event instanceof TennisEvent) {
                String homeTeamSeed$default = Event.getHomeTeamSeed$default(event, null, 1, null);
                String awayTeamSeed$default = Event.getAwayTeamSeed$default(event, null, 1, null);
                yt7Var = yt7Var2;
                if (homeTeamSeed$default != null) {
                    TextView textView19 = yt7Var.r;
                    Context context15 = textView19.getContext();
                    context15.getClass();
                    textView19.setBackgroundTintList(ColorStateList.valueOf(uaa.o(context15, homeTeamSeed$default)));
                    textView19.setVisibility(0);
                    Context context16 = textView19.getContext();
                    context16.getClass();
                    textView19.setText(uaa.q(context16, homeTeamSeed$default));
                    if (z4) {
                        ViewGroup.LayoutParams layoutParams5 = textView19.getLayoutParams();
                        if (layoutParams5 == null) {
                            yhk.s("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                            return;
                        }
                        tl3 tl3Var = (tl3) layoutParams5;
                        tl3Var.t = imageView5.getId();
                        tl3Var.v = imageView7.getId();
                        textView19.setLayoutParams(tl3Var);
                    }
                }
                if (awayTeamSeed$default != null) {
                    TextView textView20 = yt7Var.l;
                    Context context17 = textView20.getContext();
                    context17.getClass();
                    textView20.setBackgroundTintList(ColorStateList.valueOf(uaa.o(context17, awayTeamSeed$default)));
                    textView20.setVisibility(0);
                    Context context18 = textView20.getContext();
                    context18.getClass();
                    textView20.setText(uaa.q(context18, awayTeamSeed$default));
                    if (z4) {
                        ViewGroup.LayoutParams layoutParams6 = textView20.getLayoutParams();
                        if (layoutParams6 == null) {
                            yhk.s("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                            return;
                        }
                        tl3 tl3Var2 = (tl3) layoutParams6;
                        tl3Var2.t = imageView4.getId();
                        tl3Var2.v = imageView6.getId();
                        textView20.setLayoutParams(tl3Var2);
                    }
                }
                if (!ok3.G(event)) {
                    Team homeTeam$default3 = Event.getHomeTeam$default(event, null, 1, null);
                    Team awayTeam$default3 = Event.getAwayTeam$default(event, null, 1, null);
                    ImageView imageView14 = yt7Var.m;
                    if (z4) {
                        SubTeam subTeam15 = homeTeam$default3.getSubTeam1();
                        as9.c(imageView14, (subTeam15 == null || (country4 = subTeam15.getCountry()) == null) ? null : country4.getAlpha2(), true, null, 4);
                        SubTeam subTeam25 = awayTeam$default3.getSubTeam2();
                        as9.c(imageView8, (subTeam25 == null || (country3 = subTeam25.getCountry()) == null) ? null : country3.getAlpha2(), true, null, 4);
                        ImageView imageView15 = (ImageView) yt7Var.x;
                        SubTeam subTeam26 = homeTeam$default3.getSubTeam2();
                        as9.c(imageView15, (subTeam26 == null || (country2 = subTeam26.getCountry()) == null) ? null : country2.getAlpha2(), true, null, 4);
                        ImageView imageView16 = yt7Var.g;
                        SubTeam subTeam16 = awayTeam$default3.getSubTeam1();
                        as9.c(imageView16, (subTeam16 == null || (country = subTeam16.getCountry()) == null) ? null : country.getAlpha2(), true, null, 4);
                    } else {
                        Country country5 = homeTeam$default3.getCountry();
                        as9.c(imageView14, country5 != null ? country5.getAlpha2() : null, true, null, 4);
                        Country country6 = awayTeam$default3.getCountry();
                        as9.c(imageView8, country6 != null ? country6.getAlpha2() : null, true, null, 4);
                    }
                }
            } else {
                yt7Var = yt7Var2;
            }
            if ((event instanceof BasketballEvent) && (F = o3a.F(event.getTournament())) != null && F.intValue() == 132) {
                String homeTeamSeed$default2 = Event.getHomeTeamSeed$default(event, null, 1, null);
                if (homeTeamSeed$default2 != null) {
                    textView16.setText(((Object) textView16.getText()) + " (" + homeTeamSeed$default2 + ")");
                }
                String awayTeamSeed$default2 = Event.getAwayTeamSeed$default(event, null, 1, null);
                if (awayTeamSeed$default2 != null) {
                    textView17.setText(((Object) textView17.getText()) + " (" + awayTeamSeed$default2 + ")");
                }
            }
        }
        if (ph0.a0(new String[]{StatusKt.STATUS_FINISHED, StatusKt.STATUS_WILL_CONTINUE, StatusKt.STATUS_IN_PROGRESS, StatusKt.STATUS_SUSPENDED, StatusKt.STATUS_INTERRUPTED}).contains(event.getStatus().getType())) {
            textView8 = textView4;
            textView8.setVisibility(8);
            textView7 = textView3;
            textView7.setVisibility(0);
            textView6 = textView2;
            textView6.setVisibility(0);
            textView5 = textView;
            textView5.setVisibility(0);
        } else {
            textView5 = textView;
            textView6 = textView2;
            textView7 = textView3;
            textView8 = textView4;
        }
        TextView textView21 = yt7Var.o;
        Integer display = Event.getHomeScore$default(event, null, 1, null).getDisplay();
        if (display != null) {
            String valueOf = String.valueOf(display.intValue());
            constraintLayout2 = constraintLayout;
            str2 = valueOf;
        } else {
            constraintLayout2 = constraintLayout;
            str2 = null;
        }
        textView6.setText(str2);
        Integer display2 = Event.getAwayScore$default(event, null, 1, null).getDisplay();
        textView5.setText(display2 != null ? String.valueOf(display2.intValue()) : null);
        textView8.setPaintFlags(textView8.getPaintFlags() & (-17));
        int i5 = this.d;
        textView8.setTextColor(i5);
        int i6 = this.e;
        textView21.setTextColor(i6);
        TextView textView22 = yt7Var.c;
        Context context19 = getContext();
        context19.getClass();
        f6a.g(textView22, oyn.C(context19, event));
        Time time = event.getTime();
        StatusTime statusTime = time != null ? time.getStatusTime() : null;
        if (statusTime != null) {
            l4a.K(textView21, z8e.H(statusTime, xe6.c().b));
        } else {
            Context context20 = getContext();
            context20.getClass();
            textView21.setText(pd0.u(context20, event));
        }
        textView21.setVisibility(0);
        String type = event.getStatus().getType();
        Locale locale = Locale.US;
        String k = i.k(locale, type, locale);
        int hashCode = k.hashCode();
        int i7 = this.f;
        switch (hashCode) {
            case -1947652542:
                collection = null;
                break;
            case -1661628965:
                collection = null;
                break;
            case -1411655086:
                collection = null;
                if (k.equals(StatusKt.STATUS_IN_PROGRESS)) {
                    textView6.setTextColor(i7);
                    textView5.setTextColor(i7);
                    textView7.setTextColor(i7);
                    textView21.setTextColor(i7);
                    break;
                }
                if (!ph0.a0(new String[]{StatusKt.STATUS_CANCELED, StatusKt.STATUS_POSTPONED}).contains(event.getStatus().getType())) {
                    textView8.setVisibility(0);
                    textView7.setVisibility(8);
                    textView6.setVisibility(8);
                    textView5.setVisibility(8);
                    textView8.setPaintFlags(textView8.getPaintFlags() | 16);
                    long startTimestamp = event.getStartTimestamp();
                    bi4 bi4Var = bi4.PATTERN_DMY_SHORT;
                    ConcurrentHashMap concurrentHashMap = hk4.a;
                    String format2 = hk4.a(bi4Var.d()).format(Instant.ofEpochSecond(startTimestamp));
                    format2.getClass();
                    textView8.setText(format2);
                    textView8.setTextColor(i6);
                    textView21.setTextColor(i7);
                    break;
                } else {
                    textView8.setVisibility(0);
                    textView7.setVisibility(8);
                    textView6.setVisibility(8);
                    textView5.setVisibility(8);
                    long startTimestamp2 = event.getStartTimestamp();
                    long j2 = 1000 * startTimestamp2;
                    if ((j2 - System.currentTimeMillis()) / 86400000 < 1) {
                        String str3 = str;
                        if (ug5.u(startTimestamp2)) {
                            Context context21 = getContext();
                            context21.getClass();
                            String bestPattern = hk4.b().getBestPattern(DateFormat.is24HourFormat(context21) ? "Hm" : "hm");
                            bestPattern.getClass();
                            i = fc6.i(startTimestamp2, hk4.a(bestPattern));
                        } else if (ug5.w(startTimestamp2)) {
                            i = getContext().getString(R.string.yesterday);
                        } else if (ug5.v(startTimestamp2)) {
                            i = getContext().getString(R.string.tomorrow);
                        } else {
                            bi4 bi4Var2 = bi4.PATTERN_WEEKDAY_DD_MM;
                            ConcurrentHashMap concurrentHashMap2 = hk4.a;
                            i = fc6.i(startTimestamp2, hk4.a(bi4Var2.d()));
                        }
                        textView8.setText(i);
                        if (ug5.u(startTimestamp2)) {
                            j = getContext().getString(R.string.today);
                        } else {
                            Context context22 = getContext();
                            context22.getClass();
                            j = rik.j(context22, startTimestamp2, bi4.PATTERN_WEEKDAY_DD_MM, str3);
                        }
                        textView21.setText(j);
                        break;
                    } else {
                        int between = (int) ChronoUnit.DAYS.between(vxd.o(Instant.ofEpochMilli(yaa.v())), vxd.o(Instant.ofEpochMilli(j2)));
                        if (between == 1) {
                            format = textView8.getContext().getString(R.string.tomorrow);
                        } else {
                            Locale d = dla.d();
                            String string = textView8.getContext().getString(R.string.in_n_days);
                            string.getClass();
                            format = String.format(d, string, Arrays.copyOf(new Object[]{Integer.valueOf(between)}, 1));
                        }
                        textView8.setText(format);
                        Context context23 = textView21.getContext();
                        context23.getClass();
                        textView21.setText(rik.j(context23, event.getStartTimestamp(), bi4.PATTERN_WEEKDAY_DD_MM, str));
                        break;
                    }
                }
            case -673660814:
                break;
            case 527231609:
                break;
            default:
                collection = null;
                if (!ph0.a0(new String[]{StatusKt.STATUS_CANCELED, StatusKt.STATUS_POSTPONED}).contains(event.getStatus().getType())) {
                }
                break;
        }
        constraintLayout2.setOnClickListener(new qh(18, this, event, bool2));
        setOddsState(bu7Var.b);
        xmd oddsState = getOddsState();
        Collection collection2 = oddsState != null ? oddsState.a : collection;
        if (collection2 == null) {
            collection2 = km5.a;
        }
        boolean isEmpty = collection2.isEmpty();
        int i8 = ke0.c;
        if (this.l == null) {
            this.l = vmdVar;
            z3 = true;
            yt7Var.i.setContent(new tc3(888177473, new zt7(i8, this, vmdVar, bool), true));
        } else {
            z3 = true;
        }
        if (isEmpty || (h = rld.h(i8, z3)) == null) {
            return;
        }
        ComposeView composeView3 = composeView;
        composeView3.setVisibility(0);
        composeView3.setContent(new tc3(-1176040909, new m81(h, z2, 6), z3));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FeaturedMatchView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }
}
