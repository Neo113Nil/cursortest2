package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Resources;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.R$id;
import com.google.android.material.R$string;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.timepicker.ChipTextInputComboView;
import java.util.Arrays;
import java.util.Locale;
import xsna.am;
import xsna.do10;
import xsna.iut0;
import xsna.ruo0;
import xsna.sno0;
import xsna.yic;

/* compiled from: TimePickerTextInputPresenter.java */
/* loaded from: classes13.dex */
public final class f implements ruo0 {
    public final LinearLayout b;
    public final TimeModel c;
    public final a d;
    public final b e;
    public final ChipTextInputComboView f;
    public final ChipTextInputComboView g;
    public final EditText h;
    public final EditText i;
    public final MaterialButtonToggleGroup j;

    /* compiled from: TimePickerTextInputPresenter.java */
    public class a extends sno0 {
        public a() {
        }

        @Override // xsna.sno0, android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            try {
                boolean isEmpty = TextUtils.isEmpty(editable);
                f fVar = f.this;
                if (isEmpty) {
                    fVar.c.f(0);
                } else {
                    fVar.c.f(Integer.parseInt(editable.toString()));
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    /* compiled from: TimePickerTextInputPresenter.java */
    public class b extends sno0 {
        public b() {
        }

        @Override // xsna.sno0, android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            try {
                boolean isEmpty = TextUtils.isEmpty(editable);
                f fVar = f.this;
                if (isEmpty) {
                    fVar.c.e(0);
                } else {
                    fVar.c.e(Integer.parseInt(editable.toString()));
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    /* compiled from: TimePickerTextInputPresenter.java */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            f.this.a(((Integer) view.getTag(R$id.selection_type)).intValue());
        }
    }

    /* compiled from: TimePickerTextInputPresenter.java */
    public class d extends yic {
        public final /* synthetic */ TimeModel c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Context context, int i, TimeModel timeModel) {
            super(context, i);
            this.c = timeModel;
        }

        @Override // xsna.yic, xsna.hk
        public final void onInitializeAccessibilityNodeInfo(View view, am amVar) {
            super.onInitializeAccessibilityNodeInfo(view, amVar);
            Resources resources = view.getResources();
            TimeModel timeModel = this.c;
            amVar.r(resources.getString(timeModel.d == 1 ? R$string.material_hour_24h_suffix : R$string.material_hour_suffix, String.valueOf(timeModel.d())));
        }
    }

    /* compiled from: TimePickerTextInputPresenter.java */
    public class e extends yic {
        public final /* synthetic */ TimeModel c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Context context, int i, TimeModel timeModel) {
            super(context, i);
            this.c = timeModel;
        }

        @Override // xsna.yic, xsna.hk
        public final void onInitializeAccessibilityNodeInfo(View view, am amVar) {
            super.onInitializeAccessibilityNodeInfo(view, amVar);
            amVar.r(view.getResources().getString(R$string.material_minute_suffix, String.valueOf(this.c.f)));
        }
    }

