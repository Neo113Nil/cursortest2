package ru.ozon.app.android.abtool.presentation.features;

import Ae.C2399j;
import Ae.C2408n0;
import Ae.InterfaceC2395h;
import Sc.InterfaceC4008j;
import Sc.k;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.EditText;
import androidx.core.content.a;
import androidx.fragment.app.G;
import androidx.fragment.app.Q;
import androidx.fragment.app.r;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5427n;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.abtool.AbToolNamespace;
import ru.ozon.app.android.abtool.R$drawable;
import ru.ozon.app.android.abtool.R$id;
import ru.ozon.app.android.abtool.databinding.FragmentAbToggleFeaturesBinding;
import ru.ozon.app.android.abtool.presentation.AbToggleViewModel;
import ru.ozon.app.android.abtool.presentation.BaseFragment;
import ru.ozon.app.android.abtool.presentation.abvariants.VariantsFragment;
import ru.ozon.app.android.abtool.presentation.features.recycler.AbToggleAdapter;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J+\u0010\r\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/abtool/presentation/features/FeaturesFragment;", "Lru/ozon/app/android/abtool/presentation/BaseFragment;", "Lru/ozon/app/android/abtool/databinding/FragmentAbToggleFeaturesBinding;", "<init>", "()V", "", "initRecycler", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "getViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Lru/ozon/app/android/abtool/databinding/FragmentAbToggleFeaturesBinding;", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lru/ozon/app/android/abtool/presentation/features/recycler/AbToggleAdapter;", "adapter", "Lru/ozon/app/android/abtool/presentation/features/recycler/AbToggleAdapter;", "Lru/ozon/app/android/abtool/presentation/AbToggleViewModel;", "viewModel$delegate", "LSc/j;", "getViewModel", "()Lru/ozon/app/android/abtool/presentation/AbToggleViewModel;", "viewModel", "Companion", "abzone_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FeaturesFragment extends BaseFragment<FragmentAbToggleFeaturesBinding> {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final AbToggleAdapter adapter = new AbToggleAdapter();

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j viewModel = k.b(new FeaturesFragment$viewModel$2(this));

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/abtool/presentation/features/FeaturesFragment$Companion;", "", "<init>", "()V", "newInstance", "Lru/ozon/app/android/abtool/presentation/features/FeaturesFragment;", "namespace", "Lru/ozon/app/android/abtool/AbToolNamespace;", "abzone_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final FeaturesFragment newInstance(@NotNull AbToolNamespace namespace) {
            Intrinsics.checkNotNullParameter(namespace, "namespace");
            FeaturesFragment featuresFragment = new FeaturesFragment();
            Bundle bundle = new Bundle();
            bundle.putString("NAMESPACE", namespace.name());
            featuresFragment.setArguments(bundle);
            return featuresFragment;
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AbToggleViewModel getViewModel() {
        return (AbToggleViewModel) this.viewModel.getValue();
    }

    private final void initRecycler() {
        getBinding().abRv.setLayoutManager(new LinearLayoutManager(getContext()));
        getBinding().abRv.setAdapter(this.adapter);
        Drawable drawable = a.getDrawable(requireContext(), R$drawable.divider);
        if (drawable != null) {
            j jVar = new j(getContext(), 1);
            jVar.setDrawable(drawable);
            getBinding().abRv.addItemDecoration(jVar);
        }
        this.adapter.setOnResetClickListener(new FeaturesFragment$initRecycler$2(this));
        this.adapter.setOnToggleChangeListener(new FeaturesFragment$initRecycler$3(this));
        this.adapter.setOnLocalValueChangeListener(new FeaturesFragment$initRecycler$4(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$1(FeaturesFragment featuresFragment, CompoundButton compoundButton, boolean z11) {
        featuresFragment.getViewModel().setShowOnlyOverriddenFeatures(z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$3(FeaturesFragment featuresFragment, View view) {
        G supportFragmentManager;
        r activity = featuresFragment.getActivity();
        if (activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null) {
            return;
        }
        Q p11 = supportFragmentManager.p();
        Intrinsics.checkNotNullExpressionValue(p11, "beginTransaction()");
        p11.r(R$id.container, new VariantsFragment(), null);
        p11.g(null);
        p11.i();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        initRecycler();
        EditText filterEt = getBinding().filterEt;
        Intrinsics.checkNotNullExpressionValue(filterEt, "filterEt");
        filterEt.addTextChangedListener(new TextWatcher() { // from class: ru.ozon.app.android.abtool.presentation.features.FeaturesFragment$onViewCreated$$inlined$doOnTextChanged$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s11) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence text, int start, int before, int count) {
                AbToggleViewModel viewModel;
                viewModel = FeaturesFragment.this.getViewModel();
                String obj = text != null ? text.toString() : null;
                if (obj == null) {
                    obj = "";
                }
                viewModel.query(obj);
            }
        });
        getBinding().overriddenFeatureFlagsSwitch.setOnCheckedChangeListener(new F90.a(this, 1));
        getBinding().variantsTextView.setOnClickListener(new Jm0.a(this, 5));
        getViewModel().query(getBinding().filterEt.getText().toString());
        InterfaceC2395h a11 = C5427n.a(new C2408n0(getViewModel().observeListItems(), new FeaturesFragment$onViewCreated$4(this, null)), getViewLifecycleOwner().getLifecycle(), AbstractC5434v.b.STARTED);
        J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C2399j.C(a11, K.a(viewLifecycleOwner));
    }

    @Override // ru.ozon.app.android.abtool.presentation.BaseFragment
    @NotNull
    public FragmentAbToggleFeaturesBinding getViewBinding(@NotNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        FragmentAbToggleFeaturesBinding inflate = FragmentAbToggleFeaturesBinding.inflate(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }
}
