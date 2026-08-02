package androidx.fragment.app;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a0 extends g.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f1864a;

    public a0(AtomicReference atomicReference) {
        this.f1864a = atomicReference;
    }

    @Override // g.b
    public final void a(Object obj) {
        g.b bVar = (g.b) this.f1864a.get();
        if (bVar == null) {
            throw new IllegalStateException("Operation cannot be started before fragment is in created state");
        }
        bVar.a(obj);
    }
}
