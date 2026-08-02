package com.vk.dialogtags.impl.list;

import com.vk.dialogtags.impl.list.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;
import xsna.spj;

/* compiled from: TagsListInlineActor.kt */
@b6l(c = "com.vk.dialogtags.impl.list.TagsListInlineActor$init$2$1", f = "TagsListInlineActor.kt", l = {36}, m = "emit")
/* loaded from: classes18.dex */
public final class d extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ c.b.a<Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c.b.a<Object> aVar, spj<? super d> spjVar) {
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
