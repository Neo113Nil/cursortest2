package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.newNetwork.UniqueTournamentResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ka3 extends hoi implements Function2 {
    public final /* synthetic */ la3 A;
    public final /* synthetic */ int B;
    public final /* synthetic */ int C;
    public final /* synthetic */ boolean D;
    public la3 r;
    public UniqueTournament s;
    public dhk t;
    public int u;
    public int v;
    public int w;
    public boolean x;
    public boolean y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ka3(la3 la3Var, int i, int i2, boolean z, rq3 rq3Var) {
        super(2, rq3Var);
        this.A = la3Var;
        this.B = i;
        this.C = i2;
        this.D = z;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new ka3(this.A, this.B, this.C, this.D, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ka3) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x019f, code lost:
    
        if (r3.f0(r11, r19) == r1) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01a3, code lost:
    
        r4 = r2;
        r2 = r5;
        r5 = r6;
        r6 = r9;
        r9 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01d6, code lost:
    
        if (r3.R(r12, r4, r17, r19) == r1) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0088, code lost:
    
        if (r2 == r1) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x027b A[LOOP:0: B:42:0x0109->B:58:0x027b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0174 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x026c  */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object q0;
        UniqueTournament uniqueTournament;
        Object b;
        int i;
        int i2;
        la3 la3Var;
        boolean z;
        UniqueTournament uniqueTournament2;
        int i3;
        boolean contains;
        int i4;
        int i5;
        boolean z2;
        la3 la3Var2;
        Object U;
        la3 la3Var3;
        int i6;
        fdi fdiVar;
        Object value;
        ha3 ha3Var;
        ArrayList arrayList;
        Iterator it;
        boolean z3;
        int i7;
        int i8;
        boolean z4;
        int i9;
        Integer num;
        Object b2;
        dhk dhkVar;
        boolean z5;
        int i10;
        la3 la3Var4;
        SharedPreferences d;
        int i11;
        boolean z6;
        int i12;
        lu3 lu3Var = lu3.a;
        switch (this.z) {
            case 0:
                y6a.M(obj);
                w3b w3bVar = this.A.h;
                int i13 = this.B;
                this.z = 1;
                q0 = w3bVar.q0(i13, this);
                break;
            case 1:
                y6a.M(obj);
                q0 = obj;
                UniqueTournamentResponse uniqueTournamentResponse = (UniqueTournamentResponse) q0;
                if (uniqueTournamentResponse != null && (uniqueTournament = uniqueTournamentResponse.getUniqueTournament()) != null) {
                    la3 la3Var5 = this.A;
                    int i14 = this.B;
                    int i15 = this.C;
                    boolean z7 = this.D;
                    w3b w3bVar2 = la3Var5.h;
                    this.r = la3Var5;
                    this.s = uniqueTournament;
                    this.u = i14;
                    this.v = i15;
                    this.x = z7;
                    this.w = 0;
                    this.z = 2;
                    b = w3bVar2.b(this);
                    if (b != lu3Var) {
                        i = i14;
                        i2 = i15;
                        la3Var = la3Var5;
                        z = z7;
                        uniqueTournament2 = uniqueTournament;
                        i3 = 0;
                        contains = ((Set) b).contains(new Integer(i));
                        if (contains) {
                            i4 = i3;
                            i5 = i2;
                            z2 = contains;
                            la3Var2 = la3Var;
                            i6 = -1;
                            fdiVar = la3Var2.k;
                            while (true) {
                                value = fdiVar.getValue();
                                ha3Var = (ha3) value;
                                List list = ha3Var.c;
                                arrayList = new ArrayList(k13.r(list, 10));
                                it = list.iterator();
                                while (it.hasNext()) {
                                }
                                int i16 = i5;
                                if (fdiVar.k(value, ha3.a(ha3Var, null, arrayList, 3))) {
                                }
                                i5 = i16;
                            }
                        } else {
                            w3b w3bVar3 = la3Var.h;
                            this.r = la3Var;
                            this.s = uniqueTournament2;
                            this.u = i;
                            this.v = i2;
                            this.x = z;
                            this.w = i3;
                            this.y = contains;
                            this.z = 3;
                            U = gz8.U(this, w3bVar3.a.a, true, false, new kwi(i, 8));
                            if (U != lu3Var) {
                                i4 = i3;
                                z2 = contains;
                                la3Var3 = la3Var;
                                num = (Integer) U;
                                if (num == null) {
                                    i6 = num.intValue();
                                    i5 = i2;
                                    la3Var2 = la3Var3;
                                    fdiVar = la3Var2.k;
                                    while (true) {
                                        value = fdiVar.getValue();
                                        ha3Var = (ha3) value;
                                        List list2 = ha3Var.c;
                                        arrayList = new ArrayList(k13.r(list2, 10));
                                        it = list2.iterator();
                                        while (it.hasNext()) {
                                            w93 w93Var = (w93) it.next();
                                            Iterator it2 = it;
                                            int i17 = i5;
                                            if (Intrinsics.c(uniqueTournament2.getSportSlug(), Sports.TENNIS)) {
                                                w93Var = la3.k(w93Var, uniqueTournament2.getId(), z2);
                                            } else if (w93Var.b.getId() == uniqueTournament2.getCategory().getId()) {
                                                w93Var = la3.k(w93Var, uniqueTournament2.getId(), z2);
                                            }
                                            arrayList.add(w93Var);
                                            it = it2;
                                            i5 = i17;
                                        }
                                        int i162 = i5;
                                        if (fdiVar.k(value, ha3.a(ha3Var, null, arrayList, 3))) {
                                            if (!z2) {
                                                nv.y(la3Var2.i(), vu.PIN_LEAGUE, xu.UNIQUE_TOURNAMENT, uniqueTournament2.getId(), wu.MAIN_LEAGUES);
                                                w3b w3bVar4 = la3Var2.h;
                                                String str = la3Var2.j;
                                                this.r = la3Var2;
                                                this.s = null;
                                                this.u = i;
                                                this.x = z;
                                                this.v = i4;
                                                this.y = z2;
                                                this.w = i6;
                                                this.z = 5;
                                                break;
                                            } else {
                                                nv.y(la3Var2.i(), vu.UNPIN_LEAGUE, xu.UNIQUE_TOURNAMENT, uniqueTournament2.getId(), wu.MAIN_LEAGUES);
                                                w3b w3bVar5 = la3Var2.h;
                                                this.r = la3Var2;
                                                this.s = null;
                                                this.u = i;
                                                this.x = z;
                                                this.v = i4;
                                                this.y = z2;
                                                this.w = i6;
                                                this.z = 4;
                                                break;
                                            }
                                            if (!la3Var2.q) {
                                                Context i18 = la3Var2.i();
                                                SharedPreferences sharedPreferences = uic.j;
                                                if (sharedPreferences == null) {
                                                    Context applicationContext = i18.getApplicationContext();
                                                    synchronized (uic.i) {
                                                        d = a5f.d(applicationContext);
                                                        uic.j = d;
                                                    }
                                                    d.getClass();
                                                    sharedPreferences = d;
                                                }
                                                SharedPreferences.Editor i19 = dmi.i(sharedPreferences, "PINNED_RESET_DONE_V2", true);
                                                Unit unit = Unit.a;
                                                i19.apply();
                                                la3Var2.q = true;
                                            }
                                            if (la3Var2.e.b().getIsLoggedIn()) {
                                                dhk dhkVar2 = la3Var2.i;
                                                w3b w3bVar6 = la3Var2.h;
                                                this.r = la3Var2;
                                                this.s = null;
                                                this.t = dhkVar2;
                                                this.u = i9;
                                                this.x = z4;
                                                this.v = i8;
                                                this.y = z3;
                                                this.w = i7;
                                                this.z = 6;
                                                b2 = w3bVar6.b(this);
                                                if (b2 != lu3Var) {
                                                    la3 la3Var6 = la3Var2;
                                                    dhkVar = dhkVar2;
                                                    z5 = z4;
                                                    i10 = i8;
                                                    la3Var4 = la3Var6;
                                                    this.r = la3Var4;
                                                    this.s = null;
                                                    this.t = null;
                                                    this.u = i9;
                                                    this.x = z5;
                                                    this.v = i10;
                                                    this.y = z3;
                                                    this.w = i7;
                                                    this.z = 7;
                                                    dhkVar.getClass();
                                                    if (yaa.P(new pgk(dhkVar, (Set) b2, null, 4), this) != lu3Var) {
                                                        i11 = i7;
                                                        z6 = z3;
                                                        i12 = i9;
                                                        z4 = z5;
                                                        i9 = i12;
                                                        la3Var2 = la3Var4;
                                                        z3 = z6;
                                                        i7 = i11;
                                                    }
                                                }
                                            }
                                            if (!z4) {
                                                la3Var2.o.d(new ia3(i9, i7, !z3));
                                            }
                                        } else {
                                            i5 = i162;
                                        }
                                    }
                                } else {
                                    i5 = i2;
                                    la3Var2 = la3Var3;
                                    i6 = -1;
                                    fdiVar = la3Var2.k;
                                    while (true) {
                                        value = fdiVar.getValue();
                                        ha3Var = (ha3) value;
                                        List list22 = ha3Var.c;
                                        arrayList = new ArrayList(k13.r(list22, 10));
                                        it = list22.iterator();
                                        while (it.hasNext()) {
                                        }
                                        int i1622 = i5;
                                        if (fdiVar.k(value, ha3.a(ha3Var, null, arrayList, 3))) {
                                        }
                                        i5 = i1622;
                                    }
                                }
                            }
                        }
                    }
                    return lu3Var;
                }
                ad2 ad2Var = qv5.a;
                qv5.a(new u42(this.B));
                return Unit.a;
            case 2:
                i3 = this.w;
                z = this.x;
                i2 = this.v;
                i = this.u;
                uniqueTournament2 = this.s;
                la3 la3Var7 = this.r;
                y6a.M(obj);
                la3Var = la3Var7;
                b = obj;
                contains = ((Set) b).contains(new Integer(i));
                if (contains) {
                }
                break;
            case 3:
                z2 = this.y;
                i4 = this.w;
                z = this.x;
                i2 = this.v;
                i = this.u;
                uniqueTournament2 = this.s;
                la3Var3 = this.r;
                y6a.M(obj);
                U = obj;
                num = (Integer) U;
                if (num == null) {
                }
                break;
            case 4:
            case 5:
                i7 = this.w;
                z3 = this.y;
                i8 = this.v;
                z4 = this.x;
                i9 = this.u;
                la3Var2 = this.r;
                y6a.M(obj);
                if (!la3Var2.q) {
                }
                if (la3Var2.e.b().getIsLoggedIn()) {
                }
                if (!z4) {
                }
                ad2 ad2Var2 = qv5.a;
                qv5.a(new u42(this.B));
                return Unit.a;
            case 6:
                i7 = this.w;
                z3 = this.y;
                int i20 = this.v;
                boolean z8 = this.x;
                i9 = this.u;
                dhkVar = this.t;
                la3 la3Var8 = this.r;
                y6a.M(obj);
                b2 = obj;
                z5 = z8;
                i10 = i20;
                la3Var4 = la3Var8;
                this.r = la3Var4;
                this.s = null;
                this.t = null;
                this.u = i9;
                this.x = z5;
                this.v = i10;
                this.y = z3;
                this.w = i7;
                this.z = 7;
                dhkVar.getClass();
                if (yaa.P(new pgk(dhkVar, (Set) b2, null, 4), this) != lu3Var) {
                }
                return lu3Var;
            case 7:
                i11 = this.w;
                z6 = this.y;
                z5 = this.x;
                i12 = this.u;
                la3Var4 = this.r;
                y6a.M(obj);
                z4 = z5;
                i9 = i12;
                la3Var2 = la3Var4;
                z3 = z6;
                i7 = i11;
                if (!z4) {
                }
                ad2 ad2Var22 = qv5.a;
                qv5.a(new u42(this.B));
                return Unit.a;
            default:
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
