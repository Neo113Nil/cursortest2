package ru.ozon.android.messenger.blocks.ai.header;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.blocks.ai.header.AiHeaderDTO;
import ru.ozon.android.messenger.blocks.ai.header.presentation.a;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.android.messenger.framework.analytics.h;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

/* loaded from: classes10.dex */
public final class a implements Function2<AiHeaderDTO, ru.ozon.android.messenger.framework.presentation.models.c, List<? extends ru.ozon.android.messenger.blocks.ai.header.presentation.a>> {
    @Override // kotlin.jvm.functions.Function2
    public final List<? extends ru.ozon.android.messenger.blocks.ai.header.presentation.a> invoke(AiHeaderDTO aiHeaderDTO, ru.ozon.android.messenger.framework.presentation.models.c cVar) {
        AiHeaderDTO state = aiHeaderDTO;
        ru.ozon.android.messenger.framework.presentation.models.c blockId = cVar;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        String backgroundColor = state.getBackgroundColor();
        List<AiHeaderDTO.ButtonItem> leadingButtons = state.getLeadingButtons();
        if (leadingButtons == null) {
            leadingButtons = K.f71697a;
        }
        List<AiHeaderDTO.ButtonItem> list = leadingButtons;
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        for (AiHeaderDTO.ButtonItem buttonItem : list) {
            arrayList.add(new a.C1458a(buttonItem.getIconButton(), buttonItem.getTextButton()));
        }
        AiHeaderDTO.Item mainItem = state.getMainItem();
        AiHeaderDTO.TitleSubtitle titleSubtitle = Intrinsics.d(mainItem != null ? mainItem.getType() : null, "titleSubtitle") ? mainItem.getTitleSubtitle() : null;
        AiHeaderDTO.Item mainItem2 = state.getMainItem();
        ButtonV3DTO actionButton = Intrinsics.d(mainItem2 != null ? mainItem2.getType() : null, "actionButton") ? mainItem2.getActionButton() : null;
        List<AiHeaderDTO.ButtonItem> trailingButtons = state.getTrailingButtons();
        if (trailingButtons == null) {
            trailingButtons = K.f71697a;
        }
        List<AiHeaderDTO.ButtonItem> list2 = trailingButtons;
        ArrayList arrayList2 = new ArrayList(C7714v.z(list2, 10));
        for (AiHeaderDTO.ButtonItem buttonItem2 : list2) {
            arrayList2.add(new a.C1458a(buttonItem2.getIconButton(), buttonItem2.getTextButton()));
        }
        CornerRadius cornerRadius = state.getCornerRadius();
        if (cornerRadius == null) {
            cornerRadius = CornerRadius.NO_RADIUS;
        }
        CornerRadius cornerRadius2 = cornerRadius;
        TestInfo testInfo = state.getTestInfo();
        Map<String, MessengerTrackingInfo> a11 = h.a(state.getTrackingInfo());
        return C7714v.a0(new ru.ozon.android.messenger.blocks.ai.header.presentation.a(blockId, backgroundColor, arrayList, titleSubtitle, actionButton, arrayList2, cornerRadius2, testInfo, !a11.isEmpty() ? a11 : null));
    }
}
