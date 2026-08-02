package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import defpackage.jzn;
import defpackage.nyn;
import defpackage.vyn;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzco {
    public final Application a;
    public zzha b;
    public zzgw d;
    public zzgt c = null;
    public String e = null;

    public zzco(Application application) {
        this.a = application;
    }

    public final zzif a(int i, long j, String str) {
        Bundle bundle;
        zzid n = zzif.n();
        zzgu n2 = zzhc.n();
        zzgx n3 = zzgy.n();
        n3.e();
        zzgy.q((zzgy) n3.b, i);
        if (str != null) {
            n3.e();
            zzgy.o((zzgy) n3.b, str);
        }
        if (j > 0) {
            n3.e();
            zzgy.p((zzgy) n3.b, j);
        }
        zzgy zzgyVar = (zzgy) n3.c();
        n2.e();
        zzhc.s((zzhc) n2.b, zzgyVar);
        String str2 = this.e;
        PackageInfo packageInfo = null;
        Application application = this.a;
        if (str2 == null) {
            try {
                bundle = application.getPackageManager().getApplicationInfo(application.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                bundle = null;
            }
            if (bundle != null) {
                this.e = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
            }
            TextUtils.isEmpty(this.e);
            str2 = this.e;
        }
        if (str2 != null) {
            n2.e();
            zzhc.p((zzhc) n2.b, str2);
        }
        zzha zzhaVar = this.b;
        if (zzhaVar == null) {
            zzgz n4 = zzha.n();
            n4.e();
            zzha.o((zzha) n4.b);
            zzhaVar = (zzha) n4.c();
            this.b = zzhaVar;
        }
        n2.e();
        zzhc.t((zzhc) n2.b, zzhaVar);
        zzgw zzgwVar = this.d;
        if (zzgwVar == null) {
            zzgv n5 = zzgw.n();
            int i2 = Build.VERSION.SDK_INT;
            n5.e();
            zzgw.o((zzgw) n5.b, i2);
            String str3 = Build.MODEL;
            n5.e();
            zzgw.p((zzgw) n5.b);
            n5.e();
            zzgw.r((zzgw) n5.b);
            String str4 = Build.VERSION.RELEASE;
            n5.e();
            zzgw.q((zzgw) n5.b);
            zzgwVar = (zzgw) n5.c();
            this.d = zzgwVar;
        }
        n2.e();
        zzhc.r((zzhc) n2.b, zzgwVar);
        zzgt zzgtVar = this.c;
        if (zzgtVar == null) {
            String packageName = application.getPackageName();
            try {
                packageInfo = application.getPackageManager().getPackageInfo(packageName, 0);
            } catch (PackageManager.NameNotFoundException unused2) {
            }
            if (packageInfo != null) {
                zzgs n6 = zzgt.n();
                String l = Long.toString(Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode);
                n6.e();
                zzgt.p((zzgt) n6.b, l);
                n6.e();
                zzgt.o((zzgt) n6.b, packageName);
                this.c = (zzgt) n6.c();
            }
            zzgtVar = this.c;
        }
        if (zzgtVar != null) {
            n2.e();
            zzhc.q((zzhc) n2.b, zzgtVar);
        }
        String string = PreferenceManager.getDefaultSharedPreferences(application).getString("UMP_eids", "");
        if (string != null && !string.isEmpty()) {
            new nyn();
            int i3 = vyn.b;
            jzn jznVar = new jzn(string);
            while (jznVar.hasNext()) {
                String str5 = (String) jznVar.next();
                n2.e();
                zzhc.o((zzhc) n2.b, str5);
            }
        }
        zzhc zzhcVar = (zzhc) n2.c();
        n.e();
        zzif.o((zzif) n.b, zzhcVar);
        long currentTimeMillis = System.currentTimeMillis();
        n.e();
        zzif.p((zzif) n.b, currentTimeMillis);
        return (zzif) n.c();
    }
}
