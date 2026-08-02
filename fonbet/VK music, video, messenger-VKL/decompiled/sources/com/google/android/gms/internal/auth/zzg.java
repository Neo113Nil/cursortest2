package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.tasks.Task;
import xsna.ty2;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes12.dex */
public interface zzg {
    @NonNull
    /* synthetic */ ty2 getApiKey();

    Task zza(zzbw zzbwVar);

    Task zzb(@NonNull AccountChangeEventsRequest accountChangeEventsRequest);

    Task zzc(@NonNull Account account, @NonNull String str, Bundle bundle);

    Task zzd(@NonNull Account account);

    Task zze(@NonNull String str);
}
