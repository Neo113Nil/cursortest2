package com.vk.photo.editor.ivm.filter;

import com.vk.photo.editor.ivm.filter.FilterMessage;
import com.vk.photo.editor.ivm.filter.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;

/* compiled from: FilterStore.kt */
@b6l(c = "com.vk.photo.editor.ivm.filter.FilterStore$updatePreviewRepository$2", f = "FilterStore.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class g extends SuspendLambda implements wzs<Boolean, spj<? super s3q0>, Object> {
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, spj<? super g> spjVar) {
        super(2, spjVar);
        this.this$0 = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        g gVar = new g(this.this$0, spjVar);
        gVar.Z$0 = ((Boolean) obj).booleanValue();
        return gVar;
    }

    @Override // xsna.wzs
    public final Object invoke(Boolean bool, spj<? super s3q0> spjVar) {
        Boolean bool2 = bool;
        bool2.booleanValue();
        return ((g) create(bool2, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z = this.Z$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        this.this$0.a.d(new a.e(z, FilterMessage.Source.Synthetic));
        return s3q0.a;
    }
}
