package ru.ozon.android.messenger.blocks.ai.aiThinkingIndicator;

import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

/* loaded from: classes10.dex */
public final class a implements Function2<AiThinkingIndicatorDTO, ru.ozon.android.messenger.framework.presentation.models.c, List<? extends ru.ozon.android.messenger.blocks.ai.aiThinkingIndicator.presentation.a>> {
    @Override // kotlin.jvm.functions.Function2
    public final List<? extends ru.ozon.android.messenger.blocks.ai.aiThinkingIndicator.presentation.a> invoke(AiThinkingIndicatorDTO aiThinkingIndicatorDTO, ru.ozon.android.messenger.framework.presentation.models.c cVar) {
        String str;
        AiThinkingIndicatorDTO state = aiThinkingIndicatorDTO;
        ru.ozon.android.messenger.framework.presentation.models.c blockId = cVar;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        IconDTO icon = state.getIcon();
        List<TextDTO> statusMessages = state.getStatusMessages();
        TestInfo testInfo = state.getTestInfo();
        if (testInfo == null || (str = testInfo.getAutomatizationId()) == null) {
            str = "AiThinkingIndicator";
        }
        return C7714v.a0(new ru.ozon.android.messenger.blocks.ai.aiThinkingIndicator.presentation.a(blockId, icon, statusMessages, str, state.getTrackingInfo()));
    }
}
