package ru.ozon.app.android.fresh.feature.b2b.widgets.addConsignee.presentation;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.fresh.feature.b2b.widgets.addConsignee.presentation.AddConsigneeViewModel;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "state", "Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/presentation/AddConsigneeViewModel$ScreenState;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.fresh.feature.b2b.widgets.addConsignee.presentation.AddConsigneeViewHolder$observeScreenState$1", f = "AddConsigneeViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class AddConsigneeViewHolder$observeScreenState$1 extends j implements Function2<AddConsigneeViewModel.ScreenState, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AddConsigneeViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddConsigneeViewHolder$observeScreenState$1(AddConsigneeViewHolder addConsigneeViewHolder, d<? super AddConsigneeViewHolder$observeScreenState$1> dVar) {
        super(2, dVar);
        this.this$0 = addConsigneeViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        AddConsigneeViewHolder$observeScreenState$1 addConsigneeViewHolder$observeScreenState$1 = new AddConsigneeViewHolder$observeScreenState$1(this.this$0, dVar);
        addConsigneeViewHolder$observeScreenState$1.L$0 = obj;
        return addConsigneeViewHolder$observeScreenState$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        NotificationDTO defaultNotificationDTO;
        ComposerReferences composerReferences;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        AddConsigneeViewModel.ScreenState screenState = (AddConsigneeViewModel.ScreenState) this.L$0;
        if (screenState instanceof AddConsigneeViewModel.ScreenState.Success) {
            this.this$0.showNotificationBar(((AddConsigneeViewModel.ScreenState.Success) screenState).getNotification());
            this.this$0.sendConsigneeResultActions();
            composerReferences = this.this$0.references;
            composerReferences.getNavigator().popBackStack();
            this.this$0.sendCustomParamsEvent("correct");
        } else if (Intrinsics.d(screenState, AddConsigneeViewModel.ScreenState.Error.INSTANCE)) {
            AddConsigneeViewHolder addConsigneeViewHolder = this.this$0;
            defaultNotificationDTO = addConsigneeViewHolder.getDefaultNotificationDTO();
            addConsigneeViewHolder.showNotificationBar(defaultNotificationDTO);
            this.this$0.sendCustomParamsEvent("error");
        } else if (screenState instanceof AddConsigneeViewModel.ScreenState.ValidationError) {
            NotificationDTO notification = ((AddConsigneeViewModel.ScreenState.ValidationError) screenState).getNotification();
            if (notification != null) {
                this.this$0.showNotificationBar(notification);
            }
            this.this$0.sendCustomParamsEvent("error");
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AddConsigneeViewModel.ScreenState screenState, d<? super Unit> dVar) {
        return ((AddConsigneeViewHolder$observeScreenState$1) create(screenState, dVar)).invokeSuspend(Unit.f71690a);
    }
}
