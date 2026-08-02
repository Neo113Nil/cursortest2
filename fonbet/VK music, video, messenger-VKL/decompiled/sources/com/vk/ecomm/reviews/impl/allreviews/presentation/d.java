package com.vk.ecomm.reviews.impl.allreviews.presentation;

import com.vk.ecomm.reviews.impl.allreviews.presentation.c;
import com.vk.log.L;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.a610;
import xsna.df10;
import xsna.dm50;
import xsna.dxh;
import xsna.ft00;
import xsna.j5g;
import xsna.kt00;
import xsna.tuq;
import xsna.udo;
import xsna.v4v;
import xsna.vr00;
import xsna.wzf;

/* compiled from: MarketAllReviewsReducer.kt */
/* loaded from: classes18.dex */
public final class d extends dm50<e, c, ft00> {
    public final kt00 d;

    public d(ft00 ft00Var) {
        super(ft00Var);
        this.d = new kt00();
    }

    @Override // xsna.dm50
    public final ft00 c(ft00 ft00Var, c cVar) {
        ft00 ft00Var2 = ft00Var;
        c cVar2 = cVar;
        if (cVar2 instanceof c.b) {
            return ft00.a(ft00Var2, null, 0, 0, null, null, 0, null, null, 0, 0, null, false, false, false, true, false, null, null, null, 274431);
        }
        if (cVar2 instanceof c.j) {
            return ft00.a(ft00Var2, null, 0, 0, null, null, 0, null, null, 0, 0, null, false, false, true, false, false, null, null, null, 516095);
        }
        if (cVar2 instanceof c.i) {
            return ft00.a(ft00Var2, null, 0, 0, null, null, 0, null, null, 0, 0, null, false, false, false, false, false, null, null, null, 516095);
        }
        if (cVar2 instanceof c.k) {
            return ft00.a(ft00Var2, null, 0, 0, null, null, 0, null, null, 0, 0, null, false, true, false, false, false, null, null, null, 274431);
        }
        if (cVar2 instanceof c.C1008c) {
            vr00 vr00Var = ((c.C1008c) cVar2).b;
            String str = vr00Var.a;
            int i = vr00Var.b;
            List<a610> list = vr00Var.c;
            String str2 = vr00Var.d;
            int i2 = vr00Var.e;
            List<df10> list2 = vr00Var.f;
            String str3 = vr00Var.g;
            int i3 = vr00Var.h;
            Integer num = vr00Var.i;
            return ft00.a(ft00Var2, str, i, 0, list, str2, i2, list2, str3, i3, num != null ? num.intValue() : 0, vr00Var.j, vr00Var.k, false, false, false, false, null, null, null, 434176);
        }
        if (cVar2 instanceof c.a) {
            return ft00.a(ft00Var2, null, 0, 0, null, null, 0, null, null, 0, 0, null, false, false, false, false, false, ((c.a) cVar2).b, null, null, 405503);
        }
        if (cVar2 instanceof c.h) {
            return ft00.a(ft00Var2, null, 0, 0, null, null, 0, null, null, 0, 0, null, false, false, false, false, true, null, null, null, 360447);
        }
        if (cVar2 instanceof c.g) {
            return ft00.a(ft00Var2, null, 0, 0, null, null, 0, null, null, 0, 0, null, false, false, false, false, false, null, ((c.g) cVar2).b, null, 360447);
        }
        if (cVar2 instanceof c.e) {
            c.e eVar = (c.e) cVar2;
            return ft00.a(ft00Var2, null, 0, 0, null, null, 0, null, null, eVar.b, 0, j5g.u0(eVar.c, ft00Var2.l), eVar.d, false, false, false, false, null, null, null, 356607);
        }
        if (cVar2 instanceof c.f) {
            return ft00.a(ft00Var2, null, 0, 0, null, null, 0, j5g.u0(((c.f) cVar2).b, ft00Var2.h), null, 0, 0, null, false, false, false, false, false, null, null, null, 360383);
        }
        if (cVar2 instanceof c.d) {
            c.d dVar = (c.d) cVar2;
            if (dVar instanceof c.d.a) {
                return ft00.a(ft00Var2, null, 0, 0, ((c.d.a) dVar).b, null, 0, null, null, 0, 0, null, false, false, false, false, false, null, null, null, 524279);
            }
            if (dVar instanceof c.d.b) {
                return ft00.a(ft00Var2, null, 0, ((c.d.b) dVar).b, null, null, 0, null, null, 0, 0, null, false, false, false, false, false, null, null, null, 524283);
            }
            throw new NoWhenBranchMatchedException();
        }
        if (cVar2 instanceof c.m) {
            return ft00.a(ft00Var2, null, 0, 0, null, null, 0, ((c.m) cVar2).b, null, 0, 0, null, false, false, false, false, false, null, null, null, 516031);
        }
        if (cVar2 instanceof c.l) {
            return ft00.a(ft00Var2, null, 0, 0, null, null, 0, null, null, 0, 0, ((c.l) cVar2).b, false, false, false, false, false, null, null, null, 515071);
        }
        if (cVar2 instanceof c.n) {
            return ft00.a(ft00Var2, null, 0, 0, null, null, 0, null, null, 0, 0, null, false, false, false, false, false, null, null, ((c.n) cVar2).b, 98303);
        }
        L.G("Unknown patch " + cVar2);
        return ft00Var2;
    }

    @Override // xsna.dm50
    public final e d() {
        return new e(e(new wzf(this, 27)), e(new udo(this, 24)), e(new v4v(7)), e(new tuq(9)), e(new dxh(this, 22)));
    }

    @Override // xsna.dm50
    public final void h(ft00 ft00Var, e eVar) {
        ft00 ft00Var2 = ft00Var;
        e eVar2 = eVar;
        if (ft00Var2.p) {
            f(eVar2.b, ft00Var2);
            return;
        }
        if (ft00Var2.o) {
            f(eVar2.c, ft00Var2);
            return;
        }
        if (ft00Var2.n) {
            f(eVar2.d, ft00Var2);
        } else if (ft00Var2.r != null) {
            f(eVar2.e, ft00Var2);
        } else {
            f(eVar2.a, ft00Var2);
        }
    }
}
