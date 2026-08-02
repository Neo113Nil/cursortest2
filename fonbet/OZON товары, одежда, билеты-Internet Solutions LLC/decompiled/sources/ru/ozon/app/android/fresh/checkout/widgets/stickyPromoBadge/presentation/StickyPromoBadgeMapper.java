package ru.ozon.app.android.fresh.checkout.widgets.stickyPromoBadge.presentation;

import WZ.t;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.fresh.checkout.widgets.stickyPromoBadge.data.StickyPromoBadgeDTO;
import ru.ozon.app.android.fresh.checkout.widgets.stickyPromoBadge.domain.StickyPromoBadgeVO;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.image.ImageAspectRatio;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00122*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006:\u0001\u0012B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\n*\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00022\n\u0010\u000f\u001a\u00060\u0003j\u0002`\u000eH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/stickyPromoBadge/presentation/StickyPromoBadgeMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/fresh/checkout/widgets/stickyPromoBadge/data/StickyPromoBadgeDTO;", "Ll20/d;", "", "Lru/ozon/app/android/fresh/checkout/widgets/stickyPromoBadge/domain/StickyPromoBadgeVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/fresh/checkout/widgets/stickyPromoBadge/data/StickyPromoBadgeDTO$SpacersDTO;", "Lru/ozon/app/android/fresh/checkout/widgets/stickyPromoBadge/domain/StickyPromoBadgeVO$Spacers;", "toVO", "(Lru/ozon/app/android/fresh/checkout/widgets/stickyPromoBadge/data/StickyPromoBadgeDTO$SpacersDTO;)Lru/ozon/app/android/fresh/checkout/widgets/stickyPromoBadge/domain/StickyPromoBadgeVO$Spacers;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/fresh/checkout/widgets/stickyPromoBadge/data/StickyPromoBadgeDTO;Ll20/d;)Ljava/util/List;", "Companion", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class StickyPromoBadgeMapper implements Function2<StickyPromoBadgeDTO, d, List<? extends StickyPromoBadgeVO>> {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final int defaultMargin = ResourceExtKt.toPx(8);
    private static final int defaultTopMargin = ResourceExtKt.toPx(0);
    private static final float defaultRadius = ResourceExtKt.toPxF(6);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/stickyPromoBadge/presentation/StickyPromoBadgeMapper$Companion;", "", "<init>", "()V", "", "imageWidth", "I", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private final StickyPromoBadgeVO.Spacers toVO(StickyPromoBadgeDTO.SpacersDTO spacersDTO) {
        Paddings right;
        Paddings left;
        Paddings bottom;
        Paddings top;
        return new StickyPromoBadgeVO.Spacers((spacersDTO == null || (top = spacersDTO.getTop()) == null) ? defaultTopMargin : ResourceExtKt.toPx(top.getPx()), (spacersDTO == null || (bottom = spacersDTO.getBottom()) == null) ? defaultMargin : ResourceExtKt.toPx(bottom.getPx()), (spacersDTO == null || (left = spacersDTO.getLeft()) == null) ? defaultMargin : ResourceExtKt.toPx(left.getPx()), (spacersDTO == null || (right = spacersDTO.getRight()) == null) ? defaultMargin : ResourceExtKt.toPx(right.getPx()));
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<StickyPromoBadgeVO> invoke(@NotNull StickyPromoBadgeDTO state, @NotNull d widgetInfo) {
        ArrayList arrayList;
        t tVar;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        BadgeDTO badge = state.getBadge();
        StickyPromoBadgeVO.Spacers vo = toVO(state.getSpacers());
        Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
        if (trackingInfo != null) {
            tVar = TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null);
            arrayList = null;
        } else {
            arrayList = null;
            tVar = null;
        }
        TextDTO startText = state.getStartText();
        TextDTO endText = state.getEndText();
        List<StickyPromoBadgeDTO.Image> images = state.getImages();
        if (images != null) {
            List<StickyPromoBadgeDTO.Image> list = images;
            arrayList = new ArrayList(C7714v.z(list, 10));
            for (StickyPromoBadgeDTO.Image image : list) {
                arrayList.add(new StickyPromoBadgeVO.Image(new ImageDTO(image.getImageUrl(), null, ImageAspectRatio.RATIO_1_1, false, null, null, null, null, null, null, null, null, 16, null, ImageDTO.FitType.FIT_CENTER, null, 45050, null), image.getTintColor()));
            }
        }
        ArrayList arrayList2 = arrayList;
        String backgroundColor = state.getBackgroundColor();
        CornerRadius cornerRadius = state.getCornerRadius();
        return C7714v.a0(new StickyPromoBadgeVO(hashCode, badge, startText, endText, arrayList2, backgroundColor, vo, cornerRadius != null ? ResourceExtKt.toPxF(cornerRadius.getPx()) : defaultRadius, tVar));
    }
}
