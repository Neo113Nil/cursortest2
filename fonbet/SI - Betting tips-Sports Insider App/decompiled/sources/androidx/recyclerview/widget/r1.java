package androidx.recyclerview.widget;

import android.util.SparseArray;
import java.util.Set;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class r1 {

    /* renamed from: a, reason: collision with root package name */
    public SparseArray f2536a;

    /* renamed from: b, reason: collision with root package name */
    public int f2537b;

    /* renamed from: c, reason: collision with root package name */
    public Set f2538c;

    public final q1 a(int i5) {
        SparseArray sparseArray = this.f2536a;
        q1 q1Var = (q1) sparseArray.get(i5);
        if (q1Var != null) {
            return q1Var;
        }
        q1 q1Var2 = new q1();
        sparseArray.put(i5, q1Var2);
        return q1Var2;
    }
}
