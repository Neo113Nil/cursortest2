package e;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c0 implements androidx.lifecycle.c0, AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y f8399a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.y f8400b;

    public c0(y yVar, d0 d0Var, androidx.lifecycle.y yVar2) {
        this.f8399a = yVar;
        this.f8400b = yVar2;
    }

    @Override // androidx.lifecycle.c0
    public final void c(androidx.lifecycle.e0 source, androidx.lifecycle.w event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        androidx.lifecycle.w wVar = androidx.lifecycle.w.ON_START;
        y yVar = this.f8399a;
        if (event == wVar) {
            yVar.b(true);
        } else if (event == androidx.lifecycle.w.ON_STOP) {
            yVar.b(false);
        }
        if (event == androidx.lifecycle.w.ON_DESTROY) {
            yVar.a();
            this.f8400b.b(this);
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f8400b.b(this);
    }
}
