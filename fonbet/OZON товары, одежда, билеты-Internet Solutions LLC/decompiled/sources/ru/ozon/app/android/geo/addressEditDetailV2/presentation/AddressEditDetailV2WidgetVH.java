package ru.ozon.app.android.geo.addressEditDetailV2.presentation;

import Vg.d;
import W10.c;
import WZ.t;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.geo.addresseditformprompt.OpenSearchActionHandler;
import ru.ozon.app.android.geo.databinding.WidgetAddressEditDetailV2Binding;
import ru.ozon.app.android.geo.pvzSearcher.PvzSearcherViewModel;
import ru.ozon.app.android.yandexsearchsheet.YandexSearchSheetSharedViewModel;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B;\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\u0010\u000f\u001a\u00060\rj\u0002`\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001eR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001fR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010 R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010!R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\"R\u0018\u0010\u000f\u001a\u00060\rj\u0002`\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010#R \u0010&\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00150$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010+¨\u0006,"}, d2 = {"Lru/ozon/app/android/geo/addressEditDetailV2/presentation/AddressEditDetailV2WidgetVH;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/geo/addressEditDetailV2/presentation/AddressEditDetailV2VO;", "Lru/ozon/app/android/geo/databinding/WidgetAddressEditDetailV2Binding;", "binding", "Lru/ozon/app/android/composer/ComposerReferences;", "ref", "Lru/ozon/app/android/geo/pvzSearcher/PvzSearcherViewModel;", "viewModel", "Lru/ozon/app/android/geo/addresseditformprompt/OpenSearchActionHandler;", "openSearchActionHandler", "Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetSharedViewModel;", "yandexSearchSheetSharedViewModel", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "<init>", "(Lru/ozon/app/android/geo/databinding/WidgetAddressEditDetailV2Binding;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/geo/pvzSearcher/PvzSearcherViewModel;Lru/ozon/app/android/geo/addresseditformprompt/OpenSearchActionHandler;Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetSharedViewModel;LVg/d;)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/geo/addressEditDetailV2/presentation/AddressEditDetailV2VO;Ll20/d;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/geo/addressEditDetailV2/presentation/AddressEditDetailV2VO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/geo/databinding/WidgetAddressEditDetailV2Binding;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/geo/pvzSearcher/PvzSearcherViewModel;", "Lru/ozon/app/android/geo/addresseditformprompt/OpenSearchActionHandler;", "Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetSharedViewModel;", "LVg/d;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/geo/addressEditDetailV2/presentation/AddressEditDetailV2DynamicElementListAdapter;", "newAddressAdapter", "Lru/ozon/app/android/geo/addressEditDetailV2/presentation/AddressEditDetailV2DynamicElementListAdapter;", "Lru/ozon/app/android/geo/addressEditDetailV2/presentation/AddressEditDetailV2VO;", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddressEditDetailV2WidgetVH extends k<AddressEditDetailV2VO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetAddressEditDetailV2Binding binding;

    @NotNull
    private final d customActionHandlersStoreFactory;
    private AddressEditDetailV2VO item;

    @NotNull
    private final AddressEditDetailV2DynamicElementListAdapter newAddressAdapter;

    @NotNull
    private final OpenSearchActionHandler openSearchActionHandler;

    @NotNull
    private final ComposerReferences ref;

    @NotNull
    private final PvzSearcherViewModel viewModel;

    @NotNull
    private final YandexSearchSheetSharedViewModel yandexSearchSheetSharedViewModel;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AddressEditDetailV2WidgetVH(@NotNull WidgetAddressEditDetailV2Binding binding, @NotNull ComposerReferences ref, @NotNull PvzSearcherViewModel viewModel, @NotNull OpenSearchActionHandler openSearchActionHandler, @NotNull YandexSearchSheetSharedViewModel yandexSearchSheetSharedViewModel, @NotNull d customActionHandlersStoreFactory) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(ref, "ref");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(openSearchActionHandler, "openSearchActionHandler");
        Intrinsics.checkNotNullParameter(yandexSearchSheetSharedViewModel, "yandexSearchSheetSharedViewModel");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        LinearLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.ref = ref;
        this.viewModel = viewModel;
        this.openSearchActionHandler = openSearchActionHandler;
        this.yandexSearchSheetSharedViewModel = yandexSearchSheetSharedViewModel;
        this.customActionHandlersStoreFactory = customActionHandlersStoreFactory;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(ref, this).customActionHandlers(new AddressEditDetailV2WidgetVH$actionHandler$1(this)).onClick(new AddressEditDetailV2WidgetVH$actionHandler$2(this)).onComposerAction(new AddressEditDetailV2WidgetVH$actionHandler$3(this)).buildHandler();
        this.actionHandler = buildHandler;
        AddressEditDetailV2DynamicElementListAdapter addressEditDetailV2DynamicElementListAdapter = new AddressEditDetailV2DynamicElementListAdapter(buildHandler);
        this.newAddressAdapter = addressEditDetailV2DynamicElementListAdapter;
        binding.addressRv.setAdapter(addressEditDetailV2DynamicElementListAdapter);
        binding.addressRv.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        binding.addressRv.setItemAnimator(null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull AddressEditDetailV2VO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.item = item;
        this.newAddressAdapter.submitList(item.getAddress());
        RecyclerView addressRv = this.binding.addressRv;
        Intrinsics.checkNotNullExpressionValue(addressRv, "addressRv");
        ViewExtKt.show(addressRv);
        this.openSearchActionHandler.setOpenSearchOptions(item.getOptions());
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull AddressEditDetailV2VO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((AddressEditDetailV2WidgetVH) item, trackingData, viewedPond);
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.ref.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
        }
    }
}
