package oi;

import java.lang.reflect.Array;
import java.util.Iterator;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class b0 extends z0 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f21242c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z0 f21243d;

    public /* synthetic */ b0(z0 z0Var, int i5) {
        this.f21242c = i5;
        this.f21243d = z0Var;
    }

    @Override // oi.z0
    public final void a(p0 p0Var, Object obj) {
        switch (this.f21242c) {
            case 0:
                Iterable iterable = (Iterable) obj;
                if (iterable != null) {
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        this.f21243d.a(p0Var, it.next());
                    }
                    break;
                }
                break;
            default:
                if (obj != null) {
                    int length = Array.getLength(obj);
                    for (int i5 = 0; i5 < length; i5++) {
                        this.f21243d.a(p0Var, Array.get(obj, i5));
                    }
                    break;
                }
                break;
        }
    }
}
