package ru.ozon.app.android.ugc.widgets.createlistwrapper.di;

import GZ.g;
import Pc.a;
import Vg.d;
import WZ.l;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.tileselector.di.TileSelectorComponentApi;
import ru.ozon.app.android.tileselector.domain.selectedstate.SelectedProductsManagerProviderKt;
import ru.ozon.app.android.tileselector.domain.selectedstate.SelectedProductsViewModel;
import ru.ozon.app.android.tileselector.domain.selectedstate.UgcSelectedProductsManager;
import ru.ozon.app.android.ugc.widgets.createlistwrapper.di.CreateListWrapperWidgetComponent$Companion$create$1$1;
import ru.ozon.app.android.ugc.widgets.createlistwrapper.presentation.CreateListWrapperMapper;

@Metadata(d1 = {"\u0000A\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0019\u001a\u00060\u0015j\u0002`\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"ru/ozon/app/android/ugc/widgets/createlistwrapper/di/CreateListWrapperWidgetComponent$Companion$create$1$1", "Lru/ozon/app/android/ugc/widgets/createlistwrapper/di/CreateListWrapperWidgetComponent;", "Lru/ozon/app/android/tileselector/domain/selectedstate/UgcSelectedProductsManager;", "ugcSelectedProductsManager", "Lru/ozon/app/android/tileselector/domain/selectedstate/UgcSelectedProductsManager;", "getUgcSelectedProductsManager", "()Lru/ozon/app/android/tileselector/domain/selectedstate/UgcSelectedProductsManager;", "LPc/a;", "Lru/ozon/app/android/tileselector/domain/selectedstate/SelectedProductsViewModel;", "viewModelProvider", "LPc/a;", "getViewModelProvider", "()LPc/a;", "Lru/ozon/app/android/ugc/widgets/createlistwrapper/presentation/CreateListWrapperMapper;", "getMapper", "()Lru/ozon/app/android/ugc/widgets/createlistwrapper/presentation/CreateListWrapperMapper;", "mapper", "LGZ/g;", "getRouter", "()LGZ/g;", "router", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersFactory", "()LVg/d;", "customActionHandlersFactory", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CreateListWrapperWidgetComponent$Companion$create$1$1 implements CreateListWrapperWidgetComponent {
    final /* synthetic */ C7475g $storage;
    private final UgcSelectedProductsManager ugcSelectedProductsManager;
    private final a<SelectedProductsViewModel> viewModelProvider = new a() { // from class: YV.a
        @Override // Pc.a
        public final Object get() {
            SelectedProductsViewModel viewModelProvider$lambda$1;
            viewModelProvider$lambda$1 = CreateListWrapperWidgetComponent$Companion$create$1$1.viewModelProvider$lambda$1(CreateListWrapperWidgetComponent$Companion$create$1$1.this);
            return viewModelProvider$lambda$1;
        }
    };

    CreateListWrapperWidgetComponent$Companion$create$1$1(C7475g c7475g) {
        this.$storage = c7475g;
        this.ugcSelectedProductsManager = SelectedProductsManagerProviderKt.provideUgcSelectedProductsManager(((TileSelectorComponentApi) c7475g.getComponent(TileSelectorComponentApi.class)).getSelectedProductsManagerProvider(), (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SelectedProductsViewModel viewModelProvider$lambda$1(CreateListWrapperWidgetComponent$Companion$create$1$1 createListWrapperWidgetComponent$Companion$create$1$1) {
        SelectedProductsViewModel selectedProductsViewModel = new SelectedProductsViewModel();
        selectedProductsViewModel.setSelectedProductsManager(createListWrapperWidgetComponent$Companion$create$1$1.getUgcSelectedProductsManager());
        return selectedProductsViewModel;
    }

    @Override // ru.ozon.app.android.ugc.widgets.createlistwrapper.di.CreateListWrapperWidgetComponent
    public d getCustomActionHandlersFactory() {
        return ((CustomActionHandlersComponentApi) this.$storage.getComponent(CustomActionHandlersComponentApi.class)).getCustomActionHandlersStoreFactory();
    }

    @Override // ru.ozon.app.android.ugc.widgets.createlistwrapper.di.CreateListWrapperWidgetComponent
    public CreateListWrapperMapper getMapper() {
        return new CreateListWrapperMapper(getUgcSelectedProductsManager());
    }

    @Override // ru.ozon.app.android.ugc.widgets.createlistwrapper.di.CreateListWrapperWidgetComponent
    public g getRouter() {
        return ((NavigationComponentApi) this.$storage.getComponent(NavigationComponentApi.class)).getOzonRouter();
    }

    @Override // ru.ozon.app.android.ugc.widgets.createlistwrapper.di.CreateListWrapperWidgetComponent
    public l getTokenizedAnalytics() {
        return ((RetainComposerComponentApi) this.$storage.getComponent(RetainComposerComponentApi.class)).getTokenizedAnalytics();
    }

    @Override // ru.ozon.app.android.ugc.widgets.createlistwrapper.di.CreateListWrapperWidgetComponent
    public a<SelectedProductsViewModel> getViewModelProvider() {
        return this.viewModelProvider;
    }

    @Override // ru.ozon.app.android.ugc.widgets.createlistwrapper.di.CreateListWrapperWidgetComponent
    public UgcSelectedProductsManager getUgcSelectedProductsManager() {
        return this.ugcSelectedProductsManager;
    }
}
