package ru.ozon.app.android.fresh.unsorted.widgets.pdpAspects.presentation;

import WZ.t;
import WZ.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.fresh.unsorted.widgets.pdpAspects.data.PdpAspectsDTO;
import ru.ozon.app.android.fresh.unsorted.widgets.pdpAspects.domain.PdpAspectsVO;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000b\u001a\u00020\u000e*\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000b\u0010\u000fJ\u0015\u0010\u000b\u001a\u00020\u0011*\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u000b\u0010\u0012J*\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0013\u001a\u00020\u00022\n\u0010\u0015\u001a\u00060\u0003j\u0002`\u0014H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001aR\u0014\u0010 \u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001aR\u0014\u0010!\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001aR\u0014\u0010\"\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001aR\u0014\u0010#\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001aR\u0014\u0010$\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u001a¨\u0006%"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/pdpAspects/presentation/PdpAspectsMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/fresh/unsorted/widgets/pdpAspects/data/PdpAspectsDTO;", "Ll20/d;", "", "Lru/ozon/app/android/fresh/unsorted/widgets/pdpAspects/domain/PdpAspectsVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/fresh/unsorted/widgets/pdpAspects/data/PdpAspectsDTO$Aspect;", "Lru/ozon/app/android/fresh/unsorted/widgets/pdpAspects/domain/PdpAspectsVO$Aspect;", "toVO", "(Lru/ozon/app/android/fresh/unsorted/widgets/pdpAspects/data/PdpAspectsDTO$Aspect;)Lru/ozon/app/android/fresh/unsorted/widgets/pdpAspects/domain/PdpAspectsVO$Aspect;", "Lru/ozon/app/android/fresh/unsorted/widgets/pdpAspects/data/PdpAspectsDTO$SpacersDTO;", "Lru/ozon/app/android/fresh/unsorted/widgets/pdpAspects/domain/PdpAspectsVO$SpacersVO;", "(Lru/ozon/app/android/fresh/unsorted/widgets/pdpAspects/data/PdpAspectsDTO$SpacersDTO;)Lru/ozon/app/android/fresh/unsorted/widgets/pdpAspects/domain/PdpAspectsVO$SpacersVO;", "Lru/ozon/app/android/fresh/unsorted/widgets/pdpAspects/data/PdpAspectsDTO$Aspect$ItemSpacersDTO;", "Lru/ozon/app/android/fresh/unsorted/widgets/pdpAspects/domain/PdpAspectsVO$Aspect$ItemSpacersVO;", "(Lru/ozon/app/android/fresh/unsorted/widgets/pdpAspects/data/PdpAspectsDTO$Aspect$ItemSpacersDTO;)Lru/ozon/app/android/fresh/unsorted/widgets/pdpAspects/domain/PdpAspectsVO$Aspect$ItemSpacersVO;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/fresh/unsorted/widgets/pdpAspects/data/PdpAspectsDTO;Ll20/d;)Ljava/util/List;", "", "defaultVerticalTitleMargin", "I", "defaultHorizontalTitleMargin", "defaultHorizontalDotMargin", "defaultBetweenAspects", "defaultTopAspectsMargin", "defaultBottomAspectsMargin", "defaultLeftAspectsMargin", "defaultVerticalContentsMargin", "defaultHorizontalContentsMargin", "defaultBetweenPhotoPriceMargin", "defaultBetweenPriceTitleMargin", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PdpAspectsMapper implements Function2<PdpAspectsDTO, d, List<? extends PdpAspectsVO>> {
    private final int defaultVerticalTitleMargin = UiExtKt.toPx(16);
    private final int defaultHorizontalTitleMargin = UiExtKt.toPx(16);
    private final int defaultHorizontalDotMargin = UiExtKt.toPx(0);
    private final int defaultBetweenAspects = UiExtKt.toPx(6);
    private final int defaultTopAspectsMargin = UiExtKt.toPx(0);
    private final int defaultBottomAspectsMargin = UiExtKt.toPx(8);
    private final int defaultLeftAspectsMargin = UiExtKt.toPx(8);
    private final int defaultVerticalContentsMargin = UiExtKt.toPx(0);
    private final int defaultHorizontalContentsMargin = UiExtKt.toPx(0);
    private final int defaultBetweenPhotoPriceMargin = UiExtKt.toPx(14);
    private final int defaultBetweenPriceTitleMargin = UiExtKt.toPx(0);

    private final PdpAspectsVO.Aspect toVO(PdpAspectsDTO.Aspect aspect) {
        return new PdpAspectsVO.Aspect(aspect.getWrapper(), aspect.getPrice(), aspect.getImage(), aspect.getBadge(), aspect.getTitle(), aspect.getSubtitle(), toVO(aspect.getSpacers()));
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<PdpAspectsVO> invoke(@NotNull PdpAspectsDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        int hashCode2 = widgetInfo.d().hashCode();
        TextDTO title = state.getTitle();
        BadgeDTO badge = state.getBadge();
        Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
        t b11 = trackingInfo != null ? x.b(trackingInfo, Long.valueOf(hashCode), null) : null;
        List<PdpAspectsDTO.Aspect> items = state.getItems();
        ArrayList arrayList = new ArrayList(C7714v.z(items, 10));
        Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(toVO((PdpAspectsDTO.Aspect) it.next()));
        }
        return C7714v.a0(new PdpAspectsVO(hashCode, hashCode2, title, badge, b11, toVO(state.getSpacers()), state.getBackgroundColor(), arrayList));
    }

    private final PdpAspectsVO.SpacersVO toVO(PdpAspectsDTO.SpacersDTO spacersDTO) {
        Paddings leftAspects;
        Paddings bottomAspects;
        Paddings topAspects;
        Paddings betweenAspects;
        Paddings horizontalDot;
        Paddings horizontalTitle;
        Paddings verticalTitle;
        return new PdpAspectsVO.SpacersVO((spacersDTO == null || (verticalTitle = spacersDTO.getVerticalTitle()) == null) ? this.defaultVerticalTitleMargin : UiExtKt.toPx(verticalTitle.getPx()), (spacersDTO == null || (horizontalTitle = spacersDTO.getHorizontalTitle()) == null) ? this.defaultHorizontalTitleMargin : UiExtKt.toPx(horizontalTitle.getPx()), (spacersDTO == null || (horizontalDot = spacersDTO.getHorizontalDot()) == null) ? this.defaultHorizontalDotMargin : UiExtKt.toPx(horizontalDot.getPx()), (spacersDTO == null || (betweenAspects = spacersDTO.getBetweenAspects()) == null) ? this.defaultBetweenAspects : UiExtKt.toPx(betweenAspects.getPx()), (spacersDTO == null || (bottomAspects = spacersDTO.getBottomAspects()) == null) ? this.defaultBottomAspectsMargin : UiExtKt.toPx(bottomAspects.getPx()), (spacersDTO == null || (topAspects = spacersDTO.getTopAspects()) == null) ? this.defaultTopAspectsMargin : UiExtKt.toPx(topAspects.getPx()), (spacersDTO == null || (leftAspects = spacersDTO.getLeftAspects()) == null) ? this.defaultLeftAspectsMargin : UiExtKt.toPx(leftAspects.getPx()));
    }

    private final PdpAspectsVO.Aspect.ItemSpacersVO toVO(PdpAspectsDTO.Aspect.ItemSpacersDTO itemSpacersDTO) {
        Paddings betweenPriceTitle;
        Paddings betweenPhotoPrice;
        Paddings horizontal;
        Paddings vertical;
        return new PdpAspectsVO.Aspect.ItemSpacersVO((itemSpacersDTO == null || (vertical = itemSpacersDTO.getVertical()) == null) ? this.defaultVerticalContentsMargin : UiExtKt.toPx(vertical.getPx()), (itemSpacersDTO == null || (horizontal = itemSpacersDTO.getHorizontal()) == null) ? this.defaultHorizontalContentsMargin : UiExtKt.toPx(horizontal.getPx()), (itemSpacersDTO == null || (betweenPhotoPrice = itemSpacersDTO.getBetweenPhotoPrice()) == null) ? this.defaultBetweenPhotoPriceMargin : UiExtKt.toPx(betweenPhotoPrice.getPx()), (itemSpacersDTO == null || (betweenPriceTitle = itemSpacersDTO.getBetweenPriceTitle()) == null) ? this.defaultBetweenPriceTitleMargin : UiExtKt.toPx(betweenPriceTitle.getPx()));
    }
}
