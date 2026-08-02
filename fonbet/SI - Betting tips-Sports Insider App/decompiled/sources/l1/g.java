package l1;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import com.google.android.gms.internal.measurement.d5;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g extends d5 {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f19327a;

    /* renamed from: b, reason: collision with root package name */
    public final e f19328b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f19329c = true;

    public g(TextView textView) {
        this.f19327a = textView;
        this.f19328b = new e(textView);
    }

    @Override // com.google.android.gms.internal.measurement.d5
    public final void R(boolean z5) {
        if (z5) {
            TextView textView = this.f19327a;
            textView.setTransformationMethod(Z(textView.getTransformationMethod()));
        }
    }

    @Override // com.google.android.gms.internal.measurement.d5
    public final void S(boolean z5) {
        this.f19329c = z5;
        TextView textView = this.f19327a;
        textView.setTransformationMethod(Z(textView.getTransformationMethod()));
        textView.setFilters(t(textView.getFilters()));
    }

    @Override // com.google.android.gms.internal.measurement.d5
    public final TransformationMethod Z(TransformationMethod transformationMethod) {
        return this.f19329c ? transformationMethod instanceof k ? transformationMethod : transformationMethod instanceof PasswordTransformationMethod ? transformationMethod : new k(transformationMethod) : transformationMethod instanceof k ? ((k) transformationMethod).f19335a : transformationMethod;
    }

    @Override // com.google.android.gms.internal.measurement.d5
    public final InputFilter[] t(InputFilter[] inputFilterArr) {
        if (!this.f19329c) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i5 = 0; i5 < inputFilterArr.length; i5++) {
                InputFilter inputFilter = inputFilterArr[i5];
                if (inputFilter instanceof e) {
                    sparseArray.put(i5, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i10 = 0;
            for (int i11 = 0; i11 < length; i11++) {
                if (sparseArray.indexOfKey(i11) < 0) {
                    inputFilterArr2[i10] = inputFilterArr[i11];
                    i10++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i12 = 0;
        while (true) {
            e eVar = this.f19328b;
            if (i12 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = eVar;
                return inputFilterArr3;
            }
            if (inputFilterArr[i12] == eVar) {
                return inputFilterArr;
            }
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.d5
    public final boolean z() {
        return this.f19329c;
    }
}
