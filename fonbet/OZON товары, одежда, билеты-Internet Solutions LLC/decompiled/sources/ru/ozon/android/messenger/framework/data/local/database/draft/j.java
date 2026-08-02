package ru.ozon.android.messenger.framework.data.local.database.draft;

import androidx.annotation.NonNull;
import ru.ozon.android.messenger.framework.data.local.database.MessengerDB_Impl;

/* loaded from: classes10.dex */
final class j extends J4.l<ru.ozon.android.messenger.framework.data.local.database.draft.entity.c> {
    j(MessengerDB_Impl messengerDB_Impl) {
        super(messengerDB_Impl);
    }

    @Override // J4.l
    protected final void bind(@NonNull O4.f fVar, @NonNull ru.ozon.android.messenger.framework.data.local.database.draft.entity.c cVar) {
        ru.ozon.android.messenger.framework.data.local.database.draft.entity.c cVar2 = cVar;
        fVar.e0(1, cVar2.a());
        fVar.m0(2, cVar2.b());
    }

    @Override // J4.A
    @NonNull
    protected final String createQuery() {
        return "INSERT OR IGNORE INTO `chats` (`chat_id`,`updated_at`) VALUES (?,?)";
    }
}
