package ru.ozon.app.android.travel.feature.avia.widgets.addToFavoritesCell.presentation;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.travel.actionhandler.utils.NotificationBarDelegate;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, d2 = {"<anonymous>", "", "notificationDTO", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.travel.feature.avia.widgets.addToFavoritesCell.presentation.AddToFavoritesCellWidgetViewHolder$observeEvents$1", f = "AddToFavoritesCellWidgetViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class AddToFavoritesCellWidgetViewHolder$observeEvents$1 extends j implements Function2<NotificationDTO, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AddToFavoritesCellWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddToFavoritesCellWidgetViewHolder$observeEvents$1(AddToFavoritesCellWidgetViewHolder addToFavoritesCellWidgetViewHolder, d<? super AddToFavoritesCellWidgetViewHolder$observeEvents$1> dVar) {
        super(2, dVar);
        this.this$0 = addToFavoritesCellWidgetViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        AddToFavoritesCellWidgetViewHolder$observeEvents$1 addToFavoritesCellWidgetViewHolder$observeEvents$1 = new AddToFavoritesCellWidgetViewHolder$observeEvents$1(this.this$0, dVar);
        addToFavoritesCellWidgetViewHolder$observeEvents$1.L$0 = obj;
        return addToFavoritesCellWidgetViewHolder$observeEvents$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        NotificationBarDelegate notificationBarDelegate;
        NotificationBarDelegate notificationBarDelegate2;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        NotificationDTO notificationDTO = (NotificationDTO) this.L$0;
        if (notificationDTO != null) {
            notificationBarDelegate2 = this.this$0.getNotificationBarDelegate();
            if (notificationBarDelegate2 != null) {
                notificationBarDelegate2.show(notificationDTO);
            }
        } else {
            notificationBarDelegate = this.this$0.getNotificationBarDelegate();
            if (notificationBarDelegate != null) {
                notificationBarDelegate.showDefaultError();
            }
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(NotificationDTO notificationDTO, d<? super Unit> dVar) {
        return ((AddToFavoritesCellWidgetViewHolder$observeEvents$1) create(notificationDTO, dVar)).invokeSuspend(Unit.f71690a);
    }
}
