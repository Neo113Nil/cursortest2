package com.vk.ecomm.product_list.presentation;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import com.ironsource.X3;
import com.vk.dto.fave.MarketFavable;
import com.vk.ecomm.product_list.presentation.e;
import com.vk.ecomm.product_list.presentation.j;
import com.vk.ecomm.product_list.router.ProductListInternalParams;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b33;
import xsna.b990;
import xsna.bpn0;
import xsna.bqd0;
import xsna.dw20;
import xsna.ey50;
import xsna.fcn;
import xsna.fcy;
import xsna.fpf0;
import xsna.g86;
import xsna.gd40;
import xsna.hk70;
import xsna.isq;
import xsna.izs;
import xsna.jmu0;
import xsna.kmu0;
import xsna.kr50;
import xsna.lb6;
import xsna.m08;
import xsna.nzw;
import xsna.or50;
import xsna.pcb;
import xsna.pkd0;
import xsna.q530;
import xsna.qcy;
import xsna.qz00;
import xsna.re40;
import xsna.s3q0;
import xsna.spd0;
import xsna.sz00;
import xsna.ts90;
import xsna.tzp0;
import xsna.vpd0;
import xsna.wmd0;
import xsna.ww50;

/* compiled from: ProductListBottomSheet.kt */
/* loaded from: classes18.dex */
public final class a extends jmu0 implements fcn {
    public static final b p1;
    public static final /* synthetic */ qcy<Object>[] q1;
    public final ComposeView h1;
    public final bpn0 i1 = new bpn0(new wmd0(this, 1));
    public final bpn0 j1 = new bpn0(new kr50(this, 17));
    public final bpn0 k1 = new bpn0(new gd40(this, 17));
    public final bpn0 l1 = new bpn0(new re40(this, 17));
    public final bpn0 m1 = new bpn0(new pkd0(1));
    public final bpn0 n1 = new bpn0(new hk70(this, 12));
    public final nzw o1 = new nzw(fpf0.d(bqd0.class).toString(), this, new b990(this, 11));

    /* compiled from: ProductListBottomSheet.kt */
    /* renamed from: com.vk.ecomm.product_list.presentation.a$a, reason: collision with other inner class name */
    public static final class C1001a extends kmu0 {
        public final ProductListInternalParams h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1001a(Context context, ProductListInternalParams productListInternalParams) {
            super(context, new tzp0.c.a(new com.vk.ecomm.product_list.presentation.b(), true));
            a.p1.getClass();
            this.h = productListInternalParams;
            c(new ts90(1.0f, 2));
            x(0);
            F0(true);
            N0();
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            a aVar = new a(S0());
            Bundle bundle = new Bundle();
            bundle.putParcelable("product_list_params", this.h);
            aVar.setArguments(bundle);
            return aVar;
        }
    }

    /* compiled from: ProductListBottomSheet.kt */
    public static final class b {
    }

    /* compiled from: ProductListBottomSheet.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<j, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(j jVar) {
            a.eo((a) this.receiver, jVar);
            return s3q0.a;
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(a.class, X3.i.U, "getStore()Lcom/vk/ecomm/product_list/presentation/ProductListMviStore;", 0);
        fpf0.a.getClass();
        q1 = new qcy[]{propertyReference1Impl};
        p1 = new b();
    }

    public a(ComposeView composeView) {
        this.h1 = composeView;
    }

    public static final void eo(a aVar, j jVar) {
        if (jVar instanceof j.a) {
            super.dismiss();
            return;
        }
        if (jVar instanceof j.b) {
            spd0 spd0Var = (spd0) aVar.k1.getValue();
            vpd0 vpd0Var = ((j.b) jVar).a;
            g86 g86Var = new g86(17, aVar, jVar);
            lb6 lb6Var = new lb6(24, aVar, jVar);
            spd0Var.getClass();
            int i = 12;
            isq.b(spd0Var.b, spd0Var.a, new MarketFavable(vpd0Var.a, vpd0Var.b, null, vpd0Var.j, vpd0Var.i), null, new com.vk.movika.tools.controls.seekbar.l(g86Var, i), new or50(lb6Var, i), false, null, null, 484);
            return;
        }
        if (!(jVar instanceof j.c)) {
            aVar.getClass();
            throw new NoWhenBranchMatchedException();
        }
        q530 q530Var = (q530) aVar.i1.getValue();
        j.c cVar = (j.c) jVar;
        vpd0 vpd0Var2 = cVar.a;
        if (((q530) aVar.i1.getValue()).b(vpd0Var2.h, q530Var.a(vpd0Var2.h))) {
            return;
        }
        aVar.fo().b(new e.g(vpd0Var2.s));
        ((sz00) aVar.l1.getValue()).d(aVar.requireContext(), new qz00(vpd0Var2.a, vpd0Var2.b, cVar.b, null, null, null, null, null, Boolean.valueOf(vpd0Var2.j), cVar.f, cVar.c, cVar.d, cVar.e, 985080));
    }

    @Override // xsna.fcn
    public final boolean M4() {
        return true;
    }

    @Override // xsna.fcn
    public final boolean N8() {
        return false;
    }

    @Override // xsna.vpi
    public final ComposeView ao() {
        return this.h1;
    }

    @Override // xsna.fcn
    public final void b(boolean z) {
        super.dismiss();
    }

    @Override // xsna.vpi
    public final void bo(b33 b33Var) {
        ((m08) this.j1.getValue()).a(new com.vk.ecomm.product_list.presentation.c(this));
        ((q530) this.i1.getValue()).d(new d(this));
        b33Var.setOnShowListener(new pcb(this, 2));
    }

    @Override // xsna.jmu0
    public final void co(int i, androidx.compose.runtime.a aVar) {
        aVar.K(27884547);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(27884547, 8, -1, "com.vk.ecomm.product_list.presentation.ProductListBottomSheet.ThemedContent (ProductListBottomSheet.kt:137)");
        }
        bqd0 fo = fo();
        boolean y = aVar.y(this);
        Object x = aVar.x();
        if (y || x == a.C0011a.a) {
            c cVar = new c(1, this, a.class, "handleEvent", "handleEvent(Lcom/vk/ecomm/product_list/presentation/ProductListMviEvent;)V", 0);
            aVar.R(cVar);
            x = cVar;
        }
        g.c(fo, (izs) ((fcy) x), aVar, 0);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
    }

    public final bqd0 fo() {
        qcy<Object> qcyVar = q1[0];
        return (bqd0) this.o1.getValue();
    }

    @Override // xsna.dw20, xsna.dh6, androidx.fragment.app.d, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        ww50<?> Y;
        super.onDismiss(dialogInterface);
        Object mo2getContext = mo2getContext();
        ey50 ey50Var = mo2getContext instanceof ey50 ? (ey50) mo2getContext : null;
        if (ey50Var == null || (Y = ey50Var.Y()) == null) {
            return;
        }
        Y.H(this);
        s3q0 s3q0Var = s3q0.a;
    }

    @Override // xsna.fcn
    public final boolean v6() {
        return false;
    }
}
