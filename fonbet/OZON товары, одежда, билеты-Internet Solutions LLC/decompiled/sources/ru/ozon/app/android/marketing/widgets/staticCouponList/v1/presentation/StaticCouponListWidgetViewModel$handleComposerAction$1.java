package ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.platform.customActionHandlers.composerActionWithAction.ComposerActionWithActionDTO;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "data", "Lru/ozon/app/android/platform/customActionHandlers/composerActionWithAction/ComposerActionWithActionDTO;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.StaticCouponListWidgetViewModel$handleComposerAction$1", f = "StaticCouponListWidgetViewModel.kt", l = {72}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class StaticCouponListWidgetViewModel$handleComposerAction$1 extends j implements Function2<ComposerActionWithActionDTO, d<? super Unit>, Object> {
    final /* synthetic */ String $couponId;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ StaticCouponListWidgetViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StaticCouponListWidgetViewModel$handleComposerAction$1(StaticCouponListWidgetViewModel staticCouponListWidgetViewModel, String str, d<? super StaticCouponListWidgetViewModel$handleComposerAction$1> dVar) {
        super(2, dVar);
        this.this$0 = staticCouponListWidgetViewModel;
        this.$couponId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        StaticCouponListWidgetViewModel$handleComposerAction$1 staticCouponListWidgetViewModel$handleComposerAction$1 = new StaticCouponListWidgetViewModel$handleComposerAction$1(this.this$0, this.$couponId, dVar);
        staticCouponListWidgetViewModel$handleComposerAction$1.L$0 = obj;
        return staticCouponListWidgetViewModel$handleComposerAction$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object emitSuccessResult;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            ComposerActionWithActionDTO composerActionWithActionDTO = (ComposerActionWithActionDTO) this.L$0;
            StaticCouponListWidgetViewModel staticCouponListWidgetViewModel = this.this$0;
            long parseLong = Long.parseLong(this.$couponId);
            this.label = 1;
            emitSuccessResult = staticCouponListWidgetViewModel.emitSuccessResult(parseLong, composerActionWithActionDTO, this);
            if (emitSuccessResult == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ComposerActionWithActionDTO composerActionWithActionDTO, d<? super Unit> dVar) {
        return ((StaticCouponListWidgetViewModel$handleComposerAction$1) create(composerActionWithActionDTO, dVar)).invokeSuspend(Unit.f71690a);
    }
}
