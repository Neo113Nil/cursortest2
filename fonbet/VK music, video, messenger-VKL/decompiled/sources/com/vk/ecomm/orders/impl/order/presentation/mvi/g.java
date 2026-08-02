package com.vk.ecomm.orders.impl.order.presentation.mvi;

import com.vk.dto.common.id.UserId;
import com.vk.ecomm.orders.impl.order.presentation.mvi.d;
import com.vk.ecomm.orders.impl.order.presentation.mvi.f;
import io.reactivex.rxjava3.core.x;
import kotlin.NoWhenBranchMatchedException;
import xsna.bpn0;
import xsna.bx80;
import xsna.c2y;
import xsna.cx00;
import xsna.evg0;
import xsna.gx80;
import xsna.hn50;
import xsna.i37;
import xsna.jm50;
import xsna.jn50;
import xsna.ku70;
import xsna.lh3;
import xsna.nn50;
import xsna.o3y;
import xsna.on50;
import xsna.ox80;
import xsna.q69;
import xsna.qd80;
import xsna.rsg0;
import xsna.sn;
import xsna.tfx;
import xsna.uf3;
import xsna.up;
import xsna.uu80;
import xsna.uw80;
import xsna.uz;
import xsna.yd10;
import xsna.yfb;
import xsna.zvg0;

/* compiled from: OrderTaskExecutor.kt */
/* loaded from: classes18.dex */
public final class g extends evg0<gx80, on50, f, f, d, c> {
    public final qd80 f;
    public final bpn0 g;
    public final bpn0 h;

    public g(nn50 nn50Var, qd80 qd80Var) {
        super(jm50.a.a, nn50Var);
        this.f = qd80Var;
        this.g = new bpn0(new uz(21));
        this.h = new bpn0(new ku70(4));
    }

    @Override // xsna.mn50
    public final jn50 d(hn50 hn50Var) {
        x b;
        f fVar = (f) hn50Var;
        if (fVar instanceof f.a) {
            e(d.a.b.a);
            return s();
        }
        if (fVar instanceof f.c) {
            e(d.a.c.a);
            return s();
        }
        if (!(fVar instanceof f.b)) {
            throw new NoWhenBranchMatchedException();
        }
        e(d.b.C0994b.a);
        Integer num = ((gx80) this.b.getCurrentState()).c;
        if (num != null) {
            int intValue = num.intValue();
            qd80 qd80Var = this.f;
            b = rsg0.w0(yfb.x(((yd10) qd80Var.b).D(intValue))).l(new bx80(new i37(1, (uw80) ((bpn0) qd80Var.e).getValue(), uw80.class, "map", "map(Lcom/vk/api/generated/market/dto/MarketGetOrderPaymentURLResponseDto;)Lcom/vk/dto/market/order/OrderPaymentParameters;", 0, 12), 0)).q(this.d.c());
        } else {
            b = sn.b("orderId should be initialized");
        }
        return g(b, new o3y(this, 12), new ox80(this, 0));
    }

    public final zvg0 s() {
        x xVar;
        nn50<State, TaskId, OutTask, Patch, Event> nn50Var = this.b;
        UserId userId = ((gx80) nn50Var.getCurrentState()).b;
        Integer num = ((gx80) nn50Var.getCurrentState()).c;
        if (userId == null || num == null) {
            xVar = null;
        } else {
            int intValue = num.intValue();
            qd80 qd80Var = this.f;
            ((yd10) qd80Var.b).getClass();
            tfx tfxVar = new tfx("market.getOrderById", new uf3(16), new up(19));
            tfx.l(tfxVar, "order_id", intValue, 0, 0, 8);
            if (userId != null) {
                tfx.n(tfxVar, "user_id", userId, 0L, 0L, 8);
            }
            tfxVar.j("extended", true);
            xVar = rsg0.w0(yfb.x(tfxVar)).l(new lh3(new q69(1, (uu80) ((bpn0) qd80Var.d).getValue(), uu80.class, "map", "map(Lcom/vk/api/generated/market/dto/MarketGetOrderByIdResponseDto;)Lcom/vk/ecomm/orders/impl/order/domain/Order;", 0, 9), 28)).q(this.d.c());
        }
        if (xVar == null) {
            xVar = sn.b("userId and orderId should be initialized");
        }
        return g(xVar, new c2y(this, 17), new cx00(this, 10));
    }
}
