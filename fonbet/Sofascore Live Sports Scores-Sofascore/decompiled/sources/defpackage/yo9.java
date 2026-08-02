package defpackage;

import android.content.Context;
import android.os.Process;
import com.sofascore.model.mvvm.model.Point2D;
import com.sofascore.model.newNetwork.SeasonShotAction;
import com.sofascore.model.newNetwork.statistics.season.player.IceHockeyPlayerSeasonStatistics;
import com.sofascore.results.player.statistics.regular.view.PlayerPenaltyShotView;
import com.sofascore.results.view.graph.networkanimation.PassingNetworkAnimationView;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.serialization.json.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class yo9 implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ yo9(jda jdaVar) {
        this.a = 19;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                IceHockeyPlayerSeasonStatistics iceHockeyPlayerSeasonStatistics = (IceHockeyPlayerSeasonStatistics) obj;
                iceHockeyPlayerSeasonStatistics.getClass();
                return o02.y0(iceHockeyPlayerSeasonStatistics.getWins());
            case 1:
                IceHockeyPlayerSeasonStatistics iceHockeyPlayerSeasonStatistics2 = (IceHockeyPlayerSeasonStatistics) obj;
                iceHockeyPlayerSeasonStatistics2.getClass();
                return Integer.valueOf(yid.m(iceHockeyPlayerSeasonStatistics2.getWins()));
            case 2:
                SeasonShotAction seasonShotAction = (SeasonShotAction) obj;
                seasonShotAction.getClass();
                return Boolean.valueOf(seasonShotAction.getMade() > 0);
            case 3:
                SeasonShotAction seasonShotAction2 = (SeasonShotAction) obj;
                seasonShotAction2.getClass();
                return Boolean.valueOf(seasonShotAction2.getMissed() > 0);
            case 4:
                SeasonShotAction seasonShotAction3 = (SeasonShotAction) obj;
                seasonShotAction3.getClass();
                return new Point2D(seasonShotAction3.getX(), seasonShotAction3.getY());
            case 5:
                ((Boolean) obj).getClass();
                return Unit.a;
            case 6:
                yma ymaVar = (yma) obj;
                ymaVar.getClass();
                ymaVar.a();
                ha5.g0(ymaVar, wxf.D(new Pair[]{new Pair(Float.valueOf(0.4f), new r13(r13.h)), new Pair(Float.valueOf(1.0f), new r13(r13.b))}, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Float.POSITIVE_INFINITY), 0L, ymaVar.a.n(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE);
                return Unit.a;
            case 7:
                yma ymaVar2 = (yma) obj;
                ymaVar2.getClass();
                ymaVar2.a();
                ha5.o0(ymaVar2, r13.c(r13.b, 0.25f), 0L, ymaVar2.a.n(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE);
                return Unit.a;
            case 8:
                yma ymaVar3 = (yma) obj;
                ymaVar3.getClass();
                ymaVar3.a();
                ha5.g0(ymaVar3, wxf.D(new Pair[]{new Pair(Float.valueOf(0.6f), new r13(r13.h)), new Pair(Float.valueOf(1.0f), new r13(r13.b))}, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Float.POSITIVE_INFINITY), 0L, ymaVar3.a.n(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE);
                return Unit.a;
            case 9:
                return Unit.a;
            case 10:
                ((l9j) obj).e(null);
                return Unit.a;
            case 11:
                PassingNetworkAnimationView passingNetworkAnimationView = (PassingNetworkAnimationView) obj;
                passingNetworkAnimationView.getClass();
                passingNetworkAnimationView.f();
                return Unit.a;
            case 12:
                Context context = (Context) obj;
                context.getClass();
                PlayerPenaltyShotView playerPenaltyShotView = new PlayerPenaltyShotView(context, null, 6);
                playerPenaltyShotView.setDrawBackground(false);
                playerPenaltyShotView.setUseRoundedCorners(false);
                playerPenaltyShotView.setSelectionEnabled(false);
                return playerPenaltyShotView;
            case 13:
                return Boolean.valueOf(((Character) obj).charValue() == '-');
            case 14:
                return Boolean.valueOf(((Character) obj).charValue() == '-');
            case 15:
                char charValue = ((Character) obj).charValue();
                if (charValue != 'T' && charValue != 't') {
                    r6 = false;
                }
                return Boolean.valueOf(r6);
            case 16:
                return Boolean.valueOf(((Character) obj).charValue() == ':');
            case 17:
                return Boolean.valueOf(((Character) obj).charValue() == ':');
            case 18:
                char charValue2 = ((Character) obj).charValue();
                return Boolean.valueOf('0' <= charValue2 && charValue2 < ':');
            case 19:
                ((uu3) obj).getClass();
                duf.a.getOrCreateKotlinClass(jda.class).getSimpleName();
                Process.myPid();
                return new p0d(r6);
            case 20:
                vv2 vv2Var = (vv2) obj;
                vv2Var.getClass();
                tfa tfaVar = new tfa(new us9(24));
                km5 km5Var = km5.a;
                vv2Var.a("JsonPrimitive", tfaVar, km5Var, false);
                vv2Var.a("JsonNull", new tfa(new us9(25)), km5Var, false);
                vv2Var.a("JsonLiteral", new tfa(new us9(26)), km5Var, false);
                vv2Var.a("JsonObject", new tfa(new us9(27)), km5Var, false);
                vv2Var.a("JsonArray", new tfa(new us9(28)), km5Var, false);
                return Unit.a;
            case 21:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                String str = (String) entry.getKey();
                b bVar = (b) entry.getValue();
                StringBuilder sb = new StringBuilder();
                thi.a(str, sb);
                sb.append(':');
                sb.append(bVar);
                return sb.toString();
            case 22:
                efa efaVar = (efa) obj;
                efaVar.getClass();
                efaVar.c = true;
                efaVar.a = true;
                efaVar.b = false;
                efaVar.g = true;
                efaVar.j = true;
                efaVar.d = true;
                return Unit.a;
            case 23:
                bfc bfcVar = (bfc) obj;
                bfcVar.getClass();
                return bfcVar.a;
            case 24:
                return Unit.a;
            case 25:
                List list = (List) obj;
                return new qpa(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
            case 26:
                ((Integer) obj).getClass();
                return km5.a;
            case 27:
                ((Integer) obj).getClass();
                return -1;
            case 28:
                return Unit.a;
            default:
                List list2 = (List) obj;
                return new ksa(((Number) list2.get(0)).intValue(), ((Number) list2.get(1)).intValue());
        }
    }

    public /* synthetic */ yo9(int i) {
        this.a = i;
    }
}
