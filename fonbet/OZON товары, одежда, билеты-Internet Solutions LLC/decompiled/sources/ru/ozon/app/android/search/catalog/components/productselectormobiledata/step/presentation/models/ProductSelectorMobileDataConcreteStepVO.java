package ru.ozon.app.android.search.catalog.components.productselectormobiledata.step.presentation.models;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.search.catalog.components.productselectormobiledata.core.SelectorDataActionBarModel;
import ru.ozon.app.android.search.catalog.components.productselectormobiledata.data.ProductSelectorMobileDataDTO;
import ru.ozon.app.android.search.catalog.components.productselectormobiledata.data.SelectorInfo;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002BK\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000e¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010 \u001a\u0004\b!\u0010\"R%\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0011\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lru/ozon/app/android/search/catalog/components/productselectormobiledata/step/presentation/models/ProductSelectorMobileDataConcreteStepVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "Lru/ozon/app/android/search/catalog/components/productselectormobiledata/data/ProductSelectorMobileDataDTO$ActiveFilters;", "activeFilters", "Lru/ozon/app/android/search/catalog/components/productselectormobiledata/core/SelectorDataActionBarModel;", "actionBarModel", "Lru/ozon/app/android/search/catalog/components/productselectormobiledata/data/SelectorInfo$SelectorStepData;", "stepContent", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "actionButton", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "<init>", "(JLjava/util/List;Lru/ozon/app/android/search/catalog/components/productselectormobiledata/core/SelectorDataActionBarModel;Lru/ozon/app/android/search/catalog/components/productselectormobiledata/data/SelectorInfo$SelectorStepData;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Ljava/util/Map;)V", "J", "getId", "()J", "Ljava/util/List;", "getActiveFilters", "()Ljava/util/List;", "Lru/ozon/app/android/search/catalog/components/productselectormobiledata/core/SelectorDataActionBarModel;", "getActionBarModel", "()Lru/ozon/app/android/search/catalog/components/productselectormobiledata/core/SelectorDataActionBarModel;", "Lru/ozon/app/android/search/catalog/components/productselectormobiledata/data/SelectorInfo$SelectorStepData;", "getStepContent", "()Lru/ozon/app/android/search/catalog/components/productselectormobiledata/data/SelectorInfo$SelectorStepData;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getActionButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ProductSelectorMobileDataConcreteStepVO implements c {

    @NotNull
    private final SelectorDataActionBarModel actionBarModel;

    @NotNull
    private final ButtonV3Atom.LargeButton actionButton;

    @NotNull
    private final List<ProductSelectorMobileDataDTO.ActiveFilters> activeFilters;
    private final long id;

    @NotNull
    private final SelectorInfo.SelectorStepData stepContent;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public ProductSelectorMobileDataConcreteStepVO(long j11, @NotNull List<ProductSelectorMobileDataDTO.ActiveFilters> activeFilters, @NotNull SelectorDataActionBarModel actionBarModel, @NotNull SelectorInfo.SelectorStepData stepContent, @NotNull ButtonV3Atom.LargeButton actionButton, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(activeFilters, "activeFilters");
        Intrinsics.checkNotNullParameter(actionBarModel, "actionBarModel");
        Intrinsics.checkNotNullParameter(stepContent, "stepContent");
        Intrinsics.checkNotNullParameter(actionButton, "actionButton");
        this.id = j11;
        this.activeFilters = activeFilters;
        this.actionBarModel = actionBarModel;
        this.stepContent = stepContent;
        this.actionButton = actionButton;
        this.trackingInfo = map;
    }

    @NotNull
    public final SelectorDataActionBarModel getActionBarModel() {
        return this.actionBarModel;
    }

    @NotNull
    public final ButtonV3Atom.LargeButton getActionButton() {
        return this.actionButton;
    }

    @NotNull
    public final List<ProductSelectorMobileDataDTO.ActiveFilters> getActiveFilters() {
        return this.activeFilters;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final SelectorInfo.SelectorStepData getStepContent() {
        return this.stepContent;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }
}
