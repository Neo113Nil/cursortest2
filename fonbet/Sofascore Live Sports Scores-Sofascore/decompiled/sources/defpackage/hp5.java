package defpackage;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.sofascore.model.FirebaseBundle;
import com.sofascore.model.newNetwork.NewsProvider;
import com.sofascore.results.base.BaseActivity;
import com.sofascore.results.fantasy.ui.model.FantasyRoundPlayerUiModel;
import com.sofascore.results.feed.FeedFragment;
import com.sofascore.results.league.fragment.details.compose.goat.LeagueGoatVoteBottomSheet;
import com.sofascore.results.player.PlayerActivity;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class hp5 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ hp5(int i, String str, ip5 ip5Var) {
        this.a = 0;
        this.b = i;
        this.c = str;
        this.d = ip5Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String str;
        int i = this.a;
        rq3 rq3Var = null;
        int i2 = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                String str2 = (String) obj2;
                ip5 ip5Var = (ip5) obj;
                SerialDescriptor[] serialDescriptorArr = new SerialDescriptor[i2];
                for (int i3 = 0; i3 < i2; i3++) {
                    serialDescriptorArr[i3] = aik.x(str2 + '.' + ip5Var.e[i3], nii.i, new SerialDescriptor[0]);
                }
                return serialDescriptorArr;
            case 1:
                Context context = (Context) obj2;
                e1d e1dVar = (e1d) obj;
                e1dVar.setValue(Boolean.valueOf(!((Boolean) e1dVar.getValue()).booleanValue()));
                if (((Boolean) e1dVar.getValue()).booleanValue()) {
                    hkg.r(i2, context);
                    FragmentActivity K = hkg.K(context);
                    if (K != null) {
                        BaseActivity baseActivity = K instanceof BaseActivity ? (BaseActivity) K : null;
                        if (baseActivity != null) {
                            p4h.t(baseActivity, false, null, null, 60);
                        }
                    }
                } else {
                    hkg.p0(i2, context);
                }
                return Unit.a;
            case 2:
                Context context2 = (Context) obj2;
                nv.A(context2, "open_player", null);
                int i4 = PlayerActivity.Z;
                jle.q(context2, ((FantasyRoundPlayerUiModel) obj).g.b, 0, null, null, false, Integer.valueOf(i2), null, 444);
                return Unit.a;
            case 3:
                nv.A((Context) obj2, "notifications_onboarding", "later");
                ((Function1) obj).invoke(Integer.valueOf(i2));
                return Unit.a;
            case 4:
                my7 C = ((FeedFragment) obj2).C();
                xw3.L(un0.z(C), null, null, new qu1(C, i2, rq3Var, 13), 3);
                ((l94) obj).b(3);
                return Unit.a;
            case 5:
                zg9 zg9Var = (zg9) obj2;
                try {
                    zg9Var.x.k(i2, (tp5) obj);
                } catch (IOException e) {
                    tp5 tp5Var = tp5.PROTOCOL_ERROR;
                    zg9Var.e(tp5Var, tp5Var, e);
                }
                return Unit.a;
            case 6:
                LeagueGoatVoteBottomSheet leagueGoatVoteBottomSheet = (LeagueGoatVoteBottomSheet) obj;
                lv lvVar = lv.LEAGUE_DETAILS;
                int i5 = this.b;
                nv.H(i5, lvVar, (Context) obj2, "nba_goat");
                kva kvaVar = (kva) leagueGoatVoteBottomSheet.x.getValue();
                int intValue = ((Number) leagueGoatVoteBottomSheet.y.getValue()).intValue();
                iz2 z = un0.z(kvaVar);
                hs4 hs4Var = z45.a;
                xw3.L(z, hq4.c, null, new gva(intValue, i5, 8, null, kvaVar), 2);
                leagueGoatVoteBottomSheet.j();
                return Unit.a;
            case 7:
                Context context3 = ((geb) obj).getContext();
                context3.getClass();
                FirebaseBundle firebaseBundle = new FirebaseBundle();
                firebaseBundle.putInt("id", i2);
                firebaseBundle.putString("name", "live_match_tracker");
                firebaseBundle.putString(IronSourceConstants.EVENTS_PROVIDER, (String) obj2);
                nv.N(context3, firebaseBundle, "tracker_impression");
                nv.M(context3, firebaseBundle, "tracker_impression");
                return Unit.a;
            case 8:
                Function2 function2 = (Function2) obj2;
                NewsProvider newsProvider = (NewsProvider) obj;
                Integer valueOf = Integer.valueOf(i2);
                if (newsProvider == null || (str = newsProvider.getName()) == null) {
                    str = "";
                }
                function2.invoke(valueOf, str);
                return Unit.a;
            case 9:
                z02 z02Var = (z02) obj2;
                y93 y93Var = (y93) obj;
                ct8 ct8Var = (ct8) z02Var.f;
                if (ct8Var != null) {
                    ct8Var.invoke(((esk) z02Var.d).a, Integer.valueOf(i2), y93Var);
                }
                return Unit.a;
            case 10:
                cdi cdiVar = (cdi) obj2;
                int floatValue = (int) ((Number) cdiVar.getValue()).floatValue();
                int i6 = (floatValue + 1) % i2;
                return new b0l((zdl) ((gv9) obj).get(i6), floatValue, i6, cdiVar);
            default:
                ((g9m) obj2).d(i2);
                ((fsf) obj).a = null;
                return Unit.a;
        }
    }

    public /* synthetic */ hp5(geb gebVar, int i, String str) {
        this.a = 7;
        this.d = gebVar;
        this.b = i;
        this.c = str;
    }

    public /* synthetic */ hp5(Context context, int i, int i2, Object obj) {
        this.a = i2;
        this.c = context;
        this.d = obj;
        this.b = i;
    }

    public /* synthetic */ hp5(Object obj, int i, Object obj2, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
        this.d = obj2;
    }
}
