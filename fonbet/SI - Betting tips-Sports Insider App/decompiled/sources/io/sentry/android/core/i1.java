package io.sentry.android.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import io.sentry.b5;
import java.nio.charset.Charset;
import java.util.HashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i1 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final io.sentry.b1 f15634a;

    /* renamed from: b, reason: collision with root package name */
    public final SentryAndroidOptions f15635b;

    /* renamed from: c, reason: collision with root package name */
    public final io.sentry.android.core.internal.util.g f15636c = new io.sentry.android.core.internal.util.g(60000, 0);

    /* renamed from: d, reason: collision with root package name */
    public final char[] f15637d = new char[64];

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ SystemEventsBreadcrumbsIntegration f15638e;

    public i1(SystemEventsBreadcrumbsIntegration systemEventsBreadcrumbsIntegration, io.sentry.b1 b1Var, SentryAndroidOptions sentryAndroidOptions) {
        this.f15638e = systemEventsBreadcrumbsIntegration;
        this.f15634a = b1Var;
        this.f15635b = sentryAndroidOptions;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x008e, code lost:
    
        r2 = r13;
     */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onReceive(Context context, Intent intent) {
        h1 h1Var;
        Bundle extras;
        int i5;
        String action = intent.getAction();
        boolean equals = "android.intent.action.BATTERY_CHANGED".equals(action);
        SentryAndroidOptions sentryAndroidOptions = this.f15635b;
        String str = null;
        if (!equals) {
            h1Var = null;
        } else {
            if (this.f15636c.a()) {
                return;
            }
            Float b10 = q0.b(intent, sentryAndroidOptions);
            h1Var = new h1(b10 != null ? Integer.valueOf(b10.intValue()) : null, q0.d(intent, sentryAndroidOptions));
            SystemEventsBreadcrumbsIntegration systemEventsBreadcrumbsIntegration = this.f15638e;
            if (h1Var.equals(systemEventsBreadcrumbsIntegration.f15515l)) {
                return;
            } else {
                systemEventsBreadcrumbsIntegration.f15515l = h1Var;
            }
        }
        io.sentry.e eVar = new io.sentry.e(System.currentTimeMillis());
        eVar.f16334e = "system";
        eVar.f16336g = "device.event";
        if (action != null) {
            int length = action.length();
            char[] cArr = this.f15637d;
            int length2 = cArr.length;
            int i10 = length - 1;
            while (true) {
                if (i10 < 0) {
                    break;
                }
                char charAt = action.charAt(i10);
                if (charAt == '.') {
                    str = new String(cArr, length2, cArr.length - length2);
                    break;
                }
                if (length2 == 0) {
                    Charset charset = io.sentry.util.l.f17171a;
                    int lastIndexOf = action.lastIndexOf(".");
                    if (lastIndexOf >= 0 && action.length() > (i5 = lastIndexOf + 1)) {
                        str = action.substring(i5);
                    }
                } else {
                    length2--;
                    cArr[length2] = charAt;
                    i10--;
                }
            }
        }
        if (str != null) {
            eVar.c(str, "action");
        }
        if (h1Var != null) {
            Integer num = h1Var.f15622a;
            if (num != null) {
                eVar.c(num, "level");
            }
            Boolean bool = h1Var.f15623b;
            if (bool != null) {
                eVar.c(bool, "charging");
            }
        } else if (sentryAndroidOptions.isEnableSystemEventBreadcrumbsExtras() && (extras = intent.getExtras()) != null && !extras.isEmpty()) {
            HashMap hashMap = new HashMap(extras.size());
            for (String str2 : extras.keySet()) {
                try {
                    Object obj = extras.get(str2);
                    if (obj != null) {
                        hashMap.put(str2, obj.toString());
                    }
                } catch (Throwable th2) {
                    sentryAndroidOptions.getLogger().b(b5.ERROR, th2, "%s key of the %s action threw an error.", str2, action);
                }
            }
            eVar.c(hashMap, "extras");
        }
        eVar.f16338i = b5.INFO;
        io.sentry.h0 h0Var = new io.sentry.h0();
        h0Var.d(intent, "android:intent");
        this.f15634a.h(eVar, h0Var);
    }
}
