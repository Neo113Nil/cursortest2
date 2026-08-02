package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.model.ShowEvent;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.il4;
import defpackage.rq3;
import defpackage.sq3;
import kotlin.Metadata;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@il4(c = "com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$4", f = "LegacyShowUseCase.kt", l = {Sdk.SDKError.Reason.INVALID_JSON_BID_PAYLOAD_VALUE, Sdk.SDKError.Reason.INVALID_GZIP_BID_PAYLOAD_VALUE, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit")
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LegacyShowUseCase$invoke$4$emit$1 extends sq3 {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LegacyShowUseCase$invoke$4<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LegacyShowUseCase$invoke$4$emit$1(LegacyShowUseCase$invoke$4<? super T> legacyShowUseCase$invoke$4, rq3<? super LegacyShowUseCase$invoke$4$emit$1> rq3Var) {
        super(rq3Var);
        this.this$0 = legacyShowUseCase$invoke$4;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((ShowEvent) null, (rq3<? super Unit>) this);
    }
}
