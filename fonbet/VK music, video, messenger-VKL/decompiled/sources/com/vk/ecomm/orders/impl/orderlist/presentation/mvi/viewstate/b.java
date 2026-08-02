package com.vk.ecomm.orders.impl.orderlist.presentation.mvi.viewstate;

import com.vk.ecomm.orders.impl.orderlist.domain.OrderPreview;
import xsna.sdz;

/* compiled from: OrderListStateToOrderListViewStateMapper.kt */
/* loaded from: classes18.dex */
public final class b {
    public final sdz a;

    /* compiled from: OrderListStateToOrderListViewStateMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OrderPreview.ActionType.values().length];
            try {
                iArr[OrderPreview.ActionType.Payment.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrderPreview.ActionType.Review.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public b(sdz sdzVar) {
        this.a = sdzVar;
    }
}
