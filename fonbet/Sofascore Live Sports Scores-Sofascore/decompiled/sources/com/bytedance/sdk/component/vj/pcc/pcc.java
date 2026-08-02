package com.bytedance.sdk.component.vj.pcc;

import com.bytedance.sdk.component.utils.ork;
import com.bytedance.sdk.component.vj.vj;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.ironsource.C4094gc;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class pcc implements com.bytedance.sdk.component.vj.oo<gm> {
    private Map<String, String> pcc(HttpURLConnection httpURLConnection) {
        HashMap hashMap = new HashMap();
        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
        for (String str : headerFields.keySet()) {
            List<String> list = headerFields.get(str);
            if (list != null && list.size() > 0) {
                hashMap.put(str, list.get(0));
            }
        }
        return hashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v7 */
    @Override // com.bytedance.sdk.component.vj.oo
    /* renamed from: sf, reason: merged with bridge method [inline-methods] */
    public gm<byte[]> pcc(vj vjVar) {
        Closeable closeable;
        InputStream inputStream;
        byte[] bArr;
        ByteArrayOutputStream byteArrayOutputStream;
        String message;
        Closeable closeable2;
        HttpURLConnection httpURLConnection;
        InputStream inputStream2 = null;
        Map<String, String> map = null;
        int i = 0;
        try {
            try {
                httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(vjVar.pcc()).openConnection()));
                httpURLConnection.setRequestMethod(C4094gc.a);
                httpURLConnection.setConnectTimeout(5000);
                httpURLConnection.setReadTimeout(5000);
                httpURLConnection.connect();
                inputStream = httpURLConnection.getInputStream();
            } catch (Throwable th) {
                th = th;
            }
        } catch (MalformedURLException e) {
            e = e;
            inputStream = null;
            bArr = null;
        } catch (IOException e2) {
            e = e2;
            inputStream = null;
            bArr = null;
        } catch (Throwable th2) {
            th = th2;
            closeable = null;
            ork.pcc(inputStream2);
            ork.pcc(closeable);
            throw th;
        }
        try {
            byte[] bArr2 = new byte[1024];
            byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                try {
                    int read = inputStream.read(bArr2);
                    if (read == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr2, 0, read);
                } catch (MalformedURLException e3) {
                    e = e3;
                    bArr = null;
                } catch (IOException e4) {
                    e = e4;
                    bArr = null;
                }
            }
            i = 200;
            bArr = byteArrayOutputStream.toByteArray();
            try {
                map = vjVar.sf() ? pcc(httpURLConnection) : null;
                ork.pcc(inputStream);
                ork.pcc(byteArrayOutputStream);
                message = "success";
            } catch (MalformedURLException e5) {
                e = e5;
                e.getMessage();
                message = e.getMessage();
                closeable2 = byteArrayOutputStream;
                ork.pcc(inputStream);
                ork.pcc(closeable2);
                return new gm<>(i, bArr, message, map);
            } catch (IOException e6) {
                e = e6;
                e.getMessage();
                message = e.getMessage();
                closeable2 = byteArrayOutputStream;
                ork.pcc(inputStream);
                ork.pcc(closeable2);
                return new gm<>(i, bArr, message, map);
            }
        } catch (MalformedURLException e7) {
            e = e7;
            bArr = null;
            byteArrayOutputStream = bArr;
            e.getMessage();
            message = e.getMessage();
            closeable2 = byteArrayOutputStream;
            ork.pcc(inputStream);
            ork.pcc(closeable2);
            return new gm<>(i, bArr, message, map);
        } catch (IOException e8) {
            e = e8;
            bArr = null;
            byteArrayOutputStream = bArr;
            e.getMessage();
            message = e.getMessage();
            closeable2 = byteArrayOutputStream;
            ork.pcc(inputStream);
            ork.pcc(closeable2);
            return new gm<>(i, bArr, message, map);
        } catch (Throwable th3) {
            th = th3;
            closeable = null;
            inputStream2 = inputStream;
            ork.pcc(inputStream2);
            ork.pcc(closeable);
            throw th;
        }
        return new gm<>(i, bArr, message, map);
    }
}
