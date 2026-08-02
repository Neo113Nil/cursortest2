package r;

import android.os.CancellationSignal;
import android.util.Log;
import androidx.annotation.NonNull;

/* loaded from: classes8.dex */
final class q {

    /* renamed from: a, reason: collision with root package name */
    private CancellationSignal f82374a;

    /* renamed from: b, reason: collision with root package name */
    private androidx.core.os.e f82375b;

    final class a {
    }

    private static class b {
        static void a(CancellationSignal cancellationSignal) {
            cancellationSignal.cancel();
        }

        static CancellationSignal b() {
            return new CancellationSignal();
        }
    }

    final void a() {
        CancellationSignal cancellationSignal = this.f82374a;
        if (cancellationSignal != null) {
            try {
                b.a(cancellationSignal);
            } catch (NullPointerException e11) {
                Log.e("CancelSignalProvider", "Got NPE while canceling biometric authentication.", e11);
            }
            this.f82374a = null;
        }
        androidx.core.os.e eVar = this.f82375b;
        if (eVar != null) {
            try {
                eVar.a();
            } catch (NullPointerException e12) {
                Log.e("CancelSignalProvider", "Got NPE while canceling fingerprint authentication.", e12);
            }
            this.f82375b = null;
        }
    }

    @NonNull
    final CancellationSignal b() {
        if (this.f82374a == null) {
            this.f82374a = b.b();
        }
        return this.f82374a;
    }

    @NonNull
    final androidx.core.os.e c() {
        if (this.f82375b == null) {
            this.f82375b = new androidx.core.os.e();
        }
        return this.f82375b;
    }
}
