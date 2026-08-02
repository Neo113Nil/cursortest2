package defpackage;

import android.app.Application;
import com.sofascore.model.fantasy.FantasyLeagueConfig;
import com.sofascore.model.fantasy.FantasyPointsCalculatorItem;
import com.sofascore.results.R;
import com.sofascore.results.fantasy.ui.model.FantasyPlayerFixtureUiModel;
import com.sofascore.results.fantasy.ui.model.FantasyPlayerUiModel;
import com.sofascore.results.fantasy.ui.model.FantasyRoundPlayerUiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class iz6 extends hoi implements Function2 {
    public /* synthetic */ Object A;
    public final /* synthetic */ int B;
    public final /* synthetic */ jz6 C;
    public final /* synthetic */ boolean D;
    public final /* synthetic */ boolean E;
    public final /* synthetic */ int F;
    public final /* synthetic */ int G;
    public zu4 r;
    public av4 s;
    public ev6 t;
    public mj7 u;
    public FantasyRoundPlayerUiModel v;
    public b7 w;
    public Object x;
    public Object y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iz6(int i, jz6 jz6Var, boolean z, boolean z2, int i2, int i3, rq3 rq3Var) {
        super(2, rq3Var);
        this.B = i;
        this.C = jz6Var;
        this.D = z;
        this.E = z2;
        this.F = i2;
        this.G = i3;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        iz6 iz6Var = new iz6(this.B, this.C, this.D, this.E, this.F, this.G, rq3Var);
        iz6Var.A = obj;
        return iz6Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((iz6) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x014a, code lost:
    
        if (r4 == r9) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x012f, code lost:
    
        if (r1 == r9) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x031d, code lost:
    
        if (r1 == r9) goto L145;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0521 A[LOOP:0: B:8:0x0508->B:10:0x0521, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x051e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x04b8 A[LOOP:1: B:33:0x04b2->B:35:0x04b8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x04ec  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x03a6 A[LOOP:2: B:47:0x03a0->B:49:0x03a6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x03e7 A[LOOP:3: B:57:0x03c1->B:59:0x03e7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x051e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0329  */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r15v21 */
    /* JADX WARN: Type inference failed for: r1v24, types: [zu4] */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        int i2;
        Object w;
        zu4 zu4Var;
        av4 av4Var;
        ev6 ev6Var;
        char c;
        Object T;
        mj7 mj7Var;
        Object T2;
        FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel;
        fdi fdiVar;
        b7 K;
        fdi fdiVar2;
        mj7 mj7Var2;
        ev6 ev6Var2;
        a07 a07Var;
        Object w2;
        av4 p;
        mj7 mj7Var3;
        ev6 ev6Var3;
        FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel2;
        a07 a07Var2;
        Object w3;
        String str;
        a07 a07Var3;
        FantasyLeagueConfig fantasyLeagueConfig;
        Object T3;
        Object P;
        b7 b7Var;
        FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel3;
        ev6 ev6Var4;
        mj7 mj7Var4;
        a07 a07Var4;
        List list;
        Iterator it;
        boolean z;
        int i3;
        Object value;
        cz6 cz6Var;
        fdi fdiVar3;
        xbb b;
        Float f;
        rz6 rz6Var;
        rz6 rz6Var2;
        Float f2;
        float f3;
        fdi fdiVar4;
        Iterator it2;
        Object u;
        b7 b7Var2;
        mj7 mj7Var5;
        ev6 ev6Var5;
        FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel4;
        gv9 gv9Var;
        a07 a07Var5;
        int i4;
        gv9 W;
        Object value2;
        az6 az6Var;
        fdi fdiVar5;
        jz6 jz6Var = this.C;
        fdi fdiVar6 = jz6Var.h;
        ku3 ku3Var = (ku3) this.A;
        lu3 lu3Var = lu3.a;
        int i5 = this.z;
        int i6 = this.B;
        int i7 = this.G;
        rq3 rq3Var = null;
        switch (i5) {
            case 0:
                y6a.M(obj);
                i = i7;
                i2 = 0;
                av4 t = xw3.t(ku3Var, null, new hz6(jz6Var, this.B, this.F, this.D, null), 3);
                av4 t2 = xw3.t(ku3Var, null, new fz6(jz6Var, i, rq3Var, i2), 3);
                av4 t3 = xw3.t(ku3Var, null, new fz6(jz6Var, i6, rq3Var, 1), 3);
                this.A = ku3Var;
                this.r = t;
                this.s = t3;
                this.z = 1;
                w = t2.w(this);
                if (w != lu3Var) {
                    zu4Var = t;
                    av4Var = t3;
                    ev6Var = (ev6) w;
                    if (ev6Var == null) {
                        this.A = ku3Var;
                        this.r = zu4Var;
                        this.s = null;
                        this.t = ev6Var;
                        c = 2;
                        this.z = 2;
                        T = av4Var.T(this);
                        break;
                    } else {
                        return Unit.a;
                    }
                }
                return lu3Var;
            case 1:
                av4Var = this.s;
                zu4Var = this.r;
                y6a.M(obj);
                i = i7;
                i2 = 0;
                w = obj;
                ev6Var = (ev6) w;
                if (ev6Var == null) {
                }
                break;
            case 2:
                ev6 ev6Var6 = this.t;
                zu4Var = this.r;
                y6a.M(obj);
                c = 2;
                i = i7;
                i2 = 0;
                ev6Var = ev6Var6;
                T = obj;
                mj7Var = (mj7) T;
                if (mj7Var != null) {
                    this.A = ku3Var;
                    this.r = null;
                    this.s = null;
                    this.t = ev6Var;
                    this.u = mj7Var;
                    this.z = 3;
                    T2 = zu4Var.T(this);
                    break;
                } else {
                    return Unit.a;
                }
            case 3:
                mj7Var = this.u;
                ev6 ev6Var7 = this.t;
                y6a.M(obj);
                c = 2;
                i = i7;
                ev6Var = ev6Var7;
                i2 = 0;
                T2 = obj;
                FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel5 = (FantasyRoundPlayerUiModel) T2;
                if (fantasyRoundPlayerUiModel5 == null) {
                    return Unit.a;
                }
                boolean z2 = fantasyRoundPlayerUiModel5.v;
                FantasyPlayerUiModel fantasyPlayerUiModel = fantasyRoundPlayerUiModel5.g;
                ?? r15 = (!z2 || i6 == ev6Var.i.a) ? 1 : i2;
                mj7 mj7Var6 = mj7Var;
                ev6 ev6Var8 = ev6Var;
                fantasyRoundPlayerUiModel = fantasyRoundPlayerUiModel5;
                fdiVar = fdiVar6;
                av4 p2 = yaa.p(ku3Var, r15, new gz6(jz6Var, this.F, i, null, 0));
                int i8 = ez6.a[ev6Var8.d.ordinal()];
                if (i8 == 1) {
                    uk7 uk7Var = new uk7(new q9k(R.string.pts_per_match), fantasyPlayerUiModel.j, fantasyPlayerUiModel.q, fantasyPlayerUiModel.p, false);
                    uk7 uk7Var2 = new uk7(new q9k(R.string.form), fantasyPlayerUiModel.n, fantasyPlayerUiModel.s, fantasyPlayerUiModel.p, false);
                    q9k q9kVar = new q9k(R.string.selected);
                    Float f4 = fantasyPlayerUiModel.m;
                    K = l6g.K(uk7Var, uk7Var2, new uk7(q9kVar, f4 != null ? yid.q(f4.floatValue(), 1) : "-", fantasyPlayerUiModel.t, fantasyPlayerUiModel.p, false), new uk7(new q9k(R.string.total), fantasyPlayerUiModel.o, fantasyPlayerUiModel.r, fantasyPlayerUiModel.p, false));
                } else {
                    if (i8 != 2) {
                        zzl.b();
                        return null;
                    }
                    q9k q9kVar2 = new q9k(R.string.fantasy_expected_fantasy_points_short);
                    Float f5 = fantasyRoundPlayerUiModel.q;
                    uk7 uk7Var3 = new uk7(q9kVar2, f5 != null ? String.format(dla.d(), "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(f5.floatValue())}, 1)) : "-", fantasyRoundPlayerUiModel.r, fantasyPlayerUiModel.p, false);
                    q9k q9kVar3 = new q9k(R.string.fantasy_elite_faceoff_avg_sofascore_rating);
                    Float f6 = fantasyPlayerUiModel.z;
                    if (f6 == null || (str = String.valueOf(f6.floatValue())) == null) {
                        str = "0.0";
                    }
                    uk7 uk7Var4 = new uk7(q9kVar3, str, fantasyPlayerUiModel.A, fantasyPlayerUiModel.p, true);
                    q9k q9kVar4 = new q9k(R.string.selected);
                    Float f7 = fantasyPlayerUiModel.m;
                    K = l6g.K(uk7Var3, uk7Var4, new uk7(q9kVar4, f7 != null ? yid.q(f7.floatValue(), 1) : "-", fantasyPlayerUiModel.t, fantasyPlayerUiModel.p, false));
                }
                if (z2) {
                    p = yaa.p(ku3Var, !mj7Var6.o, new hs6(jz6Var, ev6Var8, (rq3) null, 5));
                    if (p2 != null) {
                        this.A = null;
                        this.r = null;
                        this.s = null;
                        this.t = ev6Var8;
                        this.u = mj7Var6;
                        this.v = fantasyRoundPlayerUiModel;
                        this.w = K;
                        this.x = p;
                        this.z = 4;
                        w3 = p2.w(this);
                        if (w3 != lu3Var) {
                            mj7Var3 = mj7Var6;
                            ev6Var3 = ev6Var8;
                            fantasyRoundPlayerUiModel2 = fantasyRoundPlayerUiModel;
                            a07Var2 = (a07) w3;
                            if (p != null) {
                                this.A = null;
                                this.r = null;
                                this.s = null;
                                this.t = ev6Var3;
                                this.u = mj7Var3;
                                this.v = fantasyRoundPlayerUiModel2;
                                this.w = K;
                                this.x = null;
                                this.y = a07Var2;
                                this.z = 5;
                                T3 = p.T(this);
                                break;
                            } else {
                                a07Var3 = a07Var2;
                                fantasyLeagueConfig = null;
                                tj7 tj7Var = jz6Var.g;
                                Application application = jz6Var.b;
                                application.getClass();
                                Set keySet = fantasyRoundPlayerUiModel2.y.keySet();
                                Integer num = new Integer(fantasyRoundPlayerUiModel2.g.b);
                                Integer num2 = new Integer(ev6Var3.c);
                                String str2 = fantasyRoundPlayerUiModel2.b.b;
                                Map map = fantasyRoundPlayerUiModel2.y;
                                Map<String, FantasyPointsCalculatorItem> calculator = fantasyLeagueConfig == null ? fantasyLeagueConfig.getCalculator() : null;
                                this.A = null;
                                this.r = null;
                                this.s = null;
                                this.t = ev6Var3;
                                this.u = mj7Var3;
                                this.v = fantasyRoundPlayerUiModel2;
                                this.w = K;
                                this.x = null;
                                this.y = a07Var3;
                                this.z = 6;
                                tj7Var.getClass();
                                P = tz9.P(new qj7(keySet, tj7Var, num, num2, map, application, calculator, str2, false, null), this);
                                if (P != lu3Var) {
                                    b7Var = K;
                                    fantasyRoundPlayerUiModel3 = fantasyRoundPlayerUiModel2;
                                    ev6Var4 = ev6Var3;
                                    mj7Var4 = mj7Var3;
                                    a07Var4 = a07Var3;
                                    list = (List) P;
                                    it = list.iterator();
                                    int i9 = 0;
                                    while (it.hasNext()) {
                                        i9 += ((qx6) it.next()).c;
                                    }
                                    z = this.D;
                                    if (!z && this.E) {
                                        i9 *= 3;
                                    } else if (z) {
                                        i9 *= 2;
                                    }
                                    i3 = i9;
                                    while (true) {
                                        value = fdiVar.getValue();
                                        cz6Var = new cz6(l6g.W(b7Var), l6g.W(list), a07Var4, fantasyRoundPlayerUiModel3, mj7Var4, this.E, ev6Var4, i3);
                                        a07 a07Var6 = a07Var4;
                                        mj7 mj7Var7 = mj7Var4;
                                        ev6 ev6Var9 = ev6Var4;
                                        int i10 = i3;
                                        fdiVar3 = fdiVar;
                                        if (!fdiVar3.k(value, cz6Var)) {
                                            return Unit.a;
                                        }
                                        fdiVar = fdiVar3;
                                        mj7Var4 = mj7Var7;
                                        ev6Var4 = ev6Var9;
                                        a07Var4 = a07Var6;
                                        i3 = i10;
                                    }
                                }
                            }
                        }
                    } else {
                        mj7Var3 = mj7Var6;
                        ev6Var3 = ev6Var8;
                        fantasyRoundPlayerUiModel2 = fantasyRoundPlayerUiModel;
                        a07Var2 = null;
                        if (p != null) {
                        }
                    }
                } else {
                    fdiVar2 = fdiVar;
                    if (p2 != null) {
                        this.A = ku3Var;
                        this.r = null;
                        this.s = null;
                        this.t = ev6Var8;
                        this.u = mj7Var6;
                        this.v = fantasyRoundPlayerUiModel;
                        this.w = K;
                        this.z = 7;
                        w2 = p2.w(this);
                        if (w2 != lu3Var) {
                            mj7Var2 = mj7Var6;
                            ev6Var2 = ev6Var8;
                            a07Var = (a07) w2;
                            fantasyRoundPlayerUiModel.getClass();
                            b = a.b();
                            f = fantasyRoundPlayerUiModel.q;
                            rz6Var = fantasyRoundPlayerUiModel.b;
                            if (f != null) {
                                b.add(new bd7(sx6.c, yid.d("%.1f", Float.valueOf(f.floatValue()))));
                            }
                            rz6Var2 = rz6.h;
                            if ((rz6Var != rz6Var2 || rz6Var == rz6.i) && (f2 = fantasyRoundPlayerUiModel.u) != null) {
                                f3 = 100.0f;
                                fdiVar4 = fdiVar2;
                                b.add(new bd7(sx6.f, yid.q(f2.floatValue() * 100.0f, 0)));
                            } else {
                                fdiVar4 = fdiVar2;
                                f3 = 100.0f;
                            }
                            if (rz6Var != rz6Var2) {
                                Float f8 = fantasyRoundPlayerUiModel.s;
                                if (f8 != null) {
                                    i4 = 0;
                                    b.add(new bd7(sx6.d, yid.q(f8.floatValue() * f3, 0)));
                                } else {
                                    i4 = 0;
                                }
                                Float f9 = fantasyRoundPlayerUiModel.t;
                                if (f9 != null) {
                                    b.add(new bd7(sx6.e, yid.q(f9.floatValue() * f3, i4)));
                                }
                            }
                            gv9 W2 = l6g.W(a.a(b));
                            List list2 = fantasyRoundPlayerUiModel.x;
                            ArrayList arrayList = new ArrayList(k13.r(list2, 10));
                            it2 = list2.iterator();
                            while (it2.hasNext()) {
                                arrayList.add(xw3.t(ku3Var, null, new hs6(jz6Var, (FantasyPlayerFixtureUiModel) it2.next(), (rq3) null, 6), 3));
                            }
                            this.A = null;
                            this.r = null;
                            this.s = null;
                            this.t = ev6Var2;
                            this.u = mj7Var2;
                            this.v = fantasyRoundPlayerUiModel;
                            this.w = K;
                            this.x = a07Var;
                            this.y = W2;
                            this.z = 8;
                            u = m6k.u(arrayList, this);
                            if (u != lu3Var) {
                                mj7 mj7Var8 = mj7Var2;
                                b7Var2 = K;
                                mj7Var5 = mj7Var8;
                                ev6Var5 = ev6Var2;
                                fantasyRoundPlayerUiModel4 = fantasyRoundPlayerUiModel;
                                gv9Var = W2;
                                a07Var5 = a07Var;
                                W = l6g.W(CollectionsKt.H0(CollectionsKt.W((Iterable) u), new v66(13)));
                                while (true) {
                                    value2 = fdiVar4.getValue();
                                    az6Var = new az6(fantasyRoundPlayerUiModel4, mj7Var5, a07Var5, b7Var2, gv9Var, ev6Var5, W);
                                    a07 a07Var7 = a07Var5;
                                    fdiVar5 = fdiVar4;
                                    if (!fdiVar5.k(value2, az6Var)) {
                                        return Unit.a;
                                    }
                                    fdiVar4 = fdiVar5;
                                    a07Var5 = a07Var7;
                                }
                            }
                        }
                    } else {
                        mj7Var2 = mj7Var6;
                        ev6Var2 = ev6Var8;
                        a07Var = null;
                        fantasyRoundPlayerUiModel.getClass();
                        b = a.b();
                        f = fantasyRoundPlayerUiModel.q;
                        rz6Var = fantasyRoundPlayerUiModel.b;
                        if (f != null) {
                        }
                        rz6Var2 = rz6.h;
                        if (rz6Var != rz6Var2) {
                        }
                        f3 = 100.0f;
                        fdiVar4 = fdiVar2;
                        b.add(new bd7(sx6.f, yid.q(f2.floatValue() * 100.0f, 0)));
                        if (rz6Var != rz6Var2) {
                        }
                        gv9 W22 = l6g.W(a.a(b));
                        List list22 = fantasyRoundPlayerUiModel.x;
                        ArrayList arrayList2 = new ArrayList(k13.r(list22, 10));
                        it2 = list22.iterator();
                        while (it2.hasNext()) {
                        }
                        this.A = null;
                        this.r = null;
                        this.s = null;
                        this.t = ev6Var2;
                        this.u = mj7Var2;
                        this.v = fantasyRoundPlayerUiModel;
                        this.w = K;
                        this.x = a07Var;
                        this.y = W22;
                        this.z = 8;
                        u = m6k.u(arrayList2, this);
                        if (u != lu3Var) {
                        }
                    }
                }
                return lu3Var;
            case 4:
                ?? r1 = (zu4) this.x;
                K = this.w;
                fantasyRoundPlayerUiModel2 = this.v;
                mj7Var3 = this.u;
                ev6Var3 = this.t;
                y6a.M(obj);
                p = r1;
                fdiVar = fdiVar6;
                w3 = obj;
                a07Var2 = (a07) w3;
                if (p != null) {
                }
                break;
            case 5:
                a07 a07Var8 = (a07) this.y;
                K = this.w;
                fantasyRoundPlayerUiModel2 = this.v;
                mj7Var3 = this.u;
                ev6Var3 = this.t;
                y6a.M(obj);
                a07Var2 = a07Var8;
                fdiVar = fdiVar6;
                T3 = obj;
                a07 a07Var9 = a07Var2;
                fantasyLeagueConfig = (FantasyLeagueConfig) T3;
                a07Var3 = a07Var9;
                tj7 tj7Var2 = jz6Var.g;
                Application application2 = jz6Var.b;
                application2.getClass();
                Set keySet2 = fantasyRoundPlayerUiModel2.y.keySet();
                Integer num3 = new Integer(fantasyRoundPlayerUiModel2.g.b);
                Integer num22 = new Integer(ev6Var3.c);
                String str22 = fantasyRoundPlayerUiModel2.b.b;
                Map map2 = fantasyRoundPlayerUiModel2.y;
                if (fantasyLeagueConfig == null) {
                }
                this.A = null;
                this.r = null;
                this.s = null;
                this.t = ev6Var3;
                this.u = mj7Var3;
                this.v = fantasyRoundPlayerUiModel2;
                this.w = K;
                this.x = null;
                this.y = a07Var3;
                this.z = 6;
                tj7Var2.getClass();
                P = tz9.P(new qj7(keySet2, tj7Var2, num3, num22, map2, application2, calculator, str22, false, null), this);
                if (P != lu3Var) {
                }
                return lu3Var;
            case 6:
                a07Var3 = (a07) this.y;
                b7 b7Var3 = this.w;
                FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel6 = this.v;
                mj7 mj7Var9 = this.u;
                ev6 ev6Var10 = this.t;
                y6a.M(obj);
                b7Var = b7Var3;
                mj7Var4 = mj7Var9;
                ev6Var4 = ev6Var10;
                fdiVar = fdiVar6;
                P = obj;
                fantasyRoundPlayerUiModel3 = fantasyRoundPlayerUiModel6;
                a07Var4 = a07Var3;
                list = (List) P;
                it = list.iterator();
                int i92 = 0;
                while (it.hasNext()) {
                }
                z = this.D;
                if (!z) {
                    break;
                }
                if (z) {
                }
                i3 = i92;
                while (true) {
                    value = fdiVar.getValue();
                    cz6Var = new cz6(l6g.W(b7Var), l6g.W(list), a07Var4, fantasyRoundPlayerUiModel3, mj7Var4, this.E, ev6Var4, i3);
                    a07 a07Var62 = a07Var4;
                    mj7 mj7Var72 = mj7Var4;
                    ev6 ev6Var92 = ev6Var4;
                    int i102 = i3;
                    fdiVar3 = fdiVar;
                    if (!fdiVar3.k(value, cz6Var)) {
                    }
                    fdiVar = fdiVar3;
                    mj7Var4 = mj7Var72;
                    ev6Var4 = ev6Var92;
                    a07Var4 = a07Var62;
                    i3 = i102;
                }
                break;
            case 7:
                b7 b7Var4 = this.w;
                FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel7 = this.v;
                mj7Var2 = this.u;
                ev6Var2 = this.t;
                y6a.M(obj);
                fantasyRoundPlayerUiModel = fantasyRoundPlayerUiModel7;
                fdiVar2 = fdiVar6;
                K = b7Var4;
                w2 = obj;
                a07Var = (a07) w2;
                fantasyRoundPlayerUiModel.getClass();
                b = a.b();
                f = fantasyRoundPlayerUiModel.q;
                rz6Var = fantasyRoundPlayerUiModel.b;
                if (f != null) {
                }
                rz6Var2 = rz6.h;
                if (rz6Var != rz6Var2) {
                }
                f3 = 100.0f;
                fdiVar4 = fdiVar2;
                b.add(new bd7(sx6.f, yid.q(f2.floatValue() * 100.0f, 0)));
                if (rz6Var != rz6Var2) {
                }
                gv9 W222 = l6g.W(a.a(b));
                List list222 = fantasyRoundPlayerUiModel.x;
                ArrayList arrayList22 = new ArrayList(k13.r(list222, 10));
                it2 = list222.iterator();
                while (it2.hasNext()) {
                }
                this.A = null;
                this.r = null;
                this.s = null;
                this.t = ev6Var2;
                this.u = mj7Var2;
                this.v = fantasyRoundPlayerUiModel;
                this.w = K;
                this.x = a07Var;
                this.y = W222;
                this.z = 8;
                u = m6k.u(arrayList22, this);
                if (u != lu3Var) {
                }
                return lu3Var;
            case 8:
                gv9 gv9Var2 = (gv9) this.y;
                a07 a07Var10 = (a07) this.x;
                b7 b7Var5 = this.w;
                FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel8 = this.v;
                mj7 mj7Var10 = this.u;
                ev6 ev6Var11 = this.t;
                y6a.M(obj);
                a07Var5 = a07Var10;
                fantasyRoundPlayerUiModel4 = fantasyRoundPlayerUiModel8;
                b7Var2 = b7Var5;
                mj7Var5 = mj7Var10;
                gv9Var = gv9Var2;
                fdiVar4 = fdiVar6;
                ev6Var5 = ev6Var11;
                u = obj;
                W = l6g.W(CollectionsKt.H0(CollectionsKt.W((Iterable) u), new v66(13)));
                while (true) {
                    value2 = fdiVar4.getValue();
                    az6Var = new az6(fantasyRoundPlayerUiModel4, mj7Var5, a07Var5, b7Var2, gv9Var, ev6Var5, W);
                    a07 a07Var72 = a07Var5;
                    fdiVar5 = fdiVar4;
                    if (!fdiVar5.k(value2, az6Var)) {
                    }
                    fdiVar4 = fdiVar5;
                    a07Var5 = a07Var72;
                }
                break;
            default:
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
