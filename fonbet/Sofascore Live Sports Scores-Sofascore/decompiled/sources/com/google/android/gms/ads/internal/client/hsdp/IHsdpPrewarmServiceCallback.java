package com.google.android.gms.ads.internal.client.hsdp;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.ads.zzbeu;
import com.google.android.gms.internal.ads.zzbev;
import com.google.android.gms.internal.ads.zzbew;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public interface IHsdpPrewarmServiceCallback extends IInterface {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static abstract class Stub extends zzbev implements IHsdpPrewarmServiceCallback {

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        public static class Proxy extends zzbeu implements IHsdpPrewarmServiceCallback {
            @Override // com.google.android.gms.ads.internal.client.hsdp.IHsdpPrewarmServiceCallback
            public void onError(@NonNull Bundle bundle) throws RemoteException {
                Parcel J = J();
                zzbew.c(J, bundle);
                l2(J, 2);
            }

            @Override // com.google.android.gms.ads.internal.client.hsdp.IHsdpPrewarmServiceCallback
            public void onPrewarmCompleted(@NonNull Bundle bundle) throws RemoteException {
                Parcel J = J();
                zzbew.c(J, bundle);
                l2(J, 1);
            }
        }

        public Stub() {
            super("com.google.android.gms.ads.internal.client.hsdp.IHsdpPrewarmServiceCallback");
        }

        @NonNull
        public static IHsdpPrewarmServiceCallback asInterface(@NonNull IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.hsdp.IHsdpPrewarmServiceCallback");
            return queryLocalInterface instanceof IHsdpPrewarmServiceCallback ? (IHsdpPrewarmServiceCallback) queryLocalInterface : new Proxy(iBinder, "com.google.android.gms.ads.internal.client.hsdp.IHsdpPrewarmServiceCallback");
        }

        @Override // com.google.android.gms.internal.ads.zzbev
        public final boolean D4(int i, Parcel parcel, Parcel parcel2) {
            if (i == 1) {
                Bundle bundle = (Bundle) zzbew.b(parcel, Bundle.CREATOR);
                zzbew.f(parcel);
                onPrewarmCompleted(bundle);
                return true;
            }
            if (i != 2) {
                return false;
            }
            Bundle bundle2 = (Bundle) zzbew.b(parcel, Bundle.CREATOR);
            zzbew.f(parcel);
            onError(bundle2);
            return true;
        }
    }

    void onError(@NonNull Bundle bundle) throws RemoteException;

    void onPrewarmCompleted(@NonNull Bundle bundle) throws RemoteException;
}
