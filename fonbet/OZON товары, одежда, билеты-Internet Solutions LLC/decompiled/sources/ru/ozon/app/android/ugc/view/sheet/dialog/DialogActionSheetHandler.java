package ru.ozon.app.android.ugc.view.sheet.dialog;

import GZ.g;
import LZ.b;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.sheet.AtomActionSheetHandler;
import ru.ozon.app.android.pdp.ui.configurators.ugc.common.SubmitDialog;
import ru.ozon.app.android.pdp.ui.configurators.ugc.data.ActionType;
import ru.ozon.app.android.pdp.ui.configurators.ugc.question.QuestionsDialogFragment;
import ru.ozon.app.android.ugc.view.sheet.ExtionSheetExtensionsKt;
import ru.ozon.app.android.ugc.view.sheet.bind.ReviewActionSheetHandler;
import ru.ozon.app.android.ugc.view.sheet.dialog.DialogActionSheetInfo;
import ru.ozon.tracker.model.TrinityEventEntityKt;
import ru.ozon.uni.atoms.af.AtomAction;
import sZ.c;
import uZ.C9992d;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/ugc/view/sheet/dialog/DialogActionSheetHandler;", "Lru/ozon/app/android/ugc/view/sheet/dialog/DialogActionSheetInfo;", "T", "Lru/ozon/app/android/ugc/view/sheet/bind/ReviewActionSheetHandler;", "LGZ/g;", "ozonRouter", "<init>", "(LGZ/g;)V", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "action", "Lru/ozon/app/android/pdp/ui/configurators/ugc/data/ActionType;", TrinityEventEntityKt.ACTION_TYPE_JSON_NAME, "", "checkIfDialogNeeded", "(Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;Lru/ozon/app/android/pdp/ui/configurators/ugc/data/ActionType;)Z", "Lru/ozon/uni/atoms/af/AtomAction;", "handle", "(Lru/ozon/uni/atoms/af/AtomAction;)Z", "LGZ/g;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DialogActionSheetHandler<T extends DialogActionSheetInfo> extends ReviewActionSheetHandler<T> {

    @NotNull
    private final g ozonRouter;

    public DialogActionSheetHandler(@NotNull g ozonRouter) {
        Intrinsics.checkNotNullParameter(ozonRouter, "ozonRouter");
        this.ozonRouter = ozonRouter;
    }

    private final boolean checkIfDialogNeeded(AtomAction.ComposerAction action, ActionType actionType) {
        DialogActionSheetInfo dialogActionSheetInfo;
        String id2 = action.getId();
        if (id2 != null && (dialogActionSheetInfo = (DialogActionSheetInfo) getItem()) != null) {
            Map<String, SubmitDialog> dialog = dialogActionSheetInfo.getDialog();
            SubmitDialog submitDialog = dialog != null ? dialog.get(id2) : null;
            if (submitDialog != null) {
                this.ozonRouter.c(new b(new C9992d(new c("QuestionsDialogFragment", QuestionsDialogFragment.INSTANCE.newInstance(new QuestionsDialogFragment.Params(submitDialog.getTitle(), submitDialog.getText(), submitDialog.getSubmitButton().getText(), submitDialog.getCancelButton().getText(), dialogActionSheetInfo.getId(), actionType, action.getActionName(), null, null, action.getParams(), 384, null)), null, false, false, null, false, false, false, 508, null), null, 2, null)), 8290);
                return true;
            }
        }
        return false;
    }

    @Override // ru.ozon.app.android.ugc.view.sheet.bind.ReviewActionSheetHandler
    public boolean handle(@NotNull AtomAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (!(action instanceof AtomAction.ComposerAction)) {
            return false;
        }
        AtomAction.ComposerAction composerAction = (AtomAction.ComposerAction) action;
        AtomActionSheetHandler.SheetAction fromValue = AtomActionSheetHandler.SheetAction.INSTANCE.fromValue(composerAction.getId());
        if (fromValue == null) {
            return false;
        }
        return checkIfDialogNeeded(composerAction, ExtionSheetExtensionsKt.toActionType(fromValue));
    }
}
