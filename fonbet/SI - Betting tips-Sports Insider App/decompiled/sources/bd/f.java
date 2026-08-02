package bd;

import c1.q;
import com.android.billingclient.api.Purchase;
import com.sports.insider.data.repository.room.sports.db.impl.SportsTable;
import eg.m0;
import eg.z;
import hg.c0;
import hg.g0;
import hg.l0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.v;
import kotlin.collections.y;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import m3.o;
import md.m;
import pc.p;
import pc.u;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f implements hg.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3153a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3154b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3155c;

    public /* synthetic */ f(int i5, Object obj, Object obj2) {
        this.f3153a = i5;
        this.f3154b = obj;
        this.f3155c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:184:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01bc  */
    /* JADX WARN: Type inference failed for: r10v3, types: [kotlin.jvm.functions.Function2, mf.i] */
    @Override // hg.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(Object obj, Continuation continuation) {
        e eVar;
        Object obj2;
        lf.a aVar;
        int i5;
        hg.h hVar;
        c0 c0Var;
        int i10;
        Object obj3;
        Object obj4;
        f fVar;
        g0 g0Var;
        Object obj5;
        int i11;
        f fVar2;
        T t3;
        l0 l0Var;
        lf.a aVar2;
        int i12;
        Object obj6;
        hg.h hVar2;
        id.b bVar;
        Object obj7;
        lf.a aVar3;
        int i13;
        hg.h hVar3;
        md.i iVar;
        int i14;
        pb.d dVar;
        int i15;
        int i16 = this.f3153a;
        int i17 = 10;
        int i18 = 0;
        Continuation continuation2 = null;
        int i19 = 1;
        Object obj8 = this.f3155c;
        Object obj9 = this.f3154b;
        switch (i16) {
            case 0:
                if (continuation instanceof e) {
                    eVar = (e) continuation;
                    int i20 = eVar.f3149b;
                    if ((i20 & Integer.MIN_VALUE) != 0) {
                        eVar.f3149b = i20 - Integer.MIN_VALUE;
                        obj2 = eVar.f3148a;
                        aVar = lf.a.f20034a;
                        i5 = eVar.f3149b;
                        if (i5 != 0) {
                            h8.b.B(obj2);
                            hg.h hVar4 = (hg.h) obj9;
                            eVar.f3151d = hVar4;
                            eVar.f3152e = 0;
                            eVar.f3149b = 1;
                            Object b10 = j.b((j) obj8, (List) obj, eVar);
                            if (b10 == aVar) {
                                return aVar;
                            }
                            obj2 = b10;
                            hVar = hVar4;
                        } else {
                            if (i5 != 1) {
                                if (i5 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                h8.b.B(obj2);
                                return Unit.f19194a;
                            }
                            i18 = eVar.f3152e;
                            hVar = eVar.f3151d;
                            h8.b.B(obj2);
                        }
                        eVar.f3151d = null;
                        eVar.f3152e = i18;
                        eVar.f3149b = 2;
                        if (hVar.d(obj2, eVar) == aVar) {
                            return aVar;
                        }
                        return Unit.f19194a;
                    }
                }
                eVar = new e(this, continuation);
                obj2 = eVar.f3148a;
                aVar = lf.a.f20034a;
                i5 = eVar.f3149b;
                if (i5 != 0) {
                }
                eVar.f3151d = null;
                eVar.f3152e = i18;
                eVar.f3149b = 2;
                if (hVar.d(obj2, eVar) == aVar) {
                }
                return Unit.f19194a;
            case 1:
                if (continuation instanceof c0) {
                    c0Var = (c0) continuation;
                    int i21 = c0Var.f10654c;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        c0Var.f10654c = i21 - Integer.MIN_VALUE;
                        Object obj10 = c0Var.f10653b;
                        lf.a aVar4 = lf.a.f20034a;
                        i10 = c0Var.f10654c;
                        if (i10 != 0) {
                            h8.b.B(obj10);
                            c0Var.f10652a = this;
                            c0Var.f10656e = obj;
                            c0Var.f10654c = 1;
                            InlineMarker.mark(6);
                            Object invoke = ((q) obj8).invoke(obj, c0Var);
                            InlineMarker.mark(7);
                            if (invoke == aVar4) {
                                return aVar4;
                            }
                            obj3 = invoke;
                            obj4 = obj;
                            fVar = this;
                        } else {
                            if (i10 != 1) {
                                if (i10 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                fVar = c0Var.f10652a;
                                h8.b.B(obj10);
                                i18 = 1;
                                if (i18 != 0) {
                                    return Unit.f19194a;
                                }
                                throw new ig.a(fVar);
                            }
                            Object obj11 = c0Var.f10656e;
                            f fVar3 = c0Var.f10652a;
                            h8.b.B(obj10);
                            obj4 = obj11;
                            fVar = fVar3;
                            obj3 = obj10;
                        }
                        if (((Boolean) obj3).booleanValue()) {
                            hg.h hVar5 = (hg.h) fVar.f3154b;
                            c0Var.f10652a = fVar;
                            c0Var.f10656e = null;
                            c0Var.f10654c = 2;
                            if (hVar5.d(obj4, c0Var) == aVar4) {
                                return aVar4;
                            }
                            i18 = 1;
                        }
                        if (i18 != 0) {
                        }
                    }
                }
                c0Var = new c0(this, continuation);
                Object obj102 = c0Var.f10653b;
                lf.a aVar42 = lf.a.f20034a;
                i10 = c0Var.f10654c;
                if (i10 != 0) {
                }
                if (((Boolean) obj3).booleanValue()) {
                }
                if (i18 != 0) {
                }
            case 2:
                if (continuation instanceof g0) {
                    g0Var = (g0) continuation;
                    int i22 = g0Var.f10684c;
                    if ((i22 & Integer.MIN_VALUE) != 0) {
                        g0Var.f10684c = i22 - Integer.MIN_VALUE;
                        obj5 = g0Var.f10683b;
                        lf.a aVar5 = lf.a.f20034a;
                        i11 = g0Var.f10684c;
                        if (i11 != 0) {
                            h8.b.B(obj5);
                            g0Var.f10682a = this;
                            g0Var.f10686e = obj;
                            g0Var.f10684c = 1;
                            InlineMarker.mark(6);
                            obj5 = ((Function2) obj9).invoke(obj, g0Var);
                            InlineMarker.mark(7);
                            if (obj5 == aVar5) {
                                return aVar5;
                            }
                            fVar2 = this;
                            t3 = obj;
                        } else {
                            if (i11 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Object obj12 = g0Var.f10686e;
                            fVar2 = g0Var.f10682a;
                            h8.b.B(obj5);
                            t3 = obj12;
                        }
                        if (((Boolean) obj5).booleanValue()) {
                            return Unit.f19194a;
                        }
                        ((Ref.ObjectRef) fVar2.f3155c).element = t3;
                        throw new ig.a(fVar2);
                    }
                }
                g0Var = new g0(this, continuation);
                obj5 = g0Var.f10683b;
                lf.a aVar52 = lf.a.f20034a;
                i11 = g0Var.f10684c;
                if (i11 != 0) {
                }
                if (((Boolean) obj5).booleanValue()) {
                }
            case 3:
                if (continuation instanceof l0) {
                    l0Var = (l0) continuation;
                    int i23 = l0Var.f10719b;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        l0Var.f10719b = i23 - Integer.MIN_VALUE;
                        Object obj13 = l0Var.f10718a;
                        aVar2 = lf.a.f20034a;
                        i12 = l0Var.f10719b;
                        if (i12 != 0) {
                            h8.b.B(obj13);
                            hg.h hVar6 = (hg.h) obj9;
                            l0Var.f10721d = obj;
                            l0Var.f10722e = hVar6;
                            l0Var.f10719b = 1;
                            InlineMarker.mark(6);
                            Object invoke2 = ((mf.i) obj8).invoke(obj, l0Var);
                            InlineMarker.mark(7);
                            if (invoke2 == aVar2) {
                                return aVar2;
                            }
                            obj6 = obj;
                            hVar2 = hVar6;
                        } else {
                            if (i12 != 1) {
                                if (i12 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                h8.b.B(obj13);
                                return Unit.f19194a;
                            }
                            hVar2 = l0Var.f10722e;
                            obj6 = l0Var.f10721d;
                            h8.b.B(obj13);
                        }
                        l0Var.f10721d = null;
                        l0Var.f10722e = null;
                        l0Var.f10719b = 2;
                        if (hVar2.d(obj6, l0Var) == aVar2) {
                            return aVar2;
                        }
                        return Unit.f19194a;
                    }
                }
                l0Var = new l0(this, continuation);
                Object obj132 = l0Var.f10718a;
                aVar2 = lf.a.f20034a;
                i12 = l0Var.f10719b;
                if (i12 != 0) {
                }
                l0Var.f10721d = null;
                l0Var.f10722e = null;
                l0Var.f10719b = 2;
                if (hVar2.d(obj6, l0Var) == aVar2) {
                }
                return Unit.f19194a;
            case 4:
                ((i3.g) obj9).b((o) obj8, (i3.c) obj);
                return Unit.f19194a;
            case 5:
                if (continuation instanceof id.b) {
                    bVar = (id.b) continuation;
                    int i24 = bVar.f11142b;
                    if ((i24 & Integer.MIN_VALUE) != 0) {
                        bVar.f11142b = i24 - Integer.MIN_VALUE;
                        obj7 = bVar.f11141a;
                        aVar3 = lf.a.f20034a;
                        i13 = bVar.f11142b;
                        if (i13 != 0) {
                            h8.b.B(obj7);
                            hg.h hVar7 = (hg.h) obj9;
                            id.c cVar = (id.c) obj8;
                            bVar.f11144d = hVar7;
                            bVar.f11145e = 0;
                            bVar.f11142b = 1;
                            cVar.getClass();
                            lg.e eVar2 = m0.f9201a;
                            Object A = eg.c0.A(lg.d.f20063c, new ab.b(cVar, (List) obj, continuation2, i17), bVar);
                            if (A == aVar3) {
                                return aVar3;
                            }
                            obj7 = A;
                            hVar3 = hVar7;
                        } else {
                            if (i13 != 1) {
                                if (i13 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                h8.b.B(obj7);
                                return Unit.f19194a;
                            }
                            i18 = bVar.f11145e;
                            hVar3 = bVar.f11144d;
                            h8.b.B(obj7);
                        }
                        bVar.f11144d = null;
                        bVar.f11145e = i18;
                        bVar.f11142b = 2;
                        if (hVar3.d(obj7, bVar) == aVar3) {
                            return aVar3;
                        }
                        return Unit.f19194a;
                    }
                }
                bVar = new id.b(this, continuation);
                obj7 = bVar.f11141a;
                aVar3 = lf.a.f20034a;
                i13 = bVar.f11142b;
                if (i13 != 0) {
                }
                bVar.f11144d = null;
                bVar.f11145e = i18;
                bVar.f11142b = 2;
                if (hVar3.d(obj7, bVar) == aVar3) {
                }
                return Unit.f19194a;
            case 6:
                if (continuation instanceof md.i) {
                    iVar = (md.i) continuation;
                    int i25 = iVar.f20553b;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        iVar.f20553b = i25 - Integer.MIN_VALUE;
                        Object obj14 = iVar.f20552a;
                        lf.a aVar6 = lf.a.f20034a;
                        i14 = iVar.f20553b;
                        if (i14 != 0) {
                            h8.b.B(obj14);
                            hg.h hVar8 = (hg.h) obj9;
                            List list = (List) obj;
                            ((m) obj8).getClass();
                            if (list != null && !list.isEmpty()) {
                                list = CollectionsKt.X(list);
                                y.m(list, new androidx.coordinatorlayout.widget.i(11));
                            }
                            List h10 = m.h(list);
                            iVar.f20553b = 1;
                            if (hVar8.d(h10, iVar) == aVar6) {
                                return aVar6;
                            }
                        } else {
                            if (i14 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            h8.b.B(obj14);
                        }
                        return Unit.f19194a;
                    }
                }
                iVar = new md.i(this, continuation);
                Object obj142 = iVar.f20552a;
                lf.a aVar62 = lf.a.f20034a;
                i14 = iVar.f20553b;
                if (i14 != 0) {
                }
                return Unit.f19194a;
            case 7:
                if (continuation instanceof pb.d) {
                    dVar = (pb.d) continuation;
                    int i26 = dVar.f21600b;
                    if ((i26 & Integer.MIN_VALUE) != 0) {
                        dVar.f21600b = i26 - Integer.MIN_VALUE;
                        Object obj15 = dVar.f21599a;
                        lf.a aVar7 = lf.a.f20034a;
                        i15 = dVar.f21600b;
                        if (i15 != 0) {
                            h8.b.B(obj15);
                            hg.h hVar9 = (hg.h) obj9;
                            List<SportsTable> list2 = (List) obj;
                            ArrayList arrayList = new ArrayList(v.k(list2, 10));
                            for (SportsTable sportsTable : list2) {
                                arrayList.add(new ja.e(sportsTable.getId(), Intrinsics.areEqual((String) obj8, "ru") ? sportsTable.getNameRu() : sportsTable.getNameEn(), sportsTable.getLogo()));
                            }
                            dVar.f21600b = 1;
                            if (hVar9.d(arrayList, dVar) == aVar7) {
                                return aVar7;
                            }
                        } else {
                            if (i15 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            h8.b.B(obj15);
                        }
                        return Unit.f19194a;
                    }
                }
                dVar = new pb.d(this, continuation);
                Object obj152 = dVar.f21599a;
                lf.a aVar72 = lf.a.f20034a;
                i15 = dVar.f21600b;
                if (i15 != 0) {
                }
                return Unit.f19194a;
            default:
                z zVar = (z) obj9;
                Pair pair = (Pair) obj;
                u uVar = (u) obj8;
                List list3 = (List) pair.f19193b;
                if (list3 != null && !list3.isEmpty()) {
                    lg.e eVar3 = m0.f9201a;
                    lg.d dVar2 = lg.d.f20063c;
                    eg.y yVar = new eg.y("handlePURCHASED");
                    dVar2.getClass();
                    eg.c0.e(zVar, kotlin.coroutines.e.c(dVar2, yVar), new la.f(list3, uVar, continuation2, 3), 2);
                }
                uVar.f21706f.b(pair.f19192a);
                List list4 = (List) pair.f19193b;
                if (list4 != null) {
                    lg.e eVar4 = m0.f9201a;
                    eg.y yVar2 = new eg.y("EventSubs");
                    eVar4.getClass();
                    eg.c0.e(zVar, kotlin.coroutines.e.c(eVar4, yVar2), new pc.o(uVar, list4, continuation2, i18), 2);
                    eg.c0.e(zVar, kotlin.coroutines.e.c(eVar4, new eg.y("OnOwnedPurchase")), new pc.o(uVar, list4, continuation2, i19), 2);
                    lg.d dVar3 = lg.d.f20063c;
                    eg.y yVar3 = new eg.y("onPayByAnnouncementId");
                    dVar3.getClass();
                    eg.c0.e(zVar, kotlin.coroutines.e.c(dVar3, yVar3), new p(uVar, list4, continuation2, i18), 2);
                    Iterator it = list4.iterator();
                    while (it.hasNext()) {
                        uVar.f21707g.b(uVar.w((Purchase) it.next()));
                    }
                }
                return Unit.f19194a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(hg.h hVar, Function2 function2) {
        this.f3153a = 3;
        this.f3154b = hVar;
        this.f3155c = (mf.i) function2;
    }

    public f(hg.h hVar, pb.e eVar, String str) {
        this.f3153a = 7;
        this.f3154b = hVar;
        this.f3155c = str;
    }

    public f(q qVar, hg.h hVar) {
        this.f3153a = 1;
        this.f3155c = qVar;
        this.f3154b = hVar;
    }
}
