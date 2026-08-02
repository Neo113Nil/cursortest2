package com.unity3d.ads.core.domain;

import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;
import xsna.spj;

/* compiled from: AndroidAdRefresh.kt */
@b6l(c = "com.unity3d.ads.core.domain.AndroidAdRefresh", f = "AndroidAdRefresh.kt", l = {TokenParametersOuterClass$TokenParameters.TOPICS_FIELD_NUMBER, 79, 95}, m = "performRefresh")
/* loaded from: classes14.dex */
public final class AndroidAdRefresh$performRefresh$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidAdRefresh this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidAdRefresh$performRefresh$1(AndroidAdRefresh androidAdRefresh, spj<? super AndroidAdRefresh$performRefresh$1> spjVar) {
        super(spjVar);
        this.this$0 = androidAdRefresh;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object performRefresh;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        performRefresh = this.this$0.performRefresh(null, this);
        return performRefresh;
    }
}
