package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.WeakHashMap;
import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
public final class zzcay {
    private final WeakHashMap zza = new WeakHashMap();

    public final Future zza(Context context) {
        return zzcff.zza.submit(new zzcaw(this, context));
    }

    final /* synthetic */ WeakHashMap zzb() {
        return this.zza;
    }
}
