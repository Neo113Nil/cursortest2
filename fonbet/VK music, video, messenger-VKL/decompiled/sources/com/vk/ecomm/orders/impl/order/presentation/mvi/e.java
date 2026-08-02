package com.vk.ecomm.orders.impl.order.presentation.mvi;

import com.vk.ecomm.orders.impl.common.model.OrderPaymentResult;
import com.vk.ecomm.orders.impl.order.presentation.mvi.d;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.NoWhenBranchMatchedException;
import xsna.bm50;
import xsna.gx80;
import xsna.iu80;

/* compiled from: OrderReducer.kt */
/* loaded from: classes18.dex */
public final class e implements bm50<gx80, d> {

    /* compiled from: OrderReducer.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OrderPaymentResult.values().length];
            try {
                iArr[OrderPaymentResult.Success.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrderPaymentResult.Failed.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OrderPaymentResult.Cancelled.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // xsna.bm50
    public final gx80 a(gx80 gx80Var, d dVar) {
        gx80 gx80Var2;
        iu80 iu80Var;
        gx80 gx80Var3 = gx80Var;
        d dVar2 = dVar;
        if (dVar2 instanceof d.a) {
            d.a aVar = (d.a) dVar2;
            if (aVar instanceof d.a.b) {
                return gx80.a(gx80Var3, null, null, null, true, false, false, null, 111);
            }
            if (aVar instanceof d.a.c) {
                return gx80.a(gx80Var3, null, null, null, false, false, true, null, 191);
            }
            if (!(aVar instanceof d.a.C0993d)) {
                if (aVar instanceof d.a.C0992a) {
                    return gx80.a(gx80Var3, null, null, null, false, false, false, ((d.a.C0992a) aVar).a, 39);
                }
                throw new NoWhenBranchMatchedException();
            }
            iu80 iu80Var2 = ((d.a.C0993d) aVar).a;
            int i = iu80Var2.b;
            return gx80.a(gx80Var3, Integer.valueOf(i), iu80Var2.c, iu80Var2, false, false, false, null, 33);
        }
        if (!(dVar2 instanceof d.b)) {
            throw new NoWhenBranchMatchedException();
        }
        d.b bVar = (d.b) dVar2;
        if (bVar instanceof d.b.C0994b) {
            return gx80.a(gx80Var3, null, null, null, false, true, false, null, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE);
        }
        if (!(bVar instanceof d.b.a)) {
            throw new NoWhenBranchMatchedException();
        }
        int i2 = a.$EnumSwitchMapping$0[((d.b.a) bVar).a.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                return gx80.a(gx80Var3, null, null, null, false, false, false, null, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE);
            }
            if (i2 == 3) {
                return gx80.a(gx80Var3, null, null, null, false, false, false, null, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE);
            }
            throw new NoWhenBranchMatchedException();
        }
        iu80 iu80Var3 = gx80Var3.e;
        if (iu80Var3 != null) {
            gx80Var2 = gx80Var3;
            iu80Var = new iu80(iu80Var3.a, iu80Var3.b, iu80Var3.c, iu80Var3.d, iu80Var3.e, iu80Var3.f, iu80Var3.g, iu80Var3.h, iu80Var3.i, iu80Var3.j, iu80Var3.k, iu80Var3.l, iu80Var3.m, iu80Var3.n, iu80Var3.o, iu80Var3.p, false, iu80Var3.r);
        } else {
            gx80Var2 = gx80Var3;
            iu80Var = null;
        }
        return gx80.a(gx80Var2, null, null, iu80Var, false, false, false, null, Sdk.SDKError.Reason.AD_RESPONSE_EMPTY_VALUE);
    }

    @Override // xsna.bm50
    public final /* bridge */ /* synthetic */ boolean b(d dVar) {
        return true;
    }
}
