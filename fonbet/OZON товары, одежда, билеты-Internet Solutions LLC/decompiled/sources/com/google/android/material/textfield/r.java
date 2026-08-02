package com.google.android.material.textfield;

import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import androidx.annotation.NonNull;
import com.google.android.material.textfield.TextInputLayout;
import ru.ozon.app.android.R;
import s7.C9618m;

/* loaded from: classes9.dex */
final class r extends m {

    /* renamed from: e, reason: collision with root package name */
    private final TextWatcher f58780e;

    /* renamed from: f, reason: collision with root package name */
    private final TextInputLayout.e f58781f;

    /* renamed from: g, reason: collision with root package name */
    private final TextInputLayout.f f58782g;

    final class a extends C9618m {
        a() {
        }

        @Override // s7.C9618m, android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            r.this.f58751c.setChecked(!r.d(r1));
        }
    }

    final class b implements TextInputLayout.e {
        b() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.e
        public final void a(@NonNull TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.f58659e;
            r rVar = r.this;
            rVar.f58751c.setChecked(!r.d(rVar));
            editText.removeTextChangedListener(rVar.f58780e);
            editText.addTextChangedListener(rVar.f58780e);
        }
    }

    final class c implements TextInputLayout.f {

        final class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ EditText f58786a;

            a(EditText editText) {
                this.f58786a = editText;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f58786a.removeTextChangedListener(r.this.f58780e);
            }
        }

        c() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.f
        public final void a(@NonNull TextInputLayout textInputLayout, int i11) {
            EditText editText = textInputLayout.f58659e;
            if (editText == null || i11 != 1) {
                return;
            }
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            editText.post(new a(editText));
        }
    }

    final class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            r rVar = r.this;
            EditText editText = rVar.f58749a.f58659e;
            if (editText == null) {
                return;
            }
            int selectionEnd = editText.getSelectionEnd();
            if (r.d(rVar)) {
                editText.setTransformationMethod(null);
            } else {
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
            if (selectionEnd >= 0) {
                editText.setSelection(selectionEnd);
            }
            rVar.f58749a.J();
        }
    }

    r(@NonNull TextInputLayout textInputLayout, int i11) {
        super(textInputLayout, i11);
        this.f58780e = new a();
        this.f58781f = new b();
        this.f58782g = new c();
    }

    static boolean d(r rVar) {
        EditText editText = rVar.f58749a.f58659e;
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    @Override // com.google.android.material.textfield.m
    final void a() {
        int i11 = this.f58752d;
        if (i11 == 0) {
            i11 = R.drawable.design_password_eye;
        }
        TextInputLayout textInputLayout = this.f58749a;
        textInputLayout.T(i11);
        textInputLayout.S(textInputLayout.getResources().getText(R.string.password_toggle_content_description));
        textInputLayout.Y(true);
        textInputLayout.R(true);
        textInputLayout.W(new d());
        textInputLayout.g(this.f58781f);
        textInputLayout.h(this.f58782g);
        EditText editText = textInputLayout.f58659e;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }
}
