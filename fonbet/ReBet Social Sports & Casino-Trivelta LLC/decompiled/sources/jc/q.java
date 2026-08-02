package jc;

import android.app.DatePickerDialog;
import android.content.Context;

/* loaded from: classes4.dex */
public class q extends DatePickerDialog {
    public q(Context context, DatePickerDialog.OnDateSetListener onDateSetListener, int i10, int i11, int i12, EnumC5128n enumC5128n) {
        super(context, onDateSetListener, i10, i11, i12);
        a(context, i10, i11, i12, enumC5128n);
    }

    public final void a(Context context, int i10, int i11, int i12, EnumC5128n enumC5128n) {
        if (enumC5128n != EnumC5128n.SPINNER || getDatePicker() == null) {
            return;
        }
        getDatePicker().setCalendarViewShown(false);
    }

    @Override // android.app.Dialog
    public void onStop() {
        super.onStop();
    }

    public q(Context context, int i10, DatePickerDialog.OnDateSetListener onDateSetListener, int i11, int i12, int i13, EnumC5128n enumC5128n) {
        super(context, i10, onDateSetListener, i11, i12, i13);
        a(context, i11, i12, i13, enumC5128n);
    }
}
