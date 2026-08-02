package com.unity3d.ads.core.domain.adload;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;
import xsna.spj;

/* compiled from: AndroidWebViewLessLoadStrategy.kt */
@b6l(c = "com.unity3d.ads.core.domain.adload.AndroidWebViewLessLoadStrategy", f = "AndroidWebViewLessLoadStrategy.kt", l = {51, 58}, m = "invoke")
/* loaded from: classes14.dex */
public final class AndroidWebViewLessLoadStrategy$invoke$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidWebViewLessLoadStrategy this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidWebViewLessLoadStrategy$invoke$1(AndroidWebViewLessLoadStrategy androidWebViewLessLoadStrategy, spj<? super AndroidWebViewLessLoadStrategy$invoke$1> spjVar) {
        super(spjVar);
        this.this$0 = androidWebViewLessLoadStrategy;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke(null, null, null, null, null, null, null, false, this);
    }
}
