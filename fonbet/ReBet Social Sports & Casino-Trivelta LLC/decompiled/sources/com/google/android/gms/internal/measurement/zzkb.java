package com.google.android.gms.internal.measurement;

import android.net.Uri;
import z.C6900a;

/* loaded from: classes2.dex */
public final class zzkb {
    public static final /* synthetic */ int zza = 0;
    private static final C6900a zzb = new C6900a();

    public static synchronized Uri zza(String str) {
        synchronized (zzkb.class) {
            C6900a c6900a = zzb;
            Uri uri = (Uri) c6900a.get("com.google.android.gms.measurement");
            if (uri != null) {
                return uri;
            }
            Uri parse = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.measurement"))));
            c6900a.put("com.google.android.gms.measurement", parse);
            return parse;
        }
    }
}
