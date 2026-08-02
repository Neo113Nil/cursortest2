package com.google.android.material.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.R$id;
import com.google.android.material.R$layout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import xsna.wuo0;

/* loaded from: classes13.dex */
class TimePickerView extends ConstraintLayout {
    public static final /* synthetic */ int B = 0;
    public b A;
    public final Chip t;
    public final Chip u;
    public final ClockHandView v;
    public final ClockFaceView w;
    public final MaterialButtonToggleGroup x;
    public c y;
    public c z;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            c cVar = TimePickerView.this.z;
            if (cVar != null) {
                cVar.a(((Integer) view.getTag(R$id.selection_type)).intValue(), true);
            }
        }
    }

    public TimePickerView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a aVar = new a();
        LayoutInflater.from(context).inflate(R$layout.material_timepicker, this);
        this.w = (ClockFaceView) findViewById(R$id.material_clock_face);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(R$id.material_clock_period_toggle);
        this.x = materialButtonToggleGroup;
        materialButtonToggleGroup.d.add(new MaterialButtonToggleGroup.d() { // from class: com.google.android.material.timepicker.g
            @Override // com.google.android.material.button.MaterialButtonToggleGroup.d
            public final void a(int i, boolean z) {
                if (!z) {
                    int i2 = TimePickerView.B;
                    return;
                }
                c cVar = TimePickerView.this.y;
                if (cVar != null) {
                    cVar.c.g(i == R$id.material_clock_period_pm_button ? 1 : 0);
                }
            }
        });
        Chip chip = (Chip) findViewById(R$id.material_minute_tv);
        this.t = chip;
        Chip chip2 = (Chip) findViewById(R$id.material_hour_tv);
        this.u = chip2;
        this.v = (ClockHandView) findViewById(R$id.material_clock_hand);
        wuo0 wuo0Var = new wuo0(new GestureDetector(getContext(), new h(this)));
        chip.setOnTouchListener(wuo0Var);
        chip2.setOnTouchListener(wuo0Var);
        chip.setTag(R$id.selection_type, 12);
        chip2.setTag(R$id.selection_type, 10);
        chip.setOnClickListener(aVar);
        chip2.setOnClickListener(aVar);
        chip.setAccessibilityClassName("android.view.View");
        chip2.setAccessibilityClassName("android.view.View");
    }

    @Override // android.view.View
    public final void onVisibilityChanged(@NonNull View view, int i) {
        super.onVisibilityChanged(view, i);
        if (view == this && i == 0) {
            this.u.sendAccessibilityEvent(8);
        }
    }
}
