package com.google.android.gms.internal.cast;

import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.cast.framework.CastOptions;
import java.util.Map;
import xsna.d001;
import xsna.ewz0;
import xsna.gzz0;
import xsna.kc01;
import xsna.oxz0;
import xsna.tf01;
import xsna.vnv;
import xsna.y201;
import xsna.zwz0;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public interface zzbc extends IInterface {
    int zze() throws RemoteException;

    zwz0 zzf(vnv vnvVar, CastOptions castOptions, zzbe zzbeVar, Map map) throws RemoteException;

    d001 zzg(String str, @Nullable String str2, y201 y201Var) throws RemoteException;

    oxz0 zzh(CastOptions castOptions, vnv vnvVar, ewz0 ewz0Var) throws RemoteException;

    gzz0 zzi(vnv vnvVar, vnv vnvVar2, vnv vnvVar3) throws RemoteException;

    kc01 zzj(vnv vnvVar, tf01 tf01Var, int i, int i2, boolean z, long j, int i3, int i4, int i5) throws RemoteException;

    kc01 zzk(vnv vnvVar, vnv vnvVar2, tf01 tf01Var, int i, int i2, boolean z, long j, int i3, int i4, int i5) throws RemoteException;
}
