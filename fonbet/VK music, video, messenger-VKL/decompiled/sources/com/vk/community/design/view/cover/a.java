package com.vk.community.design.view.cover;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.chs;
import xsna.gzs;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;

/* compiled from: CommunityStaticCover.kt */
@b6l(c = "com.vk.community.design.view.cover.CommunityStaticCoverKt$ImageContent$4$1", f = "CommunityStaticCover.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ chs $coverImageState;
    final /* synthetic */ gzs<s3q0> $onImageLoadFailed;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(chs chsVar, gzs<s3q0> gzsVar, spj<? super a> spjVar) {
        super(2, spjVar);
        this.$coverImageState = chsVar;
        this.$onImageLoadFailed = gzsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new a(this.$coverImageState, this.$onImageLoadFailed, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        if (this.$coverImageState instanceof chs.b) {
            this.$onImageLoadFailed.invoke();
        }
        return s3q0.a;
    }
}
