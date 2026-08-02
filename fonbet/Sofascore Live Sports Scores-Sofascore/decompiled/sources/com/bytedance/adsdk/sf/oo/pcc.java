package com.bytedance.adsdk.sf.oo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class pcc implements oo {
    private final HttpURLConnection pcc;

    public pcc(HttpURLConnection httpURLConnection) {
        this.pcc = httpURLConnection;
    }

    private String pcc(HttpURLConnection httpURLConnection) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine);
                    sb.append('\n');
                } else {
                    try {
                        break;
                    } catch (Exception unused) {
                    }
                }
            } finally {
                try {
                    bufferedReader.close();
                } catch (Exception unused2) {
                }
            }
        }
        return sb.toString();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.pcc.disconnect();
    }

    @Override // com.bytedance.adsdk.sf.oo.oo
    public String gm() {
        return this.pcc.getContentType();
    }

    @Override // com.bytedance.adsdk.sf.oo.oo
    public String oo() {
        try {
            if (pcc()) {
                return null;
            }
            return "Unable to fetch " + this.pcc.getURL() + ". Failed with " + this.pcc.getResponseCode() + "\n" + pcc(this.pcc);
        } catch (IOException e) {
            return e.getMessage();
        }
    }

    @Override // com.bytedance.adsdk.sf.oo.oo
    public InputStream sf() throws IOException {
        return this.pcc.getInputStream();
    }

    @Override // com.bytedance.adsdk.sf.oo.oo
    public boolean pcc() {
        return this.pcc.getResponseCode() / 100 == 2;
    }
}
