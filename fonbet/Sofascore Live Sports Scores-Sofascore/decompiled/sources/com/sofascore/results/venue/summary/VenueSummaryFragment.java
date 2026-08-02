package com.sofascore.results.venue.summary;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.appsflyer.internal.i;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Category;
import com.sofascore.model.mvvm.model.Country;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.LatLonCoordinates;
import com.sofascore.model.mvvm.model.Round;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.model.mvvm.model.StatusTime;
import com.sofascore.model.mvvm.model.SubTeam;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.TennisEvent;
import com.sofascore.model.mvvm.model.Time;
import com.sofascore.model.mvvm.model.Tournament;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.mvvm.model.Venue;
import com.sofascore.model.network.response.EventResponse;
import com.sofascore.model.newNetwork.TeamNearEventsResponse;
import com.sofascore.model.newNetwork.VenueResponse;
import com.sofascore.model.newNetwork.VenueSportStatistics;
import com.sofascore.results.R;
import com.sofascore.results.mvvm.base.AbstractFragment;
import com.sofascore.results.team.TeamActivity;
import com.sofascore.results.venue.summary.VenueSummaryFragment;
import com.sofascore.results.venue.summary.venueinfo.VenueHighlightsView;
import com.sofascore.results.venue.summary.venueinfo.VenueInfoView;
import com.sofascore.results.view.FeatureMatchCardView;
import com.sofascore.results.view.SuggestEditView;
import com.sofascore.results.view.typeheader.TypeHeaderView;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.a70;
import defpackage.aok;
import defpackage.dnk;
import defpackage.dsi;
import defpackage.duf;
import defpackage.fuf;
import defpackage.ioe;
import defpackage.krk;
import defpackage.nq8;
import defpackage.otk;
import defpackage.s61;
import defpackage.un0;
import defpackage.uq8;
import defpackage.vnk;
import defpackage.xnk;
import defpackage.xw3;
import defpackage.yhk;
import defpackage.znk;
import java.time.Duration;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAmount;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/venue/summary/VenueSummaryFragment;", "Lcom/sofascore/results/mvvm/base/AbstractFragment;", "Luq8;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class VenueSummaryFragment extends Hilt_VenueSummaryFragment<uq8> {
    public final otk r;
    public final otk s;
    public final otk t;
    public Event u;

    public VenueSummaryFragment() {
        fuf fufVar = duf.a;
        this.r = new otk(fufVar.getOrCreateKotlinClass(aok.class), new xnk(this, 0), new xnk(this, 2), new xnk(this, 1));
        this.s = new otk(fufVar.getOrCreateKotlinClass(dnk.class), new xnk(this, 3), new xnk(this, 5), new xnk(this, 4));
        this.t = new otk(fufVar.getOrCreateKotlinClass(dsi.class), new xnk(this, 6), new xnk(this, 8), new xnk(this, 7));
    }

    public final VenueResponse C() {
        Object d = ((dnk) this.s.getValue()).f.d();
        if (d != null) {
            return (VenueResponse) d;
        }
        a70.r("Required value was null.");
        return null;
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final krk k() {
        View inflate = getLayoutInflater().inflate(R.layout.fragment_venue_summary, (ViewGroup) null, false);
        int i = R.id.featured_match_view;
        FeatureMatchCardView featureMatchCardView = (FeatureMatchCardView) nq8.B(R.id.featured_match_view, inflate);
        if (featureMatchCardView != null) {
            i = R.id.nested_scroll_view;
            if (((NestedScrollView) nq8.B(R.id.nested_scroll_view, inflate)) != null) {
                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate;
                i = R.id.venue_details_suggest_edit;
                SuggestEditView suggestEditView = (SuggestEditView) nq8.B(R.id.venue_details_suggest_edit, inflate);
                if (suggestEditView != null) {
                    i = R.id.venue_highlights_view;
                    VenueHighlightsView venueHighlightsView = (VenueHighlightsView) nq8.B(R.id.venue_highlights_view, inflate);
                    if (venueHighlightsView != null) {
                        i = R.id.venue_info_view;
                        VenueInfoView venueInfoView = (VenueInfoView) nq8.B(R.id.venue_info_view, inflate);
                        if (venueInfoView != null) {
                            return new uq8(swipeRefreshLayout, featureMatchCardView, swipeRefreshLayout, suggestEditView, venueHighlightsView, venueInfoView);
                        }
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        return "SummaryTab";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void s(View view, Bundle bundle) {
        krk krkVar = this.l;
        krkVar.getClass();
        SwipeRefreshLayout swipeRefreshLayout = ((uq8) krkVar).c;
        swipeRefreshLayout.getClass();
        AbstractFragment.v(this, swipeRefreshLayout, null, null, 4);
        l();
        krk krkVar2 = this.l;
        krkVar2.getClass();
        final int i = 0;
        ((uq8) krkVar2).d.d.c.setOnClickListener(new s61(9, new vnk(this, i)));
        otk otkVar = this.r;
        ((aok) otkVar.getValue()).h.e(getViewLifecycleOwner(), new ioe(28, new Function1(this) { // from class: wnk
            public final /* synthetic */ VenueSummaryFragment b;

            {
                this.b = this;
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Code restructure failed: missing block: B:116:0x0500, code lost:
            
                if (r0.equals(com.sofascore.model.mvvm.model.StatusKt.STATUS_WILL_CONTINUE) == false) goto L166;
             */
            /* JADX WARN: Code restructure failed: missing block: B:117:0x050c, code lost:
            
                r0 = java.lang.Integer.valueOf(r1);
                r5 = com.sofascore.model.mvvm.model.Event.getWinnerCode$default(r14, null, 1, null);
             */
            /* JADX WARN: Code restructure failed: missing block: B:118:0x0516, code lost:
            
                if (r5 != null) goto L138;
             */
            /* JADX WARN: Code restructure failed: missing block: B:120:0x051d, code lost:
            
                if (r5.intValue() != 1) goto L141;
             */
            /* JADX WARN: Code restructure failed: missing block: B:121:0x0521, code lost:
            
                if (r0 == null) goto L144;
             */
            /* JADX WARN: Code restructure failed: missing block: B:122:0x0523, code lost:
            
                r0 = r0.intValue();
             */
            /* JADX WARN: Code restructure failed: missing block: B:123:0x0529, code lost:
            
                r13.setTextColor(r0);
                r0 = java.lang.Integer.valueOf(r1);
                r1 = com.sofascore.model.mvvm.model.Event.getWinnerCode$default(r14, null, 1, null);
             */
            /* JADX WARN: Code restructure failed: missing block: B:124:0x0535, code lost:
            
                if (r1 != null) goto L148;
             */
            /* JADX WARN: Code restructure failed: missing block: B:126:0x053d, code lost:
            
                if (r1.intValue() != 2) goto L151;
             */
            /* JADX WARN: Code restructure failed: missing block: B:127:0x053f, code lost:
            
                r13 = r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:128:0x0542, code lost:
            
                if (r13 == null) goto L154;
             */
            /* JADX WARN: Code restructure failed: missing block: B:129:0x0544, code lost:
            
                r0 = r13.intValue();
             */
            /* JADX WARN: Code restructure failed: missing block: B:130:0x054a, code lost:
            
                r15.setTextColor(r0);
                r11.setTextColor(r3);
                r4.setVisibility(8);
             */
            /* JADX WARN: Code restructure failed: missing block: B:133:0x0549, code lost:
            
                r0 = r3;
             */
            /* JADX WARN: Code restructure failed: missing block: B:134:0x0541, code lost:
            
                r13 = null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:135:0x0528, code lost:
            
                r0 = r3;
             */
            /* JADX WARN: Code restructure failed: missing block: B:136:0x0520, code lost:
            
                r0 = null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:138:0x0508, code lost:
            
                if (r0.equals(com.sofascore.model.mvvm.model.StatusKt.STATUS_FINISHED) == false) goto L166;
             */
            /* JADX WARN: Code restructure failed: missing block: B:143:0x0572, code lost:
            
                if (r0.equals(com.sofascore.model.mvvm.model.StatusKt.STATUS_SUSPENDED) == false) goto L166;
             */
            /* JADX WARN: Code restructure failed: missing block: B:144:0x06e3, code lost:
            
                r13.setTextColor(r3);
                r15.setTextColor(r3);
                r11.setTextColor(r3);
                r4.setTextColor(r2);
             */
            /* JADX WARN: Code restructure failed: missing block: B:146:0x057b, code lost:
            
                if (r0.equals(r37) == false) goto L166;
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:149:0x0597  */
            /* JADX WARN: Removed duplicated region for block: B:150:0x05d3  */
            /* JADX WARN: Removed duplicated region for block: B:167:0x06c5  */
            /* JADX WARN: Removed duplicated region for block: B:169:0x06d1  */
            /* JADX WARN: Removed duplicated region for block: B:211:0x078a  */
            /* JADX WARN: Removed duplicated region for block: B:214:0x07c4  */
            /* JADX WARN: Removed duplicated region for block: B:217:0x0af2  */
            /* JADX WARN: Removed duplicated region for block: B:242:0x07c8  */
            /* JADX WARN: Removed duplicated region for block: B:311:0x0acb  */
            /* JADX WARN: Removed duplicated region for block: B:314:0x0ad4  */
            /* JADX WARN: Removed duplicated region for block: B:316:0x0ade  */
            /* JADX WARN: Removed duplicated region for block: B:317:0x0acd  */
            /* JADX WARN: Type inference failed for: r3v17 */
            /* JADX WARN: Type inference failed for: r3v18 */
            /* JADX WARN: Type inference failed for: r3v19, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r4v1, types: [android.view.LayoutInflater] */
            /* JADX WARN: Type inference failed for: r6v1, types: [android.view.ViewGroup, android.widget.LinearLayout] */
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke(Object obj) {
                Event previousEvent;
                final VenueInfoView venueInfoView;
                String str;
                Object obj2;
                boolean z;
                String name;
                nt9 a;
                Map<String, VenueSportStatistics> sportStatistics;
                Event event;
                ImageView imageView;
                ImageView imageView2;
                ImageView imageView3;
                Tournament tournament;
                String y;
                FeatureMatchCardView featureMatchCardView;
                ImageView imageView4;
                ImageView imageView5;
                ImageView imageView6;
                ImageView imageView7;
                xt7 xt7Var;
                TextView textView;
                TextView textView2;
                TextView textView3;
                TextView textView4;
                Object obj3;
                String str2;
                DateTimeFormatter a2;
                String string;
                String j;
                String format;
                Country country;
                Country country2;
                Country country3;
                Country country4;
                int i2 = i;
                VenueSummaryFragment venueSummaryFragment = this.b;
                switch (i2) {
                    case 0:
                        TeamNearEventsResponse teamNearEventsResponse = (TeamNearEventsResponse) obj;
                        if (teamNearEventsResponse != null) {
                            Iterator it = ((ArrayList) ph0.x(new Event[]{teamNearEventsResponse.getPreviousEvent(), teamNearEventsResponse.getNextEvent()})).iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    event = it.next();
                                    Event event2 = (Event) event;
                                    if (ph0.a0(new String[]{StatusKt.STATUS_NOT_STARTED, StatusKt.STATUS_IN_PROGRESS, StatusKt.STATUS_FINISHED}).contains(event2.getStatus().getType())) {
                                        long startTimestamp = event2.getStartTimestamp();
                                        Instant now = Instant.now();
                                        Instant ofEpochSecond = Instant.ofEpochSecond(startTimestamp);
                                        Instant minus = now.minus((TemporalAmount) Duration.ofHours(24L));
                                        if (!ofEpochSecond.isAfter(minus) && !ofEpochSecond.equals(minus)) {
                                        }
                                    }
                                } else {
                                    event = 0;
                                }
                            }
                            Event event3 = event;
                            if (event3 != null) {
                                previousEvent = event3;
                                venueSummaryFragment.u = previousEvent;
                                if (previousEvent != null) {
                                    aok aokVar = (aok) venueSummaryFragment.r.getValue();
                                    xw3.L(un0.z(aokVar), null, null, new znk(aokVar, previousEvent.getId(), null, 0), 3);
                                }
                                krk krkVar3 = venueSummaryFragment.l;
                                krkVar3.getClass();
                                venueInfoView = ((uq8) krkVar3).f;
                                final Venue venue = venueSummaryFragment.C().getVenue();
                                ?? r4 = venueInfoView.e;
                                vy1 vy1Var = venueInfoView.d;
                                venue.getClass();
                                if (venueInfoView.getVisibility() == 0) {
                                    venueInfoView.setVisibility(0);
                                    ?? r6 = vy1Var.b;
                                    ImageView imageView8 = new ImageView(venueInfoView.getContext());
                                    imageView8.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                                    int id = venue.getId();
                                    boolean z2 = as9.a;
                                    String j2 = vxd.j(id, (Intrinsics.c(uaa.c, "api.sofascore.com/") ? "https://img.sofascore.com/" : dmi.q("https://", uaa.c)).concat("api/v1/"), "venue/", "/image");
                                    apf a3 = ajh.a(imageView8.getContext());
                                    ht9 ht9Var = new ht9(imageView8.getContext());
                                    ht9Var.c = j2;
                                    vt9.f(ht9Var, imageView8);
                                    Context context = imageView8.getContext();
                                    context.getClass();
                                    wt9 I = rfo.I(imageView8);
                                    z8e.Q(ht9Var, context, R.drawable.ic_venue_placeholder, (I == null || (a = I.a()) == null) ? null : a.e, null);
                                    Context context2 = imageView8.getContext();
                                    context2.getClass();
                                    float s = ao2.s(8, context2);
                                    Context context3 = imageView8.getContext();
                                    context3.getClass();
                                    float s2 = ao2.s(8, context3);
                                    Context context4 = imageView8.getContext();
                                    context4.getClass();
                                    float s3 = ao2.s(8, context4);
                                    str = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams";
                                    imageView8.getContext().getClass();
                                    awj[] awjVarArr = {new t7g(s, s2, s3, ao2.s(8, r9))};
                                    sl6 sl6Var = st9.a;
                                    st9.b(ht9Var, ph0.X(awjVarArr));
                                    ht9Var.e = new wj9(3, imageView8, imageView8);
                                    a3.a(ht9Var.a());
                                    ViewGroup.LayoutParams layoutParams = imageView8.getLayoutParams();
                                    if (layoutParams != null) {
                                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                                        int i3 = venueInfoView.f;
                                        marginLayoutParams.setMargins(i3, 0, i3, i3);
                                        imageView8.setLayoutParams(marginLayoutParams);
                                        r6.addView(imageView8);
                                        List<Team> mainTeams = venue.getMainTeams();
                                        int size = mainTeams != null ? mainTeams.size() : 0;
                                        if (size > 0) {
                                            StringBuilder sb = new StringBuilder();
                                            List<Team> mainTeams2 = venue.getMainTeams();
                                            if (mainTeams2 != null) {
                                                int i4 = 0;
                                                for (Object obj4 : mainTeams2) {
                                                    int i5 = i4 + 1;
                                                    if (i4 < 0) {
                                                        b.q();
                                                        throw null;
                                                    }
                                                    Team team = (Team) obj4;
                                                    if (qea.y(team)) {
                                                        Context context5 = venueInfoView.getContext();
                                                        context5.getClass();
                                                        sb.append(tba.p(context5, team));
                                                        sb.append(" " + venueInfoView.getContext().getString(R.string.female_team));
                                                    } else {
                                                        Context context6 = venueInfoView.getContext();
                                                        context6.getClass();
                                                        sb.append(tba.p(context6, team));
                                                    }
                                                    if (i4 < size - 1) {
                                                        sb.append(", ");
                                                    }
                                                    i4 = i5;
                                                }
                                            }
                                            cv1 d = cv1.d(r4, r6);
                                            ConstraintLayout constraintLayout = d.b;
                                            ImageView imageView9 = d.e;
                                            d.d.setText(sb.toString());
                                            d.c.setVisibility(8);
                                            TextView textView5 = d.f;
                                            final int i6 = 1;
                                            if (size == 1) {
                                                textView5.setText(R.string.venue_page_home_team);
                                                List<Team> mainTeams3 = venue.getMainTeams();
                                                mainTeams3.getClass();
                                                as9.o(imageView9, mainTeams3.get(0).getId());
                                                constraintLayout.setBackground(null);
                                                constraintLayout.setOnClickListener(new View.OnClickListener() { // from class: gnk
                                                    @Override // android.view.View.OnClickListener
                                                    public final void onClick(View view2) {
                                                        int i7 = i6;
                                                        Venue venue2 = venue;
                                                        VenueInfoView venueInfoView2 = venueInfoView;
                                                        switch (i7) {
                                                            case 0:
                                                                int i8 = VenueInfoView.g;
                                                                Context context7 = venueInfoView2.getContext();
                                                                context7.getClass();
                                                                nv.z0(context7, kv.CLICK, "map_view", "venue_profile");
                                                                LatLonCoordinates venueCoordinates = venue2.getVenueCoordinates();
                                                                Double latitude = venueCoordinates != null ? venueCoordinates.getLatitude() : null;
                                                                LatLonCoordinates venueCoordinates2 = venue2.getVenueCoordinates();
                                                                Double longitude = venueCoordinates2 != null ? venueCoordinates2.getLongitude() : null;
                                                                venueInfoView2.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://maps.google.com/maps?q=loc:" + latitude + BlazeDataSourcePersonalizedType.STRING_SEPARATOR + longitude + " (" + venue2.getName() + ")")));
                                                                break;
                                                            default:
                                                                int i9 = VenueInfoView.g;
                                                                int i10 = TeamActivity.Z;
                                                                Context context8 = venueInfoView2.getContext();
                                                                context8.getClass();
                                                                List<Team> mainTeams4 = venue2.getMainTeams();
                                                                mainTeams4.getClass();
                                                                jle.r(context8, mainTeams4.get(0).getId(), null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                                                                break;
                                                        }
                                                    }
                                                });
                                            } else {
                                                textView5.setText(R.string.venue_page_home_teams);
                                                imageView9.setImageResource(R.drawable.ic_matches);
                                                imageView9.setImageTintList(ColorStateList.valueOf(venueInfoView.getContext().getColor(R.color.n_lv_1)));
                                            }
                                        }
                                        Integer capacity = venue.getCapacity();
                                        if (capacity != null) {
                                            int intValue = capacity.intValue();
                                            cv1 d2 = cv1.d(r4, r6);
                                            ImageView imageView10 = d2.e;
                                            d2.f.setText(R.string.capacity);
                                            d2.d.setText(String.valueOf(intValue));
                                            d2.c.setVisibility(8);
                                            imageView10.setImageResource(R.drawable.ic_team);
                                            imageView10.setImageTintList(ColorStateList.valueOf(venueInfoView.getContext().getColor(R.color.n_lv_1)));
                                        }
                                        Long openedAtTimestamp = venue.getOpenedAtTimestamp();
                                        if (openedAtTimestamp != null) {
                                            long longValue = openedAtTimestamp.longValue();
                                            bi4 bi4Var = bi4.PATTERN_DMMMMY;
                                            ConcurrentHashMap concurrentHashMap = hk4.a;
                                            String i7 = fc6.i(longValue, hk4.a(bi4Var.d()));
                                            int between = (int) ChronoUnit.YEARS.between(vxd.o(Instant.ofEpochMilli(longValue * 1000)), vxd.o(Instant.ofEpochMilli(yaa.v())));
                                            cv1 d3 = cv1.d(r4, r6);
                                            ImageView imageView11 = d3.e;
                                            d3.f.setText(R.string.venue_date_opened);
                                            d3.d.setText(i7 + " • " + venueInfoView.getResources().getQuantityString(R.plurals.venue_opened_years_ago, between, Integer.valueOf(between)));
                                            d3.c.setVisibility(8);
                                            imageView11.setImageResource(R.drawable.ic_calendar_empty);
                                            imageView11.setImageTintList(ColorStateList.valueOf(venueInfoView.getContext().getColor(R.color.n_lv_1)));
                                        }
                                        View inflate = r4.inflate(R.layout.summary_info_location_row_layout, r6, false);
                                        r6.addView(inflate);
                                        int i8 = R.id.cta_location;
                                        TextView textView6 = (TextView) nq8.B(R.id.cta_location, inflate);
                                        if (textView6 != null) {
                                            i8 = R.id.info_icon;
                                            if (((ImageView) nq8.B(R.id.info_icon, inflate)) != null) {
                                                i8 = R.id.text_lower;
                                                TextView textView7 = (TextView) nq8.B(R.id.text_lower, inflate);
                                                if (textView7 != null) {
                                                    i8 = R.id.text_upper;
                                                    if (((TextView) nq8.B(R.id.text_upper, inflate)) != null) {
                                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) inflate;
                                                        Country country5 = venue.getCountry();
                                                        textView7.setText((country5 == null || (name = country5.getName()) == null) ? venue.getCity().getName() : wv8.i(venue.getCity().getName(), ", ", name));
                                                        LatLonCoordinates venueCoordinates = venue.getVenueCoordinates();
                                                        if ((venueCoordinates != null ? venueCoordinates.getLatitude() : null) != null) {
                                                            LatLonCoordinates venueCoordinates2 = venue.getVenueCoordinates();
                                                            if ((venueCoordinates2 != null ? venueCoordinates2.getLongitude() : null) != null) {
                                                                z = true;
                                                                textView6.setVisibility(!z ? 0 : 8);
                                                                if (z) {
                                                                    constraintLayout2.setBackground(null);
                                                                } else {
                                                                    final int i9 = 0;
                                                                    constraintLayout2.setOnClickListener(new View.OnClickListener() { // from class: gnk
                                                                        @Override // android.view.View.OnClickListener
                                                                        public final void onClick(View view2) {
                                                                            int i72 = i9;
                                                                            Venue venue2 = venue;
                                                                            VenueInfoView venueInfoView2 = venueInfoView;
                                                                            switch (i72) {
                                                                                case 0:
                                                                                    int i82 = VenueInfoView.g;
                                                                                    Context context7 = venueInfoView2.getContext();
                                                                                    context7.getClass();
                                                                                    nv.z0(context7, kv.CLICK, "map_view", "venue_profile");
                                                                                    LatLonCoordinates venueCoordinates3 = venue2.getVenueCoordinates();
                                                                                    Double latitude = venueCoordinates3 != null ? venueCoordinates3.getLatitude() : null;
                                                                                    LatLonCoordinates venueCoordinates22 = venue2.getVenueCoordinates();
                                                                                    Double longitude = venueCoordinates22 != null ? venueCoordinates22.getLongitude() : null;
                                                                                    venueInfoView2.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://maps.google.com/maps?q=loc:" + latitude + BlazeDataSourcePersonalizedType.STRING_SEPARATOR + longitude + " (" + venue2.getName() + ")")));
                                                                                    break;
                                                                                default:
                                                                                    int i92 = VenueInfoView.g;
                                                                                    int i10 = TeamActivity.Z;
                                                                                    Context context8 = venueInfoView2.getContext();
                                                                                    context8.getClass();
                                                                                    List<Team> mainTeams4 = venue2.getMainTeams();
                                                                                    mainTeams4.getClass();
                                                                                    jle.r(context8, mainTeams4.get(0).getId(), null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                                                                                    break;
                                                                            }
                                                                        }
                                                                    });
                                                                }
                                                                venueInfoView.invalidate();
                                                                venueInfoView.requestLayout();
                                                            }
                                                        }
                                                        z = false;
                                                        textView6.setVisibility(!z ? 0 : 8);
                                                        if (z) {
                                                        }
                                                        venueInfoView.invalidate();
                                                        venueInfoView.requestLayout();
                                                    }
                                                }
                                            }
                                        }
                                        obj2 = null;
                                        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i8)));
                                    } else {
                                        obj2 = null;
                                        yhk.s(str);
                                    }
                                    return obj2;
                                }
                                str = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams";
                                sportStatistics = venueSummaryFragment.C().getSportStatistics();
                                if (sportStatistics != null) {
                                    krk krkVar4 = venueSummaryFragment.l;
                                    krkVar4.getClass();
                                    VenueHighlightsView venueHighlightsView = ((uq8) krkVar4).e;
                                    vy1 vy1Var2 = venueHighlightsView.d;
                                    if (venueHighlightsView.getVisibility() != 0 && !sportStatistics.isEmpty()) {
                                        venueHighlightsView.g = sportStatistics;
                                        venueHighlightsView.setVisibility(0);
                                        kqb d4 = kqb.d(venueHighlightsView.e, vy1Var2.b, true);
                                        TextView textView8 = d4.d;
                                        Context context7 = venueHighlightsView.getContext();
                                        context7.getClass();
                                        int s4 = ao2.s(6, context7);
                                        d4.c.setVisibility(8);
                                        textView8.setText(venueHighlightsView.getContext().getString(R.string.venue_highlights));
                                        ViewGroup.LayoutParams layoutParams2 = textView8.getLayoutParams();
                                        if (layoutParams2 == null) {
                                            obj2 = null;
                                            yhk.s(str);
                                            return obj2;
                                        }
                                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                                        marginLayoutParams2.setMargins(0, s4, 0, s4);
                                        textView8.setLayoutParams(marginLayoutParams2);
                                        Set<Map.Entry<String, VenueSportStatistics>> entrySet = sportStatistics.entrySet();
                                        ArrayList arrayList = new ArrayList(k13.r(entrySet, 10));
                                        Iterator it2 = entrySet.iterator();
                                        while (it2.hasNext()) {
                                            arrayList.add((String) ((Map.Entry) it2.next()).getKey());
                                        }
                                        if (arrayList.size() > 1) {
                                            ArrayList arrayList2 = new ArrayList(k13.r(arrayList, 10));
                                            Iterator it3 = arrayList.iterator();
                                            while (it3.hasNext()) {
                                                String str3 = (String) it3.next();
                                                Context context8 = venueHighlightsView.getContext();
                                                context8.getClass();
                                                arrayList2.add(new vt2(str3, wyh.c(context8, str3), false, new tc3(954637713, new fj4(str3, 2), true), null, null, null, 244));
                                            }
                                            Context context9 = venueHighlightsView.getContext();
                                            context9.getClass();
                                            TypeHeaderView typeHeaderView = new TypeHeaderView(context9, null, 6);
                                            g5k g5kVar = new g5k(typeHeaderView);
                                            g5kVar.b = arrayList2;
                                            g5kVar.k = true;
                                            g5kVar.m = new ur1(venueHighlightsView, 24);
                                            g5kVar.b();
                                            vy1Var2.b.addView(typeHeaderView);
                                        }
                                        venueHighlightsView.l((String) CollectionsKt.Y(arrayList));
                                    }
                                }
                                return Unit.a;
                            }
                        }
                        previousEvent = teamNearEventsResponse != null ? teamNearEventsResponse.getPreviousEvent() : null;
                        venueSummaryFragment.u = previousEvent;
                        if (previousEvent != null) {
                        }
                        krk krkVar32 = venueSummaryFragment.l;
                        krkVar32.getClass();
                        venueInfoView = ((uq8) krkVar32).f;
                        final Venue venue2 = venueSummaryFragment.C().getVenue();
                        ?? r42 = venueInfoView.e;
                        vy1 vy1Var3 = venueInfoView.d;
                        venue2.getClass();
                        if (venueInfoView.getVisibility() == 0) {
                        }
                        sportStatistics = venueSummaryFragment.C().getSportStatistics();
                        if (sportStatistics != null) {
                        }
                        return Unit.a;
                    default:
                        EventResponse eventResponse = (EventResponse) obj;
                        venueSummaryFragment.n();
                        if (eventResponse != null) {
                            venueSummaryFragment.u = eventResponse.getEvent();
                            krk krkVar5 = venueSummaryFragment.l;
                            krkVar5.getClass();
                            FeatureMatchCardView featureMatchCardView2 = ((uq8) krkVar5).b;
                            Event event4 = venueSummaryFragment.u;
                            if (event4 != null) {
                                Tournament tournament2 = event4.getTournament();
                                Category category = event4.getTournament().getCategory();
                                Round roundInfo = event4.getRoundInfo();
                                xt7 xt7Var2 = featureMatchCardView2.k;
                                pn2 pn2Var = (pn2) xt7Var2.x;
                                TextView textView9 = xt7Var2.o;
                                TextView textView10 = xt7Var2.p;
                                TextView textView11 = xt7Var2.q;
                                TextView textView12 = xt7Var2.n;
                                ImageView imageView12 = xt7Var2.e;
                                ImageView imageView13 = (ImageView) xt7Var2.v;
                                ImageView imageView14 = xt7Var2.m;
                                ConstraintLayout constraintLayout3 = xt7Var2.b;
                                TextView textView13 = xt7Var2.d;
                                TextView textView14 = xt7Var2.i;
                                TextView textView15 = xt7Var2.c;
                                TextView textView16 = xt7Var2.j;
                                ImageView imageView15 = (ImageView) xt7Var2.u;
                                ImageView imageView16 = xt7Var2.k;
                                pn2Var.b.setBackground(null);
                                TextView textView17 = pn2Var.e;
                                textView17.setMaxLines(1);
                                textView17.setEllipsize(TextUtils.TruncateAt.END);
                                if (t62.J(category)) {
                                    imageView = imageView13;
                                    imageView2 = imageView15;
                                    imageView3 = imageView16;
                                    tournament = tournament2;
                                    String w = tba.w(tournament);
                                    Regex regex = d7g.a;
                                    Context context10 = featureMatchCardView2.getContext();
                                    context10.getClass();
                                    y = dmi.y(w, d7g.b(context10, roundInfo, true, category.getSport().getSlug()));
                                } else {
                                    Context context11 = featureMatchCardView2.getContext();
                                    context11.getClass();
                                    String u = o3a.u(context11, tournament2);
                                    tournament = tournament2;
                                    String w2 = tba.w(tournament);
                                    Regex regex2 = d7g.a;
                                    imageView = imageView13;
                                    Context context12 = featureMatchCardView2.getContext();
                                    context12.getClass();
                                    imageView3 = imageView16;
                                    imageView2 = imageView15;
                                    y = fc6.n(u, ", ", w2, d7g.b(context12, roundInfo, true, category.getSport().getSlug()));
                                }
                                textView17.setText(y);
                                ImageView imageView17 = pn2Var.d;
                                UniqueTournament uniqueTournament = tournament.getUniqueTournament();
                                as9.q(imageView17, Integer.valueOf(uniqueTournament != null ? uniqueTournament.getId() : 0), tournament.getId(), null);
                                String slug = event4.getTournament().getCategory().getSport().getSlug();
                                boolean z3 = Event.getHomeTeam$default(event4, null, 1, null).hasSubTeams() && Event.getAwayTeam$default(event4, null, 1, null).hasSubTeams();
                                Team homeTeam$default = Event.getHomeTeam$default(event4, null, 1, null);
                                Team awayTeam$default = Event.getAwayTeam$default(event4, null, 1, null);
                                boolean z4 = Intrinsics.c(slug, Sports.TENNIS) && z3;
                                boolean shouldReverseTeams = event4.shouldReverseTeams();
                                if (z4) {
                                    textView16.setVisibility(0);
                                    textView13.setVisibility(0);
                                    SubTeam subTeam1 = homeTeam$default.getSubTeam1();
                                    Context context13 = featureMatchCardView2.getContext();
                                    context13.getClass();
                                    textView14.setText(tba.v(subTeam1, context13));
                                    textView14.setMaxLines(1);
                                    SubTeam subTeam2 = homeTeam$default.getSubTeam2();
                                    Context context14 = featureMatchCardView2.getContext();
                                    context14.getClass();
                                    textView16.setText(tba.v(subTeam2, context14));
                                    SubTeam subTeam12 = awayTeam$default.getSubTeam1();
                                    Context context15 = featureMatchCardView2.getContext();
                                    context15.getClass();
                                    textView15.setText(tba.v(subTeam12, context15));
                                    textView15.setMaxLines(1);
                                    SubTeam subTeam22 = awayTeam$default.getSubTeam2();
                                    Context context16 = featureMatchCardView2.getContext();
                                    context16.getClass();
                                    textView13.setText(tba.v(subTeam22, context16));
                                } else {
                                    textView14.setMaxLines(2);
                                    Context context17 = textView14.getContext();
                                    context17.getClass();
                                    textView14.setText(tba.p(context17, homeTeam$default));
                                    textView15.setMaxLines(2);
                                    Context context18 = textView15.getContext();
                                    context18.getClass();
                                    textView15.setText(qea.K(tba.p(context18, awayTeam$default), shouldReverseTeams));
                                }
                                Team homeTeam$default2 = Event.getHomeTeam$default(event4, null, 1, null);
                                Team awayTeam$default2 = Event.getAwayTeam$default(event4, null, 1, null);
                                boolean z5 = Intrinsics.c(slug, Sports.TENNIS) && z3;
                                int i10 = featureMatchCardView2.j;
                                int i11 = featureMatchCardView2.i;
                                int i12 = featureMatchCardView2.h;
                                SubTeam subTeam13 = homeTeam$default2.getSubTeam1();
                                SubTeam subTeam23 = homeTeam$default2.getSubTeam2();
                                boolean z6 = z5;
                                SubTeam subTeam14 = awayTeam$default2.getSubTeam1();
                                boolean z7 = z3;
                                SubTeam subTeam24 = awayTeam$default2.getSubTeam2();
                                if (!z6 || subTeam13 == null || subTeam23 == null || subTeam14 == null || subTeam24 == null) {
                                    featureMatchCardView = featureMatchCardView2;
                                    imageView4 = imageView14;
                                    imageView5 = imageView;
                                    imageView6 = imageView3;
                                    imageView7 = imageView2;
                                    ViewGroup.LayoutParams layoutParams3 = imageView7.getLayoutParams();
                                    layoutParams3.width = i10;
                                    layoutParams3.height = i10;
                                    imageView7.setLayoutParams(layoutParams3);
                                    ViewGroup.LayoutParams layoutParams4 = imageView6.getLayoutParams();
                                    layoutParams4.width = i10;
                                    layoutParams4.height = i10;
                                    imageView6.setLayoutParams(layoutParams4);
                                    as9.o(imageView7, homeTeam$default2.getId());
                                    as9.o(imageView6, awayTeam$default2.getId());
                                } else {
                                    mm3 mm3Var = new mm3();
                                    mm3Var.e(constraintLayout3);
                                    mm3Var.r(R.id.home_team_logo_1, 6, i12);
                                    featureMatchCardView = featureMatchCardView2;
                                    mm3Var.r(R.id.home_team_logo_1, 4, featureMatchCardView2.g);
                                    mm3Var.r(R.id.away_team_logo_1, 7, i12);
                                    mm3Var.a(constraintLayout3);
                                    ViewGroup.LayoutParams layoutParams5 = imageView2.getLayoutParams();
                                    layoutParams5.width = i11;
                                    layoutParams5.height = i11;
                                    imageView7 = imageView2;
                                    imageView7.setLayoutParams(layoutParams5);
                                    ViewGroup.LayoutParams layoutParams6 = imageView3.getLayoutParams();
                                    layoutParams6.width = i11;
                                    layoutParams6.height = i11;
                                    imageView6 = imageView3;
                                    imageView6.setLayoutParams(layoutParams6);
                                    imageView5 = imageView;
                                    imageView5.setVisibility(0);
                                    imageView4 = imageView14;
                                    imageView4.setVisibility(0);
                                    as9.o(imageView7, subTeam13.getId());
                                    as9.o(imageView5, subTeam23.getId());
                                    as9.o(imageView6, subTeam24.getId());
                                    as9.o(imageView4, subTeam14.getId());
                                    textView16.setVisibility(0);
                                    textView13.setVisibility(0);
                                    Context context19 = featureMatchCardView.getContext();
                                    context19.getClass();
                                    textView14.setText(tba.v(subTeam13, context19));
                                    textView14.setMaxLines(1);
                                    Context context20 = featureMatchCardView.getContext();
                                    context20.getClass();
                                    textView16.setText(tba.v(subTeam23, context20));
                                    Context context21 = featureMatchCardView.getContext();
                                    context21.getClass();
                                    textView15.setText(tba.v(subTeam14, context21));
                                    textView15.setMaxLines(1);
                                    Context context22 = featureMatchCardView.getContext();
                                    context22.getClass();
                                    textView13.setText(tba.v(subTeam24, context22));
                                }
                                if (event4 instanceof TennisEvent) {
                                    String homeTeamSeed$default = Event.getHomeTeamSeed$default(event4, null, 1, null);
                                    String awayTeamSeed$default = Event.getAwayTeamSeed$default(event4, null, 1, null);
                                    xt7Var = xt7Var2;
                                    if (homeTeamSeed$default != null) {
                                        TextView textView18 = xt7Var.l;
                                        Context context23 = textView18.getContext();
                                        context23.getClass();
                                        textView18.setBackgroundTintList(ColorStateList.valueOf(uaa.o(context23, homeTeamSeed$default)));
                                        textView18.setVisibility(0);
                                        Context context24 = textView18.getContext();
                                        context24.getClass();
                                        textView18.setText(uaa.q(context24, homeTeamSeed$default));
                                        if (z7) {
                                            ViewGroup.LayoutParams layoutParams7 = textView18.getLayoutParams();
                                            if (layoutParams7 == null) {
                                                yhk.s("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                                                return null;
                                            }
                                            tl3 tl3Var = (tl3) layoutParams7;
                                            tl3Var.t = imageView5.getId();
                                            tl3Var.v = imageView7.getId();
                                            textView18.setLayoutParams(tl3Var);
                                        }
                                    }
                                    if (awayTeamSeed$default != null) {
                                        TextView textView19 = xt7Var.f;
                                        Context context25 = textView19.getContext();
                                        context25.getClass();
                                        textView19.setBackgroundTintList(ColorStateList.valueOf(uaa.o(context25, awayTeamSeed$default)));
                                        textView19.setVisibility(0);
                                        Context context26 = textView19.getContext();
                                        context26.getClass();
                                        textView19.setText(uaa.q(context26, awayTeamSeed$default));
                                        if (z7) {
                                            ViewGroup.LayoutParams layoutParams8 = textView19.getLayoutParams();
                                            if (layoutParams8 == null) {
                                                yhk.s("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                                                return null;
                                            }
                                            tl3 tl3Var2 = (tl3) layoutParams8;
                                            tl3Var2.t = imageView4.getId();
                                            tl3Var2.v = imageView6.getId();
                                            textView19.setLayoutParams(tl3Var2);
                                        }
                                    }
                                    if (!ok3.G(event4)) {
                                        Team homeTeam$default3 = Event.getHomeTeam$default(event4, null, 1, null);
                                        Team awayTeam$default3 = Event.getAwayTeam$default(event4, null, 1, null);
                                        ImageView imageView18 = xt7Var.r;
                                        if (z7) {
                                            SubTeam subTeam15 = homeTeam$default3.getSubTeam1();
                                            as9.c(imageView18, (subTeam15 == null || (country4 = subTeam15.getCountry()) == null) ? null : country4.getAlpha2(), true, null, 4);
                                            SubTeam subTeam25 = awayTeam$default3.getSubTeam2();
                                            as9.c(imageView12, (subTeam25 == null || (country3 = subTeam25.getCountry()) == null) ? null : country3.getAlpha2(), true, null, 4);
                                            ImageView imageView19 = (ImageView) xt7Var.t;
                                            SubTeam subTeam26 = homeTeam$default3.getSubTeam2();
                                            as9.c(imageView19, (subTeam26 == null || (country2 = subTeam26.getCountry()) == null) ? null : country2.getAlpha2(), true, null, 4);
                                            ImageView imageView20 = xt7Var.g;
                                            SubTeam subTeam16 = awayTeam$default3.getSubTeam1();
                                            as9.c(imageView20, (subTeam16 == null || (country = subTeam16.getCountry()) == null) ? null : country.getAlpha2(), true, null, 4);
                                        } else {
                                            Country country6 = homeTeam$default3.getCountry();
                                            as9.c(imageView18, country6 != null ? country6.getAlpha2() : null, true, null, 4);
                                            Country country7 = awayTeam$default3.getCountry();
                                            as9.c(imageView12, country7 != null ? country7.getAlpha2() : null, true, null, 4);
                                        }
                                    }
                                } else {
                                    xt7Var = xt7Var2;
                                }
                                FeatureMatchCardView featureMatchCardView3 = featureMatchCardView;
                                int i13 = featureMatchCardView3.d;
                                int i14 = featureMatchCardView3.f;
                                int i15 = featureMatchCardView3.e;
                                if (ph0.a0(new String[]{StatusKt.STATUS_FINISHED, StatusKt.STATUS_WILL_CONTINUE, StatusKt.STATUS_IN_PROGRESS, StatusKt.STATUS_SUSPENDED, StatusKt.STATUS_INTERRUPTED}).contains(event4.getStatus().getType())) {
                                    textView4 = textView12;
                                    textView4.setVisibility(8);
                                    textView3 = textView11;
                                    textView3.setVisibility(0);
                                    textView2 = textView10;
                                    textView2.setVisibility(0);
                                    textView = textView9;
                                    textView.setVisibility(0);
                                } else {
                                    textView = textView9;
                                    textView2 = textView10;
                                    textView3 = textView11;
                                    textView4 = textView12;
                                }
                                TextView textView20 = xt7Var.h;
                                Integer display = Event.getHomeScore$default(event4, null, 1, null).getDisplay();
                                if (display != null) {
                                    String valueOf = String.valueOf(display.intValue());
                                    obj3 = StatusKt.STATUS_INTERRUPTED;
                                    str2 = valueOf;
                                } else {
                                    obj3 = StatusKt.STATUS_INTERRUPTED;
                                    str2 = null;
                                }
                                textView2.setText(str2);
                                Integer display2 = Event.getAwayScore$default(event4, null, 1, null).getDisplay();
                                textView.setText(display2 != null ? String.valueOf(display2.intValue()) : null);
                                textView4.setPaintFlags(textView4.getPaintFlags() & (-17));
                                textView4.setTextColor(i13);
                                textView20.setTextColor(i15);
                                Time time = event4.getTime();
                                StatusTime statusTime = time != null ? time.getStatusTime() : null;
                                if (statusTime != null) {
                                    l4a.K(textView20, z8e.H(statusTime, xe6.c().b));
                                } else {
                                    Context context27 = featureMatchCardView3.getContext();
                                    context27.getClass();
                                    textView20.setText(pd0.u(context27, event4));
                                }
                                textView20.setVisibility(0);
                                String type = event4.getStatus().getType();
                                Locale locale = Locale.US;
                                String k = i.k(locale, type, locale);
                                int i16 = 16;
                                switch (k.hashCode()) {
                                    case -1947652542:
                                        break;
                                    case -1661628965:
                                        break;
                                    case -1411655086:
                                        if (k.equals(StatusKt.STATUS_IN_PROGRESS)) {
                                            textView2.setTextColor(i14);
                                            textView.setTextColor(i14);
                                            textView3.setTextColor(i14);
                                            textView20.setTextColor(i14);
                                            break;
                                        }
                                        if (!ph0.a0(new String[]{StatusKt.STATUS_CANCELED, StatusKt.STATUS_POSTPONED}).contains(event4.getStatus().getType())) {
                                            textView4.setVisibility(0);
                                            textView3.setVisibility(8);
                                            textView2.setVisibility(8);
                                            textView.setVisibility(8);
                                            textView4.setPaintFlags(textView4.getPaintFlags() | 16);
                                            long startTimestamp2 = event4.getStartTimestamp();
                                            bi4 bi4Var2 = bi4.PATTERN_DMY_SHORT;
                                            ConcurrentHashMap concurrentHashMap2 = hk4.a;
                                            String format2 = hk4.a(bi4Var2.d()).format(Instant.ofEpochSecond(startTimestamp2));
                                            format2.getClass();
                                            textView4.setText(format2);
                                            textView4.setTextColor(i15);
                                            textView20.setTextColor(i14);
                                            break;
                                        } else {
                                            textView4.setVisibility(0);
                                            textView3.setVisibility(8);
                                            textView2.setVisibility(8);
                                            textView.setVisibility(8);
                                            long startTimestamp3 = event4.getStartTimestamp();
                                            long j3 = startTimestamp3 * 1000;
                                            if ((j3 - System.currentTimeMillis()) / 86400000 >= 1) {
                                                int between2 = (int) ChronoUnit.DAYS.between(vxd.o(Instant.ofEpochMilli(yaa.v())), vxd.o(Instant.ofEpochMilli(j3)));
                                                if (between2 == 1) {
                                                    format = textView4.getContext().getString(R.string.tomorrow);
                                                } else {
                                                    Locale d5 = dla.d();
                                                    String string2 = textView4.getContext().getString(R.string.in_n_days);
                                                    string2.getClass();
                                                    format = String.format(d5, string2, Arrays.copyOf(new Object[]{Integer.valueOf(between2)}, 1));
                                                }
                                                textView4.setText(format);
                                                Context context28 = textView20.getContext();
                                                context28.getClass();
                                                textView20.setText(rik.j(context28, event4.getStartTimestamp(), bi4.PATTERN_DDMMY, " "));
                                                break;
                                            } else {
                                                if (!ug5.u(startTimestamp3)) {
                                                    if (ug5.w(startTimestamp3)) {
                                                        string = featureMatchCardView3.getContext().getString(R.string.yesterday);
                                                    } else if (ug5.v(startTimestamp3)) {
                                                        string = featureMatchCardView3.getContext().getString(R.string.tomorrow);
                                                    } else {
                                                        bi4 bi4Var3 = bi4.PATTERN_DDMMY;
                                                        ConcurrentHashMap concurrentHashMap3 = hk4.a;
                                                        a2 = hk4.a(bi4Var3.d());
                                                    }
                                                    textView4.setText(string);
                                                    if (ug5.u(startTimestamp3)) {
                                                        Context context29 = featureMatchCardView3.getContext();
                                                        context29.getClass();
                                                        j = rik.j(context29, startTimestamp3, bi4.PATTERN_DDMMY, " ");
                                                    } else {
                                                        j = featureMatchCardView3.getContext().getString(R.string.today);
                                                    }
                                                    textView20.setText(j);
                                                    break;
                                                } else {
                                                    Context context30 = featureMatchCardView3.getContext();
                                                    context30.getClass();
                                                    String bestPattern = hk4.b().getBestPattern(DateFormat.is24HourFormat(context30) ? "Hm" : "hm");
                                                    bestPattern.getClass();
                                                    a2 = hk4.a(bestPattern);
                                                }
                                                string = fc6.i(startTimestamp3, a2);
                                                textView4.setText(string);
                                                if (ug5.u(startTimestamp3)) {
                                                }
                                                textView20.setText(j);
                                            }
                                        }
                                    case -673660814:
                                        break;
                                    case 527231609:
                                        break;
                                    default:
                                        if (!ph0.a0(new String[]{StatusKt.STATUS_CANCELED, StatusKt.STATUS_POSTPONED}).contains(event4.getStatus().getType())) {
                                        }
                                        break;
                                }
                                featureMatchCardView3.setVisibility(0);
                                featureMatchCardView3.setOpenEventClick(new fej(i16, venueSummaryFragment, event4));
                                featureMatchCardView3.setCtaClick(new vnk(venueSummaryFragment, 1));
                            }
                        }
                        return Unit.a;
                }
            }
        }));
        final int i2 = 1;
        ((aok) otkVar.getValue()).j.e(getViewLifecycleOwner(), new ioe(28, new Function1(this) { // from class: wnk
            public final /* synthetic */ VenueSummaryFragment b;

            {
                this.b = this;
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Code restructure failed: missing block: B:116:0x0500, code lost:
            
                if (r0.equals(com.sofascore.model.mvvm.model.StatusKt.STATUS_WILL_CONTINUE) == false) goto L166;
             */
            /* JADX WARN: Code restructure failed: missing block: B:117:0x050c, code lost:
            
                r0 = java.lang.Integer.valueOf(r1);
                r5 = com.sofascore.model.mvvm.model.Event.getWinnerCode$default(r14, null, 1, null);
             */
            /* JADX WARN: Code restructure failed: missing block: B:118:0x0516, code lost:
            
                if (r5 != null) goto L138;
             */
            /* JADX WARN: Code restructure failed: missing block: B:120:0x051d, code lost:
            
                if (r5.intValue() != 1) goto L141;
             */
            /* JADX WARN: Code restructure failed: missing block: B:121:0x0521, code lost:
            
                if (r0 == null) goto L144;
             */
            /* JADX WARN: Code restructure failed: missing block: B:122:0x0523, code lost:
            
                r0 = r0.intValue();
             */
            /* JADX WARN: Code restructure failed: missing block: B:123:0x0529, code lost:
            
                r13.setTextColor(r0);
                r0 = java.lang.Integer.valueOf(r1);
                r1 = com.sofascore.model.mvvm.model.Event.getWinnerCode$default(r14, null, 1, null);
             */
            /* JADX WARN: Code restructure failed: missing block: B:124:0x0535, code lost:
            
                if (r1 != null) goto L148;
             */
            /* JADX WARN: Code restructure failed: missing block: B:126:0x053d, code lost:
            
                if (r1.intValue() != 2) goto L151;
             */
            /* JADX WARN: Code restructure failed: missing block: B:127:0x053f, code lost:
            
                r13 = r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:128:0x0542, code lost:
            
                if (r13 == null) goto L154;
             */
            /* JADX WARN: Code restructure failed: missing block: B:129:0x0544, code lost:
            
                r0 = r13.intValue();
             */
            /* JADX WARN: Code restructure failed: missing block: B:130:0x054a, code lost:
            
                r15.setTextColor(r0);
                r11.setTextColor(r3);
                r4.setVisibility(8);
             */
            /* JADX WARN: Code restructure failed: missing block: B:133:0x0549, code lost:
            
                r0 = r3;
             */
            /* JADX WARN: Code restructure failed: missing block: B:134:0x0541, code lost:
            
                r13 = null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:135:0x0528, code lost:
            
                r0 = r3;
             */
            /* JADX WARN: Code restructure failed: missing block: B:136:0x0520, code lost:
            
                r0 = null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:138:0x0508, code lost:
            
                if (r0.equals(com.sofascore.model.mvvm.model.StatusKt.STATUS_FINISHED) == false) goto L166;
             */
            /* JADX WARN: Code restructure failed: missing block: B:143:0x0572, code lost:
            
                if (r0.equals(com.sofascore.model.mvvm.model.StatusKt.STATUS_SUSPENDED) == false) goto L166;
             */
            /* JADX WARN: Code restructure failed: missing block: B:144:0x06e3, code lost:
            
                r13.setTextColor(r3);
                r15.setTextColor(r3);
                r11.setTextColor(r3);
                r4.setTextColor(r2);
             */
            /* JADX WARN: Code restructure failed: missing block: B:146:0x057b, code lost:
            
                if (r0.equals(r37) == false) goto L166;
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:149:0x0597  */
            /* JADX WARN: Removed duplicated region for block: B:150:0x05d3  */
            /* JADX WARN: Removed duplicated region for block: B:167:0x06c5  */
            /* JADX WARN: Removed duplicated region for block: B:169:0x06d1  */
            /* JADX WARN: Removed duplicated region for block: B:211:0x078a  */
            /* JADX WARN: Removed duplicated region for block: B:214:0x07c4  */
            /* JADX WARN: Removed duplicated region for block: B:217:0x0af2  */
            /* JADX WARN: Removed duplicated region for block: B:242:0x07c8  */
            /* JADX WARN: Removed duplicated region for block: B:311:0x0acb  */
            /* JADX WARN: Removed duplicated region for block: B:314:0x0ad4  */
            /* JADX WARN: Removed duplicated region for block: B:316:0x0ade  */
            /* JADX WARN: Removed duplicated region for block: B:317:0x0acd  */
            /* JADX WARN: Type inference failed for: r3v17 */
            /* JADX WARN: Type inference failed for: r3v18 */
            /* JADX WARN: Type inference failed for: r3v19, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r4v1, types: [android.view.LayoutInflater] */
            /* JADX WARN: Type inference failed for: r6v1, types: [android.view.ViewGroup, android.widget.LinearLayout] */
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke(Object obj) {
                Event previousEvent;
                final VenueInfoView venueInfoView;
                String str;
                Object obj2;
                boolean z;
                String name;
                nt9 a;
                Map<String, VenueSportStatistics> sportStatistics;
                Event event;
                ImageView imageView;
                ImageView imageView2;
                ImageView imageView3;
                Tournament tournament;
                String y;
                FeatureMatchCardView featureMatchCardView;
                ImageView imageView4;
                ImageView imageView5;
                ImageView imageView6;
                ImageView imageView7;
                xt7 xt7Var;
                TextView textView;
                TextView textView2;
                TextView textView3;
                TextView textView4;
                Object obj3;
                String str2;
                DateTimeFormatter a2;
                String string;
                String j;
                String format;
                Country country;
                Country country2;
                Country country3;
                Country country4;
                int i22 = i2;
                VenueSummaryFragment venueSummaryFragment = this.b;
                switch (i22) {
                    case 0:
                        TeamNearEventsResponse teamNearEventsResponse = (TeamNearEventsResponse) obj;
                        if (teamNearEventsResponse != null) {
                            Iterator it = ((ArrayList) ph0.x(new Event[]{teamNearEventsResponse.getPreviousEvent(), teamNearEventsResponse.getNextEvent()})).iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    event = it.next();
                                    Event event2 = (Event) event;
                                    if (ph0.a0(new String[]{StatusKt.STATUS_NOT_STARTED, StatusKt.STATUS_IN_PROGRESS, StatusKt.STATUS_FINISHED}).contains(event2.getStatus().getType())) {
                                        long startTimestamp = event2.getStartTimestamp();
                                        Instant now = Instant.now();
                                        Instant ofEpochSecond = Instant.ofEpochSecond(startTimestamp);
                                        Instant minus = now.minus((TemporalAmount) Duration.ofHours(24L));
                                        if (!ofEpochSecond.isAfter(minus) && !ofEpochSecond.equals(minus)) {
                                        }
                                    }
                                } else {
                                    event = 0;
                                }
                            }
                            Event event3 = event;
                            if (event3 != null) {
                                previousEvent = event3;
                                venueSummaryFragment.u = previousEvent;
                                if (previousEvent != null) {
                                    aok aokVar = (aok) venueSummaryFragment.r.getValue();
                                    xw3.L(un0.z(aokVar), null, null, new znk(aokVar, previousEvent.getId(), null, 0), 3);
                                }
                                krk krkVar32 = venueSummaryFragment.l;
                                krkVar32.getClass();
                                venueInfoView = ((uq8) krkVar32).f;
                                final Venue venue2 = venueSummaryFragment.C().getVenue();
                                ?? r42 = venueInfoView.e;
                                vy1 vy1Var3 = venueInfoView.d;
                                venue2.getClass();
                                if (venueInfoView.getVisibility() == 0) {
                                    venueInfoView.setVisibility(0);
                                    ?? r6 = vy1Var3.b;
                                    ImageView imageView8 = new ImageView(venueInfoView.getContext());
                                    imageView8.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                                    int id = venue2.getId();
                                    boolean z2 = as9.a;
                                    String j2 = vxd.j(id, (Intrinsics.c(uaa.c, "api.sofascore.com/") ? "https://img.sofascore.com/" : dmi.q("https://", uaa.c)).concat("api/v1/"), "venue/", "/image");
                                    apf a3 = ajh.a(imageView8.getContext());
                                    ht9 ht9Var = new ht9(imageView8.getContext());
                                    ht9Var.c = j2;
                                    vt9.f(ht9Var, imageView8);
                                    Context context = imageView8.getContext();
                                    context.getClass();
                                    wt9 I = rfo.I(imageView8);
                                    z8e.Q(ht9Var, context, R.drawable.ic_venue_placeholder, (I == null || (a = I.a()) == null) ? null : a.e, null);
                                    Context context2 = imageView8.getContext();
                                    context2.getClass();
                                    float s = ao2.s(8, context2);
                                    Context context3 = imageView8.getContext();
                                    context3.getClass();
                                    float s2 = ao2.s(8, context3);
                                    Context context4 = imageView8.getContext();
                                    context4.getClass();
                                    float s3 = ao2.s(8, context4);
                                    str = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams";
                                    imageView8.getContext().getClass();
                                    awj[] awjVarArr = {new t7g(s, s2, s3, ao2.s(8, r9))};
                                    sl6 sl6Var = st9.a;
                                    st9.b(ht9Var, ph0.X(awjVarArr));
                                    ht9Var.e = new wj9(3, imageView8, imageView8);
                                    a3.a(ht9Var.a());
                                    ViewGroup.LayoutParams layoutParams = imageView8.getLayoutParams();
                                    if (layoutParams != null) {
                                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                                        int i3 = venueInfoView.f;
                                        marginLayoutParams.setMargins(i3, 0, i3, i3);
                                        imageView8.setLayoutParams(marginLayoutParams);
                                        r6.addView(imageView8);
                                        List<Team> mainTeams = venue2.getMainTeams();
                                        int size = mainTeams != null ? mainTeams.size() : 0;
                                        if (size > 0) {
                                            StringBuilder sb = new StringBuilder();
                                            List<Team> mainTeams2 = venue2.getMainTeams();
                                            if (mainTeams2 != null) {
                                                int i4 = 0;
                                                for (Object obj4 : mainTeams2) {
                                                    int i5 = i4 + 1;
                                                    if (i4 < 0) {
                                                        b.q();
                                                        throw null;
                                                    }
                                                    Team team = (Team) obj4;
                                                    if (qea.y(team)) {
                                                        Context context5 = venueInfoView.getContext();
                                                        context5.getClass();
                                                        sb.append(tba.p(context5, team));
                                                        sb.append(" " + venueInfoView.getContext().getString(R.string.female_team));
                                                    } else {
                                                        Context context6 = venueInfoView.getContext();
                                                        context6.getClass();
                                                        sb.append(tba.p(context6, team));
                                                    }
                                                    if (i4 < size - 1) {
                                                        sb.append(", ");
                                                    }
                                                    i4 = i5;
                                                }
                                            }
                                            cv1 d = cv1.d(r42, r6);
                                            ConstraintLayout constraintLayout = d.b;
                                            ImageView imageView9 = d.e;
                                            d.d.setText(sb.toString());
                                            d.c.setVisibility(8);
                                            TextView textView5 = d.f;
                                            final int i6 = 1;
                                            if (size == 1) {
                                                textView5.setText(R.string.venue_page_home_team);
                                                List<Team> mainTeams3 = venue2.getMainTeams();
                                                mainTeams3.getClass();
                                                as9.o(imageView9, mainTeams3.get(0).getId());
                                                constraintLayout.setBackground(null);
                                                constraintLayout.setOnClickListener(new View.OnClickListener() { // from class: gnk
                                                    @Override // android.view.View.OnClickListener
                                                    public final void onClick(View view2) {
                                                        int i72 = i6;
                                                        Venue venue22 = venue2;
                                                        VenueInfoView venueInfoView2 = venueInfoView;
                                                        switch (i72) {
                                                            case 0:
                                                                int i82 = VenueInfoView.g;
                                                                Context context7 = venueInfoView2.getContext();
                                                                context7.getClass();
                                                                nv.z0(context7, kv.CLICK, "map_view", "venue_profile");
                                                                LatLonCoordinates venueCoordinates3 = venue22.getVenueCoordinates();
                                                                Double latitude = venueCoordinates3 != null ? venueCoordinates3.getLatitude() : null;
                                                                LatLonCoordinates venueCoordinates22 = venue22.getVenueCoordinates();
                                                                Double longitude = venueCoordinates22 != null ? venueCoordinates22.getLongitude() : null;
                                                                venueInfoView2.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://maps.google.com/maps?q=loc:" + latitude + BlazeDataSourcePersonalizedType.STRING_SEPARATOR + longitude + " (" + venue22.getName() + ")")));
                                                                break;
                                                            default:
                                                                int i92 = VenueInfoView.g;
                                                                int i10 = TeamActivity.Z;
                                                                Context context8 = venueInfoView2.getContext();
                                                                context8.getClass();
                                                                List<Team> mainTeams4 = venue22.getMainTeams();
                                                                mainTeams4.getClass();
                                                                jle.r(context8, mainTeams4.get(0).getId(), null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                                                                break;
                                                        }
                                                    }
                                                });
                                            } else {
                                                textView5.setText(R.string.venue_page_home_teams);
                                                imageView9.setImageResource(R.drawable.ic_matches);
                                                imageView9.setImageTintList(ColorStateList.valueOf(venueInfoView.getContext().getColor(R.color.n_lv_1)));
                                            }
                                        }
                                        Integer capacity = venue2.getCapacity();
                                        if (capacity != null) {
                                            int intValue = capacity.intValue();
                                            cv1 d2 = cv1.d(r42, r6);
                                            ImageView imageView10 = d2.e;
                                            d2.f.setText(R.string.capacity);
                                            d2.d.setText(String.valueOf(intValue));
                                            d2.c.setVisibility(8);
                                            imageView10.setImageResource(R.drawable.ic_team);
                                            imageView10.setImageTintList(ColorStateList.valueOf(venueInfoView.getContext().getColor(R.color.n_lv_1)));
                                        }
                                        Long openedAtTimestamp = venue2.getOpenedAtTimestamp();
                                        if (openedAtTimestamp != null) {
                                            long longValue = openedAtTimestamp.longValue();
                                            bi4 bi4Var = bi4.PATTERN_DMMMMY;
                                            ConcurrentHashMap concurrentHashMap = hk4.a;
                                            String i7 = fc6.i(longValue, hk4.a(bi4Var.d()));
                                            int between = (int) ChronoUnit.YEARS.between(vxd.o(Instant.ofEpochMilli(longValue * 1000)), vxd.o(Instant.ofEpochMilli(yaa.v())));
                                            cv1 d3 = cv1.d(r42, r6);
                                            ImageView imageView11 = d3.e;
                                            d3.f.setText(R.string.venue_date_opened);
                                            d3.d.setText(i7 + " • " + venueInfoView.getResources().getQuantityString(R.plurals.venue_opened_years_ago, between, Integer.valueOf(between)));
                                            d3.c.setVisibility(8);
                                            imageView11.setImageResource(R.drawable.ic_calendar_empty);
                                            imageView11.setImageTintList(ColorStateList.valueOf(venueInfoView.getContext().getColor(R.color.n_lv_1)));
                                        }
                                        View inflate = r42.inflate(R.layout.summary_info_location_row_layout, r6, false);
                                        r6.addView(inflate);
                                        int i8 = R.id.cta_location;
                                        TextView textView6 = (TextView) nq8.B(R.id.cta_location, inflate);
                                        if (textView6 != null) {
                                            i8 = R.id.info_icon;
                                            if (((ImageView) nq8.B(R.id.info_icon, inflate)) != null) {
                                                i8 = R.id.text_lower;
                                                TextView textView7 = (TextView) nq8.B(R.id.text_lower, inflate);
                                                if (textView7 != null) {
                                                    i8 = R.id.text_upper;
                                                    if (((TextView) nq8.B(R.id.text_upper, inflate)) != null) {
                                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) inflate;
                                                        Country country5 = venue2.getCountry();
                                                        textView7.setText((country5 == null || (name = country5.getName()) == null) ? venue2.getCity().getName() : wv8.i(venue2.getCity().getName(), ", ", name));
                                                        LatLonCoordinates venueCoordinates = venue2.getVenueCoordinates();
                                                        if ((venueCoordinates != null ? venueCoordinates.getLatitude() : null) != null) {
                                                            LatLonCoordinates venueCoordinates2 = venue2.getVenueCoordinates();
                                                            if ((venueCoordinates2 != null ? venueCoordinates2.getLongitude() : null) != null) {
                                                                z = true;
                                                                textView6.setVisibility(!z ? 0 : 8);
                                                                if (z) {
                                                                    constraintLayout2.setBackground(null);
                                                                } else {
                                                                    final int i9 = 0;
                                                                    constraintLayout2.setOnClickListener(new View.OnClickListener() { // from class: gnk
                                                                        @Override // android.view.View.OnClickListener
                                                                        public final void onClick(View view2) {
                                                                            int i72 = i9;
                                                                            Venue venue22 = venue2;
                                                                            VenueInfoView venueInfoView2 = venueInfoView;
                                                                            switch (i72) {
                                                                                case 0:
                                                                                    int i82 = VenueInfoView.g;
                                                                                    Context context7 = venueInfoView2.getContext();
                                                                                    context7.getClass();
                                                                                    nv.z0(context7, kv.CLICK, "map_view", "venue_profile");
                                                                                    LatLonCoordinates venueCoordinates3 = venue22.getVenueCoordinates();
                                                                                    Double latitude = venueCoordinates3 != null ? venueCoordinates3.getLatitude() : null;
                                                                                    LatLonCoordinates venueCoordinates22 = venue22.getVenueCoordinates();
                                                                                    Double longitude = venueCoordinates22 != null ? venueCoordinates22.getLongitude() : null;
                                                                                    venueInfoView2.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://maps.google.com/maps?q=loc:" + latitude + BlazeDataSourcePersonalizedType.STRING_SEPARATOR + longitude + " (" + venue22.getName() + ")")));
                                                                                    break;
                                                                                default:
                                                                                    int i92 = VenueInfoView.g;
                                                                                    int i10 = TeamActivity.Z;
                                                                                    Context context8 = venueInfoView2.getContext();
                                                                                    context8.getClass();
                                                                                    List<Team> mainTeams4 = venue22.getMainTeams();
                                                                                    mainTeams4.getClass();
                                                                                    jle.r(context8, mainTeams4.get(0).getId(), null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                                                                                    break;
                                                                            }
                                                                        }
                                                                    });
                                                                }
                                                                venueInfoView.invalidate();
                                                                venueInfoView.requestLayout();
                                                            }
                                                        }
                                                        z = false;
                                                        textView6.setVisibility(!z ? 0 : 8);
                                                        if (z) {
                                                        }
                                                        venueInfoView.invalidate();
                                                        venueInfoView.requestLayout();
                                                    }
                                                }
                                            }
                                        }
                                        obj2 = null;
                                        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i8)));
                                    } else {
                                        obj2 = null;
                                        yhk.s(str);
                                    }
                                    return obj2;
                                }
                                str = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams";
                                sportStatistics = venueSummaryFragment.C().getSportStatistics();
                                if (sportStatistics != null) {
                                    krk krkVar4 = venueSummaryFragment.l;
                                    krkVar4.getClass();
                                    VenueHighlightsView venueHighlightsView = ((uq8) krkVar4).e;
                                    vy1 vy1Var2 = venueHighlightsView.d;
                                    if (venueHighlightsView.getVisibility() != 0 && !sportStatistics.isEmpty()) {
                                        venueHighlightsView.g = sportStatistics;
                                        venueHighlightsView.setVisibility(0);
                                        kqb d4 = kqb.d(venueHighlightsView.e, vy1Var2.b, true);
                                        TextView textView8 = d4.d;
                                        Context context7 = venueHighlightsView.getContext();
                                        context7.getClass();
                                        int s4 = ao2.s(6, context7);
                                        d4.c.setVisibility(8);
                                        textView8.setText(venueHighlightsView.getContext().getString(R.string.venue_highlights));
                                        ViewGroup.LayoutParams layoutParams2 = textView8.getLayoutParams();
                                        if (layoutParams2 == null) {
                                            obj2 = null;
                                            yhk.s(str);
                                            return obj2;
                                        }
                                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                                        marginLayoutParams2.setMargins(0, s4, 0, s4);
                                        textView8.setLayoutParams(marginLayoutParams2);
                                        Set<Map.Entry<String, VenueSportStatistics>> entrySet = sportStatistics.entrySet();
                                        ArrayList arrayList = new ArrayList(k13.r(entrySet, 10));
                                        Iterator it2 = entrySet.iterator();
                                        while (it2.hasNext()) {
                                            arrayList.add((String) ((Map.Entry) it2.next()).getKey());
                                        }
                                        if (arrayList.size() > 1) {
                                            ArrayList arrayList2 = new ArrayList(k13.r(arrayList, 10));
                                            Iterator it3 = arrayList.iterator();
                                            while (it3.hasNext()) {
                                                String str3 = (String) it3.next();
                                                Context context8 = venueHighlightsView.getContext();
                                                context8.getClass();
                                                arrayList2.add(new vt2(str3, wyh.c(context8, str3), false, new tc3(954637713, new fj4(str3, 2), true), null, null, null, 244));
                                            }
                                            Context context9 = venueHighlightsView.getContext();
                                            context9.getClass();
                                            TypeHeaderView typeHeaderView = new TypeHeaderView(context9, null, 6);
                                            g5k g5kVar = new g5k(typeHeaderView);
                                            g5kVar.b = arrayList2;
                                            g5kVar.k = true;
                                            g5kVar.m = new ur1(venueHighlightsView, 24);
                                            g5kVar.b();
                                            vy1Var2.b.addView(typeHeaderView);
                                        }
                                        venueHighlightsView.l((String) CollectionsKt.Y(arrayList));
                                    }
                                }
                                return Unit.a;
                            }
                        }
                        previousEvent = teamNearEventsResponse != null ? teamNearEventsResponse.getPreviousEvent() : null;
                        venueSummaryFragment.u = previousEvent;
                        if (previousEvent != null) {
                        }
                        krk krkVar322 = venueSummaryFragment.l;
                        krkVar322.getClass();
                        venueInfoView = ((uq8) krkVar322).f;
                        final Venue venue22 = venueSummaryFragment.C().getVenue();
                        ?? r422 = venueInfoView.e;
                        vy1 vy1Var32 = venueInfoView.d;
                        venue22.getClass();
                        if (venueInfoView.getVisibility() == 0) {
                        }
                        sportStatistics = venueSummaryFragment.C().getSportStatistics();
                        if (sportStatistics != null) {
                        }
                        return Unit.a;
                    default:
                        EventResponse eventResponse = (EventResponse) obj;
                        venueSummaryFragment.n();
                        if (eventResponse != null) {
                            venueSummaryFragment.u = eventResponse.getEvent();
                            krk krkVar5 = venueSummaryFragment.l;
                            krkVar5.getClass();
                            FeatureMatchCardView featureMatchCardView2 = ((uq8) krkVar5).b;
                            Event event4 = venueSummaryFragment.u;
                            if (event4 != null) {
                                Tournament tournament2 = event4.getTournament();
                                Category category = event4.getTournament().getCategory();
                                Round roundInfo = event4.getRoundInfo();
                                xt7 xt7Var2 = featureMatchCardView2.k;
                                pn2 pn2Var = (pn2) xt7Var2.x;
                                TextView textView9 = xt7Var2.o;
                                TextView textView10 = xt7Var2.p;
                                TextView textView11 = xt7Var2.q;
                                TextView textView12 = xt7Var2.n;
                                ImageView imageView12 = xt7Var2.e;
                                ImageView imageView13 = (ImageView) xt7Var2.v;
                                ImageView imageView14 = xt7Var2.m;
                                ConstraintLayout constraintLayout3 = xt7Var2.b;
                                TextView textView13 = xt7Var2.d;
                                TextView textView14 = xt7Var2.i;
                                TextView textView15 = xt7Var2.c;
                                TextView textView16 = xt7Var2.j;
                                ImageView imageView15 = (ImageView) xt7Var2.u;
                                ImageView imageView16 = xt7Var2.k;
                                pn2Var.b.setBackground(null);
                                TextView textView17 = pn2Var.e;
                                textView17.setMaxLines(1);
                                textView17.setEllipsize(TextUtils.TruncateAt.END);
                                if (t62.J(category)) {
                                    imageView = imageView13;
                                    imageView2 = imageView15;
                                    imageView3 = imageView16;
                                    tournament = tournament2;
                                    String w = tba.w(tournament);
                                    Regex regex = d7g.a;
                                    Context context10 = featureMatchCardView2.getContext();
                                    context10.getClass();
                                    y = dmi.y(w, d7g.b(context10, roundInfo, true, category.getSport().getSlug()));
                                } else {
                                    Context context11 = featureMatchCardView2.getContext();
                                    context11.getClass();
                                    String u = o3a.u(context11, tournament2);
                                    tournament = tournament2;
                                    String w2 = tba.w(tournament);
                                    Regex regex2 = d7g.a;
                                    imageView = imageView13;
                                    Context context12 = featureMatchCardView2.getContext();
                                    context12.getClass();
                                    imageView3 = imageView16;
                                    imageView2 = imageView15;
                                    y = fc6.n(u, ", ", w2, d7g.b(context12, roundInfo, true, category.getSport().getSlug()));
                                }
                                textView17.setText(y);
                                ImageView imageView17 = pn2Var.d;
                                UniqueTournament uniqueTournament = tournament.getUniqueTournament();
                                as9.q(imageView17, Integer.valueOf(uniqueTournament != null ? uniqueTournament.getId() : 0), tournament.getId(), null);
                                String slug = event4.getTournament().getCategory().getSport().getSlug();
                                boolean z3 = Event.getHomeTeam$default(event4, null, 1, null).hasSubTeams() && Event.getAwayTeam$default(event4, null, 1, null).hasSubTeams();
                                Team homeTeam$default = Event.getHomeTeam$default(event4, null, 1, null);
                                Team awayTeam$default = Event.getAwayTeam$default(event4, null, 1, null);
                                boolean z4 = Intrinsics.c(slug, Sports.TENNIS) && z3;
                                boolean shouldReverseTeams = event4.shouldReverseTeams();
                                if (z4) {
                                    textView16.setVisibility(0);
                                    textView13.setVisibility(0);
                                    SubTeam subTeam1 = homeTeam$default.getSubTeam1();
                                    Context context13 = featureMatchCardView2.getContext();
                                    context13.getClass();
                                    textView14.setText(tba.v(subTeam1, context13));
                                    textView14.setMaxLines(1);
                                    SubTeam subTeam2 = homeTeam$default.getSubTeam2();
                                    Context context14 = featureMatchCardView2.getContext();
                                    context14.getClass();
                                    textView16.setText(tba.v(subTeam2, context14));
                                    SubTeam subTeam12 = awayTeam$default.getSubTeam1();
                                    Context context15 = featureMatchCardView2.getContext();
                                    context15.getClass();
                                    textView15.setText(tba.v(subTeam12, context15));
                                    textView15.setMaxLines(1);
                                    SubTeam subTeam22 = awayTeam$default.getSubTeam2();
                                    Context context16 = featureMatchCardView2.getContext();
                                    context16.getClass();
                                    textView13.setText(tba.v(subTeam22, context16));
                                } else {
                                    textView14.setMaxLines(2);
                                    Context context17 = textView14.getContext();
                                    context17.getClass();
                                    textView14.setText(tba.p(context17, homeTeam$default));
                                    textView15.setMaxLines(2);
                                    Context context18 = textView15.getContext();
                                    context18.getClass();
                                    textView15.setText(qea.K(tba.p(context18, awayTeam$default), shouldReverseTeams));
                                }
                                Team homeTeam$default2 = Event.getHomeTeam$default(event4, null, 1, null);
                                Team awayTeam$default2 = Event.getAwayTeam$default(event4, null, 1, null);
                                boolean z5 = Intrinsics.c(slug, Sports.TENNIS) && z3;
                                int i10 = featureMatchCardView2.j;
                                int i11 = featureMatchCardView2.i;
                                int i12 = featureMatchCardView2.h;
                                SubTeam subTeam13 = homeTeam$default2.getSubTeam1();
                                SubTeam subTeam23 = homeTeam$default2.getSubTeam2();
                                boolean z6 = z5;
                                SubTeam subTeam14 = awayTeam$default2.getSubTeam1();
                                boolean z7 = z3;
                                SubTeam subTeam24 = awayTeam$default2.getSubTeam2();
                                if (!z6 || subTeam13 == null || subTeam23 == null || subTeam14 == null || subTeam24 == null) {
                                    featureMatchCardView = featureMatchCardView2;
                                    imageView4 = imageView14;
                                    imageView5 = imageView;
                                    imageView6 = imageView3;
                                    imageView7 = imageView2;
                                    ViewGroup.LayoutParams layoutParams3 = imageView7.getLayoutParams();
                                    layoutParams3.width = i10;
                                    layoutParams3.height = i10;
                                    imageView7.setLayoutParams(layoutParams3);
                                    ViewGroup.LayoutParams layoutParams4 = imageView6.getLayoutParams();
                                    layoutParams4.width = i10;
                                    layoutParams4.height = i10;
                                    imageView6.setLayoutParams(layoutParams4);
                                    as9.o(imageView7, homeTeam$default2.getId());
                                    as9.o(imageView6, awayTeam$default2.getId());
                                } else {
                                    mm3 mm3Var = new mm3();
                                    mm3Var.e(constraintLayout3);
                                    mm3Var.r(R.id.home_team_logo_1, 6, i12);
                                    featureMatchCardView = featureMatchCardView2;
                                    mm3Var.r(R.id.home_team_logo_1, 4, featureMatchCardView2.g);
                                    mm3Var.r(R.id.away_team_logo_1, 7, i12);
                                    mm3Var.a(constraintLayout3);
                                    ViewGroup.LayoutParams layoutParams5 = imageView2.getLayoutParams();
                                    layoutParams5.width = i11;
                                    layoutParams5.height = i11;
                                    imageView7 = imageView2;
                                    imageView7.setLayoutParams(layoutParams5);
                                    ViewGroup.LayoutParams layoutParams6 = imageView3.getLayoutParams();
                                    layoutParams6.width = i11;
                                    layoutParams6.height = i11;
                                    imageView6 = imageView3;
                                    imageView6.setLayoutParams(layoutParams6);
                                    imageView5 = imageView;
                                    imageView5.setVisibility(0);
                                    imageView4 = imageView14;
                                    imageView4.setVisibility(0);
                                    as9.o(imageView7, subTeam13.getId());
                                    as9.o(imageView5, subTeam23.getId());
                                    as9.o(imageView6, subTeam24.getId());
                                    as9.o(imageView4, subTeam14.getId());
                                    textView16.setVisibility(0);
                                    textView13.setVisibility(0);
                                    Context context19 = featureMatchCardView.getContext();
                                    context19.getClass();
                                    textView14.setText(tba.v(subTeam13, context19));
                                    textView14.setMaxLines(1);
                                    Context context20 = featureMatchCardView.getContext();
                                    context20.getClass();
                                    textView16.setText(tba.v(subTeam23, context20));
                                    Context context21 = featureMatchCardView.getContext();
                                    context21.getClass();
                                    textView15.setText(tba.v(subTeam14, context21));
                                    textView15.setMaxLines(1);
                                    Context context22 = featureMatchCardView.getContext();
                                    context22.getClass();
                                    textView13.setText(tba.v(subTeam24, context22));
                                }
                                if (event4 instanceof TennisEvent) {
                                    String homeTeamSeed$default = Event.getHomeTeamSeed$default(event4, null, 1, null);
                                    String awayTeamSeed$default = Event.getAwayTeamSeed$default(event4, null, 1, null);
                                    xt7Var = xt7Var2;
                                    if (homeTeamSeed$default != null) {
                                        TextView textView18 = xt7Var.l;
                                        Context context23 = textView18.getContext();
                                        context23.getClass();
                                        textView18.setBackgroundTintList(ColorStateList.valueOf(uaa.o(context23, homeTeamSeed$default)));
                                        textView18.setVisibility(0);
                                        Context context24 = textView18.getContext();
                                        context24.getClass();
                                        textView18.setText(uaa.q(context24, homeTeamSeed$default));
                                        if (z7) {
                                            ViewGroup.LayoutParams layoutParams7 = textView18.getLayoutParams();
                                            if (layoutParams7 == null) {
                                                yhk.s("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                                                return null;
                                            }
                                            tl3 tl3Var = (tl3) layoutParams7;
                                            tl3Var.t = imageView5.getId();
                                            tl3Var.v = imageView7.getId();
                                            textView18.setLayoutParams(tl3Var);
                                        }
                                    }
                                    if (awayTeamSeed$default != null) {
                                        TextView textView19 = xt7Var.f;
                                        Context context25 = textView19.getContext();
                                        context25.getClass();
                                        textView19.setBackgroundTintList(ColorStateList.valueOf(uaa.o(context25, awayTeamSeed$default)));
                                        textView19.setVisibility(0);
                                        Context context26 = textView19.getContext();
                                        context26.getClass();
                                        textView19.setText(uaa.q(context26, awayTeamSeed$default));
                                        if (z7) {
                                            ViewGroup.LayoutParams layoutParams8 = textView19.getLayoutParams();
                                            if (layoutParams8 == null) {
                                                yhk.s("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                                                return null;
                                            }
                                            tl3 tl3Var2 = (tl3) layoutParams8;
                                            tl3Var2.t = imageView4.getId();
                                            tl3Var2.v = imageView6.getId();
                                            textView19.setLayoutParams(tl3Var2);
                                        }
                                    }
                                    if (!ok3.G(event4)) {
                                        Team homeTeam$default3 = Event.getHomeTeam$default(event4, null, 1, null);
                                        Team awayTeam$default3 = Event.getAwayTeam$default(event4, null, 1, null);
                                        ImageView imageView18 = xt7Var.r;
                                        if (z7) {
                                            SubTeam subTeam15 = homeTeam$default3.getSubTeam1();
                                            as9.c(imageView18, (subTeam15 == null || (country4 = subTeam15.getCountry()) == null) ? null : country4.getAlpha2(), true, null, 4);
                                            SubTeam subTeam25 = awayTeam$default3.getSubTeam2();
                                            as9.c(imageView12, (subTeam25 == null || (country3 = subTeam25.getCountry()) == null) ? null : country3.getAlpha2(), true, null, 4);
                                            ImageView imageView19 = (ImageView) xt7Var.t;
                                            SubTeam subTeam26 = homeTeam$default3.getSubTeam2();
                                            as9.c(imageView19, (subTeam26 == null || (country2 = subTeam26.getCountry()) == null) ? null : country2.getAlpha2(), true, null, 4);
                                            ImageView imageView20 = xt7Var.g;
                                            SubTeam subTeam16 = awayTeam$default3.getSubTeam1();
                                            as9.c(imageView20, (subTeam16 == null || (country = subTeam16.getCountry()) == null) ? null : country.getAlpha2(), true, null, 4);
                                        } else {
                                            Country country6 = homeTeam$default3.getCountry();
                                            as9.c(imageView18, country6 != null ? country6.getAlpha2() : null, true, null, 4);
                                            Country country7 = awayTeam$default3.getCountry();
                                            as9.c(imageView12, country7 != null ? country7.getAlpha2() : null, true, null, 4);
                                        }
                                    }
                                } else {
                                    xt7Var = xt7Var2;
                                }
                                FeatureMatchCardView featureMatchCardView3 = featureMatchCardView;
                                int i13 = featureMatchCardView3.d;
                                int i14 = featureMatchCardView3.f;
                                int i15 = featureMatchCardView3.e;
                                if (ph0.a0(new String[]{StatusKt.STATUS_FINISHED, StatusKt.STATUS_WILL_CONTINUE, StatusKt.STATUS_IN_PROGRESS, StatusKt.STATUS_SUSPENDED, StatusKt.STATUS_INTERRUPTED}).contains(event4.getStatus().getType())) {
                                    textView4 = textView12;
                                    textView4.setVisibility(8);
                                    textView3 = textView11;
                                    textView3.setVisibility(0);
                                    textView2 = textView10;
                                    textView2.setVisibility(0);
                                    textView = textView9;
                                    textView.setVisibility(0);
                                } else {
                                    textView = textView9;
                                    textView2 = textView10;
                                    textView3 = textView11;
                                    textView4 = textView12;
                                }
                                TextView textView20 = xt7Var.h;
                                Integer display = Event.getHomeScore$default(event4, null, 1, null).getDisplay();
                                if (display != null) {
                                    String valueOf = String.valueOf(display.intValue());
                                    obj3 = StatusKt.STATUS_INTERRUPTED;
                                    str2 = valueOf;
                                } else {
                                    obj3 = StatusKt.STATUS_INTERRUPTED;
                                    str2 = null;
                                }
                                textView2.setText(str2);
                                Integer display2 = Event.getAwayScore$default(event4, null, 1, null).getDisplay();
                                textView.setText(display2 != null ? String.valueOf(display2.intValue()) : null);
                                textView4.setPaintFlags(textView4.getPaintFlags() & (-17));
                                textView4.setTextColor(i13);
                                textView20.setTextColor(i15);
                                Time time = event4.getTime();
                                StatusTime statusTime = time != null ? time.getStatusTime() : null;
                                if (statusTime != null) {
                                    l4a.K(textView20, z8e.H(statusTime, xe6.c().b));
                                } else {
                                    Context context27 = featureMatchCardView3.getContext();
                                    context27.getClass();
                                    textView20.setText(pd0.u(context27, event4));
                                }
                                textView20.setVisibility(0);
                                String type = event4.getStatus().getType();
                                Locale locale = Locale.US;
                                String k = i.k(locale, type, locale);
                                int i16 = 16;
                                switch (k.hashCode()) {
                                    case -1947652542:
                                        break;
                                    case -1661628965:
                                        break;
                                    case -1411655086:
                                        if (k.equals(StatusKt.STATUS_IN_PROGRESS)) {
                                            textView2.setTextColor(i14);
                                            textView.setTextColor(i14);
                                            textView3.setTextColor(i14);
                                            textView20.setTextColor(i14);
                                            break;
                                        }
                                        if (!ph0.a0(new String[]{StatusKt.STATUS_CANCELED, StatusKt.STATUS_POSTPONED}).contains(event4.getStatus().getType())) {
                                            textView4.setVisibility(0);
                                            textView3.setVisibility(8);
                                            textView2.setVisibility(8);
                                            textView.setVisibility(8);
                                            textView4.setPaintFlags(textView4.getPaintFlags() | 16);
                                            long startTimestamp2 = event4.getStartTimestamp();
                                            bi4 bi4Var2 = bi4.PATTERN_DMY_SHORT;
                                            ConcurrentHashMap concurrentHashMap2 = hk4.a;
                                            String format2 = hk4.a(bi4Var2.d()).format(Instant.ofEpochSecond(startTimestamp2));
                                            format2.getClass();
                                            textView4.setText(format2);
                                            textView4.setTextColor(i15);
                                            textView20.setTextColor(i14);
                                            break;
                                        } else {
                                            textView4.setVisibility(0);
                                            textView3.setVisibility(8);
                                            textView2.setVisibility(8);
                                            textView.setVisibility(8);
                                            long startTimestamp3 = event4.getStartTimestamp();
                                            long j3 = startTimestamp3 * 1000;
                                            if ((j3 - System.currentTimeMillis()) / 86400000 >= 1) {
                                                int between2 = (int) ChronoUnit.DAYS.between(vxd.o(Instant.ofEpochMilli(yaa.v())), vxd.o(Instant.ofEpochMilli(j3)));
                                                if (between2 == 1) {
                                                    format = textView4.getContext().getString(R.string.tomorrow);
                                                } else {
                                                    Locale d5 = dla.d();
                                                    String string2 = textView4.getContext().getString(R.string.in_n_days);
                                                    string2.getClass();
                                                    format = String.format(d5, string2, Arrays.copyOf(new Object[]{Integer.valueOf(between2)}, 1));
                                                }
                                                textView4.setText(format);
                                                Context context28 = textView20.getContext();
                                                context28.getClass();
                                                textView20.setText(rik.j(context28, event4.getStartTimestamp(), bi4.PATTERN_DDMMY, " "));
                                                break;
                                            } else {
                                                if (!ug5.u(startTimestamp3)) {
                                                    if (ug5.w(startTimestamp3)) {
                                                        string = featureMatchCardView3.getContext().getString(R.string.yesterday);
                                                    } else if (ug5.v(startTimestamp3)) {
                                                        string = featureMatchCardView3.getContext().getString(R.string.tomorrow);
                                                    } else {
                                                        bi4 bi4Var3 = bi4.PATTERN_DDMMY;
                                                        ConcurrentHashMap concurrentHashMap3 = hk4.a;
                                                        a2 = hk4.a(bi4Var3.d());
                                                    }
                                                    textView4.setText(string);
                                                    if (ug5.u(startTimestamp3)) {
                                                        Context context29 = featureMatchCardView3.getContext();
                                                        context29.getClass();
                                                        j = rik.j(context29, startTimestamp3, bi4.PATTERN_DDMMY, " ");
                                                    } else {
                                                        j = featureMatchCardView3.getContext().getString(R.string.today);
                                                    }
                                                    textView20.setText(j);
                                                    break;
                                                } else {
                                                    Context context30 = featureMatchCardView3.getContext();
                                                    context30.getClass();
                                                    String bestPattern = hk4.b().getBestPattern(DateFormat.is24HourFormat(context30) ? "Hm" : "hm");
                                                    bestPattern.getClass();
                                                    a2 = hk4.a(bestPattern);
                                                }
                                                string = fc6.i(startTimestamp3, a2);
                                                textView4.setText(string);
                                                if (ug5.u(startTimestamp3)) {
                                                }
                                                textView20.setText(j);
                                            }
                                        }
                                    case -673660814:
                                        break;
                                    case 527231609:
                                        break;
                                    default:
                                        if (!ph0.a0(new String[]{StatusKt.STATUS_CANCELED, StatusKt.STATUS_POSTPONED}).contains(event4.getStatus().getType())) {
                                        }
                                        break;
                                }
                                featureMatchCardView3.setVisibility(0);
                                featureMatchCardView3.setOpenEventClick(new fej(i16, venueSummaryFragment, event4));
                                featureMatchCardView3.setCtaClick(new vnk(venueSummaryFragment, 1));
                            }
                        }
                        return Unit.a;
                }
            }
        }));
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
        aok aokVar = (aok) this.r.getValue();
        xw3.L(un0.z(aokVar), null, null, new znk(aokVar, C().getVenue().getId(), null, 1), 3);
    }
}
