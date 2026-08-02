package com.unity3d.ads.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;
import xsna.spj;

/* compiled from: AndroidSessionRepository.kt */
@b6l(c = "com.unity3d.ads.core.data.repository.AndroidSessionRepository", f = "AndroidSessionRepository.kt", l = {269}, m = "getPrivacy")
/* loaded from: classes14.dex */
public final class AndroidSessionRepository$getPrivacy$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidSessionRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidSessionRepository$getPrivacy$1(AndroidSessionRepository androidSessionRepository, spj<? super AndroidSessionRepository$getPrivacy$1> spjVar) {
        super(spjVar);
        this.this$0 = androidSessionRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getPrivacy(this);
    }
}
