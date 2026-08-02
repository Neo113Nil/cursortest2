package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.identityauth.HiddenActivity;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.sofascore.common.widget.ScrollInterceptorHorizontalScrollView;
import com.sofascore.model.AnalystOfferRemoteConfig;
import com.sofascore.model.Country;
import com.sofascore.model.Sports;
import com.sofascore.model.TeamSelection;
import com.sofascore.model.chat.DbChatMessage;
import com.sofascore.model.crowdsourcing.CrowdsourcingIncidentType;
import com.sofascore.model.database.DbDismissedBuzzerTile;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.EventHeadFlags;
import com.sofascore.model.mvvm.model.FootballEvent;
import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.TeamSides;
import com.sofascore.model.newNetwork.AiInsightsHalftimePredictions;
import com.sofascore.model.newNetwork.AiInsightsResponse;
import com.sofascore.model.newNetwork.AiInsightsSections;
import com.sofascore.model.newNetwork.AiInsightsTennisPossibleResult;
import com.sofascore.model.newNetwork.AiInsightsTennisPredictions;
import com.sofascore.model.newNetwork.AiInsightsTennisWinningProbability;
import com.sofascore.model.newNetwork.AiInsightsWinningProbability;
import com.sofascore.model.newNetwork.EventAiInsightsResponse;
import com.sofascore.model.newNetwork.EventTennisAiInsightsResponse;
import com.sofascore.model.newNetwork.commentary.Comment;
import com.sofascore.results.R;
import com.sofascore.results.event.EventActivity;
import com.sofascore.results.event.aiInsights.EventAiInsightsAlarmReceiver;
import com.sofascore.results.event.aiInsights.EventAiInsightsBlackFridayModal;
import com.sofascore.results.event.aiInsights.EventAiInsightsPromotionalModal;
import com.sofascore.results.event.commentary.EventCommentaryFragment;
import com.sofascore.results.event.details.view.cricket.wagonwheel.CricketWagonWheelGraphView;
import com.sofascore.results.event.details.view.cricket.wagonwheel.CricketWagonWheelView;
import com.sofascore.results.event.details.view.tennis.SwitchView;
import com.sofascore.results.player.statistics.compare.search.CompareSearchBottomSheet;
import com.sofascore.results.player.statistics.compare.search.CompareSearchModal;
import com.sofascore.results.profile.contributionScreen.contributionLogDialog.ContributionLogDialog;
import com.sofascore.results.view.typeheader.TypeHeaderView;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.io.IOException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class r82 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ r82(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:141:0x0277, code lost:
    
        if (r11 >= 0) goto L135;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object a(Object obj) {
        rd6 rd6Var;
        Integer num;
        int m;
        rd6 rd6Var2;
        EventActivity eventActivity = (EventActivity) this.b;
        Bundle bundle = (Bundle) this.c;
        x2g x2gVar = (x2g) obj;
        wxf wxfVar = EventActivity.h0;
        int i = 0;
        eventActivity.R().h.setRefreshing(false);
        if (x2gVar instanceof v2g) {
            EventHeadFlags eventHeadFlags = (EventHeadFlags) ((v2g) x2gVar).a;
            Event event = (Event) eventActivity.T().v.d();
            if (eventActivity.K) {
                rd6Var = ((rd6[]) rd6.u.toArray(new rd6[0]))[(int) eventActivity.U().getItemId(eventActivity.R().k.getCurrentItem())];
            } else {
                eventActivity.K = true;
                eventActivity.a0 = new uq5(eventActivity, 9);
                eventActivity.R().c.a(new xq5(eventActivity, i));
                rd6Var = null;
            }
            ArrayList U0 = CollectionsKt.U0(rd6.u);
            if (CollectionsKt.R(b.j(Sports.FOOTBALL, Sports.BASKETBALL, Sports.BASEBALL), event != null ? ok3.s(event) : null)) {
                rd6 rd6Var3 = rd6.h;
                U0.remove(rd6Var3);
                U0.add(U0.indexOf(Intrinsics.c(event != null ? ok3.s(event) : null, Sports.BASEBALL) ? rd6.m : rd6.n) + 1, rd6Var3);
            }
            if (CollectionsKt.R(b.j(StatusKt.STATUS_FINISHED, StatusKt.STATUS_CANCELED, StatusKt.STATUS_SUSPENDED), event != null ? event.getStatusType() : null)) {
                rd6 rd6Var4 = rd6.f;
                U0.remove(rd6Var4);
                U0.add(rd6Var4);
                rd6 rd6Var5 = rd6.g;
                U0.remove(rd6Var5);
                U0.add(rd6Var5);
            }
            if (Intrinsics.c(event != null ? Boolean.valueOf(ok3.C(event)) : null, Boolean.FALSE)) {
                SharedPreferences sharedPreferences = uic.j;
                if (sharedPreferences == null) {
                    Context applicationContext = eventActivity.getApplicationContext();
                    synchronized (uic.i) {
                        sharedPreferences = a5f.d(applicationContext);
                        uic.j = sharedPreferences;
                    }
                    sharedPreferences.getClass();
                }
                int i2 = sharedPreferences.getBoolean("DEV_MODE_SHORTEN_AI_RELEVANCE", false) ? 1 : 15;
                SharedPreferences sharedPreferences2 = uic.j;
                if (sharedPreferences2 == null) {
                    Context applicationContext2 = eventActivity.getApplicationContext();
                    synchronized (uic.i) {
                        sharedPreferences2 = a5f.d(applicationContext2);
                        uic.j = sharedPreferences2;
                    }
                    sharedPreferences2.getClass();
                }
                if (!sharedPreferences2.getBoolean("PREF_AI_SUBSCRIPTION_ACTIVATED", false)) {
                    SharedPreferences sharedPreferences3 = uic.j;
                    if (sharedPreferences3 == null) {
                        Context applicationContext3 = eventActivity.getApplicationContext();
                        synchronized (uic.i) {
                            sharedPreferences3 = a5f.d(applicationContext3);
                            uic.j = sharedPreferences3;
                        }
                        sharedPreferences3.getClass();
                    }
                    String string = sharedPreferences3.getString("PR_XAIST", null);
                    if (string == null || string.length() == 0) {
                        SharedPreferences sharedPreferences4 = uic.j;
                        if (sharedPreferences4 == null) {
                            Context applicationContext4 = eventActivity.getApplicationContext();
                            synchronized (uic.i) {
                                sharedPreferences4 = a5f.d(applicationContext4);
                                uic.j = sharedPreferences4;
                            }
                            sharedPreferences4.getClass();
                        }
                        if (sharedPreferences4.getInt("PREF_AI_TAB_OPEN_COUNT", 0) >= 3) {
                            SharedPreferences sharedPreferences5 = uic.j;
                            if (sharedPreferences5 == null) {
                                Context applicationContext5 = eventActivity.getApplicationContext();
                                synchronized (uic.i) {
                                    sharedPreferences5 = a5f.d(applicationContext5);
                                    uic.j = sharedPreferences5;
                                }
                                sharedPreferences5.getClass();
                            }
                            if (((int) ChronoUnit.DAYS.between(vxd.o(Instant.ofEpochMilli(sharedPreferences5.getLong("PREF_AI_TAB_FIRST_OPEN_TIMESTAMP", System.currentTimeMillis()))), vxd.o(Instant.ofEpochMilli(System.currentTimeMillis())))) >= i2) {
                                rd6 rd6Var6 = rd6.d;
                                U0.remove(rd6Var6);
                                U0.add(rd6Var6);
                            }
                        }
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = U0.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                rd6 rd6Var7 = (rd6) next;
                if (((Boolean) rd6Var7.b.invoke(eventHeadFlags)).booleanValue() || eventActivity.Z.contains(rd6Var7)) {
                    arrayList.add(next);
                }
            }
            eventActivity.U().x(arrayList);
            rd6 rd6Var8 = eventActivity.U;
            rd6 rd6Var9 = rd6.j;
            if (rd6Var8 == rd6Var9) {
                Iterator it2 = b.j(rd6Var9, rd6.m, rd6.k, rd6.l).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        rd6Var2 = 0;
                        break;
                    }
                    rd6Var2 = it2.next();
                    if (arrayList.contains((rd6) rd6Var2)) {
                        break;
                    }
                }
                rd6Var8 = rd6Var2;
            }
            if (rd6Var != null) {
                int D = eventActivity.U().D(rd6Var);
                Integer valueOf = Integer.valueOf(D);
                if (D < 0) {
                    valueOf = null;
                }
                if (valueOf != null) {
                    m = valueOf.intValue();
                } else {
                    m = eventActivity.R().k.getCurrentItem();
                    int size = eventActivity.U().l.size() - 1;
                    if (m > size) {
                        m = size;
                    }
                }
            } else if (bundle != null) {
                m = bundle.getInt("TAB_POSITION");
            } else {
                if (rd6Var8 != null) {
                    int D2 = eventActivity.U().D(rd6Var8);
                    num = Integer.valueOf(D2);
                }
                num = null;
                m = yid.m(num);
            }
            eventActivity.R().k.c(m, false);
            eventActivity.U = null;
        }
        return Unit.a;
    }

    private final Object b(Object obj) {
        ScrollInterceptorHorizontalScrollView scrollInterceptorHorizontalScrollView = (ScrollInterceptorHorizontalScrollView) this.b;
        Integer num = (Integer) this.c;
        ((View) obj).getClass();
        scrollInterceptorHorizontalScrollView.scrollTo(num.intValue(), 0);
        return Unit.a;
    }

    private final Object c(Object obj) {
        fv5 fv5Var = (fv5) this.b;
        lt5 lt5Var = (lt5) this.c;
        fv5 fv5Var2 = (fv5) obj;
        fv5Var2.getClass();
        gv9 gv9Var = fv5Var.e;
        ArrayList arrayList = new ArrayList(k13.r(gv9Var, 10));
        int i = 0;
        for (Object obj2 : gv9Var) {
            int i2 = i + 1;
            if (i < 0) {
                b.q();
                throw null;
            }
            l22 l22Var = (l22) obj2;
            it5 it5Var = (it5) lt5Var;
            if (i == it5Var.a) {
                l22Var = n4o.G(l22Var, Integer.valueOf(it5Var.b), fv5Var.c);
            }
            arrayList.add(l22Var);
            i = i2;
        }
        return fv5.a(fv5Var2, null, false, l6g.W(arrayList), null, null, 111);
    }

    private final Object d(Object obj) {
        List D;
        asf asfVar = (asf) this.b;
        EventCommentaryFragment eventCommentaryFragment = (EventCommentaryFragment) this.c;
        if (!asfVar.a && !Intrinsics.c(ok3.s(eventCommentaryFragment.E()), Sports.BASKETBALL)) {
            xbb b = a.b();
            b.add(bw5.a);
            b.add(dw5.a);
            cw5 cw5Var = new cw5(new k43(1, eventCommentaryFragment.F(), hw5.class, "getAtBatData", "getAtBatData(I)Lcom/sofascore/model/newNetwork/BaseballAtBatData;", 0, 20));
            if (Intrinsics.c(ok3.s(eventCommentaryFragment.E()), Sports.BASEBALL)) {
                yea yeaVar = j58.a;
                if (fn0.B("baseball_pbp_show_win_probability") && ((D = eventCommentaryFragment.D()) == null || !D.isEmpty())) {
                    Iterator it = D.iterator();
                    while (it.hasNext()) {
                        if (cw5Var.a((Comment) it.next())) {
                            break;
                        }
                    }
                }
            }
            cw5Var = null;
            if (cw5Var != null) {
                b.add(cw5Var);
            }
            xbb a = a.a(b);
            Context requireContext = eventCommentaryFragment.requireContext();
            requireContext.getClass();
            TypeHeaderView typeHeaderView = new TypeHeaderView(requireContext, null, 6);
            Context context = typeHeaderView.getContext();
            context.getClass();
            typeHeaderView.setElevation(ao2.u(4, context));
            g5k g5kVar = new g5k(typeHeaderView);
            ArrayList arrayList = new ArrayList(k13.r(a, 10));
            ListIterator listIterator = a.listIterator(0);
            while (true) {
                hc9 hc9Var = (hc9) listIterator;
                if (!hc9Var.hasNext()) {
                    break;
                }
                arrayList.add(((ew5) hc9Var.next()).getKey());
            }
            g5kVar.a = arrayList;
            g5kVar.d = new fa(25, a, typeHeaderView, eventCommentaryFragment);
            g5kVar.m = new wt(3, a, eventCommentaryFragment);
            g5kVar.b();
            if (Intrinsics.c(ok3.s(eventCommentaryFragment.E()), Sports.BASEBALL)) {
                krk krkVar = eventCommentaryFragment.l;
                krkVar.getClass();
                ((yq8) krkVar).b.addView(typeHeaderView);
            } else {
                r13.p(eventCommentaryFragment.C().g.size(), typeHeaderView);
            }
            asfVar.a = true;
        }
        EventCommentaryFragment.I(eventCommentaryFragment, false, null, 7);
        return Unit.a;
    }

    private final Object e(Object obj) {
        ww5 ww5Var = (ww5) this.b;
        Function1 function1 = (Function1) this.c;
        esa esaVar = (esa) obj;
        esaVar.getClass();
        esaVar.f("TeamSelector", "TeamSelector", new tc3(1317631754, new qm4(3, ww5Var, function1), true));
        esa.d(esaVar, null, null, j72.a, 3);
        gv9 gv9Var = ww5Var.a.a;
        esaVar.a(gv9Var.size(), null, new zi(18, new au5(6), gv9Var), new tc3(802480018, new vw5(gv9Var, function1, 0), true));
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:237:0x06ee, code lost:
    
        if (r1 != null) goto L248;
     */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        SharedPreferences d;
        int i;
        Object obj2;
        boolean z;
        EventAiInsightsResponse eventAiInsightsResponse;
        or5 or5Var;
        gv9 gv9Var;
        dm dmVar;
        List B0;
        q9k q9kVar;
        int i2;
        int i3;
        gv9 gv9Var2;
        int i4 = 4;
        int i5 = 0;
        switch (this.a) {
            case 0:
                t82 t82Var = (t82) this.b;
                DbDismissedBuzzerTile dbDismissedBuzzerTile = (DbDismissedBuzzerTile) this.c;
                glg glgVar = (glg) obj;
                glgVar.getClass();
                t82Var.b.a0(glgVar, dbDismissedBuzzerTile);
                return Unit.a;
            case 1:
                fr2 fr2Var = (fr2) this.b;
                DbChatMessage dbChatMessage = (DbChatMessage) this.c;
                glg glgVar2 = (glg) obj;
                glgVar2.getClass();
                fr2Var.b.a0(glgVar2, dbChatMessage);
                return Unit.a;
            case 2:
                q1a q1aVar = (q1a) this.b;
                asf asfVar = (asf) this.c;
                boolean z2 = asfVar.a || ((xw8) obj).F(q1aVar);
                asfVar.a = z2;
                return Boolean.valueOf(!z2);
            case 3:
                mze mzeVar = (mze) this.b;
                asf asfVar2 = (asf) this.c;
                boolean z3 = asfVar2.a || ((xw8) obj).F0(mzeVar);
                asfVar2.a = z3;
                return Boolean.valueOf(!z3);
            case 4:
                CompareSearchBottomSheet compareSearchBottomSheet = (CompareSearchBottomSheet) this.b;
                e1d e1dVar = (e1d) this.c;
                String str = (String) obj;
                str.getClass();
                e1dVar.setValue(str);
                ((p63) compareSearchBottomSheet.C.getValue()).g.l(StringsKt.l0(str).toString());
                return Unit.a;
            case 5:
                c63 c63Var = (c63) this.b;
                f6e f6eVar = (f6e) obj;
                g6b lifecycle = ((CompareSearchModal) this.c).getLifecycle();
                lifecycle.getClass();
                f6eVar.getClass();
                c63Var.r(lifecycle, f6eVar);
                return Unit.a;
            case 6:
                Context context = (Context) this.b;
                ks3 ks3Var = (ks3) this.c;
                int intValue = ((Integer) obj).intValue();
                String str2 = ks3Var.n ? "own_profile" : "other_profile";
                ContributionLogDialog contributionLogDialog = new ContributionLogDialog();
                contributionLogDialog.setArguments(fz8.C(fz8.H("PROFILE_DATA", str2), fz8.D(intValue, "LOGS_INDEX")));
                context.getClass();
                if (context instanceof csk) {
                    context = ((csk) context).getBaseContext();
                }
                AppCompatActivity appCompatActivity = context instanceof AppCompatActivity ? (AppCompatActivity) context : null;
                if (appCompatActivity != null) {
                    wca.x(appCompatActivity.getLifecycle()).b(new r1(contributionLogDialog, appCompatActivity, null, 3));
                }
                return Unit.a;
            case 7:
                q5b q5bVar = (q5b) this.b;
                n52 n52Var = (n52) this.c;
                yma ymaVar = (yma) obj;
                ymaVar.a();
                if (((Boolean) ((eoh) q5bVar.s).getValue()).booleanValue() || ((Boolean) ((eoh) q5bVar.t).getValue()).booleanValue()) {
                    ha5.g0(ymaVar, n52Var, 0L, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                }
                return Unit.a;
            case 8:
                CancellationSignal cancellationSignal = (CancellationSignal) this.b;
                ty3 ty3Var = (ty3) this.c;
                Context context2 = ty3Var.f;
                BeginSignInResult beginSignInResult = (BeginSignInResult) obj;
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (fz3.a(cancellationSignal)) {
                    return Unit.a;
                }
                Intent intent = new Intent(context2, (Class<?>) HiddenActivity.class);
                uy3.a(ty3Var.j, intent, "BEGIN_SIGN_IN");
                intent.putExtra("EXTRA_FLOW_PENDING_INTENT", beginSignInResult.a);
                try {
                    context2.startActivity(intent);
                } catch (Exception unused) {
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (!fz3.a(cancellationSignal)) {
                        ty3Var.e().execute(new wb3(ty3Var, 2));
                        Unit unit = Unit.a;
                    }
                }
                return Unit.a;
            case 9:
                CancellationSignal cancellationSignal2 = (CancellationSignal) this.b;
                yy3 yy3Var = (yy3) this.c;
                Context context3 = yy3Var.f;
                PendingIntent pendingIntent = (PendingIntent) obj;
                pendingIntent.getClass();
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (fz3.a(cancellationSignal2)) {
                    return Unit.a;
                }
                Intent intent2 = new Intent(context3, (Class<?>) HiddenActivity.class);
                uy3.a(yy3Var.j, intent2, "SIGN_IN_INTENT");
                intent2.putExtra("EXTRA_FLOW_PENDING_INTENT", pendingIntent);
                try {
                    context3.startActivity(intent2);
                } catch (Exception unused2) {
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (!fz3.a(cancellationSignal2)) {
                        yy3Var.f().execute(new wb3(yy3Var, 3));
                        Unit unit2 = Unit.a;
                    }
                }
                return Unit.a;
            case 10:
                SwitchView switchView = (SwitchView) this.b;
                p12 p12Var = (p12) this.c;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                int i6 = CricketWagonWheelView.l;
                Context context4 = switchView.getContext();
                context4.getClass();
                SharedPreferences sharedPreferences = uic.j;
                if (sharedPreferences == null) {
                    Context applicationContext = context4.getApplicationContext();
                    synchronized (uic.i) {
                        d = a5f.d(applicationContext);
                        uic.j = d;
                    }
                    d.getClass();
                    sharedPreferences = d;
                }
                SharedPreferences.Editor i7 = dmi.i(sharedPreferences, "PREF_WAGON_WHEEL_MODE_DETAILED", booleanValue);
                Unit unit3 = Unit.a;
                i7.apply();
                ((CricketWagonWheelGraphView) p12Var.c).setMode(booleanValue ? q14.b : q14.a);
                LinearLayout linearLayout = ((gh5) p12Var.l).b;
                linearLayout.getClass();
                linearLayout.setVisibility(!booleanValue ? 0 : 8);
                ((TypeHeaderView) p12Var.h).setVisibility(booleanValue ? 0 : 8);
                return Unit.a;
            case 11:
                Function1 function1 = (Function1) this.b;
                CrowdsourcingIncidentType.Card card = (CrowdsourcingIncidentType.Card) this.c;
                ((CrowdsourcingIncidentType) obj).getClass();
                function1.invoke(card);
                return Unit.a;
            case 12:
                y3h.e((b4h) obj, ((String) this.b) + ", " + ((String) this.c));
                return Unit.a;
            case 13:
                tx4 tx4Var = (tx4) this.b;
                px4 px4Var = (px4) this.c;
                glg glgVar3 = (glg) obj;
                glgVar3.getClass();
                tx4Var.b.a0(glgVar3, px4Var);
                return Unit.a;
            case 14:
                Function1 function12 = (Function1) this.b;
                mi6 mi6Var = (mi6) this.c;
                ri6 ri6Var = (ri6) obj;
                if (ri6Var != null) {
                    function12.invoke(new iz4(mi6Var, ri6Var));
                }
                return Unit.a;
            case 15:
                ((Function1) this.b).invoke(new sy4((tz4) this.c, ((Boolean) obj).booleanValue()));
                return Unit.a;
            case 16:
                e1d e1dVar2 = (e1d) this.b;
                e1d e1dVar3 = (e1d) this.c;
                String str3 = (String) obj;
                str3.getClass();
                e1dVar2.setValue(str3);
                e1dVar3.setValue(Boolean.TRUE);
                return Unit.a;
            case 17:
                j05 j05Var = (j05) this.b;
                Function1 function13 = (Function1) this.c;
                esa esaVar = (esa) obj;
                esaVar.getClass();
                if (j05Var.A) {
                    esa.d(esaVar, "affiliate_banners_picker", null, new tc3(-1155604559, new g05(0, j05Var, function13), true), 2);
                } else {
                    esa.d(esaVar, "clipboard_card", null, new tc3(-313889862, new g05(1, j05Var, function13), true), 2);
                    esa.d(esaVar, "api_card", null, new tc3(-275499727, new g05(2, j05Var, function13), true), 2);
                    esa.d(esaVar, "ads_network", null, new tc3(-1340466958, new g05(3, j05Var, function13), true), 2);
                    esa.d(esaVar, "location_card", null, new tc3(1889533107, new g05(i4, j05Var, function13), true), 2);
                    int i8 = 5;
                    esa.d(esaVar, "sofa_season_test_ids", null, new tc3(824565876, new g05(i8, j05Var, function13), true), 2);
                    if (j05Var.g.isEmpty()) {
                        i = 2;
                        obj2 = null;
                        z = true;
                    } else {
                        Country country = j05Var.o;
                        z = true;
                        i = 2;
                        obj2 = null;
                        esa.d(esaVar, "experiments_card", null, new tc3(-826349995, new h05(country == null || yid.m((Integer) CollectionsKt.firstOrNull(country.getMccList())) == 0, j05Var, function13, 0), true), 2);
                    }
                    esa.d(esaVar, "enable_card", obj2, new tc3(-240401355, new g05(6, j05Var, function13), z), i);
                    esa.d(esaVar, "other_card", obj2, new tc3(-1305368586, new y47(i4, function13), z), i);
                    esa.d(esaVar, "open_screen_card", obj2, t62.f, i);
                    esa.d(esaVar, "stream ad showing time setting", obj2, new tc3(859664248, new y47(i8, function13), z), i);
                }
                return Unit.a;
            case 18:
                l45 l45Var = (l45) this.b;
                en0 en0Var = (en0) this.c;
                ((IOException) obj).getClass();
                synchronized (l45Var) {
                    en0Var.n();
                }
                return Unit.a;
            case 19:
                cx cxVar = (cx) this.b;
                x95 x95Var = (x95) this.c;
                long j = dnd.j(((q85) obj).a, 1.0f);
                ewd ewdVar = x95Var.K;
                xf2 xf2Var = w95.a;
                float intBitsToFloat = Float.intBitsToFloat((int) (ewdVar == ewd.a ? 4294967295L & j : j >> 32));
                dx dxVar = cxVar.a;
                zw.a((zw) dxVar.o, dxVar.j(intBitsToFloat));
                return Unit.a;
            case 20:
                return jk5.c((dad) this.b, (jk5) this.c, (List) obj);
            case 21:
                gp5 gp5Var = (gp5) this.b;
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.c;
                Object obj3 = gp5Var.a.get(duf.a.getOrCreateKotlinClass(obj.getClass()));
                fp5 fp5Var = obj3 instanceof fp5 ? (fp5) obj3 : null;
                gp5Var.b.get(obj);
                Object obj4 = linkedHashMap.get(obj);
                if (obj4 == null) {
                    if (fp5Var == null || (obj4 = (Map) fp5Var.c.invoke(obj)) == null) {
                        obj4 = lm5.a;
                        obj4.getClass();
                    }
                    linkedHashMap.put(obj, obj4);
                }
                Map map = (Map) obj4;
                if (fp5Var != null) {
                    return new e7d(obj, fp5Var.b.invoke(obj), map, fp5Var.d);
                }
                a70.r(mz1.m(obj, "Unknown screen "));
                return null;
            case 22:
                return a(obj);
            case 23:
                EventActivity eventActivity = (EventActivity) this.b;
                AnalystOfferRemoteConfig analystOfferRemoteConfig = (AnalystOfferRemoteConfig) this.c;
                cu cuVar = (cu) obj;
                wxf wxfVar = EventActivity.h0;
                if (cuVar != null) {
                    LocalDateTime localDateTime = cs5.a;
                    SharedPreferences sharedPreferences2 = uic.j;
                    if (sharedPreferences2 == null) {
                        Context applicationContext2 = eventActivity.getApplicationContext();
                        synchronized (uic.i) {
                            sharedPreferences2 = a5f.d(applicationContext2);
                            uic.j = sharedPreferences2;
                        }
                        sharedPreferences2.getClass();
                    }
                    long currentTimeMillis = sharedPreferences2.getBoolean("PREF_FORCE_SHOW_LEADERBOARD_NOTIFICATION", false) ? System.currentTimeMillis() + 180000 : (cuVar == cu.f || cuVar == cu.e) ? cs5.a.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli() : LocalDateTime.now().plusDays(5L).withHour(18).withMinute(0).withSecond(0).withNano(0).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
                    if (currentTimeMillis > System.currentTimeMillis()) {
                        AlarmManager alarmManager = (AlarmManager) eventActivity.getSystemService(AlarmManager.class);
                        PendingIntent broadcast = PendingIntent.getBroadcast(eventActivity, 2, new Intent(eventActivity, (Class<?>) EventAiInsightsAlarmReceiver.class), 33554432);
                        broadcast.getClass();
                        if (alarmManager != null) {
                            alarmManager.setAndAllowWhileIdle(0, currentTimeMillis, broadcast);
                        }
                    }
                }
                int i9 = cuVar == null ? -1 : zq5.b[cuVar.ordinal()];
                if (i9 == 1) {
                    SharedPreferences.Editor edit = eventActivity.A().edit();
                    edit.getClass();
                    edit.putLong(lnb.o("PREF_ANALYST_PROMOTION_MODAL_TIMESTAMP", analystOfferRemoteConfig != null ? analystOfferRemoteConfig.getStartDate() : null, cuVar.a), System.currentTimeMillis());
                    edit.apply();
                    im imVar = eventActivity.T().F;
                    double k = yid.k(imVar != null ? imVar.a : null);
                    im imVar2 = eventActivity.T().F;
                    String str4 = imVar2 != null ? imVar2.b : null;
                    if (str4 == null) {
                        str4 = "";
                    }
                    EventAiInsightsPromotionalModal eventAiInsightsPromotionalModal = new EventAiInsightsPromotionalModal();
                    Bundle bundle = new Bundle();
                    bundle.putDouble("REGULAR_MONTHLY_PRICE", k);
                    bundle.putString("CURRENCY_CODE", str4);
                    eventAiInsightsPromotionalModal.setArguments(bundle);
                    EventActivity eventActivity2 = eventActivity instanceof AppCompatActivity ? eventActivity : null;
                    if (eventActivity2 != null) {
                        wca.x(eventActivity2.getLifecycle()).b(new r1(eventAiInsightsPromotionalModal, eventActivity2, null, 3));
                    }
                } else if (i9 == 2) {
                    SharedPreferences.Editor edit2 = eventActivity.A().edit();
                    edit2.getClass();
                    edit2.putLong(lnb.o("PREF_ANALYST_PROMOTION_MODAL_TIMESTAMP", analystOfferRemoteConfig != null ? analystOfferRemoteConfig.getStartDate() : null, cuVar.a), System.currentTimeMillis());
                    edit2.apply();
                    EventAiInsightsBlackFridayModal eventAiInsightsBlackFridayModal = new EventAiInsightsBlackFridayModal();
                    EventActivity eventActivity3 = eventActivity instanceof AppCompatActivity ? eventActivity : null;
                    if (eventActivity3 != null) {
                        wca.x(eventActivity3.getLifecycle()).b(new r1(eventAiInsightsBlackFridayModal, eventActivity3, null, 3));
                    }
                } else if (i9 == 3 || i9 == 4) {
                    if (((int) ChronoUnit.DAYS.between(vxd.o(Instant.ofEpochMilli(eventActivity.A().getLong("PREF_FIRST_RUN_TIMESTAMP", 0L))), vxd.o(Instant.ofEpochMilli(System.currentTimeMillis())))) >= 7 && eventActivity.z().a(e1f.h)) {
                        SharedPreferences.Editor edit3 = eventActivity.A().edit();
                        edit3.getClass();
                        edit3.putLong("PREF_WC_OFFER_POPUP_LAST_SHOWN_TIMESTAMP", System.currentTimeMillis());
                        edit3.apply();
                    }
                }
                return Unit.a;
            case 24:
                Event event = (Event) this.b;
                xs5 xs5Var = (xs5) this.c;
                AiInsightsResponse aiInsightsResponse = (AiInsightsResponse) obj;
                aiInsightsResponse.getClass();
                if (!(aiInsightsResponse instanceof EventTennisAiInsightsResponse)) {
                    if (!(aiInsightsResponse instanceof EventAiInsightsResponse)) {
                        zzl.b();
                        return null;
                    }
                    List list = ts5.a;
                    EventAiInsightsResponse eventAiInsightsResponse2 = (EventAiInsightsResponse) aiInsightsResponse;
                    Context i10 = xs5Var.i();
                    event.getClass();
                    int id = Event.getHomeTeam$default(event, null, 1, null).getId();
                    int id2 = Event.getAwayTeam$default(event, null, 1, null).getId();
                    String A = tba.A(i10, Event.getHomeTeam$default(event, null, 1, null));
                    String str5 = A == null ? "" : A;
                    String A2 = tba.A(i10, Event.getAwayTeam$default(event, null, 1, null));
                    String str6 = A2 == null ? "" : A2;
                    TeamSides teamSides = TeamSides.ORIGINAL;
                    String A3 = tba.A(i10, event.getHomeTeam(teamSides));
                    if (A3 == null) {
                        A3 = "";
                    }
                    String A4 = tba.A(i10, event.getAwayTeam(teamSides));
                    if (A4 == null) {
                        A4 = "";
                    }
                    Integer normaltime = Event.getHomeScore$default(event, null, 1, null).getNormaltime();
                    Integer normaltime2 = Event.getAwayScore$default(event, null, 1, null).getNormaltime();
                    String str7 = (normaltime != null ? normaltime.intValue() : 0) > (normaltime2 != null ? normaltime2.intValue() : 0) ? str5 : (normaltime != null ? normaltime.intValue() : 0) < (normaltime2 != null ? normaltime2.intValue() : 0) ? str6 : null;
                    Integer yellowCards = eventAiInsightsResponse2.getPredictions().getYellowCards();
                    Integer corners = eventAiInsightsResponse2.getPredictions().getCorners();
                    Boolean bothTeamsToScore = eventAiInsightsResponse2.getPredictions().getBothTeamsToScore();
                    int homeNormaltimeScore = eventAiInsightsResponse2.getPredictions().getHomeNormaltimeScore();
                    int awayNormaltimeScore = eventAiInsightsResponse2.getPredictions().getAwayNormaltimeScore();
                    AiInsightsWinningProbability winningProbability = eventAiInsightsResponse2.getPredictions().getWinningProbability();
                    if (winningProbability != null) {
                        int home = winningProbability.getHome();
                        int away = winningProbability.getAway();
                        int draw = winningProbability.getDraw();
                        if (str7 != null) {
                            eventAiInsightsResponse = eventAiInsightsResponse2;
                            q9kVar = new q9k(R.string.ai_forecast_correct_win, l6g.K(str7));
                        } else {
                            eventAiInsightsResponse = eventAiInsightsResponse2;
                            q9kVar = new q9k(R.string.ai_forecast_correct_draw);
                        }
                        or5Var = new or5(home, Integer.valueOf(draw), away, q9kVar);
                    } else {
                        eventAiInsightsResponse = eventAiInsightsResponse2;
                        or5Var = null;
                    }
                    List<List<Double>> possibleResultsMatrix = eventAiInsightsResponse.getPredictions().getPossibleResultsMatrix();
                    if (possibleResultsMatrix != null && (B0 = CollectionsKt.B0(possibleResultsMatrix)) != null) {
                        ArrayList arrayList = new ArrayList(k13.r(B0, 10));
                        Iterator it = B0.iterator();
                        while (it.hasNext()) {
                            arrayList.add(l6g.W((List) it.next()));
                        }
                        gv9Var = l6g.W(arrayList);
                        break;
                    }
                    gv9Var = rlh.b;
                    hm hmVar = new hm(yellowCards, corners, bothTeamsToScore, homeNormaltimeScore, awayNormaltimeScore, or5Var, gv9Var);
                    AiInsightsHalftimePredictions halftimePredictions = eventAiInsightsResponse.getHalftimePredictions();
                    if (halftimePredictions != null) {
                        Player playerToScore = halftimePredictions.getPlayerToScore();
                        Integer valueOf = playerToScore != null ? Integer.valueOf(playerToScore.getId()) : null;
                        Player playerToScore2 = halftimePredictions.getPlayerToScore();
                        dmVar = new dm(valueOf, playerToScore2 != null ? tba.C(playerToScore2) : null, tba.A(i10, halftimePredictions.getNextTeamToScore()), halftimePredictions.getSecondHalfOverOneAndAHalfGoals(), halftimePredictions.getHomeNormaltimeScore(), halftimePredictions.getAwayNormaltimeScore());
                    } else {
                        dmVar = null;
                    }
                    r9k a = ts5.a(homeNormaltimeScore, awayNormaltimeScore, A3, A4);
                    r9k a2 = dmVar != null ? ts5.a(dmVar.e, dmVar.f, A3, A4) : new m9k("");
                    gv9 W = l6g.W(eventAiInsightsResponse.getSections());
                    List<AiInsightsSections> halftimeSections = eventAiInsightsResponse.getHalftimeSections();
                    gv9 W2 = halftimeSections != null ? l6g.W(halftimeSections) : null;
                    String statusType = event.getStatusType();
                    Boolean correctAiInsight = event.getCorrectAiInsight();
                    FootballEvent footballEvent = event instanceof FootballEvent ? (FootballEvent) event : null;
                    return new km(W, W2, hmVar, dmVar, id, id2, str5, str6, statusType, correctAiInsight, footballEvent != null ? footballEvent.getCorrectHalftimeAiInsight() : null, a, a2);
                }
                List list2 = ts5.a;
                EventTennisAiInsightsResponse eventTennisAiInsightsResponse = (EventTennisAiInsightsResponse) aiInsightsResponse;
                Context i11 = xs5Var.i();
                event.getClass();
                AiInsightsTennisPredictions predictions = eventTennisAiInsightsResponse.getPredictions();
                if (predictions == null) {
                    return null;
                }
                Team homeTeam$default = Event.getHomeTeam$default(event, null, 1, null);
                Team awayTeam$default = Event.getAwayTeam$default(event, null, 1, null);
                String A5 = tba.A(i11, homeTeam$default);
                if (A5 == null) {
                    A5 = "";
                }
                String A6 = tba.A(i11, awayTeam$default);
                String str8 = A6 != null ? A6 : "";
                Integer normaltime3 = Event.getHomeScore$default(event, null, 1, null).getNormaltime();
                Integer normaltime4 = Event.getAwayScore$default(event, null, 1, null).getNormaltime();
                int intValue2 = normaltime3 != null ? normaltime3.intValue() : 0;
                if (normaltime4 != null) {
                    i2 = 0;
                    i5 = normaltime4.intValue();
                } else {
                    i2 = 0;
                }
                Pair pair = intValue2 > i5 ? new Pair(A5, homeTeam$default.getGender()) : (normaltime3 != null ? normaltime3.intValue() : i2) < (normaltime4 != null ? normaltime4.intValue() : i2) ? new Pair(str8, awayTeam$default.getGender()) : new Pair(null, null);
                String str9 = (String) pair.a;
                Gender gender = (Gender) pair.b;
                xbb b = a.b();
                Integer firstSetWinnerProbability = predictions.getFirstSetWinnerProbability();
                if (firstSetWinnerProbability != null) {
                    int intValue3 = firstSetWinnerProbability.intValue();
                    i3 = 1;
                    Player firstSetWinner = predictions.getFirstSetWinner();
                    n9k n9kVar = new n9k(R.string.tennis_set_winner, firstSetWinner != null ? firstSetWinner.getGender() : null, l6g.K(yid.p(1)));
                    m9k m9kVar = new m9k(yid.r(intValue3));
                    Player firstSetWinner2 = predictions.getFirstSetWinner();
                    b.add(new qs5(n9kVar, m9kVar, firstSetWinner2 != null ? tba.C(firstSetWinner2) : null));
                } else {
                    i3 = 1;
                }
                Double firstSetGamesCount = predictions.getFirstSetGamesCount();
                if (firstSetGamesCount != null) {
                    b.add(new qs5(new q9k(R.string.tennis_number_of_games, l6g.K(yid.p(i3))), new m9k(String.valueOf(firstSetGamesCount.doubleValue())), null));
                    Unit unit4 = Unit.a;
                }
                b7 Z = l6g.Z(a.a(b));
                List<AiInsightsTennisPossibleResult> possibleFirstSetResults = predictions.getPossibleFirstSetResults();
                if (possibleFirstSetResults == null) {
                    possibleFirstSetResults = km5.a;
                }
                List<AiInsightsTennisPossibleResult> L0 = CollectionsKt.L0(possibleFirstSetResults, 3);
                ArrayList arrayList2 = new ArrayList(k13.r(L0, 10));
                for (AiInsightsTennisPossibleResult aiInsightsTennisPossibleResult : L0) {
                    int home2 = aiInsightsTennisPossibleResult.getHome();
                    int away2 = aiInsightsTennisPossibleResult.getAway();
                    double probability = aiInsightsTennisPossibleResult.getProbability();
                    int i12 = home2 > away2 ? i3 : i2;
                    String str10 = str9;
                    int[] iArr = {home2, away2};
                    EventTennisAiInsightsResponse eventTennisAiInsightsResponse2 = eventTennisAiInsightsResponse;
                    int i13 = iArr[i2];
                    String str11 = str8;
                    int i14 = iArr[i3];
                    if (i14 > i13) {
                        i13 = i14;
                    }
                    arrayList2.add(new rs5(new q9k(R.string.score_template, l6g.K(Integer.valueOf(i13), Integer.valueOf(Math.min(home2, away2)))), i12 != 0 ? homeTeam$default.getId() : awayTeam$default.getId(), i12 != 0 ? A5 : str11, (float) (probability * 100.0d)));
                    str9 = str10;
                    eventTennisAiInsightsResponse = eventTennisAiInsightsResponse2;
                    str8 = str11;
                }
                String str12 = str9;
                EventTennisAiInsightsResponse eventTennisAiInsightsResponse3 = eventTennisAiInsightsResponse;
                String str13 = str8;
                b7 Z2 = l6g.Z(arrayList2);
                xbb b2 = a.b();
                Integer secondSetWinnerProbability = predictions.getSecondSetWinnerProbability();
                if (secondSetWinnerProbability != null) {
                    int intValue4 = secondSetWinnerProbability.intValue();
                    Player secondSetWinner = predictions.getSecondSetWinner();
                    n9k n9kVar2 = new n9k(R.string.tennis_set_winner, secondSetWinner != null ? secondSetWinner.getGender() : null, l6g.K(yid.p(2)));
                    m9k m9kVar2 = new m9k(yid.r(intValue4));
                    Player secondSetWinner2 = predictions.getSecondSetWinner();
                    b2.add(new qs5(n9kVar2, m9kVar2, secondSetWinner2 != null ? tba.C(secondSetWinner2) : null));
                }
                Boolean homeWinsASet = predictions.getHomeWinsASet();
                int i15 = R.string.yes;
                if (homeWinsASet != null) {
                    b2.add(new qs5(new n9k(R.string.tennis_player_wins_set, homeTeam$default.getGender(), l6g.K(A5)), new q9k(homeWinsASet.booleanValue() ? R.string.yes : R.string.no), null));
                }
                Boolean awayWinsASet = predictions.getAwayWinsASet();
                if (awayWinsASet != null) {
                    boolean booleanValue2 = awayWinsASet.booleanValue();
                    n9k n9kVar3 = new n9k(R.string.tennis_player_wins_set, awayTeam$default.getGender(), l6g.K(str13));
                    if (!booleanValue2) {
                        i15 = R.string.no;
                    }
                    b2.add(new qs5(n9kVar3, new q9k(i15), null));
                }
                Integer homeTotalGames = predictions.getHomeTotalGames();
                if (homeTotalGames != null) {
                    b2.add(new qs5(new n9k(R.string.tennis_player_total_games_won, homeTeam$default.getGender(), l6g.K(A5)), new m9k(String.valueOf(homeTotalGames.intValue())), null));
                }
                Integer awayTotalGames = predictions.getAwayTotalGames();
                if (awayTotalGames != null) {
                    b2.add(new qs5(new n9k(R.string.tennis_player_total_games_won, awayTeam$default.getGender(), l6g.K(str13)), new m9k(String.valueOf(awayTotalGames.intValue())), null));
                }
                Double totalGamesCount = predictions.getTotalGamesCount();
                if (totalGamesCount != null) {
                    b2.add(new qs5(new q9k(R.string.tennis_total_number_of_games), new m9k(String.valueOf(totalGamesCount.doubleValue())), null));
                    Unit unit5 = Unit.a;
                }
                b7 Z3 = l6g.Z(a.a(b2));
                Integer phase = eventTennisAiInsightsResponse3.getPhase();
                int i16 = R.string.generated_before_match_start;
                if (phase != null && phase.intValue() == i3) {
                    if (ok3.D(event)) {
                        i16 = R.string.tennis_forecast_next_update;
                    }
                } else if (phase != null && phase.intValue() == 2) {
                    i16 = R.string.tennis_forecast_last_updated_during_match;
                }
                ps5 ps5Var = new ps5(new q9k(R.string.status_set, l6g.K(yid.p(1))), new q9k(i16), Z, Z2);
                if (Z.isEmpty() && Z2.isEmpty()) {
                    ps5Var = null;
                }
                ps5 ps5Var2 = new ps5(new q9k(R.string.other), new q9k(i16), Z3, rlh.b);
                if (Z3.isEmpty()) {
                    ps5Var2 = null;
                }
                b7 Z4 = l6g.Z(ph0.x(new ps5[]{ps5Var, ps5Var2}));
                Gender gender2 = homeTeam$default.getGender();
                Gender gender3 = awayTeam$default.getGender();
                List<AiInsightsTennisPossibleResult> possibleHomeResults = predictions.getPossibleHomeResults();
                if (possibleHomeResults == null) {
                    possibleHomeResults = km5.a;
                }
                List<AiInsightsTennisPossibleResult> possibleAwayResults = predictions.getPossibleAwayResults();
                if (possibleAwayResults == null) {
                    possibleAwayResults = km5.a;
                }
                ArrayList w0 = CollectionsKt.w0(possibleAwayResults, possibleHomeResults);
                int size = w0.size();
                ArrayList arrayList3 = new ArrayList(size);
                for (int i17 = i2; i17 < size; i17++) {
                    arrayList3.add(Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                }
                Iterator it2 = CollectionsKt.H0(b.h(w0), new ss5(w0, i2)).iterator();
                int i18 = 0;
                while (it2.hasNext()) {
                    Object next = it2.next();
                    int i19 = i18 + 1;
                    if (i18 < 0) {
                        b.q();
                        throw null;
                    }
                    int intValue5 = ((Number) next).intValue();
                    List list3 = ts5.a;
                    Iterator it3 = it2;
                    arrayList3.set(intValue5, (i18 < 0 || i18 >= list3.size()) ? Float.valueOf(((Number) CollectionsKt.h0(list3)).floatValue()) : list3.get(i18));
                    it2 = it3;
                    i18 = i19;
                }
                n9k n9kVar4 = new n9k(R.string.tennis_player_wins_match, gender2, l6g.K(A5));
                ArrayList arrayList4 = new ArrayList(k13.r(possibleHomeResults, 10));
                int i20 = 0;
                for (Iterator it4 = possibleHomeResults.iterator(); it4.hasNext(); it4 = it4) {
                    AiInsightsTennisPossibleResult aiInsightsTennisPossibleResult2 = (AiInsightsTennisPossibleResult) it4.next();
                    arrayList4.add(new js5(new q9k(R.string.score_template, l6g.K(Integer.valueOf(aiInsightsTennisPossibleResult2.getHome()), Integer.valueOf(aiInsightsTennisPossibleResult2.getAway()))), (float) (aiInsightsTennisPossibleResult2.getProbability() * 100.0d), ((Number) arrayList3.get(i20)).floatValue()));
                    i20++;
                    predictions = predictions;
                }
                AiInsightsTennisPredictions aiInsightsTennisPredictions = predictions;
                ks5 ks5Var = new ks5(n9kVar4, l6g.Z(arrayList4));
                n9k n9kVar5 = new n9k(R.string.tennis_player_wins_match, gender3, l6g.K(str13));
                ArrayList arrayList5 = new ArrayList(k13.r(possibleAwayResults, 10));
                Iterator it5 = possibleAwayResults.iterator();
                while (it5.hasNext()) {
                    AiInsightsTennisPossibleResult aiInsightsTennisPossibleResult3 = (AiInsightsTennisPossibleResult) it5.next();
                    arrayList5.add(new js5(new q9k(R.string.score_template, l6g.K(Integer.valueOf(aiInsightsTennisPossibleResult3.getHome()), Integer.valueOf(aiInsightsTennisPossibleResult3.getAway()))), (float) (aiInsightsTennisPossibleResult3.getProbability() * 100.0d), ((Number) arrayList3.get(i20)).floatValue()));
                    it5 = it5;
                    i20++;
                }
                b7 K = l6g.K(ks5Var, new ks5(n9kVar5, l6g.Z(arrayList5)));
                List<AiInsightsSections> sections = eventTennisAiInsightsResponse3.getSections();
                if (sections == null || (gv9Var2 = l6g.W(sections)) == null) {
                    gv9Var2 = rlh.b;
                }
                gv9 gv9Var3 = gv9Var2;
                AiInsightsTennisWinningProbability winningProbability2 = aiInsightsTennisPredictions.getWinningProbability();
                Integer home3 = winningProbability2 != null ? winningProbability2.getHome() : null;
                AiInsightsTennisWinningProbability winningProbability3 = aiInsightsTennisPredictions.getWinningProbability();
                Integer away3 = winningProbability3 != null ? winningProbability3.getAway() : null;
                return new lm(Z4, K, gv9Var3, (home3 == null || away3 == null) ? null : new or5(home3.intValue(), null, away3.intValue(), str12 != null ? new n9k(R.string.tennis_ai_forecast_correct_winner, gender, l6g.K(str12)) : null), homeTeam$default.getId(), awayTeam$default.getId(), Intrinsics.c(event.getCorrectAiInsight(), Boolean.TRUE));
            case 25:
                return b(obj);
            case 26:
                return c(obj);
            case 27:
                return d(obj);
            case 28:
                return e(obj);
            default:
                zw5 zw5Var = (zw5) this.b;
                Event event2 = (Event) this.c;
                ww5 ww5Var = (ww5) obj;
                ww5Var.getClass();
                e9b e9bVar = ww5Var.a;
                return ww5.a(ww5Var, e9b.a(e9bVar, e9bVar.c == TeamSelection.Second ? zw5Var.n : zw5Var.m, x21.t(event2), null, 4), false, 2);
        }
    }
}
