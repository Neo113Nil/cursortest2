package com.appsflyer.internal;

import B90.W;
import android.content.Context;
import android.content.pm.PackageManager;
import android.media.AudioTrack;
import android.os.Build;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFb1aSDK implements AFb1bSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int afInfoLog = 0;

    /* renamed from: e, reason: collision with root package name */
    private static int f57367e = 0;
    private static int force = 1;

    /* renamed from: i, reason: collision with root package name */
    private static int f57368i;
    private static int registerClient;

    /* renamed from: v, reason: collision with root package name */
    private static short[] f57369v;
    private static final int valueOf;

    /* renamed from: w, reason: collision with root package name */
    private static byte[] f57370w;

    /* renamed from: d, reason: collision with root package name */
    private final AFd1mSDK f57371d;
    private List<String> values = new ArrayList();
    private boolean AFInAppEventType = true;

    @NonNull
    private final Map<String, Object> AFKeystoreWrapper = new HashMap();
    private boolean AFLogger = true ^ AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DPM, false);
    private int AFInAppEventParameterName = 0;
    private boolean unregisterClient = false;

    static {
        AFLogger();
        valueOf = 98166;
        f57368i = (force + 49) % UserVerificationMethods.USER_VERIFY_PATTERN;
    }

    public AFb1aSDK(AFd1mSDK aFd1mSDK) {
        this.f57371d = aFd1mSDK;
    }

    static void AFLogger() {
        f57367e = -97950892;
        registerClient = 772570790;
        afInfoLog = -746421743;
        f57370w = new byte[]{95, -109, -6, -100, -3};
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x007d, code lost:
    
        if (r3 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008c, code lost:
    
        r3 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008e, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x008a, code lost:
    
        if (r3 != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s11, int i11, byte b11, int i12, int i13, Object[] objArr) {
        int i14;
        int i15;
        boolean z11;
        AFj1pSDK aFj1pSDK = new AFj1pSDK();
        StringBuilder sb2 = new StringBuilder();
        int i16 = i12 + ((int) (registerClient ^ 4636016059744026296L));
        boolean z12 = i16 == -1;
        if (z12) {
            byte[] bArr = f57370w;
            if (bArr != null) {
                int length = bArr.length;
                byte[] bArr2 = new byte[length];
                for (int i17 = 0; i17 < length; i17++) {
                    bArr2[i17] = (byte) (bArr[i17] ^ 4636016059744026296L);
                }
                bArr = bArr2;
            }
            i16 = bArr != null ? (byte) (((byte) (f57370w[i13 + ((int) (f57367e ^ 4636016059744026296L))] ^ 4636016059744026296L)) + ((int) (registerClient ^ 4636016059744026296L))) : (short) (((short) (f57369v[i13 + ((int) (f57367e ^ 4636016059744026296L))] ^ 4636016059744026296L)) + ((int) (registerClient ^ 4636016059744026296L)));
        }
        if (i16 > 0) {
            int i18 = $10 + 9;
            $11 = i18 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i18 % 2 == 0) {
                i14 = ((i13 >>> i16) * 5) % ((int) (f57367e ^ 4636016059744026296L));
            } else {
                i14 = ((i13 + i16) - 2) + ((int) (f57367e ^ 4636016059744026296L));
            }
            aFj1pSDK.valueOf = i14 + i15;
            char c11 = (char) (i11 + ((int) (afInfoLog ^ 4636016059744026296L)));
            aFj1pSDK.AFInAppEventType = c11;
            sb2.append(c11);
            aFj1pSDK.AFKeystoreWrapper = aFj1pSDK.AFInAppEventType;
            byte[] bArr3 = f57370w;
            if (bArr3 != null) {
                int length2 = bArr3.length;
                byte[] bArr4 = new byte[length2];
                for (int i19 = 0; i19 < length2; i19++) {
                    $11 = ($10 + 93) % UserVerificationMethods.USER_VERIFY_PATTERN;
                    bArr4[i19] = (byte) (bArr3[i19] ^ 4636016059744026296L);
                }
                bArr3 = bArr4;
            }
            if (bArr3 != null) {
                $10 = ($11 + 117) % UserVerificationMethods.USER_VERIFY_PATTERN;
                z11 = true;
            } else {
                z11 = false;
            }
            aFj1pSDK.AFInAppEventParameterName = 1;
            while (aFj1pSDK.AFInAppEventParameterName < i16) {
                if (z11) {
                    byte[] bArr5 = f57370w;
                    aFj1pSDK.valueOf = aFj1pSDK.valueOf - 1;
                    aFj1pSDK.AFInAppEventType = (char) (aFj1pSDK.AFKeystoreWrapper + (((byte) (((byte) (bArr5[r8] ^ 4636016059744026296L)) + s11)) ^ b11));
                } else {
                    short[] sArr = f57369v;
                    aFj1pSDK.valueOf = aFj1pSDK.valueOf - 1;
                    aFj1pSDK.AFInAppEventType = (char) (aFj1pSDK.AFKeystoreWrapper + (((short) (((short) (sArr[r8] ^ 4636016059744026296L)) + s11)) ^ b11));
                }
                sb2.append(aFj1pSDK.AFInAppEventType);
                aFj1pSDK.AFKeystoreWrapper = aFj1pSDK.AFInAppEventType;
                aFj1pSDK.AFInAppEventParameterName++;
            }
        }
        objArr[0] = sb2.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
    
        if (r0 != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002f, code lost:
    
        if (r4.unregisterClient == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002b, code lost:
    
        if (r0 != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0017, code lost:
    
        if (r4.AFLogger != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r4.AFLogger != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0019, code lost:
    
        r1 = r1 + 107;
        com.appsflyer.internal.AFb1aSDK.force = r1 % com.google.android.gms.fido.fido2.api.common.UserVerificationMethods.USER_VERIFY_PATTERN;
        r1 = r1 % 2;
        r0 = r4.AFInAppEventType;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        if (r1 != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
    
        r1 = 14 / 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean afInfoLog() {
        int i11 = force + 57;
        int i12 = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        f57368i = i12;
        if (i11 % 2 != 0) {
            int i13 = 66 / 0;
        }
        return false;
    }

    private static float e() {
        float nextFloat = new Random().nextFloat();
        int i11 = f57368i + 57;
        force = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i11 % 2 == 0) {
            int i12 = 93 / 0;
        }
        return nextFloat;
    }

    private boolean force() {
        f57368i = (force + 61) % UserVerificationMethods.USER_VERIFY_PATTERN;
        boolean values = this.f57371d.values().values("participantInProxy");
        int i11 = force + 5;
        f57368i = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i11 % 2 != 0) {
            int i12 = 29 / 0;
        }
        return values;
    }

    private synchronized void i() {
        this.values = new ArrayList();
        this.AFInAppEventParameterName = 0;
        force = (f57368i + 95) % UserVerificationMethods.USER_VERIFY_PATTERN;
    }

    private static String registerClient() {
        int i11 = (f57368i + 93) % UserVerificationMethods.USER_VERIFY_PATTERN;
        force = i11;
        f57368i = (i11 + 45) % UserVerificationMethods.USER_VERIFY_PATTERN;
        return "6.13.1";
    }

    private synchronized void unregisterClient() {
        int i11 = (f57368i + 109) % UserVerificationMethods.USER_VERIFY_PATTERN;
        force = i11;
        if (this.unregisterClient) {
            f57368i = (i11 + 113) % UserVerificationMethods.USER_VERIFY_PATTERN;
            return;
        }
        this.unregisterClient = true;
        try {
            values("r_debugging_on", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
            int i12 = f57368i + 57;
            force = i12 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i12 % 2 == 0) {
                int i13 = 34 / 0;
            }
        } catch (Throwable th2) {
            AFLogger.INSTANCE.e(AFg1gSDK.PROXY, "Error while starting remote debugger", th2, true, true, true);
        }
    }

    private void v() {
        int i11 = force + 99;
        f57368i = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i11 % 2 != 0) {
            this.f57371d.values().AFInAppEventType("participantInProxy");
            int i12 = 16 / 0;
        } else {
            this.f57371d.values().AFInAppEventType("participantInProxy");
        }
        int i13 = f57368i + 31;
        force = i13 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i13 % 2 == 0) {
            throw null;
        }
    }

    @NonNull
    private synchronized Map<String, Object> w() {
        int i11 = force + 81;
        f57368i = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i11 % 2 != 0) {
            this.AFKeystoreWrapper.put("data", this.values);
            i();
            throw null;
        }
        this.AFKeystoreWrapper.put("data", this.values);
        i();
        return this.AFKeystoreWrapper;
    }

    @Override // com.appsflyer.internal.AFb1bSDK
    public final void AFInAppEventParameterName(String str, String... strArr) {
        int i11 = f57368i + 45;
        force = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        int i12 = i11 % 2;
        values("public_api_call", str, strArr);
        if (i12 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFb1bSDK
    public final void AFInAppEventType(Throwable th2) {
        String message;
        StackTraceElement[] stackTrace;
        f57368i = (force + 109) % UserVerificationMethods.USER_VERIFY_PATTERN;
        Throwable cause = th2.getCause();
        String simpleName = th2.getClass().getSimpleName();
        if (cause == null) {
            int i11 = f57368i + 13;
            force = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i11 % 2 == 0) {
                th2.getMessage();
                throw null;
            }
            message = th2.getMessage();
        } else {
            message = cause.getMessage();
        }
        if (cause == null) {
            stackTrace = th2.getStackTrace();
            force = (f57368i + 27) % UserVerificationMethods.USER_VERIFY_PATTERN;
        } else {
            stackTrace = cause.getStackTrace();
        }
        values("exception", simpleName, AFKeystoreWrapper(message, stackTrace));
        f57368i = (force + 15) % UserVerificationMethods.USER_VERIFY_PATTERN;
    }

    @Override // com.appsflyer.internal.AFb1bSDK
    public final synchronized void AFKeystoreWrapper() {
        int i11 = (force + 89) % UserVerificationMethods.USER_VERIFY_PATTERN;
        f57368i = i11;
        if (!this.unregisterClient) {
            int i12 = i11 + 55;
            force = i12 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i12 % 2 == 0) {
                throw null;
            }
            if (!this.AFInAppEventType) {
                force = (i11 + 41) % UserVerificationMethods.USER_VERIFY_PATTERN;
                return;
            }
        }
        this.unregisterClient = false;
        this.AFInAppEventType = false;
        try {
            values("r_debugging_off", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
        } catch (Throwable th2) {
            AFLogger.INSTANCE.e(AFg1gSDK.PROXY, "Error while stopping remote debugger", th2, true, true, true);
        }
    }

    @Override // com.appsflyer.internal.AFb1bSDK
    public final boolean d() {
        int i11 = f57368i;
        boolean z11 = this.unregisterClient;
        int i12 = i11 + 63;
        force = i12 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i12 % 2 == 0) {
            int i13 = 48 / 0;
        }
        return z11;
    }

    @Override // com.appsflyer.internal.AFb1bSDK
    public final synchronized void valueOf() {
        f57368i = (force + 47) % UserVerificationMethods.USER_VERIFY_PATTERN;
        this.AFKeystoreWrapper.clear();
        this.values.clear();
        this.AFInAppEventParameterName = 0;
        int i11 = f57368i + 101;
        force = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i11 % 2 == 0) {
            int i12 = 35 / 0;
        }
    }

    @Override // com.appsflyer.internal.AFb1bSDK
    public final boolean values() {
        boolean AFInAppEventType = AFInAppEventType(values(this.f57371d.d().valueOf.AFInAppEventParameterName), values(this.f57371d.d().valueOf.AFInAppEventType));
        if (!AFInAppEventType) {
            AFInAppEventType();
            AFKeystoreWrapper();
            return AFInAppEventType;
        }
        force = (f57368i + 27) % UserVerificationMethods.USER_VERIFY_PATTERN;
        unregisterClient();
        force = (f57368i + 33) % UserVerificationMethods.USER_VERIFY_PATTERN;
        return AFInAppEventType;
    }

    @Override // com.appsflyer.internal.AFb1bSDK
    public final void AFInAppEventParameterName(String str, int i11, String str2) {
        int i12 = f57368i + 45;
        force = i12 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i12 % 2 == 0) {
            String[] strArr = new String[3];
            strArr[0] = String.valueOf(i11);
            strArr[0] = str2;
            values("server_response", str, strArr);
        } else {
            values("server_response", str, String.valueOf(i11), str2);
        }
        force = (f57368i + 29) % UserVerificationMethods.USER_VERIFY_PATTERN;
    }

    @Override // com.appsflyer.internal.AFb1bSDK
    public final void AFInAppEventParameterName() {
        int i11 = f57368i;
        this.AFLogger = false;
        int i12 = i11 + 115;
        force = i12 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i12 % 2 == 0) {
            int i13 = 58 / 0;
        }
    }

    private boolean AFInAppEventParameterName(@NonNull AFh1iSDK aFh1iSDK, AFh1iSDK aFh1iSDK2) {
        int i11 = force + 39;
        f57368i = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i11 % 2 == 0) {
            if (aFh1iSDK.equals(aFh1iSDK2)) {
                boolean force2 = force();
                f57368i = (force + 29) % UserVerificationMethods.USER_VERIFY_PATTERN;
                return force2;
            }
            boolean values = values(aFh1iSDK.AFInAppEventType);
            AFKeystoreWrapper(values);
            return values;
        }
        aFh1iSDK.equals(aFh1iSDK2);
        throw null;
    }

    @Override // com.appsflyer.internal.AFb1bSDK
    public final void valueOf(String str, PackageManager packageManager) {
        f57368i = (force + 115) % UserVerificationMethods.USER_VERIFY_PATTERN;
        try {
            AFe1xSDK AFInAppEventType = this.f57371d.AFKeystoreWrapper().AFInAppEventType(values(str, packageManager), this.f57371d.force().registerClient);
            if (AFInAppEventType == null) {
                AFLogger.afErrorLogForExcManagerOnly("could not send null proxy data", new NullPointerException("request was null"));
                f57368i = (force + 63) % UserVerificationMethods.USER_VERIFY_PATTERN;
            } else {
                this.f57371d.AFInAppEventParameterName().execute(new W(AFInAppEventType, 3));
            }
        } catch (Throwable th2) {
            AFLogger.afErrorLogForExcManagerOnly("could not send proxy data", th2);
        }
    }

    private synchronized void AFKeystoreWrapper(String str, String str2, String str3, String str4) {
        f57368i = (force + 73) % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (str != null) {
            try {
                if (str.length() > 0) {
                    this.AFKeystoreWrapper.put("app_id", str);
                }
            } catch (Throwable unused) {
                return;
            }
        }
        if (str2 != null) {
            force = (f57368i + 107) % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (str2.length() > 0) {
                this.AFKeystoreWrapper.put("app_version", str2);
            }
        }
        if (str3 != null) {
            force = (f57368i + 37) % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (str3.length() > 0) {
                int i11 = f57368i + 39;
                force = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i11 % 2 == 0) {
                    this.AFKeystoreWrapper.put(AppsFlyerProperties.CHANNEL, str3);
                    throw null;
                }
                this.AFKeystoreWrapper.put(AppsFlyerProperties.CHANNEL, str3);
            }
        }
        if (str4 != null) {
            force = (f57368i + 55) % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (str4.length() > 0) {
                int i12 = f57368i + 67;
                force = i12 % UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i12 % 2 == 0) {
                    this.AFKeystoreWrapper.put("preInstall", str4);
                    throw null;
                }
                this.AFKeystoreWrapper.put("preInstall", str4);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003c, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001c, code lost:
    
        if (com.appsflyer.internal.AFc1rSDK.AFKeystoreWrapper(r3) != true) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0015, code lost:
    
        if (com.appsflyer.internal.AFc1rSDK.AFKeystoreWrapper(r3) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001e, code lost:
    
        new com.appsflyer.internal.AFe1ySDK();
        r3 = com.appsflyer.internal.AFe1ySDK.values(registerClient(), r3);
        r0 = com.appsflyer.internal.AFb1aSDK.force + 65;
        com.appsflyer.internal.AFb1aSDK.f57368i = r0 % com.google.android.gms.fido.fido2.api.common.UserVerificationMethods.USER_VERIFY_PATTERN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0035, code lost:
    
        if ((r0 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0037, code lost:
    
        r0 = 77 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003b, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean AFInAppEventParameterName(String str) {
        int i11 = force + 7;
        f57368i = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i11 % 2 != 0) {
            int i12 = 73 / 0;
        }
    }

    @Override // com.appsflyer.internal.AFb1bSDK
    public final void AFInAppEventType(String str, String str2) {
        force = (f57368i + 59) % UserVerificationMethods.USER_VERIFY_PATTERN;
        values(null, str, str2);
        int i11 = force + 119;
        f57368i = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFb1bSDK
    public final synchronized void AFInAppEventType() {
        f57368i = (force + 9) % UserVerificationMethods.USER_VERIFY_PATTERN;
        this.AFInAppEventType = false;
        valueOf();
        i();
        force = (f57368i + 85) % UserVerificationMethods.USER_VERIFY_PATTERN;
    }

    private Map<String, Object> values(String str, PackageManager packageManager) {
        f57368i = (force + 85) % UserVerificationMethods.USER_VERIFY_PATTERN;
        AFInAppEventType(str, packageManager, this.f57371d.force(), this.f57371d.afErrorLogForExcManagerOnly());
        Map<String, Object> w11 = w();
        int i11 = f57368i + 49;
        force = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i11 % 2 == 0) {
            int i12 = 65 / 0;
        }
        return w11;
    }

    @Override // com.appsflyer.internal.AFb1bSDK
    public final void valueOf(String str, String str2) {
        int i11 = force + 55;
        f57368i = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i11 % 2 == 0) {
            values("server_request", str, str2);
            return;
        }
        String[] strArr = new String[1];
        strArr[1] = str2;
        values("server_request", str, strArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0081, code lost:
    
        if (r12.length() > 0) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private synchronized void AFInAppEventType(String str, String str2, String str3) {
        try {
            Map<String, Object> map = this.AFKeystoreWrapper;
            Object[] objArr = new Object[1];
            a((short) ((-52) - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), (ViewConfiguration.getFadingEdgeLength() >> 16) + 40960953, (byte) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), (-30) - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 735765011, objArr);
            map.put(((String) objArr[0]).intern(), Build.BRAND);
            this.AFKeystoreWrapper.put("model", Build.MODEL);
            this.AFKeystoreWrapper.put("platform", "Android");
            this.AFKeystoreWrapper.put("platform_version", Build.VERSION.RELEASE);
            if (str != null) {
                try {
                    int i11 = force + 7;
                    f57368i = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
                    if (i11 % 2 != 0) {
                        int i12 = 9 / 0;
                        if (str.length() > 0) {
                            this.AFKeystoreWrapper.put("advertiserId", str);
                        }
                    }
                } finally {
                }
            }
            if (str2 != null && str2.length() > 0) {
                this.AFKeystoreWrapper.put("imei", str2);
            }
            if (str3 != null && str3.length() > 0) {
                this.AFKeystoreWrapper.put("android_id", str3);
                f57368i = (force + 45) % UserVerificationMethods.USER_VERIFY_PATTERN;
            }
        } catch (Throwable unused) {
        }
    }

    private synchronized void values(String str, String str2, String str3, String str4) {
        try {
            this.AFKeystoreWrapper.put("sdk_version", str);
            if (str2 != null && str2.length() > 0) {
                this.AFKeystoreWrapper.put("devkey", str2);
            }
            if (str3 != null) {
                try {
                    int i11 = force + 79;
                    f57368i = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
                    if (i11 % 2 == 0) {
                        if (str3.length() > 0) {
                            f57368i = (force + 39) % UserVerificationMethods.USER_VERIFY_PATTERN;
                            this.AFKeystoreWrapper.put("originalAppsFlyerId", str3);
                        }
                    } else {
                        throw null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (str4 != null && str4.length() > 0) {
                this.AFKeystoreWrapper.put("uid", str4);
            }
            int i12 = f57368i + 41;
            force = i12 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i12 % 2 == 0) {
                throw null;
            }
        } catch (Throwable unused) {
        }
    }

    private static String[] AFKeystoreWrapper(String str, StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr == null) {
            f57368i = (force + 95) % UserVerificationMethods.USER_VERIFY_PATTERN;
            return new String[]{str};
        }
        int i11 = 1;
        String[] strArr = new String[stackTraceElementArr.length + 1];
        strArr[0] = str;
        while (i11 < stackTraceElementArr.length) {
            strArr[i11] = stackTraceElementArr[i11].toString();
            i11++;
            force = (f57368i + 61) % UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        return strArr;
    }

    private synchronized void values(String str, String str2, String... strArr) {
        String obj;
        int i11 = f57368i + 61;
        force = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i11 % 2 == 0) {
            afInfoLog();
            throw null;
        }
        if (!afInfoLog() || this.AFInAppEventParameterName >= 98304) {
            return;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis();
            String join = TextUtils.join(", ", strArr);
            if (str != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(currentTimeMillis);
                sb2.append(" ");
                sb2.append(Thread.currentThread().getId());
                sb2.append(" _/AppsFlyer_6.13.1 [");
                sb2.append(str);
                sb2.append("] ");
                sb2.append(str2);
                sb2.append(" ");
                sb2.append(join);
                obj = sb2.toString();
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(currentTimeMillis);
                sb3.append(" ");
                sb3.append(Thread.currentThread().getId());
                sb3.append(" ");
                sb3.append(str2);
                sb3.append("/AppsFlyer_6.13.1 ");
                sb3.append(join);
                obj = sb3.toString();
                force = (f57368i + 53) % UserVerificationMethods.USER_VERIFY_PATTERN;
            }
            int length = this.AFInAppEventParameterName + (obj.length() << 1);
            int i12 = valueOf;
            boolean z11 = false;
            if (length > i12) {
                obj = obj.substring(0, (i12 - this.AFInAppEventParameterName) / 2);
                z11 = true;
            }
            this.values.add(obj);
            this.AFInAppEventParameterName += obj.length() << 1;
            if (z11) {
                force = (f57368i + 59) % UserVerificationMethods.USER_VERIFY_PATTERN;
                this.values.add("+~+~ The limit has been exceeded, and no more data is available. +~+~");
                this.AFInAppEventParameterName += 138;
            }
        } catch (Throwable unused) {
        }
    }

    private synchronized void AFInAppEventType(String str, PackageManager packageManager, AFg1xSDK aFg1xSDK, AFd1qSDK aFd1qSDK) {
        AFa1bSDK aFa1bSDK;
        try {
            int i11 = force + 49;
            f57368i = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i11 % 2 == 0) {
                AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
                String string = appsFlyerProperties.getString("remote_debug_static_data");
                this.AFKeystoreWrapper.clear();
                if (string != null) {
                    try {
                        this.AFKeystoreWrapper.putAll(AFa1qSDK.values(new JSONObject(string)));
                    } catch (Throwable unused) {
                    }
                } else {
                    AFb1tSDK valueOf2 = AFb1tSDK.valueOf();
                    AFh1xSDK aFh1xSDK = AFb1tSDK.valueOf().values().AFInAppEventType().valueOf.f57393e;
                    if (aFh1xSDK != null) {
                        aFa1bSDK = new AFa1bSDK(aFh1xSDK.AFInAppEventType, aFh1xSDK.unregisterClient);
                        f57368i = (force + 83) % UserVerificationMethods.USER_VERIFY_PATTERN;
                    } else {
                        aFa1bSDK = null;
                    }
                    AFInAppEventType(aFa1bSDK != null ? aFa1bSDK.AFInAppEventParameterName : null, aFg1xSDK.unregisterClient, aFd1qSDK.values);
                    StringBuilder sb2 = new StringBuilder("6.13.1.");
                    sb2.append(AFb1tSDK.AFInAppEventParameterName);
                    values(sb2.toString(), valueOf2.values().force().registerClient, appsFlyerProperties.getString("KSAppsFlyerId"), appsFlyerProperties.getString("uid"));
                    try {
                        AFKeystoreWrapper(str, String.valueOf(packageManager.getPackageInfo(str, 0).versionCode), appsFlyerProperties.getString(AppsFlyerProperties.CHANNEL), appsFlyerProperties.getString("preInstallName"));
                        f57368i = (force + 125) % UserVerificationMethods.USER_VERIFY_PATTERN;
                    } catch (Throwable unused2) {
                    }
                    appsFlyerProperties.set("remote_debug_static_data", new JSONObject(this.AFKeystoreWrapper).toString());
                }
                this.AFKeystoreWrapper.put("launch_counter", String.valueOf(this.f57371d.AFInAppEventType().AFKeystoreWrapper.AFInAppEventParameterName("appsFlyerCount", 0)));
            } else {
                AppsFlyerProperties.getInstance().getString("remote_debug_static_data");
                this.AFKeystoreWrapper.clear();
                throw null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private boolean AFKeystoreWrapper(String str) {
        if (AFc1rSDK.AFKeystoreWrapper(str)) {
            int i11 = (f57368i + 45) % UserVerificationMethods.USER_VERIFY_PATTERN;
            force = i11;
            int i12 = i11 + 105;
            f57368i = i12 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i12 % 2 == 0) {
                return true;
            }
            throw null;
        }
        Context context = this.f57371d.AFInAppEventType().AFInAppEventParameterName.valueOf;
        return str.equals(AFb1uSDK.AFKeystoreWrapper(context, context.getPackageName()));
    }

    private void AFKeystoreWrapper(boolean z11) {
        f57368i = (force + 39) % UserVerificationMethods.USER_VERIFY_PATTERN;
        this.f57371d.values().values("participantInProxy", z11);
        int i11 = f57368i + 71;
        force = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    private static boolean values(float f7) {
        double d11 = f7;
        if (d11 >= 1.0d) {
            return true;
        }
        if (d11 <= 0.0d) {
            f57368i = (force + 39) % UserVerificationMethods.USER_VERIFY_PATTERN;
            return false;
        }
        if (e() > f7) {
            return false;
        }
        int i11 = f57368i + 67;
        force = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i11 % 2 != 0) {
            return true;
        }
        throw null;
    }

    private static AFh1iSDK values(AFh1hSDK aFh1hSDK) {
        AFh1gSDK aFh1gSDK;
        int i11 = (force + 23) % UserVerificationMethods.USER_VERIFY_PATTERN;
        f57368i = i11;
        if (aFh1hSDK == null || (aFh1gSDK = aFh1hSDK.AFInAppEventType) == null) {
            return null;
        }
        AFh1iSDK aFh1iSDK = aFh1gSDK.valueOf;
        force = (i11 + 25) % UserVerificationMethods.USER_VERIFY_PATTERN;
        return aFh1iSDK;
    }

    private synchronized boolean AFInAppEventType(AFh1iSDK aFh1iSDK, AFh1iSDK aFh1iSDK2) {
        boolean z11;
        if (aFh1iSDK == null) {
            int i11 = f57368i + 77;
            force = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i11 % 2 == 0) {
                v();
                return false;
            }
            v();
            return false;
        }
        if (!aFh1iSDK.AFInAppEventType()) {
            int i12 = f57368i + 71;
            force = i12 % UserVerificationMethods.USER_VERIFY_PATTERN;
            return i12 % 2 == 0 ? false : false;
        }
        if (this.f57371d.AFInAppEventType().AFKeystoreWrapper.AFInAppEventParameterName("appsFlyerCount", 0) <= aFh1iSDK.values) {
            force = (f57368i + 13) % UserVerificationMethods.USER_VERIFY_PATTERN;
            z11 = true;
        } else {
            f57368i = (force + 53) % UserVerificationMethods.USER_VERIFY_PATTERN;
            z11 = false;
        }
        if (!z11) {
            f57368i = (force + 125) % UserVerificationMethods.USER_VERIFY_PATTERN;
            return false;
        }
        if (!AFInAppEventParameterName(aFh1iSDK, aFh1iSDK2)) {
            f57368i = (force + 91) % UserVerificationMethods.USER_VERIFY_PATTERN;
            return false;
        }
        if (AFKeystoreWrapper(aFh1iSDK.valueOf)) {
            return AFInAppEventParameterName(aFh1iSDK.AFKeystoreWrapper);
        }
        return false;
    }
}
