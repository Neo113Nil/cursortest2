package com.rnfs;

import android.os.AsyncTask;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.rnfs.a;
import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public class c extends AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public com.rnfs.a f41457a;

    /* renamed from: b, reason: collision with root package name */
    public AtomicBoolean f41458b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    public b f41459c;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                c cVar = c.this;
                cVar.d(cVar.f41457a, c.this.f41459c);
                c.this.f41457a.f41451h.a(c.this.f41459c);
            } catch (Exception e10) {
                c cVar2 = c.this;
                cVar2.f41459c.f41456c = e10;
                cVar2.f41457a.f41451h.a(c.this.f41459c);
            }
        }
    }

    @Override // android.os.AsyncTask
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public b doInBackground(com.rnfs.a... aVarArr) {
        this.f41457a = aVarArr[0];
        this.f41459c = new b();
        new Thread(new a()).start();
        return this.f41459c;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(com.rnfs.a aVar, b bVar) {
        HttpURLConnection httpURLConnection;
        BufferedInputStream bufferedInputStream;
        int i10;
        FileOutputStream fileOutputStream;
        long j10;
        long j11;
        int i11;
        int i12;
        int i13;
        FileOutputStream fileOutputStream2 = null;
        try {
            httpURLConnection = (HttpURLConnection) aVar.f41444a.openConnection();
            try {
                ReadableMapKeySetIterator keySetIterator = aVar.f41446c.keySetIterator();
                while (keySetIterator.hasNextKey()) {
                    String nextKey = keySetIterator.nextKey();
                    httpURLConnection.setRequestProperty(nextKey, aVar.f41446c.getString(nextKey));
                }
                httpURLConnection.setConnectTimeout(aVar.f41450g);
                httpURLConnection.setReadTimeout(aVar.f41449f);
                httpURLConnection.connect();
                int responseCode = httpURLConnection.getResponseCode();
                long e10 = e(httpURLConnection);
                if (responseCode != 200 && (responseCode == 301 || responseCode == 302 || responseCode == 307 || responseCode == 308)) {
                    String headerField = httpURLConnection.getHeaderField("Location");
                    httpURLConnection.disconnect();
                    HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(headerField).openConnection();
                    try {
                        httpURLConnection2.setConnectTimeout(5000);
                        httpURLConnection2.connect();
                        int responseCode2 = httpURLConnection2.getResponseCode();
                        e10 = e(httpURLConnection2);
                        responseCode = responseCode2;
                        httpURLConnection = httpURLConnection2;
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedInputStream = null;
                        httpURLConnection = httpURLConnection2;
                        if (fileOutputStream2 != null) {
                            fileOutputStream2.close();
                        }
                        if (bufferedInputStream != null) {
                            bufferedInputStream.close();
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        throw th;
                    }
                }
                if (responseCode < 200 || responseCode >= 300) {
                    bufferedInputStream = null;
                } else {
                    Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                    HashMap hashMap = new HashMap();
                    Iterator<Map.Entry<String, List<String>>> it = headerFields.entrySet().iterator();
                    while (true) {
                        i10 = 0;
                        if (!it.hasNext()) {
                            break;
                        }
                        Map.Entry<String, List<String>> next = it.next();
                        String key = next.getKey();
                        String str = next.getValue().get(0);
                        if (key != null && str != null) {
                            hashMap.put(key, str);
                        }
                    }
                    a.InterfaceC0593a interfaceC0593a = this.f41457a.f41452i;
                    if (interfaceC0593a != null) {
                        interfaceC0593a.a(responseCode, e10, hashMap);
                    }
                    bufferedInputStream = new BufferedInputStream(httpURLConnection.getInputStream(), 8192);
                    try {
                        fileOutputStream = new FileOutputStream(aVar.f41445b);
                    } catch (Throwable th3) {
                        th = th3;
                    }
                    try {
                        byte[] bArr = new byte[8192];
                        boolean z10 = this.f41457a.f41453j != null;
                        long j12 = 0;
                        long j13 = 0;
                        double d10 = 0.0d;
                        while (true) {
                            int read = bufferedInputStream.read(bArr);
                            int i14 = i10;
                            if (read == -1) {
                                fileOutputStream.flush();
                                bVar.f41455b = j13;
                                fileOutputStream2 = fileOutputStream;
                                break;
                            }
                            if (this.f41458b.get()) {
                                throw new Exception("Download has been aborted");
                            }
                            boolean z11 = z10;
                            long j14 = j13 + read;
                            if (!z11) {
                                j10 = e10;
                                j11 = j14;
                                i11 = read;
                            } else if (aVar.f41447d > 0) {
                                long currentTimeMillis = System.currentTimeMillis();
                                if (currentTimeMillis - j12 > aVar.f41447d) {
                                    long[] jArr = new long[2];
                                    jArr[i14] = e10;
                                    jArr[1] = j14;
                                    publishProgress(jArr);
                                    j12 = currentTimeMillis;
                                }
                                j10 = e10;
                                i13 = read;
                                i12 = i14;
                                j11 = j14;
                                fileOutputStream.write(bArr, i12, i13);
                                j13 = j11;
                                z10 = z11;
                                i10 = i12;
                                e10 = j10;
                            } else if (aVar.f41448e <= 0.0f) {
                                long[] jArr2 = new long[2];
                                jArr2[i14] = e10;
                                jArr2[1] = j14;
                                publishProgress(jArr2);
                                j10 = e10;
                                i11 = read;
                                j11 = j14;
                            } else {
                                i11 = read;
                                j11 = j14;
                                double round = Math.round((j11 * 100.0d) / e10);
                                j10 = e10;
                                if (round % aVar.f41448e == 0.0d && (round != d10 || j11 == j10)) {
                                    String.valueOf(round);
                                    String.valueOf(j11);
                                    long[] jArr3 = new long[2];
                                    jArr3[i14] = j10;
                                    jArr3[1] = j11;
                                    publishProgress(jArr3);
                                    d10 = round;
                                }
                            }
                            i12 = i14;
                            i13 = i11;
                            fileOutputStream.write(bArr, i12, i13);
                            j13 = j11;
                            z10 = z11;
                            i10 = i12;
                            e10 = j10;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        fileOutputStream2 = fileOutputStream;
                        if (fileOutputStream2 != null) {
                        }
                        if (bufferedInputStream != null) {
                        }
                        if (httpURLConnection != null) {
                        }
                        throw th;
                    }
                }
                bVar.f41454a = responseCode;
                if (fileOutputStream2 != null) {
                    fileOutputStream2.close();
                }
                if (bufferedInputStream != null) {
                    bufferedInputStream.close();
                }
                httpURLConnection.disconnect();
            } catch (Throwable th5) {
                th = th5;
                bufferedInputStream = null;
            }
        } catch (Throwable th6) {
            th = th6;
            httpURLConnection = null;
            bufferedInputStream = null;
        }
    }

    public final long e(HttpURLConnection httpURLConnection) {
        return httpURLConnection.getContentLengthLong();
    }

    @Override // android.os.AsyncTask
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public void onProgressUpdate(long[]... jArr) {
        super.onProgressUpdate(jArr);
        a.b bVar = this.f41457a.f41453j;
        if (bVar != null) {
            long[] jArr2 = jArr[0];
            bVar.a(jArr2[0], jArr2[1]);
        }
    }

    public void g() {
        this.f41458b.set(true);
    }
}
