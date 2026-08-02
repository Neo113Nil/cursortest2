package ru.ozon.app.android.pdp.ui.configurators.ugc.bottomsheets.comments;

import BC.a;
import EZ.h;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.G;
import androidx.fragment.app.Q;
import androidx.lifecycle.J;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.b;
import gi.C6739a;
import gi.C6740b;
import hi.InterfaceC6958a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.universalscreen.view.ComposerFragment;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.pdp.ui.configurators.databinding.FragmentBottomSheetCommentsBinding;
import ru.ozon.app.android.pdp.ui.configurators.ugc.bottomsheets.ReviewBottomSheetDialog;
import ru.ozon.app.android.pdp.ui.configurators.ugc.bottomsheets.ReviewBottomSheetNavigator;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.uni.R$id;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.controls.button.IconButtonView;
import ru.ozon.uni.atoms.data.controls.button.IconButtonDTO;
import ru.ozon.uni.core.R$drawable;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 32\u00020\u0001:\u00013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0003J'\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001a2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010!\u001a\u00020 2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0005H\u0016¢\u0006\u0004\b&\u0010\u0003J\u000f\u0010'\u001a\u00020\u0005H\u0016¢\u0006\u0004\b'\u0010\u0003R\u0016\u0010)\u001a\u00020(8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010,\u001a\u00020+8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u0010.\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00102\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b0\u00101¨\u00064"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/bottomsheets/comments/ReviewCommentsBottomSheetFragment;", "Lcom/google/android/material/bottomsheet/b;", "<init>", "()V", "Lru/ozon/app/android/pdp/ui/configurators/databinding/FragmentBottomSheetCommentsBinding;", "", "addCloseButton", "(Lru/ozon/app/android/pdp/ui/configurators/databinding/FragmentBottomSheetCommentsBinding;)V", "setupNavigator", "Landroid/content/Context;", "context", "Lkotlin/Function0;", "onDismiss", "Lru/ozon/uni/android/controls/button/IconButtonView;", "createCloseButton", "(Landroid/content/Context;Lkotlin/jvm/functions/Function0;)Lru/ozon/uni/android/controls/button/IconButtonView;", "onAttach", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lru/ozon/app/android/pdp/ui/configurators/ugc/bottomsheets/ReviewBottomSheetDialog;", "onCreateDialog", "(Landroid/os/Bundle;)Lru/ozon/app/android/pdp/ui/configurators/ugc/bottomsheets/ReviewBottomSheetDialog;", "", "getTheme", "()I", "onDestroyView", "onDestroy", "LEZ/h;", "navigatorHolder", "LEZ/h;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;", "screenConfig", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;", "_binding", "Lru/ozon/app/android/pdp/ui/configurators/databinding/FragmentBottomSheetCommentsBinding;", "getBinding", "()Lru/ozon/app/android/pdp/ui/configurators/databinding/FragmentBottomSheetCommentsBinding;", "binding", "Companion", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"LifecycleMethodsOrder"})
/* loaded from: classes13.dex */
public final class ReviewCommentsBottomSheetFragment extends b {
    private FragmentBottomSheetCommentsBinding _binding;
    private h navigatorHolder;
    private ComposerScreenConfig screenConfig;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/bottomsheets/comments/ReviewCommentsBottomSheetFragment$Companion;", "", "<init>", "()V", "newInstance", "Lru/ozon/app/android/pdp/ui/configurators/ugc/bottomsheets/comments/ReviewCommentsBottomSheetFragment;", "config", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ReviewCommentsBottomSheetFragment newInstance(@NotNull ComposerScreenConfig config) {
            Intrinsics.checkNotNullParameter(config, "config");
            ReviewCommentsBottomSheetFragment reviewCommentsBottomSheetFragment = new ReviewCommentsBottomSheetFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("EXTRA_COMPOSER_SCREEN_CONFIG", config);
            reviewCommentsBottomSheetFragment.setArguments(bundle);
            return reviewCommentsBottomSheetFragment;
        }

        private Companion() {
        }
    }

    private final void addCloseButton(FragmentBottomSheetCommentsBinding fragmentBottomSheetCommentsBinding) {
        FrameLayout constraintLayout = fragmentBottomSheetCommentsBinding.getConstraintLayout();
        Context context = constraintLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        View createCloseButton = createCloseButton(context, new ReviewCommentsBottomSheetFragment$addCloseButton$1$closeButton$1(this));
        createCloseButton.setId(R$id.sheetViewCloseButton);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388661;
        Dimens dimens = Dimens.INSTANCE;
        layoutParams.setMarginEnd(dimens.getDP_16());
        layoutParams.topMargin = dimens.getDP_16();
        createCloseButton.setLayoutParams(layoutParams);
        constraintLayout.addView(createCloseButton);
    }

    private final IconButtonView createCloseButton(Context context, Function0<Unit> onDismiss) {
        AttributeSet attributeSet = null;
        IconButtonView iconButtonView = new IconButtonView(context, attributeSet, 0, R$style.Button_NeutralSecondary, null, 22, null);
        iconButtonView.setPreset(IconButtonDTO.Preset.SIZE_HEADER_400);
        iconButtonView.setIcon(Integer.valueOf(R$drawable.ic_s_cross));
        iconButtonView.setOnClickListener(new a(onDismiss, 0));
        return iconButtonView;
    }

    private final FragmentBottomSheetCommentsBinding getBinding() {
        FragmentBottomSheetCommentsBinding fragmentBottomSheetCommentsBinding = this._binding;
        Intrinsics.f(fragmentBottomSheetCommentsBinding);
        return fragmentBottomSheetCommentsBinding;
    }

    private final void setupNavigator() {
        ComposerScreenConfig composerScreenConfig = this.screenConfig;
        if (composerScreenConfig == null) {
            Intrinsics.n("screenConfig");
            throw null;
        }
        Bundle arguments = getArguments();
        ReviewBottomSheetNavigator reviewBottomSheetNavigator = new ReviewBottomSheetNavigator(this, composerScreenConfig, arguments != null ? arguments.getBoolean("activateCommentField") : false, ru.ozon.app.android.pdp.ui.configurators.R$id.commentsContainer);
        h hVar = this.navigatorHolder;
        if (hVar == null) {
            Intrinsics.n("navigatorHolder");
            throw null;
        }
        J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        yZ.h.b(hVar, viewLifecycleOwner, reviewBottomSheetNavigator);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k
    public int getTheme() {
        return ru.ozon.app.android.uikit.R$style.OzonBottomSheetDialog_AdjustResize;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        C6740b dependencyStorage = C6739a.b(this, NavigationComponentApi.class).getDependencyStorage();
        if (NavigationComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NavigationComponentApi is not DiComponent");
        }
        this.navigatorHolder = ((NavigationComponentApi) dependencyStorage.b(NavigationComponentApi.class)).getNavigatorHolder();
        super.onAttach(context);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        ComposerScreenConfig composerScreenConfig = arguments != null ? (ComposerScreenConfig) arguments.getParcelable("EXTRA_COMPOSER_SCREEN_CONFIG") : null;
        if (composerScreenConfig == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        this.screenConfig = composerScreenConfig;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        FragmentBottomSheetCommentsBinding inflate = FragmentBottomSheetCommentsBinding.inflate(inflater, container, false);
        Intrinsics.f(inflate);
        addCloseButton(inflate);
        this._binding = inflate;
        FrameLayout constraintLayout = getBinding().getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        return constraintLayout;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onDestroy() {
        ComponentCallbacksC5392m f02 = getChildFragmentManager().f0(ru.ozon.app.android.pdp.ui.configurators.R$id.commentsContainer);
        if (f02 != null) {
            G childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            Q p11 = childFragmentManager.p();
            p11.q(f02);
            p11.j();
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public void onDestroyView() {
        super.onDestroyView();
        this._binding = null;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (savedInstanceState == null) {
            ComposerFragment composerFragment = new ComposerFragment();
            Bundle bundle = new Bundle();
            ComposerScreenConfig composerScreenConfig = this.screenConfig;
            if (composerScreenConfig == null) {
                Intrinsics.n("screenConfig");
                throw null;
            }
            bundle.putParcelable("EXTRA_COMPOSER_SCREEN_CONFIG", composerScreenConfig);
            composerFragment.setArguments(bundle);
            G childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            Q p11 = childFragmentManager.p();
            Intrinsics.checkNotNullExpressionValue(p11, "beginTransaction(...)");
            p11.r(ru.ozon.app.android.pdp.ui.configurators.R$id.commentsContainer, composerFragment, null);
            p11.i();
        }
        setupNavigator();
    }

    @Override // com.google.android.material.bottomsheet.b, androidx.appcompat.app.x, androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k
    @NotNull
    public ReviewBottomSheetDialog onCreateDialog(Bundle savedInstanceState) {
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        ReviewBottomSheetDialog reviewBottomSheetDialog = new ReviewBottomSheetDialog(requireContext, getTheme(), -2);
        BottomSheetBehavior<FrameLayout> behavior = reviewBottomSheetDialog.getBehavior();
        behavior.setState(3);
        behavior.setFitToContents(true);
        behavior.setSkipCollapsed(true);
        return reviewBottomSheetDialog;
    }
}
