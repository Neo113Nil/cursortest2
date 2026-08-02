package com.google.android.gms.internal.measurement;

import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public interface zztc {
    default InputStream a(InputStream inputStream) {
        if (inputStream != null) {
            inputStream.close();
        }
        throw new zzsk("wrapForRead not supported by ".concat(String.valueOf(zza())));
    }

    default OutputStream b(OutputStream outputStream) {
        if (outputStream != null) {
            outputStream.close();
        }
        throw new zzsk("wrapForWrite not supported by ".concat(String.valueOf(zza())));
    }

    String zza();
}
