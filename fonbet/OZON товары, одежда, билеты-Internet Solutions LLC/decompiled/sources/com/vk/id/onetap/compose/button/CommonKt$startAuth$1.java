package com.vk.id.onetap.compose.button;

import Sc.s;
import com.vk.id.auth.VKIDAuthUiParams;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/vk/id/auth/VKIDAuthUiParams;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "com.vk.id.onetap.compose.button.CommonKt$startAuth$1", f = "Common.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes9.dex */
public final class CommonKt$startAuth$1 extends j implements Function1<d<? super VKIDAuthUiParams>, Object> {
    int label;

    CommonKt$startAuth$1(d<? super CommonKt$startAuth$1> dVar) {
        super(1, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(d<?> dVar) {
        return new CommonKt$startAuth$1(dVar);
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
    public final Object invoke(d<? super VKIDAuthUiParams> dVar) {
        return ((CommonKt$startAuth$1) create(dVar)).invokeSuspend(Unit.f71690a);
    }
}
