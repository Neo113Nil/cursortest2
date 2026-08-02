package com.vk.mediapicker.impl.presentation.mvi;

import com.vk.mediapicker.impl.presentation.mvi.MediaPickerMviState;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.b810;
import xsna.bu10;
import xsna.o15;
import xsna.qcl;
import xsna.rdi;
import xsna.rv10;
import xsna.s3q0;
import xsna.spj;
import xsna.tt10;
import xsna.wzs;
import xsna.yvj;

/* compiled from: MediaPickerMviActor.kt */
@b6l(c = "com.vk.mediapicker.impl.presentation.mvi.MediaPickerMviActor$paginationLoadMedia$1$1", f = "MediaPickerMviActor.kt", l = {179}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class e extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ int $albumBucketId;
    final /* synthetic */ MediaPickerMviState.Medias.Loaded $mediasState;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(b bVar, int i, MediaPickerMviState.Medias.Loaded loaded, spj<? super e> spjVar) {
        super(2, spjVar);
        this.this$0 = bVar;
        this.$albumBucketId = i;
        this.$mediasState = loaded;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new e(this.this$0, this.$albumBucketId, this.$mediasState, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((e) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        e eVar;
        Object a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            rdi.y(this.this$0, new b810(this.$mediasState, 1));
            bu10 b = this.this$0.c.b();
            b bVar = this.this$0;
            int m = b.m(bVar, bVar.c.getConfig().d);
            int i2 = this.$albumBucketId;
            int size = this.$mediasState.d.size() + this.$mediasState.c.size();
            List<tt10> filters = this.this$0.c.getFilters();
            this.label = 1;
            eVar = this;
            a = b.a(m, i2, size, 100, filters, eVar);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            a = ((Result) obj).d();
            eVar = this;
        }
        b bVar2 = eVar.this$0;
        MediaPickerMviState.Medias.Loaded loaded = eVar.$mediasState;
        if (!(a instanceof Result.Failure)) {
            rdi.y(bVar2, new o15(loaded, (rv10) a, bVar2, 3));
        }
        b bVar3 = eVar.this$0;
        MediaPickerMviState.Medias.Loaded loaded2 = eVar.$mediasState;
        if (Result.a(a) != null) {
            rdi.y(bVar3, new qcl(loaded2, 28));
        }
        return s3q0.a;
    }
}
