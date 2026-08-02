package ru.ozon.android.messenger.framework.data.local.database.draft.model;

import B90.C2618u;
import Ve.Om;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.data.local.database.draft.entity.b;
import ru.ozon.android.messenger.framework.data.local.database.draft.entity.c;
import ru.ozon.android.messenger.framework.data.local.database.draft.entity.d;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final c f87548a;

    /* renamed from: b, reason: collision with root package name */
    private final d f87549b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ArrayList f87550c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final ArrayList f87551d;

    public a(@NotNull c draftMessageChatEntity, d dVar, @NotNull ArrayList listOfDraftAttachmentEntity, @NotNull ArrayList listOfDraftCustomBlockEntity) {
        Intrinsics.checkNotNullParameter(draftMessageChatEntity, "draftMessageChatEntity");
        Intrinsics.checkNotNullParameter(listOfDraftAttachmentEntity, "listOfDraftAttachmentEntity");
        Intrinsics.checkNotNullParameter(listOfDraftCustomBlockEntity, "listOfDraftCustomBlockEntity");
        this.f87548a = draftMessageChatEntity;
        this.f87549b = dVar;
        this.f87550c = listOfDraftAttachmentEntity;
        this.f87551d = listOfDraftCustomBlockEntity;
    }

    @NotNull
    public final c a() {
        return this.f87548a;
    }

    public final d b() {
        return this.f87549b;
    }

    @NotNull
    public final List<ru.ozon.android.messenger.framework.data.local.database.draft.entity.a> c() {
        return this.f87550c;
    }

    @NotNull
    public final List<b> d() {
        return this.f87551d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f87548a.equals(aVar.f87548a) && Intrinsics.d(this.f87549b, aVar.f87549b) && Intrinsics.d(this.f87550c, aVar.f87550c) && Intrinsics.d(this.f87551d, aVar.f87551d);
    }

    public final int hashCode() {
        int hashCode = this.f87548a.hashCode() * 31;
        d dVar = this.f87549b;
        return this.f87551d.hashCode() + C2618u.b(this.f87550c, (hashCode + (dVar == null ? 0 : dVar.hashCode())) * 31, 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DraftMessageDbModel(draftMessageChatEntity=");
        sb2.append(this.f87548a);
        sb2.append(", draftTextEntity=");
        sb2.append(this.f87549b);
        sb2.append(", listOfDraftAttachmentEntity=");
        sb2.append(this.f87550c);
        sb2.append(", listOfDraftCustomBlockEntity=");
        return Om.a(")", sb2, this.f87551d);
    }
}
