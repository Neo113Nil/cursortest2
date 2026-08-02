package f8;

import java.io.Serializable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f9511a;

    public i(Object[] objArr) {
        this.f9511a = objArr;
    }

    public Object readResolve() {
        Object[] objArr = this.f9511a;
        int length = objArr.length;
        return length != 0 ? length != 1 ? j.h(objArr.length, (Object[]) objArr.clone()) : new s(objArr[0]) : r.j;
    }
}
