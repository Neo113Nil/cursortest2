package com.google.android.gms.measurement.internal;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.internal.measurement.zzib;
import defpackage.p0p;
import defpackage.ugn;
import defpackage.who;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzgz extends p0p {
    public final boolean U() {
        R();
        ConnectivityManager connectivityManager = (ConnectivityManager) ((zzic) this.b).a.getSystemService("connectivity");
        NetworkInfo networkInfo = null;
        if (connectivityManager != null) {
            try {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        return networkInfo != null && networkInfo.isConnected();
    }

    public final void V(String str, zzot zzotVar, zzib zzibVar, who whoVar) {
        String str2;
        URL url;
        byte[] h;
        zzhz zzhzVar;
        Map map;
        String str3 = zzotVar.a;
        zzic zzicVar = (zzic) this.b;
        Q();
        R();
        try {
            url = new URI(str3).toURL();
            this.c.k0();
            h = zzibVar.h();
            zzhzVar = zzicVar.g;
            zzic.m(zzhzVar);
            map = zzotVar.b;
            if (map == null) {
                map = Collections.EMPTY_MAP;
            }
            str2 = str;
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
            str2 = str;
        }
        try {
            zzhzVar.c0(new ugn(this, str2, url, h, map, whoVar));
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused2) {
            zzgu zzguVar = zzicVar.f;
            zzic.m(zzguVar);
            zzguVar.g.c(zzgu.U(str2), str3, "Failed to parse URL. Not uploading MeasurementBatch. appId");
        }
    }

    @Override // defpackage.p0p
    public final void T() {
    }
}
