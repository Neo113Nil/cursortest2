package ru.ozon.android.messenger.blocks.disclaimer.modal;

import Sc.s;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.android.messenger.framework.presentation.chatlist.disclaimermodal.a;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.blocks.disclaimer.modal.DisclaimerBottomSheetDialogFragment$observe$$inlined$observe$1", f = "DisclaimerBottomSheetDialogFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes10.dex */
public final class d extends j implements Function2<ru.ozon.android.messenger.framework.presentation.chatlist.disclaimermodal.a, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f85074d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ c f85075e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(kotlin.coroutines.d dVar, c cVar) {
        super(2, dVar);
        this.f85075e = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        d dVar2 = new d(dVar, this.f85075e);
        dVar2.f85074d = obj;
        return dVar2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ru.ozon.android.messenger.framework.presentation.chatlist.disclaimermodal.a aVar, kotlin.coroutines.d<? super Unit> dVar) {
        return ((d) create(aVar, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        s.b(obj);
        if (((ru.ozon.android.messenger.framework.presentation.chatlist.disclaimermodal.a) this.f85074d) instanceof a.C1678a) {
            c cVar = this.f85075e;
            c.t(cVar).U().invoke();
            cVar.dismiss();
        }
        return Unit.f71690a;
    }
}
