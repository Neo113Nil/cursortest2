package androidx.lifecycle;

import java.lang.reflect.Method;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f2153a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f2154b;

    public e(int i5, Method method) {
        this.f2153a = i5;
        this.f2154b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f2153a == eVar.f2153a && this.f2154b.getName().equals(eVar.f2154b.getName());
    }

    public final int hashCode() {
        return this.f2154b.getName().hashCode() + (this.f2153a * 31);
    }
}
