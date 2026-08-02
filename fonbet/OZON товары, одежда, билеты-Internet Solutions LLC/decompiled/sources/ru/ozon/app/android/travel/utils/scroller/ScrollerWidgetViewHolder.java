package ru.ozon.app.android.travel.utils.scroller;

import android.view.View;
import d20.AbstractC6065b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import l10.i;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\rR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/travel/utils/scroller/ScrollerWidgetViewHolder;", "Ld20/b;", "Lru/ozon/app/android/travel/utils/scroller/ScrollerVO;", "Ll10/i;", "container", "<init>", "(Ll10/i;)V", "item", "", "bind", "(Lru/ozon/app/android/travel/utils/scroller/ScrollerVO;)V", "onRefresh", "()V", "Ll10/i;", "Landroid/view/View;", "metricView", "Landroid/view/View;", "getMetricView", "()Landroid/view/View;", "utils_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ScrollerWidgetViewHolder extends AbstractC6065b<ScrollerVO> {

    @NotNull
    private final i container;
    private final View metricView;

    public ScrollerWidgetViewHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        this.container = container;
    }

    @Override // d20.AbstractC6065b
    public View getMetricView() {
        return this.metricView;
    }

    @Override // d20.AbstractC6065b
    public void onRefresh() {
        ScrollerVO boundData = getBoundData();
        if (boundData != null) {
            this.container.M().m(boundData.getId());
        }
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull ScrollerVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        InterfaceC7851b.a.b(this.container.M(), item.getScrollToWidgetKey(), 0, false, 14);
        this.container.M().update(new ScrollToFieldUpdate(Integer.valueOf(item.getScrollToWidgetKey())));
    }
}
