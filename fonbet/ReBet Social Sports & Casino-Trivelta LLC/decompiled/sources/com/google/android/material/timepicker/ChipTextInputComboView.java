package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.view.AbstractC2082d0;
import androidx.core.view.C2075a;
import com.google.android.material.chip.Chip;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Arrays;
import xa.o;

/* loaded from: classes3.dex */
class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* renamed from: a, reason: collision with root package name */
    public final Chip f36359a;

    /* renamed from: b, reason: collision with root package name */
    public final TextInputLayout f36360b;

    /* renamed from: c, reason: collision with root package name */
    public final EditText f36361c;

    /* renamed from: d, reason: collision with root package name */
    public TextWatcher f36362d;

    /* renamed from: e, reason: collision with root package name */
    public TextView f36363e;

    public class b extends xa.k {
        public b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (TextUtils.isEmpty(editable)) {
                ChipTextInputComboView.this.f36359a.setText(ChipTextInputComboView.this.d("00"));
                return;
            }
            String d10 = ChipTextInputComboView.this.d(editable);
            Chip chip = ChipTextInputComboView.this.f36359a;
            if (TextUtils.isEmpty(d10)) {
                d10 = ChipTextInputComboView.this.d("00");
            }
            chip.setText(d10);
        }
    }

    public ChipTextInputComboView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void c(InputFilter inputFilter) {
        InputFilter[] filters = this.f36361c.getFilters();
        InputFilter[] inputFilterArr = (InputFilter[]) Arrays.copyOf(filters, filters.length + 1);
        inputFilterArr[filters.length] = inputFilter;
        this.f36361c.setFilters(inputFilterArr);
    }

    public final String d(CharSequence charSequence) {
        return TimeModel.a(getResources(), charSequence);
    }

    public TextInputLayout e() {
        return this.f36360b;
    }

    public void f(C2075a c2075a) {
        AbstractC2082d0.l0(this.f36359a, c2075a);
    }

    public void g(CharSequence charSequence) {
        String d10 = d(charSequence);
        this.f36359a.setText(d10);
        if (TextUtils.isEmpty(d10)) {
            return;
        }
        this.f36361c.removeTextChangedListener(this.f36362d);
        this.f36361c.setText(d10);
        this.f36361c.addTextChangedListener(this.f36362d);
    }

    public final void h() {
        this.f36361c.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f36359a.isChecked();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        h();
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        this.f36359a.setChecked(z10);
        this.f36361c.setVisibility(z10 ? 0 : 4);
        this.f36359a.setVisibility(z10 ? 8 : 0);
        if (isChecked()) {
            o.o(this.f36361c, false);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f36359a.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public void setTag(int i10, Object obj) {
        this.f36359a.setTag(i10, obj);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        this.f36359a.toggle();
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        LayoutInflater from = LayoutInflater.from(context);
        Chip chip = (Chip) from.inflate(ia.i.f48482o, (ViewGroup) this, false);
        this.f36359a = chip;
        chip.setAccessibilityClassName("android.view.View");
        TextInputLayout textInputLayout = (TextInputLayout) from.inflate(ia.i.f48483p, (ViewGroup) this, false);
        this.f36360b = textInputLayout;
        EditText editText = textInputLayout.getEditText();
        this.f36361c = editText;
        editText.setVisibility(4);
        b bVar = new b();
        this.f36362d = bVar;
        editText.addTextChangedListener(bVar);
        h();
        addView(chip);
        addView(textInputLayout);
        this.f36363e = (TextView) findViewById(ia.g.f48454t);
        editText.setId(View.generateViewId());
        this.f36363e.setLabelFor(editText.getId());
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }
}
