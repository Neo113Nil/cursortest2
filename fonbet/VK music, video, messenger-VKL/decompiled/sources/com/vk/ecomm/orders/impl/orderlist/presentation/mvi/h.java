package com.vk.ecomm.orders.impl.orderlist.presentation.mvi;

import com.vk.ecomm.orders.api.model.ReviewSuggestion;
import com.vk.ecomm.orders.impl.orderlist.presentation.mvi.c;
import com.vk.ecomm.orders.impl.orderlist.presentation.mvi.d;
import com.vk.ecomm.orders.impl.orderlist.presentation.mvi.f;
import io.reactivex.rxjava3.internal.operators.observable.s0;
import java.util.concurrent.Callable;
import kotlin.NoWhenBranchMatchedException;
import xsna.awg0;
import xsna.bpn0;
import xsna.cd10;
import xsna.dw80;
import xsna.evg0;
import xsna.fl30;
import xsna.hms;
import xsna.hn50;
import xsna.im80;
import xsna.jm50;
import xsna.jn50;
import xsna.jw80;
import xsna.nn50;
import xsna.on50;
import xsna.pf8;
import xsna.pm0;
import xsna.rsg0;
import xsna.s3q0;
import xsna.tf3;
import xsna.tfx;
import xsna.u5;
import xsna.ubq;
import xsna.up0;
import xsna.uu60;
import xsna.uw80;
import xsna.vv80;
import xsna.yd10;
import xsna.yfb;

/* compiled from: OrderListTaskExecutor.kt */
/* loaded from: classes18.dex */
public final class h extends evg0<dw80, on50, f, f, d, c> {
    public final vv80 f;
    public final bpn0 g;

    public h(nn50 nn50Var) {
        super(jm50.a.a, nn50Var);
        this.f = new vv80(new yd10());
        this.g = new bpn0(new im80(1));
    }

    @Override // xsna.mn50
    public final jn50 d(hn50 hn50Var) {
        final f fVar = (f) hn50Var;
        return awg0.a.b(this, new s0(new Callable() { // from class: com.vk.ecomm.orders.impl.orderlist.presentation.mvi.g
            @Override // java.util.concurrent.Callable
            public final Object call() {
                final h hVar = this;
                vv80 vv80Var = hVar.f;
                f fVar2 = f.this;
                if (fVar2 instanceof f.d) {
                    final dw80 dw80Var = (dw80) hVar.b.getCurrentState();
                    ((f.d) fVar2).getClass();
                    hVar.g(vv80Var.a(0), new hms(hVar, 21), new io.reactivex.rxjava3.functions.f() { // from class: xsna.kw80
                        @Override // io.reactivex.rxjava3.functions.f
                        public final void accept(Object obj) {
                            d.b.C0997b c0997b = new d.b.C0997b((gy80) obj);
                            com.vk.ecomm.orders.impl.orderlist.presentation.mvi.h hVar2 = com.vk.ecomm.orders.impl.orderlist.presentation.mvi.h.this;
                            hVar2.e(c0997b);
                            ReviewSuggestion reviewSuggestion = dw80Var.d;
                            if (reviewSuggestion != null) {
                                hVar2.c(new c.i(reviewSuggestion));
                            }
                        }
                    });
                } else if (fVar2 instanceof f.c) {
                    f.c cVar = (f.c) fVar2;
                    cVar.getClass();
                    hVar.g(vv80Var.a(cVar.b), new fl30(hVar, 9), new jw80(hVar, 0));
                } else if (fVar2 instanceof f.a) {
                    f.a aVar = (f.a) fVar2;
                    int i = aVar.b;
                    vv80Var.a.getClass();
                    tfx tfxVar = new tfx("market.setOrderAsViewed", new pm0(21), new tf3(18));
                    tfx.l(tfxVar, "order_id", i, 0, 0, 8);
                    hVar.g(rsg0.w0(yfb.x(tfxVar)).l(new u5(new cd10(5), 25)), io.reactivex.rxjava3.internal.functions.a.f, new up0(1, hVar, aVar));
                } else {
                    if (!(fVar2 instanceof f.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    hVar.g(rsg0.w0(yfb.x(vv80Var.a.D(((f.b) fVar2).b))).l(new com.vk.movika.sdk.base.flow.binding.c(new pf8(1, (uw80) vv80Var.c.getValue(), uw80.class, "map", "map(Lcom/vk/api/generated/market/dto/MarketGetOrderPaymentURLResponseDto;)Lcom/vk/dto/market/order/OrderPaymentParameters;", 0, 9), 29)), new ubq(hVar, 21), new uu60(hVar, 4));
                }
                return s3q0.a;
            }
        }).r0(this.d.c()), null, null, null, 7);
    }
}
