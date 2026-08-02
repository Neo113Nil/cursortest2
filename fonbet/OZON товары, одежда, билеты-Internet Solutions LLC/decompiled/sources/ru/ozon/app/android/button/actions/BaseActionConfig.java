package ru.ozon.app.android.button.actions;

import a00.h;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.button.data.ActionButtonDTO;
import ru.ozon.app.android.button.data.ActionButtonDTO.ButtonsItem.Action;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003J+\u0010\n\u001a\u00020\t2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/button/actions/BaseActionConfig;", "Lru/ozon/app/android/button/data/ActionButtonDTO$ButtonsItem$Action;", "Action", "", "action", "La00/h;", "viewModelOwnerProvider", "", "widgetId", "", "onAction", "(Lru/ozon/app/android/button/data/ActionButtonDTO$ButtonsItem$Action;La00/h;Ljava/lang/Long;)V", "button_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface BaseActionConfig<Action extends ActionButtonDTO.ButtonsItem.Action> {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static <Action extends ActionButtonDTO.ButtonsItem.Action> Action action(@NotNull BaseActionConfig<Action> baseActionConfig, ActionButtonDTO.ButtonsItem.Action action) {
            if (action == 0) {
                return null;
            }
            return action;
        }
    }

    void onAction(ActionButtonDTO.ButtonsItem.Action action, @NotNull h viewModelOwnerProvider, Long widgetId);
}
