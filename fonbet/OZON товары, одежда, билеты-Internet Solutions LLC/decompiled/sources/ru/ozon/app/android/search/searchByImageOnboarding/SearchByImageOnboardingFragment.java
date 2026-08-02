package ru.ozon.app.android.search.searchByImageOnboarding;

import Sc.InterfaceC3999a;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.os.d;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.Q;
import com.google.android.material.bottomsheet.b;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerFragmentController;
import ru.ozon.app.android.composer.universalscreen.view.ComposerFragment;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.search.R$id;
import ru.ozon.app.android.search.R$style;
import ru.ozon.app.android.search.databinding.FragmentSearchByImageOnboardingBinding;
import ru.ozon.app.android.uikit.view.dialog.OzonBottomSheetDialog;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 \u001b2\u00020\u00012\u00020\u0002:\u0001\u001bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ-\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u00020\u00112\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0014\u0010\u0004R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/search/searchByImageOnboarding/SearchByImageOnboardingFragment;", "Lcom/google/android/material/bottomsheet/b;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerFragment$Host;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "onDestroyView", "Lru/ozon/app/android/search/databinding/FragmentSearchByImageOnboardingBinding;", "_binding", "Lru/ozon/app/android/search/databinding/FragmentSearchByImageOnboardingBinding;", "getBinding", "()Lru/ozon/app/android/search/databinding/FragmentSearchByImageOnboardingBinding;", "binding", "Companion", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SearchByImageOnboardingFragment extends b implements ComposerFragment.Host {
    private FragmentSearchByImageOnboardingBinding _binding;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/search/searchByImageOnboarding/SearchByImageOnboardingFragment$Companion;", "", "<init>", "()V", "KEY_EXTRA_COMPOSER_SCREEN_CONFIG", "", "TAG_COMPOSER_CHILD_FRAGMENT", "newInstance", "Lru/ozon/app/android/search/searchByImageOnboarding/SearchByImageOnboardingFragment;", "screenConfig", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SearchByImageOnboardingFragment newInstance(@NotNull ComposerScreenConfig screenConfig) {
            Intrinsics.checkNotNullParameter(screenConfig, "screenConfig");
            SearchByImageOnboardingFragment searchByImageOnboardingFragment = new SearchByImageOnboardingFragment();
            searchByImageOnboardingFragment.setArguments(d.b(new Pair("KeyExtraComposerScreenConfig", screenConfig)));
            return searchByImageOnboardingFragment;
        }

        private Companion() {
        }
    }

    private final FragmentSearchByImageOnboardingBinding getBinding() {
        FragmentSearchByImageOnboardingBinding fragmentSearchByImageOnboardingBinding = this._binding;
        Intrinsics.f(fragmentSearchByImageOnboardingBinding);
        return fragmentSearchByImageOnboardingBinding;
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerFragment.Host
    @InterfaceC3999a
    public void onComposerCreated(@NotNull ComponentCallbacksC5392m componentCallbacksC5392m, @NotNull ComposerFragmentController composerFragmentController) {
        ComposerFragment.Host.DefaultImpls.onComposerCreated(this, componentCallbacksC5392m, composerFragmentController);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public void onCreate(Bundle savedInstanceState) {
        Bundle arguments;
        ComposerScreenConfig composerScreenConfig;
        super.onCreate(savedInstanceState);
        if (savedInstanceState != null || (arguments = getArguments()) == null || (composerScreenConfig = (ComposerScreenConfig) arguments.getParcelable("KeyExtraComposerScreenConfig")) == null) {
            return;
        }
        ComposerFragment newInstance$default = ComposerFragment.Companion.newInstance$default(ComposerFragment.INSTANCE, composerScreenConfig, ComposerFragment.DisplayMode.BOTTOM_SHEET_FULL, null, 4, null);
        Q p11 = getChildFragmentManager().p();
        p11.b(R$id.composerContainer, newInstance$default, "OnboardingFragment");
        p11.i();
    }

    @Override // com.google.android.material.bottomsheet.b, androidx.appcompat.app.x, androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k
    @NotNull
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        int i11 = ThemeExtKt.isDarkThemeActive(requireContext) ? R$style.SearchByImageOnboardingDialogDark : R$style.SearchByImageOnboardingDialog;
        Context requireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
        return new OzonBottomSheetDialog(requireContext2, i11, 0, false, null, false, false, false, null, false, 476, null);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this._binding = FragmentSearchByImageOnboardingBinding.inflate(inflater, container, false);
        return getBinding().getConstraintLayout();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public void onDestroyView() {
        super.onDestroyView();
        this._binding = null;
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerFragment.Host
    public void onComposerCreated(@NotNull ComponentCallbacksC5392m componentCallbacksC5392m, @NotNull ComposerFragmentController composerFragmentController, i iVar) {
        ComposerFragment.Host.DefaultImpls.onComposerCreated(this, componentCallbacksC5392m, composerFragmentController, iVar);
    }
}
