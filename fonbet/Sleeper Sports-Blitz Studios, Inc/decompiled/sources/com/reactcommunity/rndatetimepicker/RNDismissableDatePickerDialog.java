package com.reactcommunity.rndatetimepicker;

import android.app.DatePickerDialog;
import android.content.Context;

/* loaded from: classes8.dex */
public class RNDismissableDatePickerDialog extends DatePickerDialog {
    private void fixSpinner(Context context, int i, int i2, int i3, RNDatePickerDisplay rNDatePickerDisplay) {
    }

    public RNDismissableDatePickerDialog(Context context, DatePickerDialog.OnDateSetListener onDateSetListener, int i, int i2, int i3, RNDatePickerDisplay rNDatePickerDisplay) {
        super(context, onDateSetListener, i, i2, i3);
        fixSpinner(context, i, i2, i3, rNDatePickerDisplay);
    }

    public RNDismissableDatePickerDialog(Context context, int i, DatePickerDialog.OnDateSetListener onDateSetListener, int i2, int i3, int i4, RNDatePickerDisplay rNDatePickerDisplay) {
        super(context, i, onDateSetListener, i2, i3, i4);
        fixSpinner(context, i2, i3, i4, rNDatePickerDisplay);
    }

    @Override // android.app.Dialog
    protected void onStop() {
        super.onStop();
    }
}
