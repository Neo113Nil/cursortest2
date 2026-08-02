package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes3.dex */
public class j implements TextView.OnEditorActionListener, View.OnKeyListener {

    /* renamed from: a, reason: collision with root package name */
    public final ChipTextInputComboView f36470a;

    /* renamed from: b, reason: collision with root package name */
    public final ChipTextInputComboView f36471b;

    /* renamed from: c, reason: collision with root package name */
    public final TimeModel f36472c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f36473d = false;

    public j(ChipTextInputComboView chipTextInputComboView, ChipTextInputComboView chipTextInputComboView2, TimeModel timeModel) {
        this.f36470a = chipTextInputComboView;
        this.f36471b = chipTextInputComboView2;
        this.f36472c = timeModel;
    }

    public void a() {
        TextInputLayout e10 = this.f36470a.e();
        TextInputLayout e11 = this.f36471b.e();
        EditText editText = e10.getEditText();
        EditText editText2 = e11.getEditText();
        editText.setImeOptions(268435461);
        editText2.setImeOptions(268435462);
        editText.setOnEditorActionListener(this);
        editText.setOnKeyListener(this);
        editText2.setOnKeyListener(this);
    }

    public final void b(EditText editText) {
        if (editText.getSelectionStart() == 0 && editText.length() == 2) {
            editText.getText().clear();
        }
    }

    public final void c(int i10) {
        this.f36471b.setChecked(i10 == 12);
        this.f36470a.setChecked(i10 == 10);
        this.f36472c.f36406f = i10;
    }

    public final boolean d(int i10, KeyEvent keyEvent, EditText editText) {
        Editable text = editText.getText();
        if (text == null) {
            return false;
        }
        if (i10 >= 7 && i10 <= 16 && keyEvent.getAction() == 1 && editText.getSelectionStart() == 2 && text.length() == 2) {
            c(12);
            return true;
        }
        if (i10 >= 7 && i10 <= 16) {
            b(editText);
        }
        return false;
    }

    public final boolean e(int i10, KeyEvent keyEvent, EditText editText) {
        if (i10 == 67 && keyEvent.getAction() == 0 && TextUtils.isEmpty(editText.getText())) {
            c(10);
            return true;
        }
        if (i10 < 7 || i10 > 16) {
            return false;
        }
        b(editText);
        return false;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        boolean z10 = i10 == 5;
        if (z10) {
            c(12);
        }
        return z10;
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (this.f36473d) {
            return false;
        }
        this.f36473d = true;
        EditText editText = (EditText) view;
        boolean e10 = this.f36472c.f36406f == 12 ? e(i10, keyEvent, editText) : d(i10, keyEvent, editText);
        this.f36473d = false;
        return e10;
    }
}
