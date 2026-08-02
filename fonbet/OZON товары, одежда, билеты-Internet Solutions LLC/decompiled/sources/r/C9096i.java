package r;

import androidx.lifecycle.W;

/* renamed from: r.i, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C9096i implements W<Boolean> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C9091d f82319a;

    C9096i(C9091d c9091d) {
        this.f82319a = c9091d;
    }

    @Override // androidx.lifecycle.W
    public final void onChanged(Boolean bool) {
        if (bool.booleanValue()) {
            C9091d c9091d = this.f82319a;
            c9091d.A();
            c9091d.f82304b.H0(false);
        }
    }
}
