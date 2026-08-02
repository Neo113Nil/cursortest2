package defpackage;

import android.content.res.Resources;
import com.sofascore.model.database.DbSportOrder;
import com.sofascore.model.mvvm.model.Incident;
import com.sofascore.results.sofaSeason.SofaSeasonActivity;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.di.ServicesRegistry;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.sequences.Sequence;
import kotlinx.serialization.KSerializer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class z1h implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ z1h(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit initialize$lambda$220;
        nlg V0;
        String str = null;
        switch (this.a) {
            case 0:
                List list = (List) obj;
                list.getClass();
                return Boolean.valueOf(list.size() > 1);
            case 1:
                dnd dndVar = (dnd) obj;
                long j = dndVar.a;
                return (9223372034707292159L & j) != 9205357640488583168L ? new g80(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (4294967295L & dndVar.a))) : g3h.a;
            case 2:
                g80 g80Var = (g80) obj;
                return new dnd((Float.floatToRawIntBits(g80Var.b) & 4294967295L) | (Float.floatToRawIntBits(g80Var.a) << 32));
            case 3:
                Sequence sequence = (Sequence) obj;
                sequence.getClass();
                return sequence.iterator();
            case 4:
                return Boolean.valueOf(obj == null);
            case 5:
                KClass kClass = (KClass) obj;
                kClass.getClass();
                KSerializer U = sha.U(kClass);
                if (U != null) {
                    return U;
                }
                if (sha.x(kClass).isInterface()) {
                    return new a0f(kClass);
                }
                return null;
            case 6:
                KClass kClass2 = (KClass) obj;
                kClass2.getClass();
                KSerializer U2 = sha.U(kClass2);
                if (U2 == null) {
                    U2 = sha.x(kClass2).isInterface() ? new a0f(kClass2) : null;
                }
                if (U2 != null) {
                    return l98.W(U2);
                }
                return null;
            case 7:
                initialize$lambda$220 = ServiceProvider.initialize$lambda$220((ServicesRegistry) obj);
                return initialize$lambda$220;
            case 8:
                Incident incident = (Incident) obj;
                incident.getClass();
                if (!(incident instanceof Incident.GoalIncident) && (!(incident instanceof Incident.CardIncident) || Intrinsics.c(((Incident.CardIncident) incident).getIncidentClass(), Incident.CardIncident.CARD_YELLOW) || incident.isOnBench())) {
                    r8 = false;
                }
                return Boolean.valueOf(r8);
            case 9:
                ((r9i) obj).getClass();
                return Unit.a;
            case 10:
                return Unit.a;
            case 11:
                f4g f4gVar = (f4g) obj;
                f4gVar.getClass();
                f4gVar.b(1.0f);
                return Unit.a;
            case 12:
                ((Integer) obj).getClass();
                return utc.a;
            case 13:
                return Unit.a;
            case 14:
                ((r60) obj).getClass();
                return l98.l0(uo5.e(s02.h0(200, 0, null, 6), 2), uo5.f(s02.h0(200, 0, null, 6), 2));
            case 15:
                ((Boolean) obj).getClass();
                return Unit.a;
            case 16:
                ((vt2) obj).getClass();
                return "chip_item";
            case 17:
                int i = SofaSeasonActivity.L;
                ((Resources) obj).getClass();
                return Boolean.TRUE;
            case 18:
                ((ha5) obj).getClass();
                return Unit.a;
            case 19:
                ((r60) obj).getClass();
                return l98.l0(uo5.e(s02.h0(200, 0, null, 6), 2), uo5.f(s02.h0(200, 0, null, 6), 2));
            case 20:
                return Unit.a;
            case 21:
                glg glgVar = (glg) obj;
                glgVar.getClass();
                V0 = glgVar.V0("SELECT sportName FROM sport_order ORDER BY sportOrder ASC");
                try {
                    ArrayList arrayList = new ArrayList();
                    while (V0.U0()) {
                        arrayList.add(V0.F0(0));
                    }
                    return arrayList;
                } finally {
                }
            case 22:
                glg glgVar2 = (glg) obj;
                glgVar2.getClass();
                V0 = glgVar2.V0("SELECT sportName FROM sport_order WHERE isSelected = 1");
                try {
                    if (V0.U0() && !V0.isNull(0)) {
                        str = V0.F0(0);
                    }
                    return str;
                } finally {
                }
            case 23:
                glg glgVar3 = (glg) obj;
                glgVar3.getClass();
                V0 = glgVar3.V0("SELECT * FROM sport_order ORDER BY sportOrder ASC");
                try {
                    int r = w1a.r(V0, "sportName");
                    int r2 = w1a.r(V0, "sportOrder");
                    int r3 = w1a.r(V0, "isSelected");
                    ArrayList arrayList2 = new ArrayList();
                    while (V0.U0()) {
                        arrayList2.add(new DbSportOrder(V0.F0(r), (int) V0.getLong(r2), ((int) V0.getLong(r3)) != 0));
                    }
                    return arrayList2;
                } finally {
                }
            case 24:
                glg glgVar4 = (glg) obj;
                glgVar4.getClass();
                V0 = glgVar4.V0("SELECT sportName FROM sport_order ORDER BY sportOrder ASC");
                try {
                    ArrayList arrayList3 = new ArrayList();
                    while (V0.U0()) {
                        arrayList3.add(V0.F0(0));
                    }
                    return arrayList3;
                } finally {
                }
            case 25:
                glg glgVar5 = (glg) obj;
                glgVar5.getClass();
                V0 = glgVar5.V0("SELECT sportName FROM sport_order WHERE isSelected = 1");
                try {
                    if (V0.U0() && !V0.isNull(0)) {
                        str = V0.F0(0);
                    }
                    return str;
                } finally {
                }
            case 26:
                ((Long) obj).getClass();
                return Unit.a;
            case 27:
                ((e8i) obj).getClass();
                return Boolean.TRUE;
            case 28:
                e8i e8iVar = (e8i) obj;
                e8iVar.getClass();
                return Boolean.valueOf(e8iVar.d);
            default:
                e8i e8iVar2 = (e8i) obj;
                e8iVar2.getClass();
                return Boolean.valueOf(e8iVar2.e);
        }
    }
}
