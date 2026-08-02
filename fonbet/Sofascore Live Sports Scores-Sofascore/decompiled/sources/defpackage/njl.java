package defpackage;

import com.ironsource.U3;
import com.sofascore.model.Country;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.newNetwork.SeasonInfo;
import com.sofascore.model.newNetwork.SeasonInfoResponse;
import com.sofascore.model.newNetwork.UniqueTournamentDetailsResponse;
import com.sofascore.model.newNetwork.UniqueTournamentResponse;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class njl extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ qkl t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ njl(qkl qklVar, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = qklVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        qkl qklVar = this.t;
        switch (i) {
            case 0:
                return new njl(qklVar, rq3Var, 0);
            case 1:
                return new njl(qklVar, rq3Var, 1);
            case 2:
                return new njl(qklVar, rq3Var, 2);
            case 3:
                return new njl(qklVar, rq3Var, 3);
            case 4:
                return new njl(qklVar, rq3Var, 4);
            case 5:
                return new njl(qklVar, rq3Var, 5);
            case 6:
                return new njl(qklVar, rq3Var, 6);
            case 7:
                return new njl(qklVar, rq3Var, 7);
            case 8:
                return new njl(qklVar, rq3Var, 8);
            case 9:
                return new njl(qklVar, rq3Var, 9);
            case 10:
                return new njl(qklVar, rq3Var, 10);
            case 11:
                return new njl(qklVar, rq3Var, 11);
            case 12:
                return new njl(qklVar, rq3Var, 12);
            case 13:
                return new njl(qklVar, rq3Var, 13);
            case 14:
                return new njl(qklVar, rq3Var, 14);
            case 15:
                return new njl(qklVar, rq3Var, 15);
            case 16:
                return new njl(qklVar, rq3Var, 16);
            case 17:
                return new njl(qklVar, rq3Var, 17);
            case 18:
                return new njl(qklVar, rq3Var, 18);
            case 19:
                return new njl(qklVar, rq3Var, 19);
            case 20:
                return new njl(qklVar, rq3Var, 20);
            case 21:
                return new njl(qklVar, rq3Var, 21);
            case 22:
                return new njl(qklVar, rq3Var, 22);
            case 23:
                return new njl(qklVar, rq3Var, 23);
            case 24:
                return new njl(qklVar, rq3Var, 24);
            case 25:
                return new njl(qklVar, rq3Var, 25);
            case 26:
                return new njl(qklVar, rq3Var, 26);
            case 27:
                return new njl(qklVar, rq3Var, 27);
            default:
                return new njl(qklVar, rq3Var, 28);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
        }
        return ((njl) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        Object value;
        ArrayList arrayList;
        Comparator thenComparing;
        SeasonInfo info;
        int i = this.r;
        int i2 = 8;
        int i3 = 0;
        int i4 = 16;
        qkl qklVar = this.t;
        rq3 rq3Var = null;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i5 = this.s;
                if (i5 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    Object r = s9a.r(new njl(qklVar, rq3Var, i2), this);
                    return r == lu3Var ? lu3Var : r;
                }
                if (i5 == 1) {
                    y6a.M(obj);
                    return obj;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i6 = this.s;
                if (i6 == 0) {
                    y6a.M(obj);
                    kgl kglVar = qklVar.x;
                    this.s = 1;
                    kglVar.getClass();
                    obj = kglVar.a(egl.a, 0, this);
                    if (obj == lu3Var2) {
                        return lu3Var2;
                    }
                } else {
                    if (i6 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    qklVar.k(mel.a);
                }
                return Unit.a;
            case 2:
                lu3 lu3Var3 = lu3.a;
                int i7 = this.s;
                if (i7 == 0) {
                    y6a.M(obj);
                    j0j j0jVar = qklVar.o;
                    this.s = 1;
                    obj = j0jVar.f(this);
                    if (obj == lu3Var3) {
                        return lu3Var3;
                    }
                } else {
                    if (i7 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                Iterable iterable = (Iterable) obj;
                ArrayList arrayList2 = new ArrayList(k13.r(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    w1l.A(arrayList2, ((Team) it.next()).getId());
                }
                HashSet Q0 = CollectionsKt.Q0(arrayList2);
                vel velVar = vel.a;
                Map a = vel.a();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : a.entrySet()) {
                    if (Q0.contains(new Integer(((Number) entry.getValue()).intValue()))) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                Set keySet = linkedHashMap.keySet();
                fdi fdiVar = qklVar.G;
                do {
                    value = fdiVar.getValue();
                    vel velVar2 = vel.a;
                    Set keySet2 = vel.a().keySet();
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it2 = keySet2.iterator();
                    while (it2.hasNext()) {
                        Country a2 = dv3.a((String) it2.next());
                        if (a2 != null) {
                            arrayList3.add(a2);
                        }
                    }
                    arrayList = new ArrayList(k13.r(arrayList3, 10));
                    Iterator it3 = arrayList3.iterator();
                    while (it3.hasNext()) {
                        Country country = (Country) it3.next();
                        arrayList.add(new uv3(country.getName(), country.getIso2Alpha(), keySet.contains(country.getIso2Alpha())));
                    }
                    thenComparing = new z(8).thenComparing(new rs2(new vn6(27, Collator.getInstance(Locale.getDefault()), qklVar.i()), 2));
                    thenComparing.getClass();
                } while (!fdiVar.k(value, l6g.W(CollectionsKt.H0(arrayList, thenComparing))));
                return Unit.a;
            case 3:
                lu3 lu3Var4 = lu3.a;
                int i8 = this.s;
                if (i8 != 0) {
                    if (i8 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                w3b w3bVar = qklVar.l;
                this.s = 1;
                w3bVar.getClass();
                Object P = yaa.P(new w0b(w3bVar, rq3Var, i3), this);
                return P == lu3Var4 ? lu3Var4 : P;
            case 4:
                lu3 lu3Var5 = lu3.a;
                int i9 = this.s;
                if (i9 == 0) {
                    y6a.M(obj);
                    w3b w3bVar2 = qklVar.l;
                    this.s = 1;
                    obj = w3bVar2.q0(16, this);
                    if (obj == lu3Var5) {
                        return lu3Var5;
                    }
                } else {
                    if (i9 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                UniqueTournamentResponse uniqueTournamentResponse = (UniqueTournamentResponse) obj;
                if (uniqueTournamentResponse != null) {
                    return uniqueTournamentResponse.getUniqueTournament();
                }
                return null;
            case 5:
                lu3 lu3Var6 = lu3.a;
                int i10 = this.s;
                if (i10 != 0) {
                    if (i10 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                t9c t9cVar = qklVar.m;
                this.s = 1;
                Object d = t9cVar.d(16, 58210, this);
                return d == lu3Var6 ? lu3Var6 : d;
            case 6:
                lu3 lu3Var7 = lu3.a;
                int i11 = this.s;
                if (i11 == 0) {
                    y6a.M(obj);
                    irk irkVar = qklVar.w;
                    this.s = 1;
                    obj = irkVar.b(this);
                    if (obj == lu3Var7) {
                        return lu3Var7;
                    }
                } else {
                    if (i11 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return CollectionsKt.W0((Iterable) obj);
            case 7:
                lu3 lu3Var8 = lu3.a;
                int i12 = this.s;
                if (i12 != 0) {
                    if (i12 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                w3b w3bVar3 = qklVar.l;
                rv8 rv8Var = rv8.b;
                this.s = 1;
                Object w = w3bVar3.w(16, 58210, this, U3.i.l);
                return w == lu3Var8 ? lu3Var8 : w;
            case 8:
                lu3 lu3Var9 = lu3.a;
                int i13 = this.s;
                if (i13 != 0) {
                    if (i13 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                g9i g9iVar = qklVar.N;
                if (g9iVar != null) {
                    g9iVar.e(null);
                }
                hs4 hs4Var = z45.a;
                wjl wjlVar = new wjl(qklVar, null);
                this.s = 1;
                Object R = xw3.R(hs4Var, wjlVar, this);
                return R == lu3Var9 ? lu3Var9 : R;
            case 9:
                lu3 lu3Var10 = lu3.a;
                int i14 = this.s;
                if (i14 != 0) {
                    if (i14 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                w3b w3bVar4 = qklVar.l;
                rv8 rv8Var2 = rv8.b;
                this.s = 1;
                Object w2 = w3bVar4.w(16, 58210, this, U3.i.l);
                return w2 == lu3Var10 ? lu3Var10 : w2;
            case 10:
                lu3 lu3Var11 = lu3.a;
                int i15 = this.s;
                if (i15 != 0) {
                    if (i15 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                pai paiVar = qklVar.n;
                int i16 = amf.e.a;
                this.s = 1;
                Object a3 = paiVar.a(i16, this);
                return a3 == lu3Var11 ? lu3Var11 : a3;
            case 11:
                lu3 lu3Var12 = lu3.a;
                int i17 = this.s;
                if (i17 != 0) {
                    if (i17 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                w3b w3bVar5 = qklVar.l;
                rv8 rv8Var3 = rv8.b;
                this.s = 1;
                Object w3 = w3bVar5.w(16, 58210, this, U3.i.l);
                return w3 == lu3Var12 ? lu3Var12 : w3;
            case 12:
                lu3 lu3Var13 = lu3.a;
                int i18 = this.s;
                if (i18 != 0) {
                    if (i18 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                aya ayaVar = qklVar.r;
                this.s = 1;
                Object b = ayaVar.b(16, this);
                return b == lu3Var13 ? lu3Var13 : b;
            case 13:
                lu3 lu3Var14 = lu3.a;
                int i19 = this.s;
                if (i19 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    Object w4 = qklVar.w(this);
                    return w4 == lu3Var14 ? lu3Var14 : w4;
                }
                if (i19 == 1) {
                    y6a.M(obj);
                    return obj;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 14:
                lu3 lu3Var15 = lu3.a;
                int i20 = this.s;
                if (i20 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    Object x = qklVar.x(this);
                    return x == lu3Var15 ? lu3Var15 : x;
                }
                if (i20 == 1) {
                    y6a.M(obj);
                    return obj;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 15:
                lu3 lu3Var16 = lu3.a;
                int i21 = this.s;
                if (i21 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    Object r2 = s9a.r(new kuj(qklVar, rq3Var, i4), this);
                    return r2 == lu3Var16 ? lu3Var16 : r2;
                }
                if (i21 == 1) {
                    y6a.M(obj);
                    return obj;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 16:
                lu3 lu3Var17 = lu3.a;
                int i22 = this.s;
                if (i22 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    Object r3 = s9a.r(new ajj(qklVar, rq3Var, 12), this);
                    return r3 == lu3Var17 ? lu3Var17 : r3;
                }
                if (i22 == 1) {
                    y6a.M(obj);
                    return obj;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 17:
                lu3 lu3Var18 = lu3.a;
                int i23 = this.s;
                if (i23 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    Object D = qklVar.D(this);
                    return D == lu3Var18 ? lu3Var18 : D;
                }
                if (i23 == 1) {
                    y6a.M(obj);
                    return obj;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 18:
                lu3 lu3Var19 = lu3.a;
                int i24 = this.s;
                if (i24 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    Object z = qklVar.z(this);
                    return z == lu3Var19 ? lu3Var19 : z;
                }
                if (i24 == 1) {
                    y6a.M(obj);
                    return obj;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 19:
                lu3 lu3Var20 = lu3.a;
                int i25 = this.s;
                if (i25 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    Object A = qklVar.A(this);
                    return A == lu3Var20 ? lu3Var20 : A;
                }
                if (i25 == 1) {
                    y6a.M(obj);
                    return obj;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 20:
                lu3 lu3Var21 = lu3.a;
                int i26 = this.s;
                if (i26 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    Object r4 = s9a.r(new kuj(qklVar, rq3Var, 17), this);
                    return r4 == lu3Var21 ? lu3Var21 : r4;
                }
                if (i26 == 1) {
                    y6a.M(obj);
                    return obj;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 21:
                lu3 lu3Var22 = lu3.a;
                int i27 = this.s;
                if (i27 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    Object y = qklVar.y(this);
                    return y == lu3Var22 ? lu3Var22 : y;
                }
                if (i27 == 1) {
                    y6a.M(obj);
                    return obj;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 22:
                lu3 lu3Var23 = lu3.a;
                int i28 = this.s;
                if (i28 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    Object G = qklVar.G(this);
                    return G == lu3Var23 ? lu3Var23 : G;
                }
                if (i28 == 1) {
                    y6a.M(obj);
                    return obj;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 23:
                lu3 lu3Var24 = lu3.a;
                int i29 = this.s;
                if (i29 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    Object r5 = s9a.r(new fkl(qklVar, null), this);
                    return r5 == lu3Var24 ? lu3Var24 : r5;
                }
                if (i29 == 1) {
                    y6a.M(obj);
                    return obj;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 24:
                lu3 lu3Var25 = lu3.a;
                int i30 = this.s;
                if (i30 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    Object E = qklVar.E(this);
                    return E == lu3Var25 ? lu3Var25 : E;
                }
                if (i30 == 1) {
                    y6a.M(obj);
                    return obj;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 25:
                lu3 lu3Var26 = lu3.a;
                int i31 = this.s;
                if (i31 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    Object F = qklVar.F(this);
                    return F == lu3Var26 ? lu3Var26 : F;
                }
                if (i31 == 1) {
                    y6a.M(obj);
                    return obj;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 26:
                lu3 lu3Var27 = lu3.a;
                int i32 = this.s;
                if (i32 == 0) {
                    y6a.M(obj);
                    w3b w3bVar6 = qklVar.l;
                    this.s = 1;
                    obj = w3bVar6.t0(16, this);
                    if (obj == lu3Var27) {
                        return lu3Var27;
                    }
                } else {
                    if (i32 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                UniqueTournamentDetailsResponse uniqueTournamentDetailsResponse = (UniqueTournamentDetailsResponse) obj;
                if (uniqueTournamentDetailsResponse != null) {
                    return uniqueTournamentDetailsResponse.getUniqueTournament();
                }
                return null;
            case 27:
                lu3 lu3Var28 = lu3.a;
                int i33 = this.s;
                if (i33 == 0) {
                    y6a.M(obj);
                    w3b w3bVar7 = qklVar.l;
                    this.s = 1;
                    obj = w3bVar7.E0(16, 58210, this);
                    if (obj == lu3Var28) {
                        return lu3Var28;
                    }
                } else {
                    if (i33 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                SeasonInfoResponse seasonInfoResponse = (SeasonInfoResponse) obj;
                if (seasonInfoResponse == null || (info = seasonInfoResponse.getInfo()) == null) {
                    return null;
                }
                return info.getSeason();
            default:
                lu3 lu3Var29 = lu3.a;
                int i34 = this.s;
                if (i34 == 0) {
                    y6a.M(obj);
                    qklVar.k(kel.a);
                    kgl kglVar2 = qklVar.x;
                    this.s = 1;
                    obj = kglVar2.c(this);
                    if (obj == lu3Var29) {
                        return lu3Var29;
                    }
                } else {
                    if (i34 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                if (!((Boolean) obj).booleanValue()) {
                    qklVar.k(jel.a);
                }
                return Unit.a;
        }
    }
}
