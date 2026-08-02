package ru.ozon.app.android.tabbar.feature.tab.profile;

import Ae.C2399j;
import Ae.C2408n0;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import Sc.o;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.b0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.tabbar.feature.tab.profile.ProfileViewModelImpl;
import ru.ozon.app.android.tabbar.ui.BaseOzonBottomTabView;
import ru.ozon.app.android.tabbar.ui.controller.TabUiController;
import ru.ozon.app.android.tabbar.ui.model.BottomNavigationItem;
import ru.ozon.app.android.tabbar.ui.utils.BottomNavigationBadgeExtKt;
import xe.B0;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001b\u0010!\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lru/ozon/app/android/tabbar/feature/tab/profile/ProfileTabUiController;", "Lru/ozon/app/android/tabbar/ui/controller/TabUiController;", "Landroidx/fragment/app/m;", "fragment", "Lru/ozon/app/android/tabbar/feature/tab/profile/ProfileViewModelImpl$Factory;", "profileTabViewModelFactory", "<init>", "(Landroidx/fragment/app/m;Lru/ozon/app/android/tabbar/feature/tab/profile/ProfileViewModelImpl$Factory;)V", "Lxe/B0;", "observeViewModel", "()Lxe/B0;", "Lru/ozon/app/android/tabbar/feature/tab/profile/ProfileViewModelImpl$BadgeVariant;", "variant", "", "bindBadge", "(Lru/ozon/app/android/tabbar/feature/tab/profile/ProfileViewModelImpl$BadgeVariant;)V", "onInit", "()V", "", "wasTheSame", "onTabSelected", "(Z)V", "Lru/ozon/app/android/tabbar/ui/model/BottomNavigationItem;", "item", "onBind", "(Lru/ozon/app/android/tabbar/ui/model/BottomNavigationItem;)V", "badgeVariant", "Lru/ozon/app/android/tabbar/feature/tab/profile/ProfileViewModelImpl$BadgeVariant;", "Lru/ozon/app/android/tabbar/feature/tab/profile/ProfileTabViewModel;", "viewModel$delegate", "LSc/j;", "getViewModel", "()Lru/ozon/app/android/tabbar/feature/tab/profile/ProfileTabViewModel;", "viewModel", "Companion", "tabbar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ProfileTabUiController extends TabUiController {
    private ProfileViewModelImpl.BadgeVariant badgeVariant;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileTabUiController(@NotNull ComponentCallbacksC5392m fragment, @NotNull ProfileViewModelImpl.Factory profileTabViewModelFactory) {
        super(fragment);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(profileTabViewModelFactory, "profileTabViewModelFactory");
        ProfileTabUiController$viewModel$2 profileTabUiController$viewModel$2 = new ProfileTabUiController$viewModel$2(profileTabViewModelFactory);
        InterfaceC4008j a11 = k.a(n.NONE, new ProfileTabUiController$special$$inlined$viewModels$default$2(new ProfileTabUiController$special$$inlined$viewModels$default$1(fragment)));
        this.viewModel = b0.b(fragment, N.b(Object.class), new ProfileTabUiController$special$$inlined$viewModels$default$3(a11), new ProfileTabUiController$special$$inlined$viewModels$default$4(null, a11), profileTabUiController$viewModel$2);
    }

    private final void bindBadge(ProfileViewModelImpl.BadgeVariant variant) {
        this.badgeVariant = variant;
        if (Intrinsics.d(variant, ProfileViewModelImpl.BadgeVariant.UnAuthorized.INSTANCE)) {
            BaseOzonBottomTabView tabView = getTabView();
            if (tabView != null) {
                BottomNavigationBadgeExtKt.showEmptyBadge(tabView);
                return;
            }
            return;
        }
        if (variant instanceof ProfileViewModelImpl.BadgeVariant.Orders) {
            BaseOzonBottomTabView tabView2 = getTabView();
            if (tabView2 != null) {
                BottomNavigationBadgeExtKt.updateBadgeCount(tabView2, ((ProfileViewModelImpl.BadgeVariant.Orders) variant).getCount());
                return;
            }
            return;
        }
        if (!Intrinsics.d(variant, ProfileViewModelImpl.BadgeVariant.None.INSTANCE)) {
            throw new o();
        }
        BaseOzonBottomTabView tabView3 = getTabView();
        if (tabView3 != null) {
            BaseOzonBottomTabView.removeBadge$default(tabView3, null, 1, null);
        }
    }

    private final ProfileTabViewModel getViewModel() {
        return (ProfileTabViewModel) this.viewModel.getValue();
    }

    private final B0 observeViewModel() {
        return C2399j.C(new C2408n0(C2399j.l(getViewModel().getBadgeState(), 250L), new ProfileTabUiController$observeViewModel$1$1(this)), getTabScope());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object observeViewModel$lambda$1$bindBadge(ProfileTabUiController profileTabUiController, ProfileViewModelImpl.BadgeVariant badgeVariant, d dVar) {
        profileTabUiController.bindBadge(badgeVariant);
        return Unit.f71690a;
    }

    @Override // ru.ozon.app.android.tabbar.ui.controller.TabUiController
    public void onBind(@NotNull BottomNavigationItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ProfileViewModelImpl.BadgeVariant badgeVariant = this.badgeVariant;
        if (badgeVariant != null) {
            bindBadge(badgeVariant);
        }
    }

    @Override // ru.ozon.app.android.tabbar.ui.controller.TabUiController
    public void onInit() {
        super.onInit();
        observeViewModel();
    }

    @Override // ru.ozon.app.android.tabbar.ui.controller.TabUiController
    public void onTabSelected(boolean wasTheSame) {
        getViewModel().onProfileTabSelected(wasTheSame);
    }
}
