package com.sofascore.results.main.matches.redesign.datematches.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.e;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.C4427z5;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.sofascore.model.database.DisplayType;
import com.sofascore.results.R;
import com.sofascore.results.main.matches.redesign.datematches.view.MatchesFilterBarView;
import com.unity3d.services.UnityAdsConstants;
import defpackage.a3;
import defpackage.a99;
import defpackage.aqb;
import defpackage.av8;
import defpackage.bi4;
import defpackage.e1d;
import defpackage.eoh;
import defpackage.eqf;
import defpackage.fc6;
import defpackage.haa;
import defpackage.i2a;
import defpackage.m6k;
import defpackage.nf3;
import defpackage.of3;
import defpackage.oqb;
import defpackage.pug;
import defpackage.q28;
import defpackage.qqb;
import defpackage.r9k;
import defpackage.ug5;
import defpackage.uk4;
import defpackage.vxb;
import defpackage.y6a;
import defpackage.yaa;
import defpackage.yqo;
import defpackage.zpb;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DecimalStyle;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR+\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R0\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR0\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001e\u0010\u0019\"\u0004\b\u001f\u0010\u001bR*\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R*\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010#\u001a\u0004\b*\u0010%\"\u0004\b+\u0010'R*\u00100\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010#\u001a\u0004\b.\u0010%\"\u0004\b/\u0010'¨\u00061"}, d2 = {"Lcom/sofascore/results/main/matches/redesign/datematches/view/MatchesFilterBarView;", "La3;", "Lr9k;", "count", "", "setLiveCount", "(Lr9k;)V", "", "timestamp", "setSelectedTimestamp", "(J)V", "Lq28;", "<set-?>", CampaignEx.JSON_KEY_AD_K, "Le1d;", "getFilterBarUiState", "()Lq28;", "setFilterBarUiState", "(Lq28;)V", "filterBarUiState", "Lkotlin/Function1;", "", InneractiveMediationDefs.GENDER_MALE, "Lkotlin/jvm/functions/Function1;", "getOnFilterClick", "()Lkotlin/jvm/functions/Function1;", "setOnFilterClick", "(Lkotlin/jvm/functions/Function1;)V", "onFilterClick", C4427z5.q, "getOnLiveClick", "setOnLiveClick", "onLiveClick", "Lkotlin/Function0;", "o", "Lkotlin/jvm/functions/Function0;", "getOnPreviousDayClick", "()Lkotlin/jvm/functions/Function0;", "setOnPreviousDayClick", "(Lkotlin/jvm/functions/Function0;)V", "onPreviousDayClick", TtmlNode.TAG_P, "getOnNextDayClick", "setOnNextDayClick", "onNextDayClick", CampaignEx.JSON_KEY_AD_Q, "getOnCalendarClick", "setOnCalendarClick", "onCalendarClick", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MatchesFilterBarView extends a3 {
    public static final /* synthetic */ int r = 0;

    /* renamed from: k, reason: from kotlin metadata */
    public final e1d filterBarUiState;
    public boolean l;

    /* renamed from: m, reason: from kotlin metadata */
    public Function1 onFilterClick;

    /* renamed from: n, reason: from kotlin metadata */
    public Function1 onLiveClick;

    /* renamed from: o, reason: from kotlin metadata */
    public Function0 onPreviousDayClick;

    /* renamed from: p, reason: from kotlin metadata */
    public Function0 onNextDayClick;

    /* renamed from: q, reason: from kotlin metadata */
    public Function0 onCalendarClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MatchesFilterBarView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        context.getClass();
        this.filterBarUiState = e.f(new q28(false, false, 0, false, null, new uk4(0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, pug.a, "", "", "", "", "", "")));
        setVisibility(8);
    }

    private final q28 getFilterBarUiState() {
        return (q28) ((eoh) this.filterBarUiState).getValue();
    }

    public static final Unit l(final MatchesFilterBarView matchesFilterBarView, of3 of3Var, int i) {
        final int i2 = 0;
        final int i3 = 1;
        final int i4 = 2;
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(i & 1, (i & 3) != 2)) {
            q28 filterBarUiState = matchesFilterBarView.getFilterBarUiState();
            boolean i5 = av8Var.i(matchesFilterBarView);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (i5 || O == a99Var) {
                O = new Function0(matchesFilterBarView) { // from class: wxb
                    public final /* synthetic */ MatchesFilterBarView b;

                    {
                        this.b = matchesFilterBarView;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i6 = i2;
                        MatchesFilterBarView matchesFilterBarView2 = this.b;
                        switch (i6) {
                            case 0:
                                break;
                            case 1:
                                break;
                            case 2:
                                Function0 function0 = matchesFilterBarView2.onPreviousDayClick;
                                if (function0 != null) {
                                    function0.invoke();
                                }
                                break;
                            case 3:
                                Function0 function02 = matchesFilterBarView2.onNextDayClick;
                                if (function02 != null) {
                                    function02.invoke();
                                }
                                break;
                            default:
                                Function0 function03 = matchesFilterBarView2.onCalendarClick;
                                if (function03 != null) {
                                    function03.invoke();
                                }
                                break;
                        }
                        return Unit.a;
                    }
                };
                av8Var.n0(O);
            }
            Function0 function0 = (Function0) O;
            boolean i6 = av8Var.i(matchesFilterBarView);
            Object O2 = av8Var.O();
            if (i6 || O2 == a99Var) {
                O2 = new Function0(matchesFilterBarView) { // from class: wxb
                    public final /* synthetic */ MatchesFilterBarView b;

                    {
                        this.b = matchesFilterBarView;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i62 = i3;
                        MatchesFilterBarView matchesFilterBarView2 = this.b;
                        switch (i62) {
                            case 0:
                                break;
                            case 1:
                                break;
                            case 2:
                                Function0 function02 = matchesFilterBarView2.onPreviousDayClick;
                                if (function02 != null) {
                                    function02.invoke();
                                }
                                break;
                            case 3:
                                Function0 function022 = matchesFilterBarView2.onNextDayClick;
                                if (function022 != null) {
                                    function022.invoke();
                                }
                                break;
                            default:
                                Function0 function03 = matchesFilterBarView2.onCalendarClick;
                                if (function03 != null) {
                                    function03.invoke();
                                }
                                break;
                        }
                        return Unit.a;
                    }
                };
                av8Var.n0(O2);
            }
            Function0 function02 = (Function0) O2;
            boolean i7 = av8Var.i(matchesFilterBarView);
            Object O3 = av8Var.O();
            if (i7 || O3 == a99Var) {
                O3 = new Function0(matchesFilterBarView) { // from class: wxb
                    public final /* synthetic */ MatchesFilterBarView b;

                    {
                        this.b = matchesFilterBarView;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i62 = i4;
                        MatchesFilterBarView matchesFilterBarView2 = this.b;
                        switch (i62) {
                            case 0:
                                break;
                            case 1:
                                break;
                            case 2:
                                Function0 function022 = matchesFilterBarView2.onPreviousDayClick;
                                if (function022 != null) {
                                    function022.invoke();
                                }
                                break;
                            case 3:
                                Function0 function0222 = matchesFilterBarView2.onNextDayClick;
                                if (function0222 != null) {
                                    function0222.invoke();
                                }
                                break;
                            default:
                                Function0 function03 = matchesFilterBarView2.onCalendarClick;
                                if (function03 != null) {
                                    function03.invoke();
                                }
                                break;
                        }
                        return Unit.a;
                    }
                };
                av8Var.n0(O3);
            }
            Function0 function03 = (Function0) O3;
            boolean i8 = av8Var.i(matchesFilterBarView);
            Object O4 = av8Var.O();
            if (i8 || O4 == a99Var) {
                final int i9 = 3;
                O4 = new Function0(matchesFilterBarView) { // from class: wxb
                    public final /* synthetic */ MatchesFilterBarView b;

                    {
                        this.b = matchesFilterBarView;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i62 = i9;
                        MatchesFilterBarView matchesFilterBarView2 = this.b;
                        switch (i62) {
                            case 0:
                                break;
                            case 1:
                                break;
                            case 2:
                                Function0 function022 = matchesFilterBarView2.onPreviousDayClick;
                                if (function022 != null) {
                                    function022.invoke();
                                }
                                break;
                            case 3:
                                Function0 function0222 = matchesFilterBarView2.onNextDayClick;
                                if (function0222 != null) {
                                    function0222.invoke();
                                }
                                break;
                            default:
                                Function0 function032 = matchesFilterBarView2.onCalendarClick;
                                if (function032 != null) {
                                    function032.invoke();
                                }
                                break;
                        }
                        return Unit.a;
                    }
                };
                av8Var.n0(O4);
            }
            Function0 function04 = (Function0) O4;
            boolean i10 = av8Var.i(matchesFilterBarView);
            Object O5 = av8Var.O();
            if (i10 || O5 == a99Var) {
                final int i11 = 4;
                O5 = new Function0(matchesFilterBarView) { // from class: wxb
                    public final /* synthetic */ MatchesFilterBarView b;

                    {
                        this.b = matchesFilterBarView;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i62 = i11;
                        MatchesFilterBarView matchesFilterBarView2 = this.b;
                        switch (i62) {
                            case 0:
                                break;
                            case 1:
                                break;
                            case 2:
                                Function0 function022 = matchesFilterBarView2.onPreviousDayClick;
                                if (function022 != null) {
                                    function022.invoke();
                                }
                                break;
                            case 3:
                                Function0 function0222 = matchesFilterBarView2.onNextDayClick;
                                if (function0222 != null) {
                                    function0222.invoke();
                                }
                                break;
                            default:
                                Function0 function032 = matchesFilterBarView2.onCalendarClick;
                                if (function032 != null) {
                                    function032.invoke();
                                }
                                break;
                        }
                        return Unit.a;
                    }
                };
                av8Var.n0(O5);
            }
            m6k.j(filterBarUiState, function0, function02, function03, function04, (Function0) O5, null, av8Var, 0);
        } else {
            av8Var.W();
        }
        return Unit.a;
    }

    public static final Unit m(MatchesFilterBarView matchesFilterBarView) {
        Function1 function1 = matchesFilterBarView.onFilterClick;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(!fc6.B(fc6.t(Instant.ofEpochSecond(matchesFilterBarView.getFilterBarUiState().f.a))) || matchesFilterBarView.getFilterBarUiState().d));
        }
        return Unit.a;
    }

    public static final Unit n(MatchesFilterBarView matchesFilterBarView) {
        matchesFilterBarView.setFilterBarUiState(q28.a(matchesFilterBarView.getFilterBarUiState(), false, false, 0, !matchesFilterBarView.getFilterBarUiState().d, null, null, 55));
        Function1 function1 = matchesFilterBarView.onLiveClick;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(matchesFilterBarView.getFilterBarUiState().d));
        }
        return Unit.a;
    }

    public static Pair o(long j) {
        String str;
        int year = LocalDate.now(ZoneId.systemDefault()).getYear();
        LocalDate localDate = Instant.ofEpochSecond(j).atZone(ZoneId.systemDefault()).toLocalDate();
        localDate.getClass();
        boolean z = year == localDate.getYear();
        bi4 bi4Var = z ? bi4.PATTERN_DMM : bi4.PATTERN_DAY_DMY;
        if (z) {
            bi4 bi4Var2 = bi4.PATTERN_DAY_SHORT;
            Locale locale = Locale.getDefault();
            locale.getClass();
            ZoneId systemDefault = ZoneId.systemDefault();
            systemDefault.getClass();
            str = fc6.i(j, DateTimeFormatter.ofPattern(bi4Var2.d(), locale).withZone(systemDefault).withDecimalStyle(DecimalStyle.of(locale)));
        } else {
            str = "";
        }
        Locale locale2 = Locale.getDefault();
        locale2.getClass();
        ZoneId systemDefault2 = ZoneId.systemDefault();
        systemDefault2.getClass();
        return new Pair(str, fc6.i(j, DateTimeFormatter.ofPattern(bi4Var.d(), locale2).withZone(systemDefault2).withDecimalStyle(DecimalStyle.of(locale2))));
    }

    private final void setFilterBarUiState(q28 q28Var) {
        ((eoh) this.filterBarUiState).setValue(q28Var);
    }

    @Override // defpackage.a3
    public final void a(int i, of3 of3Var) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(420070534);
        int i2 = (av8Var.i(this) ? 4 : 2) | i;
        if (av8Var.T(i2 & 1, (i2 & 3) != 2)) {
            haa.f(yqo.H(1676092779, av8Var, new vxb(this)), av8Var, 6);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new vxb(this, i);
        }
    }

    @Nullable
    public final Function0<Unit> getOnCalendarClick() {
        return this.onCalendarClick;
    }

    @Nullable
    public final Function1<Boolean, Unit> getOnFilterClick() {
        return this.onFilterClick;
    }

    @Nullable
    public final Function1<Boolean, Unit> getOnLiveClick() {
        return this.onLiveClick;
    }

    @Nullable
    public final Function0<Unit> getOnNextDayClick() {
        return this.onNextDayClick;
    }

    @Nullable
    public final Function0<Unit> getOnPreviousDayClick() {
        return this.onPreviousDayClick;
    }

    public final void p(boolean z, long j, zpb zpbVar, zpb zpbVar2, aqb aqbVar, aqb aqbVar2, aqb aqbVar3) {
        if (!this.l) {
            this.onFilterClick = zpbVar;
            this.onLiveClick = zpbVar2;
            this.onPreviousDayClick = aqbVar;
            this.onNextDayClick = aqbVar2;
            this.onCalendarClick = aqbVar3;
            this.l = true;
        }
        s(j);
        setFilterBarUiState(q28.a(getFilterBarUiState(), z, false, 0, false, null, null, 62));
        setVisibility(0);
    }

    public final void q() {
        setFilterBarUiState(q28.a(getFilterBarUiState(), false, false, 0, false, null, uk4.a(getFilterBarUiState().f, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, pug.a, null, null, null, null, null, null, 505), 31));
    }

    public final void r(qqb qqbVar) {
        oqb oqbVar = qqbVar.b;
        DisplayType displayType = qqbVar.c;
        int x = i2a.x(oqbVar, getFilterBarUiState().d ? yaa.w() : getFilterBarUiState().f.a, getFilterBarUiState().d);
        boolean z = x > 0 || displayType == DisplayType.CHRONOLOGICAL;
        Integer num = displayType != DisplayType.CHRONOLOGICAL ? null : 1;
        setFilterBarUiState(q28.a(getFilterBarUiState(), false, z, x + (num != null ? num.intValue() : 0), false, null, null, 57));
    }

    public final void s(long j) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12 = "";
        if (ug5.D(j).isEqual(LocalDate.now(ZoneId.systemDefault()).minusDays(2L))) {
            LocalDate minusDays = ug5.D(j).minusDays(1L);
            minusDays.getClass();
            Pair o = o(y6a.O(minusDays));
            String str13 = (String) o.a;
            String str14 = (String) o.b;
            Pair o2 = o(j);
            String str15 = (String) o2.a;
            String str16 = (String) o2.b;
            String string = getContext().getString(R.string.yesterday);
            string.getClass();
            str6 = str14;
            str7 = string;
            str11 = str13;
            str9 = str16;
            str8 = str15;
            str10 = "";
        } else {
            if (ug5.w(j)) {
                LocalDate minusDays2 = ug5.D(j).minusDays(1L);
                minusDays2.getClass();
                Pair o3 = o(y6a.O(minusDays2));
                String str17 = (String) o3.a;
                String str18 = (String) o3.b;
                String string2 = getContext().getString(R.string.yesterday);
                string2.getClass();
                String string3 = getContext().getString(R.string.today);
                string3.getClass();
                str6 = str18;
                str7 = string3;
                str11 = str17;
                str9 = string2;
                str8 = "";
            } else if (ug5.u(j)) {
                String string4 = getContext().getString(R.string.yesterday);
                string4.getClass();
                String string5 = getContext().getString(R.string.today);
                string5.getClass();
                String string6 = getContext().getString(R.string.tomorrow);
                string6.getClass();
                str6 = string4;
                str7 = string6;
                str9 = string5;
                str11 = "";
                str8 = str11;
            } else if (ug5.v(j)) {
                String string7 = getContext().getString(R.string.today);
                string7.getClass();
                String string8 = getContext().getString(R.string.tomorrow);
                string8.getClass();
                LocalDate plusDays = ug5.D(j).plusDays(1L);
                plusDays.getClass();
                Pair o4 = o(y6a.O(plusDays));
                String str19 = (String) o4.a;
                str6 = string7;
                str7 = (String) o4.b;
                str10 = str19;
                str9 = string8;
                str11 = "";
                str8 = str11;
            } else {
                if (ug5.D(j).isEqual(LocalDate.now(ZoneId.systemDefault()).plusDays(2L))) {
                    str = getContext().getString(R.string.tomorrow);
                    str.getClass();
                    Pair o5 = o(j);
                    str2 = (String) o5.a;
                    str3 = (String) o5.b;
                    LocalDate plusDays2 = ug5.D(j).plusDays(1L);
                    plusDays2.getClass();
                    Pair o6 = o(y6a.O(plusDays2));
                    str4 = (String) o6.a;
                    str5 = (String) o6.b;
                } else {
                    LocalDate minusDays3 = ug5.D(j).minusDays(1L);
                    minusDays3.getClass();
                    Pair o7 = o(y6a.O(minusDays3));
                    str12 = (String) o7.a;
                    str = (String) o7.b;
                    Pair o8 = o(j);
                    str2 = (String) o8.a;
                    str3 = (String) o8.b;
                    LocalDate plusDays3 = ug5.D(j).plusDays(1L);
                    plusDays3.getClass();
                    Pair o9 = o(y6a.O(plusDays3));
                    str4 = (String) o9.a;
                    str5 = (String) o9.b;
                }
                str6 = str;
                str7 = str5;
                str8 = str2;
                str9 = str3;
                str10 = str4;
                str11 = str12;
            }
            str10 = str8;
        }
        setFilterBarUiState(q28.a(getFilterBarUiState(), false, false, 0, false, null, uk4.a(getFilterBarUiState().f, j, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, str6, str11, str9, str8, str7, str10, 6), 31));
    }

    public final void setLiveCount(@NotNull r9k count) {
        count.getClass();
        setFilterBarUiState(q28.a(getFilterBarUiState(), false, false, 0, false, count, null, 47));
    }

    public final void setOnCalendarClick(@Nullable Function0<Unit> function0) {
        this.onCalendarClick = function0;
    }

    public final void setOnFilterClick(@Nullable Function1<? super Boolean, Unit> function1) {
        this.onFilterClick = function1;
    }

    public final void setOnLiveClick(@Nullable Function1<? super Boolean, Unit> function1) {
        this.onLiveClick = function1;
    }

    public final void setOnNextDayClick(@Nullable Function0<Unit> function0) {
        this.onNextDayClick = function0;
    }

    public final void setOnPreviousDayClick(@Nullable Function0<Unit> function0) {
        this.onPreviousDayClick = function0;
    }

    public final void setSelectedTimestamp(long timestamp) {
        s(timestamp);
    }

    public final void t(float f, pug pugVar) {
        setFilterBarUiState(q28.a(getFilterBarUiState(), false, false, 0, false, null, uk4.a(getFilterBarUiState().f, 0L, f, pugVar, null, null, null, null, null, null, 505), 31));
    }
}
