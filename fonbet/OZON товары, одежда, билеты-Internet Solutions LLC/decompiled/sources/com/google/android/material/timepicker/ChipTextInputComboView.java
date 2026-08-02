package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.google.android.material.chip.Chip;
import com.google.android.material.textfield.TextInputLayout;
import ru.ozon.app.android.R;
import s7.C9618m;
import s7.C9621p;

/* loaded from: classes9.dex */
class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* renamed from: a, reason: collision with root package name */
    private final Chip f58797a;

    /* renamed from: b, reason: collision with root package name */
    private final EditText f58798b;

    private class a extends C9618m {
        a() {
        }

        @Override // s7.C9618m, android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            boolean isEmpty = TextUtils.isEmpty(editable);
            ChipTextInputComboView chipTextInputComboView = ChipTextInputComboView.this;
            if (isEmpty) {
                chipTextInputComboView.f58797a.setText(String.format(chipTextInputComboView.getResources().getConfiguration().locale, "%02d", Integer.valueOf(Integer.parseInt("00"))));
            } else {
                chipTextInputComboView.f58797a.setText(String.format(chipTextInputComboView.getResources().getConfiguration().locale, "%02d", Integer.valueOf(Integer.parseInt(String.valueOf(editable)))));
            }
        }
    }

    public ChipTextInputComboView(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater from = LayoutInflater.from(context);
        Chip chip = (Chip) from.inflate(R.layout.material_time_chip, (ViewGroup) this, false);
        this.f58797a = chip;
        chip.n();
        TextInputLayout textInputLayout = (TextInputLayout) from.inflate(R.layout.material_time_input, (ViewGroup) this, false);
        EditText s11 = textInputLayout.s();
        this.f58798b = s11;
        s11.setVisibility(4);
        s11.addTextChangedListener(new a());
        s11.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
        addView(chip);
        addView(textInputLayout);
        s11.setSaveEnabled(false);
        s11.setLongClickable(false);
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f58797a.isChecked();
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f58798b.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z11) {
        Chip chip = this.f58797a;
        chip.setChecked(z11);
        int i11 = z11 ? 0 : 4;
        EditText editText = this.f58798b;
        editText.setVisibility(i11);
        chip.setVisibility(z11 ? 8 : 0);
        if (chip.isChecked()) {
            C9621p.f(editText);
            if (TextUtils.isEmpty(editText.getText())) {
                return;
            }
            editText.setSelection(editText.getText().length());
        }
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f58797a.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public final void setTag(int i11, Object obj) {
        this.f58797a.setTag(i11, obj);
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        this.f58797a.toggle();
    }
}
