package com.google.android.gms.internal.wallet;

import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.PaymentCardRecognitionIntentResponse;
import com.google.android.gms.wallet.PaymentData;

/* loaded from: classes2.dex */
public interface zzq extends IInterface {
    void zzb(int i10, FullWallet fullWallet, Bundle bundle);

    void zzc(Status status, boolean z10, Bundle bundle);

    void zzd(int i10, MaskedWallet maskedWallet, Bundle bundle);

    void zze(Status status, PaymentCardRecognitionIntentResponse paymentCardRecognitionIntentResponse, Bundle bundle);

    void zzf(Status status, PaymentData paymentData, Bundle bundle);

    void zzg(int i10, boolean z10, Bundle bundle);

    void zzh(int i10, Bundle bundle);
}
