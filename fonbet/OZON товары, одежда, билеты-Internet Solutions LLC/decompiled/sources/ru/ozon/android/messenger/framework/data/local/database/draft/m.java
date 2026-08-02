package ru.ozon.android.messenger.framework.data.local.database.draft;

import androidx.annotation.NonNull;
import ru.ozon.android.messenger.framework.data.local.database.MessengerDB_Impl;

/* loaded from: classes10.dex */
final class m extends J4.l<ru.ozon.android.messenger.framework.data.local.database.draft.entity.b> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ i f87547a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m(i iVar, MessengerDB_Impl messengerDB_Impl) {
        super(messengerDB_Impl);
        this.f87547a = iVar;
    }

    @Override // J4.l
    protected final void bind(@NonNull O4.f fVar, @NonNull ru.ozon.android.messenger.framework.data.local.database.draft.entity.b bVar) {
        ru.ozon.android.messenger.framework.data.local.database.draft.converter.b bVar2;
        ru.ozon.android.messenger.framework.data.local.database.draft.entity.b bVar3 = bVar;
        fVar.m0(1, bVar3.c());
        fVar.e0(2, bVar3.a());
        bVar2 = this.f87547a.f87526g;
        fVar.e0(3, bVar2.a(bVar3.b()));
    }

    @Override // J4.A
    @NonNull
    protected final String createQuery() {
        return "INSERT OR REPLACE INTO `draft_custom_blocks` (`id`,`chat_id`,`custom_block`) VALUES (nullif(?, 0),?,?)";
    }
}
