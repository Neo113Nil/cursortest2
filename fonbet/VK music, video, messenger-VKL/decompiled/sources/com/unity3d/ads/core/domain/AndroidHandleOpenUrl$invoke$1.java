package com.unity3d.ads.core.domain;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;
import xsna.spj;

/* compiled from: AndroidHandleOpenUrl.kt */
@b6l(c = "com.unity3d.ads.core.domain.AndroidHandleOpenUrl", f = "AndroidHandleOpenUrl.kt", l = {52}, m = "invoke")
/* loaded from: classes14.dex */
public final class AndroidHandleOpenUrl$invoke$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidHandleOpenUrl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidHandleOpenUrl$invoke$1(AndroidHandleOpenUrl androidHandleOpenUrl, spj<? super AndroidHandleOpenUrl$invoke$1> spjVar) {
        super(spjVar);
        this.this$0 = androidHandleOpenUrl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke(null, null, null, null, null, false, this);
    }
}
