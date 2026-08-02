package ru.ozon.app.android.delivery.customActionsHandlers.showNotification;

import Sc.r;
import Sc.s;
import Vg.f;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import xe.C10720e0;
import xe.C10727i;
import xe.L0;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.delivery.customActionsHandlers.showNotification.ShowNotificationBarActionHandler$processWidgetAction$1$1", f = "ShowNotificationBarActionHandler.kt", l = {43}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class ShowNotificationBarActionHandler$processWidgetAction$1$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $notificationBar;
    final /* synthetic */ f.a $widgetInfo;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ShowNotificationBarActionHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ShowNotificationBarActionHandler$processWidgetAction$1$1(ShowNotificationBarActionHandler showNotificationBarActionHandler, String str, f.a aVar, d<? super ShowNotificationBarActionHandler$processWidgetAction$1$1> dVar) {
        super(2, dVar);
        this.this$0 = showNotificationBarActionHandler;
        this.$notificationBar = str;
        this.$widgetInfo = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        ShowNotificationBarActionHandler$processWidgetAction$1$1 showNotificationBarActionHandler$processWidgetAction$1$1 = new ShowNotificationBarActionHandler$processWidgetAction$1$1(this.this$0, this.$notificationBar, this.$widgetInfo, dVar);
        showNotificationBarActionHandler$processWidgetAction$1$1.L$0 = obj;
        return showNotificationBarActionHandler$processWidgetAction$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object a11;
        JsonParser jsonParser;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            ShowNotificationBarActionHandler showNotificationBarActionHandler = this.this$0;
            String str = this.$notificationBar;
            try {
                r.Companion companion = r.INSTANCE;
                jsonParser = showNotificationBarActionHandler.jsonDeserializer;
                a11 = (NotificationDTO) jsonParser.fromJson(str, NotificationDTO.class);
            } catch (Throwable th2) {
                r.Companion companion2 = r.INSTANCE;
                a11 = s.a(th2);
            }
            ShowNotificationBarActionHandler showNotificationBarActionHandler2 = this.this$0;
            f.a aVar2 = this.$widgetInfo;
            if (!(a11 instanceof r.b)) {
                C10720e0 c10720e0 = C10720e0.f105451a;
                L0 l02 = De.s.f6650a;
                ShowNotificationBarActionHandler$processWidgetAction$1$1$2$1 showNotificationBarActionHandler$processWidgetAction$1$1$2$1 = new ShowNotificationBarActionHandler$processWidgetAction$1$1$2$1(showNotificationBarActionHandler2, aVar2, (NotificationDTO) a11, null);
                this.L$0 = a11;
                this.label = 1;
                if (C10727i.f(l02, showNotificationBarActionHandler$processWidgetAction$1$1$2$1, this) == aVar) {
                    return aVar;
                }
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
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((ShowNotificationBarActionHandler$processWidgetAction$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
