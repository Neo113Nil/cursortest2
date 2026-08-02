package ru.ozon.app.android.session.deleteAccount.deleteAccountButton.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.session.deleteAccount.data.DeleteAccountStartResponse;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
/* synthetic */ class DeleteAccountButtonViewModelImpl$deleteAccountStartRequest$3 extends C7735q implements Function1<DeleteAccountStartResponse, Unit> {
    DeleteAccountButtonViewModelImpl$deleteAccountStartRequest$3(Object obj) {
        super(1, obj, DeleteAccountButtonViewModelImpl.class, "processResponse", "processResponse(Lru/ozon/app/android/session/deleteAccount/data/DeleteAccountStartResponse;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(DeleteAccountStartResponse deleteAccountStartResponse) {
        invoke2(deleteAccountStartResponse);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(DeleteAccountStartResponse p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((DeleteAccountButtonViewModelImpl) this.receiver).processResponse(p02);
    }
}
