package com.pgl.ssdk;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.ironsource.C4094gc;
import com.ironsource.L6;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.util.Locale;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class am {
    public static String a;
    private Context c;
    private int d;
    private int e;
    private byte[] f;
    private HttpURLConnection b = null;
    private int g = -1;
    private byte[] h = null;
    private int i = 10000;
    private int j = 0;
    private int k = 2;
    private boolean l = true;
    private Runnable m = new a();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (am.this.j == 0) {
                an.c();
            }
            if (am.this.c() || am.this.j >= am.this.k) {
                return;
            }
            am.b(am.this);
            ar.a(this);
        }
    }

    public am(Context context) {
        this.c = context;
    }

    private void a(int i) {
        this.b.setRequestMethod(i != 1 ? i != 3 ? i != 4 ? i != 5 ? i != 6 ? C4094gc.a : "TRACE" : "HEAD" : "DELETE" : "PUT" : C4094gc.b);
    }

    private void b(int i) {
        StringBuilder sb;
        String str;
        String str2 = i != 1 ? i != 2 ? "" : "application/octet-stream" : "application/json; charset=utf-8";
        if (!str2.isEmpty()) {
            this.b.addRequestProperty("Content-Type", str2);
        }
        String b = an.b();
        if (b != null) {
            this.b.addRequestProperty("x-pangle-target-idc", b);
        }
        b();
        try {
            String language = Locale.getDefault().getLanguage();
            boolean equalsIgnoreCase = language.equalsIgnoreCase("zh");
            HttpURLConnection httpURLConnection = this.b;
            if (equalsIgnoreCase) {
                sb = new StringBuilder();
                sb.append(Locale.getDefault().toString());
                sb.append(BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
                sb.append(language);
                str = ";q=0.9";
            } else {
                sb = new StringBuilder();
                sb.append(Locale.getDefault().toString());
                sb.append(BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
                sb.append(language);
                str = ";q=0.9,en-US;q=0.6,en;q=0.4";
            }
            sb.append(str);
            httpURLConnection.addRequestProperty("Accept-Language", sb.toString());
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d5, code lost:
    
        if (r0 != null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e5, code lost:
    
        r0.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e2, code lost:
    
        if (r0 == null) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean c() {
        InputStream inputStream;
        try {
            String a2 = an.a(this.c);
            if (TextUtils.isEmpty(a2)) {
                an.b(this.c);
                HttpURLConnection httpURLConnection = this.b;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                    this.b = null;
                }
                return false;
            }
            String str = a2 + a();
            if (!str.startsWith("https://") && !str.startsWith("http://")) {
                str = "https://".concat(str);
            }
            URL url = new URL(str);
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) ((URLConnection) (this.l ? FirebasePerfUrlConnection.instrument(url.openConnection(Proxy.NO_PROXY)) : FirebasePerfUrlConnection.instrument(url.openConnection())));
            this.b = httpURLConnection2;
            httpURLConnection2.setConnectTimeout(this.i);
            this.b.setReadTimeout(this.i);
            a(this.d);
            b(this.e);
            byte[] bArr = this.f;
            if (bArr != null && bArr.length > 0) {
                this.b.setDoOutput(true);
                OutputStream outputStream = this.b.getOutputStream();
                outputStream.write(this.f);
                outputStream.flush();
                outputStream.close();
            }
            this.b.connect();
            this.g = this.b.getResponseCode();
            inputStream = this.b.getInputStream();
            try {
                byte[] a3 = a(inputStream);
                this.h = a3;
                int i = this.g;
                if (i == 200) {
                    a(i, a3);
                    HttpURLConnection httpURLConnection3 = this.b;
                    if (httpURLConnection3 != null) {
                        httpURLConnection3.disconnect();
                        this.b = null;
                    }
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Throwable unused) {
                        }
                    }
                    return true;
                }
                HttpURLConnection httpURLConnection4 = this.b;
                if (httpURLConnection4 != null) {
                    httpURLConnection4.disconnect();
                    this.b = null;
                }
            } catch (Throwable unused2) {
                HttpURLConnection httpURLConnection5 = this.b;
                if (httpURLConnection5 != null) {
                    httpURLConnection5.disconnect();
                    this.b = null;
                }
            }
        } catch (Throwable unused3) {
            inputStream = null;
        }
        an.b(this.c);
        return false;
    }

    public abstract String a();

    public abstract void a(int i, byte[] bArr);

    public void a(int i, int i2, byte[] bArr) {
        b(i, i2, bArr);
        ar.a(this.m);
    }

    public static synchronized void a(String str) {
        synchronized (am.class) {
            if (!TextUtils.isEmpty(str) && !str.equals(a)) {
                a = str;
            }
        }
    }

    private byte[] a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr, 0, 1024);
            if (read <= 0) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    private void b() {
        Object obj;
        if (this.b == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(a)) {
                jSONObject.put("ipv6", a);
            }
            if (!TextUtils.isEmpty(com.pgl.ssdk.ces.b.c())) {
                jSONObject.put(L6.X0, com.pgl.ssdk.ces.b.c());
            }
            jSONObject.put(TtmlNode.TAG_REGION, an.a());
            Pair<Integer, String> a2 = aq.a(jSONObject.toString());
            if (a2 == null || (obj = a2.first) == null || a2.second == null) {
                return;
            }
            this.b.addRequestProperty("cypher", String.valueOf(obj));
            this.b.addRequestProperty("transfer-param", (String) a2.second);
        } catch (Exception unused) {
        }
    }

    public static /* synthetic */ int b(am amVar) {
        int i = amVar.j;
        amVar.j = i + 1;
        return i;
    }

    private void b(int i, int i2, byte[] bArr) {
        this.d = i;
        this.e = i2;
        this.f = bArr;
    }
}
