package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.hto;
import defpackage.j8n;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzkp extends zzbm implements zzkq {
    public zzkp() {
        super("com.google.android.gms.phenotype.internal.IGetStorageInfoCallbacks");
    }

    @Override // com.google.android.gms.internal.measurement.zzbm
    public final boolean J(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        Status status = (Status) zzbn.a(parcel, Status.CREATOR);
        byte[] createByteArray = parcel.createByteArray();
        zzbn.d(parcel);
        TaskCompletionSource taskCompletionSource = ((hto) this).a;
        if (!status.Y0()) {
            TaskUtil.a(status, null, taskCompletionSource);
            return true;
        }
        try {
            zzadf zzadfVar = zzadf.b;
            int i2 = j8n.a;
            TaskUtil.a(status, zzno.A(createByteArray, zzadf.c), taskCompletionSource);
            return true;
        } catch (zzaeh e) {
            taskCompletionSource.setException(e);
            return true;
        }
    }
}
