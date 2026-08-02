package ru.ozon.android.messenger.blocks.showTextButton;

import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class j implements Function2<ShowTextButtonDTO, ru.ozon.android.messenger.framework.presentation.models.c, List<? extends l>> {
    @Override // kotlin.jvm.functions.Function2
    public final List<? extends l> invoke(ShowTextButtonDTO showTextButtonDTO, ru.ozon.android.messenger.framework.presentation.models.c cVar) {
        ShowTextButtonDTO imageDto = showTextButtonDTO;
        ru.ozon.android.messenger.framework.presentation.models.c blockId = cVar;
        Intrinsics.checkNotNullParameter(imageDto, "dto");
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        Intrinsics.checkNotNullParameter(imageDto, "imageDto");
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        return C7714v.a0(new l(blockId, imageDto.getButton()));
    }
}
