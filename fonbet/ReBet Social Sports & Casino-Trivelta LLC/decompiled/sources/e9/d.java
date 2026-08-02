package e9;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.appsflyer.AdRevenueScheme;
import com.facebook.hermes.intl.Constants;
import com.twilio.voice.VoiceURLConnection;
import d9.C4040c;
import e9.d;
import f9.AbstractC4268a;
import f9.j;
import f9.k;
import f9.l;
import f9.m;
import f9.n;
import f9.o;
import f9.p;
import g9.h;
import g9.i;
import h9.f;
import h9.g;
import h9.m;
import io.agora.rtc2.video.FaceShapeAreaOptions;
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
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import k9.AbstractC5213a;
import l9.AbstractC5416b;
import l9.InterfaceC5415a;
import l9.InterfaceC5417c;
import q9.InterfaceC6129a;
import qb.C6135c;
import qb.InterfaceC6133a;

/* loaded from: classes2.dex */
public final class d implements m {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC6133a f45829a;

    /* renamed from: b, reason: collision with root package name */
    public final ConnectivityManager f45830b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f45831c;

    /* renamed from: d, reason: collision with root package name */
    public final URL f45832d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC6129a f45833e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC6129a f45834f;

    /* renamed from: g, reason: collision with root package name */
    public final int f45835g;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final URL f45836a;

        /* renamed from: b, reason: collision with root package name */
        public final j f45837b;

        /* renamed from: c, reason: collision with root package name */
        public final String f45838c;

        public a(URL url, j jVar, String str) {
            this.f45836a = url;
            this.f45837b = jVar;
            this.f45838c = str;
        }

        public a a(URL url) {
            return new a(url, this.f45837b, this.f45838c);
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f45839a;

        /* renamed from: b, reason: collision with root package name */
        public final URL f45840b;

        /* renamed from: c, reason: collision with root package name */
        public final long f45841c;

        public b(int i10, URL url, long j10) {
            this.f45839a = i10;
            this.f45840b = url;
            this.f45841c = j10;
        }
    }

    public d(Context context, InterfaceC6129a interfaceC6129a, InterfaceC6129a interfaceC6129a2, int i10) {
        this.f45829a = j.b();
        this.f45831c = context;
        this.f45830b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f45832d = m(C4186a.f45820c);
        this.f45833e = interfaceC6129a2;
        this.f45834f = interfaceC6129a;
        this.f45835g = i10;
    }

    public static /* synthetic */ a d(a aVar, b bVar) {
        URL url = bVar.f45840b;
        if (url == null) {
            return null;
        }
        AbstractC5213a.b("CctTransportBackend", "Following redirect to: %s", url);
        return aVar.a(bVar.f45840b);
    }

