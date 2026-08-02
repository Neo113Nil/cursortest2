package oi;

import java.util.concurrent.CompletableFuture;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class j extends CompletableFuture {

    /* renamed from: a, reason: collision with root package name */
    public final a0 f21273a;

    public j(a0 a0Var) {
        this.f21273a = a0Var;
    }

    @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
    public final boolean cancel(boolean z5) {
        if (z5) {
            this.f21273a.cancel();
        }
        return super.cancel(z5);
    }
}
