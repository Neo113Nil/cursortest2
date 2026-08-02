package ru.ozon.app.android.abtool.presentation.abvariants;

import Ae.C2399j;
import Ae.C2408n0;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.J;
import androidx.activity.L;
import androidx.fragment.app.b0;
import androidx.fragment.app.r;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5427n;
import androidx.lifecycle.K;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.abtool.R$string;
import ru.ozon.app.android.abtool.databinding.FragmentAbVariantsBinding;
import ru.ozon.app.android.abtool.presentation.BaseFragment;
import ru.ozon.app.android.abtool.presentation.abvariants.recycler.RoundedCornersItemDecoration;
import ru.ozon.app.android.abtool.presentation.abvariants.recycler.VariantsAdapter;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J+\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/abtool/presentation/abvariants/VariantsFragment;", "Lru/ozon/app/android/abtool/presentation/BaseFragment;", "Lru/ozon/app/android/abtool/databinding/FragmentAbVariantsBinding;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "getViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Lru/ozon/app/android/abtool/databinding/FragmentAbVariantsBinding;", "", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lru/ozon/app/android/abtool/presentation/abvariants/VariantsViewModel;", "viewModel$delegate", "LSc/j;", "getViewModel", "()Lru/ozon/app/android/abtool/presentation/abvariants/VariantsViewModel;", "viewModel", "abzone_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class VariantsFragment extends BaseFragment<FragmentAbVariantsBinding> {

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j viewModel;

    public VariantsFragment() {
        VariantsFragment$viewModel$2 variantsFragment$viewModel$2 = new VariantsFragment$viewModel$2(this);
        InterfaceC4008j a11 = k.a(n.NONE, new VariantsFragment$special$$inlined$viewModels$default$2(new VariantsFragment$special$$inlined$viewModels$default$1(this)));
        this.viewModel = b0.b(this, N.b(VariantsViewModel.class), new VariantsFragment$special$$inlined$viewModels$default$3(a11), new VariantsFragment$special$$inlined$viewModels$default$4(null, a11), variantsFragment$viewModel$2);
    }

    private final VariantsViewModel getViewModel() {
        return (VariantsViewModel) this.viewModel.getValue();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        r activity = getActivity();
        if (activity != null) {
            activity.setTitle(R$string.ab_variants);
        }
        J onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        Intrinsics.checkNotNullExpressionValue(onBackPressedDispatcher, "<get-onBackPressedDispatcher>(...)");
        L.a(onBackPressedDispatcher, this, new VariantsFragment$onCreate$1(this), 2);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        VariantsAdapter variantsAdapter = new VariantsAdapter(new VariantsFragment$onViewCreated$adapter$1(getViewModel()), new VariantsFragment$onViewCreated$adapter$2(getViewModel()), new VariantsFragment$onViewCreated$adapter$3(getViewModel()), new VariantsFragment$onViewCreated$adapter$4(getViewModel()));
        FragmentAbVariantsBinding binding = getBinding();
        binding.variantsRecyclerView.setItemAnimator(null);
        binding.variantsRecyclerView.setAdapter(variantsAdapter);
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        binding.variantsRecyclerView.addItemDecoration(new RoundedCornersItemDecoration(requireContext));
        C2408n0 c2408n0 = new C2408n0(C5427n.a(getViewModel().getState(), getViewLifecycleOwner().getLifecycle(), AbstractC5434v.b.STARTED), new VariantsFragment$onViewCreated$1$1(variantsAdapter, null));
        androidx.lifecycle.J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C2399j.C(c2408n0, K.a(viewLifecycleOwner));
    }

    @Override // ru.ozon.app.android.abtool.presentation.BaseFragment
    @NotNull
    public FragmentAbVariantsBinding getViewBinding(@NotNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        FragmentAbVariantsBinding inflate = FragmentAbVariantsBinding.inflate(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }
}
