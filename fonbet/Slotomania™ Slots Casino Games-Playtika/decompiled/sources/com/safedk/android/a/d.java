package com.safedk.android.a;

import android.os.Build;
import com.google.common.net.HttpHeaders;
import com.safedk.android.utils.Logger;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes4.dex */
public class d {
    private static final String a = "MultipartUtility";
    private static final String c = "\r\n";
    private final String b;
    private final f d;
    private final String e;
    private final OutputStream f;
    private final PrintWriter g;
    private int h = 0;

    public d(String str, String str2, String str3, int i, Map<String, String> map) throws IOException {
        Logger.d(a, "ctor started, requestURL = ", str2);
        this.e = str3;
        this.b = "BOUNDARY-BOUNDARY" + System.currentTimeMillis() + "BOUNDARY";
        f fVar = new f(new URL(str2).openConnection());
        this.d = fVar;
        fVar.a(str);
        this.d.a(false);
        this.d.b(true);
        this.d.d(true);
        this.d.a("Content-Type", "multipart/form-data; boundary=" + this.b);
        this.d.a(HttpHeaders.USER_AGENT, "AppLovinQualityService/5.12.0 (Android " + Build.VERSION.RELEASE + ")");
        this.d.a(HttpHeaders.ACCEPT_ENCODING, "gzip,deflate");
        this.d.a(HttpHeaders.CONNECTION, "close");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            this.d.a(entry.getKey(), entry.getValue());
        }
        this.d.a(i);
        this.d.b(i);
        this.f = this.d.a();
        this.g = new PrintWriter((Writer) new OutputStreamWriter(this.f, str3), true);
    }

    public void a(String str, String str2) {
        this.g.append((CharSequence) "--").append((CharSequence) this.b).append((CharSequence) "\r\n");
        this.g.append((CharSequence) "Content-Disposition: form-data; name=\"").append((CharSequence) str).append((CharSequence) "\"").append((CharSequence) "\r\n");
        this.g.append((CharSequence) "Content-Type: text/plain; charset=").append((CharSequence) this.e).append((CharSequence) "\r\n");
        this.g.append((CharSequence) "\r\n");
        this.g.append((CharSequence) str2).append((CharSequence) "\r\n");
        this.g.flush();
    }

    public void a(String str, File file, boolean z) throws IOException {
        String name = file.getName();
        if (z) {
            this.g.append((CharSequence) "--").append((CharSequence) this.b).append((CharSequence) "\r\n");
            this.g.append((CharSequence) "Content-Disposition: form-data; name=\"").append((CharSequence) str).append((CharSequence) "\"; filename=\"").append((CharSequence) name).append((CharSequence) "\"").append((CharSequence) "\r\n");
            this.g.append((CharSequence) "Content-Type: application/octet-stream").append((CharSequence) "\r\n");
            this.g.append((CharSequence) "\r\n");
        }
        this.g.flush();
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] bArr = new byte[4096];
        while (true) {
            int read = fileInputStream.read(bArr);
            if (read != -1) {
                this.f.write(bArr, 0, read);
            } else {
                this.f.flush();
                fileInputStream.close();
                this.g.append((CharSequence) "\r\n");
                this.g.flush();
                return;
            }
        }
    }

    public void a(File file) throws IOException {
        this.g.flush();
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(this.f);
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] bArr = new byte[4096];
        while (true) {
            int read = fileInputStream.read(bArr);
            if (read != -1) {
                gZIPOutputStream.write(bArr, 0, read);
            } else {
                gZIPOutputStream.finish();
                gZIPOutputStream.close();
                fileInputStream.close();
                this.g.append((CharSequence) "\r\n");
                this.g.flush();
                return;
            }
        }
    }

    public void b(String str, String str2) {
        this.g.append((CharSequence) str).append((CharSequence) ": ").append((CharSequence) str2).append((CharSequence) "\r\n");
        this.g.flush();
    }

    public List<String> a() throws IOException {
        Logger.d(a, "finish started");
        ArrayList arrayList = new ArrayList();
        this.g.append((CharSequence) "\r\n").flush();
        this.g.append((CharSequence) "--").append((CharSequence) this.b).append((CharSequence) "--").append((CharSequence) "\r\n");
        this.g.close();
        int b = this.d.b();
        this.h = b;
        Logger.d(a, "Response code = ", Integer.valueOf(b));
        int i = this.h;
        if (i < 200 || i >= 300) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.d.g()));
            StringBuilder sb = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine);
                } else {
                    Logger.e(a, "Error message: ", sb);
                    throw new IOException("Server returned non-OK status: " + this.h);
                }
            }
        } else {
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(this.d.e()));
            while (true) {
                String readLine2 = bufferedReader2.readLine();
                if (readLine2 != null) {
                    arrayList.add(readLine2);
                } else {
                    bufferedReader2.close();
                    this.d.d();
                    return arrayList;
                }
            }
        }
    }

    public int b() {
        return this.h;
    }
}
