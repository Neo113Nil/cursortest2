package ru.ozon.app.android.session.editUserFullName.core;

import A00.a;
import Sc.o;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.session.editUserFullName.core.EditUserFullNameUpdate;
import ru.ozon.app.android.session.editUserFullName.presentation.EditUserFullNameVO;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LA00/a$J$a;", "update", "Lru/ozon/app/android/session/editUserFullName/presentation/EditUserFullNameVO;", "oldVO", "invoke", "(LA00/a$J$a;Lru/ozon/app/android/session/editUserFullName/presentation/EditUserFullNameVO;)Lru/ozon/app/android/session/editUserFullName/presentation/EditUserFullNameVO;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class EditUserFullNameViewMapper$updateConsumer$1 extends AbstractC7737t implements Function2<a.J.InterfaceC0007a, EditUserFullNameVO, EditUserFullNameVO> {
    final /* synthetic */ EditUserFullNameViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EditUserFullNameViewMapper$updateConsumer$1(EditUserFullNameViewMapper editUserFullNameViewMapper) {
        super(2);
        this.this$0 = editUserFullNameViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final EditUserFullNameVO invoke(a.J.InterfaceC0007a update, EditUserFullNameVO oldVO) {
        EditUserFullNameVO processError;
        EditUserFullNameVO processTextChange;
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldVO, "oldVO");
        EditUserFullNameUpdate editUserFullNameUpdate = (EditUserFullNameUpdate) update;
        if (editUserFullNameUpdate instanceof EditUserFullNameUpdate.TextChange) {
            processTextChange = this.this$0.processTextChange(oldVO, (EditUserFullNameUpdate.TextChange) update);
            return processTextChange;
        }
        if (!(editUserFullNameUpdate instanceof EditUserFullNameUpdate.Error)) {
            throw new o();
        }
        processError = this.this$0.processError(oldVO, (EditUserFullNameUpdate.Error) update);
        return processError;
    }
}
