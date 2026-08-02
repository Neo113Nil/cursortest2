package defpackage;

import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.UniqueTournament;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class gs7 extends hoi implements Function2 {
    public av4 r;
    public Object s;
    public int t;
    public int u;
    public int v;
    public /* synthetic */ Object w;
    public final /* synthetic */ is7 x;
    public final /* synthetic */ boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gs7(is7 is7Var, boolean z, rq3 rq3Var) {
        super(2, rq3Var);
        this.x = is7Var;
        this.y = z;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        gs7 gs7Var = new gs7(this.x, this.y, rq3Var);
        gs7Var.w = obj;
        return gs7Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((gs7) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x013f, code lost:
    
        if (r0 != r4) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x011d A[LOOP:2: B:26:0x0117->B:28:0x011d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0106  */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        int i2;
        Object w;
        av4 av4Var;
        is7 is7Var;
        Object T;
        is7 is7Var2;
        int i3;
        Object w2;
        av4 av4Var2;
        int i4;
        Iterator it;
        HashSet Q0;
        Object T2;
        fdi fdiVar;
        Object value;
        final is7 is7Var3 = this.x;
        fdi fdiVar2 = is7Var3.n;
        ku3 ku3Var = (ku3) this.w;
        lu3 lu3Var = lu3.a;
        int i5 = this.v;
        final int i6 = 0;
        int i7 = 3;
        int i8 = 2;
        final int i9 = 1;
        rq3 rq3Var = null;
        if (i5 == 0) {
            y6a.M(obj);
            boolean c = Intrinsics.c(fdiVar2.getValue(), is7Var3.r);
            i = !c ? 1 : 0;
            i2 = (!c || is7Var3.s.isEmpty() || is7Var3.t.isEmpty()) ? 1 : 0;
            is7Var3.r = (String) fdiVar2.getValue();
            if (i2 != 0) {
                av4 t = xw3.t(ku3Var, null, new fs7(i7, rq3Var, is7Var3), 3);
                av4 t2 = xw3.t(ku3Var, null, new fs7(i6, rq3Var, is7Var3), 3);
                this.w = ku3Var;
                this.r = t2;
                this.s = is7Var3;
                this.t = i;
                this.u = i2;
                this.v = 1;
                w = t.w(this);
                if (w != lu3Var) {
                    av4Var = t2;
                    is7Var = is7Var3;
                }
                return lu3Var;
            }
            i3 = i2;
            if (i3 == 0) {
            }
            av4 t3 = xw3.t(ku3Var, null, new fs7(i8, rq3Var, is7Var3), 3);
            av4 t4 = xw3.t(ku3Var, null, new fs7(i9, rq3Var, is7Var3), 3);
            this.w = null;
            this.r = t4;
            this.s = null;
            this.t = i;
            this.u = i3;
            this.v = 3;
            w2 = t3.w(this);
            if (w2 != lu3Var) {
            }
            return lu3Var;
        }
        if (i5 == 1) {
            int i10 = this.u;
            int i11 = this.t;
            is7 is7Var4 = (is7) this.s;
            av4 av4Var3 = this.r;
            y6a.M(obj);
            av4Var = av4Var3;
            is7Var = is7Var4;
            i = i11;
            i2 = i10;
            w = obj;
        } else {
            if (i5 == 2) {
                int i12 = this.u;
                int i13 = this.t;
                is7 is7Var5 = (is7) this.s;
                y6a.M(obj);
                is7Var2 = is7Var5;
                i = i13;
                i2 = i12;
                T = obj;
                is7Var2.t = (List) T;
                i3 = i2;
                if (i3 == 0 || this.y) {
                    av4 t32 = xw3.t(ku3Var, null, new fs7(i8, rq3Var, is7Var3), 3);
                    av4 t42 = xw3.t(ku3Var, null, new fs7(i9, rq3Var, is7Var3), 3);
                    this.w = null;
                    this.r = t42;
                    this.s = null;
                    this.t = i;
                    this.u = i3;
                    this.v = 3;
                    w2 = t32.w(this);
                    if (w2 != lu3Var) {
                        av4Var2 = t42;
                        i4 = i;
                        Iterable iterable = (Iterable) w2;
                        ArrayList arrayList = new ArrayList(k13.r(iterable, 10));
                        it = iterable.iterator();
                        while (it.hasNext()) {
                        }
                        Q0 = CollectionsKt.Q0(arrayList);
                        this.w = null;
                        this.r = null;
                        this.s = Q0;
                        this.t = i4;
                        this.u = i3;
                        this.v = 4;
                        T2 = av4Var2.T(this);
                    }
                    return lu3Var;
                }
                fdiVar = is7Var3.o;
                do {
                    value = fdiVar.getValue();
                } while (!fdiVar.k(value, new ws7(is7Var3.u, is7Var3.v)));
                return Unit.a;
            }
            if (i5 != 3) {
                if (i5 != 4) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                HashSet hashSet = (HashSet) this.s;
                y6a.M(obj);
                Q0 = hashSet;
                T2 = obj;
                Iterable iterable2 = (Iterable) T2;
                ArrayList arrayList2 = new ArrayList(k13.r(iterable2, 10));
                Iterator it2 = iterable2.iterator();
                while (it2.hasNext()) {
                    w1l.A(arrayList2, ((UniqueTournament) it2.next()).getId());
                }
                HashSet Q02 = CollectionsKt.Q0(arrayList2);
                is7Var3.u = i5h.q(i5h.g(i5h.h(i5h.g(CollectionsKt.N(is7Var3.s), new Function1() { // from class: es7
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        boolean k;
                        int i14 = i6;
                        is7 is7Var6 = is7Var3;
                        switch (i14) {
                            case 0:
                                k = j31.k(((Team) obj2).getSportSlug(), (String) is7Var6.n.getValue());
                                break;
                            default:
                                k = j31.k(((UniqueTournament) obj2).getSportSlug(), (String) is7Var6.n.getValue());
                                break;
                        }
                        return Boolean.valueOf(k);
                    }
                }), new zq7(Q0, 1)), new dt(is7Var3)));
                is7Var3.v = i5h.q(i5h.h(i5h.g(CollectionsKt.N(is7Var3.t), new Function1() { // from class: es7
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        boolean k;
                        int i14 = i9;
                        is7 is7Var6 = is7Var3;
                        switch (i14) {
                            case 0:
                                k = j31.k(((Team) obj2).getSportSlug(), (String) is7Var6.n.getValue());
                                break;
                            default:
                                k = j31.k(((UniqueTournament) obj2).getSportSlug(), (String) is7Var6.n.getValue());
                                break;
                        }
                        return Boolean.valueOf(k);
                    }
                }), new zq7(Q02, 2)));
                fdiVar = is7Var3.o;
                do {
                    value = fdiVar.getValue();
                } while (!fdiVar.k(value, new ws7(is7Var3.u, is7Var3.v)));
                return Unit.a;
            }
            i3 = this.u;
            i4 = this.t;
            av4 av4Var4 = this.r;
            y6a.M(obj);
            av4Var2 = av4Var4;
            w2 = obj;
            Iterable iterable3 = (Iterable) w2;
            ArrayList arrayList3 = new ArrayList(k13.r(iterable3, 10));
            it = iterable3.iterator();
            while (it.hasNext()) {
                w1l.A(arrayList3, ((Team) it.next()).getId());
            }
            Q0 = CollectionsKt.Q0(arrayList3);
            this.w = null;
            this.r = null;
            this.s = Q0;
            this.t = i4;
            this.u = i3;
            this.v = 4;
            T2 = av4Var2.T(this);
        }
        is7Var.s = (List) w;
        this.w = ku3Var;
        this.r = null;
        this.s = is7Var3;
        this.t = i;
        this.u = i2;
        this.v = 2;
        T = av4Var.T(this);
        if (T != lu3Var) {
            is7Var2 = is7Var3;
            is7Var2.t = (List) T;
            i3 = i2;
            if (i3 == 0) {
            }
            av4 t322 = xw3.t(ku3Var, null, new fs7(i8, rq3Var, is7Var3), 3);
            av4 t422 = xw3.t(ku3Var, null, new fs7(i9, rq3Var, is7Var3), 3);
            this.w = null;
            this.r = t422;
            this.s = null;
            this.t = i;
            this.u = i3;
            this.v = 3;
            w2 = t322.w(this);
            if (w2 != lu3Var) {
            }
        }
        return lu3Var;
    }
}
