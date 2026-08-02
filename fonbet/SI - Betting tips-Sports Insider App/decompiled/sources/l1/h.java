package l1;

import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.widget.TextView;
import com.google.android.gms.internal.measurement.d5;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h extends d5 {

    /* renamed from: a, reason: collision with root package name */
    public final g f19330a;

    public h(TextView textView) {
        this.f19330a = new g(textView);
    }

    @Override // com.google.android.gms.internal.measurement.d5
    public final void R(boolean z5) {
        if (j1.j.f18201k != null) {
            this.f19330a.R(z5);
        }
    }

    @Override // com.google.android.gms.internal.measurement.d5
    public final void S(boolean z5) {
        g gVar = this.f19330a;
        if (j1.j.f18201k != null) {
            gVar.S(z5);
        } else {
            gVar.f19329c = z5;
        }
    }

    @Override // com.google.android.gms.internal.measurement.d5
    public final TransformationMethod Z(TransformationMethod transformationMethod) {
        return !(j1.j.f18201k != null) ? transformationMethod : this.f19330a.Z(transformationMethod);
    }

    @Override // com.google.android.gms.internal.measurement.d5
    public final InputFilter[] t(InputFilter[] inputFilterArr) {
        return !(j1.j.f18201k != null) ? inputFilterArr : this.f19330a.t(inputFilterArr);
    }

    @Override // com.google.android.gms.internal.measurement.d5
    public final boolean z() {
        return this.f19330a.f19329c;
    }
}
