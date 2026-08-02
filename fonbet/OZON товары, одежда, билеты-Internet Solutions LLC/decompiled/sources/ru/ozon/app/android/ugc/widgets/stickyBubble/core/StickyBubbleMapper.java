package ru.ozon.app.android.ugc.widgets.stickyBubble.core;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.stickyBubble.data.StickyBubbleDTO;
import ru.ozon.app.android.ugc.widgets.stickyBubble.presentation.StickyBubbleVO;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00022\n\u0010\u000f\u001a\u00060\u0003j\u0002`\u000eH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/ugc/widgets/stickyBubble/core/StickyBubbleMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/ugc/widgets/stickyBubble/data/StickyBubbleDTO;", "Ll20/d;", "", "Lru/ozon/app/android/ugc/widgets/stickyBubble/presentation/StickyBubbleVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/ugc/widgets/stickyBubble/data/StickyBubbleDTO$StickyBubbleStateDTO;", "Lru/ozon/app/android/ugc/widgets/stickyBubble/presentation/StickyBubbleVO$StickyBubbleStateVO;", "toVo", "(Lru/ozon/app/android/ugc/widgets/stickyBubble/data/StickyBubbleDTO$StickyBubbleStateDTO;)Lru/ozon/app/android/ugc/widgets/stickyBubble/presentation/StickyBubbleVO$StickyBubbleStateVO;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/ugc/widgets/stickyBubble/data/StickyBubbleDTO;Ll20/d;)Ljava/util/List;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class StickyBubbleMapper implements Function2<StickyBubbleDTO, d, List<? extends StickyBubbleVO>> {
    private final StickyBubbleVO.StickyBubbleStateVO toVo(StickyBubbleDTO.StickyBubbleStateDTO stickyBubbleStateDTO) {
        return new StickyBubbleVO.StickyBubbleStateVO(stickyBubbleStateDTO.getIcon(), stickyBubbleStateDTO.getText(), stickyBubbleStateDTO.getAction(), stickyBubbleStateDTO.getBackgroundColor(), stickyBubbleStateDTO.getTrackingInfo());
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<StickyBubbleVO> invoke(@NotNull StickyBubbleDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = state.hashCode();
        boolean isSelected = state.isSelected();
        StickyBubbleVO.StickyBubbleStateVO vo = toVo(state.getDefaultState());
        StickyBubbleDTO.StickyBubbleStateDTO selectedState = state.getSelectedState();
        return C7714v.a0(new StickyBubbleVO(hashCode, false, false, isSelected, false, false, vo, selectedState != null ? toVo(selectedState) : null, state.getSelectedStateTimeout(), 54, null));
    }
}
