package com.google.android.datatransport.cct;

import R6.a;
import R6.j;
import R6.k;
import R6.l;
import R6.m;
import R6.n;
import R6.o;
import R6.p;
import S6.m;
import T6.f;
import T6.g;
import T6.m;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.Log;
import b7.InterfaceC5572a;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import r8.InterfaceC9215a;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.fintech.ui.input.CounterView;
import t8.d;

/* loaded from: classes9.dex */
final class b implements m {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC9215a f57783a;

    /* renamed from: b, reason: collision with root package name */
    private final ConnectivityManager f57784b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f57785c;

    /* renamed from: d, reason: collision with root package name */
    final URL f57786d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC5572a f57787e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC5572a f57788f;

    /* renamed from: g, reason: collision with root package name */
    private final int f57789g;

    static final class a {

        /* renamed from: a, reason: collision with root package name */
        final URL f57790a;

        /* renamed from: b, reason: collision with root package name */
        final j f57791b;

        /* renamed from: c, reason: collision with root package name */
        final String f57792c;

        a(URL url, j jVar, String str) {
            this.f57790a = url;
            this.f57791b = jVar;
            this.f57792c = str;
        }
    }

    /* renamed from: com.google.android.datatransport.cct.b$b, reason: collision with other inner class name */
    static final class C0876b {

        /* renamed from: a, reason: collision with root package name */
        final int f57793a;

        /* renamed from: b, reason: collision with root package name */
        final URL f57794b;

        /* renamed from: c, reason: collision with root package name */
        final long f57795c;

        C0876b(int i11, URL url, long j11) {
            this.f57793a = i11;
            this.f57794b = url;
            this.f57795c = j11;
        }
    }

    b(Context context, InterfaceC5572a interfaceC5572a, InterfaceC5572a interfaceC5572a2) {
        d dVar = new d();
        R6.b.f24645a.configure(dVar);
        dVar.f();
        this.f57783a = dVar.e();
        this.f57785c = context;
        this.f57784b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f57786d = d(com.google.android.datatransport.cct.a.f57777c);
        this.f57787e = interfaceC5572a2;
        this.f57788f = interfaceC5572a;
        this.f57789g = 130000;
    }

