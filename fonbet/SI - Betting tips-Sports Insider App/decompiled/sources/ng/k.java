package ng;

import java.util.concurrent.atomic.AtomicReferenceArray;
import jg.u;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class k extends u {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f20911e;

    public k(long j, k kVar, int i5) {
        super(j, kVar, i5);
        this.f20911e = new AtomicReferenceArray(j.f20910f);
    }

    @Override // jg.u
    public final int g() {
        return j.f20910f;
    }

    @Override // jg.u
    public final void h(int i5, CoroutineContext coroutineContext) {
        this.f20911e.set(i5, j.f20909e);
        i();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f18527c + ", hashCode=" + hashCode() + ']';
    }
}
