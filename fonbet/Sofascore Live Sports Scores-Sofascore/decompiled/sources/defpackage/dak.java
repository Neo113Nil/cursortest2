package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class dak implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ kx4 b;
    public final /* synthetic */ a6e c;
    public final /* synthetic */ t3e d;
    public final /* synthetic */ float e;
    public final /* synthetic */ int f;
    public final /* synthetic */ tc3 g;

    public /* synthetic */ dak(int i, tc3 tc3Var, kx4 kx4Var, a6e a6eVar, t3e t3eVar, float f) {
        this.f = i;
        this.g = tc3Var;
        this.b = kx4Var;
        this.c = a6eVar;
        this.d = t3eVar;
        this.e = f;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.f;
        int i3 = 0;
        switch (i) {
            case 0:
                yji yjiVar = (yji) obj;
                an3 an3Var = (an3) obj2;
                yjiVar.getClass();
                if (i2 == 0) {
                    return m1c.G0(yjiVar, 0, 0, new crj(28));
                }
                IntRange j = llf.j(0, i2);
                ArrayList arrayList = new ArrayList(k13.r(j, 10));
                v6a it = j.iterator();
                while (true) {
                    boolean z = it.c;
                    tc3 tc3Var = this.g;
                    if (!z) {
                        ArrayList arrayList2 = new ArrayList(k13.r(arrayList, 10));
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(((g1c) CollectionsKt.Y((List) it2.next())).J(an3Var.a));
                        }
                        Iterator it3 = arrayList2.iterator();
                        if (it3.hasNext()) {
                            int i4 = ((qhe) it3.next()).a;
                            while (it3.hasNext()) {
                                int i5 = ((qhe) it3.next()).a;
                                if (i4 < i5) {
                                    i4 = i5;
                                }
                            }
                            Iterator it4 = arrayList2.iterator();
                            if (it4.hasNext()) {
                                int i6 = ((qhe) it4.next()).b;
                                while (true) {
                                    int i7 = i6;
                                    while (it4.hasNext()) {
                                        i6 = ((qhe) it4.next()).b;
                                        if (i7 < i6) {
                                            break;
                                        }
                                    }
                                    g1c g1cVar = (g1c) CollectionsKt.Y(yjiVar.t("pager", new tc3(1318511950, new dak(this.b, this.c, this.d, this.e, i7, tc3Var), true)));
                                    long j2 = an3Var.a;
                                    if (i4 < 0 || i7 < 0) {
                                        t3a.a("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
                                    }
                                    return m1c.G0(yjiVar, i4, i7, new b3(g1cVar.J(cn3.h(i4, i4, i7, i7)), 22));
                                    break;
                                }
                            } else {
                                yhk.d();
                            }
                        } else {
                            yhk.d();
                        }
                        return null;
                    }
                    int nextInt = it.nextInt();
                    arrayList.add(yjiVar.t(ljg.j(nextInt, "page_"), new tc3(369124184, new n61(tc3Var, nextInt, 16), true)));
                }
            default:
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(1 & intValue, (intValue & 3) != 2)) {
                    f6a.a(this.c, bkh.e(bkh.d(utc.a, 1.0f), this.b.C0(i2)), this.d, null, 0, this.e, null, null, false, null, null, null, yqo.H(-2006219667, av8Var, new fak(this.g, i3)), av8Var, 0, 27648, 8152);
                } else {
                    av8Var.W();
                }
                return Unit.a;
        }
    }

    public /* synthetic */ dak(kx4 kx4Var, a6e a6eVar, t3e t3eVar, float f, int i, tc3 tc3Var) {
        this.b = kx4Var;
        this.c = a6eVar;
        this.d = t3eVar;
        this.e = f;
        this.f = i;
        this.g = tc3Var;
    }
}
