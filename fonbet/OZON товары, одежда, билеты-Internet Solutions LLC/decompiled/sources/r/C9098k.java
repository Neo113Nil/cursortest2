package r;

import androidx.lifecycle.W;

/* renamed from: r.k, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C9098k implements W<Boolean> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C9091d f82321a;

    C9098k(C9091d c9091d) {
        this.f82321a = c9091d;
    }

    @Override // androidx.lifecycle.W
    public final void onChanged(Boolean bool) {
        if (bool.booleanValue()) {
            C9091d c9091d = this.f82321a;
            c9091d.u(1);
            c9091d.dismiss();
            c9091d.f82304b.R0(false);
        }
    }
}
