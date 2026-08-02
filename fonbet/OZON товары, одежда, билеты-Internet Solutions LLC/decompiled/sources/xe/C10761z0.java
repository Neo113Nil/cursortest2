package xe;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* renamed from: xe.z0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C10761z0 extends G0 {

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f105511f = AtomicIntegerFieldUpdater.newUpdater(C10761z0.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile = 0;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Function1<Throwable, Unit> f105512e;

    /* JADX WARN: Multi-variable type inference failed */
    public C10761z0(@NotNull Function1<? super Throwable, Unit> function1) {
        this.f105512e = function1;
    }

    @Override // xe.G0
    public final boolean n() {
        return true;
    }

    @Override // xe.G0
    public final void o(Throwable th2) {
        if (f105511f.compareAndSet(this, 0, 1)) {
            this.f105512e.invoke(th2);
        }
    }
}
