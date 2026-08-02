package ru.ozon.android.messenger.blocks.chat.ai;

import android.net.Uri;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.blocks.chat.common.PreviewDTO;
import ru.ozon.android.messenger.blocks.chat.common.PreviewVO;
import ru.ozon.android.messenger.blocks.chat.common.i;
import ru.ozon.android.messenger.blocks.chat.common.m;
import ru.ozon.android.messenger.blocks.chat.common.n;

/* loaded from: classes10.dex */
public final class a implements Function2<AiAssistantDTO, ru.ozon.android.messenger.framework.presentation.models.c, List<? extends b>> {
    @Override // kotlin.jvm.functions.Function2
    public final List<? extends b> invoke(AiAssistantDTO aiAssistantDTO, ru.ozon.android.messenger.framework.presentation.models.c cVar) {
        AiAssistantDTO state = aiAssistantDTO;
        ru.ozon.android.messenger.framework.presentation.models.c blockId = cVar;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        m mVar = new m(state.getUnreadCount(), n.ACTIVE);
        PreviewDTO preview = state.getPreview();
        PreviewVO a11 = preview != null ? i.a(preview) : null;
        K k11 = K.f71697a;
        return C7714v.a0(new b(state.getUnreadCount(), new ru.ozon.android.messenger.blocks.chat.common.c(blockId, mVar, null, a11, k11, Uri.parse(state.getDeeplink()), k11, null, null), blockId));
    }
}
