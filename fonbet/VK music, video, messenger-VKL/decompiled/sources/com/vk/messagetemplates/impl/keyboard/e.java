package com.vk.messagetemplates.impl.keyboard;

import com.vk.messagetemplates.impl.keyboard.d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;
import xsna.spj;

/* compiled from: TemplatesKeyboardInlineActor.kt */
@b6l(c = "com.vk.messagetemplates.impl.keyboard.TemplatesKeyboardInlineActor$init$2$1", f = "TemplatesKeyboardInlineActor.kt", l = {49}, m = "emit")
/* loaded from: classes3.dex */
public final class e extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ d.b.a<Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(d.b.a<Object> aVar, spj<? super e> spjVar) {
        super(spjVar);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(this);
    }
}
