package ru.ozon.app.android.cabinet.profileAvatar.di;

import Fo.C3057a;
import Sc.InterfaceC4008j;
import Sc.k;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.account.orders.OrderChangePreferences;
import ru.ozon.app.android.cabinet.profileAvatar.core.ProfileAvatarMapper;
import ru.ozon.app.android.cabinet.profileAvatar.data.repository.AvatarApi;
import ru.ozon.app.android.cabinet.profileAvatar.data.repository.AvatarRepositoryImpl;
import ru.ozon.app.android.cabinet.profileAvatar.presentation.viewmodel.AvatarViewModel;
import ru.ozon.app.android.composer.widgets.v2.di.ComposerWidgetComponentStorageKt;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentApi;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentDependencies;
import ru.ozon.app.android.utils.AppType;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u00132\u00060\u0001j\u0002`\u0002:\u0001\u0013R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/cabinet/profileAvatar/di/ProfileAvatarComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/cabinet/profileAvatar/core/ProfileAvatarMapper;", "getProfileAvatarMapper", "()Lru/ozon/app/android/cabinet/profileAvatar/core/ProfileAvatarMapper;", "profileAvatarMapper", "Lru/ozon/app/android/account/orders/OrderChangePreferences;", "getOrderChangePreferences", "()Lru/ozon/app/android/account/orders/OrderChangePreferences;", "orderChangePreferences", "Lru/ozon/app/android/cabinet/profileAvatar/presentation/viewmodel/AvatarViewModel;", "getAvatarViewModel", "()Lru/ozon/app/android/cabinet/profileAvatar/presentation/viewmodel/AvatarViewModel;", "avatarViewModel", "Lru/ozon/app/android/utils/AppType;", "getAppType", "()Lru/ozon/app/android/utils/AppType;", "appType", "Companion", "cabinet_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ProfileAvatarComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/cabinet/profileAvatar/di/ProfileAvatarComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/cabinet/profileAvatar/di/ProfileAvatarComponent;", "create", "(Lk20/g;)Lk20/e;", "cabinet_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ProfileAvatarComponent create$lambda$0(final C7475g c7475g) {
            return new ProfileAvatarComponent(c7475g) { // from class: ru.ozon.app.android.cabinet.profileAvatar.di.ProfileAvatarComponent$Companion$create$1$1
                private final AccountComponentApi accountComponentApi;
                private final AndroidPlatformComponentApi androidPlatformComponentApi;
                private final AppType appType;
                private final NetworkComponentApi networkComponentApi;

                /* renamed from: profileAvatarMapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j profileAvatarMapper = k.b(ProfileAvatarComponent$Companion$create$1$1$profileAvatarMapper$2.INSTANCE);

                {
                    this.androidPlatformComponentApi = (AndroidPlatformComponentApi) ComposerWidgetComponentStorageKt.findComponentDependency(c7475g, AndroidPlatformComponentApi.class);
                    this.accountComponentApi = (AccountComponentApi) ComposerWidgetComponentStorageKt.findComponentDependency(c7475g, AccountComponentApi.class);
                    this.networkComponentApi = (NetworkComponentApi) ComposerWidgetComponentStorageKt.findComponentDependency(c7475g, NetworkComponentApi.class);
                    this.appType = ((AndroidPlatformComponentDependencies) c7475g.getComponent(AndroidPlatformComponentDependencies.class)).getAppType();
                }

                @Override // ru.ozon.app.android.cabinet.profileAvatar.di.ProfileAvatarComponent
                public AppType getAppType() {
                    return this.appType;
                }

                @Override // ru.ozon.app.android.cabinet.profileAvatar.di.ProfileAvatarComponent
                public AvatarViewModel getAvatarViewModel() {
                    Object create = this.networkComponentApi.getRetrofit().create(AvatarApi.class);
                    Intrinsics.checkNotNullExpressionValue(create, "create(...)");
                    return new AvatarViewModel(new AvatarRepositoryImpl((AvatarApi) create), this.androidPlatformComponentApi.getImageResizer());
                }

                @Override // ru.ozon.app.android.cabinet.profileAvatar.di.ProfileAvatarComponent
                public OrderChangePreferences getOrderChangePreferences() {
                    return this.accountComponentApi.getOrderChangePreferences();
                }

                @Override // ru.ozon.app.android.cabinet.profileAvatar.di.ProfileAvatarComponent
                public ProfileAvatarMapper getProfileAvatarMapper() {
                    return (ProfileAvatarMapper) this.profileAvatarMapper.getValue();
                }
            };
        }

        @NotNull
        public final C7473e<ProfileAvatarComponent> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(ProfileAvatarComponent.class), new C3057a(storage, 4));
        }
    }

    @NotNull
    AppType getAppType();

    @NotNull
    AvatarViewModel getAvatarViewModel();

    @NotNull
    OrderChangePreferences getOrderChangePreferences();

    @NotNull
    ProfileAvatarMapper getProfileAvatarMapper();
}
