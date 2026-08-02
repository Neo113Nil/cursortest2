package ru.ozon.app.android.fresh.feature.b2b.widgets.edodatepicker.presentation;

import android.os.Build;
import android.os.Bundle;
import java.util.Date;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "<unused var>", "", "bundle", "Landroid/os/Bundle;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class EdoDatePickerViewHolder$openStartDatePicker$1 extends AbstractC7737t implements Function2<String, Bundle, Unit> {
    final /* synthetic */ EdoDatePickerViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EdoDatePickerViewHolder$openStartDatePicker$1(EdoDatePickerViewHolder edoDatePickerViewHolder) {
        super(2);
        this.this$0 = edoDatePickerViewHolder;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(String str, Bundle bundle) {
        invoke2(str, bundle);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str, Bundle bundle) {
        Object obj;
        EdoDatePickerViewModel edoDatePickerViewModel;
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        if (Build.VERSION.SDK_INT >= 33) {
            obj = bundle.getSerializable("key_date", Date.class);
        } else {
            Object serializable = bundle.getSerializable("key_date");
            if (!(serializable instanceof Date)) {
                serializable = null;
            }
            obj = (Date) serializable;
        }
        edoDatePickerViewModel = this.this$0.viewModel;
        edoDatePickerViewModel.onStartDateSelected((Date) obj);
    }
}
