package com.apm.insight.k;

import com.apm.insight.CustomRequestHeader;
import com.apm.insight.MonitorCrash;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.ironsource.C4094gc;
import defpackage.bf3;
import defpackage.is8;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class i {
    private final String a;
    private HttpURLConnection b;
    private String c;
    private boolean d;
    private f e;
    private k f;

    public i(String str, String str2, boolean z) throws IOException {
        this.c = str2;
        this.d = z;
        String str3 = "AAA" + System.currentTimeMillis() + "AAA";
        this.a = str3;
        HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection()));
        this.b = httpURLConnection;
        httpURLConnection.setUseCaches(false);
        this.b.setDoOutput(true);
        this.b.setDoInput(true);
        this.b.setRequestMethod(C4094gc.b);
        CustomRequestHeader customRequestHeader = MonitorCrash.mCustomRequestHeader;
        if (customRequestHeader != null) {
            customRequestHeader.addRequestHeader(this.b);
        }
        this.b.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + str3);
        if (!z) {
            this.e = new f(this.b.getOutputStream());
        } else {
            this.b.setRequestProperty("Content-Encoding", "gzip");
            this.f = new k(this.b.getOutputStream());
        }
    }

    public final void a(String str, File file, Map<String, String> map) throws IOException {
        String name = file.getName();
        StringBuilder sb = new StringBuilder("--");
        bf3.v(sb, this.a, "\r\nContent-Disposition: form-data; name=\"", str, "\"; filename=\"");
        sb.append(name);
        sb.append("\"");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            sb.append("; ");
            sb.append(entry.getKey());
            sb.append("=\"");
            sb.append(entry.getValue());
            sb.append("\"");
        }
        sb.append("\r\nContent-Transfer-Encoding: binary\r\n\r\n");
        if (this.d) {
            this.f.write(sb.toString().getBytes());
        } else {
            this.e.write(sb.toString().getBytes());
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] bArr = new byte[8192];
        while (true) {
            int read = fileInputStream.read(bArr);
            if (read == -1) {
                break;
            } else if (this.d) {
                this.f.write(bArr, 0, read);
            } else {
                this.e.write(bArr, 0, read);
            }
        }
        fileInputStream.close();
        if (this.d) {
            this.f.write("\r\n".getBytes());
        } else {
            this.e.write("\r\n".getBytes());
            this.e.flush();
        }
    }

    public final void b(String str, String str2) {
        StringBuilder sb = new StringBuilder("--");
        bf3.v(sb, this.a, "\r\nContent-Disposition: form-data; name=\"", str, "\"\r\nContent-Type: text/plain; charset=");
        sb.append(this.c);
        sb.append("\r\n\r\n");
        try {
            if (this.d) {
                this.f.write(sb.toString().getBytes());
            } else {
                this.e.write(sb.toString().getBytes());
            }
        } catch (IOException unused) {
        }
        byte[] bytes = str2.getBytes();
        try {
            if (this.d) {
                this.f.write(bytes);
                this.f.write("\r\n".getBytes());
            } else {
                this.e.write(bytes);
                this.e.write("\r\n".getBytes());
            }
        } catch (IOException unused2) {
        }
    }

    public final void a(String str, File... fileArr) throws IOException {
        StringBuilder sb = new StringBuilder("--");
        bf3.v(sb, this.a, "\r\nContent-Disposition: form-data; name=\"", str, "\"; filename=\"");
        sb.append(str);
        sb.append("\"\r\nContent-Transfer-Encoding: binary\r\n\r\n");
        if (this.d) {
            this.f.write(sb.toString().getBytes());
        } else {
            this.e.write(sb.toString().getBytes());
        }
        if (this.d) {
            com.apm.insight.l.f.a(this.f, fileArr);
        } else {
            com.apm.insight.l.f.a(this.e, fileArr);
        }
        if (this.d) {
            this.f.write("\r\n".getBytes());
        } else {
            this.e.write("\r\n".getBytes());
            this.e.flush();
        }
    }

    public final void a(String str, String str2) {
        b(str, str2);
    }

    public final String a() throws IOException {
        ArrayList arrayList = new ArrayList();
        byte[] bytes = ("\r\n--" + this.a + "--\r\n").getBytes();
        if (this.d) {
            this.f.write(bytes);
            this.f.b();
            this.f.a();
        } else {
            this.e.write(bytes);
            this.e.flush();
            this.e.a();
        }
        int responseCode = this.b.getResponseCode();
        if (responseCode == 200) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.b.getInputStream()));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                arrayList.add(readLine);
            }
            bufferedReader.close();
            this.b.disconnect();
            StringBuilder sb = new StringBuilder();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                sb.append((String) it.next());
            }
            return sb.toString();
        }
        is8.e("Server returned non-OK status: ".concat(String.valueOf(responseCode)));
        return null;
    }
}
