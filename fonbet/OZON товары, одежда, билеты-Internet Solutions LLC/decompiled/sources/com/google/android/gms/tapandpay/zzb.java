package com.google.android.gms.tapandpay;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.internal.tapandpay.zzag;

/* loaded from: classes9.dex */
final class zzb extends Api.AbstractClientBuilder<zzag, Api.ApiOptions.NotRequiredOptions> {
    zzb() {
    }

    @Override // com.google.android.gms.common.api.Api.AbstractClientBuilder
    public final /* synthetic */ zzag buildClient(Context context, Looper looper, ClientSettings clientSettings, Api.ApiOptions.NotRequiredOptions notRequiredOptions, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        return new zzag(context, looper, connectionCallbacks, onConnectionFailedListener, clientSettings);
    }
}
