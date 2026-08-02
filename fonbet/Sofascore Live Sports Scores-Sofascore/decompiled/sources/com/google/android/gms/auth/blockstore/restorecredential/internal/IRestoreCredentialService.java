package com.google.android.gms.auth.blockstore.restorecredential.internal;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.blockstore.restorecredential.ClearRestoreCredentialRequest;
import com.google.android.gms.internal.auth_blockstore.zza;
import com.google.android.gms.internal.auth_blockstore.zzb;
import com.google.android.gms.internal.auth_blockstore.zzc;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public interface IRestoreCredentialService extends IInterface {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static abstract class Stub extends zzb implements IRestoreCredentialService {
        public static final /* synthetic */ int a = 0;

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        public static class Proxy extends zza implements IRestoreCredentialService {
            @Override // com.google.android.gms.auth.blockstore.restorecredential.internal.IRestoreCredentialService
            public final void Y1(ClearRestoreCredentialRequest clearRestoreCredentialRequest, InternalRestoreCredentialClient$clearRestoreCredential$1$callback$1 internalRestoreCredentialClient$clearRestoreCredential$1$callback$1) {
                Parcel J = J();
                zzc.b(J, clearRestoreCredentialRequest);
                zzc.c(J, internalRestoreCredentialClient$clearRestoreCredential$1$callback$1);
                S1(J, 4);
            }
        }
    }

    void Y1(ClearRestoreCredentialRequest clearRestoreCredentialRequest, InternalRestoreCredentialClient$clearRestoreCredential$1$callback$1 internalRestoreCredentialClient$clearRestoreCredential$1$callback$1);
}
