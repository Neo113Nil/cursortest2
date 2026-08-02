package qg;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class b implements g {

    /* renamed from: a, reason: collision with root package name */
    public final h f22152a;

    /* renamed from: b, reason: collision with root package name */
    public final ag.c f22153b;

    /* renamed from: c, reason: collision with root package name */
    public final String f22154c;

    public b(h original, ag.c kClass) {
        Intrinsics.checkNotNullParameter(original, "original");
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        this.f22152a = original;
        this.f22153b = kClass;
        this.f22154c = original.f22165a + '<' + kClass.getSimpleName() + '>';
    }

    @Override // qg.g
    public final String a() {
        return this.f22154c;
    }

    @Override // qg.g
    public final boolean c() {
        return false;
    }

    @Override // qg.g
    public final int d(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f22152a.d(name);
    }

    @Override // qg.g
    public final a.a e() {
        return this.f22152a.f22166b;
    }

    public final boolean equals(Object obj) {
        b bVar = obj instanceof b ? (b) obj : null;
        return bVar != null && Intrinsics.areEqual(this.f22152a, bVar.f22152a) && Intrinsics.areEqual(bVar.f22153b, this.f22153b);
    }

    @Override // qg.g
    public final int f() {
        return this.f22152a.f22167c;
    }

    @Override // qg.g
    public final String g(int i5) {
        return this.f22152a.f22170f[i5];
    }

    @Override // qg.g
    public final List getAnnotations() {
        return this.f22152a.f22168d;
    }

    @Override // qg.g
    public final List h(int i5) {
        return this.f22152a.f22172h[i5];
    }

    public final int hashCode() {
        return this.f22154c.hashCode() + (this.f22153b.hashCode() * 31);
    }

    @Override // qg.g
    public final g i(int i5) {
        return this.f22152a.f22171g[i5];
    }

    @Override // qg.g
    public final boolean isInline() {
        return false;
    }

    @Override // qg.g
    public final boolean j(int i5) {
        return this.f22152a.f22173i[i5];
    }

    public final String toString() {
        return "ContextDescriptor(kClass: " + this.f22153b + ", original: " + this.f22152a + ')';
    }
}
