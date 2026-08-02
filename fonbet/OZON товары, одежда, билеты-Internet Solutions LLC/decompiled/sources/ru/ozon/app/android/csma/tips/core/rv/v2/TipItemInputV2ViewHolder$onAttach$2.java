package ru.ozon.app.android.csma.tips.core.rv.v2;

import Sc.InterfaceC4003e;
import androidx.lifecycle.W;
import kotlin.Metadata;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.InterfaceC7732n;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.csma.tips.widgets.tipcourierdetails.presentation.tips.CourierTipInput;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
/* synthetic */ class TipItemInputV2ViewHolder$onAttach$2 implements W, InterfaceC7732n {
    final /* synthetic */ TipItemInputV2ViewHolder $tmp0;

    TipItemInputV2ViewHolder$onAttach$2(TipItemInputV2ViewHolder tipItemInputV2ViewHolder) {
        this.$tmp0 = tipItemInputV2ViewHolder;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof W) && (obj instanceof InterfaceC7732n)) {
            return Intrinsics.d(getFunctionDelegate(), ((InterfaceC7732n) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.InterfaceC7732n
    public final InterfaceC4003e<?> getFunctionDelegate() {
        return new C7735q(1, this.$tmp0, TipItemInputV2ViewHolder.class, "bind", "bind(Lru/ozon/app/android/csma/tips/widgets/tipcourierdetails/presentation/tips/CourierTipInput;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // androidx.lifecycle.W
    public final void onChanged(CourierTipInput courierTipInput) {
        this.$tmp0.bind(courierTipInput);
    }
}
