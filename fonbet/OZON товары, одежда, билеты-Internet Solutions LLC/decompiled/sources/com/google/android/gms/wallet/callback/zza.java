package com.google.android.gms.wallet.callback;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.concurrent.ExecutorService;

/* loaded from: classes9.dex */
abstract class zza extends Service {
    private Messenger zzeq = new Messenger(new zzc(this, Looper.getMainLooper()));

    @VisibleForTesting
    private ExecutorService zzer;

    zza() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzd zzdVar) {
        this.zzer.execute(zzdVar);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.zzeq.getBinder();
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.zzeq = new Messenger(new zzc(this, Looper.getMainLooper()));
        this.zzer = com.google.android.gms.internal.wallet.zze.zza().zza(com.google.android.gms.internal.wallet.zzj.zzi);
    }

    protected abstract void onRunTask(String str, CallbackInput callbackInput, OnCompleteListener<CallbackOutput> onCompleteListener);
}
