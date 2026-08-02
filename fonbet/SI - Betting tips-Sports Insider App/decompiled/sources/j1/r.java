package j1;

import android.util.SparseArray;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f18230a;

    /* renamed from: b, reason: collision with root package name */
    public u f18231b;

    public r(int i5) {
        this.f18230a = new SparseArray(i5);
    }

    public final void a(u uVar, int i5, int i10) {
        int a7 = uVar.a(i5);
        SparseArray sparseArray = this.f18230a;
        r rVar = sparseArray == null ? null : (r) sparseArray.get(a7);
        if (rVar == null) {
            rVar = new r(1);
            sparseArray.put(uVar.a(i5), rVar);
        }
        if (i10 > i5) {
            rVar.a(uVar, i5 + 1, i10);
        } else {
            rVar.f18231b = uVar;
        }
    }
}
