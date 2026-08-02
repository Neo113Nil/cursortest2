package ru.ozon.app.android.regulardraw.miniapp;

import EZ.g;
import EZ.h;
import GZ.l;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.C;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.J;
import gi.C6739a;
import gi.C6740b;
import hi.InterfaceC6958a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.regulardraw.databinding.FragmentRegularDrawRootBinding;
import ru.ozon.app.android.regulardraw.miniapp.di.DaggerRegularDrawComponent;
import ru.ozon.app.android.regulardraw.miniapp.di.RegularDrawComponent;
import ru.ozon.app.android.uikit.utils.StatusBarController;

@Metadata(d1 = {"\u0000[\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001(\b\u0001\u0018\u0000 12\u00020\u0001:\u00011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\u0003R\"\u0010\u0018\u001a\u00020\u00178\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\u001f\u001a\u00020\u001e8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0016\u0010&\u001a\u00020%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010,\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00100\u001a\u00020+8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00062"}, d2 = {"Lru/ozon/app/android/regulardraw/miniapp/RegularDrawRootFragment;", "Landroidx/fragment/app/m;", "<init>", "()V", "", "bindNavigator", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "LGZ/g;", "router", "LGZ/g;", "getRouter", "()LGZ/g;", "setRouter", "(LGZ/g;)V", "LEZ/h;", "navigatorHolder", "LEZ/h;", "getNavigatorHolder", "()LEZ/h;", "setNavigatorHolder", "(LEZ/h;)V", "LEZ/g;", "navigator", "LEZ/g;", "ru/ozon/app/android/regulardraw/miniapp/RegularDrawRootFragment$onBackPressedCallback$1", "onBackPressedCallback", "Lru/ozon/app/android/regulardraw/miniapp/RegularDrawRootFragment$onBackPressedCallback$1;", "Lru/ozon/app/android/regulardraw/databinding/FragmentRegularDrawRootBinding;", "_binding", "Lru/ozon/app/android/regulardraw/databinding/FragmentRegularDrawRootBinding;", "getBinding", "()Lru/ozon/app/android/regulardraw/databinding/FragmentRegularDrawRootBinding;", "binding", "Companion", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class RegularDrawRootFragment extends ComponentCallbacksC5392m {
    private FragmentRegularDrawRootBinding _binding;
    private g navigator;
    public h navigatorHolder;

    @NotNull
    private final RegularDrawRootFragment$onBackPressedCallback$1 onBackPressedCallback = new C() { // from class: ru.ozon.app.android.regulardraw.miniapp.RegularDrawRootFragment$onBackPressedCallback$1
        {
            super(true);
        }

        @Override // androidx.activity.C
        public void handleOnBackPressed() {
            l.a(RegularDrawRootFragment.this.getRouter());
        }
    };
    public GZ.g router;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/regulardraw/miniapp/RegularDrawRootFragment$Companion;", "", "<init>", "()V", "Landroidx/fragment/app/m;", "newInstance", "()Landroidx/fragment/app/m;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ComponentCallbacksC5392m newInstance() {
            return new RegularDrawRootFragment();
        }

        private Companion() {
        }
    }

    private final void bindNavigator() {
        this.navigator = new RegularDrawFragmentNavigator(this);
        h navigatorHolder = getNavigatorHolder();
        J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        g gVar = this.navigator;
        if (gVar != null) {
            yZ.h.b(navigatorHolder, viewLifecycleOwner, gVar);
        } else {
            Intrinsics.n("navigator");
            throw null;
        }
    }

    private final FragmentRegularDrawRootBinding getBinding() {
        FragmentRegularDrawRootBinding fragmentRegularDrawRootBinding = this._binding;
        if (fragmentRegularDrawRootBinding != null) {
            return fragmentRegularDrawRootBinding;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @NotNull
    public final h getNavigatorHolder() {
        h hVar = this.navigatorHolder;
        if (hVar != null) {
            return hVar;
        }
        Intrinsics.n("navigatorHolder");
        throw null;
    }

    @NotNull
    public final GZ.g getRouter() {
        GZ.g gVar = this.router;
        if (gVar != null) {
            return gVar;
        }
        Intrinsics.n("router");
        throw null;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        RegularDrawComponent.Factory factory = DaggerRegularDrawComponent.factory();
        C6740b dependencyStorage = C6739a.b(this, NavigationComponentApi.class).getDependencyStorage();
        if (NavigationComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NavigationComponentApi is not DiComponent");
        }
        factory.create((NavigationComponentApi) dependencyStorage.b(NavigationComponentApi.class)).inject(this);
        super.onAttach(context);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this._binding = FragmentRegularDrawRootBinding.inflate(inflater, null, false);
        CoordinatorLayout constraintLayout = getBinding().getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        return constraintLayout;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onDestroyView() {
        this._binding = null;
        StatusBarController.setStatusBarColorByTheme$default(StatusBarController.INSTANCE, this, StatusBarController.UpdateReason.Recovery.INSTANCE, 0, 4, null);
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        StatusBarController.setStatusBarContentColor$default(StatusBarController.INSTANCE, this, StatusBarController.UpdateReason.NewState.INSTANCE, true, false, 8, null);
        androidx.activity.J onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        onBackPressedDispatcher.h(viewLifecycleOwner, this.onBackPressedCallback);
        bindNavigator();
    }
}
