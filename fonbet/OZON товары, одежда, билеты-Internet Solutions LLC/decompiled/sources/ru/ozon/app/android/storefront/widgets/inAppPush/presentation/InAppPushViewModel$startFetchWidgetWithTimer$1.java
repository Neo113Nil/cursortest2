package ru.ozon.app.android.storefront.widgets.inAppPush.presentation;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.B0;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.storefront.widgets.inAppPush.presentation.InAppPushViewModel$startFetchWidgetWithTimer$1", f = "InAppPushViewModel.kt", l = {57}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class InAppPushViewModel$startFetchWidgetWithTimer$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ int $timerSeconds;
    int label;
    final /* synthetic */ InAppPushViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InAppPushViewModel$startFetchWidgetWithTimer$1(InAppPushViewModel inAppPushViewModel, int i11, d<? super InAppPushViewModel$startFetchWidgetWithTimer$1> dVar) {
        super(2, dVar);
        this.this$0 = inAppPushViewModel;
        this.$timerSeconds = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new InAppPushViewModel$startFetchWidgetWithTimer$1(this.this$0, this.$timerSeconds, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x002d, code lost:
    
        r4 = r3.this$0.timerJob;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        B0 b02;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            InAppPushViewModel inAppPushViewModel = this.this$0;
            int i12 = this.$timerSeconds;
            this.label = 1;
            obj = inAppPushViewModel.fetchAsync(i12, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        if (!((Boolean) obj).booleanValue() && b02 != null) {
            b02.j(null);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((InAppPushViewModel$startFetchWidgetWithTimer$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
