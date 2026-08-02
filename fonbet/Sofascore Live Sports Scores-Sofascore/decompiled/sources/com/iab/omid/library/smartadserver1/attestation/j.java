package com.iab.omid.library.smartadserver1.attestation;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

/* loaded from: classes4.dex */
public class j implements k {
    private static volatile j d;
    private volatile Boolean a;
    private volatile Boolean b;
    private final Context c;

    private j(Context context) {
        this.c = context;
        c();
    }

    public static j a(Context context) {
        if (d == null) {
            synchronized (j.class) {
                try {
                    if (d == null) {
                        d = new j(context);
                    }
                } finally {
                }
            }
        }
        return d;
    }

    public boolean b() {
        boolean hasSystemFeature;
        if (this.b != null) {
            return this.b.booleanValue();
        }
        synchronized (this) {
            try {
                if (this.b == null) {
                    if (c()) {
                        try {
                            PackageManager packageManager = this.c.getPackageManager();
                            if (packageManager == null) {
                                com.iab.omid.library.smartadserver1.utils.d.b("PackageManager is null when checking attestation capability");
                                this.b = Boolean.FALSE;
                            } else {
                                hasSystemFeature = packageManager.hasSystemFeature("com.amazon.privacypass");
                                this.b = Boolean.valueOf(hasSystemFeature);
                            }
                        } catch (SecurityException e) {
                            com.iab.omid.library.smartadserver1.utils.d.a("Security exception when checking attestation capability", e);
                            this.b = Boolean.FALSE;
                            return false;
                        } catch (Exception e2) {
                            com.iab.omid.library.smartadserver1.utils.d.a("Unexpected error when checking attestation capability", e2);
                            this.b = Boolean.FALSE;
                            return false;
                        }
                    } else {
                        this.b = Boolean.FALSE;
                    }
                    return false;
                }
                hasSystemFeature = this.b.booleanValue();
                return hasSystemFeature;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean c() {
        boolean z;
        if (this.a != null) {
            return this.a.booleanValue();
        }
        synchronized (this) {
            try {
                if (this.a != null) {
                    z = this.a.booleanValue();
                } else {
                    z = this.c != null && Build.MANUFACTURER.equalsIgnoreCase("Amazon") && Build.MODEL.toLowerCase().startsWith("aft") && Build.VERSION.SDK_INT <= 30;
                    this.a = Boolean.valueOf(z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // com.iab.omid.library.smartadserver1.attestation.k
    public boolean a() {
        return c();
    }
}
