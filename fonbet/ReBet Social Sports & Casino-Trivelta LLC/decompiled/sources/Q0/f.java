package Q0;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final b f9199a;

    public static class a extends b {

        /* renamed from: a, reason: collision with root package name */
        public final TextView f9200a;

        /* renamed from: b, reason: collision with root package name */
        public final d f9201b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f9202c = true;

        public a(TextView textView) {
            this.f9200a = textView;
            this.f9201b = new d(textView);
        }

        @Override // Q0.f.b
        public InputFilter[] a(InputFilter[] inputFilterArr) {
            return !this.f9202c ? h(inputFilterArr) : f(inputFilterArr);
        }

        @Override // Q0.f.b
        public boolean b() {
            return this.f9202c;
        }

        @Override // Q0.f.b
        public void c(boolean z10) {
            if (z10) {
                l();
            }
        }

        @Override // Q0.f.b
        public void d(boolean z10) {
            this.f9202c = z10;
            l();
            k();
        }

        @Override // Q0.f.b
        public TransformationMethod e(TransformationMethod transformationMethod) {
            return this.f9202c ? m(transformationMethod) : j(transformationMethod);
        }

        public final InputFilter[] f(InputFilter[] inputFilterArr) {
            int length = inputFilterArr.length;
            for (InputFilter inputFilter : inputFilterArr) {
                if (inputFilter == this.f9201b) {
                    return inputFilterArr;
                }
            }
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length + 1];
            System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, length);
            inputFilterArr2[length] = this.f9201b;
            return inputFilterArr2;
        }

        public final SparseArray g(InputFilter[] inputFilterArr) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i10 = 0; i10 < inputFilterArr.length; i10++) {
                InputFilter inputFilter = inputFilterArr[i10];
                if (inputFilter instanceof d) {
                    sparseArray.put(i10, inputFilter);
                }
            }
            return sparseArray;
        }

        public final InputFilter[] h(InputFilter[] inputFilterArr) {
            SparseArray g10 = g(inputFilterArr);
            if (g10.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - g10.size()];
            int i10 = 0;
            for (int i11 = 0; i11 < length; i11++) {
                if (g10.indexOfKey(i11) < 0) {
                    inputFilterArr2[i10] = inputFilterArr[i11];
                    i10++;
                }
            }
            return inputFilterArr2;
        }

        public void i(boolean z10) {
            this.f9202c = z10;
        }

        public final TransformationMethod j(TransformationMethod transformationMethod) {
            return transformationMethod instanceof h ? ((h) transformationMethod).a() : transformationMethod;
        }

        public final void k() {
            this.f9200a.setFilters(a(this.f9200a.getFilters()));
        }

        public void l() {
            this.f9200a.setTransformationMethod(e(this.f9200a.getTransformationMethod()));
        }

        public final TransformationMethod m(TransformationMethod transformationMethod) {
            return transformationMethod instanceof h ? transformationMethod : transformationMethod instanceof PasswordTransformationMethod ? transformationMethod : new h(transformationMethod);
        }
    }

    public static class b {
        public abstract InputFilter[] a(InputFilter[] inputFilterArr);

        public abstract boolean b();

        public abstract void c(boolean z10);

        public abstract void d(boolean z10);

        public abstract TransformationMethod e(TransformationMethod transformationMethod);
    }

    public static class c extends b {

        /* renamed from: a, reason: collision with root package name */
        public final a f9203a;

        public c(TextView textView) {
            this.f9203a = new a(textView);
        }

        @Override // Q0.f.b
        public InputFilter[] a(InputFilter[] inputFilterArr) {
            return f() ? inputFilterArr : this.f9203a.a(inputFilterArr);
        }

        @Override // Q0.f.b
        public boolean b() {
            return this.f9203a.b();
        }

        @Override // Q0.f.b
        public void c(boolean z10) {
            if (f()) {
                return;
            }
            this.f9203a.c(z10);
        }

        @Override // Q0.f.b
        public void d(boolean z10) {
            if (f()) {
                this.f9203a.i(z10);
            } else {
                this.f9203a.d(z10);
            }
        }

        @Override // Q0.f.b
        public TransformationMethod e(TransformationMethod transformationMethod) {
            return f() ? transformationMethod : this.f9203a.e(transformationMethod);
        }

        public final boolean f() {
            return !androidx.emoji2.text.f.i();
        }
    }

    public f(TextView textView, boolean z10) {
        x0.f.h(textView, "textView cannot be null");
        if (z10) {
            this.f9199a = new a(textView);
        } else {
            this.f9199a = new c(textView);
        }
    }

    public InputFilter[] a(InputFilter[] inputFilterArr) {
        return this.f9199a.a(inputFilterArr);
    }

    public boolean b() {
        return this.f9199a.b();
    }

    public void c(boolean z10) {
        this.f9199a.c(z10);
    }

    public void d(boolean z10) {
        this.f9199a.d(z10);
    }

    public TransformationMethod e(TransformationMethod transformationMethod) {
        return this.f9199a.e(transformationMethod);
    }
}
