package com.mbridge.msdk.click;

import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;
import ru.ok.android.commons.http.Http;
import xsna.wga0;

/* compiled from: SocketSpider.java */
/* loaded from: classes13.dex */
public class n {
    private static final AtomicInteger d = new AtomicInteger(1);
    private com.mbridge.msdk.setting.g a;
    private String b;
    private int c = 9377;

    public n() {
        com.mbridge.msdk.setting.g a = wga0.a(com.mbridge.msdk.setting.i.b());
        this.a = a;
        if (a == null) {
            this.a = com.mbridge.msdk.setting.i.b().a();
        }
    }

    private JSONObject b(String str, CampaignEx campaignEx, boolean z, boolean z2) {
        JSONObject jSONObject = new JSONObject();
        try {
            Uri parse = Uri.parse(str);
            if (parse != null) {
                String host = parse.getHost();
                String path = parse.getPath();
                String encodedQuery = parse.getEncodedQuery();
                this.b = host;
                jSONObject.put("uri", "https://" + host + path);
                jSONObject.put("data", encodedQuery);
            }
        } catch (Throwable th) {
            q0.b("SocketSpider", th.getMessage());
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            if (!z && !z2) {
                jSONObject2.put("User-Agent", m0.i());
            }
            if (campaignEx != null) {
                if (z && campaignEx.getcUA() == 1) {
                    jSONObject2.put("User-Agent", m0.i());
                }
                if (z2 && campaignEx.getImpUA() == 1) {
                    jSONObject2.put("User-Agent", m0.i());
                }
            } else {
                jSONObject2.put("User-Agent", m0.i());
            }
            jSONObject2.put("Accept-Encoding", Http.ContentEncoding.GZIP);
            if (this.a.O0() && !TextUtils.isEmpty(str)) {
                jSONObject2.put("referer", str);
            }
            jSONObject.put("header", jSONObject2);
        } catch (Throwable th2) {
            q0.b("SocketSpider", th2.getMessage());
        }
        return jSONObject;
    }

    public com.mbridge.msdk.click.entity.a a(String str, CampaignEx campaignEx, boolean z, boolean z2) {
        com.mbridge.msdk.click.entity.a aVar = new com.mbridge.msdk.click.entity.a();
        aVar.g = str;
        if (TextUtils.isEmpty(str)) {
            aVar.h = "request url can not null.";
            return aVar;
        }
        String replace = str.replace(" ", "%20");
        JSONObject b = b(replace, campaignEx, z, z2);
        if (b.length() == 0) {
            aVar.h = "request content generation failed.";
            return aVar;
        }
        if (TextUtils.isEmpty(b.optString("uri"))) {
            aVar.h = "request url parse error.";
            return aVar;
        }
        if (campaignEx != null) {
            int trackingTcpPort = campaignEx.getTrackingTcpPort();
            if (trackingTcpPort == 0) {
                trackingTcpPort = 9377;
            }
            this.c = trackingTcpPort;
        }
        if (!TextUtils.isEmpty(this.b)) {
            return a(replace, b.toString());
        }
        aVar.h = "request url parse error.";
        return aVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:(3:43|(1:45)(1:70)|46)|(7:48|49|50|(2:52|(1:54))|56|57|58)|64|65|66|58) */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x019c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x019d, code lost:
    
