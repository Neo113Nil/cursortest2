package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.ironsource.InterfaceC4060ee;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Country;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Tournament;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.mvvm.model.Venue;
import com.sofascore.model.newNetwork.Highlight;
import com.sofascore.results.R;
import com.sofascore.results.feed.MediaExternalVideoDialog;
import com.sofascore.results.league.fragment.details.LeagueEditorsBottomModal;
import com.sofascore.results.main.fantasy.center.elitefaceoff.FantasyEliteFaceoffIntroBottomSheet;
import com.sofascore.results.main.matches.redesign.MainMatchesSwitcherFragment;
import com.sofascore.results.main.matches.redesign.MatchesRootFragment;
import com.sofascore.results.main.matches.redesign.filter.MatchesFilterBottomSheetDialog;
import com.sofascore.results.main.matches.redesign.sportreorder.SportReorderComposeDialogFragment;
import com.sofascore.results.media.highlights.MediaHighlightHeaderView;
import com.sofascore.results.media.highlights.MediaHighlightsActivity;
import com.sofascore.results.mma.fightNight.MmaFightNightFragment;
import com.sofascore.results.profile.LoginScreenActivity;
import com.sofascore.results.view.InfoBubbleText;
import com.unity3d.ads.core.domain.events.LifecycleEventObserver;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final /* synthetic */ class ida implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ida(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x010a, code lost:
    
        if (r4 == null) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x05cd  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x05e0  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        fpa fpaVar;
        fpa fpaVar2;
        csa csaVar;
        csa csaVar2;
        List list;
        Unit invoke$lambda$1;
        boolean z;
        Object obj2;
        int i;
        Object obj3;
        String str;
        int i2 = this.a;
        int i3 = 2;
        int i4 = 3;
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        Object obj4 = this.b;
        switch (i2) {
            case 0:
                Context context = (Context) obj;
                context.getClass();
                String str2 = ((jda) obj4).b;
                LinkedHashSet linkedHashSet = ieh.a;
                linkedHashSet.getClass();
                rq3 rq3Var = null;
                break;
            case 1:
                ((tda) obj4).j = (Bitmap) obj;
                break;
            case 2:
                break;
            case 3:
                Context context2 = (Context) obj;
                context2.getClass();
                hse hseVar = new hse(context2, true);
                hseVar.r(((gla) obj4).o, null);
                break;
            case 4:
                break;
            case 5:
                qpa qpaVar = (qpa) obj4;
                float f2 = -((Float) obj).floatValue();
                if ((f2 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || qpaVar.d()) && (f2 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || qpaVar.c())) {
                    if (Math.abs(qpaVar.g) > 0.5f) {
                        u3a.c("entered drag with non-zero pending scroll");
                    }
                    float f3 = qpaVar.g + f2;
                    qpaVar.g = f3;
                    if (Math.abs(f3) > 0.5f) {
                        float f4 = qpaVar.g;
                        int b = wzb.b(f4);
                        fpa d = ((fpa) ((eoh) qpaVar.e).getValue()).d(b, !qpaVar.b);
                        if (d != null && (fpaVar2 = qpaVar.c) != null) {
                            fpa d2 = fpaVar2.d(b, true);
                            if (d2 != null) {
                                qpaVar.c = d2;
                            } else {
                                fpaVar = null;
                                if (fpaVar == null) {
                                    qpaVar.f(fpaVar, qpaVar.b, true);
                                    qpaVar.r.setValue(Unit.a);
                                    qpaVar.i(f4 - qpaVar.g, fpaVar);
                                } else {
                                    wma wmaVar = qpaVar.j;
                                    if (wmaVar != null) {
                                        wmaVar.l();
                                    }
                                    qpaVar.i(f4 - qpaVar.g, qpaVar.h());
                                }
                            }
                        }
                        fpaVar = d;
                        if (fpaVar == null) {
                        }
                    }
                    if (Math.abs(qpaVar.g) > 0.5f) {
                        f2 -= qpaVar.g;
                        qpaVar.g = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    }
                    f = f2;
                }
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                asa asaVar = (asa) obj4;
                break;
            case 9:
                ksa ksaVar = (ksa) obj4;
                float f5 = -((Float) obj).floatValue();
                if ((f5 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || ksaVar.d()) && (f5 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || ksaVar.c())) {
                    if (Math.abs(ksaVar.h) > 0.5f) {
                        u3a.c("entered drag with non-zero pending scroll");
                    }
                    ksaVar.d = true;
                    float f6 = ksaVar.h + f5;
                    ksaVar.h = f6;
                    if (Math.abs(f6) > 0.5f) {
                        float f7 = ksaVar.h;
                        int round = Math.round(f7);
                        csa d3 = ((csa) ((eoh) ksaVar.f).getValue()).d(round, !ksaVar.b);
                        if (d3 != null && (csaVar2 = ksaVar.c) != null) {
                            csa d4 = csaVar2.d(round, true);
                            if (d4 != null) {
                                ksaVar.c = d4;
                            } else {
                                csaVar = null;
                                if (csaVar == null) {
                                    ksaVar.g(csaVar, ksaVar.b, true);
                                    ksaVar.w.setValue(Unit.a);
                                    ksaVar.k(f7 - ksaVar.h, csaVar);
                                } else {
                                    wma wmaVar2 = ksaVar.l;
                                    if (wmaVar2 != null) {
                                        wmaVar2.l();
                                    }
                                    ksaVar.k(f7 - ksaVar.h, ksaVar.j());
                                }
                            }
                        }
                        csaVar = d3;
                        if (csaVar == null) {
                        }
                    }
                    if (Math.abs(ksaVar.h) > 0.5f) {
                        f5 -= ksaVar.h;
                        ksaVar.h = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    }
                    f = f5;
                }
                break;
            case 10:
                spg spgVar = (spg) obj4;
                break;
            case 11:
                esa esaVar = (esa) obj;
                esaVar.getClass();
                List list2 = ((dta) obj4).a;
                esaVar.a(list2.size(), null, new xo(list2, 15), new tc3(802480018, new yo(list2, i3), true));
                esa.d(esaVar, null, null, fcp.b, 3);
                break;
            case 12:
                cua cuaVar = (cua) obj4;
                iua iuaVar = (iua) obj;
                iuaVar.getClass();
                rui ruiVar = iuaVar.d;
                break;
            case 13:
                LeagueEditorsBottomModal leagueEditorsBottomModal = (LeagueEditorsBottomModal) obj4;
                eva evaVar = (eva) obj;
                if (evaVar != null && (list = evaVar.e) != null) {
                    ((gwa) leagueEditorsBottomModal.z.getValue()).F(list);
                }
                break;
            case 14:
                sza szaVar = (sza) obj;
                szaVar.getClass();
                ((vua) obj4).invoke(szaVar);
                break;
            case 15:
                snl snlVar = (snl) obj;
                snlVar.getClass();
                ((xnl) snlVar).a((y8) obj4);
                break;
            case 16:
                invoke$lambda$1 = LifecycleEventObserver.invoke$lambda$1((LifecycleEventObserver) obj4, (Throwable) obj);
                break;
            case 17:
                LoginScreenActivity loginScreenActivity = (LoginScreenActivity) obj4;
                String str3 = (String) obj;
                int i5 = LoginScreenActivity.M;
                int i6 = l94.C;
                LinearLayout linearLayout = loginScreenActivity.M().a;
                linearLayout.getClass();
                if (str3 == null) {
                    str3 = loginScreenActivity.getString(R.string.error_message_title);
                    str3.getClass();
                }
                wxf.x(loginScreenActivity, linearLayout, str3, loginScreenActivity.getColor(R.color.on_color_primary), loginScreenActivity.getColor(R.color.error), null, 2000, null, InterfaceC4060ee.c.g).i();
                break;
            case 18:
                Activity activity = (Activity) obj4;
                int intValue = ((Integer) obj).intValue();
                if (activity != null) {
                    FantasyEliteFaceoffIntroBottomSheet fantasyEliteFaceoffIntroBottomSheet = new FantasyEliteFaceoffIntroBottomSheet();
                    Bundle bundle = new Bundle();
                    bundle.putInt("competitionId", intValue);
                    fantasyEliteFaceoffIntroBottomSheet.setArguments(bundle);
                    AppCompatActivity appCompatActivity = activity instanceof AppCompatActivity ? (AppCompatActivity) activity : null;
                    if (appCompatActivity != null) {
                        wca.x(appCompatActivity.getLifecycle()).b(new r1(fantasyEliteFaceoffIntroBottomSheet, appCompatActivity, null, i4));
                    }
                }
                break;
            case 19:
                ppb ppbVar = (ppb) obj;
                ArrayList x0 = CollectionsKt.x0(ppbVar.a, (do7) obj4);
                HashSet hashSet = new HashSet();
                ArrayList arrayList = new ArrayList();
                Iterator it = x0.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (hashSet.add(Integer.valueOf(((do7) next).a))) {
                        arrayList.add(next);
                    }
                }
                break;
            case 20:
                krk krkVar = ((MainMatchesSwitcherFragment) obj4).l;
                krkVar.getClass();
                ((uo8) krkVar).b.c(Intrinsics.c((String) obj, "competitions") ? 1 : 0, true);
                break;
            case 21:
                break;
            case 22:
                MatchesFilterBottomSheetDialog matchesFilterBottomSheetDialog = (MatchesFilterBottomSheetDialog) obj4;
                z28 z28Var = (z28) obj;
                z28Var.getClass();
                if (!(z28Var instanceof x28)) {
                    if (!(z28Var instanceof y28)) {
                        zzl.b();
                        break;
                    } else {
                        matchesFilterBottomSheetDialog.j();
                    }
                } else {
                    ((zqb) matchesFilterBottomSheetDialog.D.getValue()).k(((x28) z28Var).a);
                    matchesFilterBottomSheetDialog.j();
                }
                break;
            case 23:
                MatchesRootFragment matchesRootFragment = (MatchesRootFragment) obj4;
                hzh hzhVar = (hzh) obj;
                hzhVar.getClass();
                boolean z2 = hzhVar.b;
                nzh nzhVar = hzhVar.a;
                if (z2 && !(nzhVar instanceof kzh)) {
                    break;
                } else {
                    if (!(nzhVar instanceof mzh)) {
                        if (!(nzhVar instanceof lzh)) {
                            if (!(nzhVar instanceof kzh)) {
                                zzl.b();
                                break;
                            } else {
                                krk krkVar2 = matchesRootFragment.l;
                                krkVar2.getClass();
                                ((to8) krkVar2).e.setVisibility(8);
                                new SportReorderComposeDialogFragment().p(matchesRootFragment.getChildFragmentManager(), "SportReorderComposeDialogFragment");
                            }
                        } else {
                            krk krkVar3 = matchesRootFragment.l;
                            krkVar3.getClass();
                            InfoBubbleText infoBubbleText = ((to8) krkVar3).e;
                            Context requireContext = matchesRootFragment.requireContext();
                            requireContext.getClass();
                            infoBubbleText.setVisibility((!o02.w0(requireContext) || matchesRootFragment.u.contains(((lzh) nzhVar).a)) ? 8 : 0);
                            Calendar calendar = ke0.a;
                            Calendar calendar2 = Calendar.getInstance();
                            calendar2.getClass();
                            ke0.a = calendar2;
                            matchesRootFragment.A().n(((lzh) nzhVar).a);
                        }
                    } else {
                        krk krkVar4 = matchesRootFragment.l;
                        krkVar4.getClass();
                        ((to8) krkVar4).e.setVisibility(8);
                        Calendar calendar3 = ke0.a;
                        Calendar calendar4 = Calendar.getInstance();
                        calendar4.getClass();
                        ke0.a = calendar4;
                        matchesRootFragment.A().n(Sports.TRENDING);
                    }
                    break;
                }
                break;
            case 24:
                break;
            case 25:
                i2c i2cVar = (i2c) obj4;
                View view = (View) obj;
                view.getClass();
                Rect rect = new Rect();
                if (view.isAttachedToWindow()) {
                    view.getGlobalVisibleRect(rect);
                }
                int height = rect.height();
                int height2 = view.getHeight();
                if (view.getLocalVisibleRect(i2cVar.d)) {
                    f = Math.abs(height + 0.01f) / (height2 + 0.01f);
                }
                break;
            case 26:
                MediaExternalVideoDialog mediaExternalVideoDialog = (MediaExternalVideoDialog) obj4;
                ((ane) obj).getClass();
                Highlight highlight = (Highlight) mediaExternalVideoDialog.v.getValue();
                FragmentActivity activity2 = mediaExternalVideoDialog.getActivity();
                if (highlight == null || activity2 == null) {
                    z = true;
                } else {
                    z = true;
                    rfo.G(highlight, activity2, new b1c(true ? 1 : 0), "Youtube modal");
                }
                mediaExternalVideoDialog.k(z, false);
                break;
            case 27:
                int i7 = MediaHighlightHeaderView.j;
                ((ane) obj).getClass();
                ((MediaHighlightHeaderView) obj4).o();
                break;
            case 28:
                MediaHighlightsActivity mediaHighlightsActivity = (MediaHighlightsActivity) obj4;
                List list3 = (List) obj;
                int i8 = MediaHighlightsActivity.a0;
                mediaHighlightsActivity.Q().e.setRefreshing(false);
                y4c R = mediaHighlightsActivity.R();
                list3.getClass();
                R.F(list3);
                Iterator it2 = list3.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        Object next2 = it2.next();
                        if (((r5c) next2).a.getId() == mediaHighlightsActivity.Y) {
                            obj2 = next2;
                        }
                    } else {
                        obj2 = null;
                    }
                }
                r5c r5cVar = (r5c) obj2;
                if (r5cVar != null) {
                    mediaHighlightsActivity.Q().d.n(r5cVar.a);
                }
                break;
            default:
                MmaFightNightFragment mmaFightNightFragment = (MmaFightNightFragment) obj4;
                mqi mqiVar = mmaFightNightFragment.s;
                List list4 = (List) obj;
                mmaFightNightFragment.n();
                if (list4 != null) {
                    if (mmaFightNightFragment.C().g.isEmpty()) {
                        Event event = (Event) CollectionsKt.j0(list4);
                        LayoutInflater layoutInflater = mmaFightNightFragment.getLayoutInflater();
                        krk krkVar5 = mmaFightNightFragment.l;
                        krkVar5.getClass();
                        View inflate = layoutInflater.inflate(R.layout.mma_fight_night_header, (ViewGroup) ((oo8) krkVar5).d, false);
                        int i9 = R.id.organisation_logo;
                        ImageView imageView = (ImageView) nq8.B(R.id.organisation_logo, inflate);
                        if (imageView != null) {
                            i9 = R.id.text_bottom;
                            TextView textView = (TextView) nq8.B(R.id.text_bottom, inflate);
                            if (textView != null) {
                                i9 = R.id.text_top;
                                TextView textView2 = (TextView) nq8.B(R.id.text_top, inflate);
                                if (textView2 != null) {
                                    i9 = R.id.venue_container;
                                    LinearLayout linearLayout2 = (LinearLayout) nq8.B(R.id.venue_container, inflate);
                                    if (linearLayout2 != null) {
                                        i9 = R.id.venue_flag;
                                        ImageView imageView2 = (ImageView) nq8.B(R.id.venue_flag, inflate);
                                        if (imageView2 != null) {
                                            ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                                            if (event != null) {
                                                long timestamp = event.getTimestamp();
                                                bi4 bi4Var = bi4.PATTERN_DAY_DMY;
                                                ConcurrentHashMap concurrentHashMap = hk4.a;
                                                String i10 = fc6.i(timestamp, hk4.a(bi4Var.d()));
                                                Context requireContext2 = mmaFightNightFragment.requireContext();
                                                requireContext2.getClass();
                                                long timestamp2 = event.getTimestamp();
                                                String bestPattern = hk4.b().getBestPattern(DateFormat.is24HourFormat(requireContext2) ? "Hm" : "hm");
                                                bestPattern.getClass();
                                                me4.s(new Object[]{i10, fc6.i(timestamp2, hk4.a(bestPattern))}, 2, Locale.getDefault(), "%s | %s", textView2);
                                                Context requireContext3 = mmaFightNightFragment.requireContext();
                                                requireContext3.getClass();
                                                String n = tnf.n(requireContext3, event);
                                                if (n == null) {
                                                    i = 8;
                                                    linearLayout2.setVisibility(8);
                                                    obj3 = Unit.a;
                                                    break;
                                                } else {
                                                    textView.setText(n);
                                                    Venue venue = event.getVenue();
                                                    if (venue == null) {
                                                        i = 8;
                                                        imageView2.setVisibility(8);
                                                        Unit unit = Unit.a;
                                                        obj3 = n;
                                                        break;
                                                    } else {
                                                        Country country = venue.getCountry();
                                                        if (country == null || (str = country.getAlpha2()) == null) {
                                                            str = "";
                                                        }
                                                        as9.c(imageView2, str, true, null, 4);
                                                        i = 8;
                                                        obj3 = n;
                                                        break;
                                                    }
                                                }
                                            } else {
                                                i = 8;
                                            }
                                            textView2.setVisibility(i);
                                            Unit unit2 = Unit.a;
                                            UniqueTournament uniqueTournament = ((Tournament) mqiVar.getValue()).getUniqueTournament();
                                            if (uniqueTournament != null) {
                                                as9.q(imageView, Integer.valueOf(uniqueTournament.getId()), ((Tournament) mqiVar.getValue()).getId(), null);
                                                imageView.setOnClickListener(new au7(23, mmaFightNightFragment, uniqueTournament));
                                            }
                                            ymc C = mmaFightNightFragment.C();
                                            constraintLayout.getClass();
                                            C.p(C.g.size(), constraintLayout);
                                        }
                                    }
                                }
                            }
                        }
                        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i9)));
                        break;
                    }
                    mmaFightNightFragment.C().F(list4);
                    ymc C2 = mmaFightNightFragment.C();
                    bba bbaVar = new bba(mmaFightNightFragment, 13);
                    C2.getClass();
                    C2.a.d = bbaVar;
                }
                break;
        }
        return Unit.a;
    }
}
