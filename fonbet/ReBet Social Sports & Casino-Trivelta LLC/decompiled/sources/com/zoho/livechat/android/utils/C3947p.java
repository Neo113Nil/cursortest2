package com.zoho.livechat.android.utils;

import android.util.Log;
import com.zoho.livechat.android.listeners.OperatorImageListener;
import com.zoho.livechat.android.modules.messages.domain.entities.Message;
import com.zoho.livechat.android.provider.MobilistenInitProvider;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import okhttp3.HttpUrl;
import rd.C6218a;
import zf.C6966g;

/* renamed from: com.zoho.livechat.android.utils.p, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3947p extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public HttpUrl.Builder f44559a;

    /* renamed from: b, reason: collision with root package name */
    public String f44560b;

    /* renamed from: c, reason: collision with root package name */
    public double f44561c;

    /* renamed from: d, reason: collision with root package name */
    public OperatorImageListener f44562d = null;

    /* renamed from: e, reason: collision with root package name */
    public Boolean f44563e = Boolean.FALSE;

    /* renamed from: f, reason: collision with root package name */
    public String f44564f;

    /* renamed from: g, reason: collision with root package name */
    public String f44565g;

    public C3947p(String str, String str2, HttpUrl.Builder builder, String str3, long j10) {
        this.f44559a = builder;
        this.f44560b = str3;
        this.f44561c = j10;
        this.f44564f = str;
        this.f44565g = str2;
    }

    public final void a(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[8192];
        int i10 = 0;
        int i11 = -1;
        int i12 = 0;
        boolean z10 = false;
        int i13 = -1;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == i11) {
                outputStream.flush();
                return;
            }
            outputStream.write(bArr, i10, read);
            double d10 = this.f44561c;
            if (d10 != 0.0d) {
                i12 += read;
                double d11 = i12;
                int i14 = (int) ((d11 / d10) * 100.0d);
                if (this.f44564f != null && !this.f44565g.isEmpty() && i13 != i14) {
                    C6966g.D0(this.f44564f, this.f44565g, Integer.valueOf(i14));
                    i13 = i14;
                }
                if (i14 == 100) {
                    Message.Extras L10 = C6966g.L(this.f44560b);
                    if (L10 != null) {
                        C6966g.C0(this.f44564f, this.f44565g, L10);
                        if (L10.isMediaMetaDataRetrieverFailed()) {
                            C6966g.G0(this.f44564f, this.f44565g, Message.g.File);
                        }
                    }
                    z10 = true;
                }
                double d12 = this.f44561c;
                if (d11 > d12 || z10) {
                    if (d11 >= (d12 * i14) / 100.0d) {
                        i10 = 0;
                        i11 = -1;
                        z10 = false;
                    }
                } else if (C3948q.b().d(this.f44565g)) {
                    throw new IOException();
                }
                i10 = 0;
                i11 = -1;
            }
        }
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0036: MOVE (r0 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]) (LINE:55), block:B:44:0x0036 */
    public final void b(InputStream inputStream) {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        File file = null;
        FileOutputStream fileOutputStream3 = null;
        try {
            try {
                try {
                    try {
                        File fileFromDisk = y.INSTANCE.getFileFromDisk(this.f44560b);
                        try {
                            if (fileFromDisk.exists()) {
                                C3946o.d(fileFromDisk);
                            }
                            C3946o.c(fileFromDisk);
                            fileOutputStream2 = new FileOutputStream(fileFromDisk);
                            try {
                                a(inputStream, fileOutputStream2);
                                fileOutputStream2.close();
                            } catch (Exception e10) {
                                e = e10;
                                file = fileFromDisk;
                                if (file != null) {
                                    C3946o.d(file);
                                }
                                LiveChatUtil.log(e);
                                if (fileOutputStream2 != null) {
                                    fileOutputStream2.close();
                                }
                            }
                        } catch (Exception e11) {
                            e = e11;
                            fileOutputStream2 = null;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (fileOutputStream3 != null) {
                            try {
                                fileOutputStream3.close();
                            } catch (Exception e12) {
                                Log.e(C6218a.A(), e12.getMessage());
                            }
                        }
                        throw th;
                    }
                } catch (Exception e13) {
                    e = e13;
                    fileOutputStream2 = null;
                }
            } catch (Exception e14) {
                Log.e(C6218a.A(), e14.getMessage());
            }
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream3 = fileOutputStream;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00b0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void run() {
        InputStream inputStream;
        try {
            try {
                C6966g.C0(this.f44564f, this.f44565g, new Message.Extras());
                HttpURLConnection g10 = sd.d.g(this.f44559a);
                g10.setConnectTimeout(30000);
                g10.setReadTimeout(30000);
                g10.setInstanceFollowRedirects(true);
                if (g10.getResponseCode() == 200) {
                    inputStream = g10.getInputStream();
                    try {
                        try {
                            b(inputStream);
                        } catch (Exception unused) {
                            C6966g.C0(this.f44564f, this.f44565g, null);
                            C6966g.D0(this.f44564f, this.f44565g, null);
                            C3948q.b().e(this.f44565g);
                            if (inputStream != null) {
                                inputStream.close();
                                return;
                            }
                            return;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        C6966g.D0(this.f44564f, this.f44565g, null);
                        C3948q.b().e(this.f44565g);
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Exception e10) {
                                LiveChatUtil.log(e10);
                            }
                        }
                        throw th;
                    }
                } else {
                    C6966g.C0(this.f44564f, this.f44565g, null);
                    if (this.f44562d != null) {
                        if (this.f44563e.booleanValue()) {
                            this.f44562d.onSuccess(MobilistenInitProvider.k().getResources().getDrawable(od.p.f60132m2));
                        } else {
                            this.f44562d.onSuccess(null);
                        }
                        this.f44562d = null;
                    }
                    inputStream = null;
                }
                C6966g.D0(this.f44564f, this.f44565g, null);
                C3948q.b().e(this.f44565g);
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (Exception e11) {
                LiveChatUtil.log(e11);
            }
        } catch (Exception unused2) {
            inputStream = null;
        } catch (Throwable th3) {
            th = th3;
            inputStream = null;
            C6966g.D0(this.f44564f, this.f44565g, null);
            C3948q.b().e(this.f44565g);
            if (inputStream != null) {
            }
            throw th;
        }
    }
}
