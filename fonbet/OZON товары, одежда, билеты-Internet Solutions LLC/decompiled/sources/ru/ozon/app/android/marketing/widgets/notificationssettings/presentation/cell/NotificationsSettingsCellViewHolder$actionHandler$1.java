package ru.ozon.app.android.marketing.widgets.notificationssettings.presentation.cell;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.atoms.data.deprecated.Cell;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomDTO;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke", "(Lru/ozon/uni/atoms/af/AtomAction;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class NotificationsSettingsCellViewHolder$actionHandler$1 extends AbstractC7737t implements Function1<AtomAction, Boolean> {
    final /* synthetic */ NotificationsSettingsCellViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NotificationsSettingsCellViewHolder$actionHandler$1(NotificationsSettingsCellViewHolder notificationsSettingsCellViewHolder) {
        super(1);
        this.this$0 = notificationsSettingsCellViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(AtomAction it) {
        Intrinsics.checkNotNullParameter(it, "it");
        NotificationsSettingsCellVO item = this.this$0.getItem();
        boolean z11 = false;
        if (item != null) {
            NotificationsSettingsCellViewHolder notificationsSettingsCellViewHolder = this.this$0;
            AtomDTO cell = item.getCell();
            if (cell instanceof Cell.CellToggle) {
                z11 = notificationsSettingsCellViewHolder.toggleSetting(item, (Cell.CellToggle) item.getCell());
            } else if (cell instanceof Cell.CellDefault) {
                if (item.getDialog() != null) {
                    z11 = notificationsSettingsCellViewHolder.openDialog(item.getDialog());
                } else {
                    AtomActionDTO action = ((Cell.CellDefault) item.getCell()).getAction();
                    if ((action != null ? action.getBehavior() : null) == AtomActionDTO.Behavior.NESTED_PAGE) {
                        z11 = notificationsSettingsCellViewHolder.openBottomSheet((Cell.CellDefault) item.getCell());
                    }
                }
            }
        }
        return Boolean.valueOf(z11);
    }
}
