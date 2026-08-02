package com.google.android.gms.internal.cast;

import android.os.IInterface;
import android.os.RemoteException;
import android.view.Surface;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.ApiMetadata;

/* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
/* loaded from: classes12.dex */
public interface zzey extends IInterface {
    void zzb(int i, int i2, Surface surface, @Nullable ApiMetadata apiMetadata) throws RemoteException;

    void zzc(@Nullable ApiMetadata apiMetadata) throws RemoteException;

    void zzd(int i, @Nullable ApiMetadata apiMetadata) throws RemoteException;

    void zze(boolean z, @Nullable ApiMetadata apiMetadata) throws RemoteException;

    void zzf(@Nullable ApiMetadata apiMetadata) throws RemoteException;
}
