package com.ironsource;

import android.net.Uri;
import android.util.Pair;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLException;
import ru.ok.android.commons.http.Http;

/* renamed from: com.ironsource.c8, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C4259c8 {
    private static final String a = "POST";
    private static final String b = "GET";
    private static final String c = "ISHttpService";

    /* renamed from: com.ironsource.c8$a */
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

        /* renamed from: com.ironsource.c8$a$a, reason: collision with other inner class name */
        public static class C0214a {
            String b;
            String d;
            List<Pair<String, String>> a = new ArrayList();
            String c = "POST";
            int e = 15000;
            int f = 15000;
            String g = "UTF-8";

            public C0214a a(String str) {
                this.d = str;
                return this;
            }

            public C0214a b(String str) {
                this.g = str;
                return this;
            }

            public C0214a c(String str) {
                this.b = str;
                return this;
            }

            public C0214a d(String str) {
                this.c = str;
                return this;
            }

            public C0214a a(int i) {
                this.e = i;
                return this;
            }

            public C0214a b(int i) {
                this.f = i;
                return this;
            }

            public C0214a a(Pair<String, String> pair) {
                this.a.add(pair);
                return this;
            }

            public C0214a a(List<Pair<String, String>> list) {
                this.a.addAll(list);
                return this;
            }

            public a a() {
                return new a(this);
            }
        }

        public a(C0214a c0214a) {
            this.a = c0214a.b;
            this.b = c0214a.c;
            this.c = c0214a.d;
            this.g = new ArrayList<>(c0214a.a);
            this.d = c0214a.e;
            this.e = c0214a.f;
            this.f = c0214a.g;
        }

        public boolean a() {
            return "POST".equals(this.b);
        }
    }

    public static Pd a(String str, String str2, List<Pair<String, String>> list) throws Exception {
        Uri build = Uri.parse(str).buildUpon().encodedQuery(str2).build();
        a.C0214a c0214a = new a.C0214a();
        c0214a.c(build.toString()).a(str2).d("GET").a(list);
        return b(c0214a.a());
    }

    public static Pd b(String str, String str2, List<Pair<String, String>> list) throws Exception {
        a.C0214a c0214a = new a.C0214a();
        c0214a.c(str).a(str2).d("POST").a(list);
        return b(c0214a.a());
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
    public static Pd b(a aVar) throws Exception {
        HttpURLConnection httpURLConnection;
        InputStream inputStream;
        InputStream inputStream2;
        if (a(aVar.a, aVar.c)) {
            Pd pd = new Pd();
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
                pd.a = httpURLConnection.getResponseCode();
                if (inputStream3 != null) {
                    pd.b = C4625wg.a(inputStream3);
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
                    C4452n4.d().a(e);
                    if (httpURLConnection3 != null && httpURLConnection3.getHeaderFields().isEmpty()) {
                        throw new Fc(e);
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
        } else {
            throw new InvalidParameterException("not valid params");
        }
    }

    private static void a(HttpURLConnection httpURLConnection, a aVar) throws Exception {
        if (aVar.a()) {
            byte[] bytes = aVar.c.getBytes(aVar.f);
            httpURLConnection.setRequestProperty(Http.Header.CONTENT_LENGTH, Integer.toString(bytes.length));
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
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(aVar.a).openConnection();
        httpURLConnection.setConnectTimeout(aVar.d);
        httpURLConnection.setReadTimeout(aVar.e);
        httpURLConnection.setRequestMethod(aVar.b);
        return httpURLConnection;
    }
}
