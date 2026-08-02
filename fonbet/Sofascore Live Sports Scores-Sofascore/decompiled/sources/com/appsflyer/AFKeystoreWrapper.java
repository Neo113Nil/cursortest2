package com.appsflyer;

import android.content.Context;
import android.security.keystore.KeyGenParameterSpec;
import com.appsflyer.sdk_base.logger.LogTag;
import java.io.IOException;
import java.math.BigInteger;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.Calendar;
import java.util.Enumeration;
import java.util.Locale;
import javax.security.auth.x500.X500Principal;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class AFKeystoreWrapper {
    private Context registerClient;
    public KeyStore unregisterClient;
    public final Object d = new Object();
    public String AFLogger = "";
    public int AFKeystoreWrapper = 0;

    public AFKeystoreWrapper(Context context) {
        this.registerClient = context;
        AFLogger.INSTANCE.i(LogTag.SECURITY, "Initializing KeyStore");
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            this.unregisterClient = keyStore;
            keyStore.load(null);
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException e) {
            AFLogger.INSTANCE.e(LogTag.SECURITY, "Couldn't load keystore instance of type: AndroidKeyStore", e);
        }
    }

    public final String AFKeystoreWrapper() {
        String str;
        synchronized (this.d) {
            str = this.AFLogger;
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0022, code lost:
    
        r1 = r3.split(com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x002a, code lost:
    
        if (r1.length != 3) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002c, code lost:
    
        com.appsflyer.AFLogger.INSTANCE.i(com.appsflyer.sdk_base.logger.LogTag.SECURITY, "Found a matching AF key with alias:\n".concat(r3));
        r2 = true;
        r3 = r1[1].trim().split(com.ironsource.U3.j.b);
        r1 = r1[2].trim().split(com.ironsource.U3.j.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0054, code lost:
    
        if (r3.length != 2) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0057, code lost:
    
        if (r1.length != 2) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0059, code lost:
    
        r7.AFLogger = r3[1].trim();
        r7.AFKeystoreWrapper = java.lang.Integer.parseInt(r1[1].trim());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean AFLogger() {
        boolean z;
        synchronized (this.d) {
            try {
                KeyStore keyStore = this.unregisterClient;
                z = false;
                if (keyStore != null) {
                    try {
                        Enumeration<String> aliases = keyStore.aliases();
                        while (true) {
                            if (!aliases.hasMoreElements()) {
                                break;
                            }
                            String nextElement = aliases.nextElement();
                            if (nextElement != null && nextElement.startsWith("com.appsflyer")) {
                                break;
                            }
                        }
                    } catch (Throwable th) {
                        AFLogger aFLogger = AFLogger.INSTANCE;
                        LogTag logTag = LogTag.SECURITY;
                        StringBuilder sb = new StringBuilder("Couldn't list KeyStore aliases: ");
                        sb.append(th.getClass().getName());
                        aFLogger.e(logTag, sb.toString(), th);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z;
    }

    public final void d(String str) {
        AFLogger aFLogger = AFLogger.INSTANCE;
        LogTag logTag = LogTag.SECURITY;
        aFLogger.i(logTag, "Creating a new key with alias: ".concat(String.valueOf(str)));
        try {
            Locale locale = Locale.US;
            Calendar calendar = Calendar.getInstance(locale);
            Calendar calendar2 = Calendar.getInstance(locale);
            calendar2.add(1, 5);
            synchronized (this.d) {
                try {
                    if (this.unregisterClient.containsAlias(str)) {
                        aFLogger.i(logTag, "Alias already exists: ".concat(String.valueOf(str)));
                    } else {
                        KeyGenParameterSpec build = new KeyGenParameterSpec.Builder(str, 3).setCertificateSubject(new X500Principal("CN=AndroidSDK, O=AppsFlyer")).setCertificateSerialNumber(BigInteger.ONE).setCertificateNotBefore(calendar.getTime()).setCertificateNotAfter(calendar2.getTime()).build();
                        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
                        keyPairGenerator.initialize(build);
                        keyPairGenerator.generateKeyPair();
                    }
                } finally {
                }
            }
        } catch (Throwable th) {
            AFLogger aFLogger2 = AFLogger.INSTANCE;
            LogTag logTag2 = LogTag.SECURITY;
            StringBuilder sb = new StringBuilder("Exception occurred while creating key: ");
            sb.append(th.getMessage() != null ? th.getMessage() : "unknown error");
            aFLogger2.e(logTag2, sb.toString(), th);
        }
    }

    public final int unregisterClient() {
        int i;
        synchronized (this.d) {
            i = this.AFKeystoreWrapper;
        }
        return i;
    }

    public final String d() {
        StringBuilder sb = new StringBuilder("com.appsflyer,KSAppsFlyerId=");
        synchronized (this.d) {
            sb.append(this.AFLogger);
            sb.append(",KSAppsFlyerRICounter=");
            sb.append(this.AFKeystoreWrapper);
        }
        return sb.toString();
    }
}
