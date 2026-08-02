package ru.ozon.android.composerCommonViewKit.compose.widget.commondisclaimerv2.core;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.compose.widget.commondisclaimerv2.data.DisclaimerV2DTO;
import ru.ozon.android.composerCommonViewKit.compose.widget.commondisclaimerv2.presentation.CommonDisclaimerV2V0;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/android/composerCommonViewKit/compose/widget/commondisclaimerv2/data/DisclaimerV2DTO;", "Ll20/d;", "widgetInfo", "Lru/ozon/android/composerCommonViewKit/compose/widget/commondisclaimerv2/presentation/CommonDisclaimerV2V0;", "toVo", "(Lru/ozon/android/composerCommonViewKit/compose/widget/commondisclaimerv2/data/DisclaimerV2DTO;Ll20/d;)Lru/ozon/android/composerCommonViewKit/compose/widget/commondisclaimerv2/presentation/CommonDisclaimerV2V0;", "common-view-kit_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class CommonDisclaimerV2MapperKt {
    @NotNull
    public static final CommonDisclaimerV2V0 toVo(@NotNull DisclaimerV2DTO disclaimerV2DTO, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(disclaimerV2DTO, "<this>");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return new CommonDisclaimerV2V0(widgetInfo.d().hashCode(), disclaimerV2DTO.getDisclaimer(), disclaimerV2DTO.getPaddings(), disclaimerV2DTO.getBackgroundColor());
    }
}
