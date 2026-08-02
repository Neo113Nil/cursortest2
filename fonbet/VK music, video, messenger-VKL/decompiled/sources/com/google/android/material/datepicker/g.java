package com.google.android.material.datepicker;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentManager;
import com.google.android.material.R$attr;
import com.google.android.material.R$dimen;
import com.google.android.material.R$drawable;
import com.google.android.material.R$id;
import com.google.android.material.R$layout;
import com.google.android.material.R$string;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.shape.MaterialShapeDrawable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import xsna.a4x;
import xsna.b0u0;
import xsna.dm10;
import xsna.ir;
import xsna.iut0;
import xsna.jl10;
import xsna.jm10;
import xsna.l2r0;
import xsna.lm10;
import xsna.m33;
import xsna.oek0;
import xsna.oqx0;
import xsna.pb80;
import xsna.ppx0;
import xsna.tko;
import xsna.v6d;
import xsna.vm10;
import xsna.wha0;

/* compiled from: MaterialDatePicker.java */
/* loaded from: classes13.dex */
public final class g<S> extends androidx.fragment.app.d {
    public int B;

    @Nullable
    public DateSelector<S> C;
    public wha0<S> D;

    @Nullable
    public CalendarConstraints E;

    @Nullable
    public DayViewDecorator F;
    public com.google.android.material.datepicker.c<S> G;
    public int H;
    public CharSequence I;
    public boolean J;
    public int K;
    public int L;
    public CharSequence M;
    public int N;
    public CharSequence O;
    public int P;
    public CharSequence Q;
    public int R;
    public CharSequence S;
    public TextView T;
    public TextView U;
    public CheckableImageButton V;

    @Nullable
    public MaterialShapeDrawable W;
    public Button X;
    public boolean Y;

    @Nullable
    public CharSequence Z;

    @Nullable
    public CharSequence a0;
    public final LinkedHashSet<lm10<? super S>> x = new LinkedHashSet<>();
    public final LinkedHashSet<View.OnClickListener> y = new LinkedHashSet<>();
    public final LinkedHashSet<DialogInterface.OnCancelListener> z = new LinkedHashSet<>();
    public final LinkedHashSet<DialogInterface.OnDismissListener> A = new LinkedHashSet<>();

