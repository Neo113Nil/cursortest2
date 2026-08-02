package com.appsflyer;

import android.content.Context;
import android.security.keystore.KeyGenParameterSpec;
import java.io.IOException;
import java.math.BigInteger;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.Calendar;
import java.util.Enumeration;
import javax.security.auth.x500.X500Principal;

/* loaded from: classes8.dex */
public class AFKeystoreWrapper {
    public KeyStore AFInAppEventParameterName;
    private Context AFInAppEventType;
    public final Object AFKeystoreWrapper = new Object();
    public String values = "";
    public int valueOf = 0;

    public AFKeystoreWrapper(Context context) {
        this.AFInAppEventType = context;
        AFLogger.afInfoLog("Initialising KeyStore..");
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            this.AFInAppEventParameterName = keyStore;
            keyStore.load(null);
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException e11) {
            AFLogger.afErrorLog("Couldn't load keystore instance of type: AndroidKeyStore", e11);
        }
    }

    private static boolean AFInAppEventParameterName(String str) {
        return str.startsWith("com.appsflyer");
    }

    public final String AFInAppEventType() {
        String str;
        synchronized (this.AFKeystoreWrapper) {
            str = this.values;
        }
        return str;
    }

    public final void AFKeystoreWrapper(String str) {
        AFLogger.afInfoLog("Creating a new key with alias: ".concat(String.valueOf(str)));
        try {
            Calendar calendar = Calendar.getInstance();
            Calendar calendar2 = Calendar.getInstance();
            calendar2.add(1, 5);
            synchronized (this.AFKeystoreWrapper) {
                try {
                    if (this.AFInAppEventParameterName.containsAlias(str)) {
                        AFLogger.afInfoLog("Alias already exists: ".concat(String.valueOf(str)));
                    } else {
                        KeyGenParameterSpec build = new KeyGenParameterSpec.Builder(str, 3).setCertificateSubject(new X500Principal("CN=AndroidSDK, O=AppsFlyer")).setCertificateSerialNumber(BigInteger.ONE).setCertificateNotBefore(calendar.getTime()).setCertificateNotAfter(calendar2.getTime()).build();
                        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
                        keyPairGenerator.initialize(build);
                        keyPairGenerator.generateKeyPair();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            StringBuilder sb2 = new StringBuilder("Exception ");
            sb2.append(th3.getMessage());
            sb2.append(" occurred");
            AFLogger.afErrorLog(sb2.toString(), th3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0020, code lost:
    
        r1 = r3.split(",");
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0028, code lost:
    
        if (r1.length != 3) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002a, code lost:
    
        com.appsflyer.AFLogger.afInfoLog("Found a matching AF key with alias:\n".concat(r3));
        r2 = true;
        r3 = r1[1].trim().split("=");
        r1 = r1[2].trim().split("=");
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004e, code lost:
    
        if (r3.length != 2) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0051, code lost:
    
        if (r1.length != 2) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0053, code lost:
    
        r6.values = r3[1].trim();
        r6.valueOf = java.lang.Integer.parseInt(r1[1].trim());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean valueOf() {
        boolean z11;
        synchronized (this.AFKeystoreWrapper) {
            try {
                KeyStore keyStore = this.AFInAppEventParameterName;
                z11 = false;
                if (keyStore != null) {
                    try {
                        Enumeration<String> aliases = keyStore.aliases();
                        while (true) {
                            if (!aliases.hasMoreElements()) {
                                break;
                            }
                            String nextElement = aliases.nextElement();
                            if (nextElement != null && AFInAppEventParameterName(nextElement)) {
                                break;
                            }
                        }
                    } catch (Throwable th2) {
                        StringBuilder sb2 = new StringBuilder("Couldn't list KeyStore Aliases: ");
                        sb2.append(th2.getClass().getName());
                        AFLogger.afErrorLog(sb2.toString(), th2);
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return z11;
    }

    public final int values() {
        int i11;
        synchronized (this.AFKeystoreWrapper) {
            i11 = this.valueOf;
        }
        return i11;
    }

    public final String AFKeystoreWrapper() {
        StringBuilder sb2 = new StringBuilder("com.appsflyer,KSAppsFlyerId=");
        synchronized (this.AFKeystoreWrapper) {
            sb2.append(this.values);
            sb2.append(",KSAppsFlyerRICounter=");
            sb2.append(this.valueOf);
        }
        return sb2.toString();
    }
}
