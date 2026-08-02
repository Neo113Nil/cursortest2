package ru.ozon.app.android.session.deleteAccount.deleteAccountDescription.presentation.main;

import A00.a;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.session.deleteAccount.deleteAccountDescription.presentation.DeleteAccountDescriptionFieldErrorUpdateEvent;
import ru.ozon.app.android.session.deleteAccount.deleteAccountDescription.presentation.DeleteAccountDescriptionUpdateEvent;
import ru.ozon.app.android.session.deleteAccount.deleteAccountDescription.presentation.main.DeleteAccountDescriptionMainVO;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LA00/a$J$a;", "update", "Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/presentation/main/DeleteAccountDescriptionMainVO;", "oldVO", "invoke", "(LA00/a$J$a;Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/presentation/main/DeleteAccountDescriptionMainVO;)Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/presentation/main/DeleteAccountDescriptionMainVO;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class DeleteAccountDescriptionViewMapper$updateConsumer$1 extends AbstractC7737t implements Function2<a.J.InterfaceC0007a, DeleteAccountDescriptionMainVO, DeleteAccountDescriptionMainVO> {
    public static final DeleteAccountDescriptionViewMapper$updateConsumer$1 INSTANCE = new DeleteAccountDescriptionViewMapper$updateConsumer$1();

    DeleteAccountDescriptionViewMapper$updateConsumer$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final DeleteAccountDescriptionMainVO invoke(a.J.InterfaceC0007a update, DeleteAccountDescriptionMainVO oldVO) {
        String text;
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldVO, "oldVO");
        DeleteAccountDescriptionMainVO.Reason reason = null;
        if (!(update instanceof DeleteAccountDescriptionUpdateEvent)) {
            if (!(update instanceof DeleteAccountDescriptionFieldErrorUpdateEvent)) {
                return null;
            }
            DeleteAccountDescriptionMainVO.Reason reason2 = oldVO.getReason();
            return DeleteAccountDescriptionMainVO.copy$default(oldVO, 0L, null, null, reason2 != null ? DeleteAccountDescriptionMainVO.Reason.copy$default(reason2, null, DeleteAccountDescriptionMainVO.Reason.Input.copy$default(reason2.getInput(), null, null, null, ((DeleteAccountDescriptionFieldErrorUpdateEvent) update).getError(), 7, null), null, 5, null) : null, null, 23, null);
        }
        DeleteAccountDescriptionMainVO.Reason reason3 = oldVO.getReason();
        if (reason3 != null) {
            DeleteAccountDescriptionUpdateEvent deleteAccountDescriptionUpdateEvent = (DeleteAccountDescriptionUpdateEvent) (Intrinsics.d(((DeleteAccountDescriptionUpdateEvent) update).getId(), reason3.getInput().getId()) ? update : null);
            if (deleteAccountDescriptionUpdateEvent == null || (text = deleteAccountDescriptionUpdateEvent.getValue()) == null) {
                text = reason3.getInput().getText();
            }
            reason = DeleteAccountDescriptionMainVO.Reason.copy$default(reason3, null, DeleteAccountDescriptionMainVO.Reason.Input.copy$default(reason3.getInput(), null, null, text, null, 11, null), null, 5, null);
        }
        DeleteAccountDescriptionUpdateEvent deleteAccountDescriptionUpdateEvent2 = (DeleteAccountDescriptionUpdateEvent) update;
        return DeleteAccountDescriptionMainVO.copy$default(oldVO, 0L, null, null, reason, new Pair(deleteAccountDescriptionUpdateEvent2.getId(), deleteAccountDescriptionUpdateEvent2.getValue()), 7, null);
    }
}
