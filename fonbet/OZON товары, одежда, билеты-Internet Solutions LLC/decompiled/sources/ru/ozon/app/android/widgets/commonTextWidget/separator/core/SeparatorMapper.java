package ru.ozon.app.android.widgets.commonTextWidget.separator.core;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.widgets.commonTextWidget.separator.data.SeparatorDTO;
import ru.ozon.app.android.widgets.commonTextWidget.separator.presentation.SeparatorVO;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00022\n\u0010\u000f\u001a\u00060\u0003j\u0002`\u000eH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/widgets/commonTextWidget/separator/core/SeparatorMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/widgets/commonTextWidget/separator/data/SeparatorDTO;", "Ll20/d;", "", "Lru/ozon/app/android/widgets/commonTextWidget/separator/presentation/SeparatorVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "id", "toVo", "(Lru/ozon/app/android/widgets/commonTextWidget/separator/data/SeparatorDTO;J)Lru/ozon/app/android/widgets/commonTextWidget/separator/presentation/SeparatorVO;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/widgets/commonTextWidget/separator/data/SeparatorDTO;Ll20/d;)Ljava/util/List;", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SeparatorMapper implements Function2<SeparatorDTO, d, List<? extends SeparatorVO>> {
    private final SeparatorVO toVo(SeparatorDTO separatorDTO, long j11) {
        return new SeparatorVO(j11, separatorDTO.getHeight(), separatorDTO.getColor(), separatorDTO.getTopCornerRadius().getPx(), separatorDTO.getBottomCornerRadius().getPx(), separatorDTO.getLeftMargin().getPx(), separatorDTO.getRightMargin().getPx(), separatorDTO.getLeftPadding().getPx(), separatorDTO.getRightPadding().getPx());
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<SeparatorVO> invoke(@NotNull SeparatorDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVo(state, widgetInfo.d().hashCode()));
    }
}
