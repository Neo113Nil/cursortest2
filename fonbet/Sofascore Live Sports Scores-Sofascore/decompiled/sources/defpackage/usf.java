package defpackage;

import com.sofascore.model.Sports;
import com.sofascore.model.database.DbSportOrder;
import com.sofascore.results.referee.events.RefereeEventsFragment;
import com.sofascore.results.stagesport.fragments.category.StageCategoryRacesFragment;
import com.sofascore.results.team.lastnext.TeamEventsFragment;
import com.sofascore.results.venue.matches.VenueMatchesFragment;
import com.sofascore.results.wc26.WorldCupFragment;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class usf implements b98 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ usf(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(int i, rq3 rq3Var) {
        sci sciVar;
        int i2;
        if (rq3Var instanceof sci) {
            sciVar = (sci) rq3Var;
            int i3 = sciVar.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                sciVar.t = i3 - Integer.MIN_VALUE;
                Object obj = sciVar.r;
                lu3 lu3Var = lu3.a;
                i2 = sciVar.t;
                if (i2 != 0) {
                    y6a.M(obj);
                    if (i > 0) {
                        asf asfVar = (asf) this.b;
                        if (!asfVar.a) {
                            asfVar.a = true;
                            b98 b98Var = (b98) this.c;
                            veh vehVar = veh.a;
                            sciVar.t = 1;
                            if (b98Var.emit(vehVar, sciVar) == lu3Var) {
                                return lu3Var;
                            }
                        }
                    }
                    return Unit.a;
                }
                if (i2 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                return Unit.a;
            }
        }
        sciVar = new sci(this, rq3Var);
        Object obj2 = sciVar.r;
        lu3 lu3Var2 = lu3.a;
        i2 = sciVar.t;
        if (i2 != 0) {
        }
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x027b, code lost:
    
        if (r6.emit(r0, r2) == r1) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x02f0, code lost:
    
        if (r3.emit(r0, r2) != r1) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x02e5, code lost:
    
        if (r0 == r1) goto L138;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01f1  */
    @Override // defpackage.b98
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, rq3 rq3Var) {
        u4h u4hVar;
        int i;
        b98 b98Var;
        ezh ezhVar;
        int i2;
        b98 b98Var2;
        List list;
        int i3;
        ArrayList arrayList;
        int i4;
        int i5 = this.a;
        Object obj2 = this.b;
        Object obj3 = this.c;
        switch (i5) {
            case 0:
                j52 j52Var = (j52) obj;
                mqi mqiVar = ((RefereeEventsFragment) obj3).t;
                if (j52Var instanceof i42) {
                    if (Intrinsics.c(((RefereeEventsFragment) obj2).toString(), ((i42) j52Var).a)) {
                    }
                    return Unit.a;
                }
                if (j52Var == null) {
                    yhk.s("null cannot be cast to non-null type com.sofascore.common.broadcastUtil.BroadcastEvent.RefreshFavorites");
                    return null;
                }
                ((b7e) mqiVar.getValue()).U();
                return Unit.a;
            case 1:
                i7a i7aVar = (i7a) obj;
                x20 x20Var = (x20) obj2;
                if (i7aVar instanceof l6f) {
                    l6f l6fVar = (l6f) i7aVar;
                    j5g j5gVar = x20Var.e;
                    if (j5gVar == null) {
                        j5gVar = v8a.p(x20Var.d);
                        x20Var.e = j5gVar;
                    }
                    l5g a = j5gVar.a(x20Var);
                    a.b(l6fVar, true, x20Var.h, x20Var.i, ((r13) x20Var.b.getValue()).a, ((g5g) x20Var.c.getValue()).d, x20Var.j);
                    ((eoh) x20Var.f).setValue(a);
                } else if (i7aVar instanceof m6f) {
                    l5g l5gVar = (l5g) ((eoh) x20Var.f).getValue();
                    if (l5gVar != null) {
                        l5gVar.d();
                    }
                } else if (i7aVar instanceof k6f) {
                    l5g l5gVar2 = (l5g) ((eoh) x20Var.f).getValue();
                    if (l5gVar2 != null) {
                        l5gVar2.d();
                    }
                } else {
                    x20Var.a.g(i7aVar, (ku3) obj3);
                }
                return Unit.a;
            case 2:
                i7a i7aVar2 = (i7a) obj;
                y20 y20Var = (y20) obj2;
                if (!(i7aVar2 instanceof n6f)) {
                    ku3 ku3Var = (ku3) obj3;
                    n72 n72Var = y20Var.t;
                    if (n72Var == null) {
                        n72Var = new n72(y20Var.p, y20Var.s);
                        n9e.E(y20Var);
                        y20Var.t = n72Var;
                    }
                    n72Var.g(i7aVar2, ku3Var);
                } else if (y20Var.w) {
                    y20Var.k1((n6f) i7aVar2);
                } else {
                    y20Var.x.a(i7aVar2);
                }
                return Unit.a;
            case 3:
                dnd dndVar = (dnd) obj;
                long j = dndVar.a;
                q50 q50Var = (q50) obj2;
                if ((((dnd) q50Var.d()).a & 9223372034707292159L) == 9205357640488583168L || (j & 9223372034707292159L) == 9205357640488583168L || Float.intBitsToFloat((int) (((dnd) q50Var.d()).a & 4294967295L)) == Float.intBitsToFloat((int) (j & 4294967295L))) {
                    Object f = q50Var.f(rq3Var, dndVar);
                    return f == lu3.a ? f : Unit.a;
                }
                xw3.L((ku3) obj3, null, null, new dv2(q50Var, j, null, 2), 3);
                return Unit.a;
            case 4:
                if (rq3Var instanceof u4h) {
                    u4hVar = (u4h) rq3Var;
                    int i6 = u4hVar.s;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        u4hVar.s = i6 - Integer.MIN_VALUE;
                        Object obj4 = u4hVar.r;
                        lu3 lu3Var = lu3.a;
                        i = u4hVar.s;
                        if (i != 0) {
                            y6a.M(obj4);
                            b98Var = (b98) obj2;
                            u4hVar.t = b98Var;
                            u4hVar.s = 1;
                            obj4 = ((t4h) obj3).a((e4e) obj, u4hVar);
                            break;
                        } else {
                            if (i != 1) {
                                if (i == 2) {
                                    y6a.M(obj4);
                                    return Unit.a;
                                }
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            b98Var = u4hVar.t;
                            y6a.M(obj4);
                        }
                        u4hVar.t = null;
                        u4hVar.s = 2;
                        break;
                    }
                }
                u4hVar = new u4h(this, rq3Var);
                Object obj42 = u4hVar.r;
                lu3 lu3Var2 = lu3.a;
                i = u4hVar.s;
                if (i != 0) {
                }
                u4hVar.t = null;
                u4hVar.s = 2;
            case 5:
                ((Function1) ((e1d) obj3).getValue()).invoke(((scj) obj2).c().c.toString());
                return Unit.a;
            case 6:
                gzh gzhVar = (gzh) obj3;
                if (rq3Var instanceof ezh) {
                    ezhVar = (ezh) rq3Var;
                    int i7 = ezhVar.s;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        ezhVar.s = i7 - Integer.MIN_VALUE;
                        Object obj5 = ezhVar.r;
                        lu3 lu3Var3 = lu3.a;
                        i2 = ezhVar.s;
                        if (i2 != 0) {
                            y6a.M(obj5);
                            b98Var2 = (b98) obj2;
                            list = (List) obj;
                            i3 = 0;
                            if (list.isEmpty()) {
                                ArrayList l = oea.l(ke0.c, Sports.INSTANCE.getEntries());
                                ArrayList arrayList2 = new ArrayList(k13.r(l, 10));
                                int i8 = 0;
                                for (Object obj6 : l) {
                                    int i9 = i8 + 1;
                                    if (i8 < 0) {
                                        b.q();
                                        throw null;
                                    }
                                    arrayList2.add(new DbSportOrder((String) obj6, i8, i8 == 0));
                                    i8 = i9;
                                }
                                ezhVar.t = b98Var2;
                                ezhVar.w = arrayList2;
                                ezhVar.u = 0;
                                ezhVar.s = 1;
                                if (gzhVar.c(arrayList2, ezhVar) != lu3Var3) {
                                    arrayList = arrayList2;
                                    i4 = 0;
                                }
                                return lu3Var3;
                            }
                            ezhVar.t = null;
                            ezhVar.w = null;
                            ezhVar.u = i3;
                            ezhVar.s = 2;
                            break;
                        } else {
                            if (i2 != 1) {
                                if (i2 == 2) {
                                    y6a.M(obj5);
                                    return Unit.a;
                                }
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            i4 = ezhVar.u;
                            arrayList = ezhVar.w;
                            b98Var2 = ezhVar.t;
                            y6a.M(obj5);
                        }
                        list = arrayList;
                        i3 = i4;
                        ezhVar.t = null;
                        ezhVar.w = null;
                        ezhVar.u = i3;
                        ezhVar.s = 2;
                    }
                }
                ezhVar = new ezh(this, rq3Var);
                Object obj52 = ezhVar.r;
                lu3 lu3Var32 = lu3.a;
                i2 = ezhVar.s;
                if (i2 != 0) {
                }
                list = arrayList;
                i3 = i4;
                ezhVar.t = null;
                ezhVar.w = null;
                ezhVar.u = i3;
                ezhVar.s = 2;
            case 7:
                j52 j52Var2 = (j52) obj;
                mqi mqiVar2 = ((StageCategoryRacesFragment) obj3).t;
                if (j52Var2 instanceof i42) {
                    if (Intrinsics.c(((StageCategoryRacesFragment) obj2).toString(), ((i42) j52Var2).a)) {
                    }
                    return Unit.a;
                }
                if (j52Var2 == null) {
                    yhk.s("null cannot be cast to non-null type com.sofascore.common.broadcastUtil.BroadcastEvent.RefreshFavorites");
                    return null;
                }
                ((s7i) mqiVar2.getValue()).A();
                return Unit.a;
            case 8:
                return a(((Number) obj).intValue(), rq3Var);
            case 9:
                j52 j52Var3 = (j52) obj;
                TeamEventsFragment teamEventsFragment = (TeamEventsFragment) obj3;
                if (j52Var3 instanceof i42) {
                    if (Intrinsics.c(((TeamEventsFragment) obj2).toString(), ((i42) j52Var3).a)) {
                    }
                    return Unit.a;
                }
                if (j52Var3 == null) {
                    yhk.s("null cannot be cast to non-null type com.sofascore.common.broadcastUtil.BroadcastEvent.RefreshFavorites");
                    return null;
                }
                teamEventsFragment.D().U();
                return Unit.a;
            case 10:
                dnd dndVar2 = (dnd) obj;
                long j2 = dndVar2.a;
                ebj ebjVar = (ebj) obj2;
                q50 q50Var2 = ebjVar.v;
                if ((((dnd) q50Var2.d()).a & 9223372034707292159L) == 9205357640488583168L || (j2 & 9223372034707292159L) == 9205357640488583168L || Float.intBitsToFloat((int) (((dnd) q50Var2.d()).a & 4294967295L)) == Float.intBitsToFloat((int) (j2 & 4294967295L))) {
                    Object f2 = q50Var2.f(rq3Var, dndVar2);
                    return f2 == lu3.a ? f2 : Unit.a;
                }
                xw3.L((ku3) obj3, null, null, new z40(ebjVar, j2, (rq3) null, 8), 3);
                return Unit.a;
            case 11:
                String str = (String) obj;
                oge ogeVar = (oge) obj2;
                ogeVar.getClass();
                str.getClass();
                ((eoh) ogeVar.a).setValue(str);
                Function1 function1 = (Function1) obj3;
                if (function1 != null) {
                    function1.invoke(str);
                }
                return Unit.a;
            case 12:
                j52 j52Var4 = (j52) obj;
                VenueMatchesFragment venueMatchesFragment = (VenueMatchesFragment) obj3;
                if (j52Var4 instanceof i42) {
                    if (Intrinsics.c(((VenueMatchesFragment) obj2).toString(), ((i42) j52Var4).a)) {
                    }
                    return Unit.a;
                }
                if (j52Var4 == null) {
                    yhk.s("null cannot be cast to non-null type com.sofascore.common.broadcastUtil.BroadcastEvent.RefreshFavorites");
                    return null;
                }
                venueMatchesFragment.C().U();
                return Unit.a;
            case 13:
                ((ypd) obj2).d((lcl) obj3, (jn3) obj);
                return Unit.a;
            case 14:
                j52 j52Var5 = (j52) obj;
                WorldCupFragment worldCupFragment = (WorldCupFragment) obj3;
                if (j52Var5 instanceof i42) {
                    if (Intrinsics.c(((WorldCupFragment) obj2).toString(), ((i42) j52Var5).a)) {
                    }
                    return Unit.a;
                }
                if (j52Var5 == null) {
                    yhk.s("null cannot be cast to non-null type com.sofascore.common.broadcastUtil.BroadcastEvent.OddsConfigChanged");
                    return null;
                }
                worldCupFragment.u();
                return Unit.a;
            default:
                int intValue = ((Number) obj).intValue();
                IntRange intRange = new IntRange(intValue - 1, intValue + 1, 1);
                e1d e1dVar = (e1d) obj3;
                ArrayList arrayList3 = new ArrayList();
                v6a it = intRange.iterator();
                while (it.c) {
                    rxb rxbVar = (rxb) CollectionsKt.a0(it.nextInt(), (gv9) e1dVar.getValue());
                    Integer num = rxbVar != null ? new Integer(rxbVar.a.getId()) : null;
                    if (num != null) {
                        arrayList3.add(num);
                    }
                }
                ((Function1) obj2).invoke(CollectionsKt.W0(arrayList3));
                return Unit.a;
        }
    }
}
