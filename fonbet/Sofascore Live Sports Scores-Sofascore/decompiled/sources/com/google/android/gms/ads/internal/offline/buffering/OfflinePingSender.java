package com.google.android.gms.ads.internal.offline.buffering;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.zzbvq;
import com.google.android.gms.internal.ads.zzbzm;
import defpackage.gdb;
import defpackage.jdb;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@KeepForSdk
/* loaded from: classes3.dex */
public class OfflinePingSender extends Worker {
    public final zzbzm a;

    public OfflinePingSender(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.a = zzay.zzb().zzj(context, new zzbvq());
    }

    @Override // androidx.work.Worker
    @NonNull
    public final jdb doWork() {
        try {
            this.a.zzg();
            return jdb.a();
        } catch (RemoteException unused) {
            return new gdb();
        }
    }
}
