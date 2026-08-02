package ru.ozon.app.android.datePicker;

import androidx.fragment.app.r;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/datePicker/DatePickerViewModel;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class DatePickerDialogFragment$viewModel$2 extends AbstractC7737t implements Function0<DatePickerViewModel> {
    final /* synthetic */ DatePickerDialogFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DatePickerDialogFragment$viewModel$2(DatePickerDialogFragment datePickerDialogFragment) {
        super(0);
        this.this$0 = datePickerDialogFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final DatePickerViewModel invoke() {
        r activity = this.this$0.getActivity();
        if (activity == null) {
            return null;
        }
        final DatePickerDialogFragment datePickerDialogFragment = this.this$0;
        return (DatePickerViewModel) new z0(activity, new z0.c() { // from class: ru.ozon.app.android.datePicker.DatePickerDialogFragment$viewModel$2$invoke$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                DatePickerViewModel datePickerViewModel = DatePickerDialogFragment.this.getPViewModel().get();
                Intrinsics.g(datePickerViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return datePickerViewModel;
            }
        }).a(DatePickerViewModel.class);
    }
}
