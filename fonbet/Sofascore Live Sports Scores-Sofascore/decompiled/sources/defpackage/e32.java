package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import com.sofascore.local_persistance.Brand;
import com.sofascore.model.branding.BrandLocation;
import com.sofascore.model.branding.BrandType;
import com.sofascore.model.firebase.AdType;
import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.model.profile.InvitedUser;
import com.sofascore.results.event.aiInsights.ui.EventAiInsightsResultProbabilityModal;
import com.sofascore.results.league.fragment.details.compose.LeaguePlayerUpdatesBottomSheet;
import com.sofascore.results.profile.predictions.ProfilePredictionsFragment;
import com.sofascore.results.weeklyChallenge.predictions.WeeklyPredictionsFragment;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class e32 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public e32(boh bohVar, Context context, Integer num, gv9 gv9Var) {
        this.a = 4;
        this.e = bohVar;
        this.c = context;
        this.b = num;
        this.d = gv9Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object obj;
        SharedPreferences d;
        int i = 3;
        rq3 rq3Var = null;
        switch (this.a) {
            case 0:
                Context context = ((f32) this.e).getContext();
                context.getClass();
                nv.q(context, (Integer) this.b, (BrandLocation) this.c, (String) this.d, BrandType.BANNER);
                return Unit.a;
            case 1:
                Context context2 = ((f32) this.e).getContext();
                context2.getClass();
                nv.q(context2, (Integer) this.b, (BrandLocation) this.c, (String) this.d, BrandType.BANNER);
                return Unit.a;
            case 2:
                long currentTimeMillis = System.currentTimeMillis();
                boh bohVar = (boh) this.e;
                if (currentTimeMillis - bohVar.h() >= 200) {
                    bohVar.i(currentTimeMillis);
                    Context context3 = (Context) this.b;
                    String str = (String) this.d;
                    String str2 = (String) this.c;
                    EventAiInsightsResultProbabilityModal eventAiInsightsResultProbabilityModal = new EventAiInsightsResultProbabilityModal();
                    eventAiInsightsResultProbabilityModal.setArguments(fz8.C(fz8.H("FIRST_TEAM_NAME", str), fz8.H("SECOND_TEAM_NAME", str2)));
                    context3.getClass();
                    if (context3 instanceof csk) {
                        context3 = ((csk) context3).getBaseContext();
                    }
                    AppCompatActivity appCompatActivity = context3 instanceof AppCompatActivity ? (AppCompatActivity) context3 : null;
                    if (appCompatActivity != null) {
                        wca.x(appCompatActivity.getLifecycle()).b(new r1(eventAiInsightsResultProbabilityModal, appCompatActivity, rq3Var, i));
                    }
                }
                return Unit.a;
            case 3:
                long currentTimeMillis2 = System.currentTimeMillis();
                boh bohVar2 = (boh) this.e;
                if (currentTimeMillis2 - bohVar2.h() >= 200) {
                    bohVar2.i(currentTimeMillis2);
                    ((Function0) this.b).invoke();
                    ((Function1) this.c).invoke((InvitedUser) this.d);
                }
                return Unit.a;
            case 4:
                long currentTimeMillis3 = System.currentTimeMillis();
                boh bohVar3 = (boh) this.e;
                if (currentTimeMillis3 - bohVar3.h() >= 200) {
                    bohVar3.i(currentTimeMillis3);
                    Context context4 = (Context) this.c;
                    Integer num = (Integer) this.b;
                    Iterator<E> it = ((gv9) this.d).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (((lxe) obj).d != null) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    lxe lxeVar = (lxe) obj;
                    Gender gender = lxeVar != null ? lxeVar.d : null;
                    LeaguePlayerUpdatesBottomSheet leaguePlayerUpdatesBottomSheet = new LeaguePlayerUpdatesBottomSheet();
                    leaguePlayerUpdatesBottomSheet.setArguments(fz8.C(fz8.G("UNIQUE_TOURNAMENT_ID", num), fz8.G("PLAYER_GENDER", gender)));
                    context4.getClass();
                    if (context4 instanceof csk) {
                        context4 = ((csk) context4).getBaseContext();
                    }
                    AppCompatActivity appCompatActivity2 = context4 instanceof AppCompatActivity ? (AppCompatActivity) context4 : null;
                    if (appCompatActivity2 != null) {
                        wca.x(appCompatActivity2.getLifecycle()).b(new r1(leaguePlayerUpdatesBottomSheet, appCompatActivity2, rq3Var, i));
                    }
                }
                return Unit.a;
            case 5:
                Context context5 = (Context) this.b;
                Brand brand = (Brand) this.d;
                long currentTimeMillis4 = System.currentTimeMillis();
                boh bohVar4 = (boh) this.e;
                if (currentTimeMillis4 - bohVar4.h() >= 200) {
                    bohVar4.i(currentTimeMillis4);
                    nv.o(context5, Integer.valueOf(((mwb) this.c).a), BrandLocation.MatchOfTheWeek, brand.getSlug(), BrandType.BANNER);
                    bea.G(context5, brand.getUrl());
                }
                return Unit.a;
            case 6:
                u4g D = ((ProfilePredictionsFragment) this.e).D();
                Object obj2 = ((v2g) ((x2g) this.b)).a;
                D.n((ksh) obj2, AdType.RewardedInterstitial.ProfileWhoWillWin, new raf(0, (WeakReference) this.d));
                FragmentActivity fragmentActivity = (FragmentActivity) ((WeakReference) this.c).get();
                if (fragmentActivity != null) {
                    ((g19) ((ksh) obj2)).a(fragmentActivity);
                }
                return Unit.a;
            case 7:
                long currentTimeMillis5 = System.currentTimeMillis();
                boh bohVar5 = (boh) this.e;
                if (currentTimeMillis5 - bohVar5.h() >= 200) {
                    bohVar5.i(currentTimeMillis5);
                    ((Function2) this.b).invoke((Context) this.c, Integer.valueOf(((aoj) this.d).a.a));
                }
                return Unit.a;
            case 8:
                long currentTimeMillis6 = System.currentTimeMillis();
                if (currentTimeMillis6 - ((boh) this.e).h() >= 200) {
                    ((boh) this.e).i(currentTimeMillis6);
                    ((e1d) this.c).setValue(Boolean.FALSE);
                    Context context6 = (Context) this.b;
                    String str3 = (String) this.d;
                    context6.getClass();
                    SharedPreferences sharedPreferences = uic.j;
                    if (sharedPreferences == null) {
                        Context applicationContext = context6.getApplicationContext();
                        synchronized (uic.i) {
                            d = a5f.d(applicationContext);
                            uic.j = d;
                        }
                        d.getClass();
                        sharedPreferences = d;
                    }
                    SharedPreferences.Editor i2 = dmi.i(sharedPreferences, str3, false);
                    Unit unit = Unit.a;
                    i2.apply();
                }
                return Unit.a;
            default:
                u4g D2 = ((WeeklyPredictionsFragment) this.e).D();
                Object obj3 = ((v2g) ((x2g) this.b)).a;
                D2.n((ksh) obj3, AdType.RewardedInterstitial.ProfileWhoWillWin, new raf(1, (WeakReference) this.d));
                FragmentActivity fragmentActivity2 = (FragmentActivity) ((WeakReference) this.c).get();
                if (fragmentActivity2 != null) {
                    ((g19) ((ksh) obj3)).a(fragmentActivity2);
                }
                return Unit.a;
        }
    }

    public e32(boh bohVar, Context context, String str, String str2) {
        this.a = 2;
        this.e = bohVar;
        this.b = context;
        this.d = str;
        this.c = str2;
    }

    public /* synthetic */ e32(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.e = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
    }
}
