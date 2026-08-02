package xe;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import org.jetbrains.annotations.NotNull;

/* renamed from: xe.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10743q extends C10760z {

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f105495c = AtomicIntegerFieldUpdater.newUpdater(C10743q.class, "_resumed$volatile");
    private volatile /* synthetic */ int _resumed$volatile;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C10743q(@NotNull C10737n c10737n, Throwable th2, boolean z11) {
        super(z11, th2);
        if (th2 == null) {
            th2 = new CancellationException("Continuation " + c10737n + " was cancelled normally");
        }
        this._resumed$volatile = 0;
    }

    public final boolean c() {
        return f105495c.compareAndSet(this, 0, 1);
    }
}
