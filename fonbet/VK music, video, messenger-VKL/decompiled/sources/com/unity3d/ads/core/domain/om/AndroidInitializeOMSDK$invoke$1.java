package com.unity3d.ads.core.domain.om;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;
import xsna.spj;

/* compiled from: AndroidInitializeOMSDK.kt */
@b6l(c = "com.unity3d.ads.core.domain.om.AndroidInitializeOMSDK", f = "AndroidInitializeOMSDK.kt", l = {27}, m = "invoke")
/* loaded from: classes14.dex */
public final class AndroidInitializeOMSDK$invoke$1 extends ContinuationImpl {
    long J$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidInitializeOMSDK this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidInitializeOMSDK$invoke$1(AndroidInitializeOMSDK androidInitializeOMSDK, spj<? super AndroidInitializeOMSDK$invoke$1> spjVar) {
        super(spjVar);
        this.this$0 = androidInitializeOMSDK;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke(this);
    }
}
