package ai;

import ci.d;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final ei.a f191a;

    /* renamed from: b, reason: collision with root package name */
    public final d f192b;

    public c(ei.a module, d factory) {
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(factory, "factory");
        this.f191a = module;
        this.f192b = factory;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.areEqual(this.f191a, cVar.f191a) && Intrinsics.areEqual(this.f192b, cVar.f192b);
    }

    public final int hashCode() {
        return this.f192b.hashCode() + (this.f191a.f9258a.hashCode() * 31);
    }

    public final String toString() {
        return "KoinDefinition(module=" + this.f191a + ", factory=" + this.f192b + ')';
    }
}
