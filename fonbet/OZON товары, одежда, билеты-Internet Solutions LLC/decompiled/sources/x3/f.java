package x3;

import android.util.SparseArray;
import m3.C8056I;

/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final SparseArray<C8056I> f104960a = new SparseArray<>();

    public final C8056I a(int i11) {
        SparseArray<C8056I> sparseArray = this.f104960a;
        C8056I c8056i = sparseArray.get(i11);
        if (c8056i != null) {
            return c8056i;
        }
        C8056I c8056i2 = new C8056I(9223372036854775806L);
        sparseArray.put(i11, c8056i2);
        return c8056i2;
    }

    public final void b() {
        this.f104960a.clear();
    }
}
