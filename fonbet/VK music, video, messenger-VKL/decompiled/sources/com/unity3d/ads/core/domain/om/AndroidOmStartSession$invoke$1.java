package com.unity3d.ads.core.domain.om;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;
import xsna.spj;

/* compiled from: AndroidOmStartSession.kt */
@b6l(c = "com.unity3d.ads.core.domain.om.AndroidOmStartSession", f = "AndroidOmStartSession.kt", l = {18}, m = "invoke")
/* loaded from: classes14.dex */
public final class AndroidOmStartSession$invoke$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidOmStartSession this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidOmStartSession$invoke$1(AndroidOmStartSession androidOmStartSession, spj<? super AndroidOmStartSession$invoke$1> spjVar) {
        super(spjVar);
        this.this$0 = androidOmStartSession;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke(null, null, this);
    }
}
