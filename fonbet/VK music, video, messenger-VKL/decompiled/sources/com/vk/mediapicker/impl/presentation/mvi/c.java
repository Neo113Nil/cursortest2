package com.vk.mediapicker.impl.presentation.mvi;

import java.util.List;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.bu10;
import xsna.ml1;
import xsna.rdi;
import xsna.rv10;
import xsna.rvq;
import xsna.s3q0;
import xsna.spj;
import xsna.tt10;
import xsna.wzs;
import xsna.yvj;

/* compiled from: MediaPickerMviActor.kt */
@b6l(c = "com.vk.mediapicker.impl.presentation.mvi.MediaPickerMviActor$loadAlbumMedias$1$1", f = "MediaPickerMviActor.kt", l = {151}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class c extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ int $albumBucketId;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, int i, spj<? super c> spjVar) {
        super(2, spjVar);
        this.this$0 = bVar;
        this.$albumBucketId = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new c(this.this$0, this.$albumBucketId, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((c) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        c cVar;
        Object a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            bu10 b = this.this$0.c.b();
            b bVar = this.this$0;
            int m = b.m(bVar, bVar.c.getConfig().d);
            int i2 = this.$albumBucketId;
            List<tt10> filters = this.this$0.c.getFilters();
            this.label = 1;
            cVar = this;
            a = b.a(m, i2, 0, 100, filters, cVar);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            a = ((Result) obj).d();
            cVar = this;
        }
        b bVar2 = cVar.this$0;
        if (!(a instanceof Result.Failure)) {
            rdi.y(bVar2, new ml1(11, (rv10) a, bVar2));
        }
        b bVar3 = cVar.this$0;
        if (Result.a(a) != null) {
            rdi.y(bVar3, new rvq(8));
        }
        return s3q0.a;
    }
}
