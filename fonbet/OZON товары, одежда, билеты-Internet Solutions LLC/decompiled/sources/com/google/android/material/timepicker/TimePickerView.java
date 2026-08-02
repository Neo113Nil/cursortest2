package com.google.android.material.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import androidx.core.view.Y;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import ru.ozon.app.android.R;

/* loaded from: classes9.dex */
class TimePickerView extends ConstraintLayout {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f58826d = 0;

    /* renamed from: c, reason: collision with root package name */
    private final MaterialButtonToggleGroup f58827c;

    final class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int i11 = TimePickerView.f58826d;
            TimePickerView.this.getClass();
        }
    }

    final class b implements MaterialButtonToggleGroup.d {
        b() {
        }

        @Override // com.google.android.material.button.MaterialButtonToggleGroup.d
        public final void a() {
            int i11 = TimePickerView.f58826d;
            TimePickerView.this.getClass();
        }
    }

    public TimePickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a aVar = new a();
        LayoutInflater.from(context).inflate(R.layout.material_timepicker, this);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(R.id.material_clock_period_toggle);
        this.f58827c = materialButtonToggleGroup;
        materialButtonToggleGroup.b(new b());
        Chip chip = (Chip) findViewById(R.id.material_minute_tv);
        Chip chip2 = (Chip) findViewById(R.id.material_hour_tv);
        c cVar = new c(new GestureDetector(getContext(), new com.google.android.material.timepicker.b(this)));
        chip.setOnTouchListener(cVar);
        chip2.setOnTouchListener(cVar);
        chip.setTag(R.id.selection_type, 12);
        chip2.setTag(R.id.selection_type, 10);
        chip.setOnClickListener(aVar);
        chip2.setOnClickListener(aVar);
        chip.n();
        chip2.n();
    }

    private void b() {
        if (this.f58827c.getVisibility() == 0) {
            d dVar = new d();
            dVar.p(this);
            int i11 = Y.f42258g;
            dVar.o(R.id.material_clock_display, getLayoutDirection() == 0 ? 2 : 1);
            dVar.f(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b();
    }

    @Override // android.view.View
    protected final void onVisibilityChanged(@NonNull View view, int i11) {
        super.onVisibilityChanged(view, i11);
        if (view == this && i11 == 0) {
            b();
        }
    }
}
