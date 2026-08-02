package com.android.billingclient.api;

import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.sentry.ILogger;
import io.sentry.b5;
import j$.util.concurrent.ConcurrentHashMap;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.IllegalFormatException;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TreeSet;
import okio.Segment;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a implements j1.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3965a;

    /* renamed from: b, reason: collision with root package name */
    public String f3966b;

    public /* synthetic */ a(int i5) {
        this.f3965a = i5;
    }

    public static a d(io.sentry.c cVar, List list) {
        String str;
        int i5;
        String str2;
        String str3;
        io.sentry.c cVar2 = cVar;
        String str4 = "%20";
        String str5 = "\\+";
        ILogger iLogger = cVar2.f16225h;
        String str6 = (list != null ? io.sentry.c.a(io.sentry.util.l.c(list), iLogger) : io.sentry.c.a(null, iLogger)).f16222e;
        ConcurrentHashMap concurrentHashMap = cVar2.f16218a;
        ILogger iLogger2 = cVar2.f16225h;
        StringBuilder sb2 = new StringBuilder();
        boolean z5 = true;
        if (str6 == null || str6.isEmpty()) {
            str = "";
            i5 = 0;
        } else {
            sb2.append(str6);
            Charset charset = io.sentry.util.l.f17171a;
            int i10 = 0;
            for (int i11 = 0; i11 < str6.length(); i11++) {
                if (str6.charAt(i11) == ',') {
                    i10++;
                }
            }
            i5 = i10 + 1;
            str = StringUtils.COMMA;
        }
        io.sentry.r a7 = cVar2.f16219b.a();
        try {
            TreeSet treeSet = new TreeSet(Collections.list(concurrentHashMap.keys()));
            a7.close();
            treeSet.add("sentry-sample_rate");
            treeSet.add("sentry-sample_rand");
            Iterator it = treeSet.iterator();
            int i12 = i5;
            String str7 = str;
            while (it.hasNext()) {
                String str8 = (String) it.next();
                boolean z7 = z5;
                String c2 = "sentry-sample_rate".equals(str8) ? io.sentry.c.c(cVar2.f16220c) : "sentry-sample_rand".equals(str8) ? io.sentry.c.c(cVar2.f16221d) : (String) concurrentHashMap.get(str8);
                if (c2 != null) {
                    if (i12 >= 64) {
                        b5 b5Var = b5.ERROR;
                        Object[] objArr = new Object[2];
                        objArr[0] = str8;
                        objArr[z7 ? 1 : 0] = 64;
                        iLogger2.h(b5Var, "Not adding baggage value %s as the total number of list members would exceed the maximum of %s.", objArr);
                    } else {
                        try {
                            str2 = str4;
                        } catch (Throwable th2) {
                            th = th2;
                            str2 = str4;
                        }
                        try {
                            String str9 = str7 + URLEncoder.encode(str8, "UTF-8").replaceAll(str5, str4) + "=" + URLEncoder.encode(c2, "UTF-8").replaceAll(str5, str4);
                            if (sb2.length() + str9.length() > 8192) {
                                b5 b5Var2 = b5.ERROR;
                                Object valueOf = Integer.valueOf(Segment.SIZE);
                                str3 = str5;
                                try {
                                    Object[] objArr2 = new Object[2];
                                    objArr2[0] = str8;
                                    objArr2[z7 ? 1 : 0] = valueOf;
                                    iLogger2.h(b5Var2, "Not adding baggage value %s as the total header value length would exceed the maximum of %s.", objArr2);
                                } catch (Throwable th3) {
                                    th = th3;
                                    b5 b5Var3 = b5.ERROR;
                                    Object[] objArr3 = new Object[2];
                                    objArr3[0] = str8;
                                    objArr3[z7 ? 1 : 0] = c2;
                                    iLogger2.b(b5Var3, th, "Unable to encode baggage key value pair (key=%s,value=%s).", objArr3);
                                    cVar2 = cVar;
                                    z5 = z7 ? 1 : 0;
                                    str4 = str2;
                                    str5 = str3;
                                }
                            } else {
                                str3 = str5;
                                i12++;
                                sb2.append(str9);
                                str7 = StringUtils.COMMA;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            str3 = str5;
                            b5 b5Var32 = b5.ERROR;
                            Object[] objArr32 = new Object[2];
                            objArr32[0] = str8;
                            objArr32[z7 ? 1 : 0] = c2;
                            iLogger2.b(b5Var32, th, "Unable to encode baggage key value pair (key=%s,value=%s).", objArr32);
                            cVar2 = cVar;
                            z5 = z7 ? 1 : 0;
                            str4 = str2;
                            str5 = str3;
                        }
                        cVar2 = cVar;
                        z5 = z7 ? 1 : 0;
                        str4 = str2;
                        str5 = str3;
                    }
                }
                str2 = str4;
                str3 = str5;
                cVar2 = cVar;
                z5 = z7 ? 1 : 0;
                str4 = str2;
                str5 = str3;
            }
            String sb3 = sb2.toString();
            if (sb3.isEmpty()) {
                return null;
            }
            return new a(sb3, 6);
        } finally {
        }
    }

    public static String h(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e7) {
                io.sentry.android.core.w0.e("PlayCore", "Unable to format ".concat(str2), e7);
                str2 = str2 + " [" + TextUtils.join(", ", objArr) + "]";
            }
        }
        return r4.k.m(str, " : ", str2);
    }

    @Override // j1.n
    public boolean a(CharSequence charSequence, int i5, int i10, j1.u uVar) {
        if (!TextUtils.equals(charSequence.subSequence(i5, i10), this.f3966b)) {
            return true;
        }
        uVar.f18239c = (uVar.f18239c & 3) | 4;
        return false;
    }

    public a c() {
        if (this.f3966b != null) {
            return new a(this, (byte) 0);
        }
        throw new IllegalArgumentException("Product type must be set");
    }

    public void e(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 3)) {
            Log.d("PlayCore", h(this.f3966b, str, objArr));
        }
    }

    public void f(RemoteException remoteException, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            io.sentry.android.core.w0.e("PlayCore", h(this.f3966b, str, objArr), remoteException);
        }
    }

    public void g(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            Log.i("PlayCore", h(this.f3966b, str, objArr));
        }
    }

    public String toString() {
        switch (this.f3965a) {
            case 9:
                return d9.e.k(new StringBuilder("<"), this.f3966b, '>');
            default:
                return super.toString();
        }
    }

    public /* synthetic */ a(a aVar) {
        this.f3965a = 3;
        this.f3966b = aVar.f3966b;
    }

    public /* synthetic */ a(a aVar, byte b10) {
        this.f3965a = 5;
        this.f3966b = aVar.f3966b;
    }

    public /* synthetic */ a(String str, int i5) {
        this.f3965a = i5;
        this.f3966b = str;
    }

    public a(String str) {
        this.f3965a = 11;
        this.f3966b = ("UID: [" + Process.myUid() + "]  PID: [" + Process.myPid() + "] ").concat(str);
    }

    @Override // j1.n
    public Object b() {
        return this;
    }
}
