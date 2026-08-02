package ru.ozon.android.messenger.framework.data.repository;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.data.local.database.undelivered.entity.UndeliveredMessageEntity;

/* loaded from: classes10.dex */
final class O extends AbstractC7737t implements Function1<UndeliveredMessageEntity, ru.ozon.android.messenger.framework.presentation.models.q> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ I f88375b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    O(I i11) {
        super(1);
        this.f88375b = i11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final ru.ozon.android.messenger.framework.presentation.models.q invoke(UndeliveredMessageEntity undeliveredMessageEntity) {
        ru.ozon.android.messenger.framework.data.local.mapper.c cVar;
        UndeliveredMessageEntity it = undeliveredMessageEntity;
        Intrinsics.checkNotNullParameter(it, "it");
        cVar = this.f88375b.f88285h;
        return cVar.c(it);
    }
}
