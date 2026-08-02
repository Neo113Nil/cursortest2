package com.google.android.gms.wallet.callback;

import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;

/* loaded from: classes9.dex */
final class zzb implements OnCompleteListener<CallbackOutput> {
    private Messenger replyTo;
    private final int zzes;

    zzb(Messenger messenger, int i11) {
        this.replyTo = messenger;
        this.zzes = i11;
    }

    @Override // com.google.android.gms.wallet.callback.OnCompleteListener
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final synchronized void complete(CallbackOutput callbackOutput) {
        if (this.replyTo != null) {
            try {
                Preconditions.checkArgument(callbackOutput.zzfa != 0, "Callback Response Status must be set - status value must be non-zero.");
                Message obtain = Message.obtain();
                obtain.what = 1;
                obtain.arg1 = this.zzes;
                Bundle bundle = new Bundle();
                bundle.putByteArray("extra_callback_output", SafeParcelableSerializer.serializeToBytes(callbackOutput));
                obtain.setData(bundle);
                this.replyTo.send(obtain);
                this.replyTo = null;
            } catch (RemoteException e11) {
                Log.e("BaseCallbackTaskService", "Error sending result of task to the callback service client for BaseCallbackTaskService", e11);
            }
        }
    }
}
