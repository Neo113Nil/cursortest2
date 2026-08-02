package Ja;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;

/* loaded from: classes3.dex */
public class x extends s {

    /* renamed from: e, reason: collision with root package name */
    public int f6054e;

    /* renamed from: f, reason: collision with root package name */
    public EditText f6055f;

    /* renamed from: g, reason: collision with root package name */
    public final View.OnClickListener f6056g;

    public x(com.google.android.material.textfield.a aVar, int i10) {
        super(aVar);
        this.f6054e = ia.f.f48382a;
        this.f6056g = new View.OnClickListener() { // from class: Ja.w
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                x.v(x.this, view);
            }
        };
        if (i10 != 0) {
            this.f6054e = i10;
        }
    }

    public static /* synthetic */ void v(x xVar, View view) {
        EditText editText = xVar.f6055f;
        if (editText == null) {
            return;
        }
        int selectionEnd = editText.getSelectionEnd();
        if (xVar.w()) {
            xVar.f6055f.setTransformationMethod(null);
        } else {
            xVar.f6055f.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
        if (selectionEnd >= 0) {
            xVar.f6055f.setSelection(selectionEnd);
        }
        xVar.r();
    }

    public static boolean x(EditText editText) {
        if (editText != null) {
            return editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224;
        }
        return false;
    }

    @Override // Ja.s
    public void b(CharSequence charSequence, int i10, int i11, int i12) {
        r();
    }

    @Override // Ja.s
    public int c() {
        return ia.k.f48522a0;
    }

    @Override // Ja.s
    public int d() {
        return this.f6054e;
    }

    @Override // Ja.s
    public View.OnClickListener f() {
        return this.f6056g;
    }

    @Override // Ja.s
    public boolean l() {
        return true;
    }

    @Override // Ja.s
    public boolean m() {
        return !w();
    }

    @Override // Ja.s
    public void n(EditText editText) {
        this.f6055f = editText;
        r();
    }

    @Override // Ja.s
    public void s() {
        if (x(this.f6055f)) {
            this.f6055f.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    @Override // Ja.s
    public void u() {
        EditText editText = this.f6055f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    public final boolean w() {
        EditText editText = this.f6055f;
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }
}
