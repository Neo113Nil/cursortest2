package ru.ozon.app.android.partpayment.formpage.view.modalpickerfragment;

import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AbstractC5051a;
import androidx.appcompat.app.g;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.b0;
import androidx.fragment.app.r;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.partpayment.databinding.FragmentModalPickerBinding;
import ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 %2\u00020\u0001:\u0001%B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0003J\u0017\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001e\u001a\u00020\u00198FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010#\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lru/ozon/app/android/partpayment/formpage/view/modalpickerfragment/ModalPickerFragment;", "Landroidx/fragment/app/m;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Options$Picker;", "option", "passResult$homecredit_prodGoogleAllVendorsRelease", "(Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Options$Picker;)V", "passResult", "Lru/ozon/app/android/partpayment/formpage/view/modalpickerfragment/ModalPickerFragmentViewModelImpl;", "viewModel$delegate", "LSc/j;", "getViewModel", "()Lru/ozon/app/android/partpayment/formpage/view/modalpickerfragment/ModalPickerFragmentViewModelImpl;", "viewModel", "Lru/ozon/app/android/partpayment/formpage/view/modalpickerfragment/ModalPickerBinder;", "binder", "Lru/ozon/app/android/partpayment/formpage/view/modalpickerfragment/ModalPickerBinder;", "Lru/ozon/app/android/partpayment/databinding/FragmentModalPickerBinding;", "binding", "Lru/ozon/app/android/partpayment/databinding/FragmentModalPickerBinding;", "Companion", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ModalPickerFragment extends ComponentCallbacksC5392m {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private ModalPickerBinder binder;
    private FragmentModalPickerBinding binding;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j viewModel;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lru/ozon/app/android/partpayment/formpage/view/modalpickerfragment/ModalPickerFragment$Companion;", "", "<init>", "()V", "EXTRA_SELECTED_OPTION", "", "newInstance", "Lru/ozon/app/android/partpayment/formpage/view/modalpickerfragment/ModalPickerFragment;", SelectionItemFormDTO.TITLE_FIELD_NAME, "options", "", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Options$Picker;", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ModalPickerFragment newInstance(@NotNull String title, @NotNull List<FormPageVO.Field.Options.Picker> options) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(options, "options");
            ModalPickerFragment modalPickerFragment = new ModalPickerFragment();
            Bundle bundle = new Bundle();
            bundle.putString("ARG_TITLE", title);
            bundle.putParcelableArray("ARG_OPTIONS", (Parcelable[]) options.toArray(new FormPageVO.Field.Options.Picker[0]));
            modalPickerFragment.setArguments(bundle);
            return modalPickerFragment;
        }

        private Companion() {
        }
    }

    public ModalPickerFragment() {
        InterfaceC4008j a11 = k.a(n.NONE, new ModalPickerFragment$special$$inlined$viewModels$default$2(new ModalPickerFragment$special$$inlined$viewModels$default$1(this)));
        this.viewModel = b0.b(this, N.b(ModalPickerFragmentViewModelImpl.class), new ModalPickerFragment$special$$inlined$viewModels$default$3(a11), new ModalPickerFragment$special$$inlined$viewModels$default$4(null, a11), new ModalPickerFragment$special$$inlined$viewModels$default$5(this, a11));
    }

    @NotNull
    public final ModalPickerFragmentViewModelImpl getViewModel() {
        return (ModalPickerFragmentViewModelImpl) this.viewModel.getValue();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.binder = new ModalPickerBinder(this, getViewModel());
        ModalPickerFragmentViewModelImpl viewModel = getViewModel();
        Bundle arguments = getArguments();
        Parcelable[] parcelableArray = arguments != null ? arguments.getParcelableArray("ARG_OPTIONS") : null;
        Intrinsics.g(parcelableArray, "null cannot be cast to non-null type kotlin.Array<ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO.Field.Options.Picker>");
        viewModel.bindInitial(C7705l.f0((FormPageVO.Field.Options.Picker[]) parcelableArray));
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        FragmentModalPickerBinding inflate = FragmentModalPickerBinding.inflate(inflater, container, false);
        this.binding = inflate;
        CoordinatorLayout constraintLayout = inflate.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        return constraintLayout;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onDestroyView() {
        super.onDestroyView();
        this.binding = null;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) {
        FragmentModalPickerBinding fragmentModalPickerBinding;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        r requireActivity = requireActivity();
        g gVar = requireActivity instanceof g ? (g) requireActivity : null;
        if (gVar != null && (fragmentModalPickerBinding = this.binding) != null) {
            gVar.setSupportActionBar(fragmentModalPickerBinding.toolbarT);
            AbstractC5051a supportActionBar = gVar.getSupportActionBar();
            if (supportActionBar != null) {
                Bundle arguments = getArguments();
                String string = arguments != null ? arguments.getString("ARG_TITLE") : null;
                if (string == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                supportActionBar.s(string);
                supportActionBar.m(true);
            }
        }
        ModalPickerBinder modalPickerBinder = this.binder;
        if (modalPickerBinder != null) {
            modalPickerBinder.setView(new ModalPickerView(view));
        } else {
            Intrinsics.n("binder");
            throw null;
        }
    }

    public final void passResult$homecredit_prodGoogleAllVendorsRelease(@NotNull FormPageVO.Field.Options.Picker option) {
        Intrinsics.checkNotNullParameter(option, "option");
        Intent intent = new Intent();
        intent.putExtra("EXTRA_SELECTED_OPTION", option);
        ComponentCallbacksC5392m targetFragment = getTargetFragment();
        if (targetFragment != null) {
            targetFragment.onActivityResult(getTargetRequestCode(), -1, intent);
        }
    }
}
