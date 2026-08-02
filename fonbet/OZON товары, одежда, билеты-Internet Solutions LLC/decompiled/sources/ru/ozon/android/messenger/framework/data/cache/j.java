package ru.ozon.android.messenger.framework.data.cache;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.data.remote.models.items.ItemDTO;

/* loaded from: classes10.dex */
final class j extends AbstractC7737t implements Function1<ItemDTO, Boolean> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ItemDTO f87412b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(ItemDTO itemDTO) {
        super(1);
        this.f87412b = itemDTO;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(ItemDTO itemDTO) {
        ItemDTO itemDTO2 = itemDTO;
        return Boolean.valueOf(Intrinsics.d(itemDTO2 != null ? itemDTO2.getId() : null, this.f87412b.getId()));
    }
}
