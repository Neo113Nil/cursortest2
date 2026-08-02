package com.vk.movika.sdk.base.ui;

import com.ironsource.InterfaceC4413l1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;

@b6l(c = "com.vk.movika.sdk.base.ui.CoreInteractivePlayer", f = "CoreInteractivePlayer.kt", l = {InterfaceC4413l1.a.b.i}, m = "handleVideoChanged")
/* loaded from: classes3.dex */
public final class a0 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ y b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(y yVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = yVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return y.x(this.b, null, this);
    }
}
