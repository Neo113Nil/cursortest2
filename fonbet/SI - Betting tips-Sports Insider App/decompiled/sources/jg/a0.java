package jg;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class a0 implements kotlin.coroutines.f {

    /* renamed from: a, reason: collision with root package name */
    public final ThreadLocal f18484a;

    public a0(ThreadLocal threadLocal) {
        this.f18484a = threadLocal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a0) && Intrinsics.areEqual(this.f18484a, ((a0) obj).f18484a);
    }

    public final int hashCode() {
        return this.f18484a.hashCode();
    }

    public final String toString() {
        return "ThreadLocalKey(threadLocal=" + this.f18484a + ')';
    }
}
