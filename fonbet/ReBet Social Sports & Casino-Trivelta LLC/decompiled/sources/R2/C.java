package R2;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class C implements A {

    /* renamed from: b, reason: collision with root package name */
    public final A f9928b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f9929c;

    public C(A delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f9928b = delegate;
        this.f9929c = new Object();
    }

    @Override // R2.A
    public boolean a(X2.h id2) {
        boolean a10;
        Intrinsics.checkNotNullParameter(id2, "id");
        synchronized (this.f9929c) {
            a10 = this.f9928b.a(id2);
        }
        return a10;
    }

    @Override // R2.A
    public C1549z b(X2.h id2) {
        C1549z b10;
        Intrinsics.checkNotNullParameter(id2, "id");
        synchronized (this.f9929c) {
            b10 = this.f9928b.b(id2);
        }
        return b10;
    }

    @Override // R2.A
    public C1549z e(X2.h id2) {
        C1549z e10;
        Intrinsics.checkNotNullParameter(id2, "id");
        synchronized (this.f9929c) {
            e10 = this.f9928b.e(id2);
        }
        return e10;
    }

    @Override // R2.A
    public List remove(String workSpecId) {
        List remove;
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        synchronized (this.f9929c) {
            remove = this.f9928b.remove(workSpecId);
        }
        return remove;
    }
}
