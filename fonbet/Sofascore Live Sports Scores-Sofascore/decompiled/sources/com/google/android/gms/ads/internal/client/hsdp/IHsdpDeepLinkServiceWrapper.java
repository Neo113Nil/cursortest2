package com.google.android.gms.ads.internal.client.hsdp;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.internal.client.hsdp.IHsdpPrewarmServiceCallback;
import com.google.android.gms.ads.internal.client.hsdp.IHsdpServiceCallback;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbeu;
import com.google.android.gms.internal.ads.zzbev;
import com.google.android.gms.internal.ads.zzbew;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public interface IHsdpDeepLinkServiceWrapper extends IInterface {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static abstract class Stub extends zzbev implements IHsdpDeepLinkServiceWrapper {

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        public static class Proxy extends zzbeu implements IHsdpDeepLinkServiceWrapper {
            @Override // com.google.android.gms.ads.internal.client.hsdp.IHsdpDeepLinkServiceWrapper
            public void endSession(@NonNull IObjectWrapper iObjectWrapper, @NonNull String str) throws RemoteException {
                Parcel J = J();
                zzbew.e(J, iObjectWrapper);
                J.writeString(str);
                Z1(J, 2);
            }

            @Override // com.google.android.gms.ads.internal.client.hsdp.IHsdpDeepLinkServiceWrapper
            public void open(@NonNull IObjectWrapper iObjectWrapper, @NonNull String str, @NonNull String str2, @NonNull Bundle bundle, boolean z, @NonNull IHsdpServiceCallback iHsdpServiceCallback) throws RemoteException {
                Parcel J = J();
                zzbew.e(J, iObjectWrapper);
                J.writeString(str);
                J.writeString(str2);
                zzbew.c(J, bundle);
                J.writeInt(z ? 1 : 0);
                zzbew.e(J, iHsdpServiceCallback);
                Z1(J, 3);
            }

            @Override // com.google.android.gms.ads.internal.client.hsdp.IHsdpDeepLinkServiceWrapper
            public void prewarm(@NonNull IObjectWrapper iObjectWrapper, @NonNull List<Bundle> list, @NonNull IHsdpPrewarmServiceCallback iHsdpPrewarmServiceCallback) throws RemoteException {
                Parcel J = J();
                zzbew.e(J, iObjectWrapper);
                J.writeTypedList(list);
                zzbew.e(J, iHsdpPrewarmServiceCallback);
                Z1(J, 1);
            }
        }

        public Stub() {
            super("com.google.android.gms.ads.internal.client.hsdp.IHsdpDeepLinkServiceWrapper");
        }

        @NonNull
        public static IHsdpDeepLinkServiceWrapper asInterface(@NonNull IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.hsdp.IHsdpDeepLinkServiceWrapper");
            return queryLocalInterface instanceof IHsdpDeepLinkServiceWrapper ? (IHsdpDeepLinkServiceWrapper) queryLocalInterface : new Proxy(iBinder, "com.google.android.gms.ads.internal.client.hsdp.IHsdpDeepLinkServiceWrapper");
        }

        @Override // com.google.android.gms.internal.ads.zzbev
        public final boolean D4(int i, Parcel parcel, Parcel parcel2) {
            if (i == 1) {
                IObjectWrapper S1 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                ArrayList createTypedArrayList = parcel.createTypedArrayList(Bundle.CREATOR);
                IHsdpPrewarmServiceCallback asInterface = IHsdpPrewarmServiceCallback.Stub.asInterface(parcel.readStrongBinder());
                zzbew.f(parcel);
                prewarm(S1, createTypedArrayList, asInterface);
            } else if (i == 2) {
                IObjectWrapper S12 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                String readString = parcel.readString();
                zzbew.f(parcel);
                endSession(S12, readString);
            } else {
                if (i != 3) {
                    return false;
                }
                IObjectWrapper S13 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                Bundle bundle = (Bundle) zzbew.b(parcel, Bundle.CREATOR);
                boolean z = parcel.readInt() != 0;
                IHsdpServiceCallback asInterface2 = IHsdpServiceCallback.Stub.asInterface(parcel.readStrongBinder());
                zzbew.f(parcel);
                open(S13, readString2, readString3, bundle, z, asInterface2);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void endSession(@NonNull IObjectWrapper iObjectWrapper, @NonNull String str) throws RemoteException;

    void open(@NonNull IObjectWrapper iObjectWrapper, @NonNull String str, @NonNull String str2, @NonNull Bundle bundle, boolean z, @NonNull IHsdpServiceCallback iHsdpServiceCallback) throws RemoteException;

    void prewarm(@NonNull IObjectWrapper iObjectWrapper, @NonNull List<Bundle> list, @NonNull IHsdpPrewarmServiceCallback iHsdpPrewarmServiceCallback) throws RemoteException;
}
