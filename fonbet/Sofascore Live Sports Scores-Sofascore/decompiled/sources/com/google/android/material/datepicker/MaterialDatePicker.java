package com.google.android.material.datepicker;

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
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.s;
import com.google.android.material.datepicker.MaterialDatePicker;
import com.google.android.material.datepicker.SingleDateSelector;
import com.google.android.material.internal.CheckableImageButton;
import com.sofascore.results.R;
import defpackage.a70;
import defpackage.aal;
import defpackage.bea;
import defpackage.bka;
import defpackage.bsk;
import defpackage.eq3;
import defpackage.kzb;
import defpackage.l6g;
import defpackage.lhk;
import defpackage.o23;
import defpackage.o3a;
import defpackage.pjf;
import defpackage.pvd;
import defpackage.qkj;
import defpackage.qzb;
import defpackage.srk;
import defpackage.t4a;
import defpackage.td4;
import defpackage.x2a;
import defpackage.xl0;
import defpackage.y9l;
import defpackage.z9l;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class MaterialDatePicker<S> extends DialogFragment {
    public CharSequence A;
    public boolean B;
    public int C;
    public int D;
    public CharSequence E;
    public int F;
    public CharSequence G;
    public int H;
    public CharSequence I;
    public int J;
    public CharSequence K;
    public TextView L;
    public TextView M;
    public CheckableImageButton N;
    public qzb O;
    public Button P;
    public boolean Q;
    public CharSequence R;
    public CharSequence S;
    public final LinkedHashSet q = new LinkedHashSet();
    public final LinkedHashSet r = new LinkedHashSet();
    public final LinkedHashSet s = new LinkedHashSet();
    public final LinkedHashSet t = new LinkedHashSet();
    public int u;
    public DateSelector v;
    public PickerFragment w;
    public CalendarConstraints x;
    public MaterialCalendar y;
    public int z;

    public static int s(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Month month = new Month(lhk.d());
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width);
        int dimensionPixelOffset2 = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding);
        int i = month.d;
        return ((i - 1) * dimensionPixelOffset2) + (dimensionPixelSize * i) + (dimensionPixelOffset * 2);
    }

    public static boolean t(int i, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(x2a.P(context, R.attr.materialCalendarStyle, MaterialCalendar.class.getCanonicalName()).data, new int[]{i});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z;
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog l(Bundle bundle) {
        Context requireContext = requireContext();
        Context requireContext2 = requireContext();
        int i = this.u;
        if (i == 0) {
            ((SingleDateSelector) q()).getClass();
            i = x2a.P(requireContext2, R.attr.materialCalendarTheme, MaterialDatePicker.class.getCanonicalName()).data;
        }
        Dialog dialog = new Dialog(requireContext, i);
        Context context = dialog.getContext();
        this.B = t(android.R.attr.windowFullscreen, context);
        this.O = new qzb(context, null, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, pjf.y, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        int color = obtainStyledAttributes.getColor(1, 0);
        obtainStyledAttributes.recycle();
        this.O.p(context);
        this.O.t(ColorStateList.valueOf(color));
        this.O.s(dialog.getWindow().getDecorView().getElevation());
        return dialog;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.s.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.u = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.v = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.x = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            pvd.j();
            return;
        }
        this.z = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.A = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.C = bundle.getInt("INPUT_MODE_KEY");
        this.D = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.E = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.F = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.G = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.H = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.I = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.J = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.K = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence charSequence = this.A;
        if (charSequence == null) {
            charSequence = requireContext().getResources().getText(this.z);
        }
        this.R = charSequence;
        if (charSequence != null) {
            CharSequence[] split = TextUtils.split(String.valueOf(charSequence), "\n");
            if (split.length > 1) {
                charSequence = split[0];
            }
        } else {
            charSequence = null;
        }
        this.S = charSequence;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(this.B ? R.layout.mtrl_picker_fullscreen : R.layout.mtrl_picker_dialog, viewGroup);
        Context context = inflate.getContext();
        if (this.B) {
            inflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(s(context), -2));
        } else {
            inflate.findViewById(R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(s(context), -1));
        }
        TextView textView = (TextView) inflate.findViewById(R.id.mtrl_picker_header_selection_text);
        this.M = textView;
        final int i = 1;
        textView.setAccessibilityLiveRegion(1);
        this.N = (CheckableImageButton) inflate.findViewById(R.id.mtrl_picker_header_toggle);
        this.L = (TextView) inflate.findViewById(R.id.mtrl_picker_title_text);
        this.N.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.N;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, td4.d0(R.drawable.material_ic_calendar_black_24dp, context));
        final int i2 = 0;
        stateListDrawable.addState(new int[0], td4.d0(R.drawable.material_ic_edit_black_24dp, context));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.N.setChecked(this.C != 0);
        bsk.q(this.N, null);
        w(this.N);
        x(this.N);
        final int i3 = 2;
        this.N.setOnClickListener(new View.OnClickListener(this) { // from class: jzb
            public final /* synthetic */ MaterialDatePicker b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i4 = i3;
                MaterialDatePicker materialDatePicker = this.b;
                switch (i4) {
                    case 0:
                        Iterator it = materialDatePicker.q.iterator();
                        while (it.hasNext()) {
                            yg5 yg5Var = (yg5) it.next();
                            Long l = ((SingleDateSelector) materialDatePicker.q()).a;
                            int i5 = yg5Var.a;
                            Function1 function1 = yg5Var.b;
                            switch (i5) {
                                case 0:
                                    ((fa) function1).invoke(l);
                                    break;
                                case 1:
                                    ((mh5) function1).invoke(l);
                                    break;
                                case 2:
                                    ((mh5) function1).invoke(l);
                                    break;
                                default:
                                    ((lsb) function1).invoke(l);
                                    break;
                            }
                        }
                        materialDatePicker.k(false, false);
                        break;
                    case 1:
                        Iterator it2 = materialDatePicker.r.iterator();
                        while (it2.hasNext()) {
                            ((View.OnClickListener) it2.next()).onClick(view);
                        }
                        materialDatePicker.k(false, false);
                        break;
                    default:
                        materialDatePicker.P.setEnabled(((SingleDateSelector) materialDatePicker.q()).a != null);
                        materialDatePicker.N.toggle();
                        materialDatePicker.C = materialDatePicker.C != 1 ? 1 : 0;
                        materialDatePicker.w(materialDatePicker.N);
                        materialDatePicker.x(materialDatePicker.N);
                        materialDatePicker.u();
                        break;
                }
            }
        });
        this.P = (Button) inflate.findViewById(R.id.confirm_button);
        boolean z = ((SingleDateSelector) q()).a != null;
        Button button = this.P;
        if (z) {
            button.setEnabled(true);
        } else {
            button.setEnabled(false);
        }
        this.P.setTag("CONFIRM_BUTTON_TAG");
        CharSequence charSequence = this.E;
        if (charSequence != null) {
            this.P.setText(charSequence);
        } else {
            int i4 = this.D;
            if (i4 != 0) {
                this.P.setText(i4);
            }
        }
        CharSequence charSequence2 = this.G;
        if (charSequence2 != null) {
            this.P.setContentDescription(charSequence2);
        } else if (this.F != 0) {
            this.P.setContentDescription(getContext().getResources().getText(this.F));
        }
        this.P.setOnClickListener(new View.OnClickListener(this) { // from class: jzb
            public final /* synthetic */ MaterialDatePicker b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i42 = i2;
                MaterialDatePicker materialDatePicker = this.b;
                switch (i42) {
                    case 0:
                        Iterator it = materialDatePicker.q.iterator();
                        while (it.hasNext()) {
                            yg5 yg5Var = (yg5) it.next();
                            Long l = ((SingleDateSelector) materialDatePicker.q()).a;
                            int i5 = yg5Var.a;
                            Function1 function1 = yg5Var.b;
                            switch (i5) {
                                case 0:
                                    ((fa) function1).invoke(l);
                                    break;
                                case 1:
                                    ((mh5) function1).invoke(l);
                                    break;
                                case 2:
                                    ((mh5) function1).invoke(l);
                                    break;
                                default:
                                    ((lsb) function1).invoke(l);
                                    break;
                            }
                        }
                        materialDatePicker.k(false, false);
                        break;
                    case 1:
                        Iterator it2 = materialDatePicker.r.iterator();
                        while (it2.hasNext()) {
                            ((View.OnClickListener) it2.next()).onClick(view);
                        }
                        materialDatePicker.k(false, false);
                        break;
                    default:
                        materialDatePicker.P.setEnabled(((SingleDateSelector) materialDatePicker.q()).a != null);
                        materialDatePicker.N.toggle();
                        materialDatePicker.C = materialDatePicker.C != 1 ? 1 : 0;
                        materialDatePicker.w(materialDatePicker.N);
                        materialDatePicker.x(materialDatePicker.N);
                        materialDatePicker.u();
                        break;
                }
            }
        });
        Button button2 = (Button) inflate.findViewById(R.id.cancel_button);
        button2.setTag("CANCEL_BUTTON_TAG");
        CharSequence charSequence3 = this.I;
        if (charSequence3 != null) {
            button2.setText(charSequence3);
        } else {
            int i5 = this.H;
            if (i5 != 0) {
                button2.setText(i5);
            }
        }
        CharSequence charSequence4 = this.K;
        if (charSequence4 != null) {
            button2.setContentDescription(charSequence4);
        } else if (this.J != 0) {
            button2.setContentDescription(getContext().getResources().getText(this.J));
        }
        button2.setOnClickListener(new View.OnClickListener(this) { // from class: jzb
            public final /* synthetic */ MaterialDatePicker b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i42 = i;
                MaterialDatePicker materialDatePicker = this.b;
                switch (i42) {
                    case 0:
                        Iterator it = materialDatePicker.q.iterator();
                        while (it.hasNext()) {
                            yg5 yg5Var = (yg5) it.next();
                            Long l = ((SingleDateSelector) materialDatePicker.q()).a;
                            int i52 = yg5Var.a;
                            Function1 function1 = yg5Var.b;
                            switch (i52) {
                                case 0:
                                    ((fa) function1).invoke(l);
                                    break;
                                case 1:
                                    ((mh5) function1).invoke(l);
                                    break;
                                case 2:
                                    ((mh5) function1).invoke(l);
                                    break;
                                default:
                                    ((lsb) function1).invoke(l);
                                    break;
                            }
                        }
                        materialDatePicker.k(false, false);
                        break;
                    case 1:
                        Iterator it2 = materialDatePicker.r.iterator();
                        while (it2.hasNext()) {
                            ((View.OnClickListener) it2.next()).onClick(view);
                        }
                        materialDatePicker.k(false, false);
                        break;
                    default:
                        materialDatePicker.P.setEnabled(((SingleDateSelector) materialDatePicker.q()).a != null);
                        materialDatePicker.N.toggle();
                        materialDatePicker.C = materialDatePicker.C != 1 ? 1 : 0;
                        materialDatePicker.w(materialDatePicker.N);
                        materialDatePicker.x(materialDatePicker.N);
                        materialDatePicker.u();
                        break;
                }
            }
        });
        return inflate;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.t.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.u);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.v);
        CalendarConstraints calendarConstraints = this.x;
        b bVar = new b();
        bVar.a = b.f;
        bVar.b = b.g;
        bVar.e = new DateValidatorPointForward(Long.MIN_VALUE);
        bVar.a = calendarConstraints.a.f;
        bVar.b = calendarConstraints.b.f;
        bVar.c = Long.valueOf(calendarConstraints.d.f);
        bVar.d = calendarConstraints.e;
        bVar.e = calendarConstraints.c;
        MaterialCalendar materialCalendar = this.y;
        Month month = materialCalendar == null ? null : materialCalendar.e;
        if (month != null) {
            bVar.c = Long.valueOf(month.f);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar.a());
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.z);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.A);
        bundle.putInt("INPUT_MODE_KEY", this.C);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.D);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.E);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.F);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.G);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.H);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.I);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.J);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.K);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        int i;
        super.onStart();
        Window window = m().getWindow();
        if (this.B) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.O);
            if (!this.Q) {
                View findViewById = requireView().findViewById(R.id.fullscreen_header);
                ColorStateList r = eq3.r(findViewById.getBackground());
                Integer valueOf = r != null ? Integer.valueOf(r.getDefaultColor()) : null;
                boolean z = false;
                boolean z2 = valueOf == null || valueOf.intValue() == 0;
                Integer v = o3a.v(android.R.attr.colorBackground, window.getContext());
                int intValue = v != null ? v.intValue() : -16777216;
                if (z2) {
                    valueOf = Integer.valueOf(intValue);
                }
                bea.L(window, false);
                window.getContext();
                Context context = window.getContext();
                int i2 = Build.VERSION.SDK_INT;
                if (i2 < 27) {
                    Integer v2 = o3a.v(android.R.attr.navigationBarColor, context);
                    i = o23.k(v2 != null ? v2.intValue() : -16777216, 128);
                } else {
                    i = 0;
                }
                if (i2 < 35) {
                    window.setStatusBarColor(0);
                }
                if (i2 < 35) {
                    window.setNavigationBarColor(i);
                }
                boolean z3 = o3a.H(0) || o3a.H(valueOf.intValue());
                bka bkaVar = new bka(window.getDecorView());
                (i2 >= 35 ? new aal(window, bkaVar) : i2 >= 30 ? new z9l(window, bkaVar) : new y9l(window, bkaVar)).C(z3);
                boolean H = o3a.H(intValue);
                if (o3a.H(i) || (i == 0 && H)) {
                    z = true;
                }
                bka bkaVar2 = new bka(window.getDecorView());
                int i3 = Build.VERSION.SDK_INT;
                (i3 >= 35 ? new aal(window, bkaVar2) : i3 >= 30 ? new z9l(window, bkaVar2) : new y9l(window, bkaVar2)).B(z);
                xl0 xl0Var = new xl0(findViewById, findViewById.getLayoutParams().height, findViewById.getPaddingLeft(), findViewById.getPaddingTop(), findViewById.getPaddingRight());
                WeakHashMap weakHashMap = bsk.a;
                srk.c(findViewById, xl0Var);
                this.Q = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.O, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new t4a(m(), rect));
        }
        u();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        this.w.a.clear();
        super.onStop();
    }

    public final DateSelector q() {
        DateSelector dateSelector = this.v;
        if (dateSelector != null) {
            return dateSelector;
        }
        DateSelector dateSelector2 = (DateSelector) getArguments().getParcelable("DATE_SELECTOR_KEY");
        this.v = dateSelector2;
        return dateSelector2;
    }

    public final String r() {
        DateSelector q = q();
        Context context = getContext();
        SingleDateSelector singleDateSelector = (SingleDateSelector) q;
        singleDateSelector.getClass();
        Resources resources = context.getResources();
        Long l = singleDateSelector.a;
        return l == null ? resources.getString(R.string.mtrl_picker_date_header_unselected) : resources.getString(R.string.mtrl_picker_date_header_selected, l6g.H(l.longValue()));
    }

    public final void u() {
        Context requireContext = requireContext();
        int i = this.u;
        if (i == 0) {
            ((SingleDateSelector) q()).getClass();
            i = x2a.P(requireContext, R.attr.materialCalendarTheme, MaterialDatePicker.class.getCanonicalName()).data;
        }
        String str = this.C == 1 ? "TEXT_INPUT_FRAGMENT_TAG" : "CALENDAR_FRAGMENT_TAG";
        Fragment F = getChildFragmentManager().F(str);
        PickerFragment pickerFragment = F instanceof PickerFragment ? (PickerFragment) F : null;
        if (pickerFragment == null) {
            if (this.C == 1) {
                DateSelector q = q();
                CalendarConstraints calendarConstraints = this.x;
                MaterialTextInputPicker materialTextInputPicker = new MaterialTextInputPicker();
                Bundle bundle = new Bundle();
                bundle.putInt("THEME_RES_ID_KEY", i);
                bundle.putParcelable("DATE_SELECTOR_KEY", q);
                bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
                materialTextInputPicker.setArguments(bundle);
                pickerFragment = materialTextInputPicker;
            } else {
                DateSelector q2 = q();
                CalendarConstraints calendarConstraints2 = this.x;
                MaterialCalendar materialCalendar = new MaterialCalendar();
                Bundle bundle2 = new Bundle();
                bundle2.putInt("THEME_RES_ID_KEY", i);
                bundle2.putParcelable("GRID_SELECTOR_KEY", q2);
                bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints2);
                bundle2.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
                bundle2.putParcelable("CURRENT_MONTH_KEY", calendarConstraints2.d);
                materialCalendar.setArguments(bundle2);
                this.y = materialCalendar;
                pickerFragment = materialCalendar;
            }
        }
        this.w = pickerFragment;
        pickerFragment.j(new kzb(this));
        this.L.setText((this.C == 1 && getResources().getConfiguration().orientation == 2) ? this.S : this.R);
        v(r());
        s childFragmentManager = getChildFragmentManager();
        childFragmentManager.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(childFragmentManager);
        aVar.l(R.id.mtrl_calendar_frame, this.w, str);
        if (aVar.i) {
            a70.r("This transaction is already being added to the back stack");
        } else {
            aVar.j = false;
            aVar.t.A(aVar, false);
        }
    }

    public final void v(String str) {
        TextView textView = this.M;
        DateSelector q = q();
        Context requireContext = requireContext();
        SingleDateSelector singleDateSelector = (SingleDateSelector) q;
        singleDateSelector.getClass();
        Resources resources = requireContext.getResources();
        Long l = singleDateSelector.a;
        textView.setContentDescription(resources.getString(R.string.mtrl_picker_announce_current_selection, l == null ? resources.getString(R.string.mtrl_picker_announce_current_selection_none) : l6g.H(l.longValue())));
        this.M.setText(str);
    }

    public final void w(CheckableImageButton checkableImageButton) {
        this.N.setContentDescription(this.C == 1 ? checkableImageButton.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode));
    }

    public final void x(CheckableImageButton checkableImageButton) {
        qkj.a(this.N, this.C == 1 ? checkableImageButton.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode_tooltip) : checkableImageButton.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode_tooltip));
    }
}
