package ru.ozon.android.messenger.framework.data.local.database.draft;

import androidx.annotation.NonNull;
import ru.ozon.android.messenger.framework.data.local.database.MessengerDB_Impl;

/* loaded from: classes10.dex */
final class k extends J4.l<ru.ozon.android.messenger.framework.data.local.database.draft.entity.d> {
    k(MessengerDB_Impl messengerDB_Impl) {
        super(messengerDB_Impl);
    }

    @Override // J4.l
    protected final void bind(@NonNull O4.f fVar, @NonNull ru.ozon.android.messenger.framework.data.local.database.draft.entity.d dVar) {
        ru.ozon.android.messenger.framework.data.local.database.draft.entity.d dVar2 = dVar;
        fVar.e0(1, dVar2.a());
        fVar.e0(2, dVar2.b());
    }

    @Override // J4.A
    @NonNull
    protected final String createQuery() {
        return "INSERT OR REPLACE INTO `draft_texts` (`chat_id`,`text`) VALUES (?,?)";
    }
}
