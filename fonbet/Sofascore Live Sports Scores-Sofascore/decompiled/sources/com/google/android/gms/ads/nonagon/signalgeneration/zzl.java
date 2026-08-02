package com.google.android.gms.ads.nonagon.signalgeneration;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.query.QueryInfo;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzl {
    public final QueryInfo a;
    public final String b;
    public final long c;
    public final int d;
    public final AtomicBoolean e = new AtomicBoolean(false);

    public zzl(@Nullable QueryInfo queryInfo, String str, long j, int i) {
        this.a = queryInfo;
        this.b = str;
        this.c = j;
        this.d = i;
    }

    @Nullable
    public final QueryInfo zza() {
        return this.a;
    }

    public final String zzb() {
        return this.b;
    }

    public final boolean zzc() {
        return this.c <= com.google.android.gms.ads.internal.zzt.zzk().a();
    }

    public final int zzd() {
        return this.d;
    }

    public final boolean zze() {
        return this.e.get();
    }

    public final void zzf() {
        this.e.set(true);
    }
}
