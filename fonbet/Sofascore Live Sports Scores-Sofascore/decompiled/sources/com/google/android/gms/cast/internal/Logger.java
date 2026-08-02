package com.google.android.gms.cast.internal;

import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.ironsource.U3;
import defpackage.lnb;
import java.util.Locale;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@KeepForSdk
/* loaded from: classes3.dex */
public class Logger {
    public final String a;
    public final boolean b;
    public final String c;

    public Logger(String str, String str2) {
        Preconditions.g(str, "The log tag cannot be null or empty.");
        this.a = str;
        this.c = str2;
        this.b = str.length() <= 23;
    }

    public final void a(String str, Object... objArr) {
        if (!Build.TYPE.equals("user") && this.b && Log.isLoggable(this.a, 3)) {
            c(str, objArr);
        }
    }

    public final void b(String str, Object... objArr) {
        if (!Build.TYPE.equals("user") && this.b && Log.isLoggable(this.a, 3)) {
            c(str, objArr);
        }
    }

    public final void c(String str, Object... objArr) {
        if (objArr.length != 0) {
            str = String.format(Locale.ROOT, str, objArr);
        }
        String str2 = this.c;
        String o = TextUtils.isEmpty(str2) ? "" : lnb.o(U3.j.d, str2, "] ");
        if (TextUtils.isEmpty(o)) {
            return;
        }
        o.concat(str);
    }
}
