package gc0;

import Sc.InterfaceC4008j;
import Vb0.b;
import android.app.Application;
import android.app.KeyguardManager;
import android.os.Build;
import hc0.C6910a;
import java.security.KeyStoreException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r.n;

/* renamed from: gc0.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C6708a implements Fb0.a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Application f64222a;

    /* renamed from: b, reason: collision with root package name */
    private final KeyguardManager f64223b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final n f64224c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f64225d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f64226e;

    public C6708a(@NotNull Application application, KeyguardManager keyguardManager, @NotNull n biometricManager, @NotNull InterfaceC4008j<C6910a> authBiometryRepository, @NotNull InterfaceC4008j<vc0.d> keyStore) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(biometricManager, "biometricManager");
        Intrinsics.checkNotNullParameter(authBiometryRepository, "authBiometryRepository");
        Intrinsics.checkNotNullParameter(keyStore, "keyStore");
        this.f64222a = application;
        this.f64223b = keyguardManager;
        this.f64224c = biometricManager;
        this.f64225d = authBiometryRepository;
        this.f64226e = keyStore;
    }

    @Override // Fb0.a
    public final Object a(boolean z11, @NotNull String str, @NotNull j jVar) {
        InterfaceC4008j interfaceC4008j = this.f64225d;
        if (!z11) {
            Object i11 = ((C6910a) interfaceC4008j.getValue()).i(str, jVar);
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            if (i11 != aVar) {
                i11 = Unit.f71690a;
            }
            return i11 == aVar ? i11 : Unit.f71690a;
        }
        String f7 = ((vc0.d) this.f64226e.getValue()).f();
        if (f7 == null) {
            KeyStoreException keyStoreException = new KeyStoreException("Error getting public key");
            b.a.f(Vb0.b.f28514a, "Error getting public key", keyStoreException);
            throw keyStoreException;
        }
        Object h11 = ((C6910a) interfaceC4008j.getValue()).h(f7, str, jVar);
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        if (h11 != aVar2) {
            h11 = Unit.f71690a;
        }
        return h11 == aVar2 ? h11 : Unit.f71690a;
    }

    @Override // Fb0.a
    public final boolean available() {
        KeyguardManager keyguardManager;
        return androidx.core.content.a.checkSelfPermission(this.f64222a, Build.VERSION.SDK_INT >= 28 ? "android.permission.USE_BIOMETRIC" : "android.permission.USE_FINGERPRINT") == 0 && this.f64224c.a(15) == 0 && ((vc0.d) this.f64226e.getValue()).h() && (keyguardManager = this.f64223b) != null && keyguardManager.isKeyguardSecure();
    }

    @Override // Fb0.a
    @NotNull
    public final String getDeviceId() {
        return ((C6910a) this.f64225d.getValue()).f();
    }
}
