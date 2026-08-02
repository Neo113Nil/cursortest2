package f8;

import androidx.transition.n0;
import java.io.Serializable;
import java.util.Map;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f9506a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f9507b;

    public g(h hVar) {
        int i5 = ((q) hVar).f9531f;
        Object[] objArr = new Object[i5];
        Object[] objArr2 = new Object[i5];
        t it = hVar.entrySet().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            objArr[i10] = entry.getKey();
            objArr2[i10] = entry.getValue();
            i10++;
        }
        this.f9506a = objArr;
        this.f9507b = objArr2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object readResolve() {
        Object[] objArr = this.f9506a;
        boolean z5 = objArr instanceof j;
        Object[] objArr2 = this.f9507b;
        if (!z5) {
            n0 n0Var = new n0(objArr.length);
            for (int i5 = 0; i5 < objArr.length; i5++) {
                n0Var.f(objArr[i5], objArr2[i5]);
            }
            return n0Var.a();
        }
        j jVar = (j) objArr;
        n0 n0Var2 = new n0(jVar.size());
        t it = jVar.iterator();
        t it2 = ((a) objArr2).iterator();
        while (it.hasNext()) {
            n0Var2.f(it.next(), it2.next());
        }
        return n0Var2.a();
    }
}
