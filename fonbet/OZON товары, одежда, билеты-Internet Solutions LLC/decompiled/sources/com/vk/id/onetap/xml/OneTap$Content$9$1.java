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

@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", "Lcom/vk/id/auth/VKIDAuthUiParams;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "com.vk.id.onetap.xml.OneTap$Content$9$1", f = "OneTap.kt", l = {222}, m = "invokeSuspend")
/* loaded from: classes9.dex */
final class OneTap$Content$9$1 extends j implements Function1<d<? super VKIDAuthUiParams>, Object> {
    int label;
    final /* synthetic */ OneTap this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OneTap$Content$9$1(OneTap oneTap, d<? super OneTap$Content$9$1> dVar) {
        super(1, dVar);
        this.this$0 = oneTap;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(d<?> dVar) {
        return new OneTap$Content$9$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Function1 function1;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            return obj;
        }
        s.b(obj);
        function1 = this.this$0.onGetParams;
        this.label = 1;
        Object invoke = function1.invoke(this);
        return invoke == aVar ? aVar : invoke;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(d<? super VKIDAuthUiParams> dVar) {
        return ((OneTap$Content$9$1) create(dVar)).invokeSuspend(Unit.f71690a);
    }
}
