package com.google.android.gms.cast.framework.media;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class b extends BasePendingResult {
    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ Result e(Status status) {
        return new a(this, status);
    }
}
