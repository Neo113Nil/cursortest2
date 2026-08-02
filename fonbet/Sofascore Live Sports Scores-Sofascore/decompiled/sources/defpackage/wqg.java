package defpackage;

import android.content.Context;
import com.sofascore.model.newNetwork.StageStandingsItem;
import com.sofascore.results.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class wqg implements Function2 {
    public final /* synthetic */ int a;

    public /* synthetic */ wqg(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String valueOf;
        switch (this.a) {
            case 0:
                return ((mek) obj2).a;
            case 1:
                lpg lpgVar = (lpg) obj;
                pwh pwhVar = (pwh) obj2;
                r13 r13Var = new r13(pwhVar.a.b());
                xqg xqgVar = yqg.r;
                Object a = yqg.a(r13Var, xqgVar, lpgVar);
                lfj lfjVar = new lfj(pwhVar.b);
                xqg xqgVar2 = yqg.x;
                Object a2 = yqg.a(lfjVar, xqgVar2, lpgVar);
                wg8 wg8Var = pwhVar.c;
                wg8 wg8Var2 = wg8.b;
                Object a3 = yqg.a(wg8Var, yqg.n, lpgVar);
                Object a4 = yqg.a(pwhVar.d, yqg.v, lpgVar);
                Object a5 = yqg.a(pwhVar.e, yqg.w, lpgVar);
                String str = pwhVar.g;
                Object a6 = yqg.a(new lfj(pwhVar.h), xqgVar2, lpgVar);
                Object a7 = yqg.a(pwhVar.i, yqg.o, lpgVar);
                Object a8 = yqg.a(pwhVar.j, yqg.l, lpgVar);
                eib eibVar = pwhVar.k;
                eib eibVar2 = eib.c;
                Object a9 = yqg.a(eibVar, yqg.A, lpgVar);
                Object a10 = yqg.a(new r13(pwhVar.l), xqgVar, lpgVar);
                Object a11 = yqg.a(pwhVar.m, yqg.k, lpgVar);
                qah qahVar = pwhVar.n;
                qah qahVar2 = qah.d;
                return b.e(a, a2, a3, a4, a5, -1, str, a6, a7, a8, a9, a10, a11, yqg.a(qahVar, yqg.q, lpgVar));
            case 2:
                lpg lpgVar2 = (lpg) obj;
                iej iejVar = (iej) obj2;
                pwh pwhVar2 = iejVar.a;
                y3g y3gVar = yqg.i;
                return b.e(yqg.a(pwhVar2, y3gVar, lpgVar2), yqg.a(iejVar.b, y3gVar, lpgVar2), yqg.a(iejVar.c, y3gVar, lpgVar2), yqg.a(iejVar.d, y3gVar, lpgVar2));
            case 3:
                aje ajeVar = (aje) obj2;
                Boolean valueOf2 = Boolean.valueOf(ajeVar.a);
                y3g y3gVar2 = yqg.a;
                return b.e(valueOf2, yqg.a(new rl5(ajeVar.b), fcp.f, (lpg) obj));
            case 4:
                return Integer.valueOf(((rl5) obj2).a);
            case 5:
                return Integer.valueOf(((l7b) obj2).a);
            case 6:
                lej lejVar = (lej) obj2;
                return b.e(yqg.a(new kej(lejVar.a), fcp.i, (lpg) obj), Boolean.valueOf(lejVar.b));
            case 7:
                return Integer.valueOf(((kej) obj2).a);
            case 8:
                return Integer.valueOf(((qug) obj2).a.h());
            case 9:
                KClass kClass = (KClass) obj;
                List list = (List) obj2;
                kClass.getClass();
                list.getClass();
                ArrayList V = sha.V(h6h.a, list, true);
                V.getClass();
                return sha.J(kClass, V, new el2(list, 5));
            case 10:
                KClass kClass2 = (KClass) obj;
                List list2 = (List) obj2;
                kClass2.getClass();
                list2.getClass();
                ArrayList V2 = sha.V(h6h.a, list2, true);
                V2.getClass();
                KSerializer J = sha.J(kClass2, V2, new el2(list2, 6));
                if (J != null) {
                    return l98.W(J);
                }
                return null;
            case 11:
                return (efh) ((eoh) ((e1d) ((dfh) obj2).d.c)).getValue();
            case 12:
                ((Integer) obj2).getClass();
                fz8.u(aba.K(1), (of3) obj);
                return Unit.a;
            case 13:
                ((Integer) obj2).getClass();
                fz8.u(aba.K(1), (of3) obj);
                return Unit.a;
            case 14:
                ((Integer) obj).getClass();
                hzh hzhVar = (hzh) obj2;
                hzhVar.getClass();
                return hzhVar.a.getSportSlug();
            case 15:
                ((Integer) obj).getClass();
                hzh hzhVar2 = (hzh) obj2;
                hzhVar2.getClass();
                return hzhVar2.a.getSportSlug();
            case 16:
                l3i l3iVar = (l3i) obj2;
                Integer youngRiderPosition = ((l3i) obj).a.getYoungRiderPosition();
                int intValue = youngRiderPosition != null ? youngRiderPosition.intValue() : 0;
                Integer youngRiderPosition2 = l3iVar.a.getYoungRiderPosition();
                return Integer.valueOf(Intrinsics.d(intValue, youngRiderPosition2 != null ? youngRiderPosition2.intValue() : 0));
            case 17:
                l3i l3iVar2 = (l3i) obj2;
                Integer climbPosition = ((l3i) obj).a.getClimbPosition();
                int intValue2 = climbPosition != null ? climbPosition.intValue() : 0;
                Integer climbPosition2 = l3iVar2.a.getClimbPosition();
                return Integer.valueOf(Intrinsics.d(intValue2, climbPosition2 != null ? climbPosition2.intValue() : 0));
            case 18:
                l3i l3iVar3 = (l3i) obj2;
                Integer sprintPosition = ((l3i) obj).a.getSprintPosition();
                int intValue3 = sprintPosition != null ? sprintPosition.intValue() : 0;
                Integer sprintPosition2 = l3iVar3.a.getSprintPosition();
                return Integer.valueOf(Intrinsics.d(intValue3, sprintPosition2 != null ? sprintPosition2.intValue() : 0));
            case 19:
                l3i l3iVar4 = (l3i) obj2;
                Integer position = ((l3i) obj).a.getPosition();
                int intValue4 = position != null ? position.intValue() : 0;
                Integer position2 = l3iVar4.a.getPosition();
                return Integer.valueOf(Intrinsics.d(intValue4, position2 != null ? position2.intValue() : 0));
            case 20:
                StageStandingsItem stageStandingsItem = (StageStandingsItem) obj2;
                Integer youngRiderPosition3 = ((StageStandingsItem) obj).getYoungRiderPosition();
                int intValue5 = youngRiderPosition3 != null ? youngRiderPosition3.intValue() : 0;
                Integer youngRiderPosition4 = stageStandingsItem.getYoungRiderPosition();
                return Integer.valueOf(Intrinsics.d(intValue5, youngRiderPosition4 != null ? youngRiderPosition4.intValue() : 0));
            case 21:
                StageStandingsItem stageStandingsItem2 = (StageStandingsItem) obj2;
                Integer climbPosition3 = ((StageStandingsItem) obj).getClimbPosition();
                int intValue6 = climbPosition3 != null ? climbPosition3.intValue() : 0;
                Integer climbPosition4 = stageStandingsItem2.getClimbPosition();
                return Integer.valueOf(Intrinsics.d(intValue6, climbPosition4 != null ? climbPosition4.intValue() : 0));
            case 22:
                StageStandingsItem stageStandingsItem3 = (StageStandingsItem) obj2;
                Integer sprintPosition3 = ((StageStandingsItem) obj).getSprintPosition();
                int intValue7 = sprintPosition3 != null ? sprintPosition3.intValue() : 0;
                Integer sprintPosition4 = stageStandingsItem3.getSprintPosition();
                return Integer.valueOf(Intrinsics.d(intValue7, sprintPosition4 != null ? sprintPosition4.intValue() : 0));
            case 23:
                StageStandingsItem stageStandingsItem4 = (StageStandingsItem) obj2;
                Integer position3 = ((StageStandingsItem) obj).getPosition();
                int intValue8 = position3 != null ? position3.intValue() : 0;
                Integer position4 = stageStandingsItem4.getPosition();
                return Integer.valueOf(Intrinsics.d(intValue8, position4 != null ? position4.intValue() : 0));
            case 24:
                Context context = (Context) obj;
                StageStandingsItem stageStandingsItem5 = (StageStandingsItem) obj2;
                context.getClass();
                stageStandingsItem5.getClass();
                Integer gridPosition = stageStandingsItem5.getGridPosition();
                if (gridPosition != null && (valueOf = String.valueOf(gridPosition.intValue())) != null) {
                    return valueOf;
                }
                if (Intrinsics.c(stageStandingsItem5.getStartedFromPit(), Boolean.TRUE)) {
                    return context.getString(R.string.motorsport_pit_lane_short);
                }
                return null;
            case 25:
                StageStandingsItem stageStandingsItem6 = (StageStandingsItem) obj2;
                ((Context) obj).getClass();
                stageStandingsItem6.getClass();
                return String.valueOf(yid.m(stageStandingsItem6.getPitStops()));
            case 26:
                StageStandingsItem stageStandingsItem7 = (StageStandingsItem) obj2;
                ((Context) obj).getClass();
                stageStandingsItem7.getClass();
                Integer laps = stageStandingsItem7.getLaps();
                if (laps != null) {
                    return String.valueOf(laps.intValue());
                }
                return null;
            case 27:
                StageStandingsItem stageStandingsItem8 = (StageStandingsItem) obj2;
                ((Context) obj).getClass();
                stageStandingsItem8.getClass();
                Integer lapsLed = stageStandingsItem8.getLapsLed();
                if (lapsLed != null) {
                    return String.valueOf(lapsLed.intValue());
                }
                return null;
            case 28:
                StageStandingsItem stageStandingsItem9 = (StageStandingsItem) obj2;
                ((Context) obj).getClass();
                stageStandingsItem9.getClass();
                String lapTime = stageStandingsItem9.getLapTime();
                if (lapTime != null) {
                    return StringsKt.V(lapTime, "0");
                }
                return null;
            default:
                StageStandingsItem stageStandingsItem10 = (StageStandingsItem) obj2;
                ((Context) obj).getClass();
                stageStandingsItem10.getClass();
                return stageStandingsItem10.getStatus();
        }
    }

    public /* synthetic */ wqg(int i, int i2) {
        this.a = i2;
    }
}
