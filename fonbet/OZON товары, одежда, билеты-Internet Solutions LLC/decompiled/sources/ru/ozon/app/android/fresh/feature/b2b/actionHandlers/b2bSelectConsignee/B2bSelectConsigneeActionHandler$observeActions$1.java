package ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bSelectConsignee;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.composer.ComposerExtKt;
import ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bSelectConsignee.B2bSelectConsigneeViewModel;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "result", "Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bSelectConsignee/B2bSelectConsigneeViewModel$ScreenState;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bSelectConsignee.B2bSelectConsigneeActionHandler$observeActions$1", f = "B2bSelectConsigneeActionHandler.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class B2bSelectConsigneeActionHandler$observeActions$1 extends j implements Function2<B2bSelectConsigneeViewModel.ScreenState, d<? super Unit>, Object> {
    final /* synthetic */ CustomActionHandler.HandlerReferences $handlerRefs;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ B2bSelectConsigneeActionHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    B2bSelectConsigneeActionHandler$observeActions$1(B2bSelectConsigneeActionHandler b2bSelectConsigneeActionHandler, CustomActionHandler.HandlerReferences handlerReferences, d<? super B2bSelectConsigneeActionHandler$observeActions$1> dVar) {
        super(2, dVar);
        this.this$0 = b2bSelectConsigneeActionHandler;
        this.$handlerRefs = handlerReferences;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        B2bSelectConsigneeActionHandler$observeActions$1 b2bSelectConsigneeActionHandler$observeActions$1 = new B2bSelectConsigneeActionHandler$observeActions$1(this.this$0, this.$handlerRefs, dVar);
        b2bSelectConsigneeActionHandler$observeActions$1.L$0 = obj;
        return b2bSelectConsigneeActionHandler$observeActions$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        NotificationDTO defaultNotificationDTO;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        B2bSelectConsigneeViewModel.ScreenState screenState = (B2bSelectConsigneeViewModel.ScreenState) this.L$0;
        if (screenState instanceof B2bSelectConsigneeViewModel.ScreenState.Success) {
            B2bSelectConsigneeViewModel.ScreenState.Success success = (B2bSelectConsigneeViewModel.ScreenState.Success) screenState;
            if (success.getIsSuccess()) {
                this.this$0.sendConsigneeAddedResult(this.$handlerRefs.getRefs());
                ComposerExtKt.sendRefreshToTargetFragment$default(this.$handlerRefs.getRefs().getContainer(), null, null, null, null, 15, null);
                this.$handlerRefs.getRefs().getNavigator().popBackStack();
            }
            this.this$0.showNotification(this.$handlerRefs, success.getNotification());
        } else if (Intrinsics.d(screenState, B2bSelectConsigneeViewModel.ScreenState.Error.INSTANCE)) {
            B2bSelectConsigneeActionHandler b2bSelectConsigneeActionHandler = this.this$0;
            CustomActionHandler.HandlerReferences handlerReferences = this.$handlerRefs;
            defaultNotificationDTO = b2bSelectConsigneeActionHandler.getDefaultNotificationDTO();
            b2bSelectConsigneeActionHandler.showNotification(handlerReferences, defaultNotificationDTO);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(B2bSelectConsigneeViewModel.ScreenState screenState, d<? super Unit> dVar) {
        return ((B2bSelectConsigneeActionHandler$observeActions$1) create(screenState, dVar)).invokeSuspend(Unit.f71690a);
    }
}
