package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Parcelable;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.identityauth.HiddenActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.blaze.blazesdk.ads.custom_native.models.BlazeAdRequestData;
import com.blaze.gam.custom_native.BlazeCustomNativeAdsProvider;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import com.google.android.gms.identitycredentials.PendingGetCredentialHandle;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.sofascore.model.Country;
import com.sofascore.model.FirebaseBundle;
import com.sofascore.model.fantasy.FantasyCompetitionType;
import com.sofascore.model.fantasy.FantasyLeagueType;
import com.sofascore.model.firebase.ParamJsonDepthLevel;
import com.sofascore.model.firebase.RemoteConfigParameter;
import com.sofascore.model.firebase.RemoteConfigParameterLine;
import com.sofascore.model.mvvm.IRecent;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.model.mvvm.model.TeamSides;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.model.newNetwork.AffiliateBanner;
import com.sofascore.model.profile.Contribution;
import com.sofascore.model.profile.ContributionCount;
import com.sofascore.model.profile.ContributionStatus;
import com.sofascore.model.profile.ContributionSummaryResponse;
import com.sofascore.model.profile.ContributionType;
import com.sofascore.model.profile.Contributions;
import com.sofascore.model.profile.CrowdsourcingAggregates;
import com.sofascore.model.profile.ProfileData;
import com.sofascore.model.profile.ShortEvent;
import com.sofascore.results.R;
import com.sofascore.results.fantasy.competition.articles.FantasyNewsArticlesActivity;
import com.sofascore.results.fantasy.competition.home.bottomsheet.chat.FantasyChatsBottomSheet;
import com.sofascore.results.fantasy.competition.home.bottomsheet.playeroftheround.FantasyPlayersOfTheRoundBottomSheet;
import com.sofascore.results.fantasy.competition.home.bottomsheet.pricetracker.FantasyPriceTrackerBottomSheet;
import com.sofascore.results.fantasy.competition.home.bottomsheet.topplayers.FantasyTopPlayersBottomSheet;
import com.sofascore.results.fantasy.competition.managerprofile.FantasyManagerProfileActivity;
import com.sofascore.results.fantasy.competition.team.player.FantasyFootballPlayerBottomSheet;
import com.sofascore.results.fantasy.league.FantasyLeagueActivity;
import com.sofascore.results.fantasy.onboarding.FantasyOnboardingActivity;
import com.sofascore.results.fantasy.onboarding.components.bottomSheet.FantasySectionedInfoType;
import com.sofascore.results.fantasy.ui.model.FantasyPlayerFixtureData;
import com.sofascore.results.fantasy.ui.model.FantasyRoundPlayerUiModel;
import com.sofascore.results.fantasy.userteam.FantasyUserSquadActivity;
import com.sofascore.results.fantasy.weekly.FantasyEliteFaceoffRevealDialog;
import com.sofascore.results.main.fantasy.bottomsheet.FantasySectionedBottomSheetFragment;
import com.sofascore.results.main.start.StartActivity;
import com.sofascore.results.onboarding.OnboardingActivity;
import com.sofascore.results.profile.LoginScreenActivity;
import com.sofascore.results.service.InfoWorker;
import com.unity3d.services.UnityAdsConstants;
import java.io.Serializable;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.a;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class l50 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ l50(gf7 gf7Var, Function1 function1, cdi cdiVar, Context context) {
        this.a = 21;
        this.b = gf7Var;
        this.d = function1;
        this.c = cdiVar;
        this.e = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r27v2 */
    /* JADX WARN: Type inference failed for: r27v3 */
    /* JADX WARN: Type inference failed for: r27v4 */
    /* JADX WARN: Type inference failed for: r27v5, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r27v6 */
    /* JADX WARN: Type inference failed for: r27v7 */
    /* JADX WARN: Type inference failed for: r27v8 */
    private final Object a(Object obj) {
        long k;
        vuf vufVar;
        Object value;
        SharedPreferences d;
        Object value2;
        SharedPreferences d2;
        ?? r27;
        b bVar;
        Function0 function0 = (Function0) this.b;
        Context context = (Context) this.c;
        q05 q05Var = (q05) this.d;
        Function0 function02 = (Function0) this.e;
        oz4 oz4Var = (oz4) obj;
        oz4Var.getClass();
        int i = 0;
        if (oz4Var.equals(ry4.a)) {
            function0.invoke();
            context.getClass();
            Intent intent = new Intent(context, (Class<?>) StartActivity.class);
            intent.addFlags(268435456);
            context.startActivity(intent);
            FragmentActivity K = hkg.K(context);
            if (K != null) {
                K.finish();
            }
            Runtime.getRuntime().exit(0);
            Unit unit = Unit.a;
        } else {
            rq3 rq3Var = null;
            if (oz4Var.equals(wy4.a)) {
                xw3.L(un0.z(q05Var), null, null, new o05(q05Var, rq3Var, i), 3);
                function0.invoke();
                Unit unit2 = Unit.a;
            } else if (oz4Var.equals(ty4.a)) {
                function0.invoke();
                Unit unit3 = Unit.a;
            } else {
                int i2 = 2;
                if (oz4Var.equals(az4.a)) {
                    context.getClass();
                    gph gphVar = new gph(context, R.style.RedesignDialog);
                    e92 f = e92.f(LayoutInflater.from(context));
                    HashMap b = e58.f().b();
                    nm5 nm5Var = new nm5(context, i2);
                    z8e.b0((RecyclerView) f.b, context, false, false, null, 30);
                    ((RecyclerView) f.b).setAdapter(nm5Var);
                    Spinner spinner = (Spinner) f.f;
                    Set entrySet = b.entrySet();
                    ArrayList arrayList = new ArrayList(k13.r(entrySet, 10));
                    Iterator it = entrySet.iterator();
                    while (it.hasNext()) {
                        arrayList.add((String) ((Map.Entry) it.next()).getKey());
                    }
                    spinner.setAdapter((SpinnerAdapter) new rxf(CollectionsKt.G0(arrayList)));
                    spinner.setOnItemSelectedListener(new mxf(f, i));
                    ArrayList arrayList2 = new ArrayList();
                    for (Map.Entry entry : CollectionsKt.H0(b.entrySet(), new laf(9))) {
                        String str = (String) entry.getKey();
                        m58 m58Var = (m58) entry.getValue();
                        ArrayList arrayList3 = new ArrayList();
                        arrayList3.add(new RemoteConfigParameterLine(dmi.y(str, ":"), ParamJsonDepthLevel.PARAM_NAME));
                        try {
                            bga bgaVar = vga.a;
                            String d3 = ((n58) m58Var).d();
                            bgaVar.getClass();
                            bVar = (b) bgaVar.b(sfa.a, d3);
                        } catch (Exception unused) {
                            r27 = rq3Var;
                        }
                        if (bVar instanceof c) {
                            for (Map.Entry entry2 : ((c) bVar).a.entrySet()) {
                                String str2 = (String) entry2.getKey();
                                b bVar2 = (b) entry2.getValue();
                                r27 = rq3Var;
                                try {
                                    arrayList3.add(new RemoteConfigParameterLine(str2 + ":", ParamJsonDepthLevel.OBJECT_NAME));
                                    arrayList3.add(new RemoteConfigParameterLine(bVar2.toString(), ParamJsonDepthLevel.OBJECT_TEXT));
                                    rq3Var = r27;
                                } catch (Exception unused2) {
                                    arrayList3.add(new RemoteConfigParameterLine(((n58) m58Var).d(), ParamJsonDepthLevel.PARAM_TEXT));
                                    arrayList2.add(new RemoteConfigParameter(arrayList3));
                                    rq3Var = r27;
                                }
                            }
                            r27 = rq3Var;
                            arrayList2.add(new RemoteConfigParameter(arrayList3));
                            rq3Var = r27;
                        } else {
                            r27 = rq3Var;
                            m3a m3aVar = qfa.a;
                            bVar.getClass();
                            a aVar = bVar instanceof a ? (a) bVar : r27;
                            if (aVar == null) {
                                qfa.d("JsonArray", bVar);
                                throw r27;
                            }
                            arrayList3.add(new RemoteConfigParameterLine(aVar.toString(), ParamJsonDepthLevel.PARAM_TEXT));
                            arrayList2.add(new RemoteConfigParameter(arrayList3));
                            rq3Var = r27;
                        }
                    }
                    nm5Var.F(arrayList2);
                    gphVar.setView((RelativeLayout) f.e);
                    gphVar.setButton(-1, context.getResources().getString(R.string.close_window_button), new on(10));
                    gphVar.show();
                } else {
                    int i3 = 1;
                    if (oz4Var.equals(zy4.a)) {
                        context.getClass();
                        gph gphVar2 = new gph(context, R.style.RedesignDialog);
                        e92 f2 = e92.f(LayoutInflater.from(context));
                        SharedPreferences sharedPreferences = uic.j;
                        if (sharedPreferences == null) {
                            Context applicationContext = context.getApplicationContext();
                            synchronized (uic.i) {
                                sharedPreferences = a5f.d(applicationContext);
                                uic.j = sharedPreferences;
                            }
                            sharedPreferences.getClass();
                        }
                        Map<String, ?> all = sharedPreferences.getAll();
                        nm5 nm5Var2 = new nm5(context, i2);
                        z8e.b0((RecyclerView) f2.b, context, false, false, null, 30);
                        ((RecyclerView) f2.b).setAdapter(nm5Var2);
                        Spinner spinner2 = (Spinner) f2.f;
                        Set<Map.Entry<String, ?>> entrySet2 = all.entrySet();
                        ArrayList arrayList4 = new ArrayList(k13.r(entrySet2, 10));
                        Iterator it2 = entrySet2.iterator();
                        while (it2.hasNext()) {
                            arrayList4.add((String) ((Map.Entry) it2.next()).getKey());
                        }
                        spinner2.setAdapter((SpinnerAdapter) new rxf(CollectionsKt.G0(arrayList4)));
                        ((Spinner) f2.f).setOnItemSelectedListener(new mxf(f2, i3));
                        TreeMap treeMap = new TreeMap(all);
                        ArrayList arrayList5 = new ArrayList(treeMap.size());
                        for (Map.Entry entry3 : treeMap.entrySet()) {
                            String str3 = (String) entry3.getKey();
                            Object value3 = entry3.getValue();
                            str3.getClass();
                            arrayList5.add(new RemoteConfigParameter(kotlin.collections.b.j(new RemoteConfigParameterLine(str3, ParamJsonDepthLevel.PARAM_NAME), new RemoteConfigParameterLine(String.valueOf(value3), ParamJsonDepthLevel.PARAM_TEXT))));
                        }
                        nm5Var2.F(arrayList5);
                        gphVar2.setView((RelativeLayout) f2.e);
                        gphVar2.setButton(-1, context.getResources().getString(R.string.close_window_button), new on(12));
                        gphVar2.show();
                        Unit unit4 = Unit.a;
                    } else if (oz4Var.equals(yy4.a)) {
                        int i4 = OnboardingActivity.L;
                        context.getClass();
                        Intent intent2 = new Intent(context, (Class<?>) OnboardingActivity.class);
                        intent2.addFlags(67108864);
                        context.startActivity(intent2);
                        Unit unit5 = Unit.a;
                    } else if (oz4Var.equals(xy4.a)) {
                        function02.invoke();
                        Unit unit6 = Unit.a;
                    } else if (oz4Var instanceof gz4) {
                        boolean z = ((gz4) oz4Var).a;
                        fdi fdiVar = q05Var.m;
                        while (true) {
                            Object value4 = fdiVar.getValue();
                            boolean z2 = z;
                            if (fdiVar.k(value4, j05.a((j05) value4, null, null, null, null, null, null, null, null, null, null, false, null, null, z2, false, null, false, 267386879))) {
                                break;
                            }
                            z = z2;
                        }
                        Unit unit7 = Unit.a;
                    } else if (oz4Var instanceof mz4) {
                        boolean z3 = ((mz4) oz4Var).a;
                        fdi fdiVar2 = q05Var.m;
                        while (true) {
                            Object value5 = fdiVar2.getValue();
                            boolean z4 = z3;
                            if (fdiVar2.k(value5, j05.a((j05) value5, null, null, null, null, null, null, null, null, null, null, false, null, null, false, z4, null, false, 266338303))) {
                                break;
                            }
                            z3 = z4;
                        }
                        Unit unit8 = Unit.a;
                    } else if (oz4Var instanceof dz4) {
                        boolean z5 = ((dz4) oz4Var).a;
                        fdi fdiVar3 = q05Var.m;
                        while (true) {
                            Object value6 = fdiVar3.getValue();
                            boolean z6 = z5;
                            if (fdiVar3.k(value6, j05.a((j05) value6, null, null, null, null, null, null, null, null, null, null, false, null, null, false, false, null, z6, 201326591))) {
                                break;
                            }
                            z5 = z6;
                        }
                        Unit unit9 = Unit.a;
                    } else if (oz4Var instanceof ez4) {
                        String str4 = ((ez4) oz4Var).a;
                        Context i5 = q05Var.i();
                        if (!str4.equals(uaa.c)) {
                            uaa.c = str4;
                            SharedPreferences sharedPreferences2 = uic.j;
                            if (sharedPreferences2 == null) {
                                Context applicationContext2 = i5.getApplicationContext();
                                synchronized (uic.i) {
                                    d2 = a5f.d(applicationContext2);
                                    uic.j = d2;
                                }
                                d2.getClass();
                                sharedPreferences2 = d2;
                            }
                            SharedPreferences.Editor edit = sharedPreferences2.edit();
                            edit.getClass();
                            edit.putString("BASE_URL_v4", str4);
                            Unit unit10 = Unit.a;
                            edit.apply();
                        }
                        Context i6 = q05Var.i();
                        ktd A = mha.A(new ktd(InfoWorker.class));
                        mha.y(A);
                        vxd.h(i6).b("InfoWorker-".concat(""), nf6.a, (ltd) A.a());
                        fdi fdiVar4 = q05Var.m;
                        while (true) {
                            Object value7 = fdiVar4.getValue();
                            String str5 = str4;
                            if (fdiVar4.k(value7, j05.a((j05) value7, null, null, null, null, null, null, null, null, null, null, false, str5, null, false, false, null, false, 268173311))) {
                                break;
                            }
                            str4 = str5;
                        }
                        Unit unit11 = Unit.a;
                    } else if (oz4Var instanceof fz4) {
                        Country country = ((fz4) oz4Var).a;
                        fdi fdiVar5 = q05Var.m;
                        do {
                            value2 = fdiVar5.getValue();
                        } while (!fdiVar5.k(value2, j05.a((j05) value2, null, null, null, null, n9e.y(country), null, null, country, null, null, false, null, null, false, false, null, false, 268384255)));
                        int intValue = ((Number) CollectionsKt.Y(country.getMccList())).intValue();
                        ke0.c = intValue;
                        ke0.e = Integer.valueOf(intValue);
                        SharedPreferences.Editor edit2 = q05Var.h.edit();
                        edit2.getClass();
                        edit2.putInt("PREF_DEV_MODE_MCC", intValue);
                        edit2.putInt("PREF_DEV_MODE_MCC_2", intValue);
                        edit2.apply();
                        if (country.getHasRegions()) {
                            b0a.Q(q05Var.i(), ((yuf) CollectionsKt.Y(yuf.n)).b);
                        } else {
                            b0a.Q(q05Var.i(), null);
                        }
                        c5n.x(q05Var.i());
                        Unit unit12 = Unit.a;
                    } else if (oz4Var instanceof bz4) {
                        xk xkVar = ((bz4) oz4Var).a;
                        Context i7 = q05Var.i();
                        SharedPreferences sharedPreferences3 = uic.j;
                        if (sharedPreferences3 == null) {
                            Context applicationContext3 = i7.getApplicationContext();
                            synchronized (uic.i) {
                                d = a5f.d(applicationContext3);
                                uic.j = d;
                            }
                            d.getClass();
                            sharedPreferences3 = d;
                        }
                        SharedPreferences.Editor edit3 = sharedPreferences3.edit();
                        edit3.getClass();
                        edit3.putString("PREF_DEV_AD_NETWORK", xkVar.name());
                        Unit unit13 = Unit.a;
                        edit3.apply();
                        fdi fdiVar6 = q05Var.m;
                        while (true) {
                            Object value8 = fdiVar6.getValue();
                            xk xkVar2 = xkVar;
                            if (fdiVar6.k(value8, j05.a((j05) value8, null, null, null, null, null, xkVar, null, null, null, null, false, null, null, false, false, null, false, 268431359))) {
                                break;
                            }
                            xkVar = xkVar2;
                        }
                        Unit unit14 = Unit.a;
                    } else if (oz4Var instanceof cz4) {
                        AffiliateBanner affiliateBanner = ((cz4) oz4Var).a;
                        fdi fdiVar7 = q05Var.m;
                        do {
                            value = fdiVar7.getValue();
                        } while (!fdiVar7.k(value, j05.a((j05) value, null, null, null, null, null, null, affiliateBanner, null, null, null, false, null, null, false, false, null, false, 268427263)));
                        Unit unit15 = Unit.a;
                    } else if (oz4Var instanceof hz4) {
                        q05Var.m(((hz4) oz4Var).a);
                        Unit unit16 = Unit.a;
                    } else if (oz4Var instanceof iz4) {
                        iz4 iz4Var = (iz4) oz4Var;
                        mi6 mi6Var = iz4Var.a;
                        ri6 ri6Var = iz4Var.b;
                        mi6Var.getClass();
                        q05Var.g.h(mi6Var, ri6Var);
                        fdi fdiVar8 = q05Var.m;
                        while (true) {
                            Object value9 = fdiVar8.getValue();
                            mi6 mi6Var2 = mi6Var;
                            ri6 ri6Var2 = ri6Var;
                            if (fdiVar8.k(value9, j05.a((j05) value9, null, mi6Var, null, ri6Var, null, null, null, null, null, null, false, null, null, false, false, null, false, 268434815))) {
                                break;
                            }
                            mi6Var = mi6Var2;
                            ri6Var = ri6Var2;
                        }
                        Unit unit17 = Unit.a;
                    } else if (oz4Var instanceof jz4) {
                        vuf vufVar2 = ((jz4) oz4Var).a;
                        fdi fdiVar9 = q05Var.m;
                        while (true) {
                            Object value10 = fdiVar9.getValue();
                            vufVar = vufVar2;
                            if (fdiVar9.k(value10, j05.a((j05) value10, null, null, null, null, null, null, null, null, vufVar, null, false, null, null, false, false, null, false, 268402687))) {
                                break;
                            }
                            vufVar2 = vufVar;
                        }
                        b0a.Q(q05Var.i(), vufVar.getCode());
                        Unit unit18 = Unit.a;
                    } else if (oz4Var instanceof sy4) {
                        sy4 sy4Var = (sy4) oz4Var;
                        xw3.L(un0.z(q05Var), null, null, new t3(sy4Var.a, q05Var, sy4Var.b, rq3Var, 5), 3);
                        Unit unit19 = Unit.a;
                    } else if (oz4Var instanceof nz4) {
                        j1f j1fVar = ((nz4) oz4Var).a;
                        p1f p1fVar = q05Var.e;
                        p1fVar.getClass();
                        p1fVar.f = rlh.b;
                        xw3.L(p1fVar.e, null, null, new m1f(p1fVar, j1fVar, rq3Var, i), 3);
                        Unit unit20 = Unit.a;
                    } else if (oz4Var instanceof uy4) {
                        uy4 uy4Var = (uy4) oz4Var;
                        hkg.C(context, uy4Var.a, uy4Var.b);
                        Calendar calendar = ke0.a;
                        ke0.g(context, uy4Var.b.concat(" copied to clipboard"), 0);
                        Unit unit21 = Unit.a;
                    } else if (oz4Var instanceof vy4) {
                        vy4 vy4Var = (vy4) oz4Var;
                        boolean z7 = vy4Var.a;
                        boolean z8 = vy4Var.b;
                        boolean z9 = vy4Var.c;
                        ku3 h = q05Var.h();
                        hs4 hs4Var = z45.a;
                        xw3.L(h, hq4.c, null, new p05(q05Var, z9, z7, z8, null), 2);
                        Calendar calendar2 = ke0.a;
                        ke0.g(context, "Data reset. Please relaunch the app.", 1);
                        Unit unit22 = Unit.a;
                    } else if (oz4Var instanceof lz4) {
                        lz4 lz4Var = (lz4) oz4Var;
                        be5 be5Var = lz4Var.a;
                        int i8 = lz4Var.b;
                        int ordinal = be5Var.ordinal();
                        if (ordinal == 3) {
                            wd5 wd5Var = xd5.b;
                            be5 be5Var2 = be5.SECONDS;
                            k = xd5.k(wkn.R(i8, be5Var2), be5Var2);
                        } else if (ordinal != 4) {
                            wd5 wd5Var2 = xd5.b;
                            k = xd5.k(wkn.R(i8, be5.HOURS), be5.SECONDS);
                        } else {
                            wd5 wd5Var3 = xd5.b;
                            k = xd5.k(wkn.R(i8, be5.MINUTES), be5.SECONDS);
                        }
                        SharedPreferences.Editor edit4 = q05Var.h.edit();
                        edit4.getClass();
                        edit4.putLong("ads_on_stream_interval", k);
                        edit4.apply();
                        Unit unit23 = Unit.a;
                    } else {
                        if (!(oz4Var instanceof kz4)) {
                            zzl.b();
                            return null;
                        }
                        String str6 = ((kz4) oz4Var).a;
                        SharedPreferences.Editor edit5 = q05Var.h.edit();
                        edit5.getClass();
                        edit5.putString("DEV_MODE_SOFA_SEASON_ID", str6);
                        edit5.apply();
                        fdi fdiVar10 = q05Var.m;
                        while (true) {
                            Object value11 = fdiVar10.getValue();
                            String str7 = str6;
                            if (fdiVar10.k(value11, j05.a((j05) value11, null, null, null, null, null, null, null, null, null, null, false, null, null, false, false, str7, false, 234881023))) {
                                break;
                            }
                            str6 = str7;
                        }
                        Unit unit24 = Unit.a;
                    }
                }
            }
        }
        return Unit.a;
    }

    private final Object b(Object obj) {
        Function1 function1 = (Function1) this.d;
        Function1 function12 = (Function1) this.b;
        Activity activity = (Activity) this.c;
        r77 r77Var = (r77) this.e;
        j77 j77Var = (j77) obj;
        j77Var.getClass();
        if (j77Var.equals(g77.a)) {
            function1.invoke(smh.e);
        } else if (j77Var instanceof h77) {
            function12.invoke(((h77) j77Var).a);
            function1.invoke(rmh.e);
            if (activity != null) {
                activity.setResult(-1);
            }
        } else {
            if (!j77Var.equals(i77.a)) {
                zzl.b();
                return null;
            }
            if (activity != null) {
                Intent intent = new Intent();
                intent.putExtra("competitionId", r77Var.n.c.c);
                Unit unit = Unit.a;
                z8e.C(activity, 98, intent);
            }
        }
        return Unit.a;
    }

    private final Object c(Object obj) {
        ev6 ev6Var = (ev6) this.b;
        FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel = (FantasyRoundPlayerUiModel) this.c;
        mj7 mj7Var = (mj7) this.d;
        jz6 jz6Var = (jz6) this.e;
        ((o55) obj).getClass();
        int i = ev6Var.c;
        int i2 = fantasyRoundPlayerUiModel.g.a;
        int i3 = mj7Var.a;
        jz6Var.getClass();
        iz2 z = un0.z(jz6Var);
        hs4 hs4Var = z45.a;
        xw3.L(z, hq4.c, null, new iz6(i3, jz6Var, false, false, i2, i, null), 2);
        return new le(jz6Var, 11);
    }

    private final Object d(Object obj) {
        k7d k7dVar = (k7d) this.b;
        Context context = (Context) this.c;
        Function1 function1 = (Function1) this.d;
        ComponentActivity componentActivity = (ComponentActivity) this.e;
        h7d h7dVar = (h7d) obj;
        h7dVar.getClass();
        fuf fufVar = duf.a;
        List c = kotlin.collections.a.c(fufVar.getOrCreateKotlinClass(ab7.class));
        tc3 tc3Var = new tc3(1634888873, new c61(4, k7dVar, context, function1), true);
        lm5 lm5Var = lm5.a;
        lm5Var.getClass();
        km5 km5Var = km5.a;
        i4k h0 = s02.h0(300, 0, null, 6);
        int i = 1;
        h5a.F(h7dVar, fufVar.getOrCreateKotlinClass(xa7.class), lm5Var, km5Var, new w8d(c, h0, 0), new w8d(c, h0, i), new w8d(c, h0, 2), new w8d(c, h0, 3), tc3Var);
        Map d = sub.d(new Pair(fufVar.typeOf(fufVar.getOrCreateKotlinClass(FantasyRoundPlayerUiModel.class), Collections.EMPTY_LIST, true), new g94(FantasyRoundPlayerUiModel.Companion.serializer())));
        int i2 = 5;
        tc3 tc3Var2 = new tc3(-1227331625, new c61(i2, componentActivity, context, k7dVar), true);
        int i3 = 0;
        i4k h02 = s02.h0(350, 0, null, 6);
        h5a.F(h7dVar, fufVar.getOrCreateKotlinClass(ab7.class), d, km5Var, new w8d(km5Var, h02, 4), new w8d(km5Var, h02, i2), new w8d(km5Var, h02, 6), new w8d(km5Var, h02, 7), tc3Var2);
        tc3 tc3Var3 = new tc3(235700370, new cb7(i3, function1), true);
        i4k h03 = s02.h0(300, 0, null, 6);
        h5a.F(h7dVar, fufVar.getOrCreateKotlinClass(wa7.class), lm5Var, km5Var, new w8d(km5Var, h03, i3), new w8d(km5Var, h03, i), new w8d(km5Var, h03, 2), new w8d(km5Var, h03, 3), tc3Var3);
        return Unit.a;
    }

    private final Object e(Object obj) {
        Object value;
        Object value2;
        ob7 ob7Var = (ob7) this.b;
        Context context = (Context) this.c;
        wb7 wb7Var = (wb7) this.d;
        Function0 function0 = (Function0) this.e;
        hb7 hb7Var = (hb7) obj;
        hb7Var.getClass();
        rq3 rq3Var = null;
        if (hb7Var.equals(gb7.a)) {
            ob7Var.getClass();
            xw3.L(un0.z(ob7Var), null, null, new jk(ob7Var, rq3Var, 12), 3);
        } else if (hb7Var instanceof eb7) {
            FantasyCompetitionType fantasyCompetitionType = ((eb7) hb7Var).a;
            ob7Var.getClass();
            fdi fdiVar = ob7Var.f;
            fantasyCompetitionType.getClass();
            do {
                value = fdiVar.getValue();
            } while (!fdiVar.k(value, mb7.a((mb7) value, null, null, null, false, false, fantasyCompetitionType, 31)));
            do {
                value2 = fdiVar.getValue();
            } while (!fdiVar.k(value2, mb7.a((mb7) value2, null, null, null, false, true, null, 47)));
        } else {
            if (!(hb7Var instanceof fb7)) {
                zzl.b();
                return null;
            }
            mp6 mp6Var = ((fb7) hb7Var).a;
            boolean z = mp6Var.j;
            int i = mp6Var.a;
            if (z) {
                ob7Var.k(true);
            } else {
                context.getClass();
                FirebaseBundle firebaseBundle = new FirebaseBundle();
                firebaseBundle.putInt("id", i);
                ia0 ia0Var = ia0.q;
                FirebaseAnalytics d = me4.d((f5d) me4.e(), "fantasy_select_competition", firebaseBundle, context);
                d.a.e(n9e.K(firebaseBundle), null, "fantasy_select_competition", false);
                wb7Var.n(i);
                function0.invoke();
            }
        }
        return Unit.a;
    }

    private final Object f(Object obj) {
        Function0 function0 = (Function0) this.b;
        Function0 function02 = (Function0) this.c;
        pu6 pu6Var = (pu6) this.d;
        Function0 function03 = (Function0) this.e;
        dc7 dc7Var = (dc7) obj;
        dc7Var.getClass();
        if (dc7Var.equals(ac7.a)) {
            function0.invoke();
        } else if (dc7Var.equals(bc7.a)) {
            function02.invoke();
        } else {
            rq3 rq3Var = null;
            if (!(dc7Var instanceof cc7)) {
                zzl.b();
                return null;
            }
            xw3.L(un0.z(pu6Var), null, null, new hs6(pu6Var, ((cc7) dc7Var).a, rq3Var, 3), 3);
            function0.invoke();
            function03.invoke();
        }
        return Unit.a;
    }

    private final Object g(Object obj) {
        rse rseVar;
        boolean z;
        cz6 cz6Var = (cz6) this.b;
        rse rseVar2 = (rse) this.c;
        Context context = (Context) this.d;
        koh kohVar = (koh) this.e;
        esa esaVar = (esa) obj;
        esaVar.getClass();
        boolean z2 = true;
        char c = 1;
        esaVar.f("statistics_overview", "statistics_overview", new tc3(1878998280, new s16(cz6Var, 16), true));
        if (cz6Var.c != null) {
            esaVar.f("form_and_fixtures", "form_and_fixtures", new tc3(1112754271, new ce7(c == true ? 1 : 0, cz6Var, context), true));
        }
        esaVar.f("points_breakdown_header", "points_breakdown_header", new tc3(-1918859201, new ce7(context, cz6Var), true));
        for (qx6 qx6Var : cz6Var.b) {
            wn1 wn1Var = qx6Var.a;
            gv9 gv9Var = qx6Var.b;
            int i = qx6Var.c;
            ad7 ad7Var = qx6Var.d;
            int i2 = wn1Var.a;
            esaVar.f(ljg.j(i2, "event_"), "event_card", new tc3(-1656790906, new de7(i, 0, wn1Var, gv9Var, ad7Var, cz6Var), z2));
            if (gv9Var == null || gv9Var.isEmpty()) {
                rseVar = rseVar2;
                FantasyPlayerFixtureData fantasyPlayerFixtureData = (FantasyPlayerFixtureData) cz6Var.d.y.get(Integer.valueOf(i2));
                int i3 = (fantasyPlayerFixtureData != null ? fantasyPlayerFixtureData.b : null) == rd7.d ? R.string.empty_player_match_injury : (fantasyPlayerFixtureData != null ? fantasyPlayerFixtureData.b : null) == rd7.e ? R.string.empty_player_match_suspension : (fantasyPlayerFixtureData != null ? fantasyPlayerFixtureData.c : null) == ad7.c ? R.string.empty_player_match_bench : wn1Var.d() ? R.string.fantasy_player_stats_prematch_text : R.string.empty_player_match;
                z = true;
                esaVar.f(ljg.j(i2, "empty_state_"), "empty_state", new tc3(-1676507294, new h66(i3, 6), true));
            } else {
                esaVar.f(ljg.j(i2, "points_header_"), "points_header", l6g.b);
                boolean c2 = Intrinsics.c((Boolean) kohVar.get(Integer.valueOf(i2)), Boolean.TRUE);
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : gv9Var) {
                    ae7 ae7Var = (ae7) obj2;
                    if (ae7Var.c != 0 || Intrinsics.c(ae7Var.a, CampaignEx.JSON_KEY_STAR)) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : gv9Var) {
                    ae7 ae7Var2 = (ae7) obj3;
                    if (ae7Var2.c == 0 && !Intrinsics.c(ae7Var2.a, CampaignEx.JSON_KEY_STAR)) {
                        arrayList2.add(obj3);
                    }
                }
                rseVar = rseVar2;
                int i4 = 1;
                esaVar.a(arrayList.size(), new j87(4, new ee7(wn1Var, 0), arrayList), new j87(5, new e87(13), arrayList), new tc3(802480018, new ge7(arrayList, wn1Var, 0), true));
                if (c2) {
                    esaVar.f(ljg.j(i2, "statistics_with_no_points_label_"), "statistics_with_no_points_label", l6g.c);
                    esaVar.a(arrayList2.size(), new j87(6, new ee7(wn1Var, 1), arrayList2), new j87(7, new e87(14), arrayList2), new tc3(802480018, new ge7(arrayList2, wn1Var, i4), true));
                }
                esaVar.f(ljg.j(i2, "expand_button_"), "expand_button", new tc3(-2062459020, new l4b(c2, wn1Var, kohVar, 4), true));
                z = true;
            }
            z2 = z;
            rseVar2 = rseVar;
        }
        boolean z3 = z2;
        if (rseVar2 != null) {
            esaVar.f("total_points", "total_points", new tc3(-1215892893, new ce7(0, cz6Var, context), z3));
        }
        return Unit.a;
    }

    private final Object h(Object obj) {
        gf7 gf7Var = (gf7) this.b;
        Function1 function1 = (Function1) this.d;
        cdi cdiVar = (cdi) this.c;
        Context context = (Context) this.e;
        esa esaVar = (esa) obj;
        esaVar.getClass();
        esaVar.f("rules_info", "rules_info", new tc3(-2001987560, new y47(16, function1), true));
        esaVar.c("chips", "chips", new tc3(1803409444, new c61(7, gf7Var, function1, cdiVar), true));
        if (gf7Var.e != null) {
            esaVar.f("updated_at_label", "updated_at_label", new tc3(-594885005, new qm4(20, context, gf7Var), true));
        }
        gv9 gv9Var = gf7Var.d;
        esaVar.a(gv9Var.size(), new j87(10, new e87(17), gv9Var), new j87(11, new e87(18), gv9Var), new tc3(802480018, new l46(gv9Var, function1, gf7Var), true));
        return Unit.a;
    }

    private final Object i(Object obj) {
        gv9 gv9Var = (gv9) this.b;
        gv9 gv9Var2 = (gv9) this.c;
        ho7 ho7Var = (ho7) this.e;
        Function1 function1 = (Function1) this.d;
        esa esaVar = (esa) obj;
        esaVar.getClass();
        esaVar.a(gv9Var.size(), new j87(13, new e87(20), gv9Var), new j87(14, new e87(21), gv9Var), new tc3(802480018, new hs3(gv9Var, gv9Var2, ho7Var, function1, 4), true));
        return Unit.a;
    }

    private final Object j(Object obj) {
        ku3 ku3Var = (ku3) this.b;
        Activity activity = (Activity) this.c;
        imh imhVar = (imh) this.d;
        ml7 ml7Var = (ml7) this.e;
        fl7 fl7Var = (fl7) obj;
        fl7Var.getClass();
        rq3 rq3Var = null;
        if (fl7Var.equals(dl7.a)) {
            xw3.L(ku3Var, null, null, new d17(imhVar, rq3Var, 10), 3);
        } else {
            if (!(fl7Var instanceof el7)) {
                zzl.b();
                return null;
            }
            if (activity != null) {
                Intent intent = new Intent();
                intent.putParcelableArrayListExtra("squad", new ArrayList<>(((ll7) ml7Var.n.a.getValue()).c));
                intent.putExtra("tripleCaptain", (Serializable) null);
                Unit unit = Unit.a;
                z8e.C(activity, -1, intent);
            }
        }
        return Unit.a;
    }

    private final Object k(Object obj) {
        Context context = (Context) this.b;
        crb crbVar = (crb) this.c;
        Function0 function0 = (Function0) this.d;
        e1d e1dVar = (e1d) this.e;
        hq7 hq7Var = (hq7) obj;
        hq7Var.getClass();
        if (hq7Var.equals(eq7.a)) {
            int i = FantasyOnboardingActivity.M;
            uic.x(context, null, 6);
        } else if (hq7Var.equals(fq7.a)) {
            context.getClass();
            FirebaseBundle firebaseBundle = new FirebaseBundle();
            ia0 ia0Var = ia0.q;
            FirebaseAnalytics d = me4.d((f5d) me4.e(), "fantasy_login", firebaseBundle, context);
            d.a.e(n9e.K(firebaseBundle), null, "fantasy_login", false);
            int i2 = LoginScreenActivity.M;
            crbVar.a(wxf.v(context, null, 6), null);
        } else if (hq7Var.equals(dq7.a)) {
            e1dVar.setValue(Boolean.TRUE);
        } else {
            if (!hq7Var.equals(gq7.a)) {
                zzl.b();
                return null;
            }
            function0.invoke();
        }
        return Unit.a;
    }

    private final Object l(Object obj) {
        Function0 function0 = (Function0) this.b;
        boh bohVar = (boh) this.c;
        e1d e1dVar = (e1d) this.d;
        Context context = (Context) this.e;
        a7b a7bVar = (a7b) obj;
        a7bVar.getClass();
        bohVar.i(yaa.v());
        if (((dy7) e1dVar.getValue()).c) {
            function0.invoke();
        }
        return new e06(a7bVar, context, bohVar, e1dVar, 1);
    }

    private final Object m(Object obj) {
        CancellationSignal cancellationSignal = (CancellationSignal) this.b;
        cx8 cx8Var = (cx8) this.c;
        Context context = cx8Var.f;
        Executor executor = (Executor) this.d;
        oy3 oy3Var = (oy3) this.e;
        PendingGetCredentialHandle pendingGetCredentialHandle = (PendingGetCredentialHandle) obj;
        CredentialProviderPlayServicesImpl.Companion.getClass();
        if (fz3.a(cancellationSignal)) {
            return Unit.a;
        }
        Intent intent = new Intent(context, (Class<?>) HiddenActivity.class);
        uy3.a(cx8Var.j, intent, "BEGIN_SIGN_IN");
        intent.putExtra("EXTRA_FLOW_PENDING_INTENT", pendingGetCredentialHandle.a);
        try {
            context.startActivity(intent);
        } catch (Exception unused) {
            CredentialProviderPlayServicesImpl.Companion.getClass();
            if (!fz3.a(cancellationSignal)) {
                executor.execute(new az3(oy3Var, 7));
                Unit unit = Unit.a;
            }
        }
        return Unit.a;
    }

    private final Object n(Object obj) {
        e1d e1dVar = (e1d) this.b;
        h2a h2aVar = (h2a) this.c;
        csf csfVar = (csf) this.d;
        ku3 ku3Var = (ku3) this.e;
        long longValue = ((Long) obj).longValue();
        cdi cdiVar = (cdi) e1dVar.getValue();
        long longValue2 = cdiVar != null ? ((Number) cdiVar.getValue()).longValue() : longValue;
        long j = h2aVar.c;
        i1d i1dVar = h2aVar.a;
        if (j == Long.MIN_VALUE || csfVar.a != d2a.w(ku3Var.getCoroutineContext())) {
            h2aVar.c = longValue;
            Object[] objArr = i1dVar.a;
            int i = i1dVar.c;
            for (int i2 = 0; i2 < i; i2++) {
                ((f2a) objArr[i2]).g = true;
            }
            csfVar.a = d2a.w(ku3Var.getCoroutineContext());
        }
        float f = csfVar.a;
        if (f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            Object[] objArr2 = i1dVar.a;
            int i3 = i1dVar.c;
            for (int i4 = 0; i4 < i3; i4++) {
                f2a f2aVar = (f2a) objArr2[i4];
                ((eoh) f2aVar.d).setValue(f2aVar.e.c);
                f2aVar.g = true;
            }
        } else {
            long j2 = (long) ((longValue2 - h2aVar.c) / f);
            Object[] objArr3 = i1dVar.a;
            int i5 = i1dVar.c;
            boolean z = true;
            for (int i6 = 0; i6 < i5; i6++) {
                f2a f2aVar2 = (f2a) objArr3[i6];
                boolean z2 = f2aVar2.f;
                if (!z2) {
                    ((eoh) f2aVar2.i.b).setValue(Boolean.FALSE);
                    if (f2aVar2.g) {
                        f2aVar2.g = false;
                        f2aVar2.h = j2;
                    }
                    long j3 = j2 - f2aVar2.h;
                    ((eoh) f2aVar2.d).setValue(f2aVar2.e.g(j3));
                    z2 = f2aVar2.e.d(j3);
                    f2aVar2.f = z2;
                }
                if (!z2) {
                    z = false;
                }
            }
            ((eoh) h2aVar.d).setValue(Boolean.valueOf(!z));
        }
        return Unit.a;
    }

    private final Object o(Object obj) {
        List list = (List) this.b;
        dsf dsfVar = (dsf) this.c;
        List list2 = (List) this.d;
        fpa fpaVar = (fpa) this.e;
        q5f q5fVar = (q5f) obj;
        vji vjiVar = q5fVar.e;
        int b = vjiVar != null ? vjiVar.b() : 0;
        int i = 0;
        for (int i2 = 0; i2 < b; i2++) {
            ewd ewdVar = fpaVar.q;
            ewd ewdVar2 = ewd.a;
            vji vjiVar2 = q5fVar.e;
            i += (int) (ewdVar == ewdVar2 ? 4294967295L & (vjiVar2 != null ? vjiVar2.a(i2) : 0L) : (vjiVar2 != null ? vjiVar2.a(i2) : 0L) >> 32);
        }
        if (list != null) {
            list.add(Integer.valueOf(i));
        }
        if (dsfVar.a != list2.size()) {
            dsfVar.a++;
        }
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:220:0x06d8, code lost:
    
        if (r1 == null) goto L211;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x0a89, code lost:
    
        if (r0 == null) goto L325;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0985  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x09c5  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x097a  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x0b08  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0b1d  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0b46  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0b56  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x0b6b  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0b94  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0ba4  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0bb9  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0bb4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0b66 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:403:0x0b18 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v0, types: [rq3] */
    /* JADX WARN: Type inference failed for: r10v8 */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        Unit generateAd$lambda$4;
        ContributionSummaryResponse contributionSummaryResponse;
        int i;
        int i2;
        int i3;
        int i4;
        gv9 gv9Var;
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        List<ContributionCount> counts;
        Iterator<T> it;
        Object obj2;
        ContributionCount contributionCount;
        List<ContributionCount> counts2;
        Iterator<T> it2;
        Object obj3;
        ContributionCount contributionCount2;
        List<ContributionCount> counts3;
        Iterator<T> it3;
        Object obj4;
        ContributionCount contributionCount3;
        List<ContributionCount> counts4;
        Object obj5;
        int i5;
        String description;
        String i6;
        List<ContributionType> types;
        Iterator it4;
        Pair pair;
        Pair pair2;
        int i7;
        Integer num5;
        Pair pair3;
        Pair pair4;
        Double credibilityScore;
        CrowdsourcingAggregates userCrowdsourcingAggregates;
        Iterable iterable;
        SharedPreferences d;
        Parcelable seasonCompetitions;
        mj7 mj7Var;
        String str;
        FantasyLeagueType fantasyLeagueType;
        int i8 = 10;
        int i9 = 25;
        int i10 = 13;
        int i11 = 14;
        int i12 = 0;
        TeamSides teamSides = 0;
        Pattern pattern = null;
        int i13 = 3;
        int i14 = 1;
        switch (this.a) {
            case 0:
                q50 q50Var = (q50) this.b;
                d80 d80Var = (d80) this.c;
                Function1 function1 = (Function1) this.d;
                asf asfVar = (asf) this.e;
                b80 b80Var = (b80) obj;
                d2a.G(b80Var, q50Var.c);
                eoh eohVar = (eoh) b80Var.e;
                Object b = q50Var.b(eohVar.getValue());
                if (!Intrinsics.c(b, eohVar.getValue())) {
                    ((eoh) q50Var.c.b).setValue(b);
                    ((eoh) d80Var.b).setValue(b);
                    if (function1 != null) {
                        function1.invoke(q50Var);
                    }
                    b80Var.a();
                    asfVar.a = true;
                } else if (function1 != null) {
                    function1.invoke(q50Var);
                }
                return Unit.a;
            case 1:
                generateAd$lambda$4 = BlazeCustomNativeAdsProvider.generateAd$lambda$4((fsf) this.b, (BlazeAdRequestData) this.c, (qa3) this.d, (BlazeCustomNativeAdsProvider) this.e, (NativeCustomFormatAd) obj);
                return generateAd$lambda$4;
            case 2:
                p63 p63Var = (p63) this.b;
                pyg pygVar = (pyg) this.c;
                e93 e93Var = (e93) this.d;
                Function0 function0 = (Function0) this.e;
                t83 t83Var = (t83) obj;
                t83Var.getClass();
                IRecent iRecent = (IRecent) p63Var.h.get(Integer.valueOf(t83Var.getId()));
                if (iRecent != null) {
                    xw3.L(un0.z(p63Var), null, null, new hy1(p63Var, iRecent, null, i11), 3);
                }
                pygVar.z(new fxg(e93Var, t83Var.getId()));
                function0.invoke();
                return Unit.a;
            case 3:
                osa osaVar = (osa) this.b;
                String str2 = (String) this.c;
                Function1 function12 = (Function1) this.d;
                Function1 function13 = (Function1) this.e;
                esa esaVar = (esa) obj;
                esaVar.getClass();
                esaVar.a(osaVar.c(), new x83(osaVar, 0), new uf8(i11, new q73(5), osaVar), new tc3(252477245, new nlj(osaVar, str2, function12, function13, 1), true));
                return Unit.a;
            case 4:
                vnb vnbVar = (vnb) this.b;
                e1d e1dVar = (e1d) this.c;
                Function1 function14 = (Function1) this.d;
                Function1 function15 = (Function1) this.e;
                esa esaVar2 = (esa) obj;
                esaVar2.getClass();
                esa.d(esaVar2, null, null, new tc3(-1236794183, new gs3(vnbVar, 0), true), 3);
                esa.d(esaVar2, null, null, new tc3(1557778736, new gs3(vnbVar, 1), true), 3);
                esa.d(esaVar2, null, null, rd0.c, 3);
                List L0 = CollectionsKt.L0(((is3) ((unb) vnbVar).a).c, ((Boolean) e1dVar.getValue()).booleanValue() ? 100 : 10);
                int i15 = 9;
                esaVar2.a(L0.size(), new zi(i15, new q73(i15), L0), new xo(L0, 1), new tc3(802480018, new hs3(L0, function14, function15, vnbVar, 0), true));
                jp5 entries = ContributionStatus.getEntries();
                ArrayList arrayList = new ArrayList();
                for (Object obj6 : entries) {
                    if (((ContributionStatus) obj6) != ContributionStatus.IGNORED) {
                        arrayList.add(obj6);
                    }
                }
                List H0 = CollectionsKt.H0(arrayList, new y73(i15));
                int i16 = 1;
                esaVar2.a(H0.size(), null, new xo(H0, 2), new tc3(802480018, new yo(H0, i16), true));
                if (((Boolean) e1dVar.getValue()).booleanValue()) {
                    esa.d(esaVar2, null, null, rd0.d, 3);
                } else {
                    esa.d(esaVar2, null, null, new tc3(1791456852, new zx0(i16, e1dVar), true), 3);
                }
                return Unit.a;
            case 5:
                ProfileData profileData = (ProfileData) this.b;
                List<Contributions> list = (List) this.c;
                ks3 ks3Var = (ks3) this.d;
                ContributionSummaryResponse contributionSummaryResponse2 = (ContributionSummaryResponse) this.e;
                Integer currentRanking = (profileData == null || (userCrowdsourcingAggregates = profileData.getUserCrowdsourcingAggregates()) == null) ? null : userCrowdsourcingAggregates.getCurrentRanking();
                Integer valueOf = (profileData == null || (credibilityScore = profileData.getCredibilityScore()) == null) ? null : Integer.valueOf((int) credibilityScore.doubleValue());
                if (list != null) {
                    Context i17 = ks3Var.i();
                    i = R.drawable.ic_contribution_assistant;
                    i2 = R.drawable.ic_contribution_scorer;
                    ArrayList arrayList2 = new ArrayList(k13.r(list, 10));
                    for (Contributions contributions : list) {
                        int id = contributions.getEvent().getId();
                        if (Intrinsics.c(contributions.getEvent().getStatus().getType(), StatusKt.STATUS_IN_PROGRESS) && contributions.getEvent().getCrowdsourcingDataDisplayEnabled()) {
                            ShortEvent event = contributions.getEvent();
                            i5 = R.drawable.ic_contribution_match_start;
                            long startTimestamp = event.getStartTimestamp();
                            String bestPattern = hk4.b().getBestPattern(DateFormat.is24HourFormat(i17) ? "Hm" : "hm");
                            bestPattern.getClass();
                            description = fc6.i(startTimestamp, hk4.a(bestPattern));
                        } else {
                            i5 = R.drawable.ic_contribution_match_start;
                            description = contributions.getEvent().getStatus().getDescription(contributions.getEvent().getHomeTeam().getSport().getSlug());
                        }
                        String str3 = description;
                        if (Intrinsics.c(contributions.getEvent().getStatus().getType(), StatusKt.STATUS_IN_PROGRESS) && contributions.getEvent().getCrowdsourcingDataDisplayEnabled()) {
                            i6 = contributions.getEvent().getStatus().getDescription(contributions.getEvent().getHomeTeam().getSport().getSlug());
                        } else {
                            long startTimestamp2 = contributions.getEvent().getStartTimestamp();
                            bi4 bi4Var = bi4.PATTERN_DMY_SHORT;
                            ConcurrentHashMap concurrentHashMap = hk4.a;
                            i6 = fc6.i(startTimestamp2, hk4.a(bi4Var.d()));
                        }
                        String str4 = i6;
                        ms3 L = zm2.L(ShortEvent.getHomeTeam$default(contributions.getEvent(), teamSides, i14, teamSides), i17, ShortEvent.getHomeScore$default(contributions.getEvent(), teamSides, i14, teamSides));
                        ms3 L2 = zm2.L(ShortEvent.getAwayTeam$default(contributions.getEvent(), teamSides, i14, teamSides), i17, ShortEvent.getAwayScore$default(contributions.getEvent(), teamSides, i14, teamSides));
                        boolean z = (contributions.getEvent().getCrowdsourcingDataDisplayEnabled() && Intrinsics.c(contributions.getEvent().getStatus().getType(), StatusKt.STATUS_IN_PROGRESS)) ? i14 : 0;
                        long startTimestamp3 = contributions.getEvent().getStartTimestamp();
                        String slug = contributions.getEvent().getHomeTeam().getSport().getSlug();
                        List<Contribution> contributions2 = contributions.getContributions();
                        Integer valueOf2 = Integer.valueOf(R.string.assistant);
                        Integer valueOf3 = Integer.valueOf(R.drawable.ic_contribution_assistant);
                        ArrayList arrayList3 = new ArrayList(k13.r(contributions2, i8));
                        Iterator it5 = contributions2.iterator();
                        while (it5.hasNext()) {
                            Contribution contribution = (Contribution) it5.next();
                            List<ContributionType> types2 = contribution.getTypes();
                            ContributionSummaryResponse contributionSummaryResponse3 = contributionSummaryResponse2;
                            ArrayList arrayList4 = new ArrayList(k13.r(types2, i8));
                            Iterator it6 = types2.iterator();
                            while (it6.hasNext()) {
                                ContributionType contributionType = (ContributionType) it6.next();
                                int i18 = contributionType == null ? -1 : ls3.a[contributionType.ordinal()];
                                if (i18 == 1 || i18 == 2) {
                                    it4 = it6;
                                    pair = new Pair(Integer.valueOf(i5), Integer.valueOf(R.string.match_start));
                                } else if (i18 != 3) {
                                    if (i18 != 4) {
                                        pair2 = i18 != 5 ? new Pair(valueOf3, valueOf2) : new Pair(valueOf3, valueOf2);
                                        it4 = it6;
                                    } else {
                                        it4 = it6;
                                        pair2 = new Pair(Integer.valueOf(R.drawable.ic_contribution_scorer), Integer.valueOf(R.string.scorer));
                                    }
                                    int intValue = ((Number) pair2.a).intValue();
                                    int intValue2 = ((Number) pair2.b).intValue();
                                    ContributionStatus status = contribution.getStatus();
                                    i7 = status != null ? ls3.b[status.ordinal()] : -1;
                                    Iterator it7 = it5;
                                    if (i7 != 1) {
                                        num5 = valueOf2;
                                        pair3 = new Pair(Integer.valueOf(R.color.success), Integer.valueOf(R.string.suggestion_approved));
                                    } else if (i7 != 2) {
                                        if (i7 == 3 || i7 == 4) {
                                            num5 = valueOf2;
                                            pair4 = new Pair(Integer.valueOf(R.color.n_lv_3), Integer.valueOf(R.string.suggestion_unresolved));
                                        } else {
                                            pair4 = new Pair(null, null);
                                            num5 = valueOf2;
                                        }
                                        arrayList4.add(new yr3((Integer) pair4.a, intValue2, intValue, (Integer) pair4.b));
                                        it5 = it7;
                                        valueOf2 = num5;
                                        it6 = it4;
                                    } else {
                                        num5 = valueOf2;
                                        pair3 = new Pair(Integer.valueOf(R.color.error), Integer.valueOf(R.string.suggestion_declined));
                                    }
                                    pair4 = pair3;
                                    arrayList4.add(new yr3((Integer) pair4.a, intValue2, intValue, (Integer) pair4.b));
                                    it5 = it7;
                                    valueOf2 = num5;
                                    it6 = it4;
                                } else {
                                    it4 = it6;
                                    pair = new Pair(Integer.valueOf(R.drawable.ic_contribution_score), Integer.valueOf(R.string.score));
                                }
                                pair2 = pair;
                                int intValue3 = ((Number) pair2.a).intValue();
                                int intValue22 = ((Number) pair2.b).intValue();
                                ContributionStatus status2 = contribution.getStatus();
                                i7 = status2 != null ? ls3.b[status2.ordinal()] : -1;
                                Iterator it72 = it5;
                                if (i7 != 1) {
                                }
                                pair4 = pair3;
                                arrayList4.add(new yr3((Integer) pair4.a, intValue22, intValue3, (Integer) pair4.b));
                                it5 = it72;
                                valueOf2 = num5;
                                it6 = it4;
                            }
                            arrayList3.add(arrayList4);
                            contributionSummaryResponse2 = contributionSummaryResponse3;
                            i8 = 10;
                        }
                        ContributionSummaryResponse contributionSummaryResponse4 = contributionSummaryResponse2;
                        gv9 W = l6g.W(k13.s(arrayList3));
                        Contribution contribution2 = (Contribution) CollectionsKt.firstOrNull(contributions.getContributions());
                        ContributionType contributionType2 = (contribution2 == null || (types = contribution2.getTypes()) == null) ? null : (ContributionType) CollectionsKt.firstOrNull(types);
                        Contribution contribution3 = (Contribution) CollectionsKt.firstOrNull(contributions.getContributions());
                        ContributionStatus status3 = contribution3 != null ? contribution3.getStatus() : null;
                        Iterator<T> it8 = contributions.getContributions().iterator();
                        int i19 = 0;
                        while (it8.hasNext()) {
                            i19 = ((Contribution) it8.next()).getTypes().size() + i19;
                        }
                        arrayList2.add(new kfk(id, str3, str4, L, L2, z, startTimestamp3, slug, W, contributionType2, status3, i19, contributions.getEvent().getWinnerCode()));
                        contributionSummaryResponse2 = contributionSummaryResponse4;
                        i8 = 10;
                        teamSides = 0;
                        i14 = 1;
                    }
                    contributionSummaryResponse = contributionSummaryResponse2;
                    i3 = R.drawable.ic_contribution_score;
                    i4 = R.drawable.ic_contribution_match_start;
                    gv9Var = l6g.W(arrayList2);
                    break;
                } else {
                    contributionSummaryResponse = contributionSummaryResponse2;
                    i = R.drawable.ic_contribution_assistant;
                    i2 = R.drawable.ic_contribution_scorer;
                    i3 = R.drawable.ic_contribution_score;
                    i4 = R.drawable.ic_contribution_match_start;
                }
                gv9Var = rlh.b;
                gv9 gv9Var2 = gv9Var;
                q9k q9kVar = new q9k(R.string.start_times);
                if (contributionSummaryResponse != null && (counts4 = contributionSummaryResponse.getCounts()) != null) {
                    Iterator<T> it9 = counts4.iterator();
                    while (true) {
                        if (it9.hasNext()) {
                            obj5 = it9.next();
                            if (((ContributionCount) obj5).getEventSuggestType() == ContributionType.EVENT_START_DATE) {
                            }
                        } else {
                            obj5 = null;
                        }
                    }
                    ContributionCount contributionCount4 = (ContributionCount) obj5;
                    if (contributionCount4 != null) {
                        num = Integer.valueOf(contributionCount4.getCount());
                        fs3 fs3Var = new fs3(i4, q9kVar, yid.e(3, null, Integer.valueOf(yid.m(num))));
                        q9k q9kVar2 = new q9k(R.string.number_of_scores);
                        if (contributionSummaryResponse != null && (counts3 = contributionSummaryResponse.getCounts()) != null) {
                            it3 = counts3.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    obj4 = null;
                                } else {
                                    obj4 = it3.next();
                                    if (((ContributionCount) obj4).getEventSuggestType() == ContributionType.EVENT_SCORE) {
                                    }
                                }
                            }
                            contributionCount3 = (ContributionCount) obj4;
                            if (contributionCount3 != null) {
                                num2 = Integer.valueOf(contributionCount3.getCount());
                                fs3 fs3Var2 = new fs3(i3, q9kVar2, yid.e(3, null, Integer.valueOf(yid.m(num2))));
                                q9k q9kVar3 = new q9k(R.string.number_of_scorers);
                                if (contributionSummaryResponse != null && (counts2 = contributionSummaryResponse.getCounts()) != null) {
                                    it2 = counts2.iterator();
                                    while (true) {
                                        if (it2.hasNext()) {
                                            obj3 = null;
                                        } else {
                                            obj3 = it2.next();
                                            if (((ContributionCount) obj3).getEventSuggestType() == ContributionType.GOAL_SCORER) {
                                            }
                                        }
                                    }
                                    contributionCount2 = (ContributionCount) obj3;
                                    if (contributionCount2 != null) {
                                        num3 = Integer.valueOf(contributionCount2.getCount());
                                        fs3 fs3Var3 = new fs3(i2, q9kVar3, yid.e(3, null, Integer.valueOf(yid.m(num3))));
                                        q9k q9kVar4 = new q9k(R.string.number_of_score_assistants);
                                        if (contributionSummaryResponse != null && (counts = contributionSummaryResponse.getCounts()) != null) {
                                            it = counts.iterator();
                                            while (true) {
                                                if (it.hasNext()) {
                                                    obj2 = null;
                                                } else {
                                                    obj2 = it.next();
                                                    if (((ContributionCount) obj2).getEventSuggestType() == ContributionType.GOAL_ASSISTANT) {
                                                    }
                                                }
                                            }
                                            contributionCount = (ContributionCount) obj2;
                                            if (contributionCount != null) {
                                                num4 = Integer.valueOf(contributionCount.getCount());
                                                return new is3(currentRanking, valueOf, gv9Var2, l6g.K(fs3Var, fs3Var2, fs3Var3, new fs3(i, q9kVar4, yid.e(3, null, Integer.valueOf(yid.m(num4))))), 16);
                                            }
                                        }
                                        num4 = null;
                                        return new is3(currentRanking, valueOf, gv9Var2, l6g.K(fs3Var, fs3Var2, fs3Var3, new fs3(i, q9kVar4, yid.e(3, null, Integer.valueOf(yid.m(num4))))), 16);
                                    }
                                }
                                num3 = null;
                                fs3 fs3Var32 = new fs3(i2, q9kVar3, yid.e(3, null, Integer.valueOf(yid.m(num3))));
                                q9k q9kVar42 = new q9k(R.string.number_of_score_assistants);
                                if (contributionSummaryResponse != null) {
                                    it = counts.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                        }
                                    }
                                    contributionCount = (ContributionCount) obj2;
                                    if (contributionCount != null) {
                                    }
                                }
                                num4 = null;
                                return new is3(currentRanking, valueOf, gv9Var2, l6g.K(fs3Var, fs3Var2, fs3Var32, new fs3(i, q9kVar42, yid.e(3, null, Integer.valueOf(yid.m(num4))))), 16);
                            }
                        }
                        num2 = null;
                        fs3 fs3Var22 = new fs3(i3, q9kVar2, yid.e(3, null, Integer.valueOf(yid.m(num2))));
                        q9k q9kVar32 = new q9k(R.string.number_of_scorers);
                        if (contributionSummaryResponse != null) {
                            it2 = counts2.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                }
                            }
                            contributionCount2 = (ContributionCount) obj3;
                            if (contributionCount2 != null) {
                            }
                        }
                        num3 = null;
                        fs3 fs3Var322 = new fs3(i2, q9kVar32, yid.e(3, null, Integer.valueOf(yid.m(num3))));
                        q9k q9kVar422 = new q9k(R.string.number_of_score_assistants);
                        if (contributionSummaryResponse != null) {
                        }
                        num4 = null;
                        return new is3(currentRanking, valueOf, gv9Var2, l6g.K(fs3Var, fs3Var22, fs3Var322, new fs3(i, q9kVar422, yid.e(3, null, Integer.valueOf(yid.m(num4))))), 16);
                    }
                }
                num = null;
                fs3 fs3Var4 = new fs3(i4, q9kVar, yid.e(3, null, Integer.valueOf(yid.m(num))));
                q9k q9kVar22 = new q9k(R.string.number_of_scores);
                if (contributionSummaryResponse != null) {
                    it3 = counts3.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                        }
                    }
                    contributionCount3 = (ContributionCount) obj4;
                    if (contributionCount3 != null) {
                    }
                }
                num2 = null;
                fs3 fs3Var222 = new fs3(i3, q9kVar22, yid.e(3, null, Integer.valueOf(yid.m(num2))));
                q9k q9kVar322 = new q9k(R.string.number_of_scorers);
                if (contributionSummaryResponse != null) {
                }
                num3 = null;
                fs3 fs3Var3222 = new fs3(i2, q9kVar322, yid.e(3, null, Integer.valueOf(yid.m(num3))));
                q9k q9kVar4222 = new q9k(R.string.number_of_score_assistants);
                if (contributionSummaryResponse != null) {
                }
                num4 = null;
                return new is3(currentRanking, valueOf, gv9Var2, l6g.K(fs3Var4, fs3Var222, fs3Var3222, new fs3(i, q9kVar4222, yid.e(3, null, Integer.valueOf(yid.m(num4))))), 16);
            case 6:
                q5b q5bVar = (q5b) this.b;
                gdj gdjVar = (gdj) this.c;
                wcj wcjVar = (wcj) this.d;
                qu9 qu9Var = (qu9) this.e;
                if (q5bVar.b()) {
                    fp4 fp4Var = q5bVar.d;
                    gt3 gt3Var = q5bVar.v;
                    gt3 gt3Var2 = q5bVar.w;
                    fsf fsfVar = new fsf();
                    vsc vscVar = new vsc(i9, fp4Var, gt3Var, fsfVar);
                    sje sjeVar = gdjVar.a;
                    sjeVar.c(wcjVar, qu9Var, vscVar, gt3Var2);
                    jdj jdjVar = new jdj(gdjVar, sjeVar);
                    gdjVar.b.set(jdjVar);
                    fsfVar.a = jdjVar;
                    q5bVar.e = jdjVar;
                }
                return new o20(1);
            case 7:
                gv9 gv9Var3 = (gv9) this.b;
                Context context = (Context) this.c;
                e1d e1dVar2 = (e1d) this.d;
                e1d e1dVar3 = (e1d) this.e;
                String str5 = (String) obj;
                str5.getClass();
                e1dVar2.setValue(str5);
                if (str5.length() > 0) {
                    gv9Var3.getClass();
                    context.getClass();
                    char[] charArray = StringsKt.l0(str5).toString().toCharArray();
                    charArray.getClass();
                    String J = ph0.J(charArray, ".*", null, 56);
                    mqi mqiVar = qhi.a;
                    String d2 = qhi.d(J);
                    Locale locale = Locale.getDefault();
                    locale.getClass();
                    String lowerCase = d2.toLowerCase(locale);
                    lowerCase.getClass();
                    try {
                        pattern = Pattern.compile(lowerCase);
                    } catch (PatternSyntaxException unused) {
                    }
                    if (pattern != null) {
                        ArrayList arrayList5 = new ArrayList();
                        for (Object obj7 : gv9Var3) {
                            uv3 uv3Var = (uv3) obj7;
                            String c = tv3.c(context, uv3Var.a);
                            mqi mqiVar2 = qhi.a;
                            String d3 = qhi.d(c);
                            Locale locale2 = Locale.getDefault();
                            locale2.getClass();
                            String lowerCase2 = d3.toLowerCase(locale2);
                            lowerCase2.getClass();
                            String d4 = qhi.d(uv3Var.a);
                            Locale locale3 = Locale.getDefault();
                            locale3.getClass();
                            String lowerCase3 = d4.toLowerCase(locale3);
                            lowerCase3.getClass();
                            if (pattern.matcher(lowerCase2).find() || pattern.matcher(lowerCase3).find()) {
                                arrayList5.add(obj7);
                            }
                        }
                        Comparator thenComparing = new z(8).thenComparing(new rs2(new vn6(27, Collator.getInstance(Locale.getDefault()), context), 2));
                        thenComparing.getClass();
                        iterable = CollectionsKt.H0(arrayList5, thenComparing);
                        break;
                    }
                    iterable = km5.a;
                    gv9Var3 = l6g.W(iterable);
                }
                e1dVar3.setValue(gv9Var3);
                return Unit.a;
            case 8:
                m44 m44Var = (m44) this.b;
                ce8 ce8Var = (ce8) this.c;
                Function2 function2 = (Function2) this.e;
                Function1 function16 = (Function1) this.d;
                esa esaVar3 = (esa) obj;
                esaVar3.getClass();
                esa.d(esaVar3, null, null, dy0.h, 3);
                gv9 W2 = l6g.W(m44Var.d);
                esaVar3.a(W2.size(), new zi(15, new q73(17), W2), new uk1(6, W2), new tc3(802480018, new hs3(W2, ce8Var, function2, m44Var, 2), true));
                esa.d(esaVar3, null, null, new tc3(426458650, new d67(11, (Object) m44Var, (Object) ce8Var, function16), true), 3);
                return Unit.a;
            case 9:
                Set set = (Set) this.b;
                Object obj8 = this.c;
                Set set2 = (Set) this.d;
                e1d e1dVar4 = (e1d) this.e;
                set.add(obj8);
                return new sm4(set, obj8, set2, e1dVar4);
            case 10:
                return a(obj);
            case 11:
                u6b u6bVar = (u6b) this.b;
                Context context2 = (Context) this.c;
                boh bohVar = (boh) this.d;
                e1d e1dVar5 = (e1d) this.e;
                ((o55) obj).getClass();
                us5 us5Var = new us5(i12, context2, bohVar, e1dVar5);
                u6bVar.getLifecycle().a(us5Var);
                return new vx0(i13, u6bVar, us5Var);
            case 12:
                nr6 nr6Var = (nr6) this.b;
                Context context3 = (Context) this.c;
                hp6 hp6Var = (hp6) this.d;
                crb crbVar = (crb) this.e;
                uq6 uq6Var = (uq6) obj;
                uq6Var.getClass();
                int i20 = 22;
                if (uq6Var.equals(gq6.a)) {
                    ho7 ho7Var = nr6Var.k().c;
                    if (ho7Var != null) {
                        xw3.L(un0.z(hp6Var), null, null, new ce4(hp6Var, Integer.valueOf(ho7Var.a.a), (rq3) teamSides, i20), 3);
                    }
                } else if (uq6Var.equals(iq6.a)) {
                    ho7 ho7Var2 = nr6Var.k().c;
                    if (ho7Var2 != null && (str = (mj7Var = ho7Var2.a).k) != null) {
                        int i21 = FantasyUserSquadActivity.N;
                        p4h.y(context3, mj7Var.j, nr6Var.k().a.c.d, str, null);
                    }
                } else if (uq6Var.equals(kq6.a)) {
                    mj7 mj7Var2 = nr6Var.k().d;
                    if (mj7Var2 != null) {
                        xw3.L(un0.z(hp6Var), null, null, new ce4(hp6Var, Integer.valueOf(mj7Var2.a), (rq3) teamSides, i20), 3);
                    }
                } else if (uq6Var.equals(rq6.a)) {
                    FragmentActivity O = hkg.O(context3);
                    if (O != null) {
                        ev6 ev6Var = nr6Var.h.c;
                        int i22 = ev6Var.c;
                        boolean z2 = ev6Var.A;
                        FantasyPlayersOfTheRoundBottomSheet fantasyPlayersOfTheRoundBottomSheet = new FantasyPlayersOfTheRoundBottomSheet();
                        Bundle bundle = new Bundle();
                        bundle.putSerializable("competitionId", Integer.valueOf(i22));
                        bundle.putBoolean("assetsRestricted", z2);
                        fantasyPlayersOfTheRoundBottomSheet.setArguments(bundle);
                        AppCompatActivity appCompatActivity = O instanceof AppCompatActivity ? (AppCompatActivity) O : null;
                        if (appCompatActivity != null) {
                            wca.x(appCompatActivity.getLifecycle()).b(new r1(fantasyPlayersOfTheRoundBottomSheet, appCompatActivity, teamSides, i13));
                        }
                    }
                } else if (uq6Var.equals(jq6.a)) {
                    FragmentActivity O2 = hkg.O(context3);
                    if (O2 != null) {
                        int i23 = fr6.a[nr6Var.h.c.d.ordinal()];
                        if (i23 == 1) {
                            seasonCompetitions = new FantasySectionedInfoType.SeasonCompetitions(Integer.valueOf(nr6Var.h.c.c));
                        } else {
                            if (i23 != 2) {
                                zzl.b();
                                return null;
                            }
                            seasonCompetitions = new FantasySectionedInfoType.WeeklyCompetitions(Integer.valueOf(nr6Var.h.c.c));
                        }
                        FantasySectionedBottomSheetFragment fantasySectionedBottomSheetFragment = new FantasySectionedBottomSheetFragment();
                        fantasySectionedBottomSheetFragment.setArguments(fz8.C(fz8.F("FANTASY_SECTIONED_INFO_TYPE", seasonCompetitions)));
                        AppCompatActivity appCompatActivity2 = O2 instanceof AppCompatActivity ? (AppCompatActivity) O2 : null;
                        if (appCompatActivity2 != null) {
                            wca.x(appCompatActivity2.getLifecycle()).b(new r1(fantasySectionedBottomSheetFragment, appCompatActivity2, teamSides, i13));
                        }
                    }
                } else if (uq6Var.equals(qq6.a)) {
                    FragmentActivity O3 = hkg.O(context3);
                    if (O3 != null) {
                        ev6 ev6Var2 = nr6Var.h.c;
                        int i24 = ev6Var2.c;
                        boolean z3 = ev6Var2.A;
                        FantasyPriceTrackerBottomSheet fantasyPriceTrackerBottomSheet = new FantasyPriceTrackerBottomSheet();
                        fantasyPriceTrackerBottomSheet.setArguments(fz8.C(fz8.D(i24, "competitionId"), fz8.J("assetsRestricted", z3)));
                        AppCompatActivity appCompatActivity3 = O3 instanceof AppCompatActivity ? (AppCompatActivity) O3 : null;
                        if (appCompatActivity3 != null) {
                            wca.x(appCompatActivity3.getLifecycle()).b(new r1(fantasyPriceTrackerBottomSheet, appCompatActivity3, teamSides, i13));
                        }
                    }
                } else if (uq6Var.equals(pq6.a)) {
                    int i25 = FantasyNewsArticlesActivity.M;
                    ev6 ev6Var3 = nr6Var.h.c;
                    context3.getClass();
                    Intent intent = new Intent(context3, (Class<?>) FantasyNewsArticlesActivity.class);
                    intent.putExtra("competition", ev6Var3);
                    context3.startActivity(intent);
                } else if (uq6Var instanceof eq6) {
                    nv.A(context3, "open_news", null);
                    p4h.w(context3, ((eq6) uq6Var).a);
                } else if (uq6Var.equals(hq6.a)) {
                    nr6Var.n(hr6.a(nr6Var.k(), null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, 1032191));
                    Context i26 = nr6Var.i();
                    SharedPreferences sharedPreferences = uic.j;
                    if (sharedPreferences == null) {
                        Context applicationContext = i26.getApplicationContext();
                        synchronized (uic.i) {
                            d = a5f.d(applicationContext);
                            uic.j = d;
                        }
                        d.getClass();
                        sharedPreferences = d;
                    }
                    SharedPreferences.Editor i27 = dmi.i(sharedPreferences, "SHOW_FANTASY_HOW_TO_PLAY_BUBBLE", false);
                    Unit unit = Unit.a;
                    i27.apply();
                } else if (uq6Var.equals(fq6.a)) {
                    if (nr6Var.k().s) {
                        FragmentActivity O4 = hkg.O(context3);
                        if (O4 != null) {
                            ev6 ev6Var4 = nr6Var.h.c;
                            FantasyChatsBottomSheet fantasyChatsBottomSheet = new FantasyChatsBottomSheet();
                            Bundle bundle2 = new Bundle();
                            bundle2.putSerializable("FANTASY_COMPETITION_EXTRA", ev6Var4);
                            fantasyChatsBottomSheet.setArguments(bundle2);
                            AppCompatActivity appCompatActivity4 = O4 instanceof AppCompatActivity ? (AppCompatActivity) O4 : null;
                            if (appCompatActivity4 != null) {
                                wca.x(appCompatActivity4.getLifecycle()).b(new r1(fantasyChatsBottomSheet, appCompatActivity4, teamSides, i13));
                            }
                        }
                    } else {
                        j67 j67Var = nr6Var.k().r;
                        if (j67Var != null) {
                            int i28 = FantasyLeagueActivity.N;
                            inb.E(context3, j67Var, nr6Var.h.c);
                        }
                    }
                } else if (uq6Var.equals(dq6.a)) {
                    nr6Var.getClass();
                    xw3.L(un0.z(nr6Var), null, null, new ce4(nr6Var, (rq3) teamSides, i9), 3);
                } else if (uq6Var.equals(oq6.a)) {
                    hp6Var.l(xmh.e);
                } else if (uq6Var.equals(nq6.a)) {
                    mj7 mj7Var3 = nr6Var.k().e;
                    if (mj7Var3 != null) {
                        int i29 = nr6Var.h.c.c;
                        context3.getClass();
                        long longValue = ((Number) n9e.x(context3, new q13(i29, 24))).longValue();
                        Long l = mj7Var3.h;
                        if (longValue < (l != null ? l.longValue() : 0L)) {
                            FragmentActivity K = hkg.K(context3);
                            if (K != null) {
                                ev6 ev6Var5 = nr6Var.h.c;
                                int i30 = mj7Var3.a;
                                int i31 = mj7Var3.c;
                                FantasyEliteFaceoffRevealDialog fantasyEliteFaceoffRevealDialog = new FantasyEliteFaceoffRevealDialog();
                                fantasyEliteFaceoffRevealDialog.setArguments(fz8.C(fz8.G("competition", ev6Var5), fz8.D(i30, "roundId"), fz8.D(i31, "roundSequence")));
                                fantasyEliteFaceoffRevealDialog.p(K.k(), "RevealDialog");
                            }
                            n9e.u(context3, new we7(nr6Var.h.c.c, yaa.w(), 0));
                            hp6Var.k();
                        }
                    }
                } else if (uq6Var.equals(lq6.a)) {
                    int i32 = FantasyManagerProfileActivity.N;
                    do7 do7Var = nr6Var.k().a;
                    context3.getClass();
                    Intent intent2 = new Intent(context3, (Class<?>) FantasyManagerProfileActivity.class);
                    intent2.putExtra("USER_COMPETITION_EXTRA", do7Var);
                    crbVar.a(intent2, null);
                } else if (uq6Var instanceof mq6) {
                    FragmentActivity O5 = hkg.O(context3);
                    if (O5 != null) {
                        mq6 mq6Var = (mq6) uq6Var;
                        FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel = mq6Var.a;
                        ev6 ev6Var6 = nr6Var.h.c;
                        int i33 = ev6Var6.c;
                        FantasyCompetitionType fantasyCompetitionType = ev6Var6.d;
                        int i34 = mq6Var.b;
                        boolean z4 = ev6Var6.A;
                        fantasyCompetitionType.getClass();
                        FantasyFootballPlayerBottomSheet fantasyFootballPlayerBottomSheet = new FantasyFootballPlayerBottomSheet();
                        Bundle bundle3 = new Bundle();
                        bundle3.putParcelable(SearchResponseKt.PLAYER_ENTITY, fantasyRoundPlayerUiModel);
                        bundle3.putBoolean("tripleCaptain", false);
                        bundle3.putInt("competitionId", i33);
                        bundle3.putSerializable("competitionType", fantasyCompetitionType);
                        bundle3.putInt("roundId", i34);
                        bundle3.putBoolean("assetsRestricted", z4);
                        fantasyFootballPlayerBottomSheet.setArguments(bundle3);
                        AppCompatActivity appCompatActivity5 = O5 instanceof AppCompatActivity ? (AppCompatActivity) O5 : null;
                        if (appCompatActivity5 != null) {
                            wca.x(appCompatActivity5.getLifecycle()).b(new r1(fantasyFootballPlayerBottomSheet, appCompatActivity5, teamSides, i13));
                        }
                    }
                } else if (uq6Var instanceof sq6) {
                    FragmentActivity O6 = hkg.O(context3);
                    if (O6 != null) {
                        cm7 cm7Var = ((sq6) uq6Var).a;
                        ev6 ev6Var7 = nr6Var.h.c;
                        int i35 = ev6Var7.c;
                        boolean z5 = ev6Var7.A;
                        FantasyTopPlayersBottomSheet fantasyTopPlayersBottomSheet = new FantasyTopPlayersBottomSheet();
                        Bundle bundle4 = new Bundle();
                        bundle4.putSerializable("FANTASY_TOP_PLAYERS_CATEGORY_EXTRA", cm7Var);
                        bundle4.putSerializable("competitionId", Integer.valueOf(i35));
                        bundle4.putBoolean("assetsRestricted", z5);
                        fantasyTopPlayersBottomSheet.setArguments(bundle4);
                        AppCompatActivity appCompatActivity6 = O6 instanceof AppCompatActivity ? (AppCompatActivity) O6 : null;
                        if (appCompatActivity6 != null) {
                            wca.x(appCompatActivity6.getLifecycle()).b(new r1(fantasyTopPlayersBottomSheet, appCompatActivity6, teamSides, i13));
                        }
                    }
                } else {
                    if (!(uq6Var instanceof tq6)) {
                        zzl.b();
                        return null;
                    }
                    nv.A(context3, "totgw_change", null);
                    int i36 = ((tq6) uq6Var).a.a;
                    nr6Var.getClass();
                    xw3.L(un0.z(nr6Var), null, null, new xy5(nr6Var, i36, (rq3) teamSides, i14), 3);
                }
                return Unit.a;
            case 13:
                c47 c47Var = (c47) this.b;
                j67 j67Var2 = (j67) this.c;
                ev6 ev6Var8 = (ev6) this.e;
                Function1 function17 = (Function1) this.d;
                esa esaVar4 = (esa) obj;
                esaVar4.getClass();
                esa.d(esaVar4, "info", null, new tc3(1791858475, new qm4(i10, j67Var2, ev6Var8), true), 2);
                if (!c47Var.a || j67Var2.d()) {
                    esa.d(esaVar4, null, null, new tc3(-594193744, new b47(j67Var2, function17, i12), true), 3);
                }
                if (!c47Var.a && (fantasyLeagueType = j67Var2.j) != null && fantasyLeagueType != FantasyLeagueType.GLOBAL && fantasyLeagueType != FantasyLeagueType.COUNTRY) {
                    esa.d(esaVar4, "leave_card", null, new tc3(-767544167, new y47(i11, function17), true), 2);
                }
                return Unit.a;
            case 14:
                return b(obj);
            case 15:
                wb7 wb7Var = (wb7) this.b;
                et8 et8Var = (et8) this.c;
                ev6 ev6Var9 = (ev6) this.d;
                mj7 mj7Var4 = (mj7) this.e;
                FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel2 = (FantasyRoundPlayerUiModel) obj;
                fantasyRoundPlayerUiModel2.getClass();
                wb7Var.v(fantasyRoundPlayerUiModel2);
                et8Var.invoke(Integer.valueOf(ev6Var9.c), Integer.valueOf(mj7Var4.a), fantasyRoundPlayerUiModel2.b.b, fantasyRoundPlayerUiModel2);
                return Unit.a;
            case 16:
                return c(obj);
            case 17:
                return d(obj);
            case 18:
                return e(obj);
            case 19:
                return f(obj);
            case 20:
                return g(obj);
            case 21:
                return h(obj);
            case 22:
                return i(obj);
            case 23:
                return j(obj);
            case 24:
                return k(obj);
            case 25:
                return l(obj);
            case 26:
                return m(obj);
            case 27:
                return n(obj);
            case 28:
                return o(obj);
            default:
                era eraVar = (era) this.b;
                eraVar.c = new en0((tqa) this.c, (xji) this.d, (r5f) this.e);
                return new le(eraVar, 13);
        }
    }

    public /* synthetic */ l50(int i, Object obj, Object obj2, Object obj3, Function1 function1) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.e = obj3;
        this.d = function1;
    }

    public /* synthetic */ l50(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public /* synthetic */ l50(ArrayList arrayList, dsf dsfVar, List list, int i, fpa fpaVar) {
        this.a = 28;
        this.b = arrayList;
        this.c = dsfVar;
        this.d = list;
        this.e = fpaVar;
    }

    public /* synthetic */ l50(Function1 function1, Function1 function12, Activity activity, r77 r77Var) {
        this.a = 14;
        this.d = function1;
        this.b = function12;
        this.c = activity;
        this.e = r77Var;
    }
}
