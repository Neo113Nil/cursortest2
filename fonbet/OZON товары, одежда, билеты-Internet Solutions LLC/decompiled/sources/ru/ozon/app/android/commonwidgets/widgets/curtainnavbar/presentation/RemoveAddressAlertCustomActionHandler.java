package ru.ozon.app.android.commonwidgets.widgets.curtainnavbar.presentation;

import android.content.Intent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.app.android.uikit.R$string;
import ru.ozon.app.android.uikit.dialog.AlertDialogFragment;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J0\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0005H\u0002R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/curtainnavbar/presentation/RemoveAddressAlertCustomActionHandler;", "Lru/ozon/app/android/action/custom/CustomActionHandler;", "<init>", "()V", "actionId", "", "getActionId", "()Ljava/lang/String;", "processAction", "", "action", "Lru/ozon/uni/atoms/af/AtomAction;", "handlerRefs", "Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;", "showConfirmDeleteDialog", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "deleteUrl", SelectionItemFormDTO.TITLE_FIELD_NAME, "message", "positiveBtn", "Companion", "commonwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RemoveAddressAlertCustomActionHandler extends CustomActionHandler {

    @NotNull
    private final String actionId = "removeAddressAlert";

    private final void showConfirmDeleteDialog(ComposerReferences refs, String deleteUrl, String title, String message, String positiveBtn) {
        AlertDialogFragment.Companion companion = AlertDialogFragment.INSTANCE;
        AlertDialogFragment.Params params = new AlertDialogFragment.Params(null, message, null, title, 0, positiveBtn, Integer.valueOf(R$string.common_button_cancel), 0, 149, null);
        Intent intent = new Intent();
        intent.putExtra("EXTRA_REMOVE_DEEPLINK", deleteUrl);
        Unit unit = Unit.f71690a;
        AlertDialogFragment newInstanceForFragmentResult = companion.newInstanceForFragmentResult(params, intent);
        newInstanceForFragmentResult.setTargetFragment(refs.getContainer().c(), 9020);
        newInstanceForFragmentResult.show(refs.getContainer().k(), (String) null);
    }

    @Override // Vg.f
    @NotNull
    public String getActionId() {
        return this.actionId;
    }

    @Override // ru.ozon.app.android.action.custom.CustomActionHandler
    public void processAction(@NotNull AtomAction action, @NotNull CustomActionHandler.HandlerReferences handlerRefs) {
        String str;
        String str2;
        String str3;
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(handlerRefs, "handlerRefs");
        if (action instanceof AtomAction.Click) {
            ComposerReferences refs = handlerRefs.getRefs();
            AtomAction.Click click = (AtomAction.Click) action;
            String link = click.getLink();
            String str4 = link == null ? "" : link;
            Map<String, String> params = click.getParams();
            String str5 = (params == null || (str3 = params.get("alertTitle")) == null) ? "" : str3;
            Map<String, String> params2 = click.getParams();
            String str6 = (params2 == null || (str2 = params2.get("alertDescription")) == null) ? "" : str2;
            Map<String, String> params3 = click.getParams();
            showConfirmDeleteDialog(refs, str4, str5, str6, (params3 == null || (str = params3.get("deleteButton")) == null) ? "" : str);
        }
    }
}
