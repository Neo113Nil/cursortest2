package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes5.dex */
public interface zzhj extends zzj {
    long zzb(zzhn zzhnVar) throws IOException;

    Uri zzc();

    void zzd() throws IOException;

    void zze(zzih zzihVar);

    default Map zzj() {
        return Collections.emptyMap();
    }
}
