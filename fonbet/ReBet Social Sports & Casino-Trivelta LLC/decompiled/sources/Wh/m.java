package Wh;

import Sh.D;
import Sh.G;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes5.dex */
public final class m extends D {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f13312e;

    public m(long j10, m mVar, int i10) {
        super(j10, mVar, i10);
        int i11;
        i11 = l.f13311f;
        this.f13312e = new AtomicReferenceArray(i11);
    }

    @Override // Sh.D
    public int r() {
        int i10;
        i10 = l.f13311f;
        return i10;
    }

    @Override // Sh.D
    public void s(int i10, Throwable th2, CoroutineContext coroutineContext) {
        G g10;
        g10 = l.f13310e;
        v().set(i10, g10);
        t();
    }

    public String toString() {
        return "SemaphoreSegment[id=" + this.f10763c + ", hashCode=" + hashCode() + ']';
    }

    public final /* synthetic */ AtomicReferenceArray v() {
        return this.f13312e;
    }
}
