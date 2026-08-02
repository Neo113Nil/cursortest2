package ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.presentation;

import Sc.InterfaceC4003e;
import androidx.lifecycle.W;
import kotlin.Metadata;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.InterfaceC7732n;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
/* synthetic */ class ToursSearchResultWidgetViewHolder$subscribe$1$1 implements W, InterfaceC7732n {
    final /* synthetic */ ToursSearchResultWidgetViewHolder $tmp0;

    ToursSearchResultWidgetViewHolder$subscribe$1$1(ToursSearchResultWidgetViewHolder toursSearchResultWidgetViewHolder) {
        this.$tmp0 = toursSearchResultWidgetViewHolder;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof W) && (obj instanceof InterfaceC7732n)) {
            return Intrinsics.d(getFunctionDelegate(), ((InterfaceC7732n) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.InterfaceC7732n
    public final InterfaceC4003e<?> getFunctionDelegate() {
        return new C7735q(1, this.$tmp0, ToursSearchResultWidgetViewHolder.class, "processEmptyState", "processEmptyState(Ljava/lang/Object;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // androidx.lifecycle.W
    public final void onChanged(Object obj) {
        this.$tmp0.processEmptyState(obj);
    }
}
