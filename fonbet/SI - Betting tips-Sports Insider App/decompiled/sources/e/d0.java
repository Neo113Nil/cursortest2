package e;

import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.g0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f8403a;

    /* renamed from: b, reason: collision with root package name */
    public final d2.c f8404b;

    /* renamed from: c, reason: collision with root package name */
    public final b0 f8405c;

    public d0(Runnable runnable) {
        this.f8403a = runnable;
        d2.c cVar = new d2.c(new androidx.credentials.playservices.controllers.CreateRestoreCredential.a(17, this));
        this.f8404b = cVar;
        b0 b0Var = new b0();
        this.f8405c = b0Var;
        cVar.b(b0Var);
    }

    public final void a(androidx.lifecycle.e0 owner, z onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        androidx.lifecycle.y lifecycle = owner.getLifecycle();
        if (((g0) lifecycle).f2169d == androidx.lifecycle.x.f2253a) {
            return;
        }
        a0 info = new a0(owner, onBackPressedCallback);
        Intrinsics.checkNotNullParameter(info, "info");
        y yVar = new y(onBackPressedCallback, info);
        onBackPressedCallback.f8454a.add(yVar);
        yVar.b(false);
        d2.c.a(this.f8404b, yVar);
        c0 closeable = new c0(yVar, this, lifecycle);
        lifecycle.a(closeable);
        Intrinsics.checkNotNullParameter(closeable, "closeable");
        onBackPressedCallback.f8456c.add(closeable);
    }

    public final void b(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        Intrinsics.checkNotNullParameter(onBackInvokedDispatcher, "invoker");
        Intrinsics.checkNotNullParameter(onBackInvokedDispatcher, "onBackInvokedDispatcher");
        d2.j jVar = new d2.j(onBackInvokedDispatcher, 0);
        d2.c cVar = this.f8404b;
        cVar.c(jVar, 1);
        Intrinsics.checkNotNullParameter(onBackInvokedDispatcher, "onBackInvokedDispatcher");
        cVar.c(new d2.j(onBackInvokedDispatcher, 1000000), 0);
    }
}
