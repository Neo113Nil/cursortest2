package ru.ozon.app.android.pdp.ui.configurators.ugc.selections.actionHandler;

import Sc.s;
import Wc.a;
import android.view.ViewGroup;
import androidx.fragment.app.r;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.pdp.ui.configurators.ugc.selections.actionHandler.RemoveSelectionItemProductActionHandler$showNotification$2", f = "RemoveSelectionItemProductActionHandler.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class RemoveSelectionItemProductActionHandler$showNotification$2 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ CustomActionHandler.HandlerReferences $handlerRefs;
    final /* synthetic */ NotificationDTO $notification;
    int label;
    final /* synthetic */ RemoveSelectionItemProductActionHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RemoveSelectionItemProductActionHandler$showNotification$2(CustomActionHandler.HandlerReferences handlerReferences, NotificationDTO notificationDTO, RemoveSelectionItemProductActionHandler removeSelectionItemProductActionHandler, d<? super RemoveSelectionItemProductActionHandler$showNotification$2> dVar) {
        super(2, dVar);
        this.$handlerRefs = handlerReferences;
        this.$notification = notificationDTO;
        this.this$0 = removeSelectionItemProductActionHandler;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new RemoveSelectionItemProductActionHandler$showNotification$2(this.$handlerRefs, this.$notification, this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        ViewGroup rootView = ContextExtKt.getRootView(this.$handlerRefs.getRefs().getContainer().a());
        if (rootView == null) {
            return Unit.f71690a;
        }
        NotificationDTO notificationDTO = this.$notification;
        if (notificationDTO == null) {
            notificationDTO = this.this$0.getDefaultNotificationDTO();
        }
        NotificationDTO notificationDTO2 = notificationDTO;
        NotificationLayoutManager asNotificationLayoutManager$default = CoordinatorLayoutManagerKt.asNotificationLayoutManager$default(ComposerViewExtensionKt.composerContainer(rootView), null, 1, null);
        if (asNotificationLayoutManager$default == null) {
            return Unit.f71690a;
        }
        NotificationBar.Companion companion = NotificationBar.INSTANCE;
        r a11 = this.$handlerRefs.getRefs().getContainer().a();
        if (a11 == null) {
            return Unit.f71690a;
        }
        NotificationBar.Companion.make$default(companion, asNotificationLayoutManager$default, notificationDTO2, a11, null, 8, null).show();
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((RemoveSelectionItemProductActionHandler$showNotification$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
