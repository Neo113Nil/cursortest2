package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class i4h extends z0h {
    public final /* synthetic */ AtomicReferenceArray g;

    public i4h(long j, i4h i4hVar, int i) {
        super(j, i4hVar, i);
        this.g = new AtomicReferenceArray(h4h.f);
    }

    @Override // defpackage.z0h
    public final int g() {
        return h4h.f;
    }

    @Override // defpackage.z0h
    public final void h(int i, CoroutineContext coroutineContext) {
        this.g.set(i, h4h.e);
        i();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.d + ", hashCode=" + hashCode() + ']';
    }
}
