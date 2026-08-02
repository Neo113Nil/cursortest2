package com.google.android.material.textfield;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import androidx.annotation.NonNull;
import com.google.android.material.textfield.TextInputLayout;
import j7.C7292a;
import ru.ozon.app.android.R;

/* loaded from: classes9.dex */
final class a extends m {

    /* renamed from: e, reason: collision with root package name */
    private final TextWatcher f58699e;

    /* renamed from: f, reason: collision with root package name */
    private final View.OnFocusChangeListener f58700f;

    /* renamed from: g, reason: collision with root package name */
    private final TextInputLayout.e f58701g;

    /* renamed from: h, reason: collision with root package name */
    private final TextInputLayout.f f58702h;

    /* renamed from: i, reason: collision with root package name */
    private AnimatorSet f58703i;

    /* renamed from: j, reason: collision with root package name */
    private ValueAnimator f58704j;

    /* renamed from: com.google.android.material.textfield.a$a, reason: collision with other inner class name */
    final class C0889a implements TextWatcher {
        C0889a() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(@NonNull Editable editable) {
            a aVar = a.this;
            if (aVar.f58749a.B() != null) {
                return;
            }
            aVar.h(a.d(aVar));
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        }
    }

    final class b implements View.OnFocusChangeListener {
        b() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public final void onFocusChange(View view, boolean z11) {
            a aVar = a.this;
            aVar.h(a.d(aVar));
        }
    }

    final class c implements TextInputLayout.e {
        c() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.e
        public final void a(@NonNull TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.f58659e;
            a aVar = a.this;
            textInputLayout.Y(a.d(aVar));
            editText.setOnFocusChangeListener(aVar.f58700f);
            aVar.f58751c.setOnFocusChangeListener(aVar.f58700f);
            editText.removeTextChangedListener(aVar.f58699e);
            editText.addTextChangedListener(aVar.f58699e);
        }
    }

    final class d implements TextInputLayout.f {

        /* renamed from: com.google.android.material.textfield.a$d$a, reason: collision with other inner class name */
        final class RunnableC0890a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ EditText f58709a;

            RunnableC0890a(EditText editText) {
                this.f58709a = editText;
            }

            @Override // java.lang.Runnable
            public final void run() {
                d dVar = d.this;
                this.f58709a.removeTextChangedListener(a.this.f58699e);
                a.this.h(true);
            }
        }

        d() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.f
        public final void a(@NonNull TextInputLayout textInputLayout, int i11) {
            EditText editText = textInputLayout.f58659e;
            if (editText == null || i11 != 2) {
                return;
            }
            editText.post(new RunnableC0890a(editText));
            View.OnFocusChangeListener onFocusChangeListener = editText.getOnFocusChangeListener();
            a aVar = a.this;
            if (onFocusChangeListener == aVar.f58700f) {
                editText.setOnFocusChangeListener(null);
            }
            if (aVar.f58751c.getOnFocusChangeListener() == aVar.f58700f) {
                aVar.f58751c.setOnFocusChangeListener(null);
            }
        }
    }

    final class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            a aVar = a.this;
            Editable text = aVar.f58749a.f58659e.getText();
            if (text != null) {
                text.clear();
            }
            aVar.f58749a.J();
        }
    }

    a(@NonNull TextInputLayout textInputLayout, int i11) {
        super(textInputLayout, i11);
        this.f58699e = new C0889a();
        this.f58700f = new b();
        this.f58701g = new c();
        this.f58702h = new d();
    }

    static boolean d(a aVar) {
        EditText editText = aVar.f58749a.f58659e;
        if (editText != null) {
            return (editText.hasFocus() || aVar.f58751c.hasFocus()) && editText.getText().length() > 0;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(boolean z11) {
        boolean z12 = this.f58749a.C() == z11;
        if (z11 && !this.f58703i.isRunning()) {
            this.f58704j.cancel();
            this.f58703i.start();
            if (z12) {
                this.f58703i.end();
                return;
            }
            return;
        }
        if (z11) {
            return;
        }
        this.f58703i.cancel();
        this.f58704j.start();
        if (z12) {
            this.f58704j.end();
        }
    }

    @Override // com.google.android.material.textfield.m
    final void a() {
        int i11 = this.f58752d;
        if (i11 == 0) {
            i11 = R.drawable.mtrl_ic_cancel;
        }
        TextInputLayout textInputLayout = this.f58749a;
        textInputLayout.T(i11);
        textInputLayout.S(textInputLayout.getResources().getText(R.string.clear_text_end_icon_content_description));
        textInputLayout.R(false);
        textInputLayout.W(new e());
        textInputLayout.g(this.f58701g);
        textInputLayout.h(this.f58702h);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(C7292a.f69466d);
        ofFloat.setDuration(150L);
        ofFloat.addUpdateListener(new com.google.android.material.textfield.e(this));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        LinearInterpolator linearInterpolator = C7292a.f69463a;
        ofFloat2.setInterpolator(linearInterpolator);
        ofFloat2.setDuration(100L);
        ofFloat2.addUpdateListener(new com.google.android.material.textfield.d(this));
        AnimatorSet animatorSet = new AnimatorSet();
        this.f58703i = animatorSet;
        animatorSet.playTogether(ofFloat, ofFloat2);
        this.f58703i.addListener(new com.google.android.material.textfield.b(this));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat3.setInterpolator(linearInterpolator);
        ofFloat3.setDuration(100L);
        ofFloat3.addUpdateListener(new com.google.android.material.textfield.d(this));
        this.f58704j = ofFloat3;
        ofFloat3.addListener(new com.google.android.material.textfield.c(this));
    }

    @Override // com.google.android.material.textfield.m
    final void c(boolean z11) {
        if (this.f58749a.B() == null) {
            return;
        }
        h(z11);
    }
}
