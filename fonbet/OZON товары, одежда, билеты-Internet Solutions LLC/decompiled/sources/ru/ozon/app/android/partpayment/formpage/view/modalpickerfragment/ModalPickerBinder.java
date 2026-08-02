package ru.ozon.app.android.partpayment.formpage.view.modalpickerfragment;

import Sc.o;
import XB.a;
import androidx.fragment.app.G;
import androidx.lifecycle.W;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.partpayment.formpage.view.modalpickerfragment.ModalPickerBinder;
import ru.ozon.app.android.partpayment.formpage.view.modalpickerfragment.ModalPickerFragmentViewModel;
import ru.ozon.app.android.utils.WhenExtKt;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lru/ozon/app/android/partpayment/formpage/view/modalpickerfragment/ModalPickerBinder;", "", "fragment", "Lru/ozon/app/android/partpayment/formpage/view/modalpickerfragment/ModalPickerFragment;", "viewModel", "Lru/ozon/app/android/partpayment/formpage/view/modalpickerfragment/ModalPickerFragmentViewModel;", "<init>", "(Lru/ozon/app/android/partpayment/formpage/view/modalpickerfragment/ModalPickerFragment;Lru/ozon/app/android/partpayment/formpage/view/modalpickerfragment/ModalPickerFragmentViewModel;)V", "view", "Lru/ozon/app/android/partpayment/formpage/view/modalpickerfragment/ModalPickerView;", "setView", "", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ModalPickerBinder {

    @NotNull
    private final ModalPickerFragment fragment;
    private ModalPickerView view;

    @NotNull
    private final ModalPickerFragmentViewModel viewModel;

    public ModalPickerBinder(@NotNull ModalPickerFragment fragment, @NotNull ModalPickerFragmentViewModel viewModel) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.fragment = fragment;
        this.viewModel = viewModel;
        viewModel.getOptions().observe(fragment, new a(this, 0));
        viewModel.getAction().observe(fragment, new W() { // from class: XB.b
            @Override // androidx.lifecycle.W
            public final void onChanged(Object obj) {
                ModalPickerBinder._init_$lambda$1(ModalPickerBinder.this, (ModalPickerFragmentViewModel.Action) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(ModalPickerBinder modalPickerBinder, List list) {
        ModalPickerView modalPickerView = modalPickerBinder.view;
        if (modalPickerView == null) {
            Intrinsics.n("view");
            throw null;
        }
        Intrinsics.f(list);
        modalPickerView.setOptions(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(ModalPickerBinder modalPickerBinder, ModalPickerFragmentViewModel.Action action) {
        Unit unit;
        if (!(action instanceof ModalPickerFragmentViewModel.Action.Complete)) {
            throw new o();
        }
        modalPickerBinder.fragment.passResult$homecredit_prodGoogleAllVendorsRelease(((ModalPickerFragmentViewModel.Action.Complete) action).getSelectedOption());
        G fragmentManager = modalPickerBinder.fragment.getFragmentManager();
        if (fragmentManager != null) {
            fragmentManager.P0();
            unit = Unit.f71690a;
        } else {
            unit = null;
        }
        WhenExtKt.getExhaustive(unit);
    }

    public final void setView(@NotNull ModalPickerView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.view = view;
        view.setOnSelect(new ModalPickerBinder$setView$1(this.viewModel));
        view.setOnComplete(new ModalPickerBinder$setView$2(this.viewModel));
    }
}
