package com.iab.omid.library.applovin.attestation;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

/* loaded from: classes8.dex */
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
                if (d == null) {
                    d = new j(context);
                }
            }
        }
        return d;
    }

    @Override // com.iab.omid.library.applovin.attestation.k
    public boolean a() {
        return c();
    }

    public boolean b() {
        boolean booleanValue;
        if (this.b != null) {
            return this.b.booleanValue();
        }
        synchronized (this) {
            if (this.b == null) {
                if (c()) {
                    try {
                        try {
                            PackageManager packageManager = this.c.getPackageManager();
                            if (packageManager == null) {
                                com.iab.omid.library.applovin.utils.d.b("PackageManager is null when checking attestation capability");
                                this.b = Boolean.FALSE;
                            } else {
                                Boolean valueOf = Boolean.valueOf(packageManager.hasSystemFeature("com.amazon.privacypass"));
                                this.b = valueOf;
                                booleanValue = valueOf.booleanValue();
                            }
                        } catch (SecurityException e) {
                            com.iab.omid.library.applovin.utils.d.a("Security exception when checking attestation capability", e);
                            this.b = Boolean.FALSE;
                            return false;
                        }
                    } catch (Exception e2) {
                        com.iab.omid.library.applovin.utils.d.a("Unexpected error when checking attestation capability", e2);
                        this.b = Boolean.FALSE;
                        return false;
                    }
                } else {
                    this.b = Boolean.FALSE;
                }
                return false;
            }
            booleanValue = this.b.booleanValue();
            return booleanValue;
        }
    }

    public boolean c() {
        boolean booleanValue;
        int i;
        if (this.a != null) {
            return this.a.booleanValue();
        }
        synchronized (this) {
            if (this.a != null) {
                booleanValue = this.a.booleanValue();
            } else {
                Boolean valueOf = Boolean.valueOf(this.c != null && Build.MANUFACTURER.equalsIgnoreCase("Amazon") && Build.MODEL.toLowerCase().startsWith("aft") && (i = Build.VERSION.SDK_INT) >= 25 && i <= 30);
                this.a = valueOf;
                booleanValue = valueOf.booleanValue();
            }
        }
        return booleanValue;
    }
}