    /* compiled from: MaterialDatePicker.java */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            g gVar = g.this;
            Iterator<lm10<? super S>> it = gVar.x.iterator();
            while (it.hasNext()) {
                it.next().a(gVar.Dn().q8());
            }
            gVar.un(false, false);
        }
    }

    /* compiled from: MaterialDatePicker.java */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            g gVar = g.this;
            Iterator<View.OnClickListener> it = gVar.y.iterator();
            while (it.hasNext()) {
                it.next().onClick(view);
            }
            gVar.un(false, false);
        }
    }

    /* compiled from: MaterialDatePicker.java */
    public class c extends pb80<S> {
        public c() {
        }

        @Override // xsna.pb80
        public final void a() {
            g.this.X.setEnabled(false);
        }

        @Override // xsna.pb80
        public final void b(S s) {
            g gVar = g.this;
            String T4 = gVar.Dn().T4(gVar.mo2getContext());
            gVar.U.setContentDescription(gVar.Dn().q4(gVar.requireContext()));
            gVar.U.setText(T4);
            gVar.X.setEnabled(gVar.Dn().j8());
        }
    }

    /* compiled from: MaterialDatePicker.java */
    public static final class d<S> {
        public final SingleDateSelector a;
        public CalendarConstraints b;
        public int c = 0;

        @Nullable
        public Long d = null;

        public d(SingleDateSelector singleDateSelector) {
            this.a = singleDateSelector;
        }

        @NonNull
        public static d<Long> b() {
            return new d<>(new SingleDateSelector());
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0061, code lost:
        
            if (r2.compareTo(r3.c) <= 0) goto L26;
         */
        @NonNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final g<S> a() {
            Month month;
            if (this.b == null) {
                this.b = new CalendarConstraints.b().a();
            }
            if (this.c == 0) {
                this.c = R$string.mtrl_picker_date_header_title;
            }
            Long l = this.d;
            SingleDateSelector singleDateSelector = this.a;
            if (l != null) {
                singleDateSelector.b = Long.valueOf(l2r0.a(l.longValue()));
            }
            CalendarConstraints calendarConstraints = this.b;
            if (calendarConstraints.e == null) {
                if (!singleDateSelector.x3().isEmpty()) {
                    month = Month.d(((Long) singleDateSelector.x3().iterator().next()).longValue());
                    CalendarConstraints calendarConstraints2 = this.b;
                    if (month.compareTo(calendarConstraints2.b) >= 0) {
                    }
                }
                month = new Month(l2r0.d());
                CalendarConstraints calendarConstraints3 = this.b;
                if (month.compareTo(calendarConstraints3.b) < 0 || month.compareTo(calendarConstraints3.c) > 0) {
                    month = this.b.b;
                }
                calendarConstraints.e = month;
            }
            g<S> gVar = new g<>();
            Bundle bundle = new Bundle();
            bundle.putInt("OVERRIDE_THEME_RES_ID", 0);
            bundle.putParcelable("DATE_SELECTOR_KEY", singleDateSelector);
            bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.b);
            bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
            bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.c);
            bundle.putCharSequence("TITLE_TEXT_KEY", null);
            bundle.putInt("INPUT_MODE_KEY", 0);
            bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", 0);
            bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", null);
            bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", 0);
            bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", null);
            bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", 0);
            bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", null);
            bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", 0);
            bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", null);
            gVar.setArguments(bundle);
            return gVar;
        }
    }

    public static int En(@NonNull Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R$dimen.mtrl_calendar_content_padding);
        Month month = new Month(l2r0.d());
        int dimensionPixelSize = resources.getDimensionPixelSize(R$dimen.mtrl_calendar_day_width);
        int dimensionPixelOffset2 = resources.getDimensionPixelOffset(R$dimen.mtrl_calendar_month_horizontal_padding);
        int i = month.e;
        return ir.b(i, 1, dimensionPixelOffset2, (dimensionPixelSize * i) + (dimensionPixelOffset * 2));
    }

    public static boolean Fn(int i, @NonNull Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(jl10.c(context, R$attr.materialCalendarStyle, com.google.android.material.datepicker.c.class.getCanonicalName()).data, new int[]{i});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z;
    }

    public static long Hn() {
        return l2r0.d().getTimeInMillis();
    }

    public final DateSelector<S> Dn() {
        if (this.C == null) {
            this.C = (DateSelector) getArguments().getParcelable("DATE_SELECTOR_KEY");
        }
        return this.C;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [androidx.fragment.app.Fragment, xsna.vm10] */
    public final void Gn() {
        Context requireContext = requireContext();
        int i = this.B;
        if (i == 0) {
            i = Dn().g2(requireContext);
        }
        DateSelector<S> Dn = Dn();
        CalendarConstraints calendarConstraints = this.E;
        DayViewDecorator dayViewDecorator = this.F;
        com.google.android.material.datepicker.c<S> cVar = new com.google.android.material.datepicker.c<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i);
        bundle.putParcelable("GRID_SELECTOR_KEY", Dn);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", dayViewDecorator);
        bundle.putParcelable("CURRENT_MONTH_KEY", calendarConstraints.e);
        cVar.setArguments(bundle);
        this.G = cVar;
        if (this.K == 1) {
            DateSelector<S> Dn2 = Dn();
            CalendarConstraints calendarConstraints2 = this.E;
            ?? vm10Var = new vm10();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", i);
            bundle2.putParcelable("DATE_SELECTOR_KEY", Dn2);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints2);
            vm10Var.setArguments(bundle2);
            cVar = vm10Var;
        }
        this.D = cVar;
        this.T.setText((this.K == 1 && getResources().getConfiguration().orientation == 2) ? this.a0 : this.Z);
        String T4 = Dn().T4(mo2getContext());
        this.U.setContentDescription(Dn().q4(requireContext()));
        this.U.setText(T4);
        FragmentManager childFragmentManager = getChildFragmentManager();
        childFragmentManager.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(childFragmentManager);
        aVar.g(R$id.mtrl_calendar_frame, this.D, null);
        aVar.l();
        this.D.tn(new c());
    }

    public final void In(@NonNull CheckableImageButton checkableImageButton) {
        this.V.setContentDescription(this.K == 1 ? checkableImageButton.getContext().getString(R$string.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton.getContext().getString(R$string.mtrl_picker_toggle_to_text_input_mode));
    }

    @Override // androidx.fragment.app.d, android.content.DialogInterface.OnCancelListener
    public final void onCancel(@NonNull DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it = this.z.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.B = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.C = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.E = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.F = (DayViewDecorator) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.H = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.I = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.K = bundle.getInt("INPUT_MODE_KEY");
        this.L = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.M = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.N = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.O = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.P = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.Q = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.R = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.S = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence charSequence = this.I;
        if (charSequence == null) {
            charSequence = requireContext().getResources().getText(this.H);
        }
        this.Z = charSequence;
        if (charSequence != null) {
            CharSequence[] split = TextUtils.split(String.valueOf(charSequence), "\n");
            if (split.length > 1) {
                charSequence = split[0];
            }
        } else {
            charSequence = null;
        }
        this.a0 = charSequence;
    }

    @Override // androidx.fragment.app.Fragment
    @NonNull
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View inflate = layoutInflater.inflate(this.J ? R$layout.mtrl_picker_fullscreen : R$layout.mtrl_picker_dialog, viewGroup);
        Context context = inflate.getContext();
        if (this.J) {
            inflate.findViewById(R$id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(En(context), -2));
        } else {
            inflate.findViewById(R$id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(En(context), -1));
        }
        TextView textView = (TextView) inflate.findViewById(R$id.mtrl_picker_header_selection_text);
        this.U = textView;
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        textView.setAccessibilityLiveRegion(1);
        this.V = (CheckableImageButton) inflate.findViewById(R$id.mtrl_picker_header_toggle);
        this.T = (TextView) inflate.findViewById(R$id.mtrl_picker_title_text);
        this.V.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.V;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_checked}, m33.a(R$drawable.material_ic_calendar_black_24dp, context));
        stateListDrawable.addState(new int[0], m33.a(R$drawable.material_ic_edit_black_24dp, context));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.V.setChecked(this.K != 0);
        iut0.q(this.V, null);
        In(this.V);
        this.V.setOnClickListener(new v6d(this, 3));
        this.X = (Button) inflate.findViewById(R$id.confirm_button);
        if (Dn().j8()) {
            this.X.setEnabled(true);
        } else {
            this.X.setEnabled(false);
        }
        this.X.setTag("CONFIRM_BUTTON_TAG");
        CharSequence charSequence = this.M;
        if (charSequence != null) {
            this.X.setText(charSequence);
        } else {
            int i = this.L;
            if (i != 0) {
                this.X.setText(i);
            }
        }
        CharSequence charSequence2 = this.O;
        if (charSequence2 != null) {
            this.X.setContentDescription(charSequence2);
        } else if (this.N != 0) {
            this.X.setContentDescription(mo2getContext().getResources().getText(this.N));
        }
        this.X.setOnClickListener(new a());
        Button button = (Button) inflate.findViewById(R$id.cancel_button);
        button.setTag("CANCEL_BUTTON_TAG");
        CharSequence charSequence3 = this.Q;
        if (charSequence3 != null) {
            button.setText(charSequence3);
        } else {
            int i2 = this.P;
            if (i2 != 0) {
                button.setText(i2);
            }
        }
        CharSequence charSequence4 = this.S;
        if (charSequence4 != null) {
            button.setContentDescription(charSequence4);
        } else if (this.R != 0) {
            button.setContentDescription(mo2getContext().getResources().getText(this.R));
        }
        button.setOnClickListener(new b());
        return inflate;
    }

    @Override // androidx.fragment.app.d, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@NonNull DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it = this.A.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.B);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.C);
        CalendarConstraints calendarConstraints = this.E;
        CalendarConstraints.b bVar = new CalendarConstraints.b();
        bVar.a = CalendarConstraints.b.f;
        bVar.b = CalendarConstraints.b.g;
        bVar.e = new DateValidatorPointForward(Long.MIN_VALUE);
        bVar.a = calendarConstraints.b.g;
        bVar.b = calendarConstraints.c.g;
        bVar.c = Long.valueOf(calendarConstraints.e.g);
        bVar.d = calendarConstraints.f;
        bVar.e = calendarConstraints.d;
        com.google.android.material.datepicker.c<S> cVar = this.G;
        Month month = cVar == null ? null : cVar.m;
        if (month != null) {
            bVar.c = Long.valueOf(month.g);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar.a());
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.F);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.H);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.I);
        bundle.putInt("INPUT_MODE_KEY", this.K);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.L);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.M);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.N);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.O);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.P);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.Q);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.R);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.S);
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        Window window = zn().getWindow();
        if (this.J) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.W);
            if (!this.Y) {
                View findViewById = requireView().findViewById(R$id.fullscreen_header);
                ColorStateList d2 = tko.d(findViewById.getBackground());
                Integer valueOf = d2 != null ? Integer.valueOf(d2.getDefaultColor()) : null;
                boolean z = valueOf == null || valueOf.intValue() == 0;
                int b2 = dm10.b(R.attr.colorBackground, -16777216, window.getContext());
                if (z) {
                    valueOf = Integer.valueOf(b2);
                }
                ppx0.b(window, false);
                window.getContext();
                window.getContext();
                window.setStatusBarColor(0);
                window.setNavigationBarColor(0);
                boolean z2 = dm10.f(0) || dm10.f(valueOf.intValue());
                oek0 oek0Var = new oek0(window.getDecorView());
                int i = Build.VERSION.SDK_INT;
                (i >= 35 ? new oqx0.f(window, oek0Var) : i >= 30 ? new oqx0.d(window, oek0Var) : new oqx0.c(window, oek0Var)).f(z2);
                boolean z3 = dm10.f(0) || dm10.f(b2);
                oek0 oek0Var2 = new oek0(window.getDecorView());
                int i2 = Build.VERSION.SDK_INT;
                (i2 >= 35 ? new oqx0.f(window, oek0Var2) : i2 >= 30 ? new oqx0.d(window, oek0Var2) : new oqx0.c(window, oek0Var2)).e(z3);
                jm10 jm10Var = new jm10(findViewById.getLayoutParams().height, findViewById.getPaddingTop(), findViewById);
                WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                iut0.d.c(findViewById, jm10Var);
                this.Y = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(R$dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.W, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new a4x(zn(), rect));
        }
        Gn();
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onStop() {
        this.D.h.clear();
        super.onStop();
    }

    @Override // androidx.fragment.app.d
    @NonNull
    public final Dialog yn(@Nullable Bundle bundle) {
        Context requireContext = requireContext();
        Context requireContext2 = requireContext();
        int i = this.B;
        if (i == 0) {
            i = Dn().g2(requireContext2);
        }
        Dialog dialog = new Dialog(requireContext, i);
        Context context = dialog.getContext();
        this.J = Fn(R.attr.windowFullscreen, context);
        this.W = new MaterialShapeDrawable(context, null, R$attr.materialCalendarStyle, R$style.Widget_MaterialComponents_MaterialCalendar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, R$styleable.MaterialCalendar, R$attr.materialCalendarStyle, R$style.Widget_MaterialComponents_MaterialCalendar);
        int color = obtainStyledAttributes.getColor(R$styleable.MaterialCalendar_backgroundTint, 0);
        obtainStyledAttributes.recycle();
        this.W.initializeElevationOverlay(context);
        this.W.setFillColor(ColorStateList.valueOf(color));
        MaterialShapeDrawable materialShapeDrawable = this.W;
        View decorView = dialog.getWindow().getDecorView();
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        materialShapeDrawable.setElevation(decorView.getElevation());
        return dialog;
    }
}
