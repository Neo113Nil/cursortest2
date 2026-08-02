package defpackage;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class sl5 extends s02 {
    public final TextView j;
    public final ml5 k;
    public boolean l = true;

    public sl5(TextView textView) {
        this.j = textView;
        this.k = new ml5(textView);
    }

    @Override // defpackage.s02
    public final InputFilter[] J(InputFilter[] inputFilterArr) {
        if (!this.l) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof ml5) {
                    sparseArray.put(i, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                if (sparseArray.indexOfKey(i3) < 0) {
                    inputFilterArr2[i2] = inputFilterArr[i3];
                    i2++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i4 = 0;
        while (true) {
            ml5 ml5Var = this.k;
            if (i4 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = ml5Var;
                return inputFilterArr3;
            }
            if (inputFilterArr[i4] == ml5Var) {
                return inputFilterArr;
            }
            i4++;
        }
    }

    @Override // defpackage.s02
    public final boolean Q() {
        return this.l;
    }

    @Override // defpackage.s02
    public final void a0(boolean z) {
        if (z) {
            TextView textView = this.j;
            textView.setTransformationMethod(k0(textView.getTransformationMethod()));
        }
    }

    @Override // defpackage.s02
    public final void b0(boolean z) {
        this.l = z;
        TextView textView = this.j;
        textView.setTransformationMethod(k0(textView.getTransformationMethod()));
        textView.setFilters(J(textView.getFilters()));
    }

    @Override // defpackage.s02
    public final TransformationMethod k0(TransformationMethod transformationMethod) {
        return this.l ? transformationMethod instanceof wl5 ? transformationMethod : transformationMethod instanceof PasswordTransformationMethod ? transformationMethod : new wl5(transformationMethod) : transformationMethod instanceof wl5 ? ((wl5) transformationMethod).a : transformationMethod;
    }
}
