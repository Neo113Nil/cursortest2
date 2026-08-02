package jc;

import android.app.TimePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.widget.TimePicker;
import com.facebook.react.devsupport.StackTraceHelper;
import com.twilio.voice.Constants;
import java.util.ArrayList;

/* renamed from: jc.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractTimePickerDialogC5122h extends TimePickerDialog {

    /* renamed from: a, reason: collision with root package name */
    public TimePicker f53900a;

    /* renamed from: b, reason: collision with root package name */
    public int f53901b;

    /* renamed from: c, reason: collision with root package name */
    public z f53902c;

    /* renamed from: d, reason: collision with root package name */
    public final TimePickerDialog.OnTimeSetListener f53903d;

    /* renamed from: e, reason: collision with root package name */
    public Handler f53904e;

    /* renamed from: f, reason: collision with root package name */
    public Runnable f53905f;

    /* renamed from: g, reason: collision with root package name */
    public Context f53906g;

    /* renamed from: jc.h$a */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f53907a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ TimePicker f53908b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f53909c;

        public a(int i10, TimePicker timePicker, int i11) {
            this.f53907a = i10;
            this.f53908b = timePicker;
            this.f53909c = i11;
        }

        public final void a() {
            this.f53908b.setHour(this.f53909c);
            this.f53908b.setMinute(this.f53907a);
        }

        public final void b() {
            View findFocus = this.f53908b.findFocus();
            if (!(findFocus instanceof EditText)) {
                Log.e("RN-datetimepicker", "could not set selection on time picker, this is a known issue on some Huawei devices");
            } else {
                EditText editText = (EditText) findFocus;
                editText.setSelection(editText.getText().length());
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!AbstractTimePickerDialogC5122h.this.i()) {
                a();
            } else if (this.f53907a > 5) {
                a();
                b();
            }
        }
    }

    public AbstractTimePickerDialogC5122h(Context context, TimePickerDialog.OnTimeSetListener onTimeSetListener, int i10, int i11, int i12, boolean z10, z zVar) {
        super(context, onTimeSetListener, i10, i11, z10);
        this.f53904e = new Handler();
        this.f53901b = i12;
        this.f53903d = onTimeSetListener;
        this.f53902c = zVar;
        this.f53906g = context;
    }

    public static boolean g(int i10) {
        return i10 >= 1 && i10 <= 30 && 60 % i10 == 0;
    }

    public final void b(String str) {
        if (f()) {
            throw new RuntimeException(str);
        }
    }

    public final void c(TimePicker timePicker, int i10, int i11) {
        b("spinner never needs to be corrected because wrong values are not offered to user (both in scrolling and textInput mode)!");
        a aVar = new a(i11, timePicker, i10);
        this.f53905f = aVar;
        this.f53904e.postDelayed(aVar, 500L);
    }

    public final int d() {
        return e(this.f53900a.getCurrentMinute().intValue());
    }

    public final int e(int i10) {
        return f() ? i10 * this.f53901b : i10;
    }

    public final boolean f() {
        return this.f53902c == z.SPINNER;
    }

    public final boolean h(int i10) {
        b("minutesNeedCorrection is not intended to be used with spinner, spinner won't allow picking invalid values");
        return m() && i10 != l(i10);
    }

    public final boolean i() {
        View findViewById = findViewById(this.f53906g.getResources().getIdentifier("input_mode", StackTraceHelper.ID_KEY, Constants.PLATFORM_ANDROID));
        return findViewById != null && findViewById.hasFocus();
    }

    public final void j() {
        NumberPicker numberPicker = (NumberPicker) findViewById(this.f53906g.getResources().getIdentifier("minute", StackTraceHelper.ID_KEY, Constants.PLATFORM_ANDROID));
        numberPicker.setMinValue(0);
        numberPicker.setMaxValue((60 / this.f53901b) - 1);
        ArrayList arrayList = new ArrayList(60 / this.f53901b);
        int i10 = 0;
        while (i10 < 60) {
            arrayList.add(String.format("%02d", Integer.valueOf(i10)));
            i10 += this.f53901b;
        }
        numberPicker.setDisplayedValues((String[]) arrayList.toArray(new String[0]));
    }

    public final void k() {
        TimePicker timePicker = this.f53900a;
        if (timePicker == null) {
            Log.e("RN-datetimepicker", "time picker was null");
            return;
        }
        int intValue = timePicker.getCurrentMinute().intValue();
        if (!f()) {
            this.f53900a.setCurrentMinute(Integer.valueOf(l(intValue)));
        } else {
            j();
            this.f53900a.setCurrentMinute(Integer.valueOf(l(intValue) / this.f53901b));
        }
    }

    public final int l(int i10) {
        int round = Math.round(i10 / this.f53901b);
        int i11 = this.f53901b;
        int i12 = round * i11;
        return i12 == 60 ? i12 - i11 : i12;
    }

    public final boolean m() {
        return this.f53901b != 1;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f53900a = (TimePicker) findViewById(this.f53906g.getResources().getIdentifier("timePicker", StackTraceHelper.ID_KEY, Constants.PLATFORM_ANDROID));
        if (m()) {
            k();
        }
    }

    @Override // android.app.TimePickerDialog, android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i10) {
        boolean z10 = m() || f();
        TimePicker timePicker = this.f53900a;
        if (timePicker == null || i10 != -1 || !z10) {
            super.onClick(dialogInterface, i10);
            return;
        }
        timePicker.clearFocus();
        int intValue = this.f53900a.getCurrentHour().intValue();
        int d10 = d();
        if (m()) {
            d10 = l(d10);
        }
        TimePickerDialog.OnTimeSetListener onTimeSetListener = this.f53903d;
        if (onTimeSetListener != null) {
            onTimeSetListener.onTimeSet(this.f53900a, intValue, d10);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        this.f53904e.removeCallbacks(this.f53905f);
        super.onDetachedFromWindow();
    }

    @Override // android.app.TimePickerDialog, android.widget.TimePicker.OnTimeChangedListener
    public void onTimeChanged(TimePicker timePicker, int i10, int i11) {
        int e10 = e(i11);
        this.f53904e.removeCallbacks(this.f53905f);
        if (f() || !h(e10)) {
            super.onTimeChanged(timePicker, i10, i11);
        } else {
            c(timePicker, i10, l(e10));
        }
    }

    @Override // android.app.TimePickerDialog
    public void updateTime(int i10, int i11) {
        if (!m()) {
            super.updateTime(i10, i11);
        } else if (f()) {
            super.updateTime(i10, l(d()) / this.f53901b);
        } else {
            super.updateTime(i10, l(i11));
        }
    }

    public AbstractTimePickerDialogC5122h(Context context, int i10, TimePickerDialog.OnTimeSetListener onTimeSetListener, int i11, int i12, int i13, boolean z10, z zVar) {
        super(context, i10, onTimeSetListener, i11, i12, z10);
        this.f53904e = new Handler();
        this.f53901b = i13;
        this.f53903d = onTimeSetListener;
        this.f53902c = zVar;
        this.f53906g = context;
    }
}
