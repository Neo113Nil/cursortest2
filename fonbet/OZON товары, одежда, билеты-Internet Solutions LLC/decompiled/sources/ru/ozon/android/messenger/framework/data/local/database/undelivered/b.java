package ru.ozon.android.messenger.framework.data.local.database.undelivered;

import J4.l;
import O4.f;
import androidx.annotation.NonNull;
import ru.ozon.android.messenger.framework.data.local.database.MessengerDB_Impl;
import ru.ozon.android.messenger.framework.data.local.database.undelivered.entity.UndeliveredMessageEntity;

/* loaded from: classes10.dex */
final class b extends l<UndeliveredMessageEntity> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ e f87552a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(e eVar, MessengerDB_Impl messengerDB_Impl) {
        super(messengerDB_Impl);
        this.f87552a = eVar;
    }

    @Override // J4.l
    protected final void bind(@NonNull f fVar, @NonNull UndeliveredMessageEntity undeliveredMessageEntity) {
        UndeliveredMessageEntity undeliveredMessageEntity2 = undeliveredMessageEntity;
        fVar.e0(1, undeliveredMessageEntity2.b());
        fVar.e0(2, undeliveredMessageEntity2.a());
        fVar.m0(3, undeliveredMessageEntity2.d());
        fVar.e0(4, this.f87552a.f87559c.b(undeliveredMessageEntity2.c()));
    }

    @Override // J4.A
    @NonNull
    protected final String createQuery() {
        return "INSERT OR REPLACE INTO `undelivered_messages` (`local_id`,`chat_id`,`updated_at`,`undelivered_message`) VALUES (?,?,?,?)";
    }
}
