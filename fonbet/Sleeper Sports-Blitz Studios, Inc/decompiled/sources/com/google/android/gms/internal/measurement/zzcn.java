package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.1 */
/* loaded from: classes7.dex */
public abstract class zzcn {
    private static zzcn zza = new zzcq();

    public static synchronized zzcn zza() {
        zzcn zzcnVar;
        synchronized (zzcn.class) {
            zzcnVar = zza;
        }
        return zzcnVar;
    }

    public abstract URLConnection zza(URL url, String str) throws IOException;
}
