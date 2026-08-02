package ru.ozon.app.android.pdp.ui.configurators.ugc.bottomsheets.singleReviewBottom;

import CC.a;
import EZ.h;
import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.d;
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
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.universalscreen.view.ComposerFragment;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.pdp.ui.configurators.R$id;
import ru.ozon.app.android.pdp.ui.configurators.databinding.FragmentSingleReviewBottomSheetBinding;
import ru.ozon.app.android.pdp.ui.configurators.ugc.bottomsheets.ReviewBottomSheetDialog;
import ru.ozon.app.android.pdp.ui.configurators.ugc.bottomsheets.ReviewBottomSheetNavigator;
import ru.ozon.app.android.storefront.core.socialAtoms.iconButton.SocialIconButtonDTO;
import ru.ozon.app.android.storefront.core.socialAtoms.iconButton.SocialIconButtonHolderKt;
import ru.ozon.app.android.storefront.core.socialAtoms.iconButton.SocialIconButtonView;
import ru.ozon.app.android.storefront.core.socialAtoms.iconButton.style.CornerStyle;
import ru.ozon.app.android.storefront.core.socialAtoms.iconButton.style.Size;
import ru.ozon.app.android.storefront.core.socialAtoms.iconButton.style.Style;
import ru.ozon.app.android.uikit.R$style;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 .2\u00020\u0001:\u0001.B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00132\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001a\u001a\u00020\u00192\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001f\u0010\u0003J\u000f\u0010 \u001a\u00020\u0004H\u0016¢\u0006\u0004\b \u0010\u0003J\u000f\u0010!\u001a\u00020\u0004H\u0016¢\u0006\u0004\b!\u0010\u0003R\u0016\u0010#\u001a\u00020\"8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010&\u001a\u00020%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010)\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010-\u001a\u00020(8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006/"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/bottomsheets/singleReviewBottom/SingleReviewBottomSheetFragment;", "Lcom/google/android/material/bottomsheet/b;", "<init>", "()V", "", "setupNavigator", "bindCloseButton", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lru/ozon/app/android/pdp/ui/configurators/ugc/bottomsheets/ReviewBottomSheetDialog;", "onCreateDialog", "(Landroid/os/Bundle;)Lru/ozon/app/android/pdp/ui/configurators/ugc/bottomsheets/ReviewBottomSheetDialog;", "", "getTheme", "()I", "onPause", "onDestroyView", "onDestroy", "LEZ/h;", "navigatorHolder", "LEZ/h;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;", "screenConfig", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;", "Lru/ozon/app/android/pdp/ui/configurators/databinding/FragmentSingleReviewBottomSheetBinding;", "_binding", "Lru/ozon/app/android/pdp/ui/configurators/databinding/FragmentSingleReviewBottomSheetBinding;", "getBinding", "()Lru/ozon/app/android/pdp/ui/configurators/databinding/FragmentSingleReviewBottomSheetBinding;", "binding", "Companion", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"LifecycleMethodsOrder"})
/* loaded from: classes13.dex */
public final class SingleReviewBottomSheetFragment extends b {
    private FragmentSingleReviewBottomSheetBinding _binding;
    private h navigatorHolder;
    private ComposerScreenConfig screenConfig;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final int offsetFromTop = UiExtKt.toPx(24);

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/bottomsheets/singleReviewBottom/SingleReviewBottomSheetFragment$Companion;", "", "<init>", "()V", "offsetFromTop", "", "newInstance", "Lru/ozon/app/android/pdp/ui/configurators/ugc/bottomsheets/singleReviewBottom/SingleReviewBottomSheetFragment;", "config", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;", "needActivateCommentField", "", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SingleReviewBottomSheetFragment newInstance(@NotNull ComposerScreenConfig config, boolean needActivateCommentField) {
            Intrinsics.checkNotNullParameter(config, "config");
            SingleReviewBottomSheetFragment singleReviewBottomSheetFragment = new SingleReviewBottomSheetFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("EXTRA_COMPOSER_SCREEN_CONFIG", config);
            bundle.putBoolean("activateCommentField", needActivateCommentField);
            singleReviewBottomSheetFragment.setArguments(bundle);
            return singleReviewBottomSheetFragment;
        }

