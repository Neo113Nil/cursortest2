package com.mbridge.msdk.foundation.same.net;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.URLEncoder;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;

/* compiled from: SocketManager.java */
/* loaded from: classes13.dex */
public class f {
    private static volatile AtomicInteger b = new AtomicInteger(1);
    private ThreadPoolExecutor a;

    /* compiled from: SocketManager.java */
    public class a implements ThreadFactory {
        public a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
            newThread.setName("SocketThreadPool");
            return newThread;
        }
    }

    /* compiled from: SocketManager.java */
    public class b implements Runnable {
        final /* synthetic */ c a;

        public b(c cVar) {
            this.a = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.a();
        }
    }

    /* compiled from: SocketManager.java */
    public static final class d {
        private static f a = new f(null);
    }

    public /* synthetic */ f(a aVar) {
        this();
    }

    public static f b() {
        return d.a;
    }

    private f() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 5, 5L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new a(), new ThreadPoolExecutor.DiscardPolicy());
        this.a = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
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

    public void a(String str, int i, String str2, boolean z, com.mbridge.msdk.foundation.same.net.b bVar, boolean z2) {
        if (z2) {
            try {
                JSONObject jSONObject = new JSONObject(str2);
                jSONObject.put("data", "p=" + URLEncoder.encode(v0.b(jSONObject.optString("data"), "ebmclXzZOhtU2sRlZxGL8A"), C.UTF8_NAME));
                str2 = jSONObject.toString();
            } catch (Exception e) {
                q0.b("SocketManager", "send error", e);
            }
        }
        this.a.execute(new b(new c(str, i, str2, z, bVar)));
    }

    /* compiled from: SocketManager.java */
    public class c {
        private ByteBuffer a;
        private String b;
        private boolean c;
        private com.mbridge.msdk.foundation.same.net.b d;
        private OutputStream e;
        private int f;
        private Socket g;
        private String h;

        public c(String str, int i, String str2, boolean z, com.mbridge.msdk.foundation.same.net.b bVar) {
            this.b = str;
            this.f = i;
            this.h = str2;
            this.c = z;
            this.d = bVar;
        }

        /* JADX WARN: Finally extract failed */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:110:0x0143  */
        /* JADX WARN: Removed duplicated region for block: B:111:0x013c  */
        /* JADX WARN: Removed duplicated region for block: B:112:0x00cc A[Catch: all -> 0x0041, TryCatch #4 {all -> 0x0041, blocks: (B:3:0x0010, B:5:0x0030, B:9:0x0045, B:11:0x008e, B:12:0x00a4, B:14:0x00ba, B:15:0x00f5, B:21:0x0144, B:25:0x017a, B:28:0x0188, B:43:0x01a9, B:56:0x01d4, B:69:0x01f6, B:71:0x01fb, B:82:0x0209, B:90:0x0286, B:106:0x0270, B:109:0x0283, B:112:0x00cc, B:114:0x00d0, B:115:0x00df, B:116:0x00d9, B:117:0x0096, B:120:0x00a1, B:85:0x0229, B:86:0x0238, B:88:0x023e, B:89:0x0245, B:103:0x0232), top: B:2:0x0010, inners: #1 }] */
        /* JADX WARN: Removed duplicated region for block: B:117:0x0096 A[Catch: all -> 0x0041, TryCatch #4 {all -> 0x0041, blocks: (B:3:0x0010, B:5:0x0030, B:9:0x0045, B:11:0x008e, B:12:0x00a4, B:14:0x00ba, B:15:0x00f5, B:21:0x0144, B:25:0x017a, B:28:0x0188, B:43:0x01a9, B:56:0x01d4, B:69:0x01f6, B:71:0x01fb, B:82:0x0209, B:90:0x0286, B:106:0x0270, B:109:0x0283, B:112:0x00cc, B:114:0x00d0, B:115:0x00df, B:116:0x00d9, B:117:0x0096, B:120:0x00a1, B:85:0x0229, B:86:0x0238, B:88:0x023e, B:89:0x0245, B:103:0x0232), top: B:2:0x0010, inners: #1 }] */
        /* JADX WARN: Removed duplicated region for block: B:11:0x008e A[Catch: all -> 0x0041, TryCatch #4 {all -> 0x0041, blocks: (B:3:0x0010, B:5:0x0030, B:9:0x0045, B:11:0x008e, B:12:0x00a4, B:14:0x00ba, B:15:0x00f5, B:21:0x0144, B:25:0x017a, B:28:0x0188, B:43:0x01a9, B:56:0x01d4, B:69:0x01f6, B:71:0x01fb, B:82:0x0209, B:90:0x0286, B:106:0x0270, B:109:0x0283, B:112:0x00cc, B:114:0x00d0, B:115:0x00df, B:116:0x00d9, B:117:0x0096, B:120:0x00a1, B:85:0x0229, B:86:0x0238, B:88:0x023e, B:89:0x0245, B:103:0x0232), top: B:2:0x0010, inners: #1 }] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x00ba A[Catch: all -> 0x0041, TryCatch #4 {all -> 0x0041, blocks: (B:3:0x0010, B:5:0x0030, B:9:0x0045, B:11:0x008e, B:12:0x00a4, B:14:0x00ba, B:15:0x00f5, B:21:0x0144, B:25:0x017a, B:28:0x0188, B:43:0x01a9, B:56:0x01d4, B:69:0x01f6, B:71:0x01fb, B:82:0x0209, B:90:0x0286, B:106:0x0270, B:109:0x0283, B:112:0x00cc, B:114:0x00d0, B:115:0x00df, B:116:0x00d9, B:117:0x0096, B:120:0x00a1, B:85:0x0229, B:86:0x0238, B:88:0x023e, B:89:0x0245, B:103:0x0232), top: B:2:0x0010, inners: #1 }] */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0138  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0140  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0177  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x018c  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x01a5  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void a() {
            boolean z;
            int i;
            int length;
            boolean z2;
            com.mbridge.msdk.foundation.same.net.b bVar;
            try {
                Socket socket = new Socket(this.b, this.f);
                this.g = socket;
                socket.setSoTimeout(15000);
                if (!this.b.contains(com.mbridge.msdk.foundation.same.net.utils.d.h().j) && !this.b.contains(com.mbridge.msdk.foundation.same.net.utils.d.h().l)) {
                    z = false;
                    q0.b("SocketManager", "Socket connect : " + this.b + " : " + this.f + " isAnalytics : " + z);
                    this.e = this.g.getOutputStream();
                    ByteBuffer wrap = ByteBuffer.wrap(new byte[8]);
                    this.a = wrap;
                    ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
                    wrap.order(byteOrder);
                    this.a.put((byte) 2);
                    if (TextUtils.isEmpty(this.h)) {
                        i = 1;
                        this.a.put(this.c ? (byte) 3 : (byte) 2);
                    } else {
                        this.a.put((byte) 1);
                        i = 1;
                    }
                    this.a.putShort((short) f.b.getAndIncrement());
                    if (TextUtils.isEmpty(this.h)) {
                        byte[] a = this.c ? f.this.a(this.h) : this.h.getBytes();
                        length = a.length;
                        this.a.putInt(length);
                        this.e.write(this.a.array());
                        this.e.write(a);
                    } else {
                        this.a.putInt(0);
                        this.e.write(this.a.array());
                        length = 0;
                    }
                    this.e.flush();
                    q0.a("SocketManager", "Socket Request : header : " + Arrays.toString(this.a.array()) + " length : " + length);
                    InputStream inputStream = this.g.getInputStream();
                    byte[] bArr = new byte[8];
                    inputStream.read(bArr, 0, 8);
                    ByteBuffer wrap2 = ByteBuffer.wrap(bArr);
                    this.a = wrap2;
                    wrap2.order(byteOrder);
                    int i2 = this.a.getInt(4);
                    byte b = bArr[i];
                    z2 = b != 3 ? i : 0;
                    int i3 = b != 2 ? i : 0;
                    q0.b("SocketManager", "Socket Response : header : " + Arrays.toString(bArr) + " length : " + i2 + " isGzip : " + z2);
                    byte[] bArr2 = new byte[i2];
                    new DataInputStream(this.g.getInputStream()).readFully(bArr2);
                    int i4 = z2;
                    if (z2 == 0) {
                        i4 = z2;
                        if (i2 > 2) {
                            i4 = z2;
                            if (((bArr2[0] << 8) | (bArr2[i] & 255)) == 8075) {
                                i4 = i;
                            }
                        }
                    }
                    bVar = this.d;
                    if (bVar != null) {
                        Socket socket2 = this.g;
                        if (socket2 != null) {
                            try {
                                socket2.close();
                                this.a = null;
                                this.e.close();
                                return;
                            } catch (IOException e) {
                                q0.b("SocketManager", e.getMessage());
                                return;
                            }
                        }
                        return;
                    }
                    if (i3 != 0 && i2 == 0) {
                        bVar.onSuccess(e.a(null, new com.mbridge.msdk.foundation.same.net.toolbox.a(204, null, null)));
                        Socket socket3 = this.g;
                        if (socket3 != null) {
                            try {
                                socket3.close();
                                this.a = null;
                                this.e.close();
                                return;
                            } catch (IOException e2) {
                                q0.b("SocketManager", e2.getMessage());
                                return;
                            }
                        }
                        return;
                    }
                    if (i2 < i) {
                        a("The response data less than 1");
                        Socket socket4 = this.g;
                        if (socket4 != null) {
                            try {
                                socket4.close();
                                this.a = null;
                                this.e.close();
                                return;
                            } catch (IOException e3) {
                                q0.b("SocketManager", e3.getMessage());
                                return;
                            }
                        }
                        return;
                    }
                    if (z) {
                        if (bArr2[0] == 1) {
                            bVar.onSuccess(e.a(null, new com.mbridge.msdk.foundation.same.net.toolbox.a(200, null, null)));
                        } else {
                            a("The server returns fail");
                        }
                        Socket socket5 = this.g;
                        if (socket5 != null) {
                            try {
                                socket5.close();
                                this.a = null;
                                this.e.close();
                                return;
                            } catch (IOException e4) {
                                q0.b("SocketManager", e4.getMessage());
                                return;
                            }
                        }
                        return;
                    }
                    try {
                        String a2 = i4 != 0 ? f.this.a(bArr2) : new String(bArr2);
                        JSONObject jSONObject = !TextUtils.isEmpty(a2) ? new JSONObject(a2) : null;
                        q0.b("SocketManager", "Socket Response length : " + i2 + " " + a2.length());
                        this.d.onSuccess(e.a(jSONObject, new com.mbridge.msdk.foundation.same.net.toolbox.a(200, null, null)));
                    } catch (Throwable th) {
                        String message = th.getMessage();
                        q0.b("SocketManager", th.getMessage());
                        if (TextUtils.isEmpty(message)) {
                            message = "The JSON data is illegal";
                        }
                        a(message);
                    }
                    inputStream.close();
                    Socket socket6 = this.g;
                    if (socket6 != null) {
                        try {
                            socket6.close();
                            this.a = null;
                            this.e.close();
                            return;
                        } catch (IOException e5) {
                            q0.b("SocketManager", e5.getMessage());
                            return;
                        }
                    }
                    return;
                }
                z = true;
                q0.b("SocketManager", "Socket connect : " + this.b + " : " + this.f + " isAnalytics : " + z);
                this.e = this.g.getOutputStream();
                ByteBuffer wrap3 = ByteBuffer.wrap(new byte[8]);
                this.a = wrap3;
                ByteOrder byteOrder2 = ByteOrder.BIG_ENDIAN;
                wrap3.order(byteOrder2);
                this.a.put((byte) 2);
                if (TextUtils.isEmpty(this.h)) {
                }
                this.a.putShort((short) f.b.getAndIncrement());
                if (TextUtils.isEmpty(this.h)) {
                }
                this.e.flush();
                q0.a("SocketManager", "Socket Request : header : " + Arrays.toString(this.a.array()) + " length : " + length);
                InputStream inputStream2 = this.g.getInputStream();
                byte[] bArr3 = new byte[8];
                inputStream2.read(bArr3, 0, 8);
                ByteBuffer wrap22 = ByteBuffer.wrap(bArr3);
                this.a = wrap22;
                wrap22.order(byteOrder2);
                int i22 = this.a.getInt(4);
                byte b2 = bArr3[i];
                if (b2 != 3) {
                }
                if (b2 != 2) {
                }
                q0.b("SocketManager", "Socket Response : header : " + Arrays.toString(bArr3) + " length : " + i22 + " isGzip : " + z2);
                byte[] bArr22 = new byte[i22];
                new DataInputStream(this.g.getInputStream()).readFully(bArr22);
                int i42 = z2;
                if (z2 == 0) {
                }
                bVar = this.d;
                if (bVar != null) {
                }
            } catch (Throwable th2) {
                try {
                    String message2 = th2.getMessage();
                    q0.a("SocketManager", "Socket exception: " + message2);
                    a(message2);
                    Socket socket7 = this.g;
                    if (socket7 != null) {
                        try {
                            socket7.close();
                            this.a = null;
                            this.e.close();
                        } catch (IOException e6) {
                            q0.b("SocketManager", e6.getMessage());
                        }
                    }
                } catch (Throwable th3) {
                    Socket socket8 = this.g;
                    if (socket8 == null) {
                        throw th3;
                    }
                    try {
                        socket8.close();
                        this.a = null;
                        this.e.close();
                        throw th3;
                    } catch (IOException e7) {
                        q0.b("SocketManager", e7.getMessage());
                        throw th3;
                    }
                }
            }
        }

        private void a(String str) {
            if (this.d != null) {
                if (TextUtils.isEmpty(str)) {
                    str = "Unknown exception";
                }
                this.d.onError(new com.mbridge.msdk.foundation.same.net.exception.a(13, new com.mbridge.msdk.foundation.same.net.toolbox.a(404, str.getBytes(), null)));
            }
        }
    }
}
