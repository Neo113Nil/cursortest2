package com.google.android.gms.internal.p000authapi;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;
import com.google.android.gms.common.api.ApiMetadata;

/* loaded from: classes2.dex */
public final class zbm extends zba implements IInterface {
    public zbm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.ICredentialSavingService");
    }

    public final void zbc(zbs zbsVar, SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest, ApiMetadata apiMetadata) {
        Parcel zba = zba();
        zbc.zbc(zba, zbsVar);
        zbc.zbb(zba, saveAccountLinkingTokenRequest);
        zbc.zbb(zba, apiMetadata);
        zbb(1, zba);
    }

    public final void zbd(zbu zbuVar, SavePasswordRequest savePasswordRequest, ApiMetadata apiMetadata) {
        Parcel zba = zba();
        zbc.zbc(zba, zbuVar);
        zbc.zbb(zba, savePasswordRequest);
        zbc.zbb(zba, apiMetadata);
        zbb(2, zba);
    }
}
