package e3;

import S0.M;
import androidx.lifecycle.J;

/* renamed from: e3.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C6287d implements M {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ J f61887a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C6286c f61888b;

    public C6287d(J j11, C6286c c6286c) {
        this.f61887a = j11;
        this.f61888b = c6286c;
    }

    @Override // S0.M
    public final void dispose() {
        this.f61887a.getLifecycle().e(this.f61888b);
    }
}
