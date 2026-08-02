package ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.data;

import Ih.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.data.HotelsBookTotalV3DTO;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.presentation.vo.HotelsBookTotalV3StickyVO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00122.\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u0005`\u0006:\u0001\u0012B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u00022\n\u0010\u000f\u001a\u00060\u0003j\u0002`\u000eH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/data/HotelsBookTotalV3StickyMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/data/HotelsBookTotalV3DTO$StickyContainer;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/vo/HotelsBookTotalV3StickyVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "id", "toVo", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/data/HotelsBookTotalV3DTO$StickyContainer;J)Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/vo/HotelsBookTotalV3StickyVO;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/data/HotelsBookTotalV3DTO$StickyContainer;Ll20/d;)Ljava/util/List;", "Companion", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HotelsBookTotalV3StickyMapper implements Function2<HotelsBookTotalV3DTO.StickyContainer, d, List<? extends HotelsBookTotalV3StickyVO>> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/data/HotelsBookTotalV3StickyMapper$Companion;", "", "<init>", "()V", "STICKY_WIDGET_TAG", "", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private final HotelsBookTotalV3StickyVO toVo(HotelsBookTotalV3DTO.StickyContainer stickyContainer, long j11) {
        ButtonV3DTO button = stickyContainer.getButton();
        CommonControlSettings common = stickyContainer.getButton().getCommon();
        ButtonV3DTO copy$default = ButtonV3DTO.copy$default(button, null, null, null, null, null, null, null, null, null, null, null, null, null, common != null ? CommonControlSettings.copy$default(common, null, null, null, 6, null) : null, null, null, null, 122879, null);
        CommonControlSettings common2 = stickyContainer.getButton().getCommon();
        return new HotelsBookTotalV3StickyVO(j11, copy$default, common2 != null ? common2.toAtomAction() : null, false, 8, null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<HotelsBookTotalV3StickyVO> invoke(HotelsBookTotalV3DTO.StickyContainer state, @NotNull d widgetInfo) {
        HotelsBookTotalV3StickyVO vo;
        List<HotelsBookTotalV3StickyVO> a02;
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return (state == null || (vo = toVo(state, (long) a.a("sticky_widget", widgetInfo.d()))) == null || (a02 = C7714v.a0(vo)) == null) ? K.f71697a : a02;
    }
}
