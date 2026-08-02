package org.chromium.net;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.ProxyInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.util.Log;
import g.C6594f;
import internal.org.jni_zero.CalledByNative;
import java.util.Locale;
import org.chromium.base.TraceEvent;

/* loaded from: classes6.dex */
public final class ProxyChangeListener {

    /* renamed from: a, reason: collision with root package name */
    private final Looper f78681a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f78682b;

    /* renamed from: c, reason: collision with root package name */
    private long f78683c;

    /* renamed from: d, reason: collision with root package name */
    private b f78684d;

    /* renamed from: e, reason: collision with root package name */
    private BroadcastReceiver f78685e;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes10.dex */
    static class a {

        /* renamed from: e, reason: collision with root package name */
        public static final a f78686e = new a("", 0, "", new String[0]);

        /* renamed from: a, reason: collision with root package name */
        public final String f78687a;

        /* renamed from: b, reason: collision with root package name */
        public final int f78688b;

        /* renamed from: c, reason: collision with root package name */
        public final String f78689c;

        /* renamed from: d, reason: collision with root package name */
        public final String[] f78690d;

        public a(String str, int i11, String str2, String[] strArr) {
            this.f78687a = str;
            this.f78688b = i11;
            this.f78689c = str2;
            this.f78690d = strArr;
        }

        static a a(ProxyInfo proxyInfo) {
            if (proxyInfo == null) {
                return null;
            }
            String host = proxyInfo.getHost();
            Uri pacFileUrl = proxyInfo.getPacFileUrl();
            if (host == null) {
                host = "";
            }
            return new a(host, proxyInfo.getPort(), Uri.EMPTY.equals(pacFileUrl) ? null : pacFileUrl.toString(), proxyInfo.getExclusionList());
        }

        public final String toString() {
            String str = this.f78687a;
            if (!str.equals("localhost") && !str.isEmpty()) {
                str = "<redacted>";
            }
            Locale locale = Locale.US;
            String str2 = this.f78689c == null ? "null" : "\"<redacted>\"";
            StringBuilder b11 = C6594f.b("ProxyConfig [mHost=\"", str, "\", mPort=");
            b11.append(this.f78688b);
            b11.append(", mPacUrl=");
            b11.append(str2);
            b11.append("]");
            return b11.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class b extends BroadcastReceiver {
        b() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if ("android.intent.action.PROXY_CHANGE".equals(intent.getAction())) {
                ProxyChangeListener.c(ProxyChangeListener.this, new t(this, intent));
            }
        }
    }

    private ProxyChangeListener() {
        Looper myLooper = Looper.myLooper();
        this.f78681a = myLooper;
        this.f78682b = new Handler(myLooper);
    }

    public static void a(ProxyChangeListener proxyChangeListener, Intent intent) {
        proxyChangeListener.getClass();
        a a11 = a.a(((ConnectivityManager) org.chromium.base.e.b().getSystemService("connectivity")).getDefaultProxy());
        if (a11 == null) {
            a11 = a.f78686e;
        } else if (Build.VERSION.SDK_INT >= 29 && a11.f78687a.equals("localhost") && a11.f78688b == -1) {
            Bundle extras = intent.getExtras();
            a a12 = extras == null ? null : a.a((ProxyInfo) extras.get("android.intent.extra.PROXY_INFO"));
            String c11 = org.chromium.base.j.c("ProxyChangeListener");
            Locale locale = Locale.US;
            Log.i(c11, "configFromConnectivityManager = " + a11 + ", configFromIntent = " + a12);
            a11 = a12 != null ? new a(a12.f78687a, a12.f78688b, a11.f78689c, a11.f78690d) : null;
        }
        proxyChangeListener.d(a11);
    }

    static void c(ProxyChangeListener proxyChangeListener, t tVar) {
        if (proxyChangeListener.f78681a == Looper.myLooper()) {
            tVar.run();
        } else {
            proxyChangeListener.f78682b.post(tVar);
        }
    }

    @CalledByNative
    public static ProxyChangeListener create() {
        return new ProxyChangeListener();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(a aVar) {
        if (this.f78683c == 0) {
            return;
        }
        if (aVar != null) {
            u.a().c(this.f78683c, this, aVar.f78687a, aVar.f78688b, aVar.f78689c, aVar.f78690d);
        } else {
            u.a().b(this.f78683c, this);
        }
    }

    private void e() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PROXY_CHANGE");
        this.f78684d = new b();
        if (!(Build.VERSION.SDK_INT >= 33 ? Process.isSdkSandbox() : false)) {
            org.chromium.base.e.b().registerReceiver(this.f78684d, new IntentFilter(), null, null, 4);
        }
        this.f78685e = new s(this);
        org.chromium.base.e.d(org.chromium.base.e.b(), this.f78685e, intentFilter);
    }

    @CalledByNative
    public static String getProperty(String str) {
        return System.getProperty(str);
    }

    final void f(Intent intent) {
        VS.a aVar = new VS.a(3, this, intent);
        if (this.f78681a == Looper.myLooper()) {
            aVar.run();
        } else {
            this.f78682b.post(aVar);
        }
    }

    @CalledByNative
    public final void start(long j11) {
        TraceEvent r11 = TraceEvent.r("ProxyChangeListener.start");
        try {
            this.f78683c = j11;
            e();
            if (r11 != null) {
                r11.close();
            }
        } catch (Throwable th2) {
            if (r11 != null) {
                try {
                    r11.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @CalledByNative
    public final void stop() {
        this.f78683c = 0L;
        org.chromium.base.e.b().unregisterReceiver(this.f78684d);
        if (this.f78685e != null) {
            org.chromium.base.e.b().unregisterReceiver(this.f78685e);
        }
        this.f78684d = null;
        this.f78685e = null;
    }
}
