package defpackage;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class sae extends rn5 {
    public final int e;
    public EditText f;
    public final cd5 g;

    public sae(qn5 qn5Var, int i) {
        super(qn5Var);
        this.e = R.drawable.design_password_eye;
        this.g = new cd5(this, 26);
        if (i != 0) {
            this.e = i;
        }
    }

    @Override // defpackage.rn5
    public final void b() {
        p();
    }

    @Override // defpackage.rn5
    public final int c() {
        return R.string.password_toggle_content_description;
    }

    @Override // defpackage.rn5
    public final int d() {
        return this.e;
    }

    @Override // defpackage.rn5
    public final View.OnClickListener f() {
        return this.g;
    }

    @Override // defpackage.rn5
    public final boolean j() {
        return true;
    }

    @Override // defpackage.rn5
    public final boolean k() {
        EditText editText = this.f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // defpackage.rn5
    public final void l(EditText editText) {
        this.f = editText;
        p();
    }

    @Override // defpackage.rn5
    public final void q() {
        EditText editText = this.f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // defpackage.rn5
    public final void r() {
        EditText editText = this.f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
