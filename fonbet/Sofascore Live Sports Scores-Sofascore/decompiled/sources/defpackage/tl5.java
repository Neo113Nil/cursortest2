package defpackage;

import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.widget.TextView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class tl5 extends s02 {
    public final sl5 j;

    public tl5(TextView textView) {
        this.j = new sl5(textView);
    }

    @Override // defpackage.s02
    public final InputFilter[] J(InputFilter[] inputFilterArr) {
        return !cl5.d() ? inputFilterArr : this.j.J(inputFilterArr);
    }

    @Override // defpackage.s02
    public final boolean Q() {
        return this.j.l;
    }

    @Override // defpackage.s02
    public final void a0(boolean z) {
        if (cl5.d()) {
            this.j.a0(z);
        }
    }

    @Override // defpackage.s02
    public final void b0(boolean z) {
        boolean d = cl5.d();
        sl5 sl5Var = this.j;
        if (d) {
            sl5Var.b0(z);
        } else {
            sl5Var.l = z;
        }
    }

    @Override // defpackage.s02
    public final TransformationMethod k0(TransformationMethod transformationMethod) {
        return !cl5.d() ? transformationMethod : this.j.k0(transformationMethod);
    }
}
