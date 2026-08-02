package com.unity3d.ads.core.domain;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;
import xsna.spj;

/* compiled from: AndroidGetClientInfo.kt */
@b6l(c = "com.unity3d.ads.core.domain.AndroidGetClientInfo", f = "AndroidGetClientInfo.kt", l = {42}, m = "invoke")
/* loaded from: classes14.dex */
public final class AndroidGetClientInfo$invoke$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidGetClientInfo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidGetClientInfo$invoke$1(AndroidGetClientInfo androidGetClientInfo, spj<? super AndroidGetClientInfo$invoke$1> spjVar) {
        super(spjVar);
        this.this$0 = androidGetClientInfo;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke(this);
    }
}
