package androidx.biometric;

import android.os.CancellationSignal;
import android.util.Log;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final c f17487a = new a();

    /* renamed from: b, reason: collision with root package name */
    public CancellationSignal f17488b;

    /* renamed from: c, reason: collision with root package name */
    public u0.d f17489c;

    public class a implements c {
        public a() {
        }

        @Override // androidx.biometric.f.c
        public u0.d a() {
            return new u0.d();
        }

        @Override // androidx.biometric.f.c
        public CancellationSignal b() {
            return b.b();
        }
    }

    public static class b {
        public static void a(CancellationSignal cancellationSignal) {
            cancellationSignal.cancel();
        }

        public static CancellationSignal b() {
            return new CancellationSignal();
        }
    }

    public interface c {
        u0.d a();

        CancellationSignal b();
    }

    public void a() {
        CancellationSignal cancellationSignal = this.f17488b;
        if (cancellationSignal != null) {
            try {
                b.a(cancellationSignal);
            } catch (NullPointerException e10) {
                Log.e("CancelSignalProvider", "Got NPE while canceling biometric authentication.", e10);
            }
            this.f17488b = null;
        }
        u0.d dVar = this.f17489c;
        if (dVar != null) {
            try {
                dVar.a();
            } catch (NullPointerException e11) {
                Log.e("CancelSignalProvider", "Got NPE while canceling fingerprint authentication.", e11);
            }
            this.f17489c = null;
        }
    }

    public CancellationSignal b() {
        if (this.f17488b == null) {
            this.f17488b = this.f17487a.b();
        }
        return this.f17488b;
    }

    public u0.d c() {
        if (this.f17489c == null) {
            this.f17489c = this.f17487a.a();
        }
        return this.f17489c;
    }
}
