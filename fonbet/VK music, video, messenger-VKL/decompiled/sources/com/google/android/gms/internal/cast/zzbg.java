package com.google.android.gms.internal.cast;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public interface zzbg extends IInterface {
    int zze() throws RemoteException;

    void zzf(String str, @Nullable Bundle bundle) throws RemoteException;

    void zzg(String str, @Nullable Bundle bundle) throws RemoteException;

    void zzh(String str, @Nullable Bundle bundle) throws RemoteException;

    void zzi(String str, @Nullable Bundle bundle) throws RemoteException;

    void zzj(String str, @Nullable Bundle bundle, int i) throws RemoteException;

    void zzk(String str, String str2, @Nullable Bundle bundle) throws RemoteException;

    void zzl(String str, String str2, @Nullable Bundle bundle) throws RemoteException;

    void zzm(String str, String str2, @Nullable Bundle bundle, int i) throws RemoteException;
}
