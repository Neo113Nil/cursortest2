package ru.ozon.app.android.ugcratingmolecule.presentation;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "uiRatingState", "Lru/ozon/app/android/ugcratingmolecule/presentation/UiRatingState;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.ugcratingmolecule.presentation.UgcRatingDelegateImpl$observeUiRatingState$1", f = "UgcRatingDelegateImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class UgcRatingDelegateImpl$observeUiRatingState$1 extends j implements Function2<UiRatingState, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ UgcRatingDelegateImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UgcRatingDelegateImpl$observeUiRatingState$1(UgcRatingDelegateImpl ugcRatingDelegateImpl, d<? super UgcRatingDelegateImpl$observeUiRatingState$1> dVar) {
        super(2, dVar);
        this.this$0 = ugcRatingDelegateImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        UgcRatingDelegateImpl$observeUiRatingState$1 ugcRatingDelegateImpl$observeUiRatingState$1 = new UgcRatingDelegateImpl$observeUiRatingState$1(this.this$0, dVar);
        ugcRatingDelegateImpl$observeUiRatingState$1.L$0 = obj;
        return ugcRatingDelegateImpl$observeUiRatingState$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        this.this$0.handleRatingState((UiRatingState) this.L$0);
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(UiRatingState uiRatingState, d<? super Unit> dVar) {
        return ((UgcRatingDelegateImpl$observeUiRatingState$1) create(uiRatingState, dVar)).invokeSuspend(Unit.f71690a);
    }
}
