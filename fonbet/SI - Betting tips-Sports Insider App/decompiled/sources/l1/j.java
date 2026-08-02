package l1;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class j implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    public final EditText f19332a;

    /* renamed from: b, reason: collision with root package name */
    public i f19333b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f19334c = true;

    public j(EditText editText) {
        this.f19332a = editText;
    }

    public static void a(EditText editText, int i5) {
        int length;
        if (i5 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            j1.j a7 = j1.j.a();
            if (editableText == null) {
                length = 0;
            } else {
                a7.getClass();
                length = editableText.length();
            }
            a7.e(editableText, 0, length);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i5, int i10, int i11) {
        EditText editText = this.f19332a;
        if (editText.isInEditMode() || !this.f19334c || j1.j.f18201k == null || i10 > i11 || !(charSequence instanceof Spannable)) {
            return;
        }
        int b10 = j1.j.a().b();
        if (b10 != 0) {
            if (b10 == 1) {
                j1.j.a().e((Spannable) charSequence, i5, i11 + i5);
                return;
            } else if (b10 != 3) {
                return;
            }
        }
        j1.j a7 = j1.j.a();
        if (this.f19333b == null) {
            this.f19333b = new i(editText);
        }
        a7.f(this.f19333b);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i5, int i10, int i11) {
    }
}
