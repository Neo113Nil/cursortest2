package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class xi implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ xi(g0i g0iVar, g0i g0iVar2, g0i g0iVar3, int i, g0i g0iVar4) {
        this.a = 1;
        this.c = g0iVar;
        this.d = g0iVar2;
        this.e = g0iVar3;
        this.b = i;
        this.f = g0iVar4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i;
        Boolean bool;
        boolean z;
        int i2 = this.a;
        Boolean bool2 = null;
        int i3 = this.b;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        int i4 = 0;
        int i5 = 1;
        switch (i2) {
            case 0:
                eld eldVar = (eld) obj5;
                List list = (List) obj4;
                cj cjVar = (cj) obj3;
                Context context = (Context) obj2;
                esa esaVar = (esa) obj;
                esaVar.getClass();
                esaVar.f("regulation_logo", "regulation_logo", new tc3(2091633333, new h66(i3, i5), true));
                if (eldVar != null) {
                    esa.d(esaVar, null, "odds_comparison_item", new tc3(-15902312, new hl6(11, eldVar, cjVar), true), 1);
                }
                ald h = rld.h(i3, true);
                if (h != null) {
                    esaVar.f("additional_regulation_footer", "additional_regulation_footer", new tc3(-1404123950, new si(h, i4), true));
                }
                esaVar.a(list.size(), null, new zi(i4, new ia(3), list), new tc3(802480018, new aj(i4, list, cjVar), true));
                gv9 gv9Var = cjVar.b;
                esaVar.a(gv9Var.size(), null, new zi(i5, new ia(4), gv9Var), new tc3(802480018, new bj(i4, context, gv9Var), true));
                esaVar.f("regulation_footer", "regulation_footer", new tc3(-560472596, new sj(i3, cjVar, i5), true));
                return Unit.a;
            case 1:
                g0i g0iVar = (g0i) obj5;
                g0i g0iVar2 = (g0i) obj4;
                g0i g0iVar3 = (g0i) obj3;
                g0i g0iVar4 = (g0i) obj2;
                int i6 = 28;
                pp3 l0 = ((f55) ((r60) obj).a()).a == 1 ? l98.l0(uo5.n(g0iVar, new q73(i6)).a(uo5.e(g0iVar2, 2)), uo5.f(g0iVar3, 2).a(uo5.p(g0iVar, new q13(i3, i5)))) : l98.l0(uo5.n(g0iVar, new q13(i3, i5)).a(uo5.e(g0iVar2, 2)), uo5.p(g0iVar, new q73(i6)).a(uo5.f(g0iVar3, 2)));
                l0.d = new kkh(true, new fv2(g0iVar4, 7));
                return l0;
            case 2:
                e1d e1dVar = (e1d) obj4;
                znh znhVar = (znh) obj2;
                dma dmaVar = (dma) obj;
                e1dVar.setValue(dmaVar);
                ((znh) obj3).i((int) (dmaVar.e() >> 32));
                View view = ((l8l) obj5).a;
                Rect rect = new Rect();
                view.getWindowVisibleDisplayFrame(rect);
                int i7 = rect.top;
                int i8 = rect.bottom;
                dma dmaVar2 = (dma) e1dVar.getValue();
                oqf r = (dmaVar2 == null || !dmaVar2.f()) ? oqf.e : jca.r(dmaVar2.w(0L), d7a.I(dmaVar2.e()));
                int i9 = i7 + i3;
                int i10 = i8 - i3;
                float f = r.b;
                if (f <= i8) {
                    float f2 = r.d;
                    if (f2 >= i7) {
                        i = wzb.b(Math.max(f - i9, i10 - f2));
                        znhVar.i(Math.max(i, 0));
                        return Unit.a;
                    }
                }
                i = i10 - i9;
                znhVar.i(Math.max(i, 0));
                return Unit.a;
            case 3:
                gv9 gv9Var2 = (gv9) obj5;
                esa esaVar2 = (esa) obj;
                esaVar2.getClass();
                esaVar2.a(gv9Var2.size(), null, new xo(gv9Var2, 13), new tc3(2039820996, new xaa(gv9Var2, this.b, (e1d) obj4, (Function0) obj3, (Function1) obj2), true));
                if (gv9Var2.size() >= 20) {
                    esa.d(esaVar2, null, null, yqo.b, 3);
                }
                return Unit.a;
            default:
                Integer num = (Integer) obj5;
                auj aujVar = (auj) obj4;
                gv9 gv9Var3 = (gv9) obj3;
                muj mujVar = (muj) obj2;
                cuj cujVar = (cuj) obj;
                cujVar.getClass();
                b7g i11 = aujVar != null ? mujVar.l.i(mujVar.i(), aujVar, mujVar.q) : null;
                if (num != null) {
                    bool = Boolean.valueOf(num.intValue() > 1);
                } else {
                    bool = null;
                }
                Boolean bool3 = Boolean.TRUE;
                boolean c = Intrinsics.c(bool, bool3);
                if (num != null) {
                    bool2 = Boolean.valueOf(num.intValue() < i3);
                }
                boolean c2 = Intrinsics.c(bool2, bool3);
                if (gv9Var3 == null || !gv9Var3.isEmpty()) {
                    Iterator<E> it = gv9Var3.iterator();
                    while (it.hasNext()) {
                        if (((k0j) it.next()).e) {
                            z = true;
                            return cuj.a(cujVar, num, i11, c, c2, null, gv9Var3, z, 62223);
                        }
                    }
                }
                z = false;
                return cuj.a(cujVar, num, i11, c, c2, null, gv9Var3, z, 62223);
        }
    }

    public /* synthetic */ xi(int i, int i2, Object obj, Object obj2, Object obj3, Object obj4) {
        this.a = i2;
        this.c = obj;
        this.b = i;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    public /* synthetic */ xi(Integer num, auj aujVar, gv9 gv9Var, muj mujVar, int i) {
        this.a = 4;
        this.c = num;
        this.d = aujVar;
        this.e = gv9Var;
        this.f = mujVar;
        this.b = i;
    }
}
