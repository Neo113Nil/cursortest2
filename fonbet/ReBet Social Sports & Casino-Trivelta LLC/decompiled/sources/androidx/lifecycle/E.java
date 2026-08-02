package androidx.lifecycle;

import Ph.C1452g0;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class E extends Ph.L {

    /* renamed from: b, reason: collision with root package name */
    public final C2181f f20250b = new C2181f();

    @Override // Ph.L
    public void Y1(CoroutineContext context, Runnable block) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        this.f20250b.c(context, block);
    }

    @Override // Ph.L
    public boolean a2(CoroutineContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (C1452g0.c().e2().a2(context)) {
            return true;
        }
        return !this.f20250b.b();
    }
}
