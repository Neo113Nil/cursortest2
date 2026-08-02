package ru.ozon.app.android.storefront.widgets.navbarv2.di;

import Sc.InterfaceC4008j;
import Sc.k;
import j10.InterfaceC7238a;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentApi;
import ru.ozon.app.android.storefront.widgets.navbarv2.core.ShellNavBarMapper;
import ru.ozon.app.android.storefront.widgets.navbarv2.presentation.ShellNavBarViewModel;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.l;

@Metadata(d1 = {"\u0000Y\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001b\u0010\r\u001a\u00020\b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u0012\u001a\u00020\u000e8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001f\u001a\u00060\u001bj\u0002`\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020!0 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006)"}, d2 = {"ru/ozon/app/android/storefront/widgets/navbarv2/di/ShellNavBarComponent$Companion$create$1$1", "Lru/ozon/app/android/storefront/widgets/navbarv2/di/ShellNavBarComponent;", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "Lru/ozon/app/android/platform/di/AndroidPlatformComponentApi;", "androidPlatformComponentApi", "Lru/ozon/app/android/platform/di/AndroidPlatformComponentApi;", "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/ShellNavBarViewModel;", "viewModel$delegate", "LSc/j;", "getViewModel", "()Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/ShellNavBarViewModel;", "viewModel", "Lru/ozon/app/android/storefront/widgets/navbarv2/core/ShellNavBarMapper;", "mapper$delegate", "getMapper", "()Lru/ozon/app/android/storefront/widgets/navbarv2/core/ShellNavBarMapper;", "mapper", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "getRetainComponentApi", "()Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "retainComponentApi", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "getFeatureChecker", "()Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "getViewedPond", "()Lru/ozon/composer/ui/widget/f;", "viewedPond", "Lj10/a;", "Lru/ozon/composer/ui/widget/l;", "getComposerStore", "()Lj10/a;", "composerStore", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ShellNavBarComponent$Companion$create$1$1 implements ShellNavBarComponent {
    final /* synthetic */ C7475g $storage;
    private final AndroidPlatformComponentApi androidPlatformComponentApi;
    private final NetworkComponentApi networkComponentApi;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j viewModel = k.b(ShellNavBarComponent$Companion$create$1$1$viewModel$2.INSTANCE);

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper = k.b(new ShellNavBarComponent$Companion$create$1$1$mapper$2(this));

    ShellNavBarComponent$Companion$create$1$1(C7475g c7475g) {
        this.$storage = c7475g;
        this.networkComponentApi = (NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class);
        this.androidPlatformComponentApi = (AndroidPlatformComponentApi) c7475g.getComponent(AndroidPlatformComponentApi.class);
    }

    private final RetainComposerComponentApi getRetainComponentApi() {
        return (RetainComposerComponentApi) this.$storage.getComponent(RetainComposerComponentApi.class);
    }

    @Override // ru.ozon.app.android.storefront.widgets.navbarv2.di.ShellNavBarComponent
    public InterfaceC7238a<l> getComposerStore() {
        return getRetainComponentApi().getComposerStore();
    }

    @Override // ru.ozon.app.android.storefront.widgets.navbarv2.di.ShellNavBarComponent
    public FeatureChecker getFeatureChecker() {
        return this.networkComponentApi.getFeatureChecker();
    }

    @Override // ru.ozon.app.android.storefront.widgets.navbarv2.di.ShellNavBarComponent
    public ShellNavBarMapper getMapper() {
        return (ShellNavBarMapper) this.mapper.getValue();
    }

    @Override // ru.ozon.app.android.storefront.widgets.navbarv2.di.ShellNavBarComponent
    public WZ.l getTokenizedAnalytics() {
        return getRetainComponentApi().getTokenizedAnalytics();
    }

    @Override // ru.ozon.app.android.storefront.widgets.navbarv2.di.ShellNavBarComponent
    public ShellNavBarViewModel getViewModel() {
        return (ShellNavBarViewModel) this.viewModel.getValue();
    }

    @Override // ru.ozon.app.android.storefront.widgets.navbarv2.di.ShellNavBarComponent
    public f getViewedPond() {
        return getRetainComponentApi().getViewedPond();
    }
}
