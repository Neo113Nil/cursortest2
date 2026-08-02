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
public interface IHsdpServiceCallback extends IInterface {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static abstract class Stub extends zzbev implements IHsdpServiceCallback {

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        public static class Proxy extends zzbeu implements IHsdpServiceCallback {
            @Override // com.google.android.gms.ads.internal.client.hsdp.IHsdpServiceCallback
            public void onDismissed(@NonNull Bundle bundle) throws RemoteException {
                Parcel J = J();
                zzbew.c(J, bundle);
                Z1(J, 2);
            }

            @Override // com.google.android.gms.ads.internal.client.hsdp.IHsdpServiceCallback
            public void onError(@NonNull Bundle bundle) throws RemoteException {
                Parcel J = J();
                zzbew.c(J, bundle);
                Z1(J, 3);
            }

            @Override // com.google.android.gms.ads.internal.client.hsdp.IHsdpServiceCallback
            public void onShown(@NonNull Bundle bundle) throws RemoteException {
                Parcel J = J();
                zzbew.c(J, bundle);
                Z1(J, 1);
            }
        }

        public Stub() {
            super("com.google.android.gms.ads.internal.client.hsdp.IHsdpServiceCallback");
        }

        @NonNull
        public static IHsdpServiceCallback asInterface(@NonNull IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.hsdp.IHsdpServiceCallback");
            return queryLocalInterface instanceof IHsdpServiceCallback ? (IHsdpServiceCallback) queryLocalInterface : new Proxy(iBinder, "com.google.android.gms.ads.internal.client.hsdp.IHsdpServiceCallback");
        }

        @Override // com.google.android.gms.internal.ads.zzbev
        public final boolean D4(int i, Parcel parcel, Parcel parcel2) {
            if (i == 1) {
                Bundle bundle = (Bundle) zzbew.b(parcel, Bundle.CREATOR);
                zzbew.f(parcel);
                onShown(bundle);
            } else if (i == 2) {
                Bundle bundle2 = (Bundle) zzbew.b(parcel, Bundle.CREATOR);
                zzbew.f(parcel);
                onDismissed(bundle2);
            } else {
                if (i != 3) {
                    return false;
                }
                Bundle bundle3 = (Bundle) zzbew.b(parcel, Bundle.CREATOR);
                zzbew.f(parcel);
                onError(bundle3);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void onDismissed(@NonNull Bundle bundle) throws RemoteException;

    void onError(@NonNull Bundle bundle) throws RemoteException;

    void onShown(@NonNull Bundle bundle) throws RemoteException;
}
