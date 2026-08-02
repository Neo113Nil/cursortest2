package com.reactcommunity.rndatetimepicker;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.format.DateFormat;
import androidx.fragment.app.DialogFragment;
import java.util.Locale;

/* loaded from: classes8.dex */
public class RNTimePickerDialogFragment extends DialogFragment {
    private static DialogInterface.OnClickListener mOnNeutralButtonActionListener;
    private TimePickerDialog instance;
    private DialogInterface.OnDismissListener mOnDismissListener;
    private TimePickerDialog.OnTimeSetListener mOnTimeSetListener;

    @Override // androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        TimePickerDialog createDialog = createDialog(getArguments(), getActivity(), this.mOnTimeSetListener);
        this.instance = createDialog;
        return createDialog;
    }

    public void update(Bundle bundle) {
        RNDate rNDate = new RNDate(bundle);
        this.instance.updateTime(rNDate.hour(), rNDate.minute());
    }

    static TimePickerDialog getDialog(Bundle bundle, Context context, TimePickerDialog.OnTimeSetListener onTimeSetListener) {
        String str;
        RNDate rNDate = new RNDate(bundle);
        int hour = rNDate.hour();
        int minute = rNDate.minute();
        boolean is24HourFormat = DateFormat.is24HourFormat(context);
        int i = (bundle == null || !MinuteIntervalSnappableTimePickerDialog.isValidMinuteInterval(bundle.getInt("minuteInterval"))) ? 1 : bundle.getInt("minuteInterval");
        RNTimePickerDisplay rNTimePickerDisplay = RNTimePickerDisplay.DEFAULT;
        if (bundle != null && bundle.getString("display", null) != null) {
            rNTimePickerDisplay = RNTimePickerDisplay.valueOf(bundle.getString("display").toUpperCase(Locale.US));
        }
        RNTimePickerDisplay rNTimePickerDisplay2 = rNTimePickerDisplay;
        if (bundle != null) {
            is24HourFormat = bundle.getBoolean(RNConstants.ARG_IS24HOUR, DateFormat.is24HourFormat(context));
        }
        boolean z = is24HourFormat;
        int i2 = AnonymousClass1.$SwitchMap$com$reactcommunity$rndatetimepicker$RNTimePickerDisplay[rNTimePickerDisplay2.ordinal()];
        if (i2 == 1 || i2 == 2) {
            if (rNTimePickerDisplay2 == RNTimePickerDisplay.CLOCK) {
                str = "ClockTimePickerDialog";
            } else {
                str = "SpinnerTimePickerDialog";
            }
            return new RNDismissableTimePickerDialog(context, context.getResources().getIdentifier(str, "style", context.getPackageName()), onTimeSetListener, hour, minute, i, z, rNTimePickerDisplay2);
        }
        return new RNDismissableTimePickerDialog(context, onTimeSetListener, hour, minute, i, z, rNTimePickerDisplay2);
    }

    /* renamed from: com.reactcommunity.rndatetimepicker.RNTimePickerDialogFragment$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$reactcommunity$rndatetimepicker$RNTimePickerDisplay;

        static {
            int[] iArr = new int[RNTimePickerDisplay.values().length];
            $SwitchMap$com$reactcommunity$rndatetimepicker$RNTimePickerDisplay = iArr;
            try {
                iArr[RNTimePickerDisplay.CLOCK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$reactcommunity$rndatetimepicker$RNTimePickerDisplay[RNTimePickerDisplay.SPINNER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static TimePickerDialog createDialog(Bundle bundle, Context context, TimePickerDialog.OnTimeSetListener onTimeSetListener) {
        TimePickerDialog dialog = getDialog(bundle, context, onTimeSetListener);
        if (bundle != null && bundle.containsKey(RNConstants.ARG_NEUTRAL_BUTTON_LABEL)) {
            dialog.setButton(-3, bundle.getString(RNConstants.ARG_NEUTRAL_BUTTON_LABEL), mOnNeutralButtonActionListener);
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

    public void setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        this.mOnDismissListener = onDismissListener;
    }

    public void setOnTimeSetListener(TimePickerDialog.OnTimeSetListener onTimeSetListener) {
        this.mOnTimeSetListener = onTimeSetListener;
    }

    void setOnNeutralButtonActionListener(DialogInterface.OnClickListener onClickListener) {
        mOnNeutralButtonActionListener = onClickListener;
    }
}
