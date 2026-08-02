package com.google.android.gms.internal.auth;

import android.net.Uri;
import z.C6900a;

/* loaded from: classes2.dex */
public final class zzcr {
    private static final C6900a zza = new C6900a();

    public static synchronized Uri zza(String str) {
        synchronized (zzcr.class) {
            C6900a c6900a = zza;
            Uri uri = (Uri) c6900a.get("com.google.android.gms.auth_account");
            if (uri != null) {
                return uri;
            }
            Uri parse = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.auth_account"))));
            c6900a.put("com.google.android.gms.auth_account", parse);
            return parse;
        }
    }
}
