package ru.ozon.app.android.composer.widgets.v2.onboarding.presentation;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "isVisible"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.BottomSheetVisibilityObserver$awaitBottomSheetHidden$2", f = "BottomSheetVisibilityObserver.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class BottomSheetVisibilityObserver$awaitBottomSheetHidden$2 extends j implements Function2<Boolean, d<? super Boolean>, Object> {
    /* synthetic */ boolean Z$0;
    int label;

    BottomSheetVisibilityObserver$awaitBottomSheetHidden$2(d<? super BottomSheetVisibilityObserver$awaitBottomSheetHidden$2> dVar) {
        super(2, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        BottomSheetVisibilityObserver$awaitBottomSheetHidden$2 bottomSheetVisibilityObserver$awaitBottomSheetHidden$2 = new BottomSheetVisibilityObserver$awaitBottomSheetHidden$2(dVar);
        bottomSheetVisibilityObserver$awaitBottomSheetHidden$2.Z$0 = ((Boolean) obj).booleanValue();
        return bottomSheetVisibilityObserver$awaitBottomSheetHidden$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Boolean bool, d<? super Boolean> dVar) {
        return invoke(bool.booleanValue(), dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        return Boolean.valueOf(!this.Z$0);
    }

    public final Object invoke(boolean z11, d<? super Boolean> dVar) {
        return ((BottomSheetVisibilityObserver$awaitBottomSheetHidden$2) create(Boolean.valueOf(z11), dVar)).invokeSuspend(Unit.f71690a);
    }
}
