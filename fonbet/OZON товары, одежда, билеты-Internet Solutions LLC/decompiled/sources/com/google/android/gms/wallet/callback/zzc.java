package com.google.android.gms.wallet.callback;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;

/* loaded from: classes9.dex */
final class zzc extends com.google.android.gms.internal.wallet.zzi {
    private final /* synthetic */ zza zzet;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzc(zza zzaVar, Looper looper) {
        super(looper);
        this.zzet = zzaVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.replyTo == null) {
            return;
        }
        this.zzet.zza(new zzd(this.zzet, (CallbackInput) SafeParcelableSerializer.deserializeFromBytes(message.getData().getByteArray("extra_callback_input"), CallbackInput.CREATOR), message.replyTo, message.getData().getString("message_task_tag"), message.arg1));
    }
}
