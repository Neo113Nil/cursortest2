package k5;

import androidx.annotation.NonNull;
import java.util.concurrent.TimeUnit;

/* loaded from: classes8.dex */
public final class Q0 extends D0<Integer> {

    /* renamed from: e, reason: collision with root package name */
    private final U0 f70630e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f70631f;

    /* renamed from: g, reason: collision with root package name */
    private long f70632g;

    Q0(@NonNull U0 u02) {
        super(Mm0.e.RdpConnectionDuration);
        this.f70630e = u02;
    }

    @Override // k5.D0
    @NonNull
    protected final Integer s() throws D1 {
        if (!this.f70630e.s().equals(U0.w())) {
            this.f70631f = false;
            this.f70632g = 0L;
        } else {
            if (this.f70631f) {
                return Integer.valueOf(Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - this.f70632g)).intValue());
            }
            this.f70631f = true;
            this.f70632g = System.currentTimeMillis();
        }
        return 0;
    }
}
