package ru.ozon.app.android.cml.delivery.actionHandler.validateDeclaredPrice;

import Sc.s;
import Tg.b;
import Vg.f;
import W10.c;
import Wc.a;
import a00.C4911f;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import l10.InterfaceC7851b;
import ru.ozon.app.android.cml.delivery.widgets.inputCurtain.presentation.InputCurtainViewModel;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.cml.delivery.actionHandler.validateDeclaredPrice.BaseValidateDeclaredPriceActionHandler$processWidgetAction$2", f = "BaseValidateDeclaredPriceActionHandler.kt", l = {56}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class BaseValidateDeclaredPriceActionHandler$processWidgetAction$2 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ b $action;
    final /* synthetic */ C4911f $container;
    final /* synthetic */ InterfaceC7851b $controller;
    final /* synthetic */ f.a $widgetInfo;
    int label;
    final /* synthetic */ BaseValidateDeclaredPriceActionHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BaseValidateDeclaredPriceActionHandler$processWidgetAction$2(BaseValidateDeclaredPriceActionHandler baseValidateDeclaredPriceActionHandler, b bVar, InterfaceC7851b interfaceC7851b, C4911f c4911f, f.a aVar, d<? super BaseValidateDeclaredPriceActionHandler$processWidgetAction$2> dVar) {
        super(2, dVar);
        this.this$0 = baseValidateDeclaredPriceActionHandler;
        this.$action = bVar;
        this.$controller = interfaceC7851b;
        this.$container = c4911f;
        this.$widgetInfo = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new BaseValidateDeclaredPriceActionHandler$processWidgetAction$2(this.this$0, this.$action, this.$controller, this.$container, this.$widgetInfo, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        InputCurtainViewModel inputCurtainViewModel;
        BaseValidateDeclaredPriceActionHandler$processWidgetAction$2 baseValidateDeclaredPriceActionHandler$processWidgetAction$2;
        InputCurtainViewModel inputCurtainViewModel2;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            inputCurtainViewModel = this.this$0.viewModel;
            if (inputCurtainViewModel != null) {
                inputCurtainViewModel.setExecutingAction(true);
            }
            BaseValidateDeclaredPriceActionHandler baseValidateDeclaredPriceActionHandler = this.this$0;
            AtomAction.ComposerAction composerAction = (AtomAction.ComposerAction) this.$action;
            InterfaceC7851b interfaceC7851b = this.$controller;
            C4911f c4911f = this.$container;
            c n11 = this.$widgetInfo.c().n();
            this.label = 1;
            baseValidateDeclaredPriceActionHandler$processWidgetAction$2 = this;
            obj = baseValidateDeclaredPriceActionHandler.callActionWithLoading(composerAction, interfaceC7851b, c4911f, n11, baseValidateDeclaredPriceActionHandler$processWidgetAction$2);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            baseValidateDeclaredPriceActionHandler$processWidgetAction$2 = this;
        }
        ValidateDeclaredPriceResponseDTO validateDeclaredPriceResponseDTO = (ValidateDeclaredPriceResponseDTO) obj;
        if (validateDeclaredPriceResponseDTO != null) {
            NotificationDTO notificationBar = validateDeclaredPriceResponseDTO.getNotificationBar();
            if (notificationBar != null) {
                baseValidateDeclaredPriceActionHandler$processWidgetAction$2.this$0.showNotification(notificationBar, baseValidateDeclaredPriceActionHandler$processWidgetAction$2.$container);
            }
            inputCurtainViewModel2 = baseValidateDeclaredPriceActionHandler$processWidgetAction$2.this$0.viewModel;
            if (inputCurtainViewModel2 != null) {
                inputCurtainViewModel2.updateState(validateDeclaredPriceResponseDTO.getStatus(), validateDeclaredPriceResponseDTO.getMessage(), validateDeclaredPriceResponseDTO.getPrice());
            }
        } else {
            baseValidateDeclaredPriceActionHandler$processWidgetAction$2.this$0.showError(baseValidateDeclaredPriceActionHandler$processWidgetAction$2.$container);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((BaseValidateDeclaredPriceActionHandler$processWidgetAction$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
