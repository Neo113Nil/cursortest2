package com.vk.ecomm.market.good.ui;

import android.content.Context;
import android.view.View;
import com.vk.dto.common.Good;
import com.vk.dto.common.LinkButton;
import com.vk.dto.common.data.CallProducerButton;
import com.vk.ecomm.market.good.ui.j;
import java.util.List;
import xsna.cxo;
import xsna.j5g;
import xsna.rdi;
import xsna.yid0;
import xsna.zid0;

/* compiled from: ProductButtonsBinderRefactoredImpl.kt */
/* loaded from: classes18.dex */
public final class k implements j.a {
    public final /* synthetic */ j a;

    public k(j jVar) {
        this.a = jVar;
    }

    @Override // com.vk.ecomm.market.good.ui.j.a
    public final void a() {
        CallProducerButton callProducerButton;
        yid0 yid0Var;
        List<LinkButton> list;
        zid0 zid0Var = this.a.b;
        cxo cxoVar = zid0Var.a;
        Good good = cxoVar.r;
        List x = (good == null || (list = good.W) == null) ? null : rdi.x(list);
        List<CallProducerButton> list2 = cxoVar.y;
        List x2 = list2 != null ? rdi.x(list2) : null;
        if (x == null) {
            if (x2 == null || (callProducerButton = (CallProducerButton) j5g.b0(0, x2)) == null) {
                return;
            }
            zid0Var.a(callProducerButton, true);
            return;
        }
        LinkButton linkButton = (LinkButton) j5g.b0(0, x);
        if (linkButton != null) {
            View view = cxoVar.o;
            Context context = view != null ? view.getContext() : null;
            if (context == null || (yid0Var = cxoVar.O) == null) {
                return;
            }
            yid0Var.i(context, linkButton.c);
        }
    }

    @Override // com.vk.ecomm.market.good.ui.j.a
    public final void b() {
        CallProducerButton callProducerButton;
        yid0 yid0Var;
        List<LinkButton> list;
        zid0 zid0Var = this.a.b;
        cxo cxoVar = zid0Var.a;
        Good good = cxoVar.r;
        List x = (good == null || (list = good.W) == null) ? null : rdi.x(list);
        List<CallProducerButton> list2 = cxoVar.y;
        List x2 = list2 != null ? rdi.x(list2) : null;
        if (x == null) {
            if (x2 == null || (callProducerButton = (CallProducerButton) j5g.b0(1, x2)) == null) {
                return;
            }
            zid0Var.a(callProducerButton, false);
            return;
        }
        LinkButton linkButton = (LinkButton) j5g.b0(1, x);
        if (linkButton != null) {
            View view = cxoVar.o;
            Context context = view != null ? view.getContext() : null;
            if (context == null || (yid0Var = cxoVar.O) == null) {
                return;
            }
            yid0Var.i(context, linkButton.c);
        }
    }

    @Override // com.vk.ecomm.market.good.ui.j.a
    public final void c() {
        yid0 yid0Var = this.a.b.a.O;
        if (yid0Var != null) {
            yid0Var.j();
        }
    }

    @Override // com.vk.ecomm.market.good.ui.j.a
    public final void d() {
        Context context;
        yid0 yid0Var;
        cxo cxoVar = this.a.b.a;
        View view = cxoVar.o;
        if (view == null || (context = view.getContext()) == null || (yid0Var = cxoVar.O) == null) {
            return;
        }
        yid0Var.a(context);
    }

    @Override // com.vk.ecomm.market.good.ui.j.a
    public final void e() {
        yid0 yid0Var = this.a.b.a.O;
        if (yid0Var != null) {
            yid0Var.f();
        }
    }

    @Override // com.vk.ecomm.market.good.ui.j.a
    public final void f() {
        yid0 yid0Var = this.a.b.a.O;
        if (yid0Var != null) {
            yid0Var.b();
        }
    }
}
