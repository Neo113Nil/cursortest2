package androidx.preference;

import android.R;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import defpackage.a70;
import defpackage.b8;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class EditTextPreferenceDialogFragmentCompat extends PreferenceDialogFragmentCompat {
    public final b8 A = new b8(this, 13);
    public long B = -1;
    public EditText y;
    public CharSequence z;

    @Override // androidx.preference.PreferenceDialogFragmentCompat, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            this.z = ((EditTextPreference) q()).S;
        } else {
            this.z = bundle.getCharSequence("EditTextPreferenceDialogFragment.text");
        }
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("EditTextPreferenceDialogFragment.text", this.z);
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    public final void r(View view) {
        super.r(view);
        EditText editText = (EditText) view.findViewById(R.id.edit);
        this.y = editText;
        if (editText == null) {
            a70.r("Dialog view must contain an EditText with id @android:id/edit");
            return;
        }
        editText.requestFocus();
        this.y.setText(this.z);
        EditText editText2 = this.y;
        editText2.setSelection(editText2.getText().length());
        ((EditTextPreference) q()).getClass();
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    public final void s(boolean z) {
        if (z) {
            String obj = this.y.getText().toString();
            EditTextPreference editTextPreference = (EditTextPreference) q();
            editTextPreference.getClass();
            editTextPreference.z(obj);
        }
    }

    public final void u() {
        long j = this.B;
        if (j == -1 || j + 1000 <= SystemClock.currentThreadTimeMillis()) {
            return;
        }
        EditText editText = this.y;
        if (editText == null || !editText.isFocused()) {
            this.B = -1L;
            return;
        }
        if (((InputMethodManager) this.y.getContext().getSystemService("input_method")).showSoftInput(this.y, 0)) {
            this.B = -1L;
            return;
        }
        EditText editText2 = this.y;
        b8 b8Var = this.A;
        editText2.removeCallbacks(b8Var);
        this.y.postDelayed(b8Var, 50L);
    }
}
