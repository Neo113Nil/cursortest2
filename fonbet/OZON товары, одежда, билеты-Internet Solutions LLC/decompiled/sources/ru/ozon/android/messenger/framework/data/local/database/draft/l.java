package ru.ozon.android.messenger.framework.data.local.database.draft;

import androidx.annotation.NonNull;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.data.local.database.MessengerDB_Impl;
import ru.ozon.android.messenger.framework.data.local.database.draft.entity.a;

/* loaded from: classes10.dex */
final class l extends J4.l<ru.ozon.android.messenger.framework.data.local.database.draft.entity.a> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ i f87546a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l(i iVar, MessengerDB_Impl messengerDB_Impl) {
        super(messengerDB_Impl);
        this.f87546a = iVar;
    }

    @Override // J4.l
    protected final void bind(@NonNull O4.f fVar, @NonNull ru.ozon.android.messenger.framework.data.local.database.draft.entity.a aVar) {
        ru.ozon.android.messenger.framework.data.local.database.draft.converter.a aVar2;
        ru.ozon.android.messenger.framework.data.local.database.draft.entity.a aVar3 = aVar;
        fVar.e0(1, aVar3.d());
        fVar.e0(2, aVar3.a());
        aVar2 = this.f87546a.f87524e;
        a.AbstractC1573a value = aVar3.j();
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(value, "value");
        fVar.m0(3, value.a());
        fVar.e0(4, aVar3.g());
        if (aVar3.i() == null) {
            fVar.C0(5);
        } else {
            fVar.e0(5, aVar3.i());
        }
        if (aVar3.h() == null) {
            fVar.C0(6);
        } else {
            fVar.e0(6, aVar3.h());
        }
        if (aVar3.f() == null) {
            fVar.C0(7);
        } else {
            fVar.m0(7, aVar3.f().intValue());
        }
        if (aVar3.e() == null) {
            fVar.C0(8);
        } else {
            fVar.m0(8, aVar3.e().intValue());
        }
        if (aVar3.c() == null) {
            fVar.C0(9);
        } else {
            fVar.e0(9, aVar3.c());
        }
        if (aVar3.b() == null) {
            fVar.C0(10);
        } else {
            fVar.e0(10, aVar3.b());
        }
    }

    @Override // J4.A
    @NonNull
    protected final String createQuery() {
        return "INSERT OR REPLACE INTO `draft_attachments` (`id`,`chat_id`,`type`,`local_url`,`remote_url`,`media_type`,`image_width`,`image_height`,`file_name`,`file_size`) VALUES (?,?,?,?,?,?,?,?,?,?)";
    }
}
