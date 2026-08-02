package r;

import androidx.lifecycle.W;

/* renamed from: r.g, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C9094g implements W<C9090c> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C9091d f82317a;

    C9094g(C9091d c9091d) {
        this.f82317a = c9091d;
    }

    @Override // androidx.lifecycle.W
    public final void onChanged(C9090c c9090c) {
        C9090c c9090c2 = c9090c;
        if (c9090c2 != null) {
            int a11 = c9090c2.a();
            CharSequence b11 = c9090c2.b();
            C9091d c9091d = this.f82317a;
            c9091d.z(a11, b11);
            c9091d.f82304b.G0(null);
        }
    }
}
