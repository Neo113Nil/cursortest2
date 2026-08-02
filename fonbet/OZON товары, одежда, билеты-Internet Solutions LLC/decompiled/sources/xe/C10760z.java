package xe;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import org.jetbrains.annotations.NotNull;

/* renamed from: xe.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C10760z {

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f105509b = AtomicIntegerFieldUpdater.newUpdater(C10760z.class, "_handled$volatile");
    private volatile /* synthetic */ int _handled$volatile;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final Throwable f105510a;

    public C10760z(boolean z11, @NotNull Throwable th2) {
        this.f105510a = th2;
        this._handled$volatile = z11 ? 1 : 0;
    }

    public final boolean a() {
        return f105509b.get(this) != 0;
    }

    public final boolean b() {
        return f105509b.compareAndSet(this, 0, 1);
    }

    @NotNull
    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f105510a + ']';
    }
}
