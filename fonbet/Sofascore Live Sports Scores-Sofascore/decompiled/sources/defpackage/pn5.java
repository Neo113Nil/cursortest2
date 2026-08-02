package defpackage;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class pn5 {
    public final /* synthetic */ qn5 a;

    public pn5(qn5 qn5Var) {
        this.a = qn5Var;
    }

    public final void a(TextInputLayout textInputLayout) {
        qn5 qn5Var = this.a;
        on5 on5Var = qn5Var.v;
        if (qn5Var.s == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = qn5Var.s;
        if (editText != null) {
            editText.removeTextChangedListener(on5Var);
            if (qn5Var.s.getOnFocusChangeListener() == qn5Var.b().e()) {
                qn5Var.s.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        qn5Var.s = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(on5Var);
        }
        qn5Var.b().l(qn5Var.s);
        qn5Var.k(qn5Var.b());
    }
}
