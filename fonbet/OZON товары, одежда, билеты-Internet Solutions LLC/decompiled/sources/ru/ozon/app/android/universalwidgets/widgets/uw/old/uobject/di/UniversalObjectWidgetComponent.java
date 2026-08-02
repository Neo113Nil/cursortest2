package ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.di;

import AM.a;
import android.annotation.SuppressLint;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.ads.data.pixel.di.PixelRepositoryComponentApi;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.core.UniversalObjectMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.footer.FooterMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.grid.grid3.core.UniversalObjectGrid3Mapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.gridone.UniversalObjectGridOneMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.header.HeaderMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.imageprefetch.UniversalGrid3ImagePrefetchInfoProvider;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.imageprefetch.UniversalObjectGridImagePrefetchInfoProvider;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.imageprefetch.UniversalObjectGridOneSingleItemBannerImageSizeProvider;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.pixel.PixelAnalyticsViewModel;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u0000 %2\u00060\u0001j\u0002`\u0002:\u0002%&J\u000f\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H&¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH&¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH&¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!H&¢\u0006\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/di/UniversalObjectWidgetComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/core/UniversalObjectMapper;", "getMapper", "()Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/core/UniversalObjectMapper;", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/gridone/UniversalObjectGridOneMapper;", "getGridOneMapper", "()Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/gridone/UniversalObjectGridOneMapper;", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/grid/grid3/core/UniversalObjectGrid3Mapper;", "getGrid3Mapper", "()Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/grid/grid3/core/UniversalObjectGrid3Mapper;", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/header/HeaderMapper;", "getHeaderMapper", "()Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/header/HeaderMapper;", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/footer/FooterMapper;", "getFooterMapper", "()Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/footer/FooterMapper;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "getFeatureChecker", "()Lru/ozon/app/android/network/abtool/FeatureChecker;", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "getAdultHandler", "()Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/imageprefetch/UniversalGrid3ImagePrefetchInfoProvider;", "getGridImagePrefetchInfoProvider", "()Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/imageprefetch/UniversalGrid3ImagePrefetchInfoProvider;", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/imageprefetch/UniversalObjectGridImagePrefetchInfoProvider;", "getUniversalGridImagePrefetchInfoProvider", "()Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/imageprefetch/UniversalObjectGridImagePrefetchInfoProvider;", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/imageprefetch/UniversalObjectGridOneSingleItemBannerImageSizeProvider;", "getGridOneSingleItemBannerImageSizeProvider", "()Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/imageprefetch/UniversalObjectGridOneSingleItemBannerImageSizeProvider;", "LPc/a;", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/pixel/PixelAnalyticsViewModel;", "getPixelAnalyticsViewModelProvider", "()LPc/a;", "Companion", "Factory", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface UniversalObjectWidgetComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/di/UniversalObjectWidgetComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/di/UniversalObjectWidgetComponent;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "create", "(Lk20/g;)Lk20/e;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final UniversalObjectWidgetComponent create$lambda$0(C7475g c7475g) {
            return DaggerUniversalObjectWidgetComponent.factory().create((NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class), (AccountComponentApi) c7475g.getComponent(AccountComponentApi.class), (ContextComponentDependencies) c7475g.getComponent(ContextComponentDependencies.class), (PixelRepositoryComponentApi) c7475g.getComponent(PixelRepositoryComponentApi.class));
        }

        @SuppressLint({"WidgetViewMapper2WithDaggerComponent"})
        @NotNull
        public final C7473e<UniversalObjectWidgetComponent> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(UniversalObjectWidgetComponent.class), new a(storage, 6));
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006\f"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/di/UniversalObjectWidgetComponent$Factory;", "", "create", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/di/UniversalObjectWidgetComponent;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "accountComponentApi", "Lru/ozon/app/android/account/di/AccountComponentApi;", "contextComponentDependencies", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "pixelRepositoryComponentApi", "Lru/ozon/app/android/ads/data/pixel/di/PixelRepositoryComponentApi;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public interface Factory {
        @NotNull
        UniversalObjectWidgetComponent create(@NotNull NetworkComponentApi networkComponentApi, @NotNull AccountComponentApi accountComponentApi, @NotNull ContextComponentDependencies contextComponentDependencies, @NotNull PixelRepositoryComponentApi pixelRepositoryComponentApi);
    }

    @NotNull
    AdultHandler getAdultHandler();

    @NotNull
    FeatureChecker getFeatureChecker();

    @NotNull
    FooterMapper getFooterMapper();

    @NotNull
    UniversalObjectGrid3Mapper getGrid3Mapper();

    @NotNull
    UniversalGrid3ImagePrefetchInfoProvider getGridImagePrefetchInfoProvider();

    @NotNull
    UniversalObjectGridOneMapper getGridOneMapper();

    @NotNull
    UniversalObjectGridOneSingleItemBannerImageSizeProvider getGridOneSingleItemBannerImageSizeProvider();

    @NotNull
    HeaderMapper getHeaderMapper();

    @NotNull
    UniversalObjectMapper getMapper();

    @NotNull
    Pc.a<PixelAnalyticsViewModel> getPixelAnalyticsViewModelProvider();

    @NotNull
    UniversalObjectGridImagePrefetchInfoProvider getUniversalGridImagePrefetchInfoProvider();
}
