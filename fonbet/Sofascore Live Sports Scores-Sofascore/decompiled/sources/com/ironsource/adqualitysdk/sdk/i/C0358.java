package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.StringFog;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ς, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0358 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static Handler f900;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final C0715 f901;

    public C0358(Context context, String str, String str2) {
        this.f901 = new C0715(context, str, str2);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static Handler m206() {
        Handler handler;
        synchronized (C0358.class) {
            try {
                handler = f900;
                if (handler == null) {
                    HandlerThread handlerThread = new HandlerThread(StringFog.decrypt("j3w6JBKWd0aXbSwAEp1n\n", "xBlDcnP6AiM=\n"));
                    handlerThread.start();
                    Handler handler2 = new Handler(handlerThread.getLooper());
                    f900 = handler2;
                    handler = handler2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final void m207(String str) {
        C0715 c0715 = this.f901;
        c0715.getClass();
        try {
            C0710 c0710 = c0715.f2420;
            synchronized (c0710) {
                c0710.f2416.delete(C0710.f2415, StringFog.decrypt("L34RWPg=\n", "RBtoZcefaFI=\n"), new String[]{str});
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String m208(String str) {
        C0715 c0715 = this.f901;
        c0715.getClass();
        try {
            String m408 = c0715.f2420.m408(str);
            if (m408 == null || TextUtils.isEmpty(m408)) {
                return m408;
            }
            try {
                return c0715.f2421.m414(m408);
            } catch (C0755 unused) {
                return "";
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m209(String str, String str2) {
        C0715 c0715 = this.f901;
        c0715.getClass();
        try {
            c0715.f2420.m410(str, c0715.f2421.m415(str2));
        } catch (Throwable unused) {
        }
    }
}
