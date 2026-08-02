package ru.ozon.app.android.common.twocards.core;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.twocards.data.TwoCardsDTO;
import ru.ozon.app.android.common.twocards.presentation.CardVO;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004*\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\nJ*\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000b\u001a\u00020\u00022\n\u0010\r\u001a\u00060\u0003j\u0002`\fH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/common/twocards/core/TwoCardsMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/common/twocards/data/TwoCardsDTO;", "Ll20/d;", "", "Lru/ozon/app/android/common/twocards/presentation/CardVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "toVo", "(Lru/ozon/app/android/common/twocards/data/TwoCardsDTO;)Ljava/util/List;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/common/twocards/data/TwoCardsDTO;Ll20/d;)Ljava/util/List;", "", "dp16", "I", "dp4", "two-cards_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TwoCardsMapper implements Function2<TwoCardsDTO, d, List<? extends CardVO>> {
    private final int dp16 = ResourceExtKt.toPx(16);
    private final int dp4 = ResourceExtKt.toPx(4);

    private final List<CardVO> toVo(TwoCardsDTO twoCardsDTO) {
        CardVO vo;
        vo = TwoCardsMapperKt.toVo(twoCardsDTO.getLeftCard(), twoCardsDTO.hashCode(), this.dp16, twoCardsDTO.isSingle() ? this.dp16 : this.dp4);
        TwoCardsDTO.CardDTO rightCard = twoCardsDTO.getRightCard();
        CardVO[] elements = {vo, rightCard != null ? TwoCardsMapperKt.toVo(rightCard, twoCardsDTO.hashCode(), this.dp4, this.dp16) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return C7705l.B(elements);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<CardVO> invoke(@NotNull TwoCardsDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return toVo(state);
    }
}