        com.mbridge.msdk.foundation.tools.q0.b("SocketSpider", r0.getMessage());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private com.mbridge.msdk.click.entity.a a(String str, String str2) {
        OutputStream outputStream;
        Socket socket;
        int length;
        InputStream inputStream;
        int i;
        boolean z;
        boolean z2;
        byte[] bArr;
        String str3;
        com.mbridge.msdk.click.entity.a aVar = new com.mbridge.msdk.click.entity.a();
        Socket socket2 = null;
        OutputStream outputStream2 = null;
        try {
            socket = new Socket(this.b, this.c);
            try {
                socket.setSoTimeout(15000);
                outputStream2 = socket.getOutputStream();
                ByteBuffer wrap = ByteBuffer.wrap(new byte[8]);
                ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
                wrap.order(byteOrder);
                wrap.put((byte) 2);
                wrap.put((byte) 3);
                wrap.putShort((short) d.getAndIncrement());
                if (TextUtils.isEmpty(str2)) {
                    wrap.putInt(0);
                    outputStream2.write(wrap.array());
                    length = 0;
                } else {
                    byte[] a = a(str2);
                    length = a.length;
                    wrap.putInt(length);
                    outputStream2.write(wrap.array());
                    outputStream2.write(a);
                }
                outputStream2.flush();
                q0.a("SocketSpider", "Socket Request : header : " + Arrays.toString(wrap.array()) + " length : " + length);
                inputStream = socket.getInputStream();
                byte[] bArr2 = new byte[8];
                inputStream.read(bArr2, 0, 8);
                ByteBuffer wrap2 = ByteBuffer.wrap(bArr2);
                wrap2.order(byteOrder);
                i = wrap2.getInt(4);
                byte b = bArr2[1];
                z = b == 3;
                z2 = b == 2;
                q0.b("SocketSpider", "Socket Response : header : " + Arrays.toString(bArr2) + " length : " + i + " isGzip : " + z);
                bArr = new byte[i];
                new DataInputStream(socket.getInputStream()).readFully(bArr);
                if (!z && i > 2 && ((bArr[0] << 8) | (bArr[1] & 255)) == 8075) {
                    z = true;
                }
            } catch (Throwable th) {
                th = th;
                outputStream = outputStream2;
                socket2 = socket;
                try {
                    q0.a("SocketSpider", "Socket exception: " + th.getMessage());
                    aVar.h = th.getMessage();
                    if (socket2 != null) {
                        try {
                            socket2.close();
                            if (outputStream != null) {
                                outputStream.close();
                            }
                        } catch (Exception e) {
                            q0.b("SocketSpider", e.getMessage());
                        }
                    }
                    return aVar;
                } finally {
                }
            }
        } catch (Throwable th2) {
            th = th2;
            outputStream = null;
        }
        if (z2 && i == 0) {
            aVar.f = 200;
            aVar.g = str;
            aVar.e = 0;
            try {
                socket.close();
                outputStream2.close();
                return aVar;
            } catch (Exception e2) {
                q0.b("SocketSpider", e2.getMessage());
                return aVar;
            }
        }
        if (i < 1) {
            aVar.f = 200;
            aVar.g = str;
            aVar.e = 0;
            try {
                socket.close();
                outputStream2.close();
                return aVar;
            } catch (Exception e3) {
                q0.b("SocketSpider", e3.getMessage());
                return aVar;
            }
        }
        try {
            if (z) {
                str3 = a(bArr);
            } else {
                str3 = new String(bArr);
            }
        } catch (Throwable th3) {
            q0.b("SocketSpider", th3.getMessage());
            aVar.h = th3.getMessage();
        }
        if (!TextUtils.isEmpty(str3)) {
            aVar.f = 200;
            aVar.g = str;
            aVar.e = 0;
            try {
                JSONObject optJSONObject = new JSONObject(str3).optJSONObject("data");
                if (optJSONObject != null) {
                    String optString = optJSONObject.optString("location");
                    if (!TextUtils.isEmpty(optString)) {
                        aVar.f = 302;
                        aVar.a = optString;
                    }
                }
            } catch (Throwable th4) {
                q0.b("SocketSpider", th4.getMessage());
            }
            try {
                socket.close();
                outputStream2.close();
            } catch (Exception e4) {
                q0.b("SocketSpider", e4.getMessage());
            }
            return aVar;
        }
        inputStream.close();
        socket.close();
        outputStream2.close();
        return aVar;
    }

    public byte[] a(String str) throws IOException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        gZIPOutputStream.write(str.getBytes());
        gZIPOutputStream.close();
        return byteArrayOutputStream.toByteArray();
    }

    public String a(byte[] bArr) throws IOException {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
        byte[] bArr2 = new byte[1024];
        while (true) {
            int read = gZIPInputStream.read(bArr2, 0, 1024);
            if (read > 0) {
                byteArrayOutputStream.write(bArr2, 0, read);
            } else {
                gZIPInputStream.close();
                byteArrayInputStream.close();
                byteArrayOutputStream.flush();
                byteArrayOutputStream.close();
                return byteArrayOutputStream.toString();
            }
        }
    }
}
