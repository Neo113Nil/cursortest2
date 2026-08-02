package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import android.content.res.Resources;
import com.ironsource.C4427z5;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.EventType;
import com.sofascore.model.mvvm.model.ManagerHeadFlags;
import com.sofascore.model.newNetwork.mediaposts.MediaType;
import com.sofascore.model.newNetwork.topperformance.response.VolleyballTopPlayersStatistics;
import com.sofascore.model.newNetwork.topperformance.topPlayers.items.VolleyballTopPlayersStatisticsItem;
import com.sofascore.results.main.MainActivity;
import com.vungle.ads.internal.protos.Sdk;
import java.util.HashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class abb implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ abb(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        HashSet<EventType> typeListNotifications;
        boolean z = true;
        switch (this.a) {
            case 0:
                VolleyballTopPlayersStatistics volleyballTopPlayersStatistics = (VolleyballTopPlayersStatistics) obj;
                volleyballTopPlayersStatistics.getClass();
                return volleyballTopPlayersStatistics.getReceptionErrors();
            case 1:
                VolleyballTopPlayersStatisticsItem volleyballTopPlayersStatisticsItem = (VolleyballTopPlayersStatisticsItem) obj;
                volleyballTopPlayersStatisticsItem.getClass();
                return yid.j(volleyballTopPlayersStatisticsItem.getReceptionErrors());
            case 2:
                VolleyballTopPlayersStatistics volleyballTopPlayersStatistics2 = (VolleyballTopPlayersStatistics) obj;
                volleyballTopPlayersStatistics2.getClass();
                return volleyballTopPlayersStatistics2.getAttacksBlocked();
            case 3:
                ibb ibbVar = (ibb) obj;
                ibbVar.getClass();
                y6a y6aVar = ibbVar.h;
                if (y6aVar instanceof ibb) {
                    return (ibb) y6aVar;
                }
                return null;
            case 4:
                ibb ibbVar2 = (ibb) obj;
                ibbVar2.getClass();
                StringBuilder sb = new StringBuilder();
                sb.append(ibbVar2.f);
                sb.append(C4427z5.U);
                sb.append(ibbVar2.g);
                return sb.toString();
            case 5:
                Event event = (Event) obj;
                event.getClass();
                HashSet<EventType> typeList = event.getTypeList();
                if (typeList != null && !typeList.isEmpty()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 6:
                Event event2 = (Event) obj;
                event2.getClass();
                HashSet<EventType> typeList2 = event2.getTypeList();
                if (!Intrinsics.c(typeList2 != null ? Boolean.valueOf(typeList2.contains(EventType.MUTED)) : null, Boolean.TRUE) && (typeListNotifications = event2.getTypeListNotifications()) != null && !typeListNotifications.isEmpty()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 7:
                Event event3 = (Event) obj;
                event3.getClass();
                HashSet<EventType> typeList3 = event3.getTypeList();
                return Boolean.valueOf(!(typeList3 == null || typeList3.isEmpty()));
            case 8:
                aee aeeVar = (aee) obj;
                ff5 ff5Var = nz.b;
                aeeVar.getClass();
                Context context = (Context) ktm.I(aeeVar, ff5Var);
                while (true) {
                    if (context instanceof ContextWrapper) {
                        if (context instanceof Activity) {
                            r5 = context;
                        } else {
                            context = ((ContextWrapper) context).getBaseContext();
                        }
                    }
                }
                return (Activity) r5;
            case 9:
                bk4 bk4Var = (bk4) obj;
                bk4Var.getClass();
                v9g.x(bk4Var, 't');
                return Unit.a;
            case 10:
                bk4 bk4Var2 = (bk4) obj;
                bk4Var2.getClass();
                v9g.x(bk4Var2, 'T');
                return Unit.a;
            case 11:
                ck4 ck4Var = (ck4) obj;
                ck4Var.getClass();
                v9g.x(ck4Var, '.');
                ((w8) ck4Var).c(new xn1(new pn8()));
                return Unit.a;
            case 12:
                ((ck4) obj).getClass();
                return Unit.a;
            case 13:
                ck4 ck4Var2 = (ck4) obj;
                ck4Var2.getClass();
                v9g.x(ck4Var2, ':');
                ck4.g(ck4Var2);
                v9g.I(ck4Var2, "", new abb(11));
                return Unit.a;
            case 14:
                vnb vnbVar = (vnb) obj;
                vnbVar.getClass();
                return vnbVar.getClass().getName();
            case 15:
                ((Long) obj).getClass();
                return Unit.a;
            case 16:
                boolean z2 = MainActivity.n0;
                ((Resources) obj).getClass();
                return Boolean.TRUE;
            case 17:
                tpb tpbVar = (tpb) obj;
                tpbVar.getClass();
                return tpbVar.getClass().getName();
            case 18:
                ((ManagerHeadFlags) obj).getClass();
                return Boolean.TRUE;
            case 19:
                ((ManagerHeadFlags) obj).getClass();
                return Boolean.TRUE;
            case 20:
                f4g f4gVar = (f4g) obj;
                f4gVar.getClass();
                f4gVar.e(1);
                return Unit.a;
            case 21:
                yma ymaVar = (yma) obj;
                ymaVar.getClass();
                ymaVar.a();
                fkf.D(ymaVar, ia5.a, 2.0f);
                fkf.D(ymaVar, ia5.c, 2.0f);
                return Unit.a;
            case 22:
                SharedPreferences.Editor editor = (SharedPreferences.Editor) obj;
                editor.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                wd5 wd5Var = xd5.b;
                editor.putLong("PREF_MATCH_OF_THE_WEEK_MUTED_UNTIL", xd5.e(wkn.R(7, be5.DAYS)) + currentTimeMillis);
                return Unit.a;
            case 23:
                fwb fwbVar = (fwb) obj;
                fwbVar.getClass();
                return duf.a.getOrCreateKotlinClass(fwbVar.getClass());
            case 24:
                ((r60) obj).getClass();
                pp3 l0 = l98.l0(uo5.e(s02.h0(Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, 0, null, 6), 2).a(uo5.g(s02.h0(Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, 0, null, 6), 0.92f, 4)), uo5.f(s02.h0(120, 0, null, 6), 2));
                l0.d = l98.G(2);
                return l0;
            case 25:
                fwb fwbVar2 = (fwb) obj;
                fwbVar2.getClass();
                return duf.a.getOrCreateKotlinClass(fwbVar2.getClass());
            case 26:
                ((r60) obj).getClass();
                pp3 l02 = l98.l0(uo5.e(s02.h0(Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, 0, null, 6), 2), uo5.f(s02.h0(120, 0, null, 6), 2));
                l02.d = l98.G(2);
                return l02;
            case 27:
                return ((MediaType) obj).getRequestType();
            case 28:
                return ((MediaType) obj).getRequestType();
            default:
                vnb vnbVar2 = (vnb) obj;
                vnbVar2.getClass();
                return vnbVar2.getClass().getName();
        }
    }
}
