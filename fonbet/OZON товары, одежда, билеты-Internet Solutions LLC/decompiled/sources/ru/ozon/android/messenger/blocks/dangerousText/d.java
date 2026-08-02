package ru.ozon.android.messenger.blocks.dangerousText;

import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class d implements Function2<DangerousTextDTO, ru.ozon.android.messenger.framework.presentation.models.c, List<? extends e>> {
    @Override // kotlin.jvm.functions.Function2
    public final List<? extends e> invoke(DangerousTextDTO dangerousTextDTO, ru.ozon.android.messenger.framework.presentation.models.c cVar) {
        DangerousTextDTO imageDto = dangerousTextDTO;
        ru.ozon.android.messenger.framework.presentation.models.c blockId = cVar;
        Intrinsics.checkNotNullParameter(imageDto, "dto");
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        Intrinsics.checkNotNullParameter(imageDto, "imageDto");
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        return C7714v.a0(new e(blockId, imageDto.getHasSeparator(), imageDto.getIcon(), imageDto.getText(), imageDto.getButton(), null));
    }
}
