package com.google.android.gms.internal.fitness;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.c;
import xsna.qdg0;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
/* loaded from: classes12.dex */
abstract class zzbd extends zzba {
    public zzbd(c cVar) {
        super(cVar);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public /* bridge */ /* synthetic */ qdg0 createFailedResult(Status status) {
        return status;
    }
}
