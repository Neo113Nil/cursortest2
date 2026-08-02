package ru.ozon.android.messenger.framework.data.local.database.draft;

import J4.A;
import androidx.annotation.NonNull;
import ru.ozon.android.messenger.framework.data.local.database.MessengerDB_Impl;

/* loaded from: classes10.dex */
final class q extends A {
    q(MessengerDB_Impl messengerDB_Impl) {
        super(messengerDB_Impl);
    }

    @Override // J4.A
    @NonNull
    public final String createQuery() {
        return "DELETE FROM draft_attachments WHERE id = ?";
    }
}
