package com.facebook.imagepipeline.producers;

import android.net.Uri;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.imagepipeline.producers.X;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import zendesk.core.Constants;

/* loaded from: classes2.dex */
public class D extends AbstractC3020d {

    /* renamed from: a, reason: collision with root package name */
    public int f30615a;

    /* renamed from: b, reason: collision with root package name */
    public String f30616b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f30617c;

    /* renamed from: d, reason: collision with root package name */
    public final ExecutorService f30618d;

    /* renamed from: e, reason: collision with root package name */
    public final K6.b f30619e;

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c f30620a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ X.a f30621b;

        public a(c cVar, X.a aVar) {
            this.f30620a = cVar;
            this.f30621b = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            D.this.e(this.f30620a, this.f30621b);
        }
    }

    public class b extends AbstractC3022f {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Future f30623a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ X.a f30624b;

        public b(Future future, X.a aVar) {
            this.f30623a = future;
            this.f30624b = aVar;
        }

        @Override // com.facebook.imagepipeline.producers.f0
        public void b() {
            if (this.f30623a.cancel(false)) {
                this.f30624b.a();
            }
        }
    }

    public static class c extends C {

        /* renamed from: f, reason: collision with root package name */
        public long f30626f;

        /* renamed from: g, reason: collision with root package name */
        public long f30627g;

        /* renamed from: h, reason: collision with root package name */
        public long f30628h;

        public c(InterfaceC3030n interfaceC3030n, e0 e0Var) {
            super(interfaceC3030n, e0Var);
        }
    }

    public D(int i10) {
        this(null, null, RealtimeSinceBootClock.get());
        this.f30615a = i10;
    }

    public static String c(String str, Object... objArr) {
        return String.format(Locale.getDefault(), str, objArr);
    }

    public static boolean g(int i10) {
        if (i10 == 307 || i10 == 308) {
            return true;
        }
        switch (i10) {
            case 300:
            case 301:
            case 302:
            case 303:
                return true;
            default:
                return false;
        }
    }

    public static boolean h(int i10) {
        return i10 >= 200 && i10 < 300;
    }

    public static HttpURLConnection j(Uri uri) {
        return (HttpURLConnection) com.facebook.common.util.f.r(uri).openConnection();
    }

    @Override // com.facebook.imagepipeline.producers.X
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public c createFetchState(InterfaceC3030n interfaceC3030n, e0 e0Var) {
        return new c(interfaceC3030n, e0Var);
    }

    public final HttpURLConnection b(Uri uri, int i10) {
        HttpURLConnection j10 = j(uri);
        String str = this.f30616b;
        if (str != null) {
            j10.setRequestProperty(Constants.USER_AGENT_HEADER_KEY, str);
        }
        Map map = this.f30617c;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                j10.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
        }
        j10.setConnectTimeout(this.f30615a);
        int responseCode = j10.getResponseCode();
        if (h(responseCode)) {
            return j10;
        }
        if (!g(responseCode)) {
            j10.disconnect();
            throw new IOException(String.format("Image URL %s returned HTTP code %d", uri.toString(), Integer.valueOf(responseCode)));
        }
        String headerField = j10.getHeaderField("Location");
        j10.disconnect();
        Uri parse = headerField == null ? null : Uri.parse(headerField);
        String scheme = uri.getScheme();
        if (i10 <= 0 || parse == null || D6.i.a(parse.getScheme(), scheme)) {
            throw new IOException(i10 == 0 ? c("URL %s follows too many redirects", uri.toString()) : c("URL %s returned %d without a valid redirect", uri.toString(), Integer.valueOf(responseCode)));
        }
        return b(parse, i10 - 1);
    }

    @Override // com.facebook.imagepipeline.producers.X
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void fetch(c cVar, X.a aVar) {
        cVar.f30626f = this.f30619e.now();
        cVar.b().k(new b(this.f30618d.submit(new a(cVar, aVar)), aVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0040 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void e(c cVar, X.a aVar) {
        HttpURLConnection httpURLConnection;
        InputStream inputStream = null;
        try {
            httpURLConnection = b(cVar.g(), 5);
            try {
                try {
                    cVar.f30627g = this.f30619e.now();
                    if (httpURLConnection != null) {
                        inputStream = httpURLConnection.getInputStream();
                        aVar.b(inputStream, -1);
                    }
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused) {
                        }
                    }
                    if (httpURLConnection == null) {
                        return;
                    }
                } catch (IOException e10) {
                    e = e10;
                    aVar.onFailure(e);
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    if (httpURLConnection == null) {
                        return;
                    }
                    httpURLConnection.disconnect();
                }
            } catch (Throwable th2) {
                th = th2;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused3) {
                    }
                }
                if (httpURLConnection != null) {
                    throw th;
                }
                httpURLConnection.disconnect();
                throw th;
            }
        } catch (IOException e11) {
            e = e11;
            httpURLConnection = null;
        } catch (Throwable th3) {
            th = th3;
            httpURLConnection = null;
            if (inputStream != null) {
            }
            if (httpURLConnection != null) {
            }
        }
        httpURLConnection.disconnect();
    }

    @Override // com.facebook.imagepipeline.producers.X
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Map getExtraMap(c cVar, int i10) {
        HashMap hashMap = new HashMap(4);
        hashMap.put("queue_time", Long.toString(cVar.f30627g - cVar.f30626f));
        hashMap.put("fetch_time", Long.toString(cVar.f30628h - cVar.f30627g));
        hashMap.put("total_time", Long.toString(cVar.f30628h - cVar.f30626f));
        hashMap.put("image_size", Integer.toString(i10));
        return hashMap;
    }

    @Override // com.facebook.imagepipeline.producers.X
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public void onFetchCompletion(c cVar, int i10) {
        cVar.f30628h = this.f30619e.now();
    }

    public D(String str, Map map, K6.b bVar) {
        this.f30618d = Executors.newFixedThreadPool(3);
        this.f30619e = bVar;
        this.f30617c = map;
        this.f30616b = str;
    }
}
