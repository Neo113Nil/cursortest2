package com.vk.id.onetap.compose.onetap;

import Sc.s;
import com.vk.id.auth.VKIDAuthUiParams;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.e(c = "com.vk.id.onetap.compose.onetap.OneTapKt$OneTap$5$1", f = "OneTap.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes9.dex */
final class OneTapKt$OneTap$5$1 extends kotlin.coroutines.jvm.internal.j implements Function1<kotlin.coroutines.d<? super VKIDAuthUiParams>, Object> {
    int label;

    OneTapKt$OneTap$5$1(kotlin.coroutines.d<? super OneTapKt$OneTap$5$1> dVar) {
        super(1, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
        return new OneTapKt$OneTap$5$1(dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        return new VKIDAuthUiParams.Builder().build();
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(kotlin.coroutines.d<? super VKIDAuthUiParams> dVar) {
        return ((OneTapKt$OneTap$5$1) create(dVar)).invokeSuspend(Unit.f71690a);
    }
}
