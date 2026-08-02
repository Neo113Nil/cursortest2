package com.google.android.gms.internal.auth;

import android.net.Uri;
import xsna.zk3;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes12.dex */
public final class zzcr {
    private static final zk3 zza = new zk3();

    /* JADX WARN: Multi-variable type inference failed */
    public static synchronized Uri zza(String str) {
        synchronized (zzcr.class) {
            zk3 zk3Var = zza;
            Uri uri = (Uri) zk3Var.get("com.google.android.gms.auth_account");
            if (uri != null) {
                return uri;
            }
            Uri parse = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.auth_account"))));
            zk3Var.put("com.google.android.gms.auth_account", parse);
            return parse;
        }
    }
}
