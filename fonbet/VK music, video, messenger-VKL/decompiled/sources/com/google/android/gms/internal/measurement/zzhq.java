package com.google.android.gms.internal.measurement;

import android.net.Uri;
import xsna.zk3;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes12.dex */
public final class zzhq {
    private static final zk3 zza = new zk3();

    /* JADX WARN: Multi-variable type inference failed */
    public static synchronized Uri zza(String str) {
        synchronized (zzhq.class) {
            zk3 zk3Var = zza;
            Uri uri = (Uri) zk3Var.get("com.google.android.gms.measurement");
            if (uri != null) {
                return uri;
            }
            Uri parse = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.measurement"))));
            zk3Var.put("com.google.android.gms.measurement", parse);
            return parse;
        }
    }
}
