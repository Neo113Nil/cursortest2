package r1;

import android.util.SparseArray;
import e1.Q;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f63915a = new SparseArray();

    public Q a(int i10) {
        Q q10 = (Q) this.f63915a.get(i10);
        if (q10 != null) {
            return q10;
        }
        Q q11 = new Q(9223372036854775806L);
        this.f63915a.put(i10, q11);
        return q11;
    }

    public void b() {
        this.f63915a.clear();
    }
}
