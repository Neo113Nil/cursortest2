package ru.ozon.app.android.ugc.widgets.ugccounters.di;

import Sc.InterfaceC4008j;
import Sc.k;
import WZ.l;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.composer.widgets.v2.onboarding.di.OnBoardingComponentApi;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.WidgetImagePlaceholderAdapter;
import ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.di.WidgetImagePlaceholderComponent;
import ru.ozon.app.android.pikazon.preload.ImagePrefetchInfoProviderStorage;
import ru.ozon.app.android.ugc.widgets.ugccounters.core.UgcCountersMapper;
import ru.ozon.app.android.ugc.widgets.ugccounters.onboarding.UgcCountersOnboardingViewModel;
import ru.ozon.app.android.ugc.widgets.ugccounters.presentation.UgcCountersVO;
import ru.ozon.app.android.ugc.widgets.ugccounters.presentation.imagePrefetch.UgcCountersImagePrefetchInfoProvider;
import ru.ozon.app.android.video.di.VideoComponentApi;
import ru.ozon.app.android.video.preload.PlayerPreloader;

@Metadata(d1 = {"\u0000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001b\u0010\u0007\u001a\u00020\u00028VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\f\u001a\u00020\b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\"0!8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020*8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u00101\u001a\u00020.8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00062"}, d2 = {"ru/ozon/app/android/ugc/widgets/ugccounters/di/UgcCountersComponent$Companion$getInstance$1$1", "Lru/ozon/app/android/ugc/widgets/ugccounters/di/UgcCountersComponent;", "Lru/ozon/app/android/ugc/widgets/ugccounters/core/UgcCountersMapper;", "mapper$delegate", "LSc/j;", "getMapper", "()Lru/ozon/app/android/ugc/widgets/ugccounters/core/UgcCountersMapper;", "mapper", "Lru/ozon/app/android/ugc/widgets/ugccounters/onboarding/UgcCountersOnboardingViewModel;", "onboardingViewModel$delegate", "getOnboardingViewModel", "()Lru/ozon/app/android/ugc/widgets/ugccounters/onboarding/UgcCountersOnboardingViewModel;", "onboardingViewModel", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "getContextComponentDependencies", "()Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "contextComponentDependencies", "Lru/ozon/app/android/video/di/VideoComponentApi;", "getVideoComponentApi", "()Lru/ozon/app/android/video/di/VideoComponentApi;", "videoComponentApi", "Lru/ozon/app/android/composer/widgets/v2/onboarding/di/OnBoardingComponentApi;", "getOnBoardingComponentApi", "()Lru/ozon/app/android/composer/widgets/v2/onboarding/di/OnBoardingComponentApi;", "onBoardingComponentApi", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "getRetainComposerComponentApi", "()Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "retainComposerComponentApi", "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/di/WidgetImagePlaceholderComponent;", "getWidgetImagePlaceholderComponent", "()Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/di/WidgetImagePlaceholderComponent;", "widgetImagePlaceholderComponent", "Lru/ozon/app/android/pikazon/preload/ImagePrefetchInfoProviderStorage;", "Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/UgcCountersVO$Block$Images$Image;", "getProviderStorage", "()Lru/ozon/app/android/pikazon/preload/ImagePrefetchInfoProviderStorage;", "providerStorage", "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/WidgetImagePlaceholderAdapter;", "getWidgetImagePlaceholderAdapter", "()Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/WidgetImagePlaceholderAdapter;", "widgetImagePlaceholderAdapter", "Lru/ozon/app/android/video/preload/PlayerPreloader;", "getPlayerPreloader", "()Lru/ozon/app/android/video/preload/PlayerPreloader;", "playerPreloader", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UgcCountersComponent$Companion$getInstance$1$1 implements UgcCountersComponent {
    final /* synthetic */ C7475g $storage;

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper = k.b(new UgcCountersComponent$Companion$getInstance$1$1$mapper$2(this));

    /* renamed from: onboardingViewModel$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j onboardingViewModel = k.b(new UgcCountersComponent$Companion$getInstance$1$1$onboardingViewModel$2(this));

    UgcCountersComponent$Companion$getInstance$1$1(C7475g c7475g) {
        this.$storage = c7475g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ContextComponentDependencies getContextComponentDependencies() {
        return (ContextComponentDependencies) this.$storage.getComponent(ContextComponentDependencies.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OnBoardingComponentApi getOnBoardingComponentApi() {
        return (OnBoardingComponentApi) this.$storage.getComponent(OnBoardingComponentApi.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ImagePrefetchInfoProviderStorage<UgcCountersVO.Block.Images.Image> getProviderStorage() {
        ImagePrefetchInfoProviderStorage<UgcCountersVO.Block.Images.Image> imagePrefetchInfoProviderStorage = new ImagePrefetchInfoProviderStorage<>();
        imagePrefetchInfoProviderStorage.addProvider(N.b(UgcCountersVO.Block.Images.Image.class), new UgcCountersImagePrefetchInfoProvider());
        return imagePrefetchInfoProviderStorage;
    }

    private final RetainComposerComponentApi getRetainComposerComponentApi() {
        return (RetainComposerComponentApi) this.$storage.getComponent(RetainComposerComponentApi.class);
    }

    private final VideoComponentApi getVideoComponentApi() {
        return (VideoComponentApi) this.$storage.getComponent(VideoComponentApi.class);
    }

    private final WidgetImagePlaceholderComponent getWidgetImagePlaceholderComponent() {
        return (WidgetImagePlaceholderComponent) this.$storage.getComponent(WidgetImagePlaceholderComponent.class);
    }

    @Override // ru.ozon.app.android.ugc.widgets.ugccounters.di.UgcCountersComponent
    public UgcCountersMapper getMapper() {
        return (UgcCountersMapper) this.mapper.getValue();
    }

    @Override // ru.ozon.app.android.ugc.widgets.ugccounters.di.UgcCountersComponent
    public UgcCountersOnboardingViewModel getOnboardingViewModel() {
        return (UgcCountersOnboardingViewModel) this.onboardingViewModel.getValue();
    }

    @Override // ru.ozon.app.android.ugc.widgets.ugccounters.di.UgcCountersComponent
    public PlayerPreloader getPlayerPreloader() {
        return getVideoComponentApi().getPlayerPreloader();
    }

    @Override // ru.ozon.app.android.ugc.widgets.ugccounters.di.UgcCountersComponent
    public l getTokenizedAnalytics() {
        return getRetainComposerComponentApi().getTokenizedAnalytics();
    }

    @Override // ru.ozon.app.android.ugc.widgets.ugccounters.di.UgcCountersComponent
    public WidgetImagePlaceholderAdapter getWidgetImagePlaceholderAdapter() {
        return getWidgetImagePlaceholderComponent().getWidgetImagePlaceholderAdapter();
    }
}
