package androidx.recyclerview.widget;

import android.util.SparseArray;
import android.util.SparseIntArray;
import androidx.annotation.NonNull;
import xsna.ji;
import xsna.lhg;

/* compiled from: ViewTypeStorage.java */
/* loaded from: classes12.dex */
public interface u0 {

    /* compiled from: ViewTypeStorage.java */
    public static class a implements u0 {
        public SparseArray<a0> a;
        public int b;

        /* compiled from: ViewTypeStorage.java */
        /* renamed from: androidx.recyclerview.widget.u0$a$a, reason: collision with other inner class name */
        public class C0083a implements b {
            public final SparseIntArray a = new SparseIntArray(1);
            public final SparseIntArray b = new SparseIntArray(1);
            public final a0 c;

            public C0083a(a0 a0Var) {
                this.c = a0Var;
            }

            @Override // androidx.recyclerview.widget.u0.b
            public final int a(int i) {
                SparseIntArray sparseIntArray = this.a;
                int indexOfKey = sparseIntArray.indexOfKey(i);
                if (indexOfKey > -1) {
                    return sparseIntArray.valueAt(indexOfKey);
                }
                a aVar = a.this;
                int i2 = aVar.b;
                aVar.b = i2 + 1;
                aVar.a.put(i2, this.c);
                sparseIntArray.put(i, i2);
                this.b.put(i2, i);
                return i2;
            }

            @Override // androidx.recyclerview.widget.u0.b
            public final int b(int i) {
                SparseIntArray sparseIntArray = this.b;
                int indexOfKey = sparseIntArray.indexOfKey(i);
                if (indexOfKey >= 0) {
                    return sparseIntArray.valueAt(indexOfKey);
                }
                StringBuilder b = ji.b(i, "requested global type ", " does not belong to the adapter:");
                b.append(this.c.c);
                throw new IllegalStateException(b.toString());
            }
        }

        @Override // androidx.recyclerview.widget.u0
        @NonNull
        public final a0 a(int i) {
            a0 a0Var = this.a.get(i);
            if (a0Var != null) {
                return a0Var;
            }
            throw new IllegalArgumentException(lhg.a(i, "Cannot find the wrapper for global view type "));
        }

        @Override // androidx.recyclerview.widget.u0
        @NonNull
        public final b b(@NonNull a0 a0Var) {
            return new C0083a(a0Var);
        }
    }

    /* compiled from: ViewTypeStorage.java */
    public interface b {
        int a(int i);

        int b(int i);
    }

    @NonNull
    a0 a(int i);

    @NonNull
    b b(@NonNull a0 a0Var);
}
