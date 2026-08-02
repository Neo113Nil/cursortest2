package ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bResetEdoVerification;

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
import ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bResetEdoVerification.B2bResetEdoVerificationViewModel;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "result", "Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bResetEdoVerification/B2bResetEdoVerificationViewModel$ScreenState;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bResetEdoVerification.B2bResetEdoVerificationActionHandler$observeActions$1", f = "B2bResetEdoVerificationActionHandler.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class B2bResetEdoVerificationActionHandler$observeActions$1 extends j implements Function2<B2bResetEdoVerificationViewModel.ScreenState, d<? super Unit>, Object> {
    final /* synthetic */ CustomActionHandler.HandlerReferences $handlerRefs;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ B2bResetEdoVerificationActionHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    B2bResetEdoVerificationActionHandler$observeActions$1(CustomActionHandler.HandlerReferences handlerReferences, B2bResetEdoVerificationActionHandler b2bResetEdoVerificationActionHandler, d<? super B2bResetEdoVerificationActionHandler$observeActions$1> dVar) {
        super(2, dVar);
        this.$handlerRefs = handlerReferences;
        this.this$0 = b2bResetEdoVerificationActionHandler;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        B2bResetEdoVerificationActionHandler$observeActions$1 b2bResetEdoVerificationActionHandler$observeActions$1 = new B2bResetEdoVerificationActionHandler$observeActions$1(this.$handlerRefs, this.this$0, dVar);
        b2bResetEdoVerificationActionHandler$observeActions$1.L$0 = obj;
        return b2bResetEdoVerificationActionHandler$observeActions$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        B2bResetEdoVerificationViewModel.ScreenState screenState = (B2bResetEdoVerificationViewModel.ScreenState) this.L$0;
        if (screenState instanceof B2bResetEdoVerificationViewModel.ScreenState.Success) {
            if (((B2bResetEdoVerificationViewModel.ScreenState.Success) screenState).getIsSuccess()) {
                ComposerExtKt.sendRefreshToTargetFragment$default(this.$handlerRefs.getRefs().getContainer(), null, null, null, null, 15, null);
                this.$handlerRefs.getRefs().getNavigator().popBackStack();
            } else {
                this.this$0.showErrorNotification(this.$handlerRefs);
            }
        } else if (Intrinsics.d(screenState, B2bResetEdoVerificationViewModel.ScreenState.Error.INSTANCE)) {
            this.this$0.showErrorNotification(this.$handlerRefs);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(B2bResetEdoVerificationViewModel.ScreenState screenState, d<? super Unit> dVar) {
        return ((B2bResetEdoVerificationActionHandler$observeActions$1) create(screenState, dVar)).invokeSuspend(Unit.f71690a);
    }
}
