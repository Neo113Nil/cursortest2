package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.provider.CalendarContract;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.BaseballEvent;
import com.sofascore.model.mvvm.model.Country;
import com.sofascore.model.mvvm.model.CricketEvent;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.MmaEvent;
import com.sofascore.model.mvvm.model.Referee;
import com.sofascore.model.mvvm.model.Stadium;
import com.sofascore.model.mvvm.model.StadiumType;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.TennisEvent;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.mvvm.model.Venue;
import com.sofascore.results.R;
import com.sofascore.results.league.LeagueActivity;
import com.sofascore.results.mma.fightNight.MmaFightNightActivity;
import com.sofascore.results.referee.RefereeActivity;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class xvb extends o8 {
    public final vy1 d;
    public final LayoutInflater e;
    public boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xvb(Context context) {
        super(context, null, 0);
        context.getClass();
        vy1 a = vy1.a(getRoot());
        this.d = a;
        this.e = LayoutInflater.from(context);
        setVisibility(8);
        a.b.setClipToOutline(true);
    }

    public final boolean getHasRankings() {
        return this.f;
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.summary_info_layout;
    }

    /* JADX WARN: Code restructure failed: missing block: B:156:0x06d7, code lost:
    
        if (r4.equals(com.sofascore.model.Sports.RUGBY) == false) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x06de, code lost:
    
        if (r4.equals(com.sofascore.model.Sports.MMA) == false) goto L200;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x03e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(final Event event, gv9 gv9Var, en1 en1Var) {
        String location;
        StadiumType stadiumType;
        Drawable drawable;
        boolean z;
        String umpire1Name;
        String umpire2Name;
        String tvUmpireName;
        String tossWin;
        String tossDecision;
        int i;
        Stadium stadium;
        if (getVisibility() == 0) {
            return;
        }
        final int i2 = 0;
        setVisibility(0);
        vy1 vy1Var = this.d;
        LinearLayout linearLayout = vy1Var.b;
        LinearLayout linearLayout2 = vy1Var.b;
        LayoutInflater layoutInflater = this.e;
        cv1 c = cv1.c(layoutInflater, linearLayout);
        TextView textView = c.d;
        Context context = textView.getContext();
        context.getClass();
        textView.setText(ok3.t(context, event));
        textView.setMaxLines(Integer.MAX_VALUE);
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        ImageView imageView = c.e;
        UniqueTournament uniqueTournament = event.getTournament().getUniqueTournament();
        as9.q(imageView, uniqueTournament != null ? Integer.valueOf(uniqueTournament.getId()) : null, event.getTournament().getId(), null);
        boolean c2 = Intrinsics.c(ok3.s(event), Sports.MMA);
        ConstraintLayout constraintLayout = c.b;
        final int i3 = 2;
        final int i4 = 1;
        if (c2) {
            constraintLayout.setOnClickListener(new View.OnClickListener(this) { // from class: tvb
                public final /* synthetic */ xvb b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i5 = i4;
                    Event event2 = event;
                    xvb xvbVar = this.b;
                    switch (i5) {
                        case 0:
                            StringBuilder sb = new StringBuilder();
                            sb.append(xvbVar.getContext().getString(R.string.share_link));
                            sb.append("/event/");
                            sb.append(event2.getId());
                            Context context2 = xvbVar.getContext();
                            context2.getClass();
                            nv.z0(context2, kv.CLICK, "add_to_calendar_button", "event_screen");
                            Intent intent = new Intent("android.intent.action.INSERT");
                            intent.setData(CalendarContract.Events.CONTENT_URI);
                            Team homeTeam$default = Event.getHomeTeam$default(event2, null, 1, null);
                            Context context3 = xvbVar.getContext();
                            context3.getClass();
                            String A = tba.A(context3, homeTeam$default);
                            Team awayTeam$default = Event.getAwayTeam$default(event2, null, 1, null);
                            Context context4 = xvbVar.getContext();
                            context4.getClass();
                            intent.putExtra("title", A + " - " + tba.A(context4, awayTeam$default));
                            intent.putExtra("description", sb.toString());
                            intent.putExtra("beginTime", event2.getStartTimestamp() * 1000);
                            intent.putExtra("endTime", (event2.getStartTimestamp() * 1000) + 7200000);
                            if (intent.resolveActivity(xvbVar.getContext().getPackageManager()) != null) {
                                try {
                                    xvbVar.getContext().startActivity(intent);
                                    return;
                                } catch (CancellationException e) {
                                    throw e;
                                } catch (Throwable unused) {
                                    return;
                                }
                            }
                            return;
                        case 1:
                            int i6 = MmaFightNightActivity.R;
                            Context context5 = xvbVar.getContext();
                            context5.getClass();
                            x2a.S(event2.getTournament().getId(), context5);
                            return;
                        default:
                            a99 a99Var = LeagueActivity.h0;
                            Context context6 = xvbVar.getContext();
                            context6.getClass();
                            UniqueTournament uniqueTournament2 = event2.getTournament().getUniqueTournament();
                            a99.A(a99Var, context6, Integer.valueOf(uniqueTournament2 != null ? uniqueTournament2.getId() : 0), Integer.valueOf(event2.getTournament().getId()), null, null, null, null, 4088);
                            return;
                    }
                }
            });
        } else {
            constraintLayout.setOnClickListener(new View.OnClickListener(this) { // from class: tvb
                public final /* synthetic */ xvb b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i5 = i3;
                    Event event2 = event;
                    xvb xvbVar = this.b;
                    switch (i5) {
                        case 0:
                            StringBuilder sb = new StringBuilder();
                            sb.append(xvbVar.getContext().getString(R.string.share_link));
                            sb.append("/event/");
                            sb.append(event2.getId());
                            Context context2 = xvbVar.getContext();
                            context2.getClass();
                            nv.z0(context2, kv.CLICK, "add_to_calendar_button", "event_screen");
                            Intent intent = new Intent("android.intent.action.INSERT");
                            intent.setData(CalendarContract.Events.CONTENT_URI);
                            Team homeTeam$default = Event.getHomeTeam$default(event2, null, 1, null);
                            Context context3 = xvbVar.getContext();
                            context3.getClass();
                            String A = tba.A(context3, homeTeam$default);
                            Team awayTeam$default = Event.getAwayTeam$default(event2, null, 1, null);
                            Context context4 = xvbVar.getContext();
                            context4.getClass();
                            intent.putExtra("title", A + " - " + tba.A(context4, awayTeam$default));
                            intent.putExtra("description", sb.toString());
                            intent.putExtra("beginTime", event2.getStartTimestamp() * 1000);
                            intent.putExtra("endTime", (event2.getStartTimestamp() * 1000) + 7200000);
                            if (intent.resolveActivity(xvbVar.getContext().getPackageManager()) != null) {
                                try {
                                    xvbVar.getContext().startActivity(intent);
                                    return;
                                } catch (CancellationException e) {
                                    throw e;
                                } catch (Throwable unused) {
                                    return;
                                }
                            }
                            return;
                        case 1:
                            int i6 = MmaFightNightActivity.R;
                            Context context5 = xvbVar.getContext();
                            context5.getClass();
                            x2a.S(event2.getTournament().getId(), context5);
                            return;
                        default:
                            a99 a99Var = LeagueActivity.h0;
                            Context context6 = xvbVar.getContext();
                            context6.getClass();
                            UniqueTournament uniqueTournament2 = event2.getTournament().getUniqueTournament();
                            a99.A(a99Var, context6, Integer.valueOf(uniqueTournament2 != null ? uniqueTournament2.getId() : 0), Integer.valueOf(event2.getTournament().getId()), null, null, null, null, 4088);
                            return;
                    }
                }
            });
        }
        cv1 c3 = cv1.c(layoutInflater, linearLayout2);
        TextView textView2 = c3.d;
        Context context2 = getContext();
        context2.getClass();
        textView2.setText(rik.j(context2, event.getStartTimestamp(), bi4.PATTERN_DMY, " • "));
        ImageView imageView2 = c3.e;
        imageView2.setImageResource(R.drawable.ic_calendar_date);
        imageView2.setImageTintList(ColorStateList.valueOf(getContext().getColor(R.color.n_lv_1)));
        if (ok3.E(event)) {
            TextView textView3 = c3.f;
            textView3.setVisibility(0);
            textView3.setText(textView3.getContext().getString(R.string.add_to_calendar));
            c3.b.setOnClickListener(new View.OnClickListener(this) { // from class: tvb
                public final /* synthetic */ xvb b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i5 = i2;
                    Event event2 = event;
                    xvb xvbVar = this.b;
                    switch (i5) {
                        case 0:
                            StringBuilder sb = new StringBuilder();
                            sb.append(xvbVar.getContext().getString(R.string.share_link));
                            sb.append("/event/");
                            sb.append(event2.getId());
                            Context context22 = xvbVar.getContext();
                            context22.getClass();
                            nv.z0(context22, kv.CLICK, "add_to_calendar_button", "event_screen");
                            Intent intent = new Intent("android.intent.action.INSERT");
                            intent.setData(CalendarContract.Events.CONTENT_URI);
                            Team homeTeam$default = Event.getHomeTeam$default(event2, null, 1, null);
                            Context context3 = xvbVar.getContext();
                            context3.getClass();
                            String A = tba.A(context3, homeTeam$default);
                            Team awayTeam$default = Event.getAwayTeam$default(event2, null, 1, null);
                            Context context4 = xvbVar.getContext();
                            context4.getClass();
                            intent.putExtra("title", A + " - " + tba.A(context4, awayTeam$default));
                            intent.putExtra("description", sb.toString());
                            intent.putExtra("beginTime", event2.getStartTimestamp() * 1000);
                            intent.putExtra("endTime", (event2.getStartTimestamp() * 1000) + 7200000);
                            if (intent.resolveActivity(xvbVar.getContext().getPackageManager()) != null) {
                                try {
                                    xvbVar.getContext().startActivity(intent);
                                    return;
                                } catch (CancellationException e) {
                                    throw e;
                                } catch (Throwable unused) {
                                    return;
                                }
                            }
                            return;
                        case 1:
                            int i6 = MmaFightNightActivity.R;
                            Context context5 = xvbVar.getContext();
                            context5.getClass();
                            x2a.S(event2.getTournament().getId(), context5);
                            return;
                        default:
                            a99 a99Var = LeagueActivity.h0;
                            Context context6 = xvbVar.getContext();
                            context6.getClass();
                            UniqueTournament uniqueTournament2 = event2.getTournament().getUniqueTournament();
                            a99.A(a99Var, context6, Integer.valueOf(uniqueTournament2 != null ? uniqueTournament2.getId() : 0), Integer.valueOf(event2.getTournament().getId()), null, null, null, null, 4088);
                            return;
                    }
                }
            });
        } else {
            c3.c.setVisibility(8);
        }
        Venue venue = event.getVenue();
        if ((venue == null || (stadium = venue.getStadium()) == null || (location = stadium.getName()) == null) && ((location = event.getTournament().getLocation()) == null || !Intrinsics.c(ok3.s(event), Sports.MMA))) {
            location = null;
        }
        if (location == null) {
            location = null;
        } else if ((event instanceof TennisEvent) && c.v(location, "Court ", false)) {
            location = getContext().getString(R.string.tennis_court_number, StringsKt.V(location, "Court "));
        }
        Venue venue2 = event.getVenue();
        if (venue2 == null || (stadiumType = venue2.getStadiumType()) == null || !(event instanceof BaseballEvent)) {
            stadiumType = null;
        }
        int i5 = stadiumType == null ? -1 : wvb.a[stadiumType.ordinal()];
        int i6 = (i5 == 1 || i5 == 2) ? R.drawable.ic_stadium_dome : i5 != 3 ? R.drawable.ic_matches : R.drawable.ic_arena;
        if (location != null) {
            if (event.getAttendance() != null) {
                View inflate = layoutInflater.inflate(R.layout.summary_info_label_primary_secondary_row_layout, (ViewGroup) linearLayout2, false);
                linearLayout2.addView(inflate);
                ImageView imageView3 = (ImageView) nq8.B(R.id.arrow_icon, inflate);
                if (imageView3 != null) {
                    ImageView imageView4 = (ImageView) nq8.B(R.id.info_icon, inflate);
                    if (imageView4 != null) {
                        TextView textView4 = (TextView) nq8.B(R.id.label_primary, inflate);
                        if (textView4 != null) {
                            TextView textView5 = (TextView) nq8.B(R.id.label_secondary, inflate);
                            if (textView5 != null) {
                                ConstraintLayout constraintLayout2 = (ConstraintLayout) inflate;
                                textView4.setText(location);
                                textView5.setText(getContext().getString(R.string.attendance) + ": " + String.valueOf(event.getAttendance()));
                                imageView4.setImageResource(i6);
                                imageView4.setImageTintList(ColorStateList.valueOf(imageView4.getContext().getColor(R.color.n_lv_1)));
                                Venue venue3 = event.getVenue();
                                if (Intrinsics.c(venue3 != null ? venue3.getHidden() : null, Boolean.FALSE)) {
                                    constraintLayout2.getClass();
                                    Venue venue4 = event.getVenue();
                                    venue4.getClass();
                                    constraintLayout2.setOnClickListener(new l8(this, venue4.getId(), 5));
                                } else {
                                    imageView3.setVisibility(8);
                                }
                            } else {
                                i = R.id.label_secondary;
                            }
                        } else {
                            i = R.id.label_primary;
                        }
                    } else {
                        i = R.id.info_icon;
                    }
                } else {
                    i = R.id.arrow_icon;
                }
                yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
                return;
            }
            cv1 c4 = cv1.c(layoutInflater, linearLayout2);
            ImageView imageView5 = c4.e;
            c4.d.setText(location);
            imageView5.setImageResource(i6);
            imageView5.setImageTintList(ColorStateList.valueOf(getContext().getColor(R.color.n_lv_1)));
            Venue venue5 = event.getVenue();
            if (Intrinsics.c(venue5 != null ? venue5.getHidden() : null, Boolean.FALSE)) {
                ConstraintLayout constraintLayout3 = c4.b;
                constraintLayout3.getClass();
                Venue venue6 = event.getVenue();
                venue6.getClass();
                constraintLayout3.setOnClickListener(new l8(this, venue6.getId(), 5));
            } else {
                c4.c.setVisibility(8);
            }
        }
        Venue venue7 = event.getVenue();
        if (venue7 != null) {
            cv1 c5 = cv1.c(layoutInflater, linearLayout2);
            TextView textView6 = c5.d;
            String name = venue7.getCity().getName();
            Context context3 = getContext();
            context3.getClass();
            Country country = venue7.getCountry();
            textView6.setText(name + ", " + tv3.c(context3, country != null ? country.getName() : null));
            ImageView imageView6 = c5.e;
            Country country2 = venue7.getCountry();
            as9.c(imageView6, country2 != null ? country2.getAlpha2() : null, false, null, 6);
            c5.c.setVisibility(8);
        }
        if (event instanceof CricketEvent) {
            CricketEvent cricketEvent = (CricketEvent) event;
            final Referee referee = cricketEvent.getReferee();
            if (referee != null) {
                v82 h = v82.h(layoutInflater, linearLayout2);
                ImageView imageView7 = (ImageView) h.d;
                ((TextView) h.f).setText(tba.u(referee));
                imageView7.setImageResource(R.drawable.ic_referee);
                ImageView imageView8 = (ImageView) h.c;
                Country country3 = referee.getCountry();
                as9.c(imageView8, country3 != null ? country3.getAlpha2() : null, true, null, 4);
                imageView7.setImageTintList(ColorStateList.valueOf(getContext().getColor(R.color.n_lv_1)));
                final int i7 = 0;
                ((ConstraintLayout) h.b).setOnClickListener(new View.OnClickListener(this) { // from class: vvb
                    public final /* synthetic */ xvb b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i8 = i7;
                        Referee referee2 = referee;
                        xvb xvbVar = this.b;
                        switch (i8) {
                            case 0:
                                int i9 = RefereeActivity.R;
                                Context context4 = xvbVar.getContext();
                                context4.getClass();
                                int id = referee2.getId();
                                String u = tba.u(referee2);
                                u.getClass();
                                Intent intent = new Intent(context4, (Class<?>) RefereeActivity.class);
                                intent.putExtra("REFEREE_ID", id);
                                intent.putExtra("REFEREE_NAME", u);
                                context4.startActivity(intent);
                                break;
                            default:
                                int i10 = RefereeActivity.R;
                                Context context5 = xvbVar.getContext();
                                context5.getClass();
                                int id2 = referee2.getId();
                                String u2 = tba.u(referee2);
                                u2.getClass();
                                Intent intent2 = new Intent(context5, (Class<?>) RefereeActivity.class);
                                intent2.putExtra("REFEREE_ID", id2);
                                intent2.putExtra("REFEREE_NAME", u2);
                                context5.startActivity(intent2);
                                break;
                        }
                    }
                });
                if (referee.hasCards()) {
                    Integer redCards = referee.getRedCards();
                    redCards.getClass();
                    int intValue = redCards.intValue();
                    Integer yellowRedCards = referee.getYellowRedCards();
                    yellowRedCards.getClass();
                    double intValue2 = yellowRedCards.intValue() + intValue;
                    referee.getGames().getClass();
                    String b = rei.b(2, Double.valueOf(intValue2 / r8.intValue()));
                    Integer yellowCards = referee.getYellowCards();
                    yellowCards.getClass();
                    double intValue3 = yellowCards.intValue();
                    referee.getGames().getClass();
                    String b2 = rei.b(2, Double.valueOf(intValue3 / r4.intValue()));
                    ((Group) h.h).setVisibility(0);
                    ((TextView) h.e).setText(b);
                    ((TextView) h.g).setText(b2);
                }
            } else {
                String refereeName = cricketEvent.getRefereeName();
                if (refereeName != null) {
                    cv1 e = cv1.e(layoutInflater, linearLayout2);
                    ImageView imageView9 = e.e;
                    e.f.setText(refereeName);
                    e.d.setText(R.string.referee);
                    imageView9.setImageResource(R.drawable.ic_referee);
                    imageView9.setImageTintList(ColorStateList.valueOf(getContext().getColor(R.color.n_lv_1)));
                    e.c.setVisibility(8);
                } else {
                    z = false;
                    umpire1Name = cricketEvent.getUmpire1Name();
                    if (umpire1Name != null) {
                        cv1 e2 = cv1.e(layoutInflater, linearLayout2);
                        e2.f.setText(umpire1Name);
                        e2.d.setText(R.string.umpire_1);
                        l(e2, !z);
                        e2.c.setVisibility(8);
                        z = true;
                    }
                    umpire2Name = cricketEvent.getUmpire2Name();
                    if (umpire2Name != null) {
                        cv1 e3 = cv1.e(layoutInflater, linearLayout2);
                        e3.f.setText(umpire2Name);
                        e3.d.setText(R.string.umpire_2);
                        e3.e.setVisibility(4);
                        l(e3, !z);
                        e3.c.setVisibility(8);
                        z = true;
                    }
                    tvUmpireName = cricketEvent.getTvUmpireName();
                    if (tvUmpireName != null) {
                        cv1 e4 = cv1.e(layoutInflater, linearLayout2);
                        e4.f.setText(tvUmpireName);
                        e4.d.setText(R.string.tv_umpire);
                        e4.e.setVisibility(4);
                        l(e4, !z);
                        e4.c.setVisibility(8);
                    }
                    tossWin = cricketEvent.getTossWin();
                    if (tossWin != null) {
                        cv1 e5 = cv1.e(layoutInflater, linearLayout2);
                        e5.f.setText(tossWin);
                        e5.d.setText(R.string.toss_win);
                        e5.e.setVisibility(4);
                        e5.c.setVisibility(8);
                    }
                    tossDecision = cricketEvent.getTossDecision();
                    if (tossDecision != null) {
                        cv1 e6 = cv1.e(layoutInflater, linearLayout2);
                        e6.f.setText(tossDecision);
                        e6.d.setText(R.string.toss_decision);
                        e6.e.setVisibility(4);
                        e6.c.setVisibility(8);
                    }
                }
            }
            z = true;
            umpire1Name = cricketEvent.getUmpire1Name();
            if (umpire1Name != null) {
            }
            umpire2Name = cricketEvent.getUmpire2Name();
            if (umpire2Name != null) {
            }
            tvUmpireName = cricketEvent.getTvUmpireName();
            if (tvUmpireName != null) {
            }
            tossWin = cricketEvent.getTossWin();
            if (tossWin != null) {
            }
            tossDecision = cricketEvent.getTossDecision();
            if (tossDecision != null) {
            }
        } else if (!(event instanceof BaseballEvent)) {
            final Referee referee2 = event.getReferee();
            if (referee2 != null) {
                v82 h2 = v82.h(layoutInflater, linearLayout2);
                ImageView imageView10 = (ImageView) h2.d;
                ((TextView) h2.f).setText(tba.u(referee2));
                imageView10.setImageResource(R.drawable.ic_referee);
                ImageView imageView11 = (ImageView) h2.c;
                Country country4 = referee2.getCountry();
                final int i8 = 1;
                as9.c(imageView11, country4 != null ? country4.getAlpha2() : null, true, null, 4);
                imageView10.setImageTintList(ColorStateList.valueOf(getContext().getColor(R.color.n_lv_1)));
                ((ConstraintLayout) h2.b).setOnClickListener(new View.OnClickListener(this) { // from class: vvb
                    public final /* synthetic */ xvb b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i82 = i8;
                        Referee referee22 = referee2;
                        xvb xvbVar = this.b;
                        switch (i82) {
                            case 0:
                                int i9 = RefereeActivity.R;
                                Context context4 = xvbVar.getContext();
                                context4.getClass();
                                int id = referee22.getId();
                                String u = tba.u(referee22);
                                u.getClass();
                                Intent intent = new Intent(context4, (Class<?>) RefereeActivity.class);
                                intent.putExtra("REFEREE_ID", id);
                                intent.putExtra("REFEREE_NAME", u);
                                context4.startActivity(intent);
                                break;
                            default:
                                int i10 = RefereeActivity.R;
                                Context context5 = xvbVar.getContext();
                                context5.getClass();
                                int id2 = referee22.getId();
                                String u2 = tba.u(referee22);
                                u2.getClass();
                                Intent intent2 = new Intent(context5, (Class<?>) RefereeActivity.class);
                                intent2.putExtra("REFEREE_ID", id2);
                                intent2.putExtra("REFEREE_NAME", u2);
                                context5.startActivity(intent2);
                                break;
                        }
                    }
                });
                if (referee2.hasCards()) {
                    Integer redCards2 = referee2.getRedCards();
                    redCards2.getClass();
                    int intValue4 = redCards2.intValue();
                    Integer yellowRedCards2 = referee2.getYellowRedCards();
                    yellowRedCards2.getClass();
                    double intValue5 = yellowRedCards2.intValue() + intValue4;
                    referee2.getGames().getClass();
                    String b3 = rei.b(2, Double.valueOf(intValue5 / r6.intValue()));
                    Integer yellowCards2 = referee2.getYellowCards();
                    yellowCards2.getClass();
                    double intValue6 = yellowCards2.intValue();
                    referee2.getGames().getClass();
                    String b4 = rei.b(2, Double.valueOf(intValue6 / r2.intValue()));
                    ((Group) h2.h).setVisibility(0);
                    ((TextView) h2.e).setText(b3);
                    ((TextView) h2.g).setText(b4);
                }
            }
        } else if (gv9Var != null) {
            wrh.b(layoutInflater, linearLayout2, true).b.setContent(new tc3(1469458110, new np9(2, gv9Var), true));
        }
        if (event instanceof TennisEvent) {
            String groundType = ((TennisEvent) event).getGroundType();
            if (groundType != null) {
                cv1 c6 = cv1.c(layoutInflater, linearLayout2);
                TextView textView7 = c6.d;
                Context context4 = getContext();
                textView7.setText(context4 == null ? null : d2a.x(context4, groundType, true));
                Drawable drawable2 = getContext().getDrawable(R.drawable.ic_tennis_terain);
                if (drawable2 == null || (drawable = drawable2.mutate()) == null) {
                    drawable = null;
                } else {
                    Context context5 = getContext();
                    context5.getClass();
                    drawable.setTintList(ColorStateList.valueOf(d2a.y(context5, groundType)));
                }
                c6.e.setImageDrawable(drawable);
                c6.c.setVisibility(8);
            }
        } else if (event instanceof MmaEvent) {
            MmaEvent mmaEvent = (MmaEvent) event;
            String weightClass = mmaEvent.getWeightClass();
            if (weightClass != null) {
                l97 l97Var = new l97(13, mmaEvent, this, weightClass);
                if (!this.f) {
                    l97Var = null;
                }
                cv1 c7 = cv1.c(layoutInflater, linearLayout2);
                ConstraintLayout constraintLayout4 = c7.b;
                ImageView imageView12 = c7.e;
                TextView textView8 = c7.d;
                Context context6 = getContext();
                context6.getClass();
                textView8.setText(tnf.q(context6, weightClass));
                imageView12.setImageResource(R.drawable.ic_mma);
                imageView12.setImageTintList(ColorStateList.valueOf(getContext().getColor(R.color.n_lv_1)));
                if (l97Var != null) {
                    constraintLayout4.setOnClickListener(new cd5(l97Var, 17));
                } else {
                    c7.c.setVisibility(8);
                    constraintLayout4.setOnClickListener(null);
                    Unit unit = Unit.a;
                }
            }
            String fightDiscipline = mmaEvent.getFightDiscipline();
            if (fightDiscipline != null) {
                i08.d.getClass();
                i08 v = a99.v(fightDiscipline);
                if (v != null) {
                    cv1 c8 = cv1.c(layoutInflater, linearLayout2);
                    ImageView imageView13 = c8.e;
                    c8.d.setText(getContext().getString(v.b));
                    imageView13.setImageResource(v.c);
                    imageView13.setImageTintList(ColorStateList.valueOf(getContext().getColor(R.color.n_lv_1)));
                    c8.c.setVisibility(8);
                }
            }
        }
        Team awayTeam$default = Event.getHomeTeam$default(event, null, 1, null).getDisabled() ? Event.getAwayTeam$default(event, null, 1, null) : Event.getHomeTeam$default(event, null, 1, null);
        String string = getContext().getString(R.string.ranking);
        string.getClass();
        String s = ok3.s(event);
        int hashCode = s.hashCode();
        if (hashCode != 108225) {
            if (hashCode != 108869083) {
                if (hashCode == 394668909 && s.equals(Sports.FOOTBALL) && awayTeam$default.getNational()) {
                    string = "FIFA ".concat(string);
                }
                string = null;
            }
        }
        boolean z2 = (Event.getHomeTeam$default(event, null, 1, null).getRanking() == null && Event.getAwayTeam$default(event, null, 1, null).getRanking() == null) ? false : true;
        if (string != null && z2) {
            Context context7 = getContext();
            context7.getClass();
            emf emfVar = new emf(context7);
            emfVar.setEvent(event);
            u79 u79Var = emfVar.d;
            u79Var.k.setVisibility(0);
            u79Var.k.setText(string);
            linearLayout2.addView(emfVar);
        }
        if (en1Var != null) {
            wrh.b(layoutInflater, linearLayout2, true).b.setContent(new tc3(-1215320712, new uvb(en1Var, 1), true));
        }
    }

    public final void l(cv1 cv1Var, boolean z) {
        ImageView imageView = cv1Var.e;
        if (!z) {
            imageView.setVisibility(4);
        } else {
            imageView.setImageResource(R.drawable.ic_referee);
            imageView.setImageTintList(ColorStateList.valueOf(getContext().getColor(R.color.n_lv_1)));
        }
    }

    public final void setHasRankings(boolean z) {
        this.f = z;
    }
}
