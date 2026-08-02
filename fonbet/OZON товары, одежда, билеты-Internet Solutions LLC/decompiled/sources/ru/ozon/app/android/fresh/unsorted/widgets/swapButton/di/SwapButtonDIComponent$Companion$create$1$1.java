package ru.ozon.app.android.fresh.unsorted.widgets.swapButton.di;

import Sc.InterfaceC4008j;
import Sc.k;
import WZ.l;
import k20.C7475g;
import kotlin.Metadata;
import l10.InterfaceC7851b;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.storage.di.StorageComponentApi;

@Metadata(d1 = {"\u0000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001b\u0010\u0010\u001a\u00020\u000b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0015\u001a\u00060\u0011j\u0002`\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"ru/ozon/app/android/fresh/unsorted/widgets/swapButton/di/SwapButtonDIComponent$Companion$create$1$1", "Lru/ozon/app/android/fresh/unsorted/widgets/swapButton/di/SwapButtonDIComponent;", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "Lru/ozon/app/android/storage/di/StorageComponentApi;", "storageComponentApi", "Lru/ozon/app/android/storage/di/StorageComponentApi;", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "retainComposerApi", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "Lru/ozon/app/android/fresh/unsorted/widgets/swapButton/di/SwapButtonViewModelFactory;", "viewModelFactory$delegate", "LSc/j;", "getViewModelFactory", "()Lru/ozon/app/android/fresh/unsorted/widgets/swapButton/di/SwapButtonViewModelFactory;", "viewModelFactory", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Ll10/b;", "getController", "()Ll10/b;", "controller", "Lru/ozon/app/android/composer/ComposerNavigator;", "getNavigator", "()Lru/ozon/app/android/composer/ComposerNavigator;", "navigator", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SwapButtonDIComponent$Companion$create$1$1 implements SwapButtonDIComponent {
    final /* synthetic */ C7475g $storage;
    private final NetworkComponentApi networkComponentApi;
    private final RetainComposerComponentApi retainComposerApi;
    private final StorageComponentApi storageComponentApi;

    /* renamed from: viewModelFactory$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j viewModelFactory = k.b(new SwapButtonDIComponent$Companion$create$1$1$viewModelFactory$2(this));

    SwapButtonDIComponent$Companion$create$1$1(C7475g c7475g) {
        this.$storage = c7475g;
        this.networkComponentApi = (NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class);
        this.storageComponentApi = (StorageComponentApi) c7475g.getComponent(StorageComponentApi.class);
        this.retainComposerApi = (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class);
    }

    @Override // ru.ozon.app.android.fresh.unsorted.widgets.swapButton.di.SwapButtonDIComponent
    public InterfaceC7851b getController() {
        return this.retainComposerApi.getComposerController();
    }

    @Override // ru.ozon.app.android.fresh.unsorted.widgets.swapButton.di.SwapButtonDIComponent
    public ComposerNavigator getNavigator() {
        return this.retainComposerApi.getComposerNavigator();
    }

    @Override // ru.ozon.app.android.fresh.unsorted.widgets.swapButton.di.SwapButtonDIComponent
    public l getTokenizedAnalytics() {
        return ((RetainComposerComponentApi) this.$storage.getComponent(RetainComposerComponentApi.class)).getTokenizedAnalytics();
    }

    @Override // ru.ozon.app.android.fresh.unsorted.widgets.swapButton.di.SwapButtonDIComponent
    public SwapButtonViewModelFactory getViewModelFactory() {
        return (SwapButtonViewModelFactory) this.viewModelFactory.getValue();
    }
}
