package f8;

import java.io.Serializable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f9498a;

    public c(Object[] objArr) {
        this.f9498a = objArr;
    }

    public Object readResolve() {
        b bVar = e.f9502b;
        Object[] objArr = this.f9498a;
        if (objArr.length == 0) {
            return l.f9516e;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        u6.h.f(objArr2.length, objArr2);
        return e.f(objArr2.length, objArr2);
    }
}
