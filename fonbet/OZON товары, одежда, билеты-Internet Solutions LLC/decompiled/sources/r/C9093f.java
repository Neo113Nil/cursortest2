package r;

import androidx.lifecycle.W;
import r.o;

/* renamed from: r.f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C9093f implements W<o.b> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C9091d f82316a;

    C9093f(C9091d c9091d) {
        this.f82316a = c9091d;
    }

    @Override // androidx.lifecycle.W
    public final void onChanged(o.b bVar) {
        o.b bVar2 = bVar;
        if (bVar2 != null) {
            C9091d c9091d = this.f82316a;
            c9091d.C(bVar2);
            c9091d.f82304b.J0(null);
        }
    }
}
