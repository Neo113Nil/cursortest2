package com.google.android.play.agesignals.protocol;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.playcore_age_signals.zza;
import com.google.android.gms.internal.playcore_age_signals.zzb;
import com.google.android.gms.internal.playcore_age_signals.zzc;

/* compiled from: com.google.android.play:age-signals@@0.0.3 */
/* loaded from: classes7.dex */
public interface IAgeSignalsServiceCallback extends IInterface {
    void onCompleteCheckAgeSignals(Bundle bundle) throws RemoteException;

    void onError(Bundle bundle) throws RemoteException;

    /* compiled from: com.google.android.play:age-signals@@0.0.3 */
    public static abstract class Stub extends zzb implements IAgeSignalsServiceCallback {

        /* compiled from: com.google.android.play:age-signals@@0.0.3 */
        public static class Proxy extends zza implements IAgeSignalsServiceCallback {
            Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.play.agesignals.protocol.IAgeSignalsServiceCallback");
            }

            @Override // com.google.android.play.agesignals.protocol.IAgeSignalsServiceCallback
            public void onCompleteCheckAgeSignals(Bundle bundle) throws RemoteException {
                Parcel zza = zza();
                zzc.zzc(zza, bundle);
                zzb(1, zza);
            }

            @Override // com.google.android.play.agesignals.protocol.IAgeSignalsServiceCallback
            public void onError(Bundle bundle) throws RemoteException {
                Parcel zza = zza();
                zzc.zzc(zza, bundle);
                zzb(3, zza);
            }
        }

        public Stub() {
            super("com.google.android.play.agesignals.protocol.IAgeSignalsServiceCallback");
        }

        public static IAgeSignalsServiceCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.agesignals.protocol.IAgeSignalsServiceCallback");
            return queryLocalInterface instanceof IAgeSignalsServiceCallback ? (IAgeSignalsServiceCallback) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.gms.internal.playcore_age_signals.zzb
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                Bundle bundle = (Bundle) zzc.zza(parcel, Bundle.CREATOR);
                zzc.zzb(parcel);
                onCompleteCheckAgeSignals(bundle);
            } else {
                if (i != 3) {
                    return false;
                }
                Bundle bundle2 = (Bundle) zzc.zza(parcel, Bundle.CREATOR);
                zzc.zzb(parcel);
                onError(bundle2);
            }
            return true;
        }
    }
}
