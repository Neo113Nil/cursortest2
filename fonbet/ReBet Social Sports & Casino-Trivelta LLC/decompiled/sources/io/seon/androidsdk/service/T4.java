package io.seon.androidsdk.service;

import android.app.KeyguardManager;
import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class T4 extends AbstractC4950j {

    /* renamed from: f, reason: collision with root package name */
    public static final String[] f53155f = {"biometric_status", "is_keyguard_secure"};

    /* renamed from: e, reason: collision with root package name */
    public Context f53156e;

    @Override // io.seon.androidsdk.service.InterfaceC4966l
    public final void a(C4878a c4878a) {
        this.f53156e = c4878a.a();
        this.f53368b = c4878a;
    }

    @Override // io.seon.androidsdk.service.InterfaceC4966l
    public final Map b() {
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
    
        if (r1.hasEnrolledFingerprints() != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String f() {
        int canAuthenticate;
        try {
            SecurityProbe$BiometricSensorStatus securityProbe$BiometricSensorStatus = SecurityProbe$BiometricSensorStatus.HARDWARE_UNAVAILABLE;
            if (Build.VERSION.SDK_INT < 30) {
                FingerprintManager fingerprintManager = (FingerprintManager) this.f53156e.getSystemService("fingerprint");
                if (fingerprintManager.isHardwareDetected()) {
                    securityProbe$BiometricSensorStatus = SecurityProbe$BiometricSensorStatus.NOT_ENROLLED;
                }
                return securityProbe$BiometricSensorStatus.name();
            }
            canAuthenticate = P4.a(this.f53156e.getSystemService("biometric")).canAuthenticate(255);
            if (canAuthenticate != 0) {
                if (canAuthenticate == 15) {
                    securityProbe$BiometricSensorStatus = SecurityProbe$BiometricSensorStatus.REQUIRES_SECURITY_UPDATE;
                } else if (canAuthenticate == 11) {
                    securityProbe$BiometricSensorStatus = SecurityProbe$BiometricSensorStatus.NOT_ENROLLED;
                } else if (canAuthenticate == 12) {
                    securityProbe$BiometricSensorStatus = SecurityProbe$BiometricSensorStatus.NO_HARDWARE;
                }
                return securityProbe$BiometricSensorStatus.name();
            }
            securityProbe$BiometricSensorStatus = SecurityProbe$BiometricSensorStatus.AVAILABLE;
            return securityProbe$BiometricSensorStatus.name();
        } catch (Exception unused) {
            return null;
        }
    }

    public final Boolean g() {
        return Boolean.valueOf(((KeyguardManager) this.f53156e.getSystemService("keyguard")).isKeyguardSecure());
    }

    @Override // io.seon.androidsdk.service.InterfaceC4966l
    public final Map a() {
        HashMap hashMap = new HashMap();
        hashMap.put("biometric_status", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.R4
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return T4.this.f();
            }
        }));
        hashMap.put("is_keyguard_secure", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.S4
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return T4.this.g();
            }
        }));
        return hashMap;
    }
}
