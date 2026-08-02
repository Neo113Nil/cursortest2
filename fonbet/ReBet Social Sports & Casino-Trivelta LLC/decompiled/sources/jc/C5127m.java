package jc;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.widget.DatePicker;
import androidx.fragment.app.AbstractActivityC2168s;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC2163m;
import com.facebook.react.uimanager.ViewProps;
import java.util.Calendar;
import java.util.Locale;

@SuppressLint({"ValidFragment"})
/* renamed from: jc.m, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5127m extends DialogInterfaceOnCancelListenerC2163m {

    /* renamed from: m, reason: collision with root package name */
    public DatePickerDialog f53918m;

    /* renamed from: n, reason: collision with root package name */
    public DatePickerDialog.OnDateSetListener f53919n;

    /* renamed from: o, reason: collision with root package name */
    public DialogInterface.OnDismissListener f53920o;

    /* renamed from: p, reason: collision with root package name */
    public DialogInterface.OnClickListener f53921p;

    public static /* synthetic */ void f0(Bundle bundle, long j10, long j11, DatePicker datePicker, DatePicker datePicker2, int i10, int i11, int i12) {
        Calendar calendar = Calendar.getInstance(AbstractC5118d.m(bundle));
        calendar.set(i10, i11, i12, 0, 0, 0);
        calendar.setTimeInMillis(Math.min(Math.max(calendar.getTimeInMillis(), j10), j11));
        if (datePicker.getYear() == calendar.get(1) && datePicker.getMonth() == calendar.get(2) && datePicker.getDayOfMonth() == calendar.get(5)) {
            return;
        }
        datePicker.updateDate(calendar.get(1), calendar.get(2), calendar.get(5));
    }

    public static DatePickerDialog h0(Bundle bundle, Context context, DatePickerDialog.OnDateSetListener onDateSetListener) {
        C5124j c5124j = new C5124j(bundle);
        int f10 = c5124j.f();
        int d10 = c5124j.d();
        int a10 = c5124j.a();
        EnumC5128n k10 = AbstractC5118d.k(bundle);
        if (bundle != null && bundle.getString(ViewProps.DISPLAY, null) != null) {
            k10 = EnumC5128n.valueOf(bundle.getString(ViewProps.DISPLAY).toUpperCase(Locale.US));
        }
        EnumC5128n enumC5128n = k10;
        return enumC5128n == EnumC5128n.SPINNER ? new q(context, AbstractC5123i.f53911a, onDateSetListener, f10, d10, a10, enumC5128n) : new q(context, onDateSetListener, f10, d10, a10, enumC5128n);
    }

    public final DatePickerDialog g0(Bundle bundle) {
        final Bundle bundle2;
        AbstractActivityC2168s activity = getActivity();
        DatePickerDialog h02 = h0(bundle, activity, this.f53919n);
        if (bundle != null) {
            AbstractC5118d.s(bundle, h02, this.f53921p);
            if (activity != null) {
                EnumC5128n k10 = AbstractC5118d.k(bundle);
                h02.setOnShowListener(AbstractC5118d.d(AbstractC5118d.p(h02, k10 == EnumC5128n.DEFAULT && bundle.getBoolean("startOnYearSelection")), AbstractC5118d.r(activity, h02, bundle, k10 == EnumC5128n.SPINNER)));
            }
        }
        final DatePicker datePicker = h02.getDatePicker();
        final long o10 = AbstractC5118d.o(bundle);
        final long n10 = AbstractC5118d.n(bundle);
        if (bundle.containsKey("minimumDate")) {
            datePicker.setMinDate(o10);
        } else {
            datePicker.setMinDate(-2208988800001L);
        }
        if (bundle.containsKey("maximumDate")) {
            datePicker.setMaxDate(n10);
        }
        int i10 = Build.VERSION.SDK_INT;
        if (bundle.containsKey("firstDayOfWeek")) {
            datePicker.setFirstDayOfWeek(bundle.getInt("firstDayOfWeek"));
        }
        if (i10 < 26 || !(bundle.containsKey("maximumDate") || bundle.containsKey("minimumDate"))) {
            bundle2 = bundle;
        } else {
            bundle2 = bundle;
            datePicker.setOnDateChangedListener(new DatePicker.OnDateChangedListener() { // from class: jc.l
                @Override // android.widget.DatePicker.OnDateChangedListener
                public final void onDateChanged(DatePicker datePicker2, int i11, int i12, int i13) {
                    C5127m.f0(bundle2, o10, n10, datePicker, datePicker2, i11, i12, i13);
                }
            });
        }
        if (bundle2.containsKey(ViewProps.TEST_ID)) {
            datePicker.setTag(bundle2.getString(ViewProps.TEST_ID));
        }
        return h02;
    }

    public void j0(DatePickerDialog.OnDateSetListener onDateSetListener) {
        this.f53919n = onDateSetListener;
    }

    public void k0(DialogInterface.OnDismissListener onDismissListener) {
        this.f53920o = onDismissListener;
    }

    public void l0(DialogInterface.OnClickListener onClickListener) {
        this.f53921p = onClickListener;
    }

    public void m0(Bundle bundle) {
        C5124j c5124j = new C5124j(bundle);
        this.f53918m.updateDate(c5124j.f(), c5124j.d(), c5124j.a());
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2163m
    public Dialog onCreateDialog(Bundle bundle) {
        DatePickerDialog g02 = g0(getArguments());
        this.f53918m = g02;
        return g02;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2163m, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        DialogInterface.OnDismissListener onDismissListener = this.f53920o;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
    }
}
