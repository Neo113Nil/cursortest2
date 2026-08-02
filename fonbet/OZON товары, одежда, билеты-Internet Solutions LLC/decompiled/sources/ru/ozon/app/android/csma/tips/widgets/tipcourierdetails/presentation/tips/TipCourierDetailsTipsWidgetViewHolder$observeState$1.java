package ru.ozon.app.android.csma.tips.widgets.tipcourierdetails.presentation.tips;

import Sc.InterfaceC4003e;
import androidx.lifecycle.W;
import kotlin.Metadata;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.InterfaceC7732n;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
/* synthetic */ class TipCourierDetailsTipsWidgetViewHolder$observeState$1 implements W, InterfaceC7732n {
    final /* synthetic */ TipCourierDetailsTipsWidgetViewHolder $tmp0;

    TipCourierDetailsTipsWidgetViewHolder$observeState$1(TipCourierDetailsTipsWidgetViewHolder tipCourierDetailsTipsWidgetViewHolder) {
        this.$tmp0 = tipCourierDetailsTipsWidgetViewHolder;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof W) && (obj instanceof InterfaceC7732n)) {
            return Intrinsics.d(getFunctionDelegate(), ((InterfaceC7732n) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.InterfaceC7732n
    public final InterfaceC4003e<?> getFunctionDelegate() {
        return new C7735q(1, this.$tmp0, TipCourierDetailsTipsWidgetViewHolder.class, "bind", "bind(Lru/ozon/app/android/csma/tips/widgets/tipcourierdetails/presentation/tips/TipCourierDetailsTipsVI;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // androidx.lifecycle.W
    public final void onChanged(TipCourierDetailsTipsVI tipCourierDetailsTipsVI) {
        this.$tmp0.bind(tipCourierDetailsTipsVI);
    }
}
