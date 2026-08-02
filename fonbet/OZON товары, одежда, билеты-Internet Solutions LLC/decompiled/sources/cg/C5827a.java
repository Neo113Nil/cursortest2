package cg;

import U7.d;
import V.e;
import Ve.Vi;
import We.A;
import We.C4876s;
import We.E;
import We.G;
import We.InterfaceC4865g;
import We.InterfaceC4866h;
import We.L;
import We.M;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Locale;
import javax.net.ssl.SSLException;
import org.maplibre.android.MapLibre;
import org.maplibre.android.http.NativeHttpRequest;
import sf.C9681g;

/* renamed from: cg.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C5827a implements Zf.a {

    /* renamed from: b, reason: collision with root package name */
    private static final String f57167b;

    /* renamed from: c, reason: collision with root package name */
    static InterfaceC4865g.a f57168c;

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC4865g f57169a;

    /* renamed from: cg.a$a, reason: collision with other inner class name */
    private static class C0866a implements InterfaceC4866h {

        /* renamed from: a, reason: collision with root package name */
        private NativeHttpRequest f57170a;

        C0866a(NativeHttpRequest nativeHttpRequest) {
            this.f57170a = nativeHttpRequest;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(InterfaceC4865g interfaceC4865g, Exception exc) {
            String message = exc.getMessage() != null ? exc.getMessage() : "Error processing the request";
            int i11 = ((exc instanceof NoRouteToHostException) || (exc instanceof UnknownHostException) || (exc instanceof SocketException) || (exc instanceof ProtocolException) || (exc instanceof SSLException)) ? 0 : exc instanceof InterruptedIOException ? 1 : 2;
            if (interfaceC4865g != null && interfaceC4865g.request() != null) {
                interfaceC4865g.request().j().getClass();
                Vi.a(i11 == 1 ? 3 : i11 == 0 ? 4 : 5, e.a("Request failed due to a ", i11 == 1 ? "temporary" : i11 == 0 ? "connection" : "permanent", " error: ", message, " "));
            }
            this.f57170a.handleFailure(i11, message);
        }

        @Override // We.InterfaceC4866h
        public final void onFailure(@NonNull InterfaceC4865g interfaceC4865g, @NonNull IOException iOException) {
            b(interfaceC4865g, iOException);
        }

        @Override // We.InterfaceC4866h
        public final void onResponse(@NonNull InterfaceC4865g interfaceC4865g, @NonNull L l11) {
            if (l11.v()) {
                Vi.a(2, "[HTTP] Request was successful (code = " + l11.m() + ").");
            } else {
                String w11 = !TextUtils.isEmpty(l11.w()) ? l11.w() : "No additional information";
                Vi.a(3, "[HTTP] Request with response = " + l11.m() + ": " + w11);
            }
            M c11 = l11.c();
            try {
                if (c11 == null) {
                    Vi.a(6, "[HTTP] Received empty response body");
                    return;
                }
                try {
                    byte[] bytes = c11.bytes();
                    l11.close();
                    this.f57170a.onResponse(l11.m(), L.q(l11, "ETag"), L.q(l11, "Last-Modified"), L.q(l11, "Cache-Control"), L.q(l11, "Expires"), L.q(l11, "Retry-After"), L.q(l11, "x-rate-limit-reset"), bytes);
                } catch (IOException e11) {
                    b(interfaceC4865g, e11);
                    l11.close();
                }
            } catch (Throwable th2) {
                l11.close();
                throw th2;
            }
        }
    }

    static {
        String str;
        Context applicationContext = MapLibre.getApplicationContext();
        try {
            PackageInfo packageInfo = applicationContext.getPackageManager().getPackageInfo(applicationContext.getPackageName(), 0);
            str = applicationContext.getPackageName() + "/" + packageInfo.versionName + " (" + packageInfo.versionCode + ")";
        } catch (Exception e11) {
            org.maplibre.android.b.b(e11);
            str = "";
        }
        String str2 = str + " MapLibre Android/13.0.1 (8e2d8d1) Android/" + Build.VERSION.SDK_INT + " (" + Build.SUPPORTED_ABIS[0] + ")";
        int length = str2.length();
        int i11 = 0;
        while (i11 < length) {
            int codePointAt = str2.codePointAt(i11);
            if (codePointAt <= 31 || codePointAt >= 127) {
                C9681g c9681g = new C9681g();
                c9681g.D0(0, i11, str2);
                while (i11 < length) {
                    int codePointAt2 = str2.codePointAt(i11);
                    c9681g.K0((codePointAt2 <= 31 || codePointAt2 >= 127) ? 63 : codePointAt2);
                    i11 += Character.charCount(codePointAt2);
                }
                str2 = c9681g.G0();
                f57167b = str2;
                E.a aVar = new E.a();
                C4876s c4876s = new C4876s();
                c4876s.h();
                aVar.i(c4876s);
                f57168c = new E(aVar);
            }
            i11 += Character.charCount(codePointAt);
        }
        f57167b = str2;
        E.a aVar2 = new E.a();
        C4876s c4876s2 = new C4876s();
        c4876s2.h();
        aVar2.i(c4876s2);
        f57168c = new E(aVar2);
    }

    public final void a() {
        InterfaceC4865g interfaceC4865g = this.f57169a;
        if (interfaceC4865g != null) {
            Vi.a(3, "[HTTP] This request was cancelled (" + interfaceC4865g.request().j() + "). This is expected for tiles that were being prefetched but are no longer needed for the map to render.");
            this.f57169a.cancel();
        }
    }

    public final void b(NativeHttpRequest nativeHttpRequest, @NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4, boolean z11) {
        C0866a c0866a = new C0866a(nativeHttpRequest);
        try {
            A.f33515l.getClass();
            A e11 = A.b.e(str);
            if (e11 == null) {
                Vi.a(6, "[HTTP] Unable to parse resourceUrl ".concat(str));
                return;
            }
            String h11 = e11.h();
            Locale locale = Vf.a.f32686a;
            String lowerCase = h11.toLowerCase(locale);
            int r11 = e11.r();
            if (lowerCase.equals("mapbox.com") || lowerCase.endsWith(".mapbox.com") || lowerCase.equals("mapbox.cn") || lowerCase.endsWith(".mapbox.cn")) {
                str = r11 == 0 ? str.concat("?") : str.concat("&");
                if (z11) {
                    str = d.e(str, "offline=true");
                }
            }
            G.a aVar = new G.a();
            aVar.k(str);
            aVar.i(Object.class, str.toLowerCase(locale));
            aVar.a("User-Agent", f57167b);
            if (str2.length() > 0) {
                aVar.a("Range", str2);
            }
            if (str3.length() > 0) {
                aVar.a("If-None-Match", str3);
            } else if (str4.length() > 0) {
                aVar.a("If-Modified-Since", str4);
            }
            InterfaceC4865g a11 = f57168c.a(aVar.b());
            this.f57169a = a11;
            a11.E0(c0866a);
        } catch (Exception e12) {
            c0866a.b(this.f57169a, e12);
        }
    }
}
