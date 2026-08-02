package eg;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class c extends i1 {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f9146h = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_disposer$volatile");
    private volatile /* synthetic */ Object _disposer$volatile;

    /* renamed from: e, reason: collision with root package name */
    public final l f9147e;

    /* renamed from: f, reason: collision with root package name */
    public o0 f9148f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e f9149g;

    public c(e eVar, l lVar) {
        this.f9149g = eVar;
        this.f9147e = lVar;
    }

    @Override // eg.i1
    public final boolean k() {
        return false;
    }

    @Override // eg.i1
    public final void l(Throwable th2) {
        l lVar = this.f9147e;
        if (th2 != null) {
            lVar.getClass();
            com.android.billingclient.api.a E = lVar.E(new t(th2, false), null);
            if (E != null) {
                lVar.i(E);
                d dVar = (d) f9146h.get(this);
                if (dVar != null) {
                    dVar.b();
                    return;
                }
                return;
            }
            return;
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = e.f9166b;
        e eVar = this.f9149g;
        if (atomicIntegerFieldUpdater.decrementAndGet(eVar) == 0) {
            f0[] f0VarArr = eVar.f9167a;
            ArrayList arrayList = new ArrayList(f0VarArr.length);
            for (f0 f0Var : f0VarArr) {
                arrayList.add(f0Var.n());
            }
            gf.o oVar = gf.q.f10031a;
            lVar.resumeWith(arrayList);
        }
    }
}
