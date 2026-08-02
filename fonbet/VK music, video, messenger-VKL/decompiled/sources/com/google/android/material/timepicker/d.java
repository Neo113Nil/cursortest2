package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/* compiled from: TimePickerTextInputKeyController.java */
/* loaded from: classes13.dex */
public final class d implements TextView.OnEditorActionListener, View.OnKeyListener {
    public final ChipTextInputComboView b;
    public final ChipTextInputComboView c;
    public final TimeModel d;
    public boolean e = false;

    public d(ChipTextInputComboView chipTextInputComboView, ChipTextInputComboView chipTextInputComboView2, TimeModel timeModel) {
        this.b = chipTextInputComboView;
        this.c = chipTextInputComboView2;
        this.d = timeModel;
    }

    public final void a(int i) {
        this.c.setChecked(i == 12);
        this.b.setChecked(i == 10);
        this.d.g = i;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        boolean z = i == 5;
        if (z) {
            a(12);
        }
        return z;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (this.e) {
            return false;
        }
        boolean z = true;
        this.e = true;
        EditText editText = (EditText) view;
        if (this.d.g != 12) {
            Editable text = editText.getText();
            if (text != null) {
                if (i >= 7 && i <= 16 && keyEvent.getAction() == 1 && editText.getSelectionStart() == 2 && text.length() == 2) {
                    a(12);
                } else if (editText.getSelectionStart() == 0 && editText.length() == 2) {
                    editText.getText().clear();
                }
            }
            z = false;
        } else if (i == 67 && keyEvent.getAction() == 0 && TextUtils.isEmpty(editText.getText())) {
            a(10);
        } else {
            if (editText.getSelectionStart() == 0 && editText.length() == 2) {
                editText.getText().clear();
            }
            z = false;
        }
        this.e = false;
        return z;
    }
}
