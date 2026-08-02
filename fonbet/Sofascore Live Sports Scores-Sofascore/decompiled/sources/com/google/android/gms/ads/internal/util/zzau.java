package com.google.android.gms.ads.internal.util;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzdj;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
final class zzau extends zzdj {
    public final /* synthetic */ Context a;
    public final /* synthetic */ zzax b;

    public zzau(zzax zzaxVar, Context context) {
        this.a = context;
        this.b = zzaxVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final void zze(@Nullable com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (zzeVar == null) {
            return;
        }
        this.b.a(this.a, zzeVar.zzb, true, true);
    }
}
