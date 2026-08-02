package ru.ozon.android.messenger.blocks.ai.input;

import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.blocks.ai.input.data.AiInputDTO;
import ru.ozon.android.messenger.blocks.ai.input.presentation.a;
import ru.ozon.android.messenger.framework.analytics.h;
import ru.ozon.uni.atoms.data.text.TextDTO;

/* loaded from: classes10.dex */
public final class a implements Function2<AiInputDTO, ru.ozon.android.messenger.framework.presentation.models.c, List<? extends ru.ozon.android.messenger.blocks.ai.input.presentation.a>> {
    @Override // kotlin.jvm.functions.Function2
    public final List<? extends ru.ozon.android.messenger.blocks.ai.input.presentation.a> invoke(AiInputDTO aiInputDTO, ru.ozon.android.messenger.framework.presentation.models.c cVar) {
        AiInputDTO state = aiInputDTO;
        ru.ozon.android.messenger.framework.presentation.models.c blockId = cVar;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        String text = state.getText();
        TextDTO placeholder = state.getPlaceholder();
        String str = state.getOutlineColors().getDefault();
        String focused = state.getOutlineColors().getFocused();
        if (focused == null) {
            focused = state.getOutlineColors().getDefault();
        }
        return C7714v.a0(new ru.ozon.android.messenger.blocks.ai.input.presentation.a(blockId, text, placeholder, new a.C1461a(str, focused), state.getCursorColor(), state.getMode(), state.getIconButtons(), state.getSettings(), h.a(state.getTrackingInfo())));
    }
}
