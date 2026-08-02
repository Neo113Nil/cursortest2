package com.google.android.gms.maps.internal;

import D3.g;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* loaded from: classes9.dex */
public final class zzb extends com.google.android.gms.internal.maps.zza implements ICameraUpdateFactoryDelegate {
    zzb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
    }

    @Override // com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate
    public final IObjectWrapper newCameraPosition(CameraPosition cameraPosition) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zza(zza, cameraPosition);
        return g.b(zza(7, zza));
    }

    @Override // com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate
    public final IObjectWrapper newLatLng(LatLng latLng) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zza(zza, latLng);
        return g.b(zza(8, zza));
    }

    @Override // com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate
    public final IObjectWrapper newLatLngBounds(LatLngBounds latLngBounds, int i11) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zza(zza, latLngBounds);
        zza.writeInt(i11);
        return g.b(zza(10, zza));
    }

    @Override // com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate
    public final IObjectWrapper newLatLngBoundsWithSize(LatLngBounds latLngBounds, int i11, int i12, int i13) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zza(zza, latLngBounds);
        zza.writeInt(i11);
        zza.writeInt(i12);
        zza.writeInt(i13);
        return g.b(zza(11, zza));
    }

    @Override // com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate
    public final IObjectWrapper newLatLngZoom(LatLng latLng, float f7) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zza(zza, latLng);
        zza.writeFloat(f7);
        return g.b(zza(9, zza));
    }

    @Override // com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate
    public final IObjectWrapper scrollBy(float f7, float f11) throws RemoteException {
        Parcel zza = zza();
        zza.writeFloat(f7);
        zza.writeFloat(f11);
        return g.b(zza(3, zza));
    }

    @Override // com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate
    public final IObjectWrapper zoomBy(float f7) throws RemoteException {
        Parcel zza = zza();
        zza.writeFloat(f7);
        return g.b(zza(5, zza));
    }

    @Override // com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate
    public final IObjectWrapper zoomByWithFocus(float f7, int i11, int i12) throws RemoteException {
        Parcel zza = zza();
        zza.writeFloat(f7);
        zza.writeInt(i11);
        zza.writeInt(i12);
        return g.b(zza(6, zza));
    }

    @Override // com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate
    public final IObjectWrapper zoomIn() throws RemoteException {
        return g.b(zza(1, zza()));
    }

    @Override // com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate
    public final IObjectWrapper zoomOut() throws RemoteException {
        return g.b(zza(2, zza()));
    }

    @Override // com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate
    public final IObjectWrapper zoomTo(float f7) throws RemoteException {
        Parcel zza = zza();
        zza.writeFloat(f7);
        return g.b(zza(4, zza));
    }
}
