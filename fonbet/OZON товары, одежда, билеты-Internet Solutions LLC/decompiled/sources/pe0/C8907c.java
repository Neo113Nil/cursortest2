package pe0;

import Ae.O0;
import Ae.x0;
import De.C2862e;
import ce0.InterfaceC5817a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import we0.C10551g;
import we0.m;

/* renamed from: pe0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8907c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC5817a f80431a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final x0<Boolean> f80432b;

    public C8907c(@NotNull InterfaceC5817a cameraController, @NotNull C2862e coroutineScope) {
        Intrinsics.checkNotNullParameter(cameraController, "cameraController");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f80431a = cameraController;
        this.f80432b = O0.a(Boolean.FALSE);
    }

    private final C10551g a(m mVar) {
        if (!this.f80432b.getValue().booleanValue()) {
            return null;
        }
        C10551g currentPosition = this.f80431a.getCurrentPosition();
        return C10551g.a(currentPosition, mVar, Math.max(currentPosition.e(), 16.0f), 12);
    }

    @NotNull
    public final x0<Boolean> b() {
        return this.f80432b;
    }

    public final void c(@NotNull m newPosition, Function1<? super Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(newPosition, "newPosition");
        C10551g a11 = a(newPosition);
        if (a11 == null) {
            return;
        }
        InterfaceC5817a.C0864a.a(this.f80431a, a11, function1, 2);
    }

    public final void d(@NotNull m newPosition) {
        Intrinsics.checkNotNullParameter(newPosition, "newPosition");
        C10551g a11 = a(newPosition);
        if (a11 == null) {
            return;
        }
        this.f80431a.f(a11);
    }
}