    public static C0876b c(b bVar, a aVar) {
        bVar.getClass();
        URL url = aVar.f57790a;
        W6.a.d(url, "Making request to: %s");
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(bVar.f57789g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.1.9 android/");
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = aVar.f57792c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    bVar.f57783a.a(new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)), aVar.f57791b);
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    W6.a.d(Integer.valueOf(responseCode), "Status Code: %d");
                    W6.a.a(httpURLConnection.getHeaderField("Content-Type"), "CctTransportBackend", "Content-Type: %s");
                    W6.a.a(httpURLConnection.getHeaderField("Content-Encoding"), "CctTransportBackend", "Content-Encoding: %s");
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new C0876b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new C0876b(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                        try {
                            C0876b c0876b = new C0876b(responseCode, null, n.a(new BufferedReader(new InputStreamReader(gZIPInputStream))).b());
                            if (gZIPInputStream != null) {
                                gZIPInputStream.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return c0876b;
                        } finally {
                        }
                    } catch (Throwable th2) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                        }
                        throw th2;
                    }
                } finally {
                }
            } catch (Throwable th4) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                }
                throw th4;
            }
        } catch (ConnectException e11) {
            e = e11;
            W6.a.c("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new C0876b(CounterView.COUNTER_MAX_DEFAULT, null, 0L);
        } catch (UnknownHostException e12) {
            e = e12;
            W6.a.c("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new C0876b(CounterView.COUNTER_MAX_DEFAULT, null, 0L);
        } catch (IOException e13) {
            e = e13;
            W6.a.c("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new C0876b(400, null, 0L);
        } catch (r8.b e14) {
            e = e14;
            W6.a.c("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new C0876b(400, null, 0L);
        }
    }

    private static URL d(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e11) {
            throw new IllegalArgumentException(Nk.a.b("Invalid url: ", str), e11);
        }
    }

    @Override // T6.m
    public final g a(f fVar) {
        int i11;
        String b11;
        C0876b c11;
        l.a i12;
        HashMap hashMap = new HashMap();
        Iterator it = ((ArrayList) fVar.b()).iterator();
        while (it.hasNext()) {
            S6.m mVar = (S6.m) it.next();
            String j11 = mVar.j();
            if (hashMap.containsKey(j11)) {
                ((List) hashMap.get(j11)).add(mVar);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(mVar);
                hashMap.put(j11, arrayList);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = hashMap.entrySet().iterator();
        while (true) {
            i11 = 5;
            if (!it2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it2.next();
            S6.m mVar2 = (S6.m) ((List) entry.getValue()).get(0);
            m.a a11 = R6.m.a();
            a11.f(p.DEFAULT);
            a11.g(this.f57788f.t());
            a11.h(this.f57787e.t());
            k.a a12 = k.a();
            a12.c(k.b.ANDROID_FIREBASE);
            a.AbstractC0490a a13 = R6.a.a();
            a13.m(Integer.valueOf(mVar2.g("sdk-version")));
            a13.j(mVar2.b("model"));
            a13.f(mVar2.b("hardware"));
            a13.d(mVar2.b("device"));
            a13.l(mVar2.b(ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME));
            a13.k(mVar2.b("os-uild"));
            a13.h(mVar2.b("manufacturer"));
            a13.e(mVar2.b("fingerprint"));
            a13.c(mVar2.b("country"));
            a13.g(mVar2.b("locale"));
            a13.i(mVar2.b("mcc_mnc"));
            a13.b(mVar2.b("application_build"));
            a12.b(a13.a());
            a11.b(a12.a());
            try {
                a11.i(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                a11.j((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (S6.m mVar3 : (List) entry.getValue()) {
                S6.l e11 = mVar3.e();
                Q6.c b12 = e11.b();
                if (b12.equals(Q6.c.b("proto"))) {
                    i12 = l.i(e11.a());
                } else if (b12.equals(Q6.c.b("json"))) {
                    i12 = l.h(new String(e11.a(), Charset.forName("UTF-8")));
                } else {
                    String concat = "TRuntime.".concat("CctTransportBackend");
                    if (Log.isLoggable(concat, 5)) {
                        Log.w(concat, "Received event of unsupported encoding " + b12 + ". Skipping...");
                    }
                }
                i12.c(mVar3.f());
                i12.d(mVar3.k());
                i12.f(mVar3.h());
                o.a a14 = o.a();
                a14.c(o.c.a(mVar3.g("net-type")));
                a14.b(o.b.a(mVar3.g("mobile-subtype")));
                i12.e(a14.a());
                if (mVar3.d() != null) {
                    i12.b(mVar3.d());
                }
                arrayList3.add(i12.a());
            }
            a11.c(arrayList3);
            arrayList2.add(a11.a());
        }
        j a15 = j.a(arrayList2);
        byte[] c12 = fVar.c();
        URL url = this.f57786d;
        if (c12 != null) {
            try {
                com.google.android.datatransport.cct.a a16 = com.google.android.datatransport.cct.a.a(fVar.c());
                b11 = a16.b() != null ? a16.b() : null;
                if (a16.c() != null) {
                    url = d(a16.c());
                }
            } catch (IllegalArgumentException unused2) {
                return g.a();
            }
        } else {
            b11 = null;
        }
        try {
            a aVar = new a(url, a15, b11);
            do {
                c11 = c(this, aVar);
                URL url2 = c11.f57794b;
                if (url2 != null) {
                    W6.a.a(url2, "CctTransportBackend", "Following redirect to: %s");
                    aVar = new a(url2, aVar.f57791b, aVar.f57792c);
                } else {
                    aVar = null;
                }
                if (aVar == null) {
                    break;
                }
                i11--;
            } while (i11 >= 1);
            int i13 = c11.f57793a;
            if (i13 == 200) {
                return g.e(c11.f57795c);
            }
            if (i13 < 500 && i13 != 404) {
                return i13 == 400 ? g.d() : g.a();
            }
            return g.f();
        } catch (IOException e12) {
            W6.a.c("CctTransportBackend", "Could not make request to the backend", e12);
            return g.f();
        }
    }

    @Override // T6.m
    public final S6.m b(S6.m mVar) {
        int subtype;
        NetworkInfo activeNetworkInfo = this.f57784b.getActiveNetworkInfo();
        m.a l11 = mVar.l();
        l11.a(Build.VERSION.SDK_INT, "sdk-version");
        l11.c("model", Build.MODEL);
        l11.c("hardware", Build.HARDWARE);
        l11.c("device", Build.DEVICE);
        l11.c(ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME, Build.PRODUCT);
        l11.c("os-uild", Build.ID);
        l11.c("manufacturer", Build.MANUFACTURER);
        l11.c("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        l11.b(TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000);
        l11.a(activeNetworkInfo == null ? o.c.NONE.b() : activeNetworkInfo.getType(), "net-type");
        int i11 = -1;
        if (activeNetworkInfo == null) {
            subtype = o.b.UNKNOWN_MOBILE_SUBTYPE.b();
        } else {
            subtype = activeNetworkInfo.getSubtype();
            if (subtype == -1) {
                subtype = o.b.COMBINED.b();
            } else if (o.b.a(subtype) == null) {
                subtype = 0;
            }
        }
        l11.a(subtype, "mobile-subtype");
        l11.c("country", Locale.getDefault().getCountry());
        l11.c("locale", Locale.getDefault().getLanguage());
        Context context = this.f57785c;
        l11.c("mcc_mnc", ((TelephonyManager) context.getSystemService("phone")).getSimOperator());
        try {
            i11 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e11) {
            W6.a.c("CctTransportBackend", "Unable to find version code for package", e11);
        }
        l11.c("application_build", Integer.toString(i11));
        return l11.d();
    }
}
