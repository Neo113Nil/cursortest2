package p;

import java.util.HashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a extends f {

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f21383e = new HashMap();

    @Override // p.f
    public final c a(Object obj) {
        return (c) this.f21383e.get(obj);
    }

    @Override // p.f
    public final Object b(Object obj) {
        Object b10 = super.b(obj);
        this.f21383e.remove(obj);
        return b10;
    }
}
