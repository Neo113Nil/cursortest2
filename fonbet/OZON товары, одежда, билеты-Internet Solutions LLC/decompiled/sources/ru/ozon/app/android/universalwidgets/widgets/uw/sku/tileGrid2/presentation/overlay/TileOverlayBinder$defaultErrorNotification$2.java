package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.overlay;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.universalwidgets.R$string;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class TileOverlayBinder$defaultErrorNotification$2 extends AbstractC7737t implements Function0<NotificationDTO> {
    final /* synthetic */ TileOverlayBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TileOverlayBinder$defaultErrorNotification$2(TileOverlayBinder tileOverlayBinder) {
        super(0);
        this.this$0 = tileOverlayBinder;
    }

    @Override // kotlin.jvm.functions.Function0
    public final NotificationDTO invoke() {
        String stringRes;
        String stringRes2;
        stringRes = this.this$0.getStringRes(R$string.uw_error_has_occurred);
        if (stringRes == null) {
            stringRes = "";
        }
        stringRes2 = this.this$0.getStringRes(R$string.uw_try_again);
        return new NotificationDTO(stringRes, stringRes2, null, null, null, null, null, null, null, NotificationDTO.Preset.WARNING, 508, null);
    }
}
