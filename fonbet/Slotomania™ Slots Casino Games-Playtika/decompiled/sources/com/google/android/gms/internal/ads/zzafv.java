package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes.dex */
public interface zzafv {
    static {
        int i = zzafu.zza;
    }

    zzafp[] zza();

    default zzafp[] zzb(Uri uri, Map map) {
        return zza();
    }
}
