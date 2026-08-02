package jc;

import android.app.TimePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.widget.TimePicker;

/* loaded from: classes4.dex */
public class r extends AbstractTimePickerDialogC5122h {
    public r(Context context, TimePickerDialog.OnTimeSetListener onTimeSetListener, int i10, int i11, int i12, boolean z10, z zVar) {
        super(context, onTimeSetListener, i10, i11, i12, z10, zVar);
        n(context, i10, i11, z10, zVar);
    }

    @Override // jc.AbstractTimePickerDialogC5122h, android.app.Dialog, android.view.Window.Callback
    public /* bridge */ /* synthetic */ void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // jc.AbstractTimePickerDialogC5122h, android.app.TimePickerDialog, android.content.DialogInterface.OnClickListener
    public /* bridge */ /* synthetic */ void onClick(DialogInterface dialogInterface, int i10) {
        super.onClick(dialogInterface, i10);
    }

    @Override // jc.AbstractTimePickerDialogC5122h, android.app.Dialog, android.view.Window.Callback
    public /* bridge */ /* synthetic */ void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.app.Dialog
    public void onStop() {
        super.onStop();
    }

    @Override // jc.AbstractTimePickerDialogC5122h, android.app.TimePickerDialog, android.widget.TimePicker.OnTimeChangedListener
    public /* bridge */ /* synthetic */ void onTimeChanged(TimePicker timePicker, int i10, int i11) {
        super.onTimeChanged(timePicker, i10, i11);
    }

    @Override // jc.AbstractTimePickerDialogC5122h, android.app.TimePickerDialog
    public /* bridge */ /* synthetic */ void updateTime(int i10, int i11) {
        super.updateTime(i10, i11);
    }

    public r(Context context, int i10, TimePickerDialog.OnTimeSetListener onTimeSetListener, int i11, int i12, int i13, boolean z10, z zVar) {
        super(context, i10, onTimeSetListener, i11, i12, i13, z10, zVar);
        n(context, i11, i12, z10, zVar);
    }

    public final void n(Context context, int i10, int i11, boolean z10, z zVar) {
    }
}
