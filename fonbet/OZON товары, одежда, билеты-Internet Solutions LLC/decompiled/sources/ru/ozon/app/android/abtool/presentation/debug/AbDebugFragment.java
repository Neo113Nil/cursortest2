package ru.ozon.app.android.abtool.presentation.debug;

import Ae.C2399j;
import Ae.C2408n0;
import Ae.M0;
import Ar.c;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.b0;
import androidx.fragment.app.r;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5427n;
import androidx.lifecycle.K;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.abtool.R$string;
import ru.ozon.app.android.abtool.databinding.FragmentAbDebugBinding;
import ru.ozon.app.android.abtool.presentation.BaseFragment;
import ru.ozon.app.android.abtool.utils.ApplicationUtilsKt;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u0010\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/abtool/presentation/debug/AbDebugFragment;", "Lru/ozon/app/android/abtool/presentation/BaseFragment;", "Lru/ozon/app/android/abtool/databinding/FragmentAbDebugBinding;", "<init>", "()V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Lru/ozon/app/android/abtool/databinding/FragmentAbDebugBinding;", "Lru/ozon/app/android/abtool/presentation/debug/AbDebugViewModel;", "viewModel$delegate", "LSc/j;", "getViewModel", "()Lru/ozon/app/android/abtool/presentation/debug/AbDebugViewModel;", "viewModel", "Companion", "abzone_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AbDebugFragment extends BaseFragment<FragmentAbDebugBinding> {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final ActionType DEFAULT_ACTION_TYPE = ActionType.APPEND;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j viewModel;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/abtool/presentation/debug/AbDebugFragment$Companion;", "", "<init>", "()V", "EXTRA_VARIANTS", "", "EXTRA_ACTION_TYPE", "DEFAULT_ACTION_TYPE", "Lru/ozon/app/android/abtool/presentation/debug/ActionType;", "getDEFAULT_ACTION_TYPE$abzone_release", "()Lru/ozon/app/android/abtool/presentation/debug/ActionType;", "newInstance", "Lru/ozon/app/android/abtool/presentation/debug/AbDebugFragment;", "variants", "actionTypeOrdinal", "", "abzone_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ActionType getDEFAULT_ACTION_TYPE$abzone_release() {
            return AbDebugFragment.DEFAULT_ACTION_TYPE;
        }

        @NotNull
        public final AbDebugFragment newInstance(@NotNull String variants, int actionTypeOrdinal) {
            Intrinsics.checkNotNullParameter(variants, "variants");
            AbDebugFragment abDebugFragment = new AbDebugFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("extra_action_type", actionTypeOrdinal);
            bundle.putString("extra_variants", variants);
            abDebugFragment.setArguments(bundle);
            return abDebugFragment;
        }

        private Companion() {
        }
    }

    public AbDebugFragment() {
        AbDebugFragment$viewModel$2 abDebugFragment$viewModel$2 = new AbDebugFragment$viewModel$2(this);
        InterfaceC4008j a11 = k.a(n.NONE, new AbDebugFragment$special$$inlined$viewModels$default$2(new AbDebugFragment$special$$inlined$viewModels$default$1(this)));
        this.viewModel = b0.b(this, N.b(AbDebugViewModel.class), new AbDebugFragment$special$$inlined$viewModels$default$3(a11), new AbDebugFragment$special$$inlined$viewModels$default$4(null, a11), abDebugFragment$viewModel$2);
    }

    private final AbDebugViewModel getViewModel() {
        return (AbDebugViewModel) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$1$lambda$0(AbDebugFragment abDebugFragment, View view) {
        Context requireContext = abDebugFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        ApplicationUtilsKt.restartApp(requireContext);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        r activity = getActivity();
        if (activity != null) {
            activity.setTitle(R$string.ab_title);
        }
        FragmentAbDebugBinding binding = getBinding();
        binding.btnRestartApp.setOnClickListener(new c(this, 7));
        M0<UiState> state = getViewModel().getState();
        AbstractC5434v lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
        C2399j.C(new C2408n0(C5427n.a(state, lifecycle, AbstractC5434v.b.STARTED), new AbDebugFragment$onViewCreated$1$2(binding, this, null)), K.a(this));
    }

    @Override // ru.ozon.app.android.abtool.presentation.BaseFragment
    @NotNull
    public FragmentAbDebugBinding getViewBinding(@NotNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        FragmentAbDebugBinding inflate = FragmentAbDebugBinding.inflate(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }
}
