package xe;

import kotlin.time.b;
import org.jetbrains.annotations.NotNull;
import ve.EnumC10311b;

/* loaded from: classes.dex */
final class e1<U, T extends U> extends De.w<T> implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public final long f105454e;

    public e1(long j11, @NotNull kotlin.coroutines.d<? super U> dVar) {
        super(dVar, dVar.getContext());
        this.f105454e = j11;
    }

    @Override // xe.H0
    @NotNull
    public final String g0() {
        return super.g0() + "(timeMillis=" + this.f105454e + ')';
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001f, code lost:
    
        if (r0 == null) goto L10;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        String b11;
        W d11 = Y.d(getContext());
        Z z11 = d11 instanceof Z ? (Z) d11 : null;
        long j11 = this.f105454e;
        if (z11 != null) {
            b.Companion companion = kotlin.time.b.INSTANCE;
            kotlin.time.c.h(j11, EnumC10311b.MILLISECONDS);
            b11 = z11.c();
        }
        b11 = Sh.b.b(j11, "Timed out waiting for ", " ms");
        x(new d1(b11, this));
    }
}
