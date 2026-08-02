package jc;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.format.DateFormat;
import androidx.fragment.app.AbstractActivityC2168s;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC2163m;

/* loaded from: classes4.dex */
public class y extends DialogInterfaceOnCancelListenerC2163m {

    /* renamed from: m, reason: collision with root package name */
    public TimePickerDialog f53954m;

    /* renamed from: n, reason: collision with root package name */
    public TimePickerDialog.OnTimeSetListener f53955n;

    /* renamed from: o, reason: collision with root package name */
    public DialogInterface.OnDismissListener f53956o;

    /* renamed from: p, reason: collision with root package name */
    public DialogInterface.OnClickListener f53957p;

    public static TimePickerDialog g0(Bundle bundle, Context context, TimePickerDialog.OnTimeSetListener onTimeSetListener) {
        C5124j c5124j = new C5124j(bundle);
        int b10 = c5124j.b();
        int c10 = c5124j.c();
        boolean is24HourFormat = DateFormat.is24HourFormat(context);
        if (bundle != null) {
            is24HourFormat = bundle.getBoolean("is24Hour", DateFormat.is24HourFormat(context));
        }
        boolean z10 = is24HourFormat;
        int i10 = (bundle == null || !AbstractTimePickerDialogC5122h.g(bundle.getInt("minuteInterval"))) ? 1 : bundle.getInt("minuteInterval");
        z l10 = AbstractC5118d.l(bundle);
        return l10 == z.SPINNER ? new r(context, AbstractC5123i.f53912b, onTimeSetListener, b10, c10, i10, z10, l10) : new r(context, onTimeSetListener, b10, c10, i10, z10, l10);
    }

    public final TimePickerDialog f0(Bundle bundle) {
        AbstractActivityC2168s activity = getActivity();
        TimePickerDialog g02 = g0(bundle, activity, this.f53955n);
        if (bundle != null) {
            AbstractC5118d.s(bundle, g02, this.f53957p);
            if (activity != null) {
                g02.setOnShowListener(AbstractC5118d.r(activity, g02, bundle, AbstractC5118d.l(bundle) == z.SPINNER));
            }
        }
        return g02;
    }

    public void h0(DialogInterface.OnDismissListener onDismissListener) {
        this.f53956o = onDismissListener;
    }

    public void j0(DialogInterface.OnClickListener onClickListener) {
        this.f53957p = onClickListener;
    }

    public void k0(TimePickerDialog.OnTimeSetListener onTimeSetListener) {
        this.f53955n = onTimeSetListener;
    }

    public void l0(Bundle bundle) {
        C5124j c5124j = new C5124j(bundle);
        this.f53954m.updateTime(c5124j.b(), c5124j.c());
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2163m
    public Dialog onCreateDialog(Bundle bundle) {
        TimePickerDialog f02 = f0(getArguments());
        this.f53954m = f02;
        return f02;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2163m, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        DialogInterface.OnDismissListener onDismissListener = this.f53956o;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
    }
}
