package com.ironsource;

import android.net.Uri;
import android.util.Pair;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class Z7 {
    private static final String a = "POST";
    private static final String b = "GET";
    private static final String c = "ISHttpService";

    public static Od a(String str, String str2, List<Pair<String, String>> list) throws Exception {
        Uri build = Uri.parse(str).buildUpon().encodedQuery(str2).build();
        a.C0195a c0195a = new a.C0195a();
        c0195a.c(build.toString()).a(str2).d("GET").a(list);
        return b(c0195a.a());
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
    
        if (r1 != null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x007a, code lost:
    
        r2.disconnect();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x007d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0075, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0066, code lost:
    
        r3 = r1.getResponseCode();
        r0.a = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x006e, code lost:
    
        if (r3 < 400) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0070, code lost:
    
        if (r2 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0072, code lost:
    
        r5 = r2;
        r2 = r1;
        r1 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0079, code lost:
    
        r2 = r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Od b(a aVar) throws Exception {
        HttpURLConnection httpURLConnection;
        InputStream inputStream;
        InputStream inputStream2;
        if (!a(aVar.a, aVar.c)) {
            throw new InvalidParameterException("not valid params");
        }
        Od od = new Od();
        InputStream inputStream3 = null;
        inputStream3 = null;
        inputStream3 = null;
        inputStream3 = null;
        inputStream3 = null;
        HttpURLConnection httpURLConnection2 = null;
        HttpURLConnection httpURLConnection3 = null;
        try {
            httpURLConnection = a(aVar);
        } catch (InterruptedIOException e) {
            e = e;
            inputStream2 = null;
            try {
                e.getMessage();
                throw e;
            } catch (Throwable th) {
                th = th;
                httpURLConnection = httpURLConnection2;
                inputStream3 = inputStream2;
                if (inputStream3 != null) {
                    inputStream3.close();
                }
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                throw th;
            }
        } catch (SSLException e2) {
            e = e2;
            inputStream2 = null;
            e.getMessage();
            throw e;
        } catch (IOException e3) {
            e = e3;
            inputStream = null;
        } catch (Throwable th2) {
            th = th2;
            httpURLConnection = null;
        }
        try {
            a(httpURLConnection, aVar.g);
            a(httpURLConnection, aVar);
            inputStream3 = httpURLConnection.getInputStream();
            od.a = httpURLConnection.getResponseCode();
            if (inputStream3 != null) {
                od.b = C4330tg.a(inputStream3);
            }
        } catch (InterruptedIOException e4) {
            e = e4;
            inputStream2 = inputStream3;
            httpURLConnection2 = httpURLConnection;
            e.getMessage();
            throw e;
        } catch (SSLException e5) {
            e = e5;
            inputStream2 = inputStream3;
            httpURLConnection2 = httpURLConnection;
            e.getMessage();
            throw e;
        } catch (IOException e6) {
            e = e6;
            inputStream = inputStream3;
            httpURLConnection3 = httpURLConnection;
            try {
                C4157k4.d().a(e);
                if (httpURLConnection3 != null && httpURLConnection3.getHeaderFields().isEmpty()) {
                    throw new Ec(e);
                }
                throw e;
            } catch (Throwable th3) {
                th = th3;
                InputStream inputStream4 = inputStream;
                httpURLConnection = httpURLConnection3;
                inputStream3 = inputStream4;
                if (inputStream3 != null) {
                }
                if (httpURLConnection != null) {
                }
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            if (inputStream3 != null) {
            }
            if (httpURLConnection != null) {
            }
            throw th;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class a {
        private static final int h = 15000;
        private static final int i = 15000;
        private static final String j = "UTF-8";
        final String a;
        final String b;
        final String c;
        final int d;
        final int e;
        final String f;
        ArrayList<Pair<String, String>> g;

        public a(C0195a c0195a) {
            this.a = c0195a.b;
            this.b = c0195a.c;
            this.c = c0195a.d;
            this.g = new ArrayList<>(c0195a.a);
            this.d = c0195a.e;
            this.e = c0195a.f;
            this.f = c0195a.g;
        }

        public boolean a() {
            return "POST".equals(this.b);
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        /* renamed from: com.ironsource.Z7$a$a, reason: collision with other inner class name */
        public static class C0195a {
            String b;
            String d;
            List<Pair<String, String>> a = new ArrayList();
            String c = "POST";
            int e = 15000;
            int f = 15000;
            String g = "UTF-8";

            public C0195a a(Pair<String, String> pair) {
                this.a.add(pair);
                return this;
            }

            public C0195a b(String str) {
                this.g = str;
                return this;
            }

            public C0195a c(String str) {
                this.b = str;
                return this;
            }

            public C0195a d(String str) {
                this.c = str;
                return this;
            }

            public C0195a b(int i) {
                this.f = i;
                return this;
            }

            public C0195a a(int i) {
                this.e = i;
                return this;
            }

            public C0195a a(String str) {
                this.d = str;
                return this;
            }

            public C0195a a(List<Pair<String, String>> list) {
                this.a.addAll(list);
                return this;
            }

            public a a() {
                return new a(this);
            }
        }
    }

    private static void a(HttpURLConnection httpURLConnection, a aVar) throws Exception {
        if (aVar.a()) {
            byte[] bytes = aVar.c.getBytes(aVar.f);
            httpURLConnection.setRequestProperty("Content-Length", Integer.toString(bytes.length));
            a(httpURLConnection, bytes);
        }
    }

    private static void a(HttpURLConnection httpURLConnection, List<Pair<String, String>> list) throws ProtocolException {
        for (Pair<String, String> pair : list) {
            httpURLConnection.setRequestProperty((String) pair.first, (String) pair.second);
        }
    }

    private static void a(HttpURLConnection httpURLConnection, byte[] bArr) throws Exception {
        httpURLConnection.setDoOutput(true);
        DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
        try {
            dataOutputStream.write(bArr);
            dataOutputStream.flush();
        } finally {
            dataOutputStream.close();
        }
    }

    private static boolean a(String str, String str2) {
        return (str == null || str.isEmpty() || str2 == null || str2.isEmpty()) ? false : true;
    }

    private static HttpURLConnection a(a aVar) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(aVar.a).openConnection()));
        httpURLConnection.setConnectTimeout(aVar.d);
        httpURLConnection.setReadTimeout(aVar.e);
        httpURLConnection.setRequestMethod(aVar.b);
        return httpURLConnection;
    }

    public static Od b(String str, String str2, List<Pair<String, String>> list) throws Exception {
        a.C0195a c0195a = new a.C0195a();
        c0195a.c(str).a(str2).d("POST").a(list);
        return b(c0195a.a());
    }
}
