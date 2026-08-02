package com.google.android.material.timepicker;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.AbstractC2082d0;
import androidx.core.view.C2075a;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import com.google.android.material.timepicker.ClockHandView;
import java.util.Locale;

/* loaded from: classes3.dex */
class TimePickerView extends ConstraintLayout {

    /* renamed from: A, reason: collision with root package name */
    public final Chip f36408A;

    /* renamed from: B, reason: collision with root package name */
    public final ClockHandView f36409B;

    /* renamed from: C, reason: collision with root package name */
    public final ClockFaceView f36410C;

    /* renamed from: D, reason: collision with root package name */
    public final MaterialButtonToggleGroup f36411D;

    /* renamed from: E, reason: collision with root package name */
    public final View.OnClickListener f36412E;

    /* renamed from: F, reason: collision with root package name */
    public e f36413F;

    /* renamed from: G, reason: collision with root package name */
    public f f36414G;

    /* renamed from: H, reason: collision with root package name */
    public d f36415H;

    /* renamed from: z, reason: collision with root package name */
    public final Chip f36416z;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (TimePickerView.this.f36414G != null) {
                TimePickerView.this.f36414G.c(((Integer) view.getTag(ia.g.f48424c0)).intValue());
            }
        }
    }

    public class b extends GestureDetector.SimpleOnGestureListener {
        public b() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            d dVar = TimePickerView.this.f36415H;
            if (dVar == null) {
                return false;
            }
            dVar.w();
            return true;
        }
    }

    public class c implements View.OnTouchListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ GestureDetector f36419a;

        public c(GestureDetector gestureDetector) {
            this.f36419a = gestureDetector;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (((Checkable) view).isChecked()) {
                return this.f36419a.onTouchEvent(motionEvent);
            }
            return false;
        }
    }

    public interface d {
        void w();
    }

    public interface e {
        void b(int i10);
    }

    public interface f {
        void c(int i10);
    }

    public TimePickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static /* synthetic */ void x(TimePickerView timePickerView, MaterialButtonToggleGroup materialButtonToggleGroup, int i10, boolean z10) {
        if (!z10) {
            timePickerView.getClass();
            return;
        }
        e eVar = timePickerView.f36413F;
        if (eVar != null) {
            eVar.b(i10 == ia.g.f48449p ? 1 : 0);
        }
    }

    public void A(ClockHandView.c cVar) {
        this.f36409B.b(cVar);
    }

    public int B() {
        return this.f36410C.K();
    }

    public void C(int i10) {
        Q(this.f36416z, i10 == 12);
        Q(this.f36408A, i10 == 10);
    }

    public void D(boolean z10) {
        this.f36409B.n(z10);
    }

    public void E(int i10) {
        this.f36410C.O(i10);
    }

    public void F(float f10, boolean z10) {
        this.f36409B.r(f10, z10);
    }

    public void G(C2075a c2075a) {
        AbstractC2082d0.l0(this.f36416z, c2075a);
    }

    public void H(C2075a c2075a) {
        AbstractC2082d0.l0(this.f36408A, c2075a);
    }

    public void I(ClockHandView.b bVar) {
        this.f36409B.u(bVar);
    }

    public void J(d dVar) {
        this.f36415H = dVar;
    }

    public void K(e eVar) {
        this.f36413F = eVar;
    }

    public void L(f fVar) {
        this.f36414G = fVar;
    }

    public final void M() {
        this.f36416z.setTag(ia.g.f48424c0, 12);
        this.f36408A.setTag(ia.g.f48424c0, 10);
        this.f36416z.setOnClickListener(this.f36412E);
        this.f36408A.setOnClickListener(this.f36412E);
        this.f36416z.setAccessibilityClassName("android.view.View");
        this.f36408A.setAccessibilityClassName("android.view.View");
    }

    public void N(String[] strArr, int i10) {
        this.f36410C.P(strArr, i10);
    }

    public final void O() {
        c cVar = new c(new GestureDetector(getContext(), new b()));
        this.f36416z.setOnTouchListener(cVar);
        this.f36408A.setOnTouchListener(cVar);
    }

    public void P() {
        this.f36411D.setVisibility(0);
    }

    public final void Q(Chip chip, boolean z10) {
        chip.setChecked(z10);
        chip.setAccessibilityLiveRegion(z10 ? 2 : 0);
    }

    public void R(int i10, int i11, int i12) {
        this.f36411D.r(i10 == 1 ? ia.g.f48449p : ia.g.f48447o);
        Locale locale = getResources().getConfiguration().locale;
        String format = String.format(locale, "%02d", Integer.valueOf(i12));
        String format2 = String.format(locale, "%02d", Integer.valueOf(i11));
        if (!TextUtils.equals(this.f36416z.getText(), format)) {
            this.f36416z.setText(format);
        }
        if (TextUtils.equals(this.f36408A.getText(), format2)) {
            return;
        }
        this.f36408A.setText(format2);
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        if (view == this && i10 == 0) {
            this.f36408A.sendAccessibilityEvent(8);
        }
    }

    public TimePickerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f36412E = new a();
        LayoutInflater.from(context).inflate(ia.i.f48484q, this);
        this.f36410C = (ClockFaceView) findViewById(ia.g.f48441l);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(ia.g.f48451q);
        this.f36411D = materialButtonToggleGroup;
        materialButtonToggleGroup.q(new MaterialButtonToggleGroup.b() { // from class: com.google.android.material.timepicker.m
            @Override // com.google.android.material.button.MaterialButtonToggleGroup.b
            public final void a(MaterialButtonToggleGroup materialButtonToggleGroup2, int i11, boolean z10) {
                TimePickerView.x(TimePickerView.this, materialButtonToggleGroup2, i11, z10);
            }
        });
        this.f36416z = (Chip) findViewById(ia.g.f48456v);
        this.f36408A = (Chip) findViewById(ia.g.f48453s);
        this.f36409B = (ClockHandView) findViewById(ia.g.f48443m);
        O();
        M();
    }
}
