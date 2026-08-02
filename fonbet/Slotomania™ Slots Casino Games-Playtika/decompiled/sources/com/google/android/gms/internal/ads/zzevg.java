package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes2.dex */
public final class zzevg implements zzfbw {
    final ArrayList zza;

    public zzevg(ArrayList arrayList) {
        this.zza = arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzfbw
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        zzflb.zzg((Bundle) obj, "android_permissions", this.zza);
    }
}
