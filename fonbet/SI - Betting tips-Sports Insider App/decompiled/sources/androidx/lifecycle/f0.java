package androidx.lifecycle;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public x f2162a;

    /* renamed from: b, reason: collision with root package name */
    public c0 f2163b;

    public final void a(e0 e0Var, w event) {
        Intrinsics.checkNotNullParameter(event, "event");
        x a7 = event.a();
        x state1 = this.f2162a;
        Intrinsics.checkNotNullParameter(state1, "state1");
        if (a7.compareTo(state1) < 0) {
            state1 = a7;
        }
        this.f2162a = state1;
        c0 c0Var = this.f2163b;
        Intrinsics.checkNotNull(e0Var);
        c0Var.c(e0Var, event);
        this.f2162a = a7;
    }
}
