package com.google.android.gms.internal.measurement;

import android.net.Uri;
import defpackage.fc6;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public interface zzsx {
    default InputStream a(Uri uri) {
        throw new zzsk("openForRead not supported by ".concat(zzc()));
    }

    default File b(Uri uri) {
        String zzc = zzc();
        String valueOf = String.valueOf(uri);
        throw new zzsk(fc6.o(new StringBuilder(zzc.length() + 28 + valueOf.length()), "Cannot convert uri to file ", zzc, " ", valueOf));
    }

    default OutputStream c(Uri uri) {
        throw new zzsk("openForWrite not supported by ".concat(zzc()));
    }

    default void d(Uri uri) {
        throw new zzsk("deleteFile not supported by ".concat(zzc()));
    }

    default void e(Uri uri, Uri uri2) {
        throw new zzsk("rename not supported by ".concat(zzc()));
    }

    String zzc();
}
