package com.ironsource;

import android.text.TextUtils;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.ironsource.InterfaceC4035d7;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.p;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.b7, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3999b7 {
    private static final int a = 15000;
    private static final String b = "GET";
    private static final String c = "POST";
    private static final String d = "UTF-8";
    public static final String e = "ERROR:";
    private static final String f = "Bad Request - 400";
    private static final ExecutorService g = Executors.newSingleThreadExecutor();

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.b7$a */
    public class a implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ String b;
        final /* synthetic */ InterfaceC4017c7 c;

        public a(String str, String str2, InterfaceC4017c7 interfaceC4017c7) {
            this.a = str;
            this.b = str2;
            this.c = interfaceC4017c7;
        }

        @Override // java.lang.Runnable
        public void run() {
            HttpURLConnection httpURLConnection;
            OutputStream outputStream = null;
            try {
                httpURLConnection = C3999b7.b(this.a);
                try {
                    try {
                        outputStream = httpURLConnection.getOutputStream();
                        C3999b7.a(this.b, outputStream);
                        int responseCode = httpURLConnection.getResponseCode();
                        boolean z = responseCode == 200;
                        if (!z) {
                            IronLog.INTERNAL.error("invalid response code " + responseCode + " sending request");
                        }
                        this.c.a(z);
                    } catch (Exception e) {
                        e = e;
                        C4157k4.d().a(e);
                        IronLog.INTERNAL.error("exception while sending request " + e.getMessage());
                        this.c.a(false);
                        C3999b7.a(outputStream, httpURLConnection, (BufferedReader) null);
                    }
                } catch (Throwable th) {
                    th = th;
                    C3999b7.a(outputStream, httpURLConnection, (BufferedReader) null);
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
                httpURLConnection = null;
            } catch (Throwable th2) {
                th = th2;
                httpURLConnection = null;
                C3999b7.a(outputStream, httpURLConnection, (BufferedReader) null);
                throw th;
            }
            C3999b7.a(outputStream, httpURLConnection, (BufferedReader) null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.net.HttpURLConnection, java.net.URLConnection] */
    public static InterfaceC4035d7 a(String str, String str2) {
        OutputStream outputStream;
        Exception e2;
        Exception e3;
        BufferedReader bufferedReader;
        ?? r1 = 0;
        r1 = 0;
        r1 = 0;
        try {
            try {
                str = b(str);
                try {
                    str.setRequestProperty("Content-Type", "application/json; charset=utf-8");
                    outputStream = str.getOutputStream();
                } catch (Exception e4) {
                    e2 = e4;
                    outputStream = null;
                } catch (Throwable th) {
                    th = th;
                    outputStream = null;
                }
            } catch (Throwable th2) {
                r1 = str2;
                th = th2;
            }
            try {
                a(str2, outputStream);
                int responseCode = str.getResponseCode();
                if (responseCode != 200) {
                    InterfaceC4035d7.a.b bVar = new InterfaceC4035d7.a.b(responseCode, str.getResponseMessage());
                    a(outputStream, (HttpURLConnection) str, (BufferedReader) null);
                    return bVar;
                }
                bufferedReader = new BufferedReader(new InputStreamReader(str.getInputStream()));
                try {
                    String a2 = a(bufferedReader);
                    if (a2 != null) {
                        InterfaceC4035d7.b bVar2 = new InterfaceC4035d7.b(a2);
                        a(outputStream, (HttpURLConnection) str, bufferedReader);
                        return bVar2;
                    }
                    InterfaceC4035d7.a.c cVar = new InterfaceC4035d7.a.c();
                    a(outputStream, (HttpURLConnection) str, bufferedReader);
                    return cVar;
                } catch (Exception e5) {
                    e3 = e5;
                    C4157k4.d().a(e3);
                    IronLog.INTERNAL.error("exception while sending request " + e3.getMessage());
                    InterfaceC4035d7.a.C1199a c1199a = new InterfaceC4035d7.a.C1199a(e3);
                    a(outputStream, (HttpURLConnection) str, bufferedReader);
                    return c1199a;
                }
            } catch (Exception e6) {
                e2 = e6;
                e3 = e2;
                bufferedReader = null;
                C4157k4.d().a(e3);
                IronLog.INTERNAL.error("exception while sending request " + e3.getMessage());
                InterfaceC4035d7.a.C1199a c1199a2 = new InterfaceC4035d7.a.C1199a(e3);
                a(outputStream, (HttpURLConnection) str, bufferedReader);
                return c1199a2;
            } catch (Throwable th3) {
                th = th3;
                a(outputStream, (HttpURLConnection) str, (BufferedReader) r1);
                throw th;
            }
        } catch (Exception e7) {
            e2 = e7;
            str = 0;
            outputStream = null;
        } catch (Throwable th4) {
            th = th4;
            str = 0;
            outputStream = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static HttpURLConnection b(String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection()));
        httpURLConnection.setReadTimeout(15000);
        httpURLConnection.setConnectTimeout(15000);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setDoInput(true);
        httpURLConnection.setDoOutput(true);
        return httpURLConnection;
    }

    public static String a(String str) throws Exception {
        return a(str, (p.c) null);
    }

    public static String a(String str, p.c cVar) {
        HttpURLConnection httpURLConnection;
        BufferedReader bufferedReader;
        Exception e2;
        BufferedReader bufferedReader2;
        Throwable th;
        try {
            httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection()));
        } catch (Exception e3) {
            e = e3;
            httpURLConnection = null;
        } catch (Throwable th2) {
            th = th2;
            httpURLConnection = null;
            bufferedReader = null;
        }
        try {
            httpURLConnection.setReadTimeout(15000);
            httpURLConnection.setConnectTimeout(15000);
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.setDoInput(true);
            httpURLConnection.connect();
            if (httpURLConnection.getResponseCode() == 400) {
                if (cVar != null) {
                    cVar.a("Bad Request - 400");
                }
                a((OutputStream) null, httpURLConnection, (BufferedReader) null);
                return null;
            }
            bufferedReader2 = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
            try {
                String a2 = a(bufferedReader2);
                a((OutputStream) null, httpURLConnection, bufferedReader2);
                return a2;
            } catch (Exception e4) {
                e2 = e4;
                try {
                    C4157k4.d().a(e2);
                    a((OutputStream) null, httpURLConnection, bufferedReader2);
                    return null;
                } catch (Throwable th3) {
                    bufferedReader = bufferedReader2;
                    th = th3;
                    BufferedReader bufferedReader3 = bufferedReader;
                    th = th;
                    bufferedReader2 = bufferedReader3;
                    a((OutputStream) null, httpURLConnection, bufferedReader2);
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                a((OutputStream) null, httpURLConnection, bufferedReader2);
                throw th;
            }
        } catch (Exception e5) {
            e = e5;
            e2 = e;
            bufferedReader2 = null;
            C4157k4.d().a(e2);
            a((OutputStream) null, httpURLConnection, bufferedReader2);
            return null;
        } catch (Throwable th5) {
            th = th5;
            bufferedReader = null;
            BufferedReader bufferedReader32 = bufferedReader;
            th = th;
            bufferedReader2 = bufferedReader32;
            a((OutputStream) null, httpURLConnection, bufferedReader2);
            throw th;
        }
    }

    public static void a(String str, String str2, InterfaceC4017c7 interfaceC4017c7) {
        g.submit(new a(str, str2, interfaceC4017c7));
    }

    @Nullable
    public static String a(String str, String str2, p.c cVar) {
        InterfaceC4035d7 a2 = a(str, str2);
        if (a2 instanceof InterfaceC4035d7.a) {
            InterfaceC4035d7.a aVar = (InterfaceC4035d7.a) a2;
            if (aVar.b()) {
                return null;
            }
            cVar.a(aVar.a());
            return null;
        }
        return ((InterfaceC4035d7.b) a2).d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(String str, OutputStream outputStream) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, "UTF-8"));
        bufferedWriter.write(str);
        bufferedWriter.flush();
        bufferedWriter.close();
    }

    @Nullable
    private static String a(BufferedReader bufferedReader) throws IOException {
        StringBuilder sb = new StringBuilder();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                break;
            }
            sb.append(readLine);
        }
        String sb2 = sb.toString();
        if (TextUtils.isEmpty(sb2)) {
            return null;
        }
        return sb2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(OutputStream outputStream, HttpURLConnection httpURLConnection, BufferedReader bufferedReader) {
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException e2) {
                C4157k4.d().a(e2);
                IronLog.INTERNAL.error("exception while closing output stream " + e2.getMessage());
            }
        }
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        if (bufferedReader != null) {
            try {
                bufferedReader.close();
            } catch (IOException e3) {
                C4157k4.d().a(e3);
                IronLog.INTERNAL.error("exception while closing reader " + e3.getMessage());
            }
        }
    }
}
