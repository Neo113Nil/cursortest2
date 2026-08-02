package com.google.android.gms.internal.cast;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.api.internal.BasePendingResult;
import xsna.g0a;
import xsna.o100;
import xsna.qdg0;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
final class zzcf extends BasePendingResult {
    public zzcf(zzcg zzcgVar) {
        super((c) null);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final qdg0 createFailedResult(Status status) {
        o100 o100Var = g0a.n;
        return status;
    }
}
