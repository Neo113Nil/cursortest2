package com.google.android.gms.internal.auth;

import android.net.Uri;
import androidx.collection.C5132a;

/* loaded from: classes9.dex */
public final class zzcr {
    private static final C5132a zza = new C5132a();

    /* JADX WARN: Multi-variable type inference failed */
    public static synchronized Uri zza(String str) {
        synchronized (zzcr.class) {
            C5132a c5132a = zza;
            Uri uri = (Uri) c5132a.get("com.google.android.gms.auth_account");
            if (uri != null) {
                return uri;
            }
            Uri parse = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.auth_account"))));
            c5132a.put("com.google.android.gms.auth_account", parse);
            return parse;
        }
    }
}
