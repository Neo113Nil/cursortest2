package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.text.format.DateFormat;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.appsflyer.internal.i;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.model.mvvm.model.StatusTime;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.Time;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.results.R;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class zch extends o8 {
    public final xt7 d;
    public final int e;
    public final int f;
    public final List g;
    public HashSet h;
    public final Set i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zch(Context context) {
        super(context, null, 0);
        context.getClass();
        View root = getRoot();
        int i = R.id.aggregate_score;
        TextView textView = (TextView) nq8.B(R.id.aggregate_score, root);
        if (textView != null) {
            i = R.id.aggregate_score_barrier;
            if (((Barrier) nq8.B(R.id.aggregate_score_barrier, root)) != null) {
                i = R.id.background_color;
                View B = nq8.B(R.id.background_color, root);
                if (B != null) {
                    i = R.id.bottom_padding;
                    if (((Space) nq8.B(R.id.bottom_padding, root)) != null) {
                        i = R.id.bottom_text_barrier;
                        if (((Barrier) nq8.B(R.id.bottom_text_barrier, root)) != null) {
                            i = R.id.crowdsourcing_text;
                            TextView textView2 = (TextView) nq8.B(R.id.crowdsourcing_text, root);
                            if (textView2 != null) {
                                i = R.id.first_team_logo;
                                ImageView imageView = (ImageView) nq8.B(R.id.first_team_logo, root);
                                if (imageView != null) {
                                    i = R.id.first_team_name;
                                    TextView textView3 = (TextView) nq8.B(R.id.first_team_name, root);
                                    if (textView3 != null) {
                                        i = R.id.first_team_win_indicator;
                                        ImageView imageView2 = (ImageView) nq8.B(R.id.first_team_win_indicator, root);
                                        if (imageView2 != null) {
                                            i = R.id.header_background;
                                            View B2 = nq8.B(R.id.header_background, root);
                                            if (B2 != null) {
                                                i = R.id.live_position_barrier;
                                                if (((Barrier) nq8.B(R.id.live_position_barrier, root)) != null) {
                                                    i = R.id.primary_score_first_team;
                                                    TextView textView4 = (TextView) nq8.B(R.id.primary_score_first_team, root);
                                                    if (textView4 != null) {
                                                        i = R.id.primary_score_second_team;
                                                        TextView textView5 = (TextView) nq8.B(R.id.primary_score_second_team, root);
                                                        if (textView5 != null) {
                                                            i = R.id.primary_score_slash;
                                                            TextView textView6 = (TextView) nq8.B(R.id.primary_score_slash, root);
                                                            if (textView6 != null) {
                                                                i = R.id.second_team_logo;
                                                                ImageView imageView3 = (ImageView) nq8.B(R.id.second_team_logo, root);
                                                                if (imageView3 != null) {
                                                                    i = R.id.second_team_name;
                                                                    TextView textView7 = (TextView) nq8.B(R.id.second_team_name, root);
                                                                    if (textView7 != null) {
                                                                        i = R.id.second_team_win_indicator;
                                                                        ImageView imageView4 = (ImageView) nq8.B(R.id.second_team_win_indicator, root);
                                                                        if (imageView4 != null) {
                                                                            i = R.id.secondary_score_first_team;
                                                                            TextView textView8 = (TextView) nq8.B(R.id.secondary_score_first_team, root);
                                                                            if (textView8 != null) {
                                                                                i = R.id.secondary_score_second_team;
                                                                                TextView textView9 = (TextView) nq8.B(R.id.secondary_score_second_team, root);
                                                                                if (textView9 != null) {
                                                                                    i = R.id.secondary_score_slash;
                                                                                    TextView textView10 = (TextView) nq8.B(R.id.secondary_score_slash, root);
                                                                                    if (textView10 != null) {
                                                                                        i = R.id.sofa_logo;
                                                                                        if (((ImageView) nq8.B(R.id.sofa_logo, root)) != null) {
                                                                                            i = R.id.text_primary;
                                                                                            TextView textView11 = (TextView) nq8.B(R.id.text_primary, root);
                                                                                            if (textView11 != null) {
                                                                                                i = R.id.text_secondary;
                                                                                                TextView textView12 = (TextView) nq8.B(R.id.text_secondary, root);
                                                                                                if (textView12 != null) {
                                                                                                    i = R.id.text_status;
                                                                                                    TextView textView13 = (TextView) nq8.B(R.id.text_status, root);
                                                                                                    if (textView13 != null) {
                                                                                                        i = R.id.time_row;
                                                                                                        TextView textView14 = (TextView) nq8.B(R.id.time_row, root);
                                                                                                        if (textView14 != null) {
                                                                                                            i = R.id.tournament_logo;
                                                                                                            ImageView imageView5 = (ImageView) nq8.B(R.id.tournament_logo, root);
                                                                                                            if (imageView5 != null) {
                                                                                                                i = R.id.tournament_name;
                                                                                                                TextView textView15 = (TextView) nq8.B(R.id.tournament_name, root);
                                                                                                                if (textView15 != null) {
                                                                                                                    this.d = new xt7((ConstraintLayout) root, textView, B, textView2, imageView, textView3, imageView2, B2, textView4, textView5, textView6, imageView3, textView7, imageView4, textView8, textView9, textView10, textView11, textView12, textView13, textView14, imageView5, textView15);
                                                                                                                    this.e = context.getColor(R.color.on_color_primary);
                                                                                                                    this.f = context.getColor(R.color.on_color_secondary);
                                                                                                                    this.g = b.j(StatusKt.STATUS_CANCELED, StatusKt.STATUS_POSTPONED, StatusKt.STATUS_SUSPENDED, StatusKt.STATUS_INTERRUPTED, StatusKt.STATUS_DELAYED);
                                                                                                                    this.h = new HashSet();
                                                                                                                    this.i = ph0.a0(new TextView[]{textView11, textView12, textView13, textView6, textView4, textView5, textView8, textView9, textView10, textView2, textView});
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

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.share_match_details_modal_header;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x018d, code lost:
    
        r34.h = defpackage.x9h.c(r12, r10, r9);
        r2 = java.lang.Integer.valueOf(r3);
        r21 = com.sofascore.model.mvvm.model.Event.getWinnerCode$default(r36, null, 1, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x01a6, code lost:
    
        if (r21 != null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x01ad, code lost:
    
        if (r21.intValue() != 1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x01b1, code lost:
    
        r8 = r34.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x01b3, code lost:
    
        if (r2 == null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x01b5, code lost:
    
        r2 = r2.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x01bb, code lost:
    
        r10.setTextColor(r2);
        r2 = java.lang.Integer.valueOf(r3);
        r23 = com.sofascore.model.mvvm.model.Event.getWinnerCode$default(r36, null, 1, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x01c9, code lost:
    
        if (r23 != null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x01d2, code lost:
    
        if (r23.intValue() != 2) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x01d4, code lost:
    
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x01d8, code lost:
    
        if (r2 == null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x01da, code lost:
    
        r2 = r2.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x01e0, code lost:
    
        r9.setTextColor(r2);
        r12.setTextColor(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x01df, code lost:
    
        r2 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01d7, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01ba, code lost:
    
        r2 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01b0, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x068c  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x06cf  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x06ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(g6b g6bVar, Event event) {
        TextView textView;
        TextView textView2;
        String j;
        boolean z;
        Time time;
        StatusTime statusTime;
        Integer aggregated;
        String str;
        xt7 xt7Var;
        String str2;
        g6bVar.getClass();
        event.getClass();
        xt7 xt7Var2 = this.d;
        TextView textView3 = (TextView) xt7Var2.x;
        TextView textView4 = xt7Var2.n;
        TextView textView5 = xt7Var2.o;
        TextView textView6 = xt7Var2.d;
        TextView textView7 = (TextView) xt7Var2.v;
        TextView textView8 = xt7Var2.p;
        TextView textView9 = xt7Var2.i;
        TextView textView10 = xt7Var2.h;
        TextView textView11 = xt7Var2.q;
        TextView textView12 = xt7Var2.j;
        TextView textView13 = (TextView) xt7Var2.u;
        Context context = getContext();
        context.getClass();
        textView3.setText(ok3.t(context, event));
        ImageView imageView = xt7Var2.r;
        UniqueTournament uniqueTournament = event.getTournament().getUniqueTournament();
        as9.q(imageView, Integer.valueOf(uniqueTournament != null ? uniqueTournament.getId() : 0), event.getTournament().getId(), null);
        TextView textView14 = (TextView) xt7Var2.w;
        if (ok3.E(event)) {
            long startTimestamp = event.getStartTimestamp();
            bi4 bi4Var = bi4.PATTERN_DMY;
            ConcurrentHashMap concurrentHashMap = hk4.a;
            j = fc6.i(startTimestamp, hk4.a(bi4Var.d()));
            textView = textView5;
            textView2 = textView8;
        } else {
            Context context2 = getContext();
            context2.getClass();
            textView = textView5;
            textView2 = textView8;
            j = rik.j(context2, event.getStartTimestamp(), bi4.PATTERN_DMY, " • ");
        }
        textView14.setText(j);
        i9a.H(textView11, 14, 18);
        i9a.H(textView13, 10, 12);
        Context context3 = getContext();
        context3.getClass();
        hkj hkjVar = new hkj(context3);
        hkjVar.k = true;
        hkjVar.a(g6bVar, event);
        xt7Var2.t.setBackground(hkjVar);
        as9.o(xt7Var2.e, Event.getHomeTeam$default(event, null, 1, null).getId());
        as9.o(xt7Var2.k, Event.getAwayTeam$default(event, null, 1, null).getId());
        TextView textView15 = xt7Var2.f;
        Team homeTeam$default = Event.getHomeTeam$default(event, null, 1, null);
        Context context4 = getContext();
        context4.getClass();
        textView15.setText(tba.p(context4, homeTeam$default));
        TextView textView16 = xt7Var2.l;
        Team awayTeam$default = Event.getAwayTeam$default(event, null, 1, null);
        Context context5 = getContext();
        context5.getClass();
        textView16.setText(qea.K(tba.p(context5, awayTeam$default), event.shouldReverseTeams()));
        Integer display = Event.getHomeScore$default(event, null, 1, null).getDisplay();
        textView10.setText(display != null ? String.valueOf(display.intValue()) : null);
        Integer display2 = Event.getAwayScore$default(event, null, 1, null).getDisplay();
        textView9.setText(display2 != null ? String.valueOf(display2.intValue()) : null);
        int i = this.e;
        textView10.setTextColor(i);
        textView9.setTextColor(i);
        textView12.setTextColor(i);
        textView12.setText(" - ");
        String type = event.getStatus().getType();
        Locale locale = Locale.US;
        String k = i.k(locale, type, locale);
        int hashCode = k.hashCode();
        if (hashCode != -1411655086) {
            if (hashCode != -673660814) {
            }
        } else if (k.equals(StatusKt.STATUS_IN_PROGRESS)) {
            this.h = x9h.c(textView12, textView10, textView9);
            haa.B(textView10);
            haa.B(textView9);
            haa.B(textView12);
        }
        String lowerCase = event.getStatus().getType().toLowerCase(locale);
        lowerCase.getClass();
        if (lowerCase.equals(StatusKt.STATUS_WILL_CONTINUE)) {
            this.h.add(textView7);
            textView7.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            Context context6 = getContext();
            context6.getClass();
            textView7.setText(afi.c(context6, event.getStatusDescription(), ok3.s(event), true));
        } else if (this.g.contains(lowerCase)) {
            if (!event.isAwarded() && !event.isCrowdsourcingLive() && !event.isCrowdsourcingAwaitingResults()) {
                this.h = x9h.c(textView7);
                if (fc6.B(fc6.t(Instant.ofEpochSecond(event.getStartTimestamp())))) {
                    textView13.setText(getContext().getString(R.string.today));
                    this.h.add(textView13);
                }
                textView7.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                Context context7 = getContext();
                context7.getClass();
                textView7.setText(afi.c(context7, event.getStatusDescription(), ok3.s(event), true));
                ViewGroup.LayoutParams layoutParams = textView7.getLayoutParams();
                layoutParams.getClass();
                tl3 tl3Var = (tl3) layoutParams;
                Context context8 = getContext();
                context8.getClass();
                tl3Var.setMargins(((ViewGroup.MarginLayoutParams) tl3Var).leftMargin, ((ViewGroup.MarginLayoutParams) tl3Var).topMargin, ((ViewGroup.MarginLayoutParams) tl3Var).rightMargin, ao2.s(4, context8));
                textView7.setBackgroundTintList(ColorStateList.valueOf(getContext().getColor(R.color.live)));
                textView7.setTextColor(getContext().getColor(R.color.on_color_primary));
            }
        } else if (lowerCase.equals(StatusKt.STATUS_NOT_STARTED)) {
            long startTimestamp2 = event.getStartTimestamp();
            long j2 = 1000 * startTimestamp2;
            long currentTimeMillis = j2 - System.currentTimeMillis();
            long j3 = currentTimeMillis / 86400000;
            Context context9 = getContext();
            context9.getClass();
            String bestPattern = hk4.b().getBestPattern(DateFormat.is24HourFormat(context9) ? "Hm" : "hm");
            bestPattern.getClass();
            fn0.u(startTimestamp2, hk4.a(bestPattern), textView11);
            if (currentTimeMillis < 0) {
                if (ug5.u(startTimestamp2)) {
                    textView13.setText(getContext().getString(R.string.today));
                } else if (ug5.w(startTimestamp2)) {
                    textView13.setText(getContext().getString(R.string.yesterday));
                } else {
                    z = false;
                    HashSet c = x9h.c(textView11);
                    if (z) {
                        c.add(textView13);
                    }
                    this.h = c;
                }
            } else if (j3 >= 1) {
                int between = (int) ChronoUnit.DAYS.between(vxd.o(Instant.ofEpochMilli(yaa.v())), vxd.o(Instant.ofEpochMilli(j2)));
                String string = getContext().getString(R.string.tomorrow);
                if (between != 1) {
                    string = null;
                }
                if (string == null) {
                    Locale d = dla.d();
                    String string2 = getContext().getString(R.string.in_n_days);
                    string2.getClass();
                    string = String.format(d, string2, Arrays.copyOf(new Object[]{Integer.valueOf(between)}, 1));
                }
                textView13.setText(string);
            } else {
                String string3 = getContext().getString(R.string.today);
                if (!fc6.B(fc6.t(Instant.ofEpochSecond(startTimestamp2)))) {
                    string3 = null;
                }
                if (string3 == null) {
                    string3 = getContext().getString(R.string.tomorrow);
                    string3.getClass();
                }
                textView13.setText(string3);
            }
            z = true;
            HashSet c2 = x9h.c(textView11);
            if (z) {
            }
            this.h = c2;
        }
        if (event.isCrowdsourcingLive()) {
            this.h = x9h.c(textView12, textView10, textView9, textView6);
            textView6.setCompoundDrawablesRelativeWithIntrinsicBounds(R.drawable.ic_crowdsourcing, 0, 0, 0);
            haa.z(textView6);
            textView6.setText(textView6.getContext().getString(R.string.menu_live));
            textView6.setVisibility(0);
            haa.z(textView10);
            haa.z(textView9);
            haa.z(textView12);
        } else if (event.isCrowdsourcingAwaitingResults()) {
            this.h = x9h.c(textView12, textView10, textView9, textView6);
            haa.E(textView6);
            textView6.setText(textView6.getContext().getString(R.string.crowdsourcing_awaiting_confirmation));
            textView6.setVisibility(0);
            haa.E(textView10);
            haa.E(textView9);
            haa.E(textView12);
        } else {
            if (Event.getHomeScore$default(event, null, 1, null).getPeriod1() != null && !event.isAwarded() && ok3.D(event)) {
                String description = event.getStatus().getDescription();
                if (description != null) {
                    str2 = description.toLowerCase(Locale.ROOT);
                    str2.getClass();
                } else {
                    str2 = null;
                }
                if (Intrinsics.c(str2, "halftime")) {
                    TextView textView17 = textView;
                    TextView textView18 = textView2;
                    this.h.addAll(ph0.a0(new TextView[]{textView18, textView4, textView17}));
                    textView18.setText(" - ");
                    if (Event.getHomeScore$default(event, null, 1, null).getPenalties() == null || Event.getAwayScore$default(event, null, 1, null).getPenalties() == null) {
                        Integer period1 = Event.getHomeScore$default(event, null, 1, null).getPeriod1();
                        textView4.setText("(" + (period1 != null ? String.valueOf(period1.intValue()) : null));
                        Integer period12 = Event.getAwayScore$default(event, null, 1, null).getPeriod1();
                        textView17.setText((period12 != null ? String.valueOf(period12.intValue()) : null) + ")");
                    } else {
                        Integer penalties = Event.getHomeScore$default(event, null, 1, null).getPenalties();
                        textView4.setText("(" + (penalties != null ? String.valueOf(penalties.intValue()) : null));
                        Locale locale2 = Locale.getDefault();
                        Integer penalties2 = Event.getAwayScore$default(event, null, 1, null).getPenalties();
                        me4.s(new Object[]{penalties2 != null ? String.valueOf(penalties2.intValue()) : null}, 1, locale2, "%s Pen)", textView17);
                    }
                    Context context10 = getContext();
                    context10.getClass();
                    aggregated = Event.getHomeScore$default(event, null, 1, null).getAggregated();
                    Integer aggregated2 = Event.getAwayScore$default(event, null, 1, null).getAggregated();
                    if (aggregated != null || aggregated2 == null) {
                        str = null;
                    } else {
                        int intValue = aggregated2.intValue();
                        int intValue2 = aggregated.intValue();
                        boolean c0 = hkg.c0(context10);
                        Integer valueOf = Integer.valueOf(c0 ? intValue : intValue2);
                        if (c0) {
                            intValue = intValue2;
                        }
                        str = context10.getString(R.string.header_football_aggregates_score, valueOf, Integer.valueOf(intValue));
                    }
                    if (str != null) {
                        xt7Var = xt7Var2;
                        TextView textView19 = xt7Var.c;
                        textView19.setText(str);
                        if (Intrinsics.c(event.getStatus().getType(), StatusKt.STATUS_IN_PROGRESS)) {
                            haa.B(textView19);
                        } else {
                            haa.F(textView19);
                        }
                        this.h.add(textView19);
                        ImageView imageView2 = xt7Var.g;
                        Integer aggregatedWinnerCode$default = Event.getAggregatedWinnerCode$default(event, null, 1, null);
                        imageView2.setVisibility((aggregatedWinnerCode$default != null && aggregatedWinnerCode$default.intValue() == 1) ? 0 : 8);
                        ImageView imageView3 = xt7Var.m;
                        Integer aggregatedWinnerCode$default2 = Event.getAggregatedWinnerCode$default(event, null, 1, null);
                        imageView3.setVisibility((aggregatedWinnerCode$default2 != null && aggregatedWinnerCode$default2.intValue() == 2) ? 0 : 8);
                        for (TextView textView20 : this.i) {
                            Integer num = this.h.contains(textView20) ? 0 : null;
                            textView20.setVisibility(num != null ? num.intValue() : 8);
                        }
                    }
                }
            }
            TextView textView21 = textView;
            TextView textView22 = textView2;
            if (event.isAwarded()) {
                textView13.setText(getContext().getString(R.string.reason_awarded));
                this.h.add(textView13);
            } else if (ok3.z(event)) {
                String y = dmi.y(getContext().getString(R.string.penalties_short), " %s");
                Locale locale3 = Locale.getDefault();
                Integer penalties3 = Event.getHomeScore$default(event, null, 1, null).getPenalties();
                me4.s(new Object[]{penalties3 != null ? String.valueOf(penalties3.intValue()) : null}, 1, locale3, y, textView4);
                Integer penalties4 = Event.getAwayScore$default(event, null, 1, null).getPenalties();
                textView21.setText(penalties4 != null ? String.valueOf(penalties4.intValue()) : null);
                this.h.addAll(ph0.a0(new TextView[]{textView22, textView4, textView21}));
                haa.E(textView22);
                haa.E(textView4);
                haa.E(textView21);
            } else if (ok3.C(event)) {
                Context context11 = getContext();
                context11.getClass();
                textView13.setText(afi.c(context11, event.getStatusDescription(), ok3.s(event), false));
                this.h.add(textView13);
            } else if (ok3.D(event) && (time = event.getTime()) != null && (statusTime = time.getStatusTime()) != null) {
                l4a.K(textView13, z8e.t(statusTime, xe6.c().b, false));
                haa.B(textView13);
                this.h.add(textView13);
            }
            Context context102 = getContext();
            context102.getClass();
            aggregated = Event.getHomeScore$default(event, null, 1, null).getAggregated();
            Integer aggregated22 = Event.getAwayScore$default(event, null, 1, null).getAggregated();
            if (aggregated != null) {
            }
            str = null;
            if (str != null) {
            }
        }
        xt7Var = xt7Var2;
        ImageView imageView22 = xt7Var.g;
        Integer aggregatedWinnerCode$default3 = Event.getAggregatedWinnerCode$default(event, null, 1, null);
        if (aggregatedWinnerCode$default3 != null) {
            imageView22.setVisibility((aggregatedWinnerCode$default3 != null && aggregatedWinnerCode$default3.intValue() == 1) ? 0 : 8);
            ImageView imageView32 = xt7Var.m;
            Integer aggregatedWinnerCode$default22 = Event.getAggregatedWinnerCode$default(event, null, 1, null);
            if (aggregatedWinnerCode$default22 != null) {
                imageView32.setVisibility((aggregatedWinnerCode$default22 != null && aggregatedWinnerCode$default22.intValue() == 2) ? 0 : 8);
                while (r1.hasNext()) {
                }
            }
            imageView32.setVisibility((aggregatedWinnerCode$default22 != null && aggregatedWinnerCode$default22.intValue() == 2) ? 0 : 8);
            while (r1.hasNext()) {
            }
        }
        imageView22.setVisibility((aggregatedWinnerCode$default3 != null && aggregatedWinnerCode$default3.intValue() == 1) ? 0 : 8);
        ImageView imageView322 = xt7Var.m;
        Integer aggregatedWinnerCode$default222 = Event.getAggregatedWinnerCode$default(event, null, 1, null);
        imageView322.setVisibility((aggregatedWinnerCode$default222 != null && aggregatedWinnerCode$default222.intValue() == 2) ? 0 : 8);
        while (r1.hasNext()) {
        }
    }
}
