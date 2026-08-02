package u0;

import android.view.View;

/* loaded from: classes8.dex */
public final class K implements S0.M {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ M f99610a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ View f99611b;

    public K(M m11, View view) {
        this.f99610a = m11;
        this.f99611b = view;
    }

    @Override // S0.M
    public final void dispose() {
        this.f99610a.b(this.f99611b);
    }
}
