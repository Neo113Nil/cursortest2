package c1;

import com.google.android.gms.internal.measurement.y3;
import com.sports.insider.data.entity.signin.UserProfile;
import com.sports.insider.data.repository.room.billing.SkuDetailsTable;
import com.sports.insider.data.repository.room.support.dp.impl.SupportTable;
import com.sports.insider.data.room.general.table.AccountTable;
import com.sports.insider.data.room.general.table.predictions.PredictionTable;
import io.appmetrica.analytics.impl.C0122e9;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class t implements hg.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3477a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hg.h f3478b;

    public /* synthetic */ t(hg.h hVar, int i5) {
        this.f3477a = i5;
        this.f3478b = hVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x04e1  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x04ef  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x052b  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0539  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0585  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0594  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x061e  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x062c  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0667  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x0675  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x06cc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x06da  */
    /* JADX WARN: Removed duplicated region for block: B:432:0x0712  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x0720  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x0756  */
    /* JADX WARN: Removed duplicated region for block: B:457:0x0764  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:482:0x07c0  */
    /* JADX WARN: Removed duplicated region for block: B:492:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:493:0x07d8  */
    /* JADX WARN: Removed duplicated region for block: B:508:0x082f  */
    /* JADX WARN: Removed duplicated region for block: B:514:0x083d  */
    /* JADX WARN: Removed duplicated region for block: B:529:0x0877  */
    /* JADX WARN: Removed duplicated region for block: B:535:0x0885  */
    /* JADX WARN: Removed duplicated region for block: B:548:0x08b9  */
    /* JADX WARN: Removed duplicated region for block: B:554:0x08c7  */
    /* JADX WARN: Removed duplicated region for block: B:565:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:575:0x091d  */
    /* JADX WARN: Removed duplicated region for block: B:581:0x092b  */
    /* JADX WARN: Removed duplicated region for block: B:606:0x0996  */
    /* JADX WARN: Removed duplicated region for block: B:612:0x09a4  */
    /* JADX WARN: Removed duplicated region for block: B:639:0x0a0e  */
    /* JADX WARN: Removed duplicated region for block: B:645:0x0a1c  */
    /* JADX WARN: Removed duplicated region for block: B:670:0x0a82  */
    /* JADX WARN: Removed duplicated region for block: B:676:0x0a90  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:703:0x0afa  */
    /* JADX WARN: Removed duplicated region for block: B:709:0x0b08  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x016a  */
    /* JADX WARN: Type inference failed for: r2v10, types: [kotlin.collections.e0] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v19, types: [kotlin.collections.e0] */
    /* JADX WARN: Type inference failed for: r2v22, types: [java.util.ArrayList] */
    @Override // hg.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(Object obj, Continuation continuation) {
        s sVar;
        int i5;
        eb.h hVar;
        int i10;
        Object obj2;
        eb.j jVar;
        int i11;
        eb.k kVar;
        int i12;
        Object obj3;
        eb.l lVar;
        int i13;
        ic.o oVar;
        ge.p pVar;
        int i14;
        Integer num;
        Integer isViewed;
        hg.k0 k0Var;
        int i15;
        id.t tVar;
        int i16;
        la.j0 j0Var;
        Object obj4;
        lf.a aVar;
        int i17;
        hg.h hVar2;
        int i18;
        ob.a aVar2;
        int i19;
        ArrayList arrayList;
        p3.d dVar;
        int i20;
        pb.c cVar;
        int i21;
        rb.f fVar;
        int i22;
        rc.h hVar3;
        int i23;
        rc.v vVar;
        int i24;
        String name;
        sb.d dVar2;
        int i25;
        sb.e eVar;
        int i26;
        sb.f fVar2;
        int i27;
        sb.g gVar;
        int i28;
        sb.h hVar4;
        int i29;
        sb.i iVar;
        int i30;
        uc.a aVar3;
        int i31;
        uc.b bVar;
        int i32;
        uc.d dVar3;
        int i33;
        uc.e eVar2;
        int i34;
        uc.f fVar3;
        int i35;
        uc.g gVar2;
        int i36;
        uc.h hVar5;
        int i37;
        yc.b bVar2;
        int i38;
        yc.c cVar2;
        int i39;
        switch (this.f3477a) {
            case 0:
                if (continuation instanceof s) {
                    sVar = (s) continuation;
                    int i40 = sVar.f3474b;
                    if ((i40 & Integer.MIN_VALUE) != 0) {
                        sVar.f3474b = i40 - Integer.MIN_VALUE;
                        Object obj5 = sVar.f3473a;
                        lf.a aVar4 = lf.a.f20034a;
                        i5 = sVar.f3474b;
                        if (i5 != 0) {
                            h8.b.B(obj5);
                            c1 c1Var = (c1) obj;
                            if (c1Var instanceof w0) {
                                throw ((w0) c1Var).f3493b;
                            }
                            if (!(c1Var instanceof d)) {
                                if ((c1Var instanceof s0) || (c1Var instanceof d1) || (c1Var instanceof v0)) {
                                    throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                                }
                                throw new gf.m();
                            }
                            Object obj6 = ((d) c1Var).f3349b;
                            sVar.f3474b = 1;
                            if (this.f3478b.d(obj6, sVar) == aVar4) {
                                return aVar4;
                            }
                        } else {
                            if (i5 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            h8.b.B(obj5);
                        }
                        return Unit.f19194a;
                    }
                }
                sVar = new s(this, continuation);
                Object obj52 = sVar.f3473a;
                lf.a aVar42 = lf.a.f20034a;
                i5 = sVar.f3474b;
                if (i5 != 0) {
                }
                return Unit.f19194a;
            case 1:
                if (continuation instanceof eb.h) {
                    hVar = (eb.h) continuation;
                    int i41 = hVar.f8816b;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        hVar.f8816b = i41 - Integer.MIN_VALUE;
                        Object obj7 = hVar.f8815a;
                        Object obj8 = lf.a.f20034a;
                        i10 = hVar.f8816b;
                        if (i10 != 0) {
                            h8.b.B(obj7);
                            List list = (List) obj;
                            if (list == null || list.isEmpty()) {
                                obj2 = kotlin.collections.e0.f19204a;
                            } else {
                                ArrayList D = CollectionsKt.D(list);
                                obj2 = new ArrayList();
                                Iterator it = D.iterator();
                                while (it.hasNext()) {
                                    Object next = it.next();
                                    if (!StringsKt.A(((SkuDetailsTable) next).getSku(), "ProductDetails", false)) {
                                        obj2.add(next);
                                    }
                                }
                            }
                            hVar.f8816b = 1;
                            if (this.f3478b.d(obj2, hVar) == obj8) {
                                return obj8;
                            }
                        } else {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            h8.b.B(obj7);
                        }
                        return Unit.f19194a;
                    }
                }
                hVar = new eb.h(this, continuation);
                Object obj72 = hVar.f8815a;
                Object obj82 = lf.a.f20034a;
                i10 = hVar.f8816b;
                if (i10 != 0) {
                }
                return Unit.f19194a;
            case 2:
                if (continuation instanceof eb.j) {
                    jVar = (eb.j) continuation;
                    int i42 = jVar.f8822b;
                    if ((i42 & Integer.MIN_VALUE) != 0) {
                        jVar.f8822b = i42 - Integer.MIN_VALUE;
                        Object obj9 = jVar.f8821a;
                        lf.a aVar5 = lf.a.f20034a;
                        i11 = jVar.f8822b;
                        if (i11 != 0) {
                            h8.b.B(obj9);
                            ArrayList arrayList2 = new ArrayList();
                            for (SkuDetailsTable skuDetailsTable : (List) obj) {
                                ic.a B = StringsKt.A(skuDetailsTable.getJsonString(), "typeInt", false) ? null : y3.B(skuDetailsTable.getJsonString());
                                if (B != null) {
                                    arrayList2.add(B);
                                }
                            }
                            jVar.f8822b = 1;
                            if (this.f3478b.d(arrayList2, jVar) == aVar5) {
                                return aVar5;
                            }
                        } else {
                            if (i11 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            h8.b.B(obj9);
                        }
                        return Unit.f19194a;
                    }
                }
                jVar = new eb.j(this, continuation);
                Object obj92 = jVar.f8821a;
                lf.a aVar52 = lf.a.f20034a;
                i11 = jVar.f8822b;
                if (i11 != 0) {
                }
                return Unit.f19194a;
            case 3:
                if (continuation instanceof eb.k) {
                    kVar = (eb.k) continuation;
                    int i43 = kVar.f8825b;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        kVar.f8825b = i43 - Integer.MIN_VALUE;
                        Object obj10 = kVar.f8824a;
                        Object obj11 = lf.a.f20034a;
                        i12 = kVar.f8825b;
                        if (i12 != 0) {
                            h8.b.B(obj10);
                            List list2 = (List) obj;
                            if (list2 == null || list2.isEmpty()) {
                                obj3 = kotlin.collections.e0.f19204a;
                            } else {
                                ArrayList D2 = CollectionsKt.D(list2);
                                obj3 = new ArrayList();
                                Iterator it2 = D2.iterator();
                                while (it2.hasNext()) {
                                    Object next2 = it2.next();
                                    if (StringsKt.A(((SkuDetailsTable) next2).getSku(), "ProductDetails", false)) {
                                        obj3.add(next2);
                                    }
                                }
                            }
                            kVar.f8825b = 1;
                            if (this.f3478b.d(obj3, kVar) == obj11) {
                                return obj11;
                            }
                        } else {
                            if (i12 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            h8.b.B(obj10);
                        }
                        return Unit.f19194a;
                    }
                }
                kVar = new eb.k(this, continuation);
                Object obj102 = kVar.f8824a;
                Object obj112 = lf.a.f20034a;
                i12 = kVar.f8825b;
                if (i12 != 0) {
                }
                return Unit.f19194a;
            case 4:
                if (continuation instanceof eb.l) {
                    lVar = (eb.l) continuation;
                    int i44 = lVar.f8828b;
                    if ((i44 & Integer.MIN_VALUE) != 0) {
                        lVar.f8828b = i44 - Integer.MIN_VALUE;
                        Object obj12 = lVar.f8827a;
                        lf.a aVar6 = lf.a.f20034a;
                        i13 = lVar.f8828b;
                        if (i13 != 0) {
                            h8.b.B(obj12);
                            ArrayList arrayList3 = new ArrayList();
                            for (SkuDetailsTable skuDetailsTable2 : (List) obj) {
                                if (StringsKt.A(skuDetailsTable2.getJsonString(), "typeInt", false)) {
                                    ic.u uVar = ic.e0.Companion;
                                    String jsonString = skuDetailsTable2.getJsonString();
                                    uVar.getClass();
                                    oVar = ic.u.a(jsonString);
                                } else {
                                    oVar = null;
                                }
                                if (oVar != null) {
                                    arrayList3.add(oVar);
                                }
                            }
                            lVar.f8828b = 1;
                            if (this.f3478b.d(arrayList3, lVar) == aVar6) {
                                return aVar6;
                            }
                        } else {
                            if (i13 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            h8.b.B(obj12);
                        }
                        return Unit.f19194a;
                    }
                }
                lVar = new eb.l(this, continuation);
                Object obj122 = lVar.f8827a;
                lf.a aVar62 = lf.a.f20034a;
                i13 = lVar.f8828b;
                if (i13 != 0) {
                }
                return Unit.f19194a;
            case 5:
                if (continuation instanceof ge.p) {
                    pVar = (ge.p) continuation;
                    int i45 = pVar.f9987b;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        pVar.f9987b = i45 - Integer.MIN_VALUE;
                        Object obj13 = pVar.f9986a;
                        lf.a aVar7 = lf.a.f20034a;
                        i14 = pVar.f9987b;
                        if (i14 != 0) {
                            h8.b.B(obj13);
                            if (obj instanceof nc.b) {
                                nc.b bVar3 = (nc.b) obj;
                                if (bVar3.isViewed() == null || ((isViewed = bVar3.isViewed()) != null && isViewed.intValue() == 0)) {
                                    num = new Integer(bVar3.getId());
                                    pVar.f9987b = 1;
                                    if (this.f3478b.d(num, pVar) == aVar7) {
                                        return aVar7;
                                    }
                                }
                            }
                            num = null;
                            pVar.f9987b = 1;
                            if (this.f3478b.d(num, pVar) == aVar7) {
                            }
                        } else {
                            if (i14 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            h8.b.B(obj13);
                        }
                        return Unit.f19194a;
                    }
                }
                pVar = new ge.p(this, continuation);
                Object obj132 = pVar.f9986a;
                lf.a aVar72 = lf.a.f20034a;
                i14 = pVar.f9987b;
                if (i14 != 0) {
                }
                return Unit.f19194a;
            case 6:
                if (continuation instanceof hg.k0) {
                    k0Var = (hg.k0) continuation;
                    int i46 = k0Var.f10711b;
                    if ((i46 & Integer.MIN_VALUE) != 0) {
                        k0Var.f10711b = i46 - Integer.MIN_VALUE;
                        Object obj14 = k0Var.f10710a;
                        lf.a aVar8 = lf.a.f20034a;
                        i15 = k0Var.f10711b;
                        if (i15 != 0) {
                            h8.b.B(obj14);
                            if (obj != null) {
                                k0Var.f10711b = 1;
                                if (this.f3478b.d(obj, k0Var) == aVar8) {
                                    return aVar8;
                                }
                            }
                        } else {
                            if (i15 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            h8.b.B(obj14);
                        }
                        return Unit.f19194a;
                    }
                }
                k0Var = new hg.k0(this, continuation);
                Object obj142 = k0Var.f10710a;
                lf.a aVar82 = lf.a.f20034a;
                i15 = k0Var.f10711b;
                if (i15 != 0) {
                }
                return Unit.f19194a;
            case 7:
                if (continuation instanceof id.t) {
                    tVar = (id.t) continuation;
                    int i47 = tVar.f11214b;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        tVar.f11214b = i47 - Integer.MIN_VALUE;
                        Object obj15 = tVar.f11213a;
                        lf.a aVar9 = lf.a.f20034a;
                        i16 = tVar.f11214b;
                        if (i16 != 0) {
                            h8.b.B(obj15);
                            ja.c cVar3 = (ja.c) obj;
                            String str = cVar3 != null ? cVar3.f18393f : null;
                            tVar.f11214b = 1;
                            if (this.f3478b.d(str, tVar) == aVar9) {
                                return aVar9;
                            }
                        } else {
                            if (i16 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            h8.b.B(obj15);
                        }
                        return Unit.f19194a;
                    }
                }
                tVar = new id.t(this, continuation);
                Object obj152 = tVar.f11213a;
                lf.a aVar92 = lf.a.f20034a;
                i16 = tVar.f11214b;
                if (i16 != 0) {
                }
                return Unit.f19194a;
            case 8:
                if (continuation instanceof la.j0) {
                    j0Var = (la.j0) continuation;
                    int i48 = j0Var.f19522b;
                    if ((i48 & Integer.MIN_VALUE) != 0) {
                        j0Var.f19522b = i48 - Integer.MIN_VALUE;
                        obj4 = j0Var.f19521a;
                        aVar = lf.a.f20034a;
                        i17 = j0Var.f19522b;
                        Continuation continuation2 = null;
                        if (i17 != 0) {
                            h8.b.B(obj4);
                            String str2 = (String) obj;
                            hVar2 = this.f3478b;
                            j0Var.f19524d = hVar2;
                            j0Var.f19525e = 0;
                            j0Var.f19522b = 1;
                            Object A = str2 == null ? null : eg.c0.A(eg.m0.f9201a, new hd.b(1, str2, continuation2), j0Var);
                            if (A == aVar) {
                                return aVar;
                            }
                            obj4 = A;
                            i18 = 0;
                        } else {
                            if (i17 != 1) {
                                if (i17 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                h8.b.B(obj4);
                                return Unit.f19194a;
                            }
                            i18 = j0Var.f19525e;
                            hVar2 = j0Var.f19524d;
                            h8.b.B(obj4);
                        }
                        j0Var.f19524d = null;
                        j0Var.f19525e = i18;
                        j0Var.f19522b = 2;
                        if (hVar2.d(obj4, j0Var) == aVar) {
                            return aVar;
                        }
                        return Unit.f19194a;
                    }
                }
                j0Var = new la.j0(this, continuation);
                obj4 = j0Var.f19521a;
                aVar = lf.a.f20034a;
                i17 = j0Var.f19522b;
                Continuation continuation22 = null;
                if (i17 != 0) {
                }
                j0Var.f19524d = null;
                j0Var.f19525e = i18;
                j0Var.f19522b = 2;
                if (hVar2.d(obj4, j0Var) == aVar) {
                }
                return Unit.f19194a;
            case 9:
                if (continuation instanceof ob.a) {
                    aVar2 = (ob.a) continuation;
                    int i49 = aVar2.f21152b;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        aVar2.f21152b = i49 - Integer.MIN_VALUE;
                        Object obj16 = aVar2.f21151a;
                        lf.a aVar10 = lf.a.f20034a;
                        i19 = aVar2.f21152b;
                        if (i19 != 0) {
                            h8.b.B(obj16);
                            List list3 = (List) obj;
                            if (list3.isEmpty()) {
                                arrayList = null;
                            } else {
                                arrayList = new ArrayList();
                                for (Object obj17 : list3) {
                                    if (((ja.e) obj17).f18414b != null) {
                                        arrayList.add(obj17);
                                    }
                                }
                            }
                            aVar2.f21152b = 1;
                            if (this.f3478b.d(arrayList, aVar2) == aVar10) {
                                return aVar10;
                            }
                        } else {
                            if (i19 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            h8.b.B(obj16);
                        }
                        return Unit.f19194a;
                    }
                }
                aVar2 = new ob.a(this, continuation);
                Object obj162 = aVar2.f21151a;
                lf.a aVar102 = lf.a.f20034a;
                i19 = aVar2.f21152b;
                if (i19 != 0) {
                }
                return Unit.f19194a;
            case 10:
                if (continuation instanceof p3.d) {
                    dVar = (p3.d) continuation;
                    int i50 = dVar.f21505b;
                    if ((i50 & Integer.MIN_VALUE) != 0) {
                        dVar.f21505b = i50 - Integer.MIN_VALUE;
                        Object obj18 = dVar.f21504a;
                        lf.a aVar11 = lf.a.f20034a;
                        i20 = dVar.f21505b;
                        if (i20 != 0) {
                            h8.b.B(obj18);
                            if (obj instanceof i3.b) {
                                dVar.f21505b = 1;
                                if (this.f3478b.d(obj, dVar) == aVar11) {
                                    return aVar11;
                                }
                            }
                        } else {
                            if (i20 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            h8.b.B(obj18);
                        }
                        return Unit.f19194a;
                    }
                }
                dVar = new p3.d(this, continuation);
                Object obj182 = dVar.f21504a;
                lf.a aVar112 = lf.a.f20034a;
                i20 = dVar.f21505b;
                if (i20 != 0) {
                }
                return Unit.f19194a;
            case 11:
                if (continuation instanceof pb.c) {
                    cVar = (pb.c) continuation;
                    int i51 = cVar.f21597b;
                    if ((i51 & Integer.MIN_VALUE) != 0) {
                        cVar.f21597b = i51 - Integer.MIN_VALUE;
                        Object obj19 = cVar.f21596a;
                        lf.a aVar12 = lf.a.f20034a;
                        i21 = cVar.f21597b;
                        if (i21 != 0) {
                            h8.b.B(obj19);
                            ArrayList D3 = CollectionsKt.D((List) obj);
                            cVar.f21597b = 1;
                            if (this.f3478b.d(D3, cVar) == aVar12) {
                                return aVar12;
                            }
                        } else {
                            if (i21 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            h8.b.B(obj19);
                        }
                        return Unit.f19194a;
                    }
                }
                cVar = new pb.c(this, continuation);
                Object obj192 = cVar.f21596a;
                lf.a aVar122 = lf.a.f20034a;
                i21 = cVar.f21597b;
                if (i21 != 0) {
                }
                return Unit.f19194a;
            case 12:
                if (continuation instanceof rb.f) {
                    fVar = (rb.f) continuation;
                    int i52 = fVar.f22380b;
                    if ((i52 & Integer.MIN_VALUE) != 0) {
                        fVar.f22380b = i52 - Integer.MIN_VALUE;
                        Object obj20 = fVar.f22379a;
                        lf.a aVar13 = lf.a.f20034a;
                        i22 = fVar.f22380b;
                        if (i22 != 0) {
                            h8.b.B(obj20);
                            ArrayList arrayList4 = new ArrayList();
                            for (SupportTable supportTable : (List) obj) {
                                ka.a supportData = supportTable != null ? supportTable.toSupportData() : null;
                                if (supportData != null) {
                                    arrayList4.add(supportData);
                                }
                            }
                            fVar.f22380b = 1;
                            if (this.f3478b.d(arrayList4, fVar) == aVar13) {
                                return aVar13;
                            }
                        } else {
                            if (i22 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            h8.b.B(obj20);
                        }
                        return Unit.f19194a;
                    }
                }
                fVar = new rb.f(this, continuation);
                Object obj202 = fVar.f22379a;
                lf.a aVar132 = lf.a.f20034a;
                i22 = fVar.f22380b;
                if (i22 != 0) {
                }
                return Unit.f19194a;
            case 13:
                if (continuation instanceof rc.h) {
                    hVar3 = (rc.h) continuation;
                    int i53 = hVar3.f22412b;
                    if ((i53 & Integer.MIN_VALUE) != 0) {
                        hVar3.f22412b = i53 - Integer.MIN_VALUE;
                        Object obj21 = hVar3.f22411a;
                        lf.a aVar14 = lf.a.f20034a;
                        i23 = hVar3.f22412b;
                        if (i23 != 0) {
                            h8.b.B(obj21);
                            if (((ic.g0) obj).f11119c == ic.f0.f11115a) {
                                hVar3.f22412b = 1;
                                if (this.f3478b.d(obj, hVar3) == aVar14) {
                                    return aVar14;
                                }
                            }
                        } else {
                            if (i23 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            h8.b.B(obj21);
                        }
                        return Unit.f19194a;
                    }
                }
                hVar3 = new rc.h(this, continuation);
                Object obj212 = hVar3.f22411a;
                lf.a aVar142 = lf.a.f20034a;
                i23 = hVar3.f22412b;
                if (i23 != 0) {
                }
                return Unit.f19194a;
            case 14:
                if (continuation instanceof rc.v) {
                    vVar = (rc.v) continuation;
                    int i54 = vVar.f22450b;
                    if ((i54 & Integer.MIN_VALUE) != 0) {
                        vVar.f22450b = i54 - Integer.MIN_VALUE;
                        Object obj22 = vVar.f22449a;
                        lf.a aVar15 = lf.a.f20034a;
                        i24 = vVar.f22450b;
                        if (i24 != 0) {
                            h8.b.B(obj22);
                            UserProfile userProfile = (UserProfile) obj;
                            String email = userProfile.getEmail();
                            String avatar = userProfile.getAvatar();
                            if (userProfile.getEmail() == null) {
                                name = null;
                            } else if (userProfile.getName() == null || userProfile.getSurname() == null) {
                                name = userProfile.getName() != null ? userProfile.getName() : userProfile.getSurname() != null ? userProfile.getSurname() : "";
                            } else {
                                name = userProfile.getName() + ' ' + userProfile.getSurname();
                            }
                            gf.u uVar2 = new gf.u(email, name, avatar);
                            vVar.f22450b = 1;
                            if (this.f3478b.d(uVar2, vVar) == aVar15) {
                                return aVar15;
                            }
                        } else {
                            if (i24 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            h8.b.B(obj22);
                        }
                        return Unit.f19194a;
                    }
                }
                vVar = new rc.v(this, continuation);
                Object obj222 = vVar.f22449a;
                lf.a aVar152 = lf.a.f20034a;
                i24 = vVar.f22450b;
                if (i24 != 0) {
                }
                return Unit.f19194a;
            case 15:
                if (continuation instanceof sb.d) {
                    dVar2 = (sb.d) continuation;
                    int i55 = dVar2.f23409b;
                    if ((i55 & Integer.MIN_VALUE) != 0) {
                        dVar2.f23409b = i55 - Integer.MIN_VALUE;
                        Object obj23 = dVar2.f23408a;
                        lf.a aVar16 = lf.a.f20034a;
                        i25 = dVar2.f23409b;
                        if (i25 != 0) {
                            h8.b.B(obj23);
                            AccountTable accountTable = (AccountTable) obj;
                            int countPremium = accountTable != null ? accountTable.getCountPremium() : 0;
                            int countExpress = accountTable != null ? accountTable.getCountExpress() : 0;
                            sb.c cVar4 = new sb.c();
                            cVar4.f23406a = countPremium;
                            cVar4.f23407b = countExpress;
                            dVar2.f23409b = 1;
                            if (this.f3478b.d(cVar4, dVar2) == aVar16) {
                                return aVar16;
                            }
                        } else {
                            if (i25 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            h8.b.B(obj23);
                        }
                        return Unit.f19194a;
                    }
                }
                dVar2 = new sb.d(this, continuation);
                Object obj232 = dVar2.f23408a;
                lf.a aVar162 = lf.a.f20034a;
                i25 = dVar2.f23409b;
                if (i25 != 0) {
                }
                return Unit.f19194a;
            case 16:
                if (continuation instanceof sb.e) {
                    eVar = (sb.e) continuation;
                    int i56 = eVar.f23412b;
                    if ((i56 & Integer.MIN_VALUE) != 0) {
                        eVar.f23412b = i56 - Integer.MIN_VALUE;
                        Object obj24 = eVar.f23411a;
                        lf.a aVar17 = lf.a.f20034a;
                        i26 = eVar.f23412b;
                        if (i26 != 0) {
                            h8.b.B(obj24);
                            Boolean valueOf = Boolean.valueOf(io.sentry.config.a.C((Integer) obj));
                            eVar.f23412b = 1;
                            if (this.f3478b.d(valueOf, eVar) == aVar17) {
                                return aVar17;
                            }
                        } else {
                            if (i26 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            h8.b.B(obj24);
                        }
                        return Unit.f19194a;
                    }
                }
                eVar = new sb.e(this, continuation);
                Object obj242 = eVar.f23411a;
                lf.a aVar172 = lf.a.f20034a;
                i26 = eVar.f23412b;
                if (i26 != 0) {
                }
                return Unit.f19194a;
            case 17:
                if (continuation instanceof sb.f) {
                    fVar2 = (sb.f) continuation;
                    int i57 = fVar2.f23415b;
                    if ((i57 & Integer.MIN_VALUE) != 0) {
                        fVar2.f23415b = i57 - Integer.MIN_VALUE;
                        Object obj25 = fVar2.f23414a;
                        lf.a aVar18 = lf.a.f20034a;
                        i27 = fVar2.f23415b;
                        if (i27 != 0) {
                            h8.b.B(obj25);
                            ArrayList D4 = CollectionsKt.D((List) obj);
                            ArrayList arrayList5 = new ArrayList();
                            Iterator it3 = D4.iterator();
                            while (it3.hasNext()) {
                                Object next3 = it3.next();
                                if (io.sentry.config.a.C(new Integer(((ja.c) next3).f18390c))) {
                                    arrayList5.add(next3);
                                }
                            }
                            fVar2.f23415b = 1;
                            if (this.f3478b.d(arrayList5, fVar2) == aVar18) {
                                return aVar18;
                            }
                        } else {
                            if (i27 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            h8.b.B(obj25);
                        }
                        return Unit.f19194a;
                    }
                }
                fVar2 = new sb.f(this, continuation);
                Object obj252 = fVar2.f23414a;
                lf.a aVar182 = lf.a.f20034a;
                i27 = fVar2.f23415b;
                if (i27 != 0) {
                }
                return Unit.f19194a;
            case 18:
                if (continuation instanceof sb.g) {
                    gVar = (sb.g) continuation;
                    int i58 = gVar.f23418b;
                    if ((i58 & Integer.MIN_VALUE) != 0) {
                        gVar.f23418b = i58 - Integer.MIN_VALUE;
                        Object obj26 = gVar.f23417a;
                        lf.a aVar19 = lf.a.f20034a;
                        i28 = gVar.f23418b;
                        if (i28 != 0) {
                            h8.b.B(obj26);
                            UserProfile userProfile2 = (UserProfile) obj;
                            if (userProfile2 == null) {
                                userProfile2 = new UserProfile(null, null, null, null);
                            }
                            gVar.f23418b = 1;
                            if (this.f3478b.d(userProfile2, gVar) == aVar19) {
                                return aVar19;
                            }
                        } else {
                            if (i28 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            h8.b.B(obj26);
                        }
                        return Unit.f19194a;
                    }
                }
                gVar = new sb.g(this, continuation);
                Object obj262 = gVar.f23417a;
                lf.a aVar192 = lf.a.f20034a;
                i28 = gVar.f23418b;
                if (i28 != 0) {
                }
                return Unit.f19194a;
            case 19:
                if (continuation instanceof sb.h) {
                    hVar4 = (sb.h) continuation;
                    int i59 = hVar4.f23421b;
                    if ((i59 & Integer.MIN_VALUE) != 0) {
                        hVar4.f23421b = i59 - Integer.MIN_VALUE;
                        Object obj27 = hVar4.f23420a;
                        lf.a aVar20 = lf.a.f20034a;
                        i29 = hVar4.f23421b;
                        if (i29 != 0) {
                            h8.b.B(obj27);
                            PredictionTable predictionTable = (PredictionTable) obj;
                            ja.b bVar4 = predictionTable == null ? null : new ja.b(predictionTable.getId(), predictionTable.getStartTime(), predictionTable.getPublication(), predictionTable.getType(), predictionTable.getStatus(), predictionTable.getImageBackground(), predictionTable.getOdds(), predictionTable.getResultsIsViewed(), predictionTable.getAnalyticsFull(), predictionTable.getAnalyticsShort(), predictionTable.getLeague(), predictionTable.getForecasts(), predictionTable.getArrayKind(), predictionTable.getArrayPrediction(), predictionTable.getOddsForecast(), predictionTable.getForecast(), predictionTable.getTeamHomeId(), predictionTable.getTeamGuestId(), predictionTable.getTeamHomeFlag(), predictionTable.getTeamGuestFlag(), predictionTable.getTeamHomeName(), predictionTable.getTeamGuestName(), predictionTable.getScoreHome(), predictionTable.getScoreGuest(), predictionTable.getScoreHomeExtra(), predictionTable.getScoreGuestExtra());
                            hVar4.f23421b = 1;
                            if (this.f3478b.d(bVar4, hVar4) == aVar20) {
                                return aVar20;
                            }
                        } else {
                            if (i29 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            h8.b.B(obj27);
                        }
                        return Unit.f19194a;
                    }
                }
                hVar4 = new sb.h(this, continuation);
                Object obj272 = hVar4.f23420a;
                lf.a aVar202 = lf.a.f20034a;
                i29 = hVar4.f23421b;
                if (i29 != 0) {
                }
                return Unit.f19194a;
            case 20:
                if (continuation instanceof sb.i) {
                    iVar = (sb.i) continuation;
                    int i60 = iVar.f23424b;
                    if ((i60 & Integer.MIN_VALUE) != 0) {
                        iVar.f23424b = i60 - Integer.MIN_VALUE;
                        Object obj28 = iVar.f23423a;
                        lf.a aVar21 = lf.a.f20034a;
                        i30 = iVar.f23424b;
                        if (i30 != 0) {
                            h8.b.B(obj28);
                            List list4 = (List) obj;
                            Object D5 = list4 != null ? CollectionsKt.D(list4) : kotlin.collections.e0.f19204a;
                            iVar.f23424b = 1;
                            if (this.f3478b.d(D5, iVar) == aVar21) {
                                return aVar21;
                            }
                        } else {
                            if (i30 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            h8.b.B(obj28);
                        }
                        return Unit.f19194a;
                    }
                }
                iVar = new sb.i(this, continuation);
                Object obj282 = iVar.f23423a;
                lf.a aVar212 = lf.a.f20034a;
                i30 = iVar.f23424b;
                if (i30 != 0) {
                }
                return Unit.f19194a;
            case 21:
                if (continuation instanceof uc.a) {
                    aVar3 = (uc.a) continuation;
                    int i61 = aVar3.f24215b;
                    if ((i61 & Integer.MIN_VALUE) != 0) {
                        aVar3.f24215b = i61 - Integer.MIN_VALUE;
                        Object obj29 = aVar3.f24214a;
                        lf.a aVar22 = lf.a.f20034a;
                        i31 = aVar3.f24215b;
                        if (i31 != 0) {
                            h8.b.B(obj29);
                            Integer num2 = new Integer(((sb.c) obj).f23407b);
                            aVar3.f24215b = 1;
                            if (this.f3478b.d(num2, aVar3) == aVar22) {
                                return aVar22;
                            }
                        } else {
                            if (i31 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            h8.b.B(obj29);
                        }
                        return Unit.f19194a;
                    }
                }
                aVar3 = new uc.a(this, continuation);
                Object obj292 = aVar3.f24214a;
                lf.a aVar222 = lf.a.f20034a;
                i31 = aVar3.f24215b;
                if (i31 != 0) {
                }
                return Unit.f19194a;
            case zg.g.DEBUGMODULES_FIELD_NUMBER /* 22 */:
                if (continuation instanceof uc.b) {
                    bVar = (uc.b) continuation;
                    int i62 = bVar.f24218b;
                    if ((i62 & Integer.MIN_VALUE) != 0) {
                        bVar.f24218b = i62 - Integer.MIN_VALUE;
                        Object obj30 = bVar.f24217a;
                        lf.a aVar23 = lf.a.f20034a;
                        i32 = bVar.f24218b;
                        if (i32 != 0) {
                            h8.b.B(obj30);
                            Integer num3 = new Integer(((sb.c) obj).f23406a);
                            bVar.f24218b = 1;
                            if (this.f3478b.d(num3, bVar) == aVar23) {
                                return aVar23;
                            }
                        } else {
                            if (i32 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            h8.b.B(obj30);
                        }
                        return Unit.f19194a;
                    }
                }
                bVar = new uc.b(this, continuation);
                Object obj302 = bVar.f24217a;
                lf.a aVar232 = lf.a.f20034a;
                i32 = bVar.f24218b;
                if (i32 != 0) {
                }
                return Unit.f19194a;
            case zg.g.ISCRASH_FIELD_NUMBER /* 23 */:
                if (continuation instanceof uc.d) {
                    dVar3 = (uc.d) continuation;
                    int i63 = dVar3.f24223b;
                    if ((i63 & Integer.MIN_VALUE) != 0) {
                        dVar3.f24223b = i63 - Integer.MIN_VALUE;
                        Object obj31 = dVar3.f24222a;
                        lf.a aVar24 = lf.a.f20034a;
                        i33 = dVar3.f24223b;
                        if (i33 != 0) {
                            h8.b.B(obj31);
                            Long l6 = new Long(((sb.a) obj) != null ? r1.f23403d : 0L);
                            dVar3.f24223b = 1;
                            if (this.f3478b.d(l6, dVar3) == aVar24) {
                                return aVar24;
                            }
                        } else {
                            if (i33 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            h8.b.B(obj31);
                        }
                        return Unit.f19194a;
                    }
                }
                dVar3 = new uc.d(this, continuation);
                Object obj312 = dVar3.f24222a;
                lf.a aVar242 = lf.a.f20034a;
                i33 = dVar3.f24223b;
                if (i33 != 0) {
                }
                return Unit.f19194a;
            case zg.g.FORCEINGEST_FIELD_NUMBER /* 24 */:
                if (continuation instanceof uc.e) {
                    eVar2 = (uc.e) continuation;
                    int i64 = eVar2.f24226b;
                    if ((i64 & Integer.MIN_VALUE) != 0) {
                        eVar2.f24226b = i64 - Integer.MIN_VALUE;
                        Object obj32 = eVar2.f24225a;
                        lf.a aVar25 = lf.a.f20034a;
                        i34 = eVar2.f24226b;
                        if (i34 != 0) {
                            h8.b.B(obj32);
                            Long l10 = new Long(((sb.a) obj) != null ? r1.f23402c : 0L);
                            eVar2.f24226b = 1;
                            if (this.f3478b.d(l10, eVar2) == aVar25) {
                                return aVar25;
                            }
                        } else {
                            if (i34 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            h8.b.B(obj32);
                        }
                        return Unit.f19194a;
                    }
                }
                eVar2 = new uc.e(this, continuation);
                Object obj322 = eVar2.f24225a;
                lf.a aVar252 = lf.a.f20034a;
                i34 = eVar2.f24226b;
                if (i34 != 0) {
                }
                return Unit.f19194a;
            case C0122e9.F /* 25 */:
                if (continuation instanceof uc.f) {
                    fVar3 = (uc.f) continuation;
                    int i65 = fVar3.f24229b;
                    if ((i65 & Integer.MIN_VALUE) != 0) {
                        fVar3.f24229b = i65 - Integer.MIN_VALUE;
                        Object obj33 = fVar3.f24228a;
                        lf.a aVar26 = lf.a.f20034a;
                        i35 = fVar3.f24229b;
                        if (i35 != 0) {
                            h8.b.B(obj33);
                            Long l11 = new Long(((sb.a) obj) != null ? r1.f23400a : 0L);
                            fVar3.f24229b = 1;
                            if (this.f3478b.d(l11, fVar3) == aVar26) {
                                return aVar26;
                            }
                        } else {
                            if (i35 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            h8.b.B(obj33);
                        }
                        return Unit.f19194a;
                    }
                }
                fVar3 = new uc.f(this, continuation);
                Object obj332 = fVar3.f24228a;
                lf.a aVar262 = lf.a.f20034a;
                i35 = fVar3.f24229b;
                if (i35 != 0) {
                }
                return Unit.f19194a;
            case C0122e9.G /* 26 */:
                if (continuation instanceof uc.g) {
                    gVar2 = (uc.g) continuation;
                    int i66 = gVar2.f24232b;
                    if ((i66 & Integer.MIN_VALUE) != 0) {
                        gVar2.f24232b = i66 - Integer.MIN_VALUE;
                        Object obj34 = gVar2.f24231a;
                        lf.a aVar27 = lf.a.f20034a;
                        i36 = gVar2.f24232b;
                        if (i36 != 0) {
                            h8.b.B(obj34);
                            Long l12 = new Long(((sb.a) obj) != null ? r1.f23401b : 0L);
                            gVar2.f24232b = 1;
                            if (this.f3478b.d(l12, gVar2) == aVar27) {
                                return aVar27;
                            }
                        } else {
                            if (i36 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            h8.b.B(obj34);
                        }
                        return Unit.f19194a;
                    }
                }
                gVar2 = new uc.g(this, continuation);
                Object obj342 = gVar2.f24231a;
                lf.a aVar272 = lf.a.f20034a;
                i36 = gVar2.f24232b;
                if (i36 != 0) {
                }
                return Unit.f19194a;
            case C0122e9.H /* 27 */:
                if (continuation instanceof uc.h) {
                    hVar5 = (uc.h) continuation;
                    int i67 = hVar5.f24235b;
                    if ((i67 & Integer.MIN_VALUE) != 0) {
                        hVar5.f24235b = i67 - Integer.MIN_VALUE;
                        Object obj35 = hVar5.f24234a;
                        lf.a aVar28 = lf.a.f20034a;
                        i37 = hVar5.f24235b;
                        if (i37 != 0) {
                            h8.b.B(obj35);
                            String email2 = ((UserProfile) obj).getEmail();
                            hVar5.f24235b = 1;
                            if (this.f3478b.d(email2, hVar5) == aVar28) {
                                return aVar28;
                            }
                        } else {
                            if (i37 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            h8.b.B(obj35);
                        }
                        return Unit.f19194a;
                    }
                }
                hVar5 = new uc.h(this, continuation);
                Object obj352 = hVar5.f24234a;
                lf.a aVar282 = lf.a.f20034a;
                i37 = hVar5.f24235b;
                if (i37 != 0) {
                }
                return Unit.f19194a;
            case 28:
                if (continuation instanceof yc.b) {
                    bVar2 = (yc.b) continuation;
                    int i68 = bVar2.f25835b;
                    if ((i68 & Integer.MIN_VALUE) != 0) {
                        bVar2.f25835b = i68 - Integer.MIN_VALUE;
                        Object obj36 = bVar2.f25834a;
                        lf.a aVar29 = lf.a.f20034a;
                        i38 = bVar2.f25835b;
                        if (i38 != 0) {
                            h8.b.B(obj36);
                            List<nc.a> list5 = (List) obj;
                            ArrayList arrayList6 = new ArrayList(kotlin.collections.v.k(list5, 10));
                            for (nc.a aVar30 : list5) {
                                int id2 = aVar30.getId();
                                String name2 = aVar30.getName();
                                if (name2 == null) {
                                    name2 = "";
                                }
                                arrayList6.add(new kc.a(id2, name2, aVar30.getLogo()));
                            }
                            bVar2.f25835b = 1;
                            if (this.f3478b.d(arrayList6, bVar2) == aVar29) {
                                return aVar29;
                            }
                        } else {
                            if (i38 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            h8.b.B(obj36);
                        }
                        return Unit.f19194a;
                    }
                }
                bVar2 = new yc.b(this, continuation);
                Object obj362 = bVar2.f25834a;
                lf.a aVar292 = lf.a.f20034a;
                i38 = bVar2.f25835b;
                if (i38 != 0) {
                }
                return Unit.f19194a;
            default:
                if (continuation instanceof yc.c) {
                    cVar2 = (yc.c) continuation;
                    int i69 = cVar2.f25838b;
                    if ((i69 & Integer.MIN_VALUE) != 0) {
                        cVar2.f25838b = i69 - Integer.MIN_VALUE;
                        Object obj37 = cVar2.f25837a;
                        lf.a aVar31 = lf.a.f20034a;
                        i39 = cVar2.f25838b;
                        if (i39 != 0) {
                            h8.b.B(obj37);
                            ArrayList D6 = CollectionsKt.D((List) obj);
                            ArrayList arrayList7 = new ArrayList();
                            Iterator it4 = D6.iterator();
                            while (it4.hasNext()) {
                                Object next4 = it4.next();
                                if (((nc.a) next4).getName() != null) {
                                    arrayList7.add(next4);
                                }
                            }
                            List R = CollectionsKt.R(arrayList7, new androidx.coordinatorlayout.widget.i(21));
                            if (R != null) {
                                cVar2.f25838b = 1;
                                if (this.f3478b.d(R, cVar2) == aVar31) {
                                    return aVar31;
                                }
                            }
                        } else {
                            if (i39 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            h8.b.B(obj37);
                        }
                        return Unit.f19194a;
                    }
                }
                cVar2 = new yc.c(this, continuation);
                Object obj372 = cVar2.f25837a;
                lf.a aVar312 = lf.a.f20034a;
                i39 = cVar2.f25838b;
                if (i39 != 0) {
                }
                return Unit.f19194a;
        }
    }

    public /* synthetic */ t(hg.h hVar, Object obj, int i5) {
        this.f3477a = i5;
        this.f3478b = hVar;
    }
}
