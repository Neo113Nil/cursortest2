package ru.ozon.app.android.csma.tips.widgets.tipcourierreview.presentation.tips;

import Sc.InterfaceC4003e;
import androidx.lifecycle.W;
import kotlin.Metadata;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.InterfaceC7732n;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.csma.tips.widgets.tipcourierreview.presentation.TipCourierReviewVO;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
/* synthetic */ class TipCourierReviewWidgetViewHolder$observeState$1 implements W, InterfaceC7732n {
    final /* synthetic */ TipCourierReviewWidgetViewHolder $tmp0;

    TipCourierReviewWidgetViewHolder$observeState$1(TipCourierReviewWidgetViewHolder tipCourierReviewWidgetViewHolder) {
        this.$tmp0 = tipCourierReviewWidgetViewHolder;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof W) && (obj instanceof InterfaceC7732n)) {
            return Intrinsics.d(getFunctionDelegate(), ((InterfaceC7732n) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.InterfaceC7732n
    public final InterfaceC4003e<?> getFunctionDelegate() {
        return new C7735q(1, this.$tmp0, TipCourierReviewWidgetViewHolder.class, "bind", "bind(Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/presentation/TipCourierReviewVO;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // androidx.lifecycle.W
    public final void onChanged(TipCourierReviewVO tipCourierReviewVO) {
        this.$tmp0.bind(tipCourierReviewVO);
    }
}
