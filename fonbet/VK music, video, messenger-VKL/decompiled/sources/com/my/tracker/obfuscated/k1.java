package com.my.tracker.obfuscated;

import android.text.TextUtils;
import com.my.tracker.MyTrackerConfig;
import com.my.tracker.obfuscated.s0;
import java.io.ByteArrayOutputStream;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import okhttp3.m;
import okhttp3.p;
import ru.ok.android.commons.http.Http;
import xsna.f8f0;

/* loaded from: classes14.dex */
public final class k1 extends s0 {
    static final okhttp3.m d;
    final s0.a a;
    final MyTrackerConfig.OkHttpClientProvider b;
    final boolean c;

    static {
        okhttp3.m mVar;
        Pattern pattern = okhttp3.m.e;
        try {
            mVar = m.a.a(Http.ContentType.APPLICATION_OCTET_STREAM);
        } catch (IllegalArgumentException unused) {
            mVar = null;
        }
        d = mVar;
    }

    public k1(s0.a aVar, MyTrackerConfig.OkHttpClientProvider okHttpClientProvider, boolean z) {
        this.a = aVar;
        this.b = okHttpClientProvider;
        this.c = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00b7 A[Catch: all -> 0x00a9, TryCatch #4 {all -> 0x00a9, blocks: (B:18:0x008c, B:23:0x0097, B:25:0x00b7, B:27:0x00c0, B:28:0x00c4, B:30:0x00ca, B:31:0x00cd, B:35:0x00ad), top: B:17:0x008c }] */
    @Override // com.my.tracker.obfuscated.s0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public s0.b a(String str) {
        ByteArrayOutputStream byteArrayOutputStream;
        GZIPOutputStream gZIPOutputStream;
        s0.b d2 = s0.b.d();
        okhttp3.u uVar = null;
        try {
            x2.a("OkHttpPostRequest: send request to " + str);
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    if (this.c) {
                        x2.a("OkHttpPostRequest: populating post request body using gzip");
                        gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                        try {
                            this.a.a(gZIPOutputStream);
                            gZIPOutputStream.finish();
                        } catch (Throwable th) {
                            th = th;
                            if (gZIPOutputStream != null) {
                                gZIPOutputStream.close();
                            }
                            if (byteArrayOutputStream != null) {
                                byteArrayOutputStream.close();
                            }
                            throw th;
                        }
                    } else {
                        x2.a("OkHttpPostRequest: populating post request body without using gzip");
                        this.a.a(byteArrayOutputStream);
                        byteArrayOutputStream.flush();
                        gZIPOutputStream = null;
                    }
                    p.a aVar = new p.a();
                    aVar.i(str);
                    aVar.c.h(Http.Header.CONTENT_ENCODING, Http.ContentEncoding.GZIP);
                    aVar.f("POST", okhttp3.t.create(byteArrayOutputStream.toByteArray(), d));
                    okhttp3.p b = aVar.b();
                    if (gZIPOutputStream != null) {
                        gZIPOutputStream.close();
                    }
                    byteArrayOutputStream.close();
                    okhttp3.u execute = ((f8f0) this.b.getOkHttpClient().a(b)).execute();
                    try {
                        int i = execute.e;
                        if (i != 200 && i != 204) {
                            x2.a("OkHttpPostRequest error: response code " + i);
                            d2.a = false;
                            if (i == 200) {
                                x2.a("OkHttpPostRequest: processing server response");
                                okhttp3.v vVar = execute.h;
                                String string = vVar != null ? vVar.string() : null;
                                if (TextUtils.isEmpty(string)) {
                                    x2.a("OkHttpPostRequest: response data is empty");
                                } else {
                                    d2.b = string;
                                }
                            }
                            execute.close();
                            return d2;
                        }
                        x2.a("OkHttpPostRequest: response successfully received");
                        d2.a = true;
                        if (i == 200) {
                        }
                        execute.close();
                        return d2;
                    } catch (Throwable th2) {
                        uVar = execute;
                        th = th2;
                        try {
                            x2.a("OkHttpPostRequest error: error while sending data", th);
                            d2.a = false;
                            d2.c = "OkHttpPostRequest error: error while sending data";
                            return d2;
                        } finally {
                            if (uVar != null) {
                                uVar.close();
                            }
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    gZIPOutputStream = null;
                }
            } catch (Throwable th4) {
                th = th4;
                byteArrayOutputStream = null;
                gZIPOutputStream = null;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }
}
