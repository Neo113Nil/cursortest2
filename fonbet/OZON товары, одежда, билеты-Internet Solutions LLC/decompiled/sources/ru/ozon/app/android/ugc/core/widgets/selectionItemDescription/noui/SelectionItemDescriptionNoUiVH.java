package ru.ozon.app.android.ugc.core.widgets.selectionItemDescription.noui;

import WZ.l;
import WZ.t;
import android.view.View;
import d20.AbstractC6065b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.ugc.core.widgets.selectionItemDescription.core.SelectionItemDescriptionScrollViewModel;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rR\u0018\u0010\u0005\u001a\u00060\u0003j\u0002`\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000fR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/selectionItemDescription/noui/SelectionItemDescriptionNoUiVH;", "Ld20/b;", "Lru/ozon/app/android/ugc/core/widgets/selectionItemDescription/noui/SelectionItemDescriptionVO;", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lru/ozon/app/android/ugc/core/widgets/selectionItemDescription/core/SelectionItemDescriptionScrollViewModel;", "scrollViewModel", "<init>", "(LWZ/l;Lru/ozon/app/android/ugc/core/widgets/selectionItemDescription/core/SelectionItemDescriptionScrollViewModel;)V", "item", "", "bind", "(Lru/ozon/app/android/ugc/core/widgets/selectionItemDescription/noui/SelectionItemDescriptionVO;)V", "LWZ/l;", "Lru/ozon/app/android/ugc/core/widgets/selectionItemDescription/core/SelectionItemDescriptionScrollViewModel;", "Landroid/view/View;", "metricView", "Landroid/view/View;", "getMetricView", "()Landroid/view/View;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SelectionItemDescriptionNoUiVH extends AbstractC6065b<SelectionItemDescriptionVO> {
    private final View metricView;

    @NotNull
    private final SelectionItemDescriptionScrollViewModel scrollViewModel;

    @NotNull
    private final l tokenizedAnalytics;

    public SelectionItemDescriptionNoUiVH(@NotNull l tokenizedAnalytics, @NotNull SelectionItemDescriptionScrollViewModel scrollViewModel) {
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(scrollViewModel, "scrollViewModel");
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.scrollViewModel = scrollViewModel;
    }

    @Override // d20.AbstractC6065b
    public View getMetricView() {
        return this.metricView;
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull SelectionItemDescriptionVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, tokenizedEvent, null, 2, null);
        }
        this.scrollViewModel.setPendingScroll(item.getScrollPosition());
    }
}
