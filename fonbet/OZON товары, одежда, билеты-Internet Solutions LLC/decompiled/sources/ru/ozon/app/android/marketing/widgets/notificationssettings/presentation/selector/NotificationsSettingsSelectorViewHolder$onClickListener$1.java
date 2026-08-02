package ru.ozon.app.android.marketing.widgets.notificationssettings.presentation.selector;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import fd.InterfaceC6512o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.marketing.widgets.notificationssettings.data.NotificationsSettingsDTO;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class NotificationsSettingsSelectorViewHolder$onClickListener$1 extends AbstractC7737t implements Function1<Long, Unit> {
    final /* synthetic */ NotificationsSettingsSelectorViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NotificationsSettingsSelectorViewHolder$onClickListener$1(NotificationsSettingsSelectorViewHolder notificationsSettingsSelectorViewHolder) {
        super(1);
        this.this$0 = notificationsSettingsSelectorViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Long l11) {
        invoke(l11.longValue());
        return Unit.f71690a;
    }

    public final void invoke(long j11) {
        InterfaceC6512o<Long, Long, Long, Long, Unit> onSettingChanged;
        NotificationsSettingsDTO.NotificationSource.Dialog dialog;
        NotificationsSettingsSelectorVO item = this.this$0.getItem();
        if (item != null && (dialog = item.getDialog()) != null) {
            this.this$0.openDialog(dialog);
            return;
        }
        NotificationsSettingsSelectorViewHolder notificationsSettingsSelectorViewHolder = this.this$0;
        NotificationsSettingsSelectorVO item2 = notificationsSettingsSelectorViewHolder.getItem();
        if (item2 == null || (onSettingChanged = notificationsSettingsSelectorViewHolder.getOnSettingChanged()) == null) {
            return;
        }
        onSettingChanged.invoke(Long.valueOf(item2.getId()), Long.valueOf(item2.getSettingId()), Long.valueOf(item2.getCommId()), Long.valueOf(j11));
    }
}
