package com.google.android.gms.measurement.internal;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.internal.measurement.zzib;
import com.twilio.voice.Constants;
import com.twilio.voice.EventKeys;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* loaded from: classes2.dex */
public final class C2 extends D6 {
    public C2(S6 s62) {
        super(s62);
    }

    @Override // com.google.android.gms.measurement.internal.D6
    public final boolean l() {
        return false;
    }

    public final boolean m() {
        j();
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f33578a.d().getSystemService("connectivity");
        NetworkInfo networkInfo = null;
        if (connectivityManager != null) {
            try {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        return networkInfo != null && networkInfo.isConnected();
    }

    public final void n(String str, E6 e62, zzib zzibVar, InterfaceC3408z2 interfaceC3408z2) {
        C2 c22;
        String str2;
        URL url;
        byte[] zzcc;
        h();
        j();
        try {
            url = new URI(e62.a()).toURL();
            this.f34418b.K0();
            zzcc = zzibVar.zzcc();
            c22 = this;
            str2 = str;
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
            c22 = this;
            str2 = str;
        }
        try {
            this.f33578a.b().w(new B2(c22, str2, url, zzcc, e62.b(), interfaceC3408z2));
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused2) {
            c22.f33578a.a().o().c("Failed to parse URL. Not uploading MeasurementBatch. appId", C3392x2.x(str2), e62.a());
        }
    }

    public final void o(D2 d22, Map map, InterfaceC3408z2 interfaceC3408z2) {
        C2 c22;
        URL url;
        h();
        j();
        AbstractC3191o.m(d22);
        AbstractC3191o.m(interfaceC3408z2);
        F6 C02 = this.f34418b.C0();
        Uri.Builder builder = new Uri.Builder();
        Uri.Builder appendQueryParameter = builder.scheme((String) AbstractC3209a2.f33867f.b(null)).encodedAuthority((String) AbstractC3209a2.f33870g.b(null)).path("config/app/".concat(String.valueOf(d22.r0()))).appendQueryParameter(EventKeys.PLATFORM, Constants.PLATFORM_ANDROID);
        C02.f33578a.w().A();
        appendQueryParameter.appendQueryParameter("gmp_version", String.valueOf(133005L)).appendQueryParameter("runtime_version", "0");
        String uri = builder.build().toString();
        try {
            url = new URI(uri).toURL();
            c22 = this;
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
            c22 = this;
        }
        try {
            this.f33578a.b().w(new B2(c22, d22.o0(), url, null, map, interfaceC3408z2));
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused2) {
            c22.f33578a.a().o().c("Failed to parse config URL. Not fetching. appId", C3392x2.x(d22.o0()), uri);
        }
    }
}
