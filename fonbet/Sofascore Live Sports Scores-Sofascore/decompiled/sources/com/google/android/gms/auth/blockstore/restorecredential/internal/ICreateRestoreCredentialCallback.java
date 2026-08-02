package com.google.android.gms.auth.blockstore.restorecredential.internal;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.blockstore.restorecredential.CreateRestoreCredentialResponse;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.internal.auth_blockstore.zzb;
import com.google.android.gms.internal.auth_blockstore.zzc;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public interface ICreateRestoreCredentialCallback extends IInterface {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static abstract class Stub extends zzb implements ICreateRestoreCredentialCallback {
        public Stub() {
            super("com.google.android.gms.auth.blockstore.restorecredential.internal.ICreateRestoreCredentialCallback");
        }

        @Override // com.google.android.gms.internal.auth_blockstore.zzb
        public final boolean J(Parcel parcel, int i) {
            if (i != 1) {
                return false;
            }
            Status status = (Status) zzc.a(parcel, Status.CREATOR);
            CreateRestoreCredentialResponse createRestoreCredentialResponse = (CreateRestoreCredentialResponse) zzc.a(parcel, CreateRestoreCredentialResponse.CREATOR);
            zzb.S1(parcel);
            status.getClass();
            createRestoreCredentialResponse.getClass();
            TaskUtil.a(status, createRestoreCredentialResponse, null);
            return true;
        }
    }
}
