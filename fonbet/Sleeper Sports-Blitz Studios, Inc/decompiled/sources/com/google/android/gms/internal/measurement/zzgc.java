package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.1 */
/* loaded from: classes7.dex */
final class zzgc extends ContentObserver {
    private final /* synthetic */ zzga zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgc(zzga zzgaVar, Handler handler) {
        super(null);
        this.zza = zzgaVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        AtomicBoolean atomicBoolean;
        atomicBoolean = this.zza.zza;
        atomicBoolean.set(true);
    }
}
