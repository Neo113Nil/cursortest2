package com.vk.movika.sdk.base.ui;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;

@b6l(c = "com.vk.movika.sdk.base.ui.CoreInteractivePlayer", f = "CoreInteractivePlayer.kt", l = {907}, m = "suspendSendIntent")
/* loaded from: classes3.dex */
public final class f0 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ y b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(y yVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = yVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.q(null, this);
    }
}
