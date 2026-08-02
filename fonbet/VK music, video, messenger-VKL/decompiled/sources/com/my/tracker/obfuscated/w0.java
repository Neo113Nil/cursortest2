package com.my.tracker.obfuscated;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.my.tracker.obfuscated.o1;

/* loaded from: classes.dex */
public abstract class w0 {
    public static void a(final y2 y2Var, final e0 e0Var, final w1 w1Var, final Context context) {
        m.a(new Runnable() { // from class: xsna.vgz0
            @Override // java.lang.Runnable
            public final void run() {
                com.my.tracker.obfuscated.w0.a(context, y2Var, e0Var, w1Var);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(Context context, y2 y2Var, e0 e0Var, w1 w1Var) {
        String str;
        String str2;
        y2 y2Var2;
        char c;
        PackageInfo a = t.a(context);
        if (a != null) {
            String l = Long.toString(a.getLongVersionCode());
            str = a.versionName;
            str2 = l;
        } else {
            str = "";
            str2 = str;
        }
        p1 a2 = p1.a(context);
        String a3 = a2.a();
        String g = y2Var.g();
        if (g.equals(a2.c())) {
            y2Var2 = y2Var;
            if (str2.equals(a3)) {
                c = 0;
            } else {
                if (a3.isEmpty()) {
                    x2.a("InstallHandler: tracking update");
                } else {
                    x2.a("InstallHandler: tracking update from" + a3 + " to " + str2);
                }
                e0Var.a(a2.f(), a3, str, str2, t.b(context));
                c = 2;
            }
        } else {
            x2.a("InstallHandler: tracking install");
            long b = a != null ? v2.b(a.firstInstallTime) : 0L;
            y2Var2 = y2Var;
            o1 a4 = o1.a(e0Var, y2Var2, context);
            o1.a a5 = a4.a();
            e0Var.a(b, t.b(context), a5);
            if (a5 == null) {
                a4.c();
            }
            a2.e(g);
            c = 1;
        }
        long j = a2.j();
        long a6 = v2.a();
        String b2 = y2Var2.b();
        if (!TextUtils.isEmpty(b2)) {
            if (a6 - j < 604800 || j == 0) {
                x2.a("InstallHandler: tracking apkPreinstallParams");
                e0Var.d(b2);
            } else {
                x2.a("InstallHandler: can't track apkPreinstallParams, tracking period has ended");
            }
        }
        if (c == 0) {
            x2.a("InstallHandler: no install/update");
            w1Var.a(j);
            return;
        }
        if (c == 1) {
            a2.b(a6);
            w1Var.a(a6);
        } else if (c == 2) {
            w1Var.a(j);
        }
        a2.d(str2);
        a2.g(str);
        a2.c(a6);
    }
}
