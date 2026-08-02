package com.google.android.gms.internal.p000authapi;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.internal.InterfaceC3132h;

/* loaded from: classes2.dex */
public final class zbv extends zba implements IInterface {
    public zbv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.ISignInService");
    }

    public final void zbc(zbl zblVar, BeginSignInRequest beginSignInRequest, ApiMetadata apiMetadata) {
        Parcel zba = zba();
        zbc.zbc(zba, zblVar);
        zbc.zbb(zba, beginSignInRequest);
        zbc.zbb(zba, apiMetadata);
        zbb(1, zba);
    }

    public final void zbd(InterfaceC3132h interfaceC3132h, String str, ApiMetadata apiMetadata) {
        Parcel zba = zba();
        zbc.zbc(zba, interfaceC3132h);
        zba.writeString(str);
        zbc.zbb(zba, apiMetadata);
        zbb(2, zba);
    }

    public final void zbe(zbq zbqVar, GetSignInIntentRequest getSignInIntentRequest, ApiMetadata apiMetadata) {
        Parcel zba = zba();
        zbc.zbc(zba, zbqVar);
        zbc.zbb(zba, getSignInIntentRequest);
        zbc.zbb(zba, apiMetadata);
        zbb(3, zba);
    }

    public final void zbf(zbo zboVar, GetPhoneNumberHintIntentRequest getPhoneNumberHintIntentRequest, String str, ApiMetadata apiMetadata) {
        Parcel zba = zba();
        zbc.zbc(zba, zboVar);
        zbc.zbb(zba, getPhoneNumberHintIntentRequest);
        zba.writeString(str);
        zbc.zbb(zba, apiMetadata);
        zbb(4, zba);
    }
}
