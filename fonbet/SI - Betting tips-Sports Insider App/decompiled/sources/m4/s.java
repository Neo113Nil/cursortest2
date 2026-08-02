package m4;

import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSource;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class s implements AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public final BufferedSource f20425a;

    public /* synthetic */ s(BufferedSource bufferedSource) {
        this.f20425a = bufferedSource;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f20425a.close();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s) {
            return Intrinsics.areEqual(this.f20425a, ((s) obj).f20425a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f20425a.hashCode();
    }

    public final String toString() {
        return "SourceResponseBody(source=" + this.f20425a + ')';
    }
}
