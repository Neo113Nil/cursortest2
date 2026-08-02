package ru.ozon.app.android.ugc.core.widgets.singlereview.buttons.di;

import Pc.a;
import kotlin.Metadata;
import qV.b;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.pdp.ui.configurators.ugc.singleReview.SingleReviewViewModelImpl;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.ugc.core.widgets.common.UgcCachedActionsSharedViewModel;
import ru.ozon.app.android.ugc.core.widgets.singlereview.buttons.di.SingleReviewButtonsComponent$Companion$create$1$1;

@Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0005\u001a\u0010\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u00030\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\b\u001a\u0010\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00070\u00070\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"ru/ozon/app/android/ugc/core/widgets/singlereview/buttons/di/SingleReviewButtonsComponent$Companion$create$1$1", "Lru/ozon/app/android/ugc/core/widgets/singlereview/buttons/di/SingleReviewButtonsComponent;", "LPc/a;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewViewModelImpl;", "kotlin.jvm.PlatformType", "viewModelProvider", "()LPc/a;", "Lru/ozon/app/android/ugc/core/widgets/common/UgcCachedActionsSharedViewModel;", "ugcCachedActionsSharedViewModelProvider", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SingleReviewButtonsComponent$Companion$create$1$1 implements SingleReviewButtonsComponent {
    final /* synthetic */ ActionComponentApi $actionComponentApi;
    final /* synthetic */ NavigationComponentApi $navigationComponentApi;
    final /* synthetic */ StorageComponentApi $storageComponentApi;

    SingleReviewButtonsComponent$Companion$create$1$1(ActionComponentApi actionComponentApi, StorageComponentApi storageComponentApi, NavigationComponentApi navigationComponentApi) {
        this.$actionComponentApi = actionComponentApi;
        this.$storageComponentApi = storageComponentApi;
        this.$navigationComponentApi = navigationComponentApi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UgcCachedActionsSharedViewModel ugcCachedActionsSharedViewModelProvider$lambda$1() {
        return new UgcCachedActionsSharedViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SingleReviewViewModelImpl viewModelProvider$lambda$0(ActionComponentApi actionComponentApi, StorageComponentApi storageComponentApi, NavigationComponentApi navigationComponentApi) {
        return new SingleReviewViewModelImpl(actionComponentApi.getActionRepository(), storageComponentApi.getAuthStateStorage(), navigationComponentApi.getOzonRouter());
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.singlereview.buttons.di.SingleReviewButtonsComponent
    public a<UgcCachedActionsSharedViewModel> ugcCachedActionsSharedViewModelProvider() {
        return new b();
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.singlereview.buttons.di.SingleReviewButtonsComponent
    public a<SingleReviewViewModelImpl> viewModelProvider() {
        final ActionComponentApi actionComponentApi = this.$actionComponentApi;
        final StorageComponentApi storageComponentApi = this.$storageComponentApi;
        final NavigationComponentApi navigationComponentApi = this.$navigationComponentApi;
        return new a() { // from class: qV.a
            @Override // Pc.a
            public final Object get() {
                SingleReviewViewModelImpl viewModelProvider$lambda$0;
                viewModelProvider$lambda$0 = SingleReviewButtonsComponent$Companion$create$1$1.viewModelProvider$lambda$0(ActionComponentApi.this, storageComponentApi, navigationComponentApi);
                return viewModelProvider$lambda$0;
            }
        };
    }
}
