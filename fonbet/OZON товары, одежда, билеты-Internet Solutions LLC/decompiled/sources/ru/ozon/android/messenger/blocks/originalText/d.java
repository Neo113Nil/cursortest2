package ru.ozon.android.messenger.blocks.originalText;

import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.blocks.originalText.f;

/* loaded from: classes10.dex */
public final class d implements Function2<OriginalTextDTO, ru.ozon.android.messenger.framework.presentation.models.c, List<? extends f>> {
    @Override // kotlin.jvm.functions.Function2
    public final List<? extends f> invoke(OriginalTextDTO originalTextDTO, ru.ozon.android.messenger.framework.presentation.models.c cVar) {
        OriginalTextDTO dto = originalTextDTO;
        ru.ozon.android.messenger.framework.presentation.models.c blockId = cVar;
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        return C7714v.a0(new f(blockId, new f.a(dto.getButton().getText(), dto.getButton().getIcon(), dto.getButton().getIconTintColor(), dto.getButton().getAction()), null, null, dto.getTrackingInfo(), dto.getLexemes()));
    }
}
