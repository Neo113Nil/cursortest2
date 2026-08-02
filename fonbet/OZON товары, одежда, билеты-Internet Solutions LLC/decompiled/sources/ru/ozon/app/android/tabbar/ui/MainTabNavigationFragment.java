package ru.ozon.app.android.tabbar.ui;

import X4.a;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.FragmentContainerView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.tabbar.ui.databinding.FragmentMainTabNavigationBinding;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u0003R\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/tabbar/ui/MainTabNavigationFragment;", "Lru/ozon/app/android/tabbar/ui/TabNavigationFragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "LX4/a;", "initViewBinding", "(Landroid/view/LayoutInflater;)LX4/a;", "", "clearResources", "Lru/ozon/app/android/tabbar/ui/databinding/FragmentMainTabNavigationBinding;", "_binding", "Lru/ozon/app/android/tabbar/ui/databinding/FragmentMainTabNavigationBinding;", "getBinding", "()Lru/ozon/app/android/tabbar/ui/databinding/FragmentMainTabNavigationBinding;", "binding", "Lru/ozon/app/android/tabbar/ui/OzonBottomNavigationView;", "getBottomNavigation", "()Lru/ozon/app/android/tabbar/ui/OzonBottomNavigationView;", "bottomNavigation", "Landroidx/fragment/app/FragmentContainerView;", "getRootContainer", "()Landroidx/fragment/app/FragmentContainerView;", "rootContainer", "Companion", "tabbar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MainTabNavigationFragment extends TabNavigationFragment {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private FragmentMainTabNavigationBinding _binding;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/tabbar/ui/MainTabNavigationFragment$Companion;", "", "<init>", "()V", "", "redirectDeeplink", "Landroidx/fragment/app/m;", "newInstance", "(Ljava/lang/String;)Landroidx/fragment/app/m;", "tabbar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ComponentCallbacksC5392m newInstance(String redirectDeeplink) {
            MainTabNavigationFragment mainTabNavigationFragment = new MainTabNavigationFragment();
            Bundle bundle = new Bundle();
            bundle.putString("ru.ozon.app.android.ui.TabNavigationFragment.EXTRA_REDIRECT_DESTINATION", redirectDeeplink);
            mainTabNavigationFragment.setArguments(bundle);
            return mainTabNavigationFragment;
        }

        private Companion() {
        }
    }

    public MainTabNavigationFragment() {
        super(R$layout.fragment_main_tab_navigation);
    }

    private final FragmentMainTabNavigationBinding getBinding() {
        FragmentMainTabNavigationBinding fragmentMainTabNavigationBinding = this._binding;
        if (fragmentMainTabNavigationBinding != null) {
            return fragmentMainTabNavigationBinding;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // ru.ozon.app.android.tabbar.ui.TabNavigationFragment
    public void clearResources() {
        this._binding = null;
    }

    @Override // ru.ozon.app.android.tabbar.ui.TabNavigationFragment
    @NotNull
    public OzonBottomNavigationView getBottomNavigation() {
        OzonBottomNavigationView bottomNavigation = getBinding().bottomNavigation;
        Intrinsics.checkNotNullExpressionValue(bottomNavigation, "bottomNavigation");
        return bottomNavigation;
    }

    @Override // ru.ozon.app.android.tabbar.ui.TabNavigationFragment
    @NotNull
    public FragmentContainerView getRootContainer() {
        FragmentContainerView rootContainer = getBinding().rootContainer;
        Intrinsics.checkNotNullExpressionValue(rootContainer, "rootContainer");
        return rootContainer;
    }

    @Override // ru.ozon.app.android.tabbar.ui.TabNavigationFragment
    @NotNull
    public a initViewBinding(@NotNull LayoutInflater inflater) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this._binding = FragmentMainTabNavigationBinding.inflate(inflater, null, false);
        return getBinding();
    }
}
