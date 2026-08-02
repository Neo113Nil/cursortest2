package ru.ozon.app.android.favorites.createshoppinglist.actiondelegate;

import W10.c;
import android.content.Intent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.favorites.createshoppinglist.presentation.viewmodel.CreateShoppingListViewModel;
import ru.ozon.app.android.favorites.ui.notification.NotificationBundle;
import ru.ozon.uni.atoms.data.notification.NotificationModelWrapper;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroid/content/Intent;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class ModalActionDelegate$onSuccessCreate$1$1 extends AbstractC7737t implements Function1<Intent, Unit> {
    final /* synthetic */ CreateShoppingListViewModel.Action.SuccessCreate $action;
    final /* synthetic */ ModalActionDelegate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ModalActionDelegate$onSuccessCreate$1$1(CreateShoppingListViewModel.Action.SuccessCreate successCreate, ModalActionDelegate modalActionDelegate) {
        super(1);
        this.$action = successCreate;
        this.this$0 = modalActionDelegate;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Intent intent) {
        invoke2(intent);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Intent sendResultToTargetFragment) {
        long j11;
        c cVar;
        Intrinsics.checkNotNullParameter(sendResultToTargetFragment, "$this$sendResultToTargetFragment");
        NotificationModelWrapper notification = this.$action.getNotification();
        if (notification != null) {
            CreateShoppingListViewModel.Action.SuccessCreate successCreate = this.$action;
            ModalActionDelegate modalActionDelegate = this.this$0;
            Map<String, String> payloads = successCreate.getPayloads();
            j11 = modalActionDelegate.widgetId;
            Long valueOf = Long.valueOf(j11);
            cVar = modalActionDelegate.trackingData;
            sendResultToTargetFragment.putExtra("bundle", new NotificationBundle(notification, payloads, valueOf, cVar));
        }
    }
}
