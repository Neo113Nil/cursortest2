package com.vk.libvideo.design.compose.base.preview;

import com.vk.libvideo.design.compose.base.preview.PreviewViewState;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.gzs;
import xsna.qsl;
import xsna.s3q0;
import xsna.spj;
import xsna.wh50;
import xsna.wzs;
import xsna.yvj;
import xsna.zvj;

/* compiled from: PreviewView.kt */
@b6l(c = "com.vk.libvideo.design.compose.base.preview.PreviewViewKt$PreviewTopText$1$1", f = "PreviewView.kt", l = {775}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class b extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ wh50<Boolean> $isVisible;
    final /* synthetic */ wh50<String> $lastText;
    final /* synthetic */ PreviewViewState.v $state;
    final /* synthetic */ String $stateText;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String str, wh50<Boolean> wh50Var, wh50<String> wh50Var2, PreviewViewState.v vVar, spj<? super b> spjVar) {
        super(2, spjVar);
        this.$stateText = str;
        this.$isVisible = wh50Var;
        this.$lastText = wh50Var2;
        this.$state = vVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        b bVar = new b(this.$stateText, this.$isVisible, this.$lastText, this.$state, spjVar);
        bVar.L$0 = obj;
        return bVar;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((b) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        yvj yvjVar = (yvj) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            String str = this.$stateText;
            if (str == null) {
                this.$isVisible.setValue(Boolean.FALSE);
                this.$lastText.setValue(null);
            } else if (!str.equals(this.$lastText.getValue())) {
                this.$isVisible.setValue(Boolean.TRUE);
                this.$lastText.setValue(this.$stateText);
                this.L$0 = yvjVar;
                this.label = 1;
                if (qsl.b(5000L, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return s3q0.a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        if (zvj.f(yvjVar)) {
            this.$isVisible.setValue(Boolean.FALSE);
            gzs<? extends s3q0> h = this.$state.a().h();
            if (h != null) {
                h.invoke();
            }
        }
        return s3q0.a;
    }
}
