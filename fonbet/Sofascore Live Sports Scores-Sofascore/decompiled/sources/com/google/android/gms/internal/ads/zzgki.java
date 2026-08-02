package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Base64;
import com.inmobi.media.core.config.models.AdConfig;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import defpackage.iko;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzgki implements zzgkh {
    public final Context a;
    public final zzgrh b;
    public final zzgid c;
    public final String d;
    public final boolean e;

    public zzgki(Context context, zzgrh zzgrhVar, zzgid zzgidVar, zzgei zzgeiVar) {
        this.a = context;
        this.b = zzgrhVar;
        this.c = zzgidVar;
        this.d = zzgeiVar.V();
        this.e = zzgeiVar.n0();
    }

    @Override // com.google.android.gms.internal.ads.zzgkh
    public final String c(long j) {
        boolean z;
        String str = "E";
        Context context = this.a;
        try {
            this.b.a(55).a();
            zzazl D = zzazm.D();
            String str2 = this.d;
            D.n();
            ((zzazm) D.b).F(str2);
            D.n();
            ((zzazm) D.b).E("0.904631200");
            String packageName = context.getPackageName();
            D.n();
            ((zzazm) D.b).H(packageName);
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            D.n();
            ((zzazm) D.b).G(currentTimeMillis);
            long currentTimeMillis2 = (System.currentTimeMillis() - j) / 1000;
            D.n();
            ((zzazm) D.b).J(currentTimeMillis2);
            if (this.e) {
                try {
                    Signature[] signatureArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures;
                    if (signatureArr != null && signatureArr.length > 0) {
                        byte[] digest = MessageDigest.getInstance(AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1).digest(signatureArr[0].toByteArray());
                        StringBuilder sb = new StringBuilder();
                        for (byte b : digest) {
                            String hexString = Integer.toHexString(b & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                            if (hexString.length() == 1) {
                                sb.append('0');
                            }
                            sb.append(hexString);
                        }
                        str = Base64.encodeToString(sb.toString().getBytes(StandardCharsets.UTF_8), 11);
                    }
                } catch (Exception unused) {
                }
                D.n();
                ((zzazm) D.b).K(str);
            }
            try {
                long j2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
                D.n();
                ((zzazm) D.b).I(j2);
            } catch (PackageManager.NameNotFoundException unused2) {
                D.n();
                ((zzazm) D.b).I(-1L);
            }
            zzgid zzgidVar = this.c;
            synchronized (zzgidVar) {
                z = zzgidVar.d;
            }
            if (!z) {
                zzgidVar.a();
            }
            zzazs d = zzgidVar.d(null, ((zzazm) D.o()).d());
            d.n();
            ((zzazt) d.b).G(5);
            d.n();
            ((zzazt) d.b).H(2);
            byte[] d2 = ((zzazt) d.o()).d();
            iko ikoVar = zzhah.b;
            return (ikoVar.e == null ? ikoVar : ikoVar.h(ikoVar.d, null)).f(d2.length, d2);
        } finally {
        }
    }
}
