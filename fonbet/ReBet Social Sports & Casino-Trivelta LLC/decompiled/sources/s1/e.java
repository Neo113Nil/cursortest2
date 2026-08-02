package s1;

import D1.o;
import java.util.List;
import x1.C6778b;

/* loaded from: classes.dex */
public final class e implements l {

    /* renamed from: a, reason: collision with root package name */
    public final l f64462a;

    /* renamed from: b, reason: collision with root package name */
    public final List f64463b;

    public e(l lVar, List list) {
        this.f64462a = lVar;
        this.f64463b = list;
    }

    @Override // s1.l
    public o.a a(i iVar, f fVar) {
        return new C6778b(this.f64462a.a(iVar, fVar), this.f64463b);
    }

    @Override // s1.l
    public o.a b() {
        return new C6778b(this.f64462a.b(), this.f64463b);
    }
}
