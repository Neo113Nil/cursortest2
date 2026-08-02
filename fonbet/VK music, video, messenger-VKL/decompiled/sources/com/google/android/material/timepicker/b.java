package com.google.android.material.timepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.R$attr;
import com.google.android.material.R$id;
import com.google.android.material.R$layout;
import com.google.android.material.R$string;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.shape.MaterialShapeDrawable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import xsna.b0u0;
import xsna.iut0;
import xsna.jl10;
import xsna.lhg;
import xsna.sm9;

/* compiled from: MaterialTimePicker.java */
/* loaded from: classes13.dex */
public final class b extends androidx.fragment.app.d {
    public TimePickerView B;
    public ViewStub C;

    @Nullable
    public com.google.android.material.timepicker.c D;

    @Nullable
    public f E;

    @Nullable
    public Object F;
    public int G;
    public int H;
    public CharSequence J;
    public CharSequence L;
    public CharSequence N;
    public MaterialButton O;
    public Button P;
    public TimeModel R;
    public final LinkedHashSet x = new LinkedHashSet();
    public final LinkedHashSet y = new LinkedHashSet();
    public final LinkedHashSet z = new LinkedHashSet();
    public final LinkedHashSet A = new LinkedHashSet();
    public int I = 0;
    public int K = 0;
    public int M = 0;
    public int Q = 0;
    public int S = 0;

