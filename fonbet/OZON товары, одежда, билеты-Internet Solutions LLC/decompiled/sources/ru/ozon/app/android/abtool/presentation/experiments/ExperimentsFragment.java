package ru.ozon.app.android.abtool.presentation.experiments;

import Sc.InterfaceC4008j;
import Sc.k;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.a;
import androidx.recyclerview.widget.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.abtool.AbToolNamespace;
import ru.ozon.app.android.abtool.R$drawable;
import ru.ozon.app.android.abtool.databinding.FragmentAbToggleExperimentsBinding;
import ru.ozon.app.android.abtool.presentation.AbToggleViewModel;
import ru.ozon.app.android.abtool.presentation.BaseFragment;
import ru.ozon.app.android.abtool.presentation.experiments.recycler.ExperimentsAdapter;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J+\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/abtool/presentation/experiments/ExperimentsFragment;", "Lru/ozon/app/android/abtool/presentation/BaseFragment;", "Lru/ozon/app/android/abtool/databinding/FragmentAbToggleExperimentsBinding;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "getViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Lru/ozon/app/android/abtool/databinding/FragmentAbToggleExperimentsBinding;", "Landroid/view/View;", "view", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lru/ozon/app/android/abtool/presentation/AbToggleViewModel;", "viewModel$delegate", "LSc/j;", "getViewModel", "()Lru/ozon/app/android/abtool/presentation/AbToggleViewModel;", "viewModel", "Companion", "abzone_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ExperimentsFragment extends BaseFragment<FragmentAbToggleExperimentsBinding> {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j viewModel = k.b(new ExperimentsFragment$viewModel$2(this));

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/abtool/presentation/experiments/ExperimentsFragment$Companion;", "", "<init>", "()V", "newInstance", "Lru/ozon/app/android/abtool/presentation/experiments/ExperimentsFragment;", "namespace", "Lru/ozon/app/android/abtool/AbToolNamespace;", "abzone_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ExperimentsFragment newInstance(@NotNull AbToolNamespace namespace) {
            Intrinsics.checkNotNullParameter(namespace, "namespace");
            ExperimentsFragment experimentsFragment = new ExperimentsFragment();
            Bundle bundle = new Bundle();
            bundle.putString("NAMESPACE", namespace.name());
            experimentsFragment.setArguments(bundle);
            return experimentsFragment;
        }

        private Companion() {
        }
    }

    private final AbToggleViewModel getViewModel() {
        return (AbToggleViewModel) this.viewModel.getValue();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ExperimentsAdapter experimentsAdapter = new ExperimentsAdapter();
        getBinding().abExperimentsRv.setAdapter(experimentsAdapter);
        Drawable drawable = a.getDrawable(requireContext(), R$drawable.divider);
        if (drawable != null) {
            j jVar = new j(getContext(), 1);
            jVar.setDrawable(drawable);
            getBinding().abExperimentsRv.addItemDecoration(jVar);
        }
        getViewModel().getExperimentsLiveData().observe(getViewLifecycleOwner(), new ExperimentsFragment$sam$androidx_lifecycle_Observer$0(new ExperimentsFragment$onViewCreated$1(experimentsAdapter)));
    }

    @Override // ru.ozon.app.android.abtool.presentation.BaseFragment
    @NotNull
    public FragmentAbToggleExperimentsBinding getViewBinding(@NotNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        FragmentAbToggleExperimentsBinding inflate = FragmentAbToggleExperimentsBinding.inflate(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }
}
