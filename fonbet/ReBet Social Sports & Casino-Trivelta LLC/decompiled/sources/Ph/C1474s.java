package Ph;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.Continuation;

/* renamed from: Ph.s, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1474s extends C {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f9130c = AtomicIntegerFieldUpdater.newUpdater(C1474s.class, "_resumed$volatile");
    private volatile /* synthetic */ int _resumed$volatile;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1474s(Continuation continuation, Throwable th2, boolean z10) {
        super(th2, z10);
        if (th2 == null) {
            th2 = new CancellationException("Continuation " + continuation + " was cancelled normally");
        }
    }

    public final boolean e() {
        return f9130c.compareAndSet(this, 0, 1);
    }
}
