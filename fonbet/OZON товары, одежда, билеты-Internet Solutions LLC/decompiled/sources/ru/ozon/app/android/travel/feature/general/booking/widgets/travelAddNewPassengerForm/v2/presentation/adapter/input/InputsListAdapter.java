package ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v2.presentation.adapter.input;

import android.annotation.SuppressLint;
import androidx.recyclerview.widget.i;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.adapterdelegates.AsyncListDifferDelegationAdapter;
import ru.ozon.app.android.travel.molecules.input.v1.CommonInputVO;
import ru.ozon.app.android.travel.molecules.view.commonInput.v1.presentation.adapter.CheckboxInputAdapterDelegateKt;
import ru.ozon.app.android.travel.molecules.view.commonInput.v1.presentation.adapter.DateInputAdapterDelegateKt;
import ru.ozon.app.android.travel.molecules.view.commonInput.v1.presentation.adapter.SelectorInputAdapterDelegateKt;
import ru.ozon.app.android.travel.molecules.view.commonInput.v1.presentation.adapter.TextInputAdapterDelegateKt;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u000e\n\u0002\u0010\r\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001Bk\u0012 \u0010\b\u001a\u001c\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0003\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\t\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\t\u0012\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00070\f¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v2/presentation/adapter/input/InputsListAdapter;", "Lru/ozon/app/android/adapterdelegates/AsyncListDifferDelegationAdapter;", "Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO;", "Lkotlin/Function3;", "", "", "", "", "onTextInputChanged", "Lkotlin/Function1;", "onDateInputClicked", "onSelectorClicked", "Lkotlin/Function2;", "", "onCheckboxChanged", "<init>", "(Lfd/n;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class InputsListAdapter extends AsyncListDifferDelegationAdapter<CommonInputVO> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputsListAdapter(@NotNull InterfaceC6511n<? super Long, ? super String, ? super CharSequence, Unit> onTextInputChanged, @NotNull Function1<? super Long, Unit> onDateInputClicked, @NotNull Function1<? super Long, Unit> onSelectorClicked, @NotNull Function2<? super Long, ? super Boolean, Unit> onCheckboxChanged) {
        super(new i.d<CommonInputVO>() { // from class: ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v2.presentation.adapter.input.InputsListAdapter.1
            @Override // androidx.recyclerview.widget.i.d
            @SuppressLint({"DiffUtilEquals"})
            public boolean areContentsTheSame(CommonInputVO oldItem, CommonInputVO newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.d(oldItem, newItem);
            }

            @Override // androidx.recyclerview.widget.i.d
            public boolean areItemsTheSame(CommonInputVO oldItem, CommonInputVO newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return oldItem.getId() == newItem.getId();
            }
        });
        Intrinsics.checkNotNullParameter(onTextInputChanged, "onTextInputChanged");
        Intrinsics.checkNotNullParameter(onDateInputClicked, "onDateInputClicked");
        Intrinsics.checkNotNullParameter(onSelectorClicked, "onSelectorClicked");
        Intrinsics.checkNotNullParameter(onCheckboxChanged, "onCheckboxChanged");
        this.delegatesManager.addDelegate(TextInputAdapterDelegateKt.textInputAdapterDelegate$default(null, onTextInputChanged, null, null, 13, null));
        this.delegatesManager.addDelegate(DateInputAdapterDelegateKt.dateInputAdapterDelegate(onDateInputClicked));
        this.delegatesManager.addDelegate(SelectorInputAdapterDelegateKt.selectorInputAdapterDelegate(onSelectorClicked));
        this.delegatesManager.addDelegate(CheckboxInputAdapterDelegateKt.checkboxInputAdapterDelegate(onCheckboxChanged));
        this.delegatesManager.addDelegate(BirthCertificateAdapterDelegateKt.birthCertificateAdapterDelegate(onTextInputChanged, onSelectorClicked));
    }
}
