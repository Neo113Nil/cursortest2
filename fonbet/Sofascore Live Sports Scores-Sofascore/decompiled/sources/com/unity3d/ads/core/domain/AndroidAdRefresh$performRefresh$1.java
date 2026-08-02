package com.unity3d.ads.core.domain;

import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import defpackage.il4;
import defpackage.rq3;
import defpackage.sq3;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@il4(c = "com.unity3d.ads.core.domain.AndroidAdRefresh", f = "AndroidAdRefresh.kt", l = {TokenParametersOuterClass$TokenParameters.TOPICS_FIELD_NUMBER, 79, 95}, m = "performRefresh")
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidAdRefresh$performRefresh$1 extends sq3 {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidAdRefresh this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidAdRefresh$performRefresh$1(AndroidAdRefresh androidAdRefresh, rq3<? super AndroidAdRefresh$performRefresh$1> rq3Var) {
        super(rq3Var);
        this.this$0 = androidAdRefresh;
    }

    @Override // defpackage.h21
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object performRefresh;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        performRefresh = this.this$0.performRefresh(null, this);
        return performRefresh;
    }
}
