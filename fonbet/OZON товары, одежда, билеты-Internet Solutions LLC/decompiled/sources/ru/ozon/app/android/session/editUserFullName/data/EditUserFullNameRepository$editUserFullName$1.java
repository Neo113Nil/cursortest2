package ru.ozon.app.android.session.editUserFullName.data;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.session.editUserFullName.presentation.EditUserFullNameResult;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
/* synthetic */ class EditUserFullNameRepository$editUserFullName$1 extends C7735q implements Function1<EditUserFullNameResponse, EditUserFullNameResult> {
    EditUserFullNameRepository$editUserFullName$1(Object obj) {
        super(1, obj, EditUserFullNameRepository.class, "toResult", "toResult(Lru/ozon/app/android/session/editUserFullName/data/EditUserFullNameResponse;)Lru/ozon/app/android/session/editUserFullName/presentation/EditUserFullNameResult;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final EditUserFullNameResult invoke(EditUserFullNameResponse p02) {
        EditUserFullNameResult result;
        Intrinsics.checkNotNullParameter(p02, "p0");
        result = ((EditUserFullNameRepository) this.receiver).toResult(p02);
        return result;
    }
}
