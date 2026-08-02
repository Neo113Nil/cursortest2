package com.google.android.gms.internal.cast;

import android.app.Service;
import android.content.Context;
import android.os.AsyncTask;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.cast.framework.CastOptions;
import com.google.android.gms.cast.framework.ModuleUnavailableException;
import com.google.android.gms.dynamite.DynamiteModule;
import java.util.Map;
import xsna.bq70;
import xsna.d001;
import xsna.ewz0;
import xsna.gzz0;
import xsna.kc01;
import xsna.o100;
import xsna.oxz0;
import xsna.tf01;
import xsna.vnv;
import xsna.y201;
import xsna.zwz0;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class zzay {
    private static final o100 zza = new o100("CastDynamiteModule", null);

    public static zwz0 zza(Context context, CastOptions castOptions, zzbe zzbeVar, Map map) throws ModuleUnavailableException, RemoteException {
        return zzf(context).zzf(new bq70(context.getApplicationContext()), castOptions, zzbeVar, map);
    }

    @Nullable
    public static d001 zzb(Context context, String str, @Nullable String str2, y201 y201Var) {
        try {
            return zzf(context).zzg(str, str2, y201Var);
        } catch (RemoteException | ModuleUnavailableException unused) {
            zza.b("Unable to call %s on %s.", "newSessionImpl", "zzbc");
            return null;
        }
    }

    @Nullable
    public static oxz0 zzc(Context context, CastOptions castOptions, @Nullable vnv vnvVar, ewz0 ewz0Var) {
        if (vnvVar == null) {
            return null;
        }
        try {
            return zzf(context).zzh(castOptions, vnvVar, ewz0Var);
        } catch (RemoteException | ModuleUnavailableException unused) {
            zza.b("Unable to call %s on %s.", "newCastSessionImpl", "zzbc");
            return null;
        }
    }

    @Nullable
    public static gzz0 zzd(Service service, @Nullable vnv vnvVar, @Nullable vnv vnvVar2) {
        if (vnvVar != null && vnvVar2 != null) {
            try {
                return zzf(service.getApplicationContext()).zzi(new bq70(service), vnvVar, vnvVar2);
            } catch (RemoteException | ModuleUnavailableException unused) {
                zza.b("Unable to call %s on %s.", "newReconnectionServiceImpl", "zzbc");
            }
        }
        return null;
    }

    @Nullable
    public static kc01 zze(Context context, AsyncTask asyncTask, tf01 tf01Var, int i, int i2, boolean z, long j, int i3, int i4, int i5) {
        try {
            zzbc zzf = zzf(context.getApplicationContext());
            return zzf.zze() >= 233700000 ? zzf.zzk(new bq70(context.getApplicationContext()), new bq70(asyncTask), tf01Var, i, i2, false, 2097152L, 5, 333, 10000) : zzf.zzj(new bq70(asyncTask), tf01Var, i, i2, false, 2097152L, 5, 333, 10000);
        } catch (RemoteException | ModuleUnavailableException unused) {
            zza.b("Unable to call %s on %s.", "newFetchBitmapTaskImpl", "zzbc");
            return null;
        }
    }

    private static zzbc zzf(Context context) throws ModuleUnavailableException {
        try {
            IBinder b = DynamiteModule.c(context, DynamiteModule.b, "com.google.android.gms.cast.framework.dynamite").b("com.google.android.gms.cast.framework.internal.CastDynamiteModuleImpl");
            if (b == null) {
                return null;
            }
            IInterface queryLocalInterface = b.queryLocalInterface("com.google.android.gms.cast.framework.internal.ICastDynamiteModule");
            return queryLocalInterface instanceof zzbc ? (zzbc) queryLocalInterface : new zzbb(b);
        } catch (DynamiteModule.LoadingException e) {
            throw new ModuleUnavailableException(e);
        }
    }
}