    /* compiled from: MaterialTimePicker.java */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            b bVar = b.this;
            Iterator it = bVar.x.iterator();
            while (it.hasNext()) {
                ((View.OnClickListener) it.next()).onClick(view);
            }
            bVar.un(false, false);
        }
    }

    /* compiled from: MaterialTimePicker.java */
    /* renamed from: com.google.android.material.timepicker.b$b, reason: collision with other inner class name */
    public class ViewOnClickListenerC0128b implements View.OnClickListener {
        public ViewOnClickListenerC0128b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            b bVar = b.this;
            Iterator it = bVar.y.iterator();
            while (it.hasNext()) {
                ((View.OnClickListener) it.next()).onClick(view);
            }
            bVar.un(false, false);
        }
    }

    /* compiled from: MaterialTimePicker.java */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            b bVar = b.this;
            bVar.Q = bVar.Q == 0 ? 1 : 0;
            bVar.Fn(bVar.O);
        }
    }

    /* compiled from: MaterialTimePicker.java */
    public static final class d {
        public TimeModel a = new TimeModel();

        @NonNull
        public final b a() {
            b bVar = new b();
            Bundle bundle = new Bundle();
            bundle.putParcelable("TIME_PICKER_TIME_MODEL", this.a);
            bundle.putInt("TIME_PICKER_TITLE_RES", 0);
            bundle.putInt("TIME_PICKER_POSITIVE_BUTTON_TEXT_RES", 0);
            bundle.putInt("TIME_PICKER_NEGATIVE_BUTTON_TEXT_RES", 0);
            bundle.putInt("TIME_PICKER_OVERRIDE_THEME_RES_ID", 0);
            bVar.setArguments(bundle);
            return bVar;
        }

        @NonNull
        public final void b(int i) {
            TimeModel timeModel = this.a;
            timeModel.getClass();
            timeModel.h = i >= 12 ? 1 : 0;
            timeModel.e = i;
        }

        @NonNull
        public final void c(int i) {
            this.a.f(i);
        }

        @NonNull
        public final void d(int i) {
            TimeModel timeModel = this.a;
            int i2 = timeModel.e;
            int i3 = timeModel.f;
            TimeModel timeModel2 = new TimeModel(i);
            this.a = timeModel2;
            timeModel2.f(i3);
            TimeModel timeModel3 = this.a;
            timeModel3.getClass();
            timeModel3.h = i2 >= 12 ? 1 : 0;
            timeModel3.e = i2;
        }
    }

    public final int Dn() {
        return this.R.e % 24;
    }

    public final int En() {
        return this.R.f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, xsna.ruo0] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, xsna.ruo0] */
    public final void Fn(MaterialButton materialButton) {
        f fVar;
        Pair pair;
        if (materialButton == null || this.B == null || this.C == null) {
            return;
        }
        ?? r0 = this.F;
        if (r0 != 0) {
            r0.hide();
        }
        int i = this.Q;
        TimePickerView timePickerView = this.B;
        ViewStub viewStub = this.C;
        if (i == 0) {
            com.google.android.material.timepicker.c cVar = this.D;
            com.google.android.material.timepicker.c cVar2 = cVar;
            if (cVar == null) {
                cVar2 = new com.google.android.material.timepicker.c(timePickerView, this.R);
            }
            this.D = cVar2;
            fVar = cVar2;
        } else {
            if (this.E == null) {
                this.E = new f((LinearLayout) viewStub.inflate(), this.R);
            }
            f fVar2 = this.E;
            fVar2.f.setChecked(false);
            fVar2.g.setChecked(false);
            fVar = this.E;
        }
        this.F = fVar;
        fVar.show();
        this.F.invalidate();
        int i2 = this.Q;
        if (i2 == 0) {
            pair = new Pair(Integer.valueOf(this.G), Integer.valueOf(R$string.material_timepicker_text_input_mode_description));
        } else {
            if (i2 != 1) {
                throw new IllegalArgumentException(lhg.a(i2, "no icon for mode: "));
            }
            pair = new Pair(Integer.valueOf(this.H), Integer.valueOf(R$string.material_timepicker_clock_mode_description));
        }
        materialButton.setIconResource(((Integer) pair.first).intValue());
        materialButton.setContentDescription(getResources().getString(((Integer) pair.second).intValue()));
        materialButton.sendAccessibilityEvent(4);
    }

    @Override // androidx.fragment.app.d, android.content.DialogInterface.OnCancelListener
    public final void onCancel(@NonNull DialogInterface dialogInterface) {
        Iterator it = this.z.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        if (bundle == null) {
            return;
        }
        TimeModel timeModel = (TimeModel) bundle.getParcelable("TIME_PICKER_TIME_MODEL");
        this.R = timeModel;
        if (timeModel == null) {
            this.R = new TimeModel();
        }
        this.Q = bundle.getInt("TIME_PICKER_INPUT_MODE", this.R.d != 1 ? 0 : 1);
        this.I = bundle.getInt("TIME_PICKER_TITLE_RES", 0);
        this.J = bundle.getCharSequence("TIME_PICKER_TITLE_TEXT");
        this.K = bundle.getInt("TIME_PICKER_POSITIVE_BUTTON_TEXT_RES", 0);
        this.L = bundle.getCharSequence("TIME_PICKER_POSITIVE_BUTTON_TEXT");
        this.M = bundle.getInt("TIME_PICKER_NEGATIVE_BUTTON_TEXT_RES", 0);
        this.N = bundle.getCharSequence("TIME_PICKER_NEGATIVE_BUTTON_TEXT");
        this.S = bundle.getInt("TIME_PICKER_OVERRIDE_THEME_RES_ID", 0);
    }

    @Override // androidx.fragment.app.Fragment
    @NonNull
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R$layout.material_timepicker_dialog, viewGroup);
        TimePickerView timePickerView = (TimePickerView) viewGroup2.findViewById(R$id.material_timepicker_view);
        this.B = timePickerView;
        timePickerView.A = this;
        this.C = (ViewStub) viewGroup2.findViewById(R$id.material_textinput_timepicker);
        this.O = (MaterialButton) viewGroup2.findViewById(R$id.material_timepicker_mode_button);
        TextView textView = (TextView) viewGroup2.findViewById(R$id.header_title);
        int i = this.I;
        if (i != 0) {
            textView.setText(i);
        } else if (!TextUtils.isEmpty(this.J)) {
            textView.setText(this.J);
        }
        Fn(this.O);
        Button button = (Button) viewGroup2.findViewById(R$id.material_timepicker_ok_button);
        button.setOnClickListener(new a());
        int i2 = this.K;
        if (i2 != 0) {
            button.setText(i2);
        } else if (!TextUtils.isEmpty(this.L)) {
            button.setText(this.L);
        }
        Button button2 = (Button) viewGroup2.findViewById(R$id.material_timepicker_cancel_button);
        this.P = button2;
        button2.setOnClickListener(new ViewOnClickListenerC0128b());
        int i3 = this.M;
        if (i3 != 0) {
            this.P.setText(i3);
        } else if (!TextUtils.isEmpty(this.N)) {
            this.P.setText(this.N);
        }
        Button button3 = this.P;
        if (button3 != null) {
            button3.setVisibility(this.n ? 0 : 8);
        }
        this.O.setOnClickListener(new c());
        return viewGroup2;
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.F = null;
        this.D = null;
        this.E = null;
        TimePickerView timePickerView = this.B;
        if (timePickerView != null) {
            timePickerView.A = null;
            this.B = null;
        }
    }

    @Override // androidx.fragment.app.d, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@NonNull DialogInterface dialogInterface) {
        Iterator it = this.A.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("TIME_PICKER_TIME_MODEL", this.R);
        bundle.putInt("TIME_PICKER_INPUT_MODE", this.Q);
        bundle.putInt("TIME_PICKER_TITLE_RES", this.I);
        bundle.putCharSequence("TIME_PICKER_TITLE_TEXT", this.J);
        bundle.putInt("TIME_PICKER_POSITIVE_BUTTON_TEXT_RES", this.K);
        bundle.putCharSequence("TIME_PICKER_POSITIVE_BUTTON_TEXT", this.L);
        bundle.putInt("TIME_PICKER_NEGATIVE_BUTTON_TEXT_RES", this.M);
        bundle.putCharSequence("TIME_PICKER_NEGATIVE_BUTTON_TEXT", this.N);
        bundle.putInt("TIME_PICKER_OVERRIDE_THEME_RES_ID", this.S);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (this.F instanceof f) {
            view.postDelayed(new sm9(this, 9), 100L);
        }
    }

    @Override // androidx.fragment.app.d
    @NonNull
    public final Dialog yn(@Nullable Bundle bundle) {
        Context requireContext = requireContext();
        int i = this.S;
        if (i == 0) {
            TypedValue a2 = jl10.a(R$attr.materialTimePickerTheme, requireContext());
            i = a2 == null ? 0 : a2.data;
        }
        Dialog dialog = new Dialog(requireContext, i);
        Context context = dialog.getContext();
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(context, null, R$attr.materialTimePickerStyle, R$style.Widget_MaterialComponents_TimePicker);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, R$styleable.MaterialTimePicker, R$attr.materialTimePickerStyle, R$style.Widget_MaterialComponents_TimePicker);
        this.H = obtainStyledAttributes.getResourceId(R$styleable.MaterialTimePicker_clockIcon, 0);
        this.G = obtainStyledAttributes.getResourceId(R$styleable.MaterialTimePicker_keyboardIcon, 0);
        int color = obtainStyledAttributes.getColor(R$styleable.MaterialTimePicker_backgroundTint, 0);
        obtainStyledAttributes.recycle();
        materialShapeDrawable.initializeElevationOverlay(context);
        materialShapeDrawable.setFillColor(ColorStateList.valueOf(color));
        Window window = dialog.getWindow();
        window.setBackgroundDrawable(materialShapeDrawable);
        window.requestFeature(1);
        window.setLayout(-2, -2);
        View decorView = window.getDecorView();
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        materialShapeDrawable.setElevation(decorView.getElevation());
        return dialog;
    }
}
