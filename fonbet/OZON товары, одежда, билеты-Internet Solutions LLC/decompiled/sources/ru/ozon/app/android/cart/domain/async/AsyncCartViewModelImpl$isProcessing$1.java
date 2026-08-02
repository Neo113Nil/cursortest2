package ru.ozon.app.android.cart.domain.async;

import Sc.s;
import Wc.a;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "isProcessing", "isEnabled"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.cart.domain.async.AsyncCartViewModelImpl$isProcessing$1", f = "AsyncCartViewModelImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class AsyncCartViewModelImpl$isProcessing$1 extends j implements InterfaceC6511n<Boolean, Boolean, d<? super Boolean>, Object> {
    /* synthetic */ boolean Z$0;
    /* synthetic */ boolean Z$1;
    int label;

    AsyncCartViewModelImpl$isProcessing$1(d<? super AsyncCartViewModelImpl$isProcessing$1> dVar) {
        super(3, dVar);
    }

    @Override // fd.InterfaceC6511n
    public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Boolean bool2, d<? super Boolean> dVar) {
        return invoke(bool.booleanValue(), bool2.booleanValue(), dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        return Boolean.valueOf(this.Z$0 && this.Z$1);
    }

    public final Object invoke(boolean z11, boolean z12, d<? super Boolean> dVar) {
        AsyncCartViewModelImpl$isProcessing$1 asyncCartViewModelImpl$isProcessing$1 = new AsyncCartViewModelImpl$isProcessing$1(dVar);
        asyncCartViewModelImpl$isProcessing$1.Z$0 = z11;
        asyncCartViewModelImpl$isProcessing$1.Z$1 = z12;
        return asyncCartViewModelImpl$isProcessing$1.invokeSuspend(Unit.f71690a);
    }
}
