package ru.ozon.app.android.regulardraw.widgets.navbar.core;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.regulardraw.ui.currencyBadge.MorkovskCurrencyBadgeDTO;
import ru.ozon.app.android.regulardraw.ui.currencyBadge.MorkovskCurrencyBadgeVO;
import ru.ozon.app.android.regulardraw.ui.currencyBadge.MorkovskCurrencyBadgeVOKt;
import ru.ozon.app.android.regulardraw.widgets.navbar.data.CarrotBackgroundGradientVO;
import ru.ozon.app.android.regulardraw.widgets.navbar.data.CarrotIconVO;
import ru.ozon.app.android.regulardraw.widgets.navbar.data.CarrotNavBarButtonVO;
import ru.ozon.app.android.regulardraw.widgets.navbar.data.CarrotNavBarVO;
import ru.ozon.app.android.regulardraw.widgets.navbar.data.MorkovskBackgroundGradientDTO;
import ru.ozon.app.android.regulardraw.widgets.navbar.data.MorkovskIconDTO;
import ru.ozon.app.android.regulardraw.widgets.navbar.data.MorkovskNavBarButtonDTO;
import ru.ozon.app.android.regulardraw.widgets.navbar.data.MorkovskNavBarDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\t\b\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0011\u001a\u00020\u0010*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0011\u001a\u00020\u0014*\u00020\u0013H\u0002¢\u0006\u0004\b\u0011\u0010\u0015J*\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0016\u001a\u00020\u00022\n\u0010\u0018\u001a\u00060\u0003j\u0002`\u0017H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/navbar/core/MorkovskNavbarMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/regulardraw/widgets/navbar/data/MorkovskNavBarDTO;", "Ll20/d;", "", "Lru/ozon/app/android/regulardraw/widgets/navbar/data/CarrotNavBarVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/regulardraw/widgets/navbar/data/MorkovskBackgroundGradientDTO;", "Lru/ozon/app/android/regulardraw/widgets/navbar/data/CarrotBackgroundGradientVO;", "toVo", "(Lru/ozon/app/android/regulardraw/widgets/navbar/data/MorkovskBackgroundGradientDTO;)Lru/ozon/app/android/regulardraw/widgets/navbar/data/CarrotBackgroundGradientVO;", "Lru/ozon/app/android/regulardraw/widgets/navbar/data/MorkovskNavBarButtonDTO;", "", "id", "Lru/ozon/app/android/regulardraw/widgets/navbar/data/CarrotNavBarButtonVO;", "map", "(Lru/ozon/app/android/regulardraw/widgets/navbar/data/MorkovskNavBarButtonDTO;J)Lru/ozon/app/android/regulardraw/widgets/navbar/data/CarrotNavBarButtonVO;", "Lru/ozon/app/android/regulardraw/widgets/navbar/data/MorkovskIconDTO;", "Lru/ozon/app/android/regulardraw/widgets/navbar/data/CarrotIconVO;", "(Lru/ozon/app/android/regulardraw/widgets/navbar/data/MorkovskIconDTO;)Lru/ozon/app/android/regulardraw/widgets/navbar/data/CarrotIconVO;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/regulardraw/widgets/navbar/data/MorkovskNavBarDTO;Ll20/d;)Ljava/util/List;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MorkovskNavbarMapper implements Function2<MorkovskNavBarDTO, d, List<? extends CarrotNavBarVO>> {
    private final CarrotNavBarButtonVO map(MorkovskNavBarButtonDTO morkovskNavBarButtonDTO, long j11) {
        CarrotIconVO map = map(morkovskNavBarButtonDTO.getIcon());
        AtomAction atomAction = AtomActionMapperKt.toAtomAction(morkovskNavBarButtonDTO.getAction(), morkovskNavBarButtonDTO.getTrackingInfo());
        Map<String, TokenizedTrackingInfo> trackingInfo = morkovskNavBarButtonDTO.getTrackingInfo();
        return new CarrotNavBarButtonVO(map, atomAction, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null);
    }

    private final CarrotBackgroundGradientVO toVo(MorkovskBackgroundGradientDTO morkovskBackgroundGradientDTO) {
        return new CarrotBackgroundGradientVO(morkovskBackgroundGradientDTO.getStartColor(), morkovskBackgroundGradientDTO.getEndColor());
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<CarrotNavBarVO> invoke(@NotNull MorkovskNavBarDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = state.hashCode();
        MorkovskNavBarButtonDTO menuButton = state.getMenuButton();
        CarrotNavBarButtonVO map = menuButton != null ? map(menuButton, hashCode) : null;
        MorkovskCurrencyBadgeDTO balance = state.getBalance();
        MorkovskCurrencyBadgeVO map2 = balance != null ? MorkovskCurrencyBadgeVOKt.map(balance, MorkovskCurrencyBadgeVO.Size.DEFAULT) : null;
        MorkovskNavBarButtonDTO rightButton = state.getRightButton();
        CarrotNavBarButtonVO map3 = rightButton != null ? map(rightButton, hashCode) : null;
        MorkovskBackgroundGradientDTO backgroundGradient = state.getBackgroundGradient();
        CarrotBackgroundGradientVO vo = backgroundGradient != null ? toVo(backgroundGradient) : null;
        Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
        return C7714v.a0(new CarrotNavBarVO(hashCode, map, map2, map3, vo, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null));
    }

    private final CarrotIconVO map(MorkovskIconDTO morkovskIconDTO) {
        return new CarrotIconVO(morkovskIconDTO.getIcon(), morkovskIconDTO.getTintColor());
    }
}
