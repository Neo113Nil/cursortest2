package ru.ozon.app.android.search.catalog.components.productselectormobiledata.allstep;

import androidx.lifecycle.w0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.productselectormobile.PickerRefreshLinkStore;
import ru.ozon.app.android.search.catalog.components.productselectormobiledata.allstep.model.AllStepAction;
import ru.ozon.app.android.search.catalog.components.productselectormobiledata.core.UtilsKt;
import ru.ozon.app.android.search.catalog.components.productselectormobiledata.data.ProductSelectorMobileDataDTO;
import ru.ozon.app.android.search.catalog.components.productselectormobiledata.step.domain.FilterActionProcessor;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0011\u001a\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/search/catalog/components/productselectormobiledata/allstep/AllStepViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/search/catalog/components/productselectormobiledata/step/domain/FilterActionProcessor;", "filterActionProcessor", "Lru/ozon/app/android/common/productselectormobile/PickerRefreshLinkStore;", "linkStore", "<init>", "(Lru/ozon/app/android/search/catalog/components/productselectormobiledata/step/domain/FilterActionProcessor;Lru/ozon/app/android/common/productselectormobile/PickerRefreshLinkStore;)V", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "atomAction", "", "processNonFilterAction", "(Lru/ozon/uni/atoms/af/AtomAction$Click;)V", "", "Lru/ozon/app/android/search/catalog/components/productselectormobiledata/data/ProductSelectorMobileDataDTO$ActiveFilters;", "activeFilters", "clickAction", "processClickAction", "(Ljava/util/List;Lru/ozon/uni/atoms/af/AtomAction$Click;)V", "Lru/ozon/app/android/search/catalog/components/productselectormobiledata/step/domain/FilterActionProcessor;", "Lru/ozon/app/android/common/productselectormobile/PickerRefreshLinkStore;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lru/ozon/app/android/search/catalog/components/productselectormobiledata/allstep/model/AllStepAction;", "actionEvent", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "getActionEvent", "()Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AllStepViewModel extends w0 {

    @NotNull
    private final SingleLiveEvent<AllStepAction> actionEvent;

    @NotNull
    private final FilterActionProcessor filterActionProcessor;

    @NotNull
    private final PickerRefreshLinkStore linkStore;

    public AllStepViewModel(@NotNull FilterActionProcessor filterActionProcessor, @NotNull PickerRefreshLinkStore linkStore) {
        Intrinsics.checkNotNullParameter(filterActionProcessor, "filterActionProcessor");
        Intrinsics.checkNotNullParameter(linkStore, "linkStore");
        this.filterActionProcessor = filterActionProcessor;
        this.linkStore = linkStore;
        this.actionEvent = new SingleLiveEvent<>();
    }

    private final void processNonFilterAction(AtomAction.Click atomAction) {
        String id2 = atomAction.getId();
        if (Intrinsics.d(id2, "closeSelector")) {
            this.actionEvent.setValue(AllStepAction.CloseFlow.INSTANCE);
        } else if (Intrinsics.d(id2, "showSelectorResults")) {
            this.linkStore.putRefreshLink(atomAction.getLink());
            this.actionEvent.setValue(AllStepAction.CloseFlow.INSTANCE);
        }
    }

    @NotNull
    public final SingleLiveEvent<AllStepAction> getActionEvent() {
        return this.actionEvent;
    }

    public final void processClickAction(@NotNull List<ProductSelectorMobileDataDTO.ActiveFilters> activeFilters, @NotNull AtomAction.Click clickAction) {
        Intrinsics.checkNotNullParameter(activeFilters, "activeFilters");
        Intrinsics.checkNotNullParameter(clickAction, "clickAction");
        if (!this.filterActionProcessor.isFilterAction(clickAction)) {
            processNonFilterAction(clickAction);
            return;
        }
        List<ProductSelectorMobileDataDTO.ActiveFilters> processFilterAction = this.filterActionProcessor.processFilterAction(activeFilters, clickAction);
        if (processFilterAction != null) {
            this.actionEvent.setValue(new AllStepAction.Refresh(UtilsKt.buildPostParamsMapForApplyFilters(processFilterAction)));
        }
    }
}
