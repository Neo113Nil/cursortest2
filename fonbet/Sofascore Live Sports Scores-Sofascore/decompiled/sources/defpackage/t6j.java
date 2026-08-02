package defpackage;

import android.content.Context;
import com.inmobi.media.GestureDetectorOnGestureListenerC3889xi;
import com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.sofascore.model.mvvm.model.TvChannel;
import com.sofascore.model.newNetwork.statistics.season.team.TennisTeamSeasonStatistics;
import com.sofascore.results.player.PlayerActivity;
import com.sofascore.results.team.TeamActivity;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.cql;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class t6j implements Function2 {
    public final /* synthetic */ int a;

    public /* synthetic */ t6j(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                c73 c73Var = (c73) obj;
                c73Var.getClass();
                ((Context) obj2).getClass();
                TennisTeamSeasonStatistics o = tba.o(c73Var);
                if (o != null) {
                    return u6j.a(o);
                }
                return null;
            case 1:
                c73 c73Var2 = (c73) obj;
                c73Var2.getClass();
                ((Context) obj2).getClass();
                TennisTeamSeasonStatistics o2 = tba.o(c73Var2);
                if (o2 != null) {
                    return u6j.f(o2);
                }
                return null;
            case 2:
                c73 c73Var3 = (c73) obj;
                c73Var3.getClass();
                ((Context) obj2).getClass();
                TennisTeamSeasonStatistics o3 = tba.o(c73Var3);
                if (o3 != null) {
                    return u6j.e(o3);
                }
                return null;
            case 3:
                return Integer.valueOf(((g1c) obj).B(((Integer) obj2).intValue()));
            case 4:
                return Integer.valueOf(((g1c) obj).G(((Integer) obj2).intValue()));
            case 5:
                return Integer.valueOf(((g1c) obj).s(((Integer) obj2).intValue()));
            case 6:
                return Integer.valueOf(((g1c) obj).b(((Integer) obj2).intValue()));
            case 7:
                mbj mbjVar = (mbj) obj2;
                return b.j(Float.valueOf(mbjVar.a.h()), Boolean.valueOf(((ewd) ((eoh) mbjVar.f).getValue()) == ewd.a));
            case 8:
                lpg lpgVar = (lpg) obj;
                wcj wcjVar = (wcj) obj2;
                return b.e(yqg.a(wcjVar.a, yqg.a, lpgVar), yqg.a(new pej(wcjVar.b), yqg.p, lpgVar));
            case 9:
                CoroutineContext.Element element = (CoroutineContext.Element) obj2;
                if (!(element instanceof xfj)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int intValue = num != null ? num.intValue() : 1;
                return intValue == 0 ? element : Integer.valueOf(intValue + 1);
            case 10:
                xfj xfjVar = (xfj) obj;
                CoroutineContext.Element element2 = (CoroutineContext.Element) obj2;
                if (xfjVar != null) {
                    return xfjVar;
                }
                if (element2 instanceof xfj) {
                    return (xfj) element2;
                }
                return null;
            case 11:
                hgj hgjVar = (hgj) obj;
                CoroutineContext.Element element3 = (CoroutineContext.Element) obj2;
                if (element3 instanceof xfj) {
                    xfj xfjVar2 = (xfj) element3;
                    CoroutineContext coroutineContext = hgjVar.a;
                    Object M = xfjVar2.M();
                    Object[] objArr = hgjVar.b;
                    int i = hgjVar.d;
                    objArr[i] = M;
                    xfj[] xfjVarArr = hgjVar.c;
                    hgjVar.d = i + 1;
                    xfjVarArr[i] = xfjVar2;
                }
                return hgjVar;
            case 12:
                return Boolean.valueOf(TimeoutConfigurations.a((JSONObject) obj, ((Integer) obj2).intValue()));
            case 13:
                ((Integer) obj).getClass();
                c71 c71Var = (c71) obj2;
                c71Var.getClass();
                if (c71Var instanceof vnj) {
                    unj unjVar = ((vnj) c71Var).a;
                    return unjVar.a + " " + unjVar.e.a;
                }
                if (!(c71Var instanceof tnj)) {
                    if (!(c71Var instanceof aoj)) {
                        zzl.b();
                        return null;
                    }
                    aoj aojVar = (aoj) c71Var;
                    return aojVar.a.a + " " + aojVar.b.a;
                }
                tnj tnjVar = (tnj) c71Var;
                unj unjVar2 = tnjVar.a;
                return unjVar2.a + " " + unjVar2.e.a + " " + tnjVar.b.a;
            case 14:
                Context context = (Context) obj;
                int intValue2 = ((Integer) obj2).intValue();
                context.getClass();
                int i2 = TeamActivity.Z;
                jle.r(context, intValue2, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                return Unit.a;
            case 15:
                Context context2 = (Context) obj;
                int intValue3 = ((Integer) obj2).intValue();
                context2.getClass();
                int i3 = PlayerActivity.Z;
                jle.q(context2, intValue3, 0, null, null, false, null, null, IronSourceError.ERROR_CODE_INIT_FAILED);
                return Unit.a;
            case 16:
                Context context3 = (Context) obj;
                int intValue4 = ((Integer) obj2).intValue();
                context3.getClass();
                int i4 = PlayerActivity.Z;
                jle.q(context3, intValue4, 0, null, null, false, null, null, IronSourceError.ERROR_CODE_INIT_FAILED);
                return Unit.a;
            case 17:
                Context context4 = (Context) obj;
                int intValue5 = ((Integer) obj2).intValue();
                context4.getClass();
                int i5 = TeamActivity.Z;
                jle.r(context4, intValue5, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                return Unit.a;
            case 18:
                ((Integer) obj2).getClass();
                o6a.h(aba.K(1), (of3) obj);
                return Unit.a;
            case 19:
                return Integer.valueOf(new cp().b(((TvChannel) obj).getName(), ((TvChannel) obj2).getName()));
            case 20:
                TvChannel tvChannel = (TvChannel) obj;
                TvChannel tvChannel2 = (TvChannel) obj2;
                int compareTo = tvChannel.getCountryCode().compareTo(tvChannel2.getCountryCode());
                if (compareTo == 0) {
                    compareTo = new cp().b(tvChannel.getName(), tvChannel2.getName());
                }
                return Integer.valueOf(compareTo);
            case 21:
                ((wma) obj).E = true;
                Unit unit = Unit.a;
                return Unit.a;
            case 22:
                ((Integer) obj2).getClass();
                z1a.f(aba.K(7), (of3) obj);
                return Unit.a;
            case 23:
                ((Integer) obj2).getClass();
                v7a.f(aba.K(1), (of3) obj);
                return Unit.a;
            case 24:
                ((Integer) obj).intValue();
                uv3 uv3Var = (uv3) obj2;
                uv3Var.getClass();
                return uv3Var.b;
            case 25:
                cql.a aVar = (cql.a) obj;
                cql.a aVar2 = (cql.a) obj2;
                if (!(aVar instanceof cql.a.c) || !(aVar2 instanceof cql.a.c)) {
                    if ((aVar instanceof cql.a.C1350a) && (aVar2 instanceof cql.a.C1350a)) {
                        r0 = Intrinsics.c(((cql.a.C1350a) aVar).a, ((cql.a.C1350a) aVar2).a);
                    } else if (aVar.getClass() == aVar2.getClass()) {
                        r0 = true;
                    }
                }
                return Boolean.valueOf(r0);
            default:
                return GestureDetectorOnGestureListenerC3889xi.a((String) obj, (Map) obj2);
        }
    }

    public /* synthetic */ t6j(int i, int i2) {
        this.a = i2;
    }
}