        private Companion() {
        }
    }

    private final void bindCloseButton() {
        SocialIconButtonDTO socialIconButtonDTO = new SocialIconButtonDTO(Style.STYLE_NEUTRAL, CornerStyle.CORNER_STYLE_ROUNDED, Size.SIZE_XS, "ic_s_cross_compact", null, null, null, 80, null);
        SocialIconButtonView closeButton = getBinding().closeButton;
        Intrinsics.checkNotNullExpressionValue(closeButton, "closeButton");
        SocialIconButtonHolderKt.bind$default(closeButton, socialIconButtonDTO, null, 2, null);
        getBinding().closeButton.setOnClickListener(new a(this, 0));
    }

    private final FragmentSingleReviewBottomSheetBinding getBinding() {
        FragmentSingleReviewBottomSheetBinding fragmentSingleReviewBottomSheetBinding = this._binding;
        Intrinsics.f(fragmentSingleReviewBottomSheetBinding);
        return fragmentSingleReviewBottomSheetBinding;
    }

    private final void setupNavigator() {
        ComposerScreenConfig composerScreenConfig = this.screenConfig;
        if (composerScreenConfig == null) {
            Intrinsics.n("screenConfig");
            throw null;
        }
        Bundle arguments = getArguments();
        ReviewBottomSheetNavigator reviewBottomSheetNavigator = new ReviewBottomSheetNavigator(this, composerScreenConfig, arguments != null ? arguments.getBoolean("activateCommentField") : false, R$id.reviewContainer);
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
        return R$style.OzonBottomSheetDialog_AdjustResize;
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
        this._binding = FragmentSingleReviewBottomSheetBinding.inflate(inflater, container, false);
        bindCloseButton();
        ConstraintLayout constraintLayout = getBinding().getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        return constraintLayout;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onDestroy() {
        ComponentCallbacksC5392m f02 = getChildFragmentManager().f0(R$id.reviewContainer);
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
    public void onPause() {
        Window window;
        super.onPause();
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setWindowAnimations(-1);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (savedInstanceState == null) {
            ComposerFragment.Companion companion = ComposerFragment.INSTANCE;
            ComposerScreenConfig composerScreenConfig = this.screenConfig;
            if (composerScreenConfig == null) {
                Intrinsics.n("screenConfig");
                throw null;
            }
            Bundle arguments = getArguments();
            ComposerFragment newInstance$default = ComposerFragment.Companion.newInstance$default(companion, composerScreenConfig, null, d.b(new Pair("activateCommentField", arguments != null ? Boolean.valueOf(arguments.getBoolean("activateCommentField")) : null)), 2, null);
            G childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            Q p11 = childFragmentManager.p();
            Intrinsics.checkNotNullExpressionValue(p11, "beginTransaction(...)");
            p11.r(R$id.reviewContainer, newInstance$default, null);
            p11.i();
        }
        setupNavigator();
    }

    @Override // com.google.android.material.bottomsheet.b, androidx.appcompat.app.x, androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k
    @NotNull
    public ReviewBottomSheetDialog onCreateDialog(Bundle savedInstanceState) {
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        ReviewBottomSheetDialog reviewBottomSheetDialog = new ReviewBottomSheetDialog(requireContext, getTheme(), 0, 4, null);
        BottomSheetBehavior<FrameLayout> behavior = reviewBottomSheetDialog.getBehavior();
        behavior.setState(3);
        behavior.setFitToContents(false);
        behavior.setExpandedOffset(offsetFromTop);
        behavior.setSkipCollapsed(true);
        return reviewBottomSheetDialog;
    }
}
