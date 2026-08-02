package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import defpackage.a70;
import defpackage.dh0;
import defpackage.wt3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzlg {
    public static final dh0 a = new dh0(0);

    public static synchronized Uri a() {
        synchronized (zzlg.class) {
            dh0 dh0Var = a;
            Uri uri = (Uri) dh0Var.get("com.google.android.gms.measurement");
            if (uri != null) {
                return uri;
            }
            Uri parse = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.measurement"))));
            dh0Var.put("com.google.android.gms.measurement", parse);
            return parse;
        }
    }

    public static String b(Context context, String str) {
        if (str.contains("#")) {
            a70.p("The passed in package cannot already have a subpackage: ".concat(str));
            return null;
        }
        String packageName = context.getPackageName();
        return wt3.m(str, "#", new StringBuilder(str.length() + 1 + String.valueOf(packageName).length()), packageName);
    }
}
