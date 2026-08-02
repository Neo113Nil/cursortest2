package xe;

import Sc.InterfaceC3999a;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import xe.B0;

/* loaded from: classes.dex */
public final class N0 extends kotlin.coroutines.a implements B0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final N0 f105411a = new N0(B0.a.f105375a);

    @Override // xe.B0
    @InterfaceC3999a
    @NotNull
    public final InterfaceC10746s Q(@NotNull H0 h02) {
        return O0.f105413a;
    }

    @Override // xe.B0
    @InterfaceC3999a
    @NotNull
    public final InterfaceC10724g0 X(boolean z11, boolean z12, @NotNull Function1<? super Throwable, Unit> function1) {
        return O0.f105413a;
    }

    @Override // xe.B0
    @InterfaceC3999a
    @NotNull
    public final CancellationException Z() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // xe.B0
    @NotNull
    public final Sequence<B0> d() {
        return kotlin.sequences.l.g();
    }

    @Override // xe.B0
    public final boolean isActive() {
        return true;
    }

    @Override // xe.B0
    public final boolean isCancelled() {
        return false;
    }

    @Override // xe.B0
    @InterfaceC3999a
    public final void j(CancellationException cancellationException) {
    }

    @Override // xe.B0
    public final boolean l0() {
        return false;
    }

    @Override // xe.B0
    @InterfaceC3999a
    public final Object r0(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // xe.B0
    @InterfaceC3999a
    public final boolean start() {
        return false;
    }

    @NotNull
    public final String toString() {
        return "NonCancellable";
    }

    @Override // xe.B0
    @InterfaceC3999a
    @NotNull
    public final InterfaceC10724g0 y(@NotNull Function1<? super Throwable, Unit> function1) {
        return O0.f105413a;
    }
}
