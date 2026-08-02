package ru.ozon.android.messenger.blocks.ai.aiEmptyState;

import android.text.SpannableStringBuilder;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

/* loaded from: classes10.dex */
public final class a implements Function2<AIEmptyStateDTO, ru.ozon.android.messenger.framework.presentation.models.c, List<? extends ru.ozon.android.messenger.blocks.ai.aiEmptyState.presentation.a>> {
    @Override // kotlin.jvm.functions.Function2
    public final List<? extends ru.ozon.android.messenger.blocks.ai.aiEmptyState.presentation.a> invoke(AIEmptyStateDTO aIEmptyStateDTO, ru.ozon.android.messenger.framework.presentation.models.c cVar) {
        TextDTO textDTO;
        String str;
        AIEmptyStateDTO state = aIEmptyStateDTO;
        ru.ozon.android.messenger.framework.presentation.models.c blockId = cVar;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        IconDTO icon = state.getIcon();
        TextDTO title = state.getTitle();
        TextDTO subtitle = state.getSubtitle();
        if (subtitle != null) {
            OzonSpannableString text = state.getSubtitle().getText();
            Intrinsics.checkNotNullParameter(text, "<this>");
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(text);
            int length = spannableStringBuilder.length();
            while (true) {
                length--;
                if (-1 >= length) {
                    break;
                }
                if (spannableStringBuilder.charAt(length) == 8232) {
                    spannableStringBuilder.replace(length, length + 1, (CharSequence) "\n");
                }
            }
            textDTO = TextDTO.copy$default(subtitle, new OzonSpannableString(spannableStringBuilder), null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 524286, null);
        } else {
            textDTO = null;
        }
        BadgeDTO bottomBadge = state.getBottomBadge();
        Integer topPadding = state.getTopPadding();
        int intValue = topPadding != null ? topPadding.intValue() : 0;
        TestInfo testInfo = state.getTestInfo();
        if (testInfo == null || (str = testInfo.getAutomatizationId()) == null) {
            str = "AIEmptyStateBlock";
        }
        return C7714v.a0(new ru.ozon.android.messenger.blocks.ai.aiEmptyState.presentation.a(blockId, icon, title, textDTO, bottomBadge, intValue, str, state.getTrackingInfo()));
    }
}
