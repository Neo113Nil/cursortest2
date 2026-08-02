package com.google.android.gms.internal.measurement;

import android.net.Uri;
import androidx.collection.C5132a;

/* loaded from: classes.dex */
public final class zzho {
    private static final C5132a zza = new C5132a();

    /* JADX WARN: Multi-variable type inference failed */
    public static synchronized Uri zza(String str) {
        synchronized (zzho.class) {
            C5132a c5132a = zza;
            Uri uri = (Uri) c5132a.get("com.google.android.gms.measurement");
            if (uri != null) {
                return uri;
            }
            Uri parse = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.measurement"))));
            c5132a.put("com.google.android.gms.measurement", parse);
            return parse;
        }
    }
}
