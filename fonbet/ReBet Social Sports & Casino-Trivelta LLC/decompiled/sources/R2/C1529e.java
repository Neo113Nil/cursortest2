package R2;

import android.os.Handler;
import android.os.Looper;

/* renamed from: R2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1529e implements Q2.F {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f10029a = u0.h.a(Looper.getMainLooper());

    @Override // Q2.F
    public void a(Runnable runnable) {
        this.f10029a.removeCallbacks(runnable);
    }

    @Override // Q2.F
    public void b(long j10, Runnable runnable) {
        this.f10029a.postDelayed(runnable, j10);
    }
}
