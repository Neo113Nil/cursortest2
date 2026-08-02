package defpackage;

import com.sofascore.model.fantasy.FantasyCompetitionType;
import com.sofascore.results.fantasy.ui.model.FantasyRoundPlayerUiModel;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class q77 extends hoi implements Function2 {
    public av4 r;
    public zu4 s;
    public do7 t;
    public int u;
    public float v;
    public int w;
    public /* synthetic */ Object x;
    public final /* synthetic */ r77 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q77(r77 r77Var, rq3 rq3Var) {
        super(2, rq3Var);
        this.y = r77Var;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        q77 q77Var = new q77(this.y, rq3Var);
        q77Var.x = obj;
        return q77Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((q77) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x00fb, code lost:
    
        if (r0 == r2) goto L48;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e3  */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v23, types: [int] */
    /* JADX WARN: Type inference failed for: r1v25, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r3v10, types: [int] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v18, types: [zu4] */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r5v10, types: [zu4] */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        av4 p;
        Object w;
        av4 av4Var;
        boolean z;
        do7 do7Var;
        Object T;
        do7 do7Var2;
        ?? r1;
        Object value;
        boolean z2;
        float f;
        ?? r3;
        List list;
        Object T2;
        List list2;
        final int i;
        final int i2;
        int i3;
        ku3 ku3Var = (ku3) this.x;
        lu3 lu3Var = lu3.a;
        int i4 = this.w;
        int i5 = 3;
        int i6 = 2;
        final r77 r77Var = this.y;
        int i7 = 1;
        rq3 rq3Var = null;
        if (i4 == 0) {
            y6a.M(obj);
            boolean z3 = r77Var.n.c.d == FantasyCompetitionType.WEEKLY;
            av4 t = xw3.t(ku3Var, null, new o77(r77Var, rq3Var, i5), 3);
            av4 p2 = yaa.p(ku3Var, !z3, new o77(r77Var, rq3Var, i6));
            p = yaa.p(ku3Var, z3, new o77(r77Var, rq3Var, i7));
            this.x = ku3Var;
            this.r = p2;
            this.s = p;
            this.u = z3 ? 1 : 0;
            this.w = 1;
            w = t.w(this);
            if (w != lu3Var) {
                av4Var = p2;
                z = z3;
            }
            return lu3Var;
        }
        if (i4 == 1) {
            ?? r12 = this.u;
            ?? r32 = this.s;
            av4Var = this.r;
            y6a.M(obj);
            p = r32;
            z = r12;
            w = obj;
        } else {
            if (i4 != 2) {
                if (i4 != 3) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                float f2 = this.v;
                do7 do7Var3 = this.t;
                y6a.M(obj);
                f = f2;
                do7Var = do7Var3;
                T2 = obj;
                list = (List) T2;
                final do7 do7Var4 = do7Var;
                if (list == null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        o13.v(((e47) it.next()).c, arrayList);
                    }
                    i = arrayList.size();
                } else {
                    i = 0;
                }
                if (list == null) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        o13.v(((e47) it2.next()).c, arrayList2);
                    }
                    if (arrayList2.isEmpty()) {
                        i3 = 0;
                    } else {
                        Iterator it3 = arrayList2.iterator();
                        i3 = 0;
                        while (it3.hasNext()) {
                            if (!((wn1) it3.next()).b() && (i3 = i3 + 1) < 0) {
                                b.p();
                                throw null;
                            }
                        }
                    }
                    i2 = i3;
                } else {
                    i2 = 0;
                }
                final float f3 = f;
                r77Var.o(new Function1(f3, i, i2, r77Var) { // from class: p77
                    public final /* synthetic */ float b;
                    public final /* synthetic */ int c;
                    public final /* synthetic */ int d;

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        do7 do7Var5 = do7.this;
                        ev6 ev6Var = do7Var5.c;
                        xbb b = a.b();
                        if (ev6Var.F) {
                            b.add(r77.t(tl7.g, do7Var5.i, ev6Var.J));
                        }
                        if (ev6Var.G) {
                            b.add(r77.t(tl7.h, do7Var5.j, ev6Var.I));
                        }
                        if (ev6Var.E) {
                            b.add(r77.t(tl7.f, do7Var5.k, ev6Var.H));
                        }
                        return new unb(new n77(do7Var5, this.b, this.c, this.d, l6g.W(a.a(b)), false, false, false, false));
                    }
                });
                return Unit.a;
            }
            r1 = this.u;
            do7Var2 = this.t;
            ?? r5 = this.s;
            y6a.M(obj);
            p = r5;
            T = obj;
            list2 = (List) T;
            if (list2 == null) {
                Iterator it4 = list2.iterator();
                double d = 0.0d;
                while (it4.hasNext()) {
                    d += ((FantasyRoundPlayerUiModel) it4.next()).p != null ? r7.floatValue() : 0.0d;
                }
                f = (float) d;
                do7 do7Var5 = do7Var2;
                r3 = r1;
                do7Var = do7Var5;
                if (p == null) {
                    list = null;
                    final do7 do7Var42 = do7Var;
                    if (list == null) {
                    }
                    if (list == null) {
                    }
                    final float f32 = f;
                    r77Var.o(new Function1(f32, i, i2, r77Var) { // from class: p77
                        public final /* synthetic */ float b;
                        public final /* synthetic */ int c;
                        public final /* synthetic */ int d;

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            do7 do7Var52 = do7.this;
                            ev6 ev6Var = do7Var52.c;
                            xbb b = a.b();
                            if (ev6Var.F) {
                                b.add(r77.t(tl7.g, do7Var52.i, ev6Var.J));
                            }
                            if (ev6Var.G) {
                                b.add(r77.t(tl7.h, do7Var52.j, ev6Var.I));
                            }
                            if (ev6Var.E) {
                                b.add(r77.t(tl7.f, do7Var52.k, ev6Var.H));
                            }
                            return new unb(new n77(do7Var52, this.b, this.c, this.d, l6g.W(a.a(b)), false, false, false, false));
                        }
                    });
                    return Unit.a;
                }
                this.x = null;
                this.r = null;
                this.s = null;
                this.t = do7Var;
                this.u = r3;
                this.v = f;
                this.w = 3;
                T2 = p.T(this);
            } else {
                do7 do7Var6 = do7Var2;
                z2 = r1;
                do7Var = do7Var6;
                f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                r3 = z2;
                if (p == null) {
                }
            }
        }
        do7Var = (do7) w;
        z2 = z;
        if (do7Var == null) {
            fdi fdiVar = r77Var.e;
            do {
                value = fdiVar.getValue();
            } while (!fdiVar.k(value, new snb()));
            return Unit.a;
        }
        if (av4Var != null) {
            this.x = null;
            this.r = null;
            this.s = p;
            this.t = do7Var;
            this.u = z ? 1 : 0;
            this.w = 2;
            T = av4Var.T(this);
            if (T != lu3Var) {
                boolean z4 = z ? 1 : 0;
                do7Var2 = do7Var;
                r1 = z4;
                list2 = (List) T;
                if (list2 == null) {
                }
            }
            return lu3Var;
        }
        f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        r3 = z2;
        if (p == null) {
        }
    }
}
