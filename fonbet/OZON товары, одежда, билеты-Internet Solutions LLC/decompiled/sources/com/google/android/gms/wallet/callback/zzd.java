package com.google.android.gms.wallet.callback;

import android.os.Messenger;
import android.util.Log;
import com.google.android.gms.wallet.callback.CallbackOutput;
import java.util.Locale;

/* loaded from: classes9.dex */
final class zzd implements Runnable {
    private final String tag;
    private final /* synthetic */ zza zzet;
    private final CallbackInput zzeu;
    private final zzb zzev;

    zzd(zza zzaVar, CallbackInput callbackInput, Messenger messenger, String str, int i11) {
        this.zzet = zzaVar;
        this.zzeu = callbackInput;
        this.tag = str;
        this.zzev = new zzb(messenger, i11);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (Log.isLoggable("BaseCallbackTaskService", 4)) {
            Locale locale = Locale.US;
            Log.i("BaseCallbackTaskService", "Running Callback Task w/ tag " + this.tag);
        }
        try {
            this.zzet.onRunTask(this.tag, this.zzeu, this.zzev);
        } catch (Throwable th2) {
            zzb zzbVar = this.zzev;
            CallbackOutput.zza zzc = CallbackOutput.zze().zzb(this.zzeu.zzex).zzc(5);
            String message = th2.getMessage();
            CallbackOutput callbackOutput = CallbackOutput.this;
            callbackOutput.zzfc = message;
            zzbVar.complete(callbackOutput);
            throw th2;
        }
    }
}
