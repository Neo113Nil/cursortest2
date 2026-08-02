package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;

/* loaded from: classes.dex */
final class zzhd extends ContentObserver {
    final /* synthetic */ zzhe zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzhd(zzhe zzheVar, Handler handler) {
        super(null);
        this.zza = zzheVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z11) {
        this.zza.zzf();
    }
}
