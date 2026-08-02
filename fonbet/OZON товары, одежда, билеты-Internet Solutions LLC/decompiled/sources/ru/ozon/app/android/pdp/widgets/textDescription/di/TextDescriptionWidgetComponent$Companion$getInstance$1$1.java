package ru.ozon.app.android.pdp.widgets.textDescription.di;

import Sc.InterfaceC4008j;
import Sc.k;
import WZ.l;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.composer.widgets.async.di.ComposerWidgetAsyncComponentApi;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.pdp.utils.DelegatesKt;
import ru.ozon.app.android.pdp.widgets.textDescription.core.TextDescriptionMapper;
import ru.ozon.app.android.pdp.widgets.translateButton.data.TranslateAttributesRepository;
import ru.ozon.app.android.pdp.widgets.translateButton.presentation.TranslateViewModel;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentDependencies;
import ru.ozon.app.android.utils.AppType;

@Metadata(d1 = {"\u0000Q\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001b\u0010\n\u001a\u00020\u00058VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001b\u0010\u000f\u001a\u00020\u000b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\u0007\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0013\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0017\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u001b\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001f\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"ru/ozon/app/android/pdp/widgets/textDescription/di/TextDescriptionWidgetComponent$Companion$getInstance$1$1", "Lru/ozon/app/android/pdp/widgets/textDescription/di/TextDescriptionWidgetComponent;", "Lru/ozon/app/android/platform/di/AndroidPlatformComponentDependencies;", "androidPlatformComponentDependencies", "Lru/ozon/app/android/platform/di/AndroidPlatformComponentDependencies;", "Lru/ozon/app/android/pdp/widgets/textDescription/core/TextDescriptionMapper;", "mapper$delegate", "LSc/j;", "getMapper", "()Lru/ozon/app/android/pdp/widgets/textDescription/core/TextDescriptionMapper;", "mapper", "Lru/ozon/app/android/utils/AppType;", "appType$delegate", "getAppType", "()Lru/ozon/app/android/utils/AppType;", "appType", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "getContextComponentDependencies", "()Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "contextComponentDependencies", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "getRetainComposerComponentApi", "()Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "retainComposerComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "getNetworkComponentApi", "()Lru/ozon/app/android/network/di/NetworkComponentApi;", "networkComponentApi", "Lru/ozon/app/android/composer/widgets/async/di/ComposerWidgetAsyncComponentApi;", "getComposerWidgetAsyncComponentApi", "()Lru/ozon/app/android/composer/widgets/async/di/ComposerWidgetAsyncComponentApi;", "composerWidgetAsyncComponentApi", "Lru/ozon/app/android/pdp/widgets/translateButton/presentation/TranslateViewModel;", "getTranslateViewModel", "()Lru/ozon/app/android/pdp/widgets/translateButton/presentation/TranslateViewModel;", "translateViewModel", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TextDescriptionWidgetComponent$Companion$getInstance$1$1 implements TextDescriptionWidgetComponent {
    final /* synthetic */ C7475g $storage;
    private final AndroidPlatformComponentDependencies androidPlatformComponentDependencies;

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper = k.b(new TextDescriptionWidgetComponent$Companion$getInstance$1$1$mapper$2(this));

    /* renamed from: appType$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j appType = DelegatesKt.lazyUnsafe(new TextDescriptionWidgetComponent$Companion$getInstance$1$1$appType$2(this));

    TextDescriptionWidgetComponent$Companion$getInstance$1$1(C7475g c7475g) {
        this.$storage = c7475g;
        this.androidPlatformComponentDependencies = (AndroidPlatformComponentDependencies) c7475g.getComponent(AndroidPlatformComponentDependencies.class);
    }

    @Override // ru.ozon.app.android.pdp.widgets.textDescription.di.TextDescriptionWidgetComponent
    public AppType getAppType() {
        return (AppType) this.appType.getValue();
    }

    public final ComposerWidgetAsyncComponentApi getComposerWidgetAsyncComponentApi() {
        return (ComposerWidgetAsyncComponentApi) this.$storage.getComponent(ComposerWidgetAsyncComponentApi.class);
    }

    public final ContextComponentDependencies getContextComponentDependencies() {
        return (ContextComponentDependencies) this.$storage.getComponent(ContextComponentDependencies.class);
    }

    @Override // ru.ozon.app.android.pdp.widgets.textDescription.di.TextDescriptionWidgetComponent
    public TextDescriptionMapper getMapper() {
        return (TextDescriptionMapper) this.mapper.getValue();
    }

    public final NetworkComponentApi getNetworkComponentApi() {
        return (NetworkComponentApi) this.$storage.getComponent(NetworkComponentApi.class);
    }

    public final RetainComposerComponentApi getRetainComposerComponentApi() {
        return (RetainComposerComponentApi) this.$storage.getComponent(RetainComposerComponentApi.class);
    }

    @Override // ru.ozon.app.android.pdp.widgets.textDescription.di.TextDescriptionWidgetComponent
    public l getTokenizedAnalytics() {
        return getRetainComposerComponentApi().getTokenizedAnalytics();
    }

    @Override // ru.ozon.app.android.pdp.widgets.textDescription.di.TextDescriptionWidgetComponent
    public TranslateViewModel getTranslateViewModel() {
        return new TranslateViewModel(new TranslateAttributesRepository(getNetworkComponentApi().getRetrofit()), getComposerWidgetAsyncComponentApi().getComposerAsyncWidgetRepository());
    }
}
