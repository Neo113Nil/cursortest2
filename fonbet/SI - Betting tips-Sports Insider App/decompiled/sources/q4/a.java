package q4;

import c4.t;
import eg.e1;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a implements o {

    /* renamed from: a, reason: collision with root package name */
    public final e1 f21929a;

    public /* synthetic */ a(e1 e1Var) {
        this.f21929a = e1Var;
    }

    @Override // q4.o
    public final Object d(t tVar) {
        return Unit.f19194a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return Intrinsics.areEqual(this.f21929a, ((a) obj).f21929a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f21929a.hashCode();
    }

    public final String toString() {
        return "BaseRequestDelegate(job=" + this.f21929a + ')';
    }

    @Override // q4.o
    public final /* synthetic */ void a() {
    }

    @Override // q4.o
    public final /* synthetic */ void b() {
    }

    @Override // q4.o
    public final /* synthetic */ void start() {
    }
}
