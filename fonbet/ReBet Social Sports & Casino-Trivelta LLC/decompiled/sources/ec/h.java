package ec;

import android.os.Looper;
import androidx.biometric.BiometricPrompt;
import androidx.fragment.app.AbstractActivityC2168s;
import cc.InterfaceC2910b;
import com.facebook.react.bridge.ReactApplicationContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class h extends e implements c {

    /* renamed from: l, reason: collision with root package name */
    public InterfaceC2910b.C0446b f45921l;

    /* renamed from: m, reason: collision with root package name */
    public InterfaceC2910b.c f45922m;

    /* renamed from: n, reason: collision with root package name */
    public Throwable f45923n;

    /* renamed from: o, reason: collision with root package name */
    public BiometricPrompt f45924o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f45925p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(ReactApplicationContext reactContext, InterfaceC2910b storage, BiometricPrompt.d promptInfo) {
        super(reactContext, storage, promptInfo);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(promptInfo, "promptInfo");
    }

    public static final void w(h hVar) {
        hVar.v();
    }

    public static final void x(h hVar) {
        hVar.p();
    }

    @Override // ec.e, ec.c
    public InterfaceC2910b.C0446b b() {
        return this.f45921l;
    }

    @Override // ec.e, ec.c
    public InterfaceC2910b.c d() {
        return this.f45922m;
    }

    @Override // ec.e, androidx.biometric.BiometricPrompt.a
    public void f(int i10, CharSequence errString) {
        Intrinsics.checkNotNullParameter(errString, "errString");
        if (!this.f45925p) {
            super.f(i10, errString);
            return;
        }
        this.f45924o = null;
        this.f45925p = false;
        v();
    }

    @Override // androidx.biometric.BiometricPrompt.a
    public void g() {
        l();
        if (this.f45924o != null) {
            this.f45925p = true;
            u();
        }
    }

    @Override // ec.e, ec.c
    public Throwable getError() {
        return this.f45923n;
    }

    @Override // ec.e, androidx.biometric.BiometricPrompt.a
    public void h(BiometricPrompt.b result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.f45924o = null;
        this.f45925p = false;
        super.h(result);
    }

    @Override // ec.e
    public void m(InterfaceC2910b.C0446b c0446b) {
        this.f45921l = c0446b;
    }

    @Override // ec.e
    public void n(InterfaceC2910b.c cVar) {
        this.f45922m = cVar;
    }

    @Override // ec.e
    public void o(Throwable th2) {
        this.f45923n = th2;
    }

    @Override // ec.e
    public void p() {
        AbstractActivityC2168s k10 = k();
        if (Intrinsics.areEqual(Thread.currentThread(), Looper.getMainLooper().getThread())) {
            this.f45924o = j(k10);
        } else {
            k10.runOnUiThread(new Runnable() { // from class: ec.f
                @Override // java.lang.Runnable
                public final void run() {
                    h.x(h.this);
                }
            });
            r();
        }
    }

    public final void u() {
        l();
        BiometricPrompt biometricPrompt = this.f45924o;
        if (biometricPrompt == null) {
            return;
        }
        if (biometricPrompt != null) {
            try {
                biometricPrompt.c();
            } catch (Exception e10) {
                e10.printStackTrace();
            } finally {
                this.f45924o = null;
            }
        }
    }

    public final void v() {
        l();
        AbstractActivityC2168s k10 = k();
        if (Intrinsics.areEqual(Thread.currentThread(), Looper.getMainLooper().getThread())) {
            this.f45924o = j(k10);
        } else {
            try {
                Thread.sleep(100L);
            } catch (InterruptedException unused) {
            }
            k10.runOnUiThread(new Runnable() { // from class: ec.g
                @Override // java.lang.Runnable
                public final void run() {
                    h.w(h.this);
                }
            });
        }
    }
}
