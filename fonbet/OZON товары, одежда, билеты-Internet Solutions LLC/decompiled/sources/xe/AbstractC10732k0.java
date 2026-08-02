package xe;

import kotlin.collections.C7704k;
import org.jetbrains.annotations.NotNull;

/* renamed from: xe.k0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10732k0 extends I {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f105471e = 0;

    /* renamed from: b, reason: collision with root package name */
    private long f105472b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f105473c;

    /* renamed from: d, reason: collision with root package name */
    private C7704k<AbstractC10714b0<?>> f105474d;

    protected long D0() {
        C7704k<AbstractC10714b0<?>> c7704k = this.f105474d;
        return (c7704k == null || c7704k.isEmpty()) ? Long.MAX_VALUE : 0L;
    }

    public final void E0(boolean z11) {
        this.f105472b += z11 ? 4294967296L : 1L;
        if (z11) {
            return;
        }
        this.f105473c = true;
    }

    public final boolean H0() {
        return this.f105472b >= 4294967296L;
    }

    public final boolean K0() {
        C7704k<AbstractC10714b0<?>> c7704k = this.f105474d;
        if (c7704k != null) {
            return c7704k.isEmpty();
        }
        return true;
    }

    public long L0() {
        return !M0() ? Long.MAX_VALUE : 0L;
    }

    public final boolean M0() {
        AbstractC10714b0<?> A11;
        C7704k<AbstractC10714b0<?>> c7704k = this.f105474d;
        if (c7704k == null || (A11 = c7704k.A()) == null) {
            return false;
        }
        A11.run();
        return true;
    }

    public void shutdown() {
    }

    public final void x(boolean z11) {
        long j11 = this.f105472b - (z11 ? 4294967296L : 1L);
        this.f105472b = j11;
        if (j11 <= 0 && this.f105473c) {
            shutdown();
        }
    }

    public final void z(@NotNull AbstractC10714b0<?> abstractC10714b0) {
        C7704k<AbstractC10714b0<?>> c7704k = this.f105474d;
        if (c7704k == null) {
            c7704k = new C7704k<>();
            this.f105474d = c7704k;
        }
        c7704k.addLast(abstractC10714b0);
    }
}
