package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@KeepForSdk
/* loaded from: classes3.dex */
public abstract class DataHolderResult implements Result, Releasable {
    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return null;
    }

    @Override // com.google.android.gms.common.api.Releasable
    public final void release() {
    }
}
