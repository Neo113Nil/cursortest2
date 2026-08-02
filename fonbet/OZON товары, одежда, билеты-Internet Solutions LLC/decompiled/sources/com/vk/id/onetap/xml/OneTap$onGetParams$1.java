package com.vk.id.onetap.xml;

import Sc.s;
import Wc.a;
import com.vk.id.auth.VKIDAuthUiParams;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/vk/id/auth/VKIDAuthUiParams;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "com.vk.id.onetap.xml.OneTap$onGetParams$1", f = "OneTap.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes9.dex */
final class OneTap$onGetParams$1 extends j implements Function1<d<? super VKIDAuthUiParams>, Object> {
    int label;

    OneTap$onGetParams$1(d<? super OneTap$onGetParams$1> dVar) {
        super(1, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(d<?> dVar) {
        return new OneTap$onGetParams$1(dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        return new VKIDAuthUiParams.Builder().build();
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(d<? super VKIDAuthUiParams> dVar) {
        return ((OneTap$onGetParams$1) create(dVar)).invokeSuspend(Unit.f71690a);
    }
}
