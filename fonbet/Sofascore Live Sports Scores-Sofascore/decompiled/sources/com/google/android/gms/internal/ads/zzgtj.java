package com.google.android.gms.internal.ads;

import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.U3;
import defpackage.fc6;
import defpackage.me4;
import defpackage.wt3;
import java.util.IllegalFormatException;
import java.util.Locale;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzgtj {
    public final String a;

    public zzgtj(String str) {
        int myUid = Process.myUid();
        int myPid = Process.myPid();
        StringBuilder sb = new StringBuilder(String.valueOf(myUid).length() + 15 + String.valueOf(myPid).length() + 2);
        me4.r(sb, "UID: [", myUid, "]  PID: [", myPid);
        sb.append("] ");
        this.a = sb.toString().concat(str);
    }

    public static String e(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException unused) {
                "Unable to format ".concat(str2);
                String join = TextUtils.join(", ", objArr);
                int length = str2.length();
                str2 = fc6.o(new StringBuilder(String.valueOf(join).length() + length + 2 + 1), str2, " [", join, U3.j.e);
            }
        }
        return wt3.m(str, " : ", new StringBuilder(str.length() + 3 + str2.length()), str2);
    }

    public final void a(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            e(this.a, str, objArr);
        }
    }

    public final void b(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            e(this.a, str, objArr);
        }
    }

    public final void c(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            e(this.a, str, objArr);
        }
    }

    public final void d(RemoteException remoteException, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            e(this.a, str, objArr);
        }
    }
}
