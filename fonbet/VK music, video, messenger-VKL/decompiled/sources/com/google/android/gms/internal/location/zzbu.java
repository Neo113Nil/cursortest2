package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.api.internal.a;
import xsna.qdg0;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes12.dex */
abstract class zzbu extends a {
    public zzbu(c cVar) {
        super((com.google.android.gms.common.api.a<?>) zzbp.zzb, cVar);
    }

    @Override // com.google.android.gms.common.api.internal.a, xsna.ue6
    public final /* bridge */ /* synthetic */ void setResult(Object obj) {
        setResult((zzbu) obj);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ qdg0 createFailedResult(Status status) {
        return status;
    }
}
