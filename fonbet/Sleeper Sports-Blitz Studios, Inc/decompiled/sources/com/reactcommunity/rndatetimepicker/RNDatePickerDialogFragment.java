package com.reactcommunity.rndatetimepicker;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.DatePicker;
import androidx.fragment.app.DialogFragment;
import java.util.Calendar;
import java.util.Locale;

/* loaded from: classes8.dex */
public class RNDatePickerDialogFragment extends DialogFragment {
    private static DialogInterface.OnClickListener mOnNeutralButtonActionListener;
    private DatePickerDialog instance;
    private DatePickerDialog.OnDateSetListener mOnDateSetListener;
    private DialogInterface.OnDismissListener mOnDismissListener;

    @Override // androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        DatePickerDialog createDialog = createDialog(getArguments(), getActivity(), this.mOnDateSetListener);
        this.instance = createDialog;
        return createDialog;
    }

    public void update(Bundle bundle) {
        RNDate rNDate = new RNDate(bundle);
        this.instance.updateDate(rNDate.year(), rNDate.month(), rNDate.day());
    }

    static DatePickerDialog getDialog(Bundle bundle, Context context, DatePickerDialog.OnDateSetListener onDateSetListener) {
        String str;
        RNDate rNDate = new RNDate(bundle);
        int year = rNDate.year();
        int month = rNDate.month();
        int day = rNDate.day();
        RNDatePickerDisplay rNDatePickerDisplay = RNDatePickerDisplay.DEFAULT;
        if (bundle != null && bundle.getString("display", null) != null) {
            rNDatePickerDisplay = RNDatePickerDisplay.valueOf(bundle.getString("display").toUpperCase(Locale.US));
        }
        RNDatePickerDisplay rNDatePickerDisplay2 = rNDatePickerDisplay;
        int i = AnonymousClass1.$SwitchMap$com$reactcommunity$rndatetimepicker$RNDatePickerDisplay[rNDatePickerDisplay2.ordinal()];
        if (i == 1 || i == 2) {
            if (rNDatePickerDisplay2 == RNDatePickerDisplay.CALENDAR) {
                str = "CalendarDatePickerDialog";
            } else {
                str = "SpinnerDatePickerDialog";
            }
            return new RNDismissableDatePickerDialog(context, context.getResources().getIdentifier(str, "style", context.getPackageName()), onDateSetListener, year, month, day, rNDatePickerDisplay2);
        }
        return new RNDismissableDatePickerDialog(context, onDateSetListener, year, month, day, rNDatePickerDisplay2);
    }

    /* renamed from: com.reactcommunity.rndatetimepicker.RNDatePickerDialogFragment$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$reactcommunity$rndatetimepicker$RNDatePickerDisplay;

        static {
            int[] iArr = new int[RNDatePickerDisplay.values().length];
            $SwitchMap$com$reactcommunity$rndatetimepicker$RNDatePickerDisplay = iArr;
            try {
                iArr[RNDatePickerDisplay.CALENDAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$reactcommunity$rndatetimepicker$RNDatePickerDisplay[RNDatePickerDisplay.SPINNER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static DatePickerDialog createDialog(Bundle bundle, Context context, DatePickerDialog.OnDateSetListener onDateSetListener) {
        Calendar calendar = Calendar.getInstance();
        DatePickerDialog dialog = getDialog(bundle, context, onDateSetListener);
        if (bundle != null && bundle.containsKey(RNConstants.ARG_NEUTRAL_BUTTON_LABEL)) {
            dialog.setButton(-3, bundle.getString(RNConstants.ARG_NEUTRAL_BUTTON_LABEL), mOnNeutralButtonActionListener);
        }
        DatePicker datePicker = dialog.getDatePicker();
        if (bundle != null && bundle.containsKey("minimumDate")) {
            calendar.setTimeInMillis(bundle.getLong("minimumDate"));
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            datePicker.setMinDate(calendar.getTimeInMillis());
        } else {
            datePicker.setMinDate(RNConstants.DEFAULT_MIN_DATE);
        }
        if (bundle != null && bundle.containsKey("maximumDate")) {
            calendar.setTimeInMillis(bundle.getLong("maximumDate"));
            calendar.set(11, 23);
            calendar.set(12, 59);
            calendar.set(13, 59);
            calendar.set(14, 999);
            datePicker.setMaxDate(calendar.getTimeInMillis());
        }
        return dialog;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        DialogInterface.OnDismissListener onDismissListener = this.mOnDismissListener;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
    }

    void setOnDateSetListener(DatePickerDialog.OnDateSetListener onDateSetListener) {
        this.mOnDateSetListener = onDateSetListener;
    }

    void setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        this.mOnDismissListener = onDismissListener;
    }

    void setOnNeutralButtonActionListener(DialogInterface.OnClickListener onClickListener) {
        mOnNeutralButtonActionListener = onClickListener;
    }
}