    public static int f(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return o.b.UNKNOWN_MOBILE_SUBTYPE.b();
        }
        int subtype = networkInfo.getSubtype();
        if (subtype == -1) {
            return o.b.COMBINED.b();
        }
        if (o.b.a(subtype) != null) {
            return subtype;
        }
        return 0;
    }

    public static int g(NetworkInfo networkInfo) {
        return networkInfo == null ? o.c.NONE.b() : networkInfo.getType();
    }

    public static int h(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e10) {
            AbstractC5213a.d("CctTransportBackend", "Unable to find version code for package", e10);
            return -1;
        }
    }

    public static TelephonyManager j(Context context) {
        return (TelephonyManager) context.getSystemService("phone");
    }

    public static long k() {
        Calendar.getInstance();
        return TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
    }

    public static InputStream l(InputStream inputStream, String str) {
        return "gzip".equals(str) ? new GZIPInputStream(inputStream) : inputStream;
    }

    public static URL m(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e10) {
            throw new IllegalArgumentException("Invalid url: " + str, e10);
        }
    }

    @Override // h9.m
    public i a(i iVar) {
        NetworkInfo activeNetworkInfo = this.f45830b.getActiveNetworkInfo();
        return iVar.l().a("sdk-version", Build.VERSION.SDK_INT).c("model", Build.MODEL).c("hardware", Build.HARDWARE).c("device", Build.DEVICE).c("product", Build.PRODUCT).c("os-uild", Build.ID).c("manufacturer", Build.MANUFACTURER).c("fingerprint", Build.FINGERPRINT).b("tz-offset", k()).a("net-type", g(activeNetworkInfo)).a("mobile-subtype", f(activeNetworkInfo)).c(AdRevenueScheme.COUNTRY, Locale.getDefault().getCountry()).c(Constants.LOCALE, Locale.getDefault().getLanguage()).c("mcc_mnc", j(this.f45831c).getSimOperator()).c("application_build", Integer.toString(h(this.f45831c))).d();
    }

    @Override // h9.m
    public g b(f fVar) {
        j i10 = i(fVar);
        URL url = this.f45832d;
        if (fVar.c() != null) {
            try {
                C4186a c10 = C4186a.c(fVar.c());
                r3 = c10.d() != null ? c10.d() : null;
                if (c10.e() != null) {
                    url = m(c10.e());
                }
            } catch (IllegalArgumentException unused) {
                return g.a();
            }
        }
        try {
            b bVar = (b) AbstractC5416b.a(5, new a(url, i10, r3), new InterfaceC5415a() { // from class: e9.b
                @Override // l9.InterfaceC5415a
                public final Object apply(Object obj) {
                    d.b e10;
                    e10 = d.this.e((d.a) obj);
                    return e10;
                }
            }, new InterfaceC5417c() { // from class: e9.c
                @Override // l9.InterfaceC5417c
                public final Object a(Object obj, Object obj2) {
                    return d.d((d.a) obj, (d.b) obj2);
                }
            });
            int i11 = bVar.f45839a;
            if (i11 == 200) {
                return g.e(bVar.f45841c);
            }
            if (i11 < 500 && i11 != 404) {
                return i11 == 400 ? g.d() : g.a();
            }
            return g.f();
        } catch (IOException e10) {
            AbstractC5213a.d("CctTransportBackend", "Could not make request to the backend", e10);
            return g.f();
        }
    }

    public final b e(a aVar) {
        AbstractC5213a.f("CctTransportBackend", "Making request to: %s", aVar.f45836a);
        HttpURLConnection httpURLConnection = (HttpURLConnection) aVar.f45836a.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(this.f45835g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod(VoiceURLConnection.METHOD_TYPE_POST);
        httpURLConnection.setRequestProperty(zendesk.core.Constants.USER_AGENT_HEADER_KEY, String.format("datatransport/%s android/", "3.1.9"));
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = aVar.f45838c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    this.f45829a.a(aVar.f45837b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    AbstractC5213a.f("CctTransportBackend", "Status Code: %d", Integer.valueOf(responseCode));
                    AbstractC5213a.b("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                    AbstractC5213a.b("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new b(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream l10 = l(inputStream, httpURLConnection.getHeaderField("Content-Encoding"));
                        try {
                            b bVar = new b(responseCode, null, n.b(new BufferedReader(new InputStreamReader(l10))).c());
                            if (l10 != null) {
                                l10.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return bVar;
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
        } catch (ConnectException e10) {
            e = e10;
            AbstractC5213a.d("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new b(FaceShapeAreaOptions.FACE_SHAPE_AREA_EYEBROWPOSITION, null, 0L);
        } catch (UnknownHostException e11) {
            e = e11;
            AbstractC5213a.d("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new b(FaceShapeAreaOptions.FACE_SHAPE_AREA_EYEBROWPOSITION, null, 0L);
        } catch (IOException e12) {
            e = e12;
            AbstractC5213a.d("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new b(400, null, 0L);
        } catch (C6135c e13) {
            e = e13;
            AbstractC5213a.d("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new b(400, null, 0L);
        }
    }

    public final j i(f fVar) {
        l.a j10;
        HashMap hashMap = new HashMap();
        for (i iVar : fVar.b()) {
            String j11 = iVar.j();
            if (hashMap.containsKey(j11)) {
                ((List) hashMap.get(j11)).add(iVar);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(iVar);
                hashMap.put(j11, arrayList);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            i iVar2 = (i) ((List) entry.getValue()).get(0);
            m.a b10 = f9.m.a().f(p.DEFAULT).g(this.f45834f.a()).h(this.f45833e.a()).b(k.a().c(k.b.ANDROID_FIREBASE).b(AbstractC4268a.a().m(Integer.valueOf(iVar2.g("sdk-version"))).j(iVar2.b("model")).f(iVar2.b("hardware")).d(iVar2.b("device")).l(iVar2.b("product")).k(iVar2.b("os-uild")).h(iVar2.b("manufacturer")).e(iVar2.b("fingerprint")).c(iVar2.b(AdRevenueScheme.COUNTRY)).g(iVar2.b(Constants.LOCALE)).i(iVar2.b("mcc_mnc")).b(iVar2.b("application_build")).a()).a());
            try {
                b10.i(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                b10.j((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (i iVar3 : (List) entry.getValue()) {
                h e10 = iVar3.e();
                C4040c b11 = e10.b();
                if (b11.equals(C4040c.b("proto"))) {
                    j10 = l.j(e10.a());
                } else if (b11.equals(C4040c.b("json"))) {
                    j10 = l.i(new String(e10.a(), Charset.forName("UTF-8")));
                } else {
                    AbstractC5213a.g("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", b11);
                }
                j10.c(iVar3.f()).d(iVar3.k()).h(iVar3.h("tz-offset")).e(o.a().c(o.c.a(iVar3.g("net-type"))).b(o.b.a(iVar3.g("mobile-subtype"))).a());
                if (iVar3.d() != null) {
                    j10.b(iVar3.d());
                }
                arrayList3.add(j10.a());
            }
            b10.c(arrayList3);
            arrayList2.add(b10.a());
        }
        return j.a(arrayList2);
    }

    public d(Context context, InterfaceC6129a interfaceC6129a, InterfaceC6129a interfaceC6129a2) {
        this(context, interfaceC6129a, interfaceC6129a2, 130000);
    }
}
