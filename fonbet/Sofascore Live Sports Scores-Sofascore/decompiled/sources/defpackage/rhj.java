package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.NumberPicker;
import com.sofascore.results.R;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class rhj extends o8 {
    public final e92 d;
    public final List e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rhj(Context context, final Function2 function2) {
        super(context, null, 0);
        function2.getClass();
        View root = getRoot();
        int i = R.id.hour_center;
        View B = nq8.B(R.id.hour_center, root);
        if (B != null) {
            i = R.id.hour_spinner;
            NumberPicker numberPicker = (NumberPicker) nq8.B(R.id.hour_spinner, root);
            if (numberPicker != null) {
                i = R.id.minute_center;
                View B2 = nq8.B(R.id.minute_center, root);
                if (B2 != null) {
                    i = R.id.minute_spinner;
                    final NumberPicker numberPicker2 = (NumberPicker) nq8.B(R.id.minute_spinner, root);
                    if (numberPicker2 != null) {
                        this.d = new e92((ViewGroup) root, (Object) B, (Object) numberPicker, (Object) B2, (Object) numberPicker2, 23);
                        List S0 = CollectionsKt.S0(new IntRange(0, 59, 1));
                        this.e = S0;
                        setEnabled(true);
                        numberPicker.setMinValue(0);
                        numberPicker.setMaxValue(23);
                        numberPicker.setFormatter(new p4k());
                        numberPicker.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() { // from class: phj
                            @Override // android.widget.NumberPicker.OnValueChangeListener
                            public final void onValueChange(NumberPicker numberPicker3, int i2, int i3) {
                                rhj rhjVar = this;
                                Function2.this.invoke(Integer.valueOf(rhjVar.getPickedTime().getHour()), Integer.valueOf(rhjVar.getPickedTime().getMinute()));
                            }
                        });
                        ArrayList arrayList = new ArrayList(k13.r(S0, 10));
                        Iterator it = S0.iterator();
                        while (it.hasNext()) {
                            arrayList.add(String.format("%02d", Arrays.copyOf(new Object[]{Integer.valueOf(((Number) it.next()).intValue())}, 1)));
                        }
                        numberPicker2.setDisplayedValues((String[]) arrayList.toArray(new String[0]));
                        numberPicker2.setMinValue(0);
                        numberPicker2.setMaxValue(b.i(this.e));
                        numberPicker2.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() { // from class: qhj
                            @Override // android.widget.NumberPicker.OnValueChangeListener
                            public final void onValueChange(NumberPicker numberPicker3, int i2, int i3) {
                                rhj rhjVar = this;
                                e92 e92Var = rhjVar.d;
                                NumberPicker numberPicker4 = numberPicker2;
                                int minValue = numberPicker4.getMinValue();
                                int maxValue = numberPicker4.getMaxValue();
                                if (i2 == maxValue && i3 == minValue) {
                                    ((NumberPicker) e92Var.b).setValue(((NumberPicker) e92Var.b).getValue() + 1);
                                } else if (i2 == minValue && i3 == maxValue) {
                                    ((NumberPicker) e92Var.b).setValue(((NumberPicker) e92Var.b).getValue() - 1);
                                }
                                function2.invoke(Integer.valueOf(rhjVar.getPickedTime().getHour()), Integer.valueOf(rhjVar.getPickedTime().getMinute()));
                            }
                        });
                        return;
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i)));
        throw null;
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.time_picker_layout;
    }

    @NotNull
    public final LocalTime getPickedTime() {
        e92 e92Var = this.d;
        LocalTime of = LocalTime.of(((NumberPicker) e92Var.b).getValue(), ((Number) this.e.get(((NumberPicker) e92Var.c).getValue())).intValue());
        of.getClass();
        return of;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        e92 e92Var = this.d;
        ((NumberPicker) e92Var.b).setEnabled(z);
        ((NumberPicker) e92Var.c).setEnabled(z);
    }
}
