package com.google.android.gms.internal.p000authapi;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.api.identity.AuthorizationRequest;
import com.google.android.gms.auth.api.identity.ClearTokenRequest;
import com.google.android.gms.auth.api.identity.RevokeAccessRequest;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.internal.InterfaceC3132h;

/* loaded from: classes2.dex */
public final class zbj extends zba implements IInterface {
    public zbj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.IAuthorizationService");
    }

    public final void zbc(zbi zbiVar, AuthorizationRequest authorizationRequest, ApiMetadata apiMetadata) {
        Parcel zba = zba();
        zbc.zbc(zba, zbiVar);
        zbc.zbb(zba, authorizationRequest);
        zbc.zbb(zba, apiMetadata);
        zbb(1, zba);
    }

    public final void zbd(InterfaceC3132h interfaceC3132h, RevokeAccessRequest revokeAccessRequest, ApiMetadata apiMetadata) {
        Parcel zba = zba();
        zbc.zbc(zba, interfaceC3132h);
        zbc.zbb(zba, revokeAccessRequest);
        zbc.zbb(zba, apiMetadata);
        zbb(3, zba);
    }

    public final void zbe(InterfaceC3132h interfaceC3132h, ClearTokenRequest clearTokenRequest, ApiMetadata apiMetadata) {
        Parcel zba = zba();
        zbc.zbc(zba, interfaceC3132h);
        zbc.zbb(zba, clearTokenRequest);
        zbc.zbb(zba, apiMetadata);
        zbb(4, zba);
    }
}
