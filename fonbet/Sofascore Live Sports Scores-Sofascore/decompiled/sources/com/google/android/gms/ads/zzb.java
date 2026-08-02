package com.google.android.gms.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzch;
import com.google.android.gms.internal.ads.zzbvq;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzb {
    public static volatile zzch a;

    private zzb() {
    }

    public static zzch zza(Context context) {
        if (a == null) {
            synchronized (zzb.class) {
                try {
                    if (a == null) {
                        a = zzay.zzb().zzd(context, new zzbvq());
                    }
                } finally {
                }
            }
        }
        return a;
    }
}
