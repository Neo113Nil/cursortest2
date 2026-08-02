package ru.ozon.app.android.common.taglist.di;

import FU.a;
import GZ.k;
import Vg.d;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.common.taglist.common.TagListOnboardingViewModel;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentApi;
import ru.ozon.app.android.platform.viewutils.RecycledViewPoolViewNullifier;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.storefront.domain.onboarding.CommonOnboardingRepository;
import ru.ozon.app.android.storefront.domain.onboarding.di.OnboardingComponentApi;
import ru.ozon.app.android.utils.AppType;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u0000 \u001d2\u00060\u0001j\u0002`\u0002:\u0002\u001d\u001eJ\u000f\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0018\u001a\u00060\u0016j\u0002`\u0017H&¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH&¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/common/taglist/di/TagListComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/platform/viewutils/RecycledViewPoolViewNullifier;", "recycledViewPoolViewNullifier", "()Lru/ozon/app/android/platform/viewutils/RecycledViewPoolViewNullifier;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "()Lru/ozon/app/android/network/abtool/FeatureChecker;", "Lru/ozon/app/android/storefront/domain/onboarding/CommonOnboardingRepository;", "onboardingRepository", "()Lru/ozon/app/android/storefront/domain/onboarding/CommonOnboardingRepository;", "LPc/a;", "Lru/ozon/app/android/common/taglist/common/TagListOnboardingViewModel;", "onboardingViewModel", "()LPc/a;", "LHZ/a;", "deeplinkHandlersCache", "()LHZ/a;", "LGZ/k;", "routeFactory", "()LGZ/k;", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "()LVg/d;", "Lru/ozon/app/android/utils/AppType;", "getAppType", "()Lru/ozon/app/android/utils/AppType;", "Companion", "Factory", "taglist_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface TagListComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/common/taglist/di/TagListComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/common/taglist/di/TagListComponent;", "create", "(Lk20/g;)Lk20/e;", "taglist_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final TagListComponent create$lambda$0(C7475g c7475g) {
            return DaggerTagListComponent.factory().create((StorageComponentApi) c7475g.getComponent(StorageComponentApi.class), (AndroidPlatformComponentApi) c7475g.getComponent(AndroidPlatformComponentApi.class), (NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class), (OnboardingComponentApi) c7475g.getComponent(OnboardingComponentApi.class), (NavigationComponentApi) c7475g.getComponent(NavigationComponentApi.class), (CustomActionHandlersComponentApi) c7475g.getComponent(CustomActionHandlersComponentApi.class));
        }

        @NotNull
        public final C7473e<TagListComponent> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(TagListComponent.class), new a(storage, 7));
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J8\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH&¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/common/taglist/di/TagListComponent$Factory;", "", "create", "Lru/ozon/app/android/common/taglist/di/TagListComponent;", "storageComponentApi", "Lru/ozon/app/android/storage/di/StorageComponentApi;", "androidPlatformComponentApi", "Lru/ozon/app/android/platform/di/AndroidPlatformComponentApi;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "onboardingComponentApi", "Lru/ozon/app/android/storefront/domain/onboarding/di/OnboardingComponentApi;", "navigationComponentApi", "Lru/ozon/app/android/navigation/di/NavigationComponentApi;", "customActionHandlersApi", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "taglist_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public interface Factory {
        @NotNull
        TagListComponent create(@NotNull StorageComponentApi storageComponentApi, @NotNull AndroidPlatformComponentApi androidPlatformComponentApi, @NotNull NetworkComponentApi networkComponentApi, @NotNull OnboardingComponentApi onboardingComponentApi, @NotNull NavigationComponentApi navigationComponentApi, @NotNull CustomActionHandlersComponentApi customActionHandlersApi);
    }

    @NotNull
    d customActionHandlersStoreFactory();

    @NotNull
    HZ.a deeplinkHandlersCache();

    @NotNull
    FeatureChecker featureChecker();

    @NotNull
    AppType getAppType();

    @NotNull
    CommonOnboardingRepository onboardingRepository();

    @NotNull
    Pc.a<TagListOnboardingViewModel> onboardingViewModel();

    @NotNull
    RecycledViewPoolViewNullifier recycledViewPoolViewNullifier();

    @NotNull
    k routeFactory();
}
