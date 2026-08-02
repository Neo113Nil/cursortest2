package ru.ozon.app.android.geo.addresseditformprompt.presentation;

import Vg.d;
import WZ.t;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.geo.addresseditformprompt.OpenSearchActionHandler;
import ru.ozon.app.android.geo.databinding.WidgetAddressEditFormPromptBinding;
import ru.ozon.app.android.geo.mapupdater.MapUpdateProducer;
import ru.ozon.app.android.geo.pvzSearcher.PvzSearcherActionObserver;
import ru.ozon.app.android.geo.pvzSearcher.PvzSearcherViewModel;
import ru.ozon.app.android.yandexsearchsheet.YandexSearchSheetSharedViewModel;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BC\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\u0010\u000f\u001a\u00060\rj\u0002`\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010 \u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001eH\u0014¢\u0006\u0004\b \u0010!R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\"R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010#R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010$R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010%R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010&R\u0018\u0010\u000f\u001a\u00060\rj\u0002`\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010'R \u0010*\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00160(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104¨\u00065"}, d2 = {"Lru/ozon/app/android/geo/addresseditformprompt/presentation/AddressEditFormPromptVH;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/geo/addresseditformprompt/presentation/AddressEditFormPromptVO;", "Lru/ozon/app/android/geo/databinding/WidgetAddressEditFormPromptBinding;", "binding", "Lru/ozon/app/android/composer/ComposerReferences;", "ref", "Lru/ozon/app/android/geo/addresseditformprompt/OpenSearchActionHandler;", "openSearchActionHandler", "Lru/ozon/app/android/geo/pvzSearcher/PvzSearcherViewModel;", "viewModel", "Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetSharedViewModel;", "yandexSearchSheetSharedViewModel", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/geo/mapupdater/MapUpdateProducer;", "mapUpdateProducer", "<init>", "(Lru/ozon/app/android/geo/databinding/WidgetAddressEditFormPromptBinding;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/geo/addresseditformprompt/OpenSearchActionHandler;Lru/ozon/app/android/geo/pvzSearcher/PvzSearcherViewModel;Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetSharedViewModel;LVg/d;Lru/ozon/app/android/geo/mapupdater/MapUpdateProducer;)V", "", "showLoader", "", "changeLoaderVisibility", "(Z)V", "Landroidx/lifecycle/J;", "lifecycle", "onAttachViewModel", "(Landroidx/lifecycle/J;)V", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/geo/addresseditformprompt/presentation/AddressEditFormPromptVO;Ll20/d;)V", "Lru/ozon/app/android/geo/databinding/WidgetAddressEditFormPromptBinding;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/geo/addresseditformprompt/OpenSearchActionHandler;", "Lru/ozon/app/android/geo/pvzSearcher/PvzSearcherViewModel;", "Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetSharedViewModel;", "LVg/d;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/geo/addresseditformprompt/presentation/ButtonsDecorator;", "decorator", "Lru/ozon/app/android/geo/addresseditformprompt/presentation/ButtonsDecorator;", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "adapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "Lru/ozon/app/android/geo/pvzSearcher/PvzSearcherActionObserver;", "pvzSearcherActionObserver", "Lru/ozon/app/android/geo/pvzSearcher/PvzSearcherActionObserver;", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddressEditFormPromptVH extends k<AddressEditFormPromptVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final AtomsAdapter adapter;

    @NotNull
    private final WidgetAddressEditFormPromptBinding binding;

    @NotNull
    private final d customActionHandlersStoreFactory;

    @NotNull
    private final ButtonsDecorator decorator;

    @NotNull
    private final OpenSearchActionHandler openSearchActionHandler;

    @NotNull
    private final PvzSearcherActionObserver pvzSearcherActionObserver;

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
    public AddressEditFormPromptVH(@NotNull WidgetAddressEditFormPromptBinding binding, @NotNull ComposerReferences ref, @NotNull OpenSearchActionHandler openSearchActionHandler, @NotNull PvzSearcherViewModel viewModel, @NotNull YandexSearchSheetSharedViewModel yandexSearchSheetSharedViewModel, @NotNull d customActionHandlersStoreFactory, @NotNull MapUpdateProducer mapUpdateProducer) {
        super(r7);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(ref, "ref");
        Intrinsics.checkNotNullParameter(openSearchActionHandler, "openSearchActionHandler");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(yandexSearchSheetSharedViewModel, "yandexSearchSheetSharedViewModel");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(mapUpdateProducer, "mapUpdateProducer");
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.ref = ref;
        this.openSearchActionHandler = openSearchActionHandler;
        this.viewModel = viewModel;
        this.yandexSearchSheetSharedViewModel = yandexSearchSheetSharedViewModel;
        this.customActionHandlersStoreFactory = customActionHandlersStoreFactory;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(ref, this).customActionHandlers(new AddressEditFormPromptVH$actionHandler$1(this)).onClick(new AddressEditFormPromptVH$actionHandler$2(this)).onComposerAction(new AddressEditFormPromptVH$actionHandler$3(this)).buildHandler();
        this.actionHandler = buildHandler;
        ButtonsDecorator buttonsDecorator = new ButtonsDecorator(getContext());
        binding.elementsVAL.setDecorator(buttonsDecorator);
        this.decorator = buttonsDecorator;
        AtomsAdapter atomsAdapter = new AtomsAdapter(null, null, null, null, 15, null);
        atomsAdapter.setOnAction(buildHandler);
        binding.elementsVAL.setAdapter(atomsAdapter);
        this.adapter = atomsAdapter;
        AddressEditFormPromptVH$pvzSearcherActionObserver$1 addressEditFormPromptVH$pvzSearcherActionObserver$1 = new AddressEditFormPromptVH$pvzSearcherActionObserver$1(this);
        AddressEditFormPromptVO boundData = getBoundData();
        this.pvzSearcherActionObserver = new PvzSearcherActionObserver(ref, mapUpdateProducer, addressEditFormPromptVH$pvzSearcherActionObserver$1, buildHandler, boundData != null ? Long.valueOf(boundData.getId()) : null);
        binding.progress.setColor(ThemeExtKt.themeColor(getContext(), R$attr.bgActionPrimary));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void changeLoaderVisibility(boolean showLoader) {
        Group loaderOverlay = this.binding.loaderOverlay;
        Intrinsics.checkNotNullExpressionValue(loaderOverlay, "loaderOverlay");
        ViewExtKt.showOrGone(loaderOverlay, Boolean.valueOf(showLoader));
    }

    @Override // ru.ozon.composer.ui.widget.k
    protected void onAttachViewModel(@NotNull J lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        this.viewModel.getActions().observe(lifecycle, new AddressEditFormPromptVH$sam$androidx_lifecycle_Observer$0(new AddressEditFormPromptVH$onAttachViewModel$1(this)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull AddressEditFormPromptVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.openSearchActionHandler.setOpenSearchOptions(item.getOptions());
        this.decorator.setFirstButtonPosition(item.getFirstButtonPosition());
        this.adapter.bind(getContext(), item.getElements());
        changeLoaderVisibility(false);
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.ref.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
        }
    }
}
