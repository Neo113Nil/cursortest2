package ru.ozon.android.messenger.framework.data.cache;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.data.remote.models.items.ItemDTO;

/* loaded from: classes10.dex */
final class e extends AbstractC7737t implements Function1<ItemDTO, Boolean> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ItemDTO f87395b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(ItemDTO itemDTO) {
        super(1);
        this.f87395b = itemDTO;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(ItemDTO itemDTO) {
        ItemDTO it = itemDTO;
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(Intrinsics.d(it.getId(), this.f87395b.getId()));
    }
}
