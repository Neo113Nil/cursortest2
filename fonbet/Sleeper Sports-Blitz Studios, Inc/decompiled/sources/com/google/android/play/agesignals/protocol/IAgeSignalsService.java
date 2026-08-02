package com.google.android.play.agesignals.protocol;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.playcore_age_signals.zza;
import com.google.android.gms.internal.playcore_age_signals.zzb;
import com.google.android.gms.internal.playcore_age_signals.zzc;
import com.google.android.play.agesignals.protocol.IAgeSignalsServiceCallback;

/* compiled from: com.google.android.play:age-signals@@0.0.3 */
/* loaded from: classes7.dex */
public interface IAgeSignalsService extends IInterface {

    /* compiled from: com.google.android.play:age-signals@@0.0.3 */
    public static abstract class Stub extends zzb implements IAgeSignalsService {

        /* compiled from: com.google.android.play:age-signals@@0.0.3 */
        public static class Proxy extends zza implements IAgeSignalsService {
            Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.play.agesignals.protocol.IAgeSignalsService");
            }

            @Override // com.google.android.play.agesignals.protocol.IAgeSignalsService
            public void checkAgeRange(String str, Bundle bundle, IAgeSignalsServiceCallback iAgeSignalsServiceCallback) throws RemoteException {
                Parcel zza = zza();
                zza.writeString(str);
                zzc.zzc(zza, bundle);
                if (iAgeSignalsServiceCallback == null) {
                    zza.writeStrongBinder(null);
                } else {
                    zza.writeStrongBinder(iAgeSignalsServiceCallback.asBinder());
                }
                zzb(1, zza);
            }
        }

        public Stub() {
            super("com.google.android.play.agesignals.protocol.IAgeSignalsService");
        }

        public static IAgeSignalsService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.agesignals.protocol.IAgeSignalsService");
            return queryLocalInterface instanceof IAgeSignalsService ? (IAgeSignalsService) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.gms.internal.playcore_age_signals.zzb
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1) {
                return false;
            }
            String readString = parcel.readString();
            Bundle bundle = (Bundle) zzc.zza(parcel, Bundle.CREATOR);
            IAgeSignalsServiceCallback asInterface = IAgeSignalsServiceCallback.Stub.asInterface(parcel.readStrongBinder());
            zzc.zzb(parcel);
            checkAgeRange(readString, bundle, asInterface);
            return true;
        }
    }

    void checkAgeRange(String str, Bundle bundle, IAgeSignalsServiceCallback iAgeSignalsServiceCallback) throws RemoteException;
}
