package ru.ozon.app.android.marketing.widgets.notificationssettings.presentation.cell;

import androidx.lifecycle.T;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.marketing.widgets.notificationssettings.presentation.NotificationsSettingsCellViewModelImpl;

@Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "kotlin.jvm.PlatformType", "x", "", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes12.dex */
public final class NotificationsSettingsCellBinder$special$$inlined$filter$1 extends AbstractC7737t implements Function1<NotificationsSettingsCellViewModelImpl.Action, Unit> {
    final /* synthetic */ T $result;
    final /* synthetic */ NotificationsSettingsCellView $view$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationsSettingsCellBinder$special$$inlined$filter$1(T t2, NotificationsSettingsCellView notificationsSettingsCellView) {
        super(1);
        this.$result = t2;
        this.$view$inlined = notificationsSettingsCellView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(NotificationsSettingsCellViewModelImpl.Action action) {
        m792invoke(action);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m792invoke(NotificationsSettingsCellViewModelImpl.Action action) {
        NotificationsSettingsCellViewModelImpl.Action action2 = action;
        NotificationsSettingsCellVO item = this.$view$inlined.getItem();
        if ((item == null || action2.getId() != item.getId()) && !(action2 instanceof NotificationsSettingsCellViewModelImpl.Action.Progress)) {
            return;
        }
        this.$result.setValue(action);
    }
}
