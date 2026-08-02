package ru.ozon.android.messenger.blocks.ai.aiMessageActions;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.blocks.ai.aiMessageActions.AiMessageActionsDTO;
import ru.ozon.android.messenger.blocks.ai.aiMessageActions.presentation.f;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;

/* loaded from: classes10.dex */
public final class a implements Function2<AiMessageActionsDTO, ru.ozon.android.messenger.framework.presentation.models.c, List<? extends f>> {
    @Override // kotlin.jvm.functions.Function2
    public final List<? extends f> invoke(AiMessageActionsDTO aiMessageActionsDTO, ru.ozon.android.messenger.framework.presentation.models.c cVar) {
        AiMessageActionsDTO state = aiMessageActionsDTO;
        ru.ozon.android.messenger.framework.presentation.models.c blockId = cVar;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        AiMessageActionsDTO.SourcesBadge sourcesBadge = state.getSourcesBadge();
        List<AiMessageActionsDTO.IconButtonsWithStyle> iconButtons = state.getIconButtons();
        ArrayList arrayList = new ArrayList(C7714v.z(iconButtons, 10));
        int i11 = 0;
        for (Object obj : iconButtons) {
            int i12 = i11 + 1;
            Long l11 = null;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            AiMessageActionsDTO.IconButtonsWithStyle iconButtonsWithStyle = (AiMessageActionsDTO.IconButtonsWithStyle) obj;
            IconButtonV3DTO icon = iconButtonsWithStyle.getDefault().getIcon();
            AiMessageActionsDTO.IconButtonsWithStyle.IconButtonWithSelected clicked = iconButtonsWithStyle.getClicked();
            IconButtonV3DTO icon2 = clicked != null ? clicked.getIcon() : null;
            AiMessageActionsDTO.IconButtonsWithStyle.IconButtonWithSelected clicked2 = iconButtonsWithStyle.getClicked();
            Boolean valueOf = Boolean.valueOf(clicked2 != null ? Intrinsics.d(clicked2.isSelected(), Boolean.TRUE) : false);
            if (iconButtonsWithStyle.getTtl() != null) {
                l11 = Long.valueOf(r6.intValue());
            }
            arrayList.add(new f.a(i11, icon, icon2, valueOf, l11));
            i11 = i12;
        }
        return C7714v.a0(new f(blockId, sourcesBadge, arrayList));
    }
}
