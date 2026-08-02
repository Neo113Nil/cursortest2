package ru.ozon.app.android.fresh.unsorted.widgets.profileAvatar.di;

import Bz.C2680a;
import Pc.a;
import Sc.InterfaceC4008j;
import Sc.k;
import WZ.l;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.account.orders.OrderChangePreferences;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.fresh.navigation.di.components.FreshNavigationComponentApi;
import ru.ozon.app.android.fresh.navigation.profileAvatar.presentation.AvatarProfileViewModel;
import ru.ozon.app.android.fresh.unsorted.widgets.profileAvatar.presentation.ProfileAvatarMapper;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u00152\u00060\u0001j\u0002`\u0002:\u0001\u0015R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0014\u001a\u00060\u0010j\u0002`\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/profileAvatar/di/ProfileAvatarDIComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "LPc/a;", "Lru/ozon/app/android/fresh/navigation/profileAvatar/presentation/AvatarProfileViewModel;", "getViewModelProvider", "()LPc/a;", "viewModelProvider", "Lru/ozon/app/android/account/orders/OrderChangePreferences;", "getOrderChangePreferences", "()Lru/ozon/app/android/account/orders/OrderChangePreferences;", "orderChangePreferences", "Lru/ozon/app/android/fresh/unsorted/widgets/profileAvatar/presentation/ProfileAvatarMapper;", "getMapper", "()Lru/ozon/app/android/fresh/unsorted/widgets/profileAvatar/presentation/ProfileAvatarMapper;", "mapper", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Companion", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ProfileAvatarDIComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/profileAvatar/di/ProfileAvatarDIComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/fresh/unsorted/widgets/profileAvatar/di/ProfileAvatarDIComponent;", "create", "(Lk20/g;)Lk20/e;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ProfileAvatarDIComponent create$lambda$0(final C7475g c7475g) {
            return new ProfileAvatarDIComponent() { // from class: ru.ozon.app.android.fresh.unsorted.widgets.profileAvatar.di.ProfileAvatarDIComponent$Companion$create$1$1

                /* renamed from: mapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j mapper = k.b(ProfileAvatarDIComponent$Companion$create$1$1$mapper$2.INSTANCE);
                private final a<AvatarProfileViewModel> viewModelProvider;

                {
                    this.viewModelProvider = ((FreshNavigationComponentApi) C7475g.this.getComponent(FreshNavigationComponentApi.class)).getAvatarProfileViewModelProvider();
                }

                @Override // ru.ozon.app.android.fresh.unsorted.widgets.profileAvatar.di.ProfileAvatarDIComponent
                public ProfileAvatarMapper getMapper() {
                    return (ProfileAvatarMapper) this.mapper.getValue();
                }

                @Override // ru.ozon.app.android.fresh.unsorted.widgets.profileAvatar.di.ProfileAvatarDIComponent
                public OrderChangePreferences getOrderChangePreferences() {
                    return ((AccountComponentApi) C7475g.this.getComponent(AccountComponentApi.class)).getOrderChangePreferences();
                }

                @Override // ru.ozon.app.android.fresh.unsorted.widgets.profileAvatar.di.ProfileAvatarDIComponent
                public l getTokenizedAnalytics() {
                    return ((RetainComposerComponentApi) C7475g.this.getComponent(RetainComposerComponentApi.class)).getTokenizedAnalytics();
                }

                @Override // ru.ozon.app.android.fresh.unsorted.widgets.profileAvatar.di.ProfileAvatarDIComponent
                public a<AvatarProfileViewModel> getViewModelProvider() {
                    return this.viewModelProvider;
                }
            };
        }

        @NotNull
        public final C7473e<ProfileAvatarDIComponent> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(ProfileAvatarDIComponent.class), new C2680a(storage, 1));
        }
    }

    @NotNull
    ProfileAvatarMapper getMapper();

    @NotNull
    OrderChangePreferences getOrderChangePreferences();

    @NotNull
    l getTokenizedAnalytics();

    @NotNull
    a<AvatarProfileViewModel> getViewModelProvider();
}
