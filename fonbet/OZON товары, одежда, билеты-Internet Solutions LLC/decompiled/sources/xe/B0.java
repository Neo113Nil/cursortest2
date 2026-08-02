package xe;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public interface B0 extends CoroutineContext.Element {

    /* renamed from: o0, reason: collision with root package name */
    @NotNull
    public static final a f105374o0 = a.f105375a;

    public static final class a implements CoroutineContext.a<B0> {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f105375a = new a();
    }

    @NotNull
    InterfaceC10746s Q(@NotNull H0 h02);

    @NotNull
    InterfaceC10724g0 X(boolean z11, boolean z12, @NotNull Function1<? super Throwable, Unit> function1);

    @NotNull
    CancellationException Z();

    @NotNull
    Sequence<B0> d();

    boolean isActive();

    boolean isCancelled();

    void j(CancellationException cancellationException);

    boolean l0();

    Object r0(@NotNull kotlin.coroutines.d<? super Unit> dVar);

    boolean start();

    @NotNull
    InterfaceC10724g0 y(@NotNull Function1<? super Throwable, Unit> function1);
}
