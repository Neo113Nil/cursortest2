package jg;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f18488a = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_next$volatile");

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f18489b = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public c(u uVar) {
        this._prev$volatile = uVar;
    }

    public final void b() {
        f18489b.set(this, null);
    }

    public final c c() {
        Object obj = f18488a.get(this);
        if (obj == b.f18485a) {
            return null;
        }
        return (c) obj;
    }

    public abstract boolean d();

    public final void e() {
        c c2;
        if (c() == null) {
            return;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f18489b;
            c cVar = (c) atomicReferenceFieldUpdater.get(this);
            while (cVar != null && cVar.d()) {
                cVar = (c) atomicReferenceFieldUpdater.get(cVar);
            }
            c c8 = c();
            Intrinsics.checkNotNull(c8);
            while (c8.d() && (c2 = c8.c()) != null) {
                c8 = c2;
            }
            while (true) {
                Object obj = atomicReferenceFieldUpdater.get(c8);
                c cVar2 = ((c) obj) == null ? null : cVar;
                while (!atomicReferenceFieldUpdater.compareAndSet(c8, obj, cVar2)) {
                    if (atomicReferenceFieldUpdater.get(c8) != obj) {
                        break;
                    }
                }
            }
            if (cVar != null) {
                f18488a.set(cVar, c8);
            }
            if (!c8.d() || c8.c() == null) {
                if (cVar == null || !cVar.d()) {
                    return;
                }
            }
        }
    }
}
