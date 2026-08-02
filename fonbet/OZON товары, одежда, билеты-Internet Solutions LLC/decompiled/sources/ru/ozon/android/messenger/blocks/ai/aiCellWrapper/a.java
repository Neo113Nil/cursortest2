package ru.ozon.android.messenger.blocks.ai.aiCellWrapper;

import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.blocks.pinneditem.PinnedItemDTO;
import ru.ozon.android.messenger.blocks.pinneditem.g;

/* loaded from: classes10.dex */
public final class a implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f83924a;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f83924a) {
            case 0:
                AICellWrapperDTO dto = (AICellWrapperDTO) obj;
                ru.ozon.android.messenger.framework.presentation.models.c blockId = (ru.ozon.android.messenger.framework.presentation.models.c) obj2;
                Intrinsics.checkNotNullParameter(dto, "dto");
                Intrinsics.checkNotNullParameter(blockId, "blockId");
                return C7714v.a0(new ru.ozon.android.messenger.blocks.ai.aiCellWrapper.presentation.a(blockId, dto.getCell()));
            default:
                PinnedItemDTO state = (PinnedItemDTO) obj;
                ru.ozon.android.messenger.framework.presentation.models.c blockId2 = (ru.ozon.android.messenger.framework.presentation.models.c) obj2;
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(blockId2, "blockId");
                return C7714v.a0(new g(blockId2, state.getBlock(), state.getMessageId(), state.getRightButtons()));
        }
    }
}
