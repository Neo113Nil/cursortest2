package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.widget.TextView;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.inmobi.media.N2;
import com.inmobi.media.Xa;
import com.inmobi.media.Y5;
import com.sofascore.model.Country;
import com.sofascore.model.PlayerTransferFilterData;
import com.sofascore.model.mvvm.model.CustomizableDivider;
import com.sofascore.model.mvvm.model.TvChannel;
import com.sofascore.model.mvvm.model.Venue;
import com.sofascore.model.newNetwork.VenueResponse;
import com.sofascore.results.bettingtips.fragment.TopH2HFragment;
import com.sofascore.results.bettingtips.fragment.TrendingOddsFragment;
import com.sofascore.results.event.details.view.tv.dialog.TvChannelCountriesDialog;
import com.sofascore.results.event.media.VideoActivity;
import com.sofascore.results.league.fragment.topStats.TopPerformanceCategoryUiModel;
import com.sofascore.results.league.fragment.topStats.TopPlayerCategoryUiModel;
import com.sofascore.results.league.fragment.topStats.TopTeamCategoryUiModel;
import com.sofascore.results.service.WidgetFavoriteWorker;
import com.sofascore.results.venue.VenueActivity;
import com.sofascore.results.weeklyChallenge.WeeklyChallengeActivity;
import com.sofascore.results.weeklyChallenge.WeeklyChallengeUserDailyBonusModal;
import com.sofascore.results.weeklyChallenge.leaderboard.UpcomingMatchesModal;
import com.sofascore.results.weeklyChallenge.predictions.WeeklyPredictionsActivity;
import com.unity3d.ads.core.data.repository.DiagnosticEventRepository;
import com.unity3d.services.core.di.UnityAdsModule;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class qdj implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qdj(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v13, types: [com.sofascore.results.league.fragment.topStats.TopStatsCategory, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v16, types: [com.sofascore.results.league.fragment.topStats.TopPlayerCategoryUiModel] */
    /* JADX WARN: Type inference failed for: r3v18, types: [com.sofascore.results.league.fragment.topStats.TopPerformanceCategoryUiModel] */
    /* JADX WARN: Type inference failed for: r3v20, types: [com.sofascore.results.league.fragment.topStats.TopTeamCategoryUiModel] */
    /* JADX WARN: Type inference failed for: r3v22, types: [com.sofascore.results.league.fragment.topStats.TopPlayerCategoryUiModel] */
    /* JADX WARN: Type inference failed for: r3v24, types: [com.sofascore.results.league.fragment.topStats.TopPerformanceCategoryUiModel] */
    /* JADX WARN: Type inference failed for: r3v26, types: [com.sofascore.results.league.fragment.topStats.TopTeamCategoryUiModel] */
    /* JADX WARN: Type inference failed for: r5v0, types: [rq3] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v8 */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit publicApiJob$lambda$1$lambda$0;
        int i;
        String alpha2;
        String name;
        int i2 = this.a;
        Object obj2 = null;
        Object obj3 = this.b;
        switch (i2) {
            case 0:
                iej iejVar = (iej) obj3;
                p80 p80Var = (p80) obj;
                m80 m80Var = (m80) p80Var.a;
                if (m80Var instanceof fbb) {
                    fbb fbbVar = (fbb) m80Var;
                    if (fbbVar.b == null) {
                        return p80.a(p80Var, new fbb(fbbVar.a, iejVar), 0, 0, 14);
                    }
                }
                if (!(m80Var instanceof ebb)) {
                    return p80Var;
                }
                ebb ebbVar = (ebb) m80Var;
                return ebbVar.b == null ? p80.a(p80Var, new ebb(ebbVar.a, iejVar), 0, 0, 14) : p80Var;
            case 1:
                ((TopH2HFragment) obj3).I();
                return Unit.a;
            case 2:
                ynj ynjVar = (ynj) obj;
                ynjVar.getClass();
                return ynj.a(ynjVar, null, null, null, true, (qnj) obj3, 15);
            case 3:
                fnj fnjVar = (fnj) obj3;
                ynj ynjVar2 = (ynj) obj;
                gv9<??> gv9Var = ynjVar2.a;
                ArrayList arrayList = new ArrayList(k13.r(gv9Var, 10));
                for (?? r3 : gv9Var) {
                    ymj ymjVar = (ymj) fnjVar;
                    if (Intrinsics.c(r3, ymjVar.a)) {
                        if (ymjVar.b) {
                            if (r3 instanceof TopTeamCategoryUiModel) {
                                r3 = TopTeamCategoryUiModel.a((TopTeamCategoryUiModel) r3, null, 23);
                            } else if (r3 instanceof TopPerformanceCategoryUiModel) {
                                r3 = TopPerformanceCategoryUiModel.a((TopPerformanceCategoryUiModel) r3, 7);
                            } else {
                                if (!(r3 instanceof TopPlayerCategoryUiModel)) {
                                    zzl.b();
                                    return null;
                                }
                                r3 = TopPlayerCategoryUiModel.a((TopPlayerCategoryUiModel) r3, null, 23);
                            }
                        } else if (r3 instanceof TopTeamCategoryUiModel) {
                            r3 = TopTeamCategoryUiModel.a((TopTeamCategoryUiModel) r3, null, 27);
                        } else if (r3 instanceof TopPerformanceCategoryUiModel) {
                            r3 = TopPerformanceCategoryUiModel.a((TopPerformanceCategoryUiModel) r3, 11);
                        } else {
                            if (!(r3 instanceof TopPlayerCategoryUiModel)) {
                                zzl.b();
                                return null;
                            }
                            r3 = TopPlayerCategoryUiModel.a((TopPlayerCategoryUiModel) r3, null, 27);
                        }
                    }
                    arrayList.add(r3);
                }
                return ynj.a(ynjVar2, l6g.W(arrayList), null, null, false, null, 62);
            case 4:
                return ynj.a((ynj) obj, null, null, null, true, (uza) obj3, 15);
            case 5:
                dxe dxeVar = (dxe) obj3;
                List list = (List) obj;
                list.getClass();
                dxeVar.c = new ArrayList(list);
                dxeVar.notifyDataSetChanged();
                return Unit.a;
            case 6:
                ovj ovjVar = (ovj) obj3;
                SharedPreferences.Editor editor = (SharedPreferences.Editor) obj;
                editor.getClass();
                r5 = ovjVar.a ? "-" : 0;
                if (r5 == 0) {
                    r5 = "";
                }
                editor.putString("PREF_SORT_TYPE", r5.concat(ovjVar.b.a));
                return Unit.a;
            case 7:
                SharedPreferences.Editor editor2 = (SharedPreferences.Editor) obj;
                editor2.getClass();
                bga bgaVar = vga.a;
                bgaVar.getClass();
                editor2.putString("PREF_TRANSFER_FILTER_DATA", bgaVar.c(l98.W(PlayerTransferFilterData.INSTANCE.serializer()), (PlayerTransferFilterData) obj3));
                return Unit.a;
            case 8:
                TrendingOddsFragment trendingOddsFragment = (TrendingOddsFragment) obj3;
                trendingOddsFragment.M().l = (zu1) obj;
                trendingOddsFragment.I();
                return Unit.a;
            case 9:
                q1k q1kVar = (q1k) obj3;
                vv2 vv2Var = (vv2) obj;
                vv2Var.getClass();
                SerialDescriptor descriptor = q1kVar.a.getDescriptor();
                km5 km5Var = km5.a;
                vv2Var.a("first", descriptor, km5Var, false);
                vv2Var.a("second", q1kVar.b.getDescriptor(), km5Var, false);
                vv2Var.a("third", q1kVar.c.getDescriptor(), km5Var, false);
                return Unit.a;
            case 10:
                TvChannelCountriesDialog tvChannelCountriesDialog = (TvChannelCountriesDialog) obj3;
                joa joaVar = tvChannelCountriesDialog.E;
                List list2 = (List) obj;
                list2.getClass();
                List list3 = tv3.a;
                Context requireContext = tvChannelCountriesDialog.requireContext();
                requireContext.getClass();
                List H0 = CollectionsKt.H0(list2, tv3.b(requireContext));
                ArrayList arrayList2 = new ArrayList();
                for (Object obj4 : H0) {
                    Country country = (Country) obj4;
                    Country country2 = (Country) joaVar.getValue();
                    if (!Intrinsics.c(country2 != null ? country2.getIso2Alpha() : null, country.getIso2Alpha()) && !country.getChannelIds().isEmpty()) {
                        arrayList2.add(obj4);
                    }
                }
                xbb b = a.b();
                Country country3 = (Country) joaVar.getValue();
                if (country3 != null) {
                    b.add(country3);
                    b.add(new CustomizableDivider(true, 0, false, null, 14, null));
                }
                if (!arrayList2.isEmpty()) {
                    b.addAll(arrayList2);
                    b.add(new CustomizableDivider(true, 0, false, null, 14, null));
                }
                b.addAll(H0);
                ((h3k) tvChannelCountriesDialog.C.getValue()).F(a.a(b));
                return Unit.a;
            case 11:
                Country country4 = (Country) obj;
                Iterator it = ((u3k) obj3).k.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        if (Intrinsics.c(((TvChannel) next).getCountryCode(), country4.getIso2Alpha())) {
                            obj2 = next;
                        }
                    }
                }
                return Boolean.valueOf(obj2 != null);
            case 12:
                publicApiJob$lambda$1$lambda$0 = UnityAdsModule.publicApiJob$lambda$1$lambda$0((DiagnosticEventRepository) obj3, (Throwable) obj);
                return publicApiJob$lambda$1$lambda$0;
            case 13:
                b4l b4lVar = (b4l) obj;
                su suVar = ((UpcomingMatchesModal) obj3).t;
                if (b4lVar instanceof a4l) {
                    int size = ((a4l) b4lVar).a.size();
                    i = Integer.valueOf(size <= 3 ? size : 3);
                } else {
                    i = 0;
                }
                suVar.e = i;
                return Unit.a;
            case 14:
                VenueActivity venueActivity = (VenueActivity) obj3;
                VenueResponse venueResponse = (VenueResponse) obj;
                int i3 = VenueActivity.Q;
                venueActivity.Q().j.setRefreshing(false);
                venueActivity.Q().j.setEnabled(false);
                if (venueResponse != null && !venueActivity.O) {
                    venueActivity.O = true;
                    Venue venue = venueResponse.getVenue();
                    venueActivity.Q().d.setText(venue.getName());
                    String name2 = venue.getCity().getName();
                    com.sofascore.model.mvvm.model.Country country5 = venue.getCountry();
                    String y = dmi.y(name2, (country5 == null || (name = country5.getName()) == null) ? "" : ", ".concat(tv3.c(venueActivity, name)));
                    TextView textView = venueActivity.Q().e;
                    textView.setVisibility(StringsKt.R(y) ? 8 : 0);
                    textView.setText(y);
                    com.sofascore.model.mvvm.model.Country country6 = venue.getCountry();
                    String alpha22 = country6 != null ? country6.getAlpha2() : null;
                    if (alpha22 != null) {
                        String n = fc6.n((Intrinsics.c(uaa.c, "api.sofascore.com/") ? "https://img.sofascore.com/" : dmi.q("https://", uaa.c)).concat("api/v1/"), "country/", alpha22, "/flag");
                        ua5 ua5Var = ua5.a;
                        int intValue = ((Number) venueActivity.P.getValue()).intValue();
                        t25.a(intValue);
                        haa.q(textView, n, ua5Var, new t25(intValue));
                        textView.setCompoundDrawablePadding(ao2.s(4, venueActivity));
                    }
                    com.sofascore.model.mvvm.model.Country country7 = venueResponse.getVenue().getCountry();
                    if (country7 != null && (alpha2 = country7.getAlpha2()) != null) {
                        String str = alpha2.length() > 0 ? alpha2 : null;
                        if (str != null) {
                            venueActivity.Q().b.setBackground(new uy0(str));
                        }
                    }
                    ((dok) venueActivity.M.getValue()).x(bok.d);
                }
                return Unit.a;
            case 15:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                ((eoh) ((VideoActivity) obj3).L).setValue(bool);
                return Unit.a;
            case 16:
                int i4 = WeeklyChallengeActivity.O;
                ((Unit) obj).getClass();
                ((WeeklyChallengeActivity) obj3).setResult(-1);
                return Unit.a;
            case 17:
                WeeklyChallengeUserDailyBonusModal weeklyChallengeUserDailyBonusModal = (WeeklyChallengeUserDailyBonusModal) obj3;
                if (((Boolean) obj).booleanValue()) {
                    weeklyChallengeUserDailyBonusModal.getParentFragmentManager().h0(fz8.C(new x62[0]), "REQUEST_REFRESH");
                }
                return Unit.a;
            case 18:
                esa esaVar = (esa) obj;
                esaVar.getClass();
                esa.d(esaVar, null, null, new tc3(-534984933, new uri((v3l) obj3, 20), true), 3);
                return Unit.a;
            case 19:
                int i5 = WeeklyPredictionsActivity.O;
                int i6 = a5l.a[((cg) obj).a.ordinal()];
                joa joaVar2 = ((WeeklyPredictionsActivity) obj3).N;
                if (i6 == 1) {
                    ((yk) joaVar2.getValue()).show();
                } else {
                    ((yk) joaVar2.getValue()).dismiss();
                }
                return Unit.a;
            case 20:
                p0d p0dVar = (p0d) obj;
                p0dVar.getClass();
                p0d g = p0dVar.g();
                e5f e5fVar = n6l.c;
                Context applicationContext = ((WidgetFavoriteWorker) obj3).getApplicationContext();
                applicationContext.getClass();
                SharedPreferences sharedPreferences = uic.j;
                if (sharedPreferences == null) {
                    Context applicationContext2 = applicationContext.getApplicationContext();
                    synchronized (uic.i) {
                        sharedPreferences = a5f.d(applicationContext2);
                        uic.j = sharedPreferences;
                    }
                    sharedPreferences.getClass();
                }
                String string = sharedPreferences.getString("PREF_NOTIFICATION_STATUS", "NOTIFICATION_ENABLED");
                String str2 = string != null ? string : "NOTIFICATION_ENABLED";
                if (!new fgd(applicationContext).b.areNotificationsEnabled()) {
                    str2 = "NOTIFICATION_DISABLED";
                } else if (str2.equals("NOTIFICATION_DISABLED")) {
                    str2 = "NOTIFICATION_ENABLED";
                }
                g.e(e5fVar, str2);
                return g;
            case 21:
                qkl qklVar = (qkl) obj3;
                ((Unit) obj).getClass();
                qklVar.getClass();
                xw3.L(un0.z(qklVar), null, null, new njl(qklVar, r5, 28), 3);
                return Unit.a;
            case 22:
                return oil.a((oil) obj, null, null, null, null, null, false, (rfl) obj3, false, false, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, 33554367);
            case 23:
                rxa rxaVar = (rxa) obj3;
                oil oilVar = (oil) obj;
                sxa sxaVar = oilVar.d;
                return oil.a(oilVar, null, null, null, sxaVar != null ? sxa.a(sxaVar, null, null, rxaVar, true, null, 39) : null, null, false, null, false, false, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, 33554423);
            case 24:
                sxa sxaVar2 = (sxa) obj3;
                oil oilVar2 = (oil) obj;
                sxa sxaVar3 = oilVar2.d;
                return oil.a(oilVar2, null, null, null, sxaVar3 != null ? sxa.a(sxaVar3, null, sxaVar2.c, null, false, sxaVar2.f, 11) : null, null, false, null, false, false, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, 33554423);
            case 25:
                sfl sflVar = (sfl) obj3;
                oil oilVar3 = (oil) obj;
                rfl rflVar = oilVar3.g;
                return oil.a(oilVar3, null, null, null, null, null, false, rflVar != null ? rfl.a(rflVar, sflVar, null, null, PglCryptUtils.COMPRESS_FAILED) : null, false, false, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, 33554367);
            case 26:
                ajl ajlVar = (ajl) obj3;
                oil oilVar4 = (oil) obj;
                rfl rflVar2 = oilVar4.g;
                return oil.a(oilVar4, null, null, null, null, null, false, rflVar2 != null ? rfl.a(rflVar2, null, null, ajlVar, 383) : null, false, false, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, 33554367);
            case 27:
                return oil.a((oil) obj, null, null, null, null, null, false, null, false, false, null, null, false, null, null, null, null, null, null, null, null, null, null, (xxi) obj3, null, null, 29360127);
            case 28:
                return Xa.a((Xa) obj3, (N2) obj);
            default:
                return Y5.a((Y5) obj3, (JSONObject) obj);
        }
    }
}