    public f(LinearLayout linearLayout, TimeModel timeModel) {
        a aVar = new a();
        this.d = aVar;
        b bVar = new b();
        this.e = bVar;
        this.b = linearLayout;
        this.c = timeModel;
        Resources resources = linearLayout.getResources();
        ChipTextInputComboView chipTextInputComboView = (ChipTextInputComboView) linearLayout.findViewById(R$id.material_minute_text_input);
        this.f = chipTextInputComboView;
        ChipTextInputComboView chipTextInputComboView2 = (ChipTextInputComboView) linearLayout.findViewById(R$id.material_hour_text_input);
        this.g = chipTextInputComboView2;
        View findViewById = chipTextInputComboView.findViewById(R$id.material_label);
        TextInputLayout textInputLayout = chipTextInputComboView.c;
        View findViewById2 = chipTextInputComboView2.findViewById(R$id.material_label);
        TextInputLayout textInputLayout2 = chipTextInputComboView2.c;
        ((TextView) findViewById).setText(resources.getString(R$string.material_timepicker_minute));
        ((TextView) findViewById2).setText(resources.getString(R$string.material_timepicker_hour));
        chipTextInputComboView.setTag(R$id.selection_type, 12);
        chipTextInputComboView2.setTag(R$id.selection_type, 10);
        if (timeModel.d == 0) {
            MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) linearLayout.findViewById(R$id.material_clock_period_toggle);
            this.j = materialButtonToggleGroup;
            materialButtonToggleGroup.d.add(new MaterialButtonToggleGroup.d() { // from class: com.google.android.material.timepicker.e
                @Override // com.google.android.material.button.MaterialButtonToggleGroup.d
                public final void a(int i, boolean z) {
                    if (z) {
                        f.this.c.g(i == R$id.material_clock_period_pm_button ? 1 : 0);
                    }
                }
            });
            this.j.setVisibility(0);
            d();
        }
        c cVar = new c();
        chipTextInputComboView2.setOnClickListener(cVar);
        chipTextInputComboView.setOnClickListener(cVar);
        do10 do10Var = timeModel.c;
        EditText editText = chipTextInputComboView2.d;
        InputFilter[] filters = editText.getFilters();
        InputFilter[] inputFilterArr = (InputFilter[]) Arrays.copyOf(filters, filters.length + 1);
        inputFilterArr[filters.length] = do10Var;
        editText.setFilters(inputFilterArr);
        do10 do10Var2 = timeModel.b;
        EditText editText2 = chipTextInputComboView.d;
        InputFilter[] filters2 = editText2.getFilters();
        InputFilter[] inputFilterArr2 = (InputFilter[]) Arrays.copyOf(filters2, filters2.length + 1);
        inputFilterArr2[filters2.length] = do10Var2;
        editText2.setFilters(inputFilterArr2);
        EditText editText3 = textInputLayout2.getEditText();
        this.h = editText3;
        EditText editText4 = textInputLayout.getEditText();
        this.i = editText4;
        com.google.android.material.timepicker.d dVar = new com.google.android.material.timepicker.d(chipTextInputComboView2, chipTextInputComboView, timeModel);
        iut0.q(chipTextInputComboView2.b, new d(linearLayout.getContext(), R$string.material_hour_selection, timeModel));
        iut0.q(chipTextInputComboView.b, new e(linearLayout.getContext(), R$string.material_minute_selection, timeModel));
        editText3.addTextChangedListener(bVar);
        editText4.addTextChangedListener(aVar);
        c(timeModel);
        EditText editText5 = textInputLayout2.getEditText();
        EditText editText6 = textInputLayout.getEditText();
        editText5.setImeOptions(268435461);
        editText6.setImeOptions(268435462);
        editText5.setOnEditorActionListener(dVar);
        editText5.setOnKeyListener(dVar);
        editText6.setOnKeyListener(dVar);
    }

    public final void a(int i) {
        this.c.g = i;
        this.f.setChecked(i == 12);
        this.g.setChecked(i == 10);
        d();
    }

    public final void b() {
        TimeModel timeModel = this.c;
        this.f.setChecked(timeModel.g == 12);
        this.g.setChecked(timeModel.g == 10);
    }

    public final void c(TimeModel timeModel) {
        EditText editText = this.h;
        b bVar = this.e;
        editText.removeTextChangedListener(bVar);
        EditText editText2 = this.i;
        a aVar = this.d;
        editText2.removeTextChangedListener(aVar);
        Locale locale = this.b.getResources().getConfiguration().locale;
        String format = String.format(locale, "%02d", Integer.valueOf(timeModel.f));
        String format2 = String.format(locale, "%02d", Integer.valueOf(timeModel.d()));
        ChipTextInputComboView chipTextInputComboView = this.f;
        ChipTextInputComboView.a aVar2 = chipTextInputComboView.e;
        EditText editText3 = chipTextInputComboView.d;
        String a2 = TimeModel.a(chipTextInputComboView.getResources(), format, "%02d");
        chipTextInputComboView.b.setText(a2);
        if (!TextUtils.isEmpty(a2)) {
            editText3.removeTextChangedListener(aVar2);
            editText3.setText(a2);
            editText3.addTextChangedListener(aVar2);
        }
        ChipTextInputComboView chipTextInputComboView2 = this.g;
        ChipTextInputComboView.a aVar3 = chipTextInputComboView2.e;
        EditText editText4 = chipTextInputComboView2.d;
        String a3 = TimeModel.a(chipTextInputComboView2.getResources(), format2, "%02d");
        chipTextInputComboView2.b.setText(a3);
        if (!TextUtils.isEmpty(a3)) {
            editText4.removeTextChangedListener(aVar3);
            editText4.setText(a3);
            editText4.addTextChangedListener(aVar3);
        }
        editText.addTextChangedListener(bVar);
        editText2.addTextChangedListener(aVar);
        d();
    }

    public final void d() {
        MaterialButtonToggleGroup materialButtonToggleGroup = this.j;
        if (materialButtonToggleGroup == null) {
            return;
        }
        materialButtonToggleGroup.b(this.c.h == 0 ? R$id.material_clock_period_am_button : R$id.material_clock_period_pm_button, true);
    }

    @Override // xsna.ruo0
    public final void hide() {
        InputMethodManager inputMethodManager;
        LinearLayout linearLayout = this.b;
        View focusedChild = linearLayout.getFocusedChild();
        if (focusedChild != null && (inputMethodManager = (InputMethodManager) focusedChild.getContext().getSystemService(InputMethodManager.class)) != null) {
            inputMethodManager.hideSoftInputFromWindow(focusedChild.getWindowToken(), 0);
        }
        linearLayout.setVisibility(8);
    }

    @Override // xsna.ruo0
    public final void invalidate() {
        c(this.c);
    }

    @Override // xsna.ruo0
    public final void show() {
        this.b.setVisibility(0);
        a(this.c.g);
    }
}
