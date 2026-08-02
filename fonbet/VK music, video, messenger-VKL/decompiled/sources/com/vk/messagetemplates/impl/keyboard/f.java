package com.vk.messagetemplates.impl.keyboard;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;

/* compiled from: TemplatesKeyboardInlineActor.kt */
@b6l(c = "com.vk.messagetemplates.impl.keyboard.TemplatesKeyboardInlineActor", f = "TemplatesKeyboardInlineActor.kt", l = {84}, m = "loadArguments")
/* loaded from: classes3.dex */
public final class f extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d dVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return d.m(this.this$0, this);
    }
}
