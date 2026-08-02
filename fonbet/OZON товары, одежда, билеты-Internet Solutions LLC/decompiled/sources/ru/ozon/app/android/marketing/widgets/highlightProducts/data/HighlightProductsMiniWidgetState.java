package ru.ozon.app.android.marketing.widgets.highlightProducts.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.highlightsWrapper.data.HighlightsCurrentMiniWidget;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/marketing/widgets/highlightProducts/data/HighlightProductsMiniWidgetState;", "", "Lru/ozon/app/android/marketing/widgets/highlightProducts/data/HighlightProductsDTO;", "highlightProducts", "Lru/ozon/app/android/marketing/widgets/highlightsWrapper/data/HighlightsCurrentMiniWidget;", "currentMiniWidget", "<init>", "(Lru/ozon/app/android/marketing/widgets/highlightProducts/data/HighlightProductsDTO;Lru/ozon/app/android/marketing/widgets/highlightsWrapper/data/HighlightsCurrentMiniWidget;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/marketing/widgets/highlightProducts/data/HighlightProductsDTO;", "getHighlightProducts", "()Lru/ozon/app/android/marketing/widgets/highlightProducts/data/HighlightProductsDTO;", "Lru/ozon/app/android/marketing/widgets/highlightsWrapper/data/HighlightsCurrentMiniWidget;", "getCurrentMiniWidget", "()Lru/ozon/app/android/marketing/widgets/highlightsWrapper/data/HighlightsCurrentMiniWidget;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class HighlightProductsMiniWidgetState {
    private final HighlightsCurrentMiniWidget currentMiniWidget;
    private final HighlightProductsDTO highlightProducts;

    public HighlightProductsMiniWidgetState(HighlightProductsDTO highlightProductsDTO, HighlightsCurrentMiniWidget highlightsCurrentMiniWidget) {
        this.highlightProducts = highlightProductsDTO;
        this.currentMiniWidget = highlightsCurrentMiniWidget;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HighlightProductsMiniWidgetState)) {
            return false;
        }
        HighlightProductsMiniWidgetState highlightProductsMiniWidgetState = (HighlightProductsMiniWidgetState) other;
        return Intrinsics.d(this.highlightProducts, highlightProductsMiniWidgetState.highlightProducts) && this.currentMiniWidget == highlightProductsMiniWidgetState.currentMiniWidget;
    }

    public final HighlightsCurrentMiniWidget getCurrentMiniWidget() {
        return this.currentMiniWidget;
    }

    public final HighlightProductsDTO getHighlightProducts() {
        return this.highlightProducts;
    }

    public int hashCode() {
        HighlightProductsDTO highlightProductsDTO = this.highlightProducts;
        int hashCode = (highlightProductsDTO == null ? 0 : highlightProductsDTO.hashCode()) * 31;
        HighlightsCurrentMiniWidget highlightsCurrentMiniWidget = this.currentMiniWidget;
        return hashCode + (highlightsCurrentMiniWidget != null ? highlightsCurrentMiniWidget.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "HighlightProductsMiniWidgetState(highlightProducts=" + this.highlightProducts + ", currentMiniWidget=" + this.currentMiniWidget + ")";
    }
}
