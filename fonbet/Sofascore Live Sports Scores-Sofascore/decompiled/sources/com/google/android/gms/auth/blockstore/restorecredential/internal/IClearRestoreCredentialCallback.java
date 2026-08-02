package com.google.android.gms.auth.blockstore.restorecredential.internal;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.internal.auth_blockstore.zzb;
import com.google.android.gms.internal.auth_blockstore.zzc;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public interface IClearRestoreCredentialCallback extends IInterface {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static abstract class Stub extends zzb implements IClearRestoreCredentialCallback {
        public Stub() {
            super("com.google.android.gms.auth.blockstore.restorecredential.internal.IClearRestoreCredentialCallback");
        }

        @Override // com.google.android.gms.internal.auth_blockstore.zzb
        public final boolean J(Parcel parcel, int i) {
            if (i != 1) {
                return false;
            }
            Status status = (Status) zzc.a(parcel, Status.CREATOR);
            boolean z = parcel.readInt() != 0;
            zzb.S1(parcel);
            status.getClass();
            TaskUtil.a(status, Boolean.valueOf(z), ((InternalRestoreCredentialClient$clearRestoreCredential$1$callback$1) this).a);
            return true;
        }
    }
}
