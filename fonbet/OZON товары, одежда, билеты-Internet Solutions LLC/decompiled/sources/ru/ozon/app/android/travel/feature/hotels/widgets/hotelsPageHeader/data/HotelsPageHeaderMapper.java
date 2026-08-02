package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageHeader.data;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.collections.U;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageHeader.data.HotelsPageHeaderDTO;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageHeader.presentation.HotelsPageHeaderVO;
import ru.ozon.app.android.travel.molecules.dto.linkButton.LinkButtonDTO;
import ru.ozon.app.android.travel.molecules.mapper.MapperExtKt;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetStateMapper;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.price.Price;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0003\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007B\u0007¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u0014\u001a\u00020\u00132\b\u0010\u000b\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0018\u001a\u00020\u0017*\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J*\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u001a\u001a\u00020\u00022\n\u0010\u001c\u001a\u00060\u0003j\u0002`\u001bH\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001f\u0010 R \u0010#\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\"0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageHeader/data/HotelsPageHeaderMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageHeader/data/HotelsPageHeaderDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageHeader/presentation/HotelsPageHeaderVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetStateMapper;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageHeader/presentation/HotelsPageHeaderVO$StateWrapper;", "<init>", "()V", "dto", "", "asyncData", "mapToStateWrapper", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageHeader/data/HotelsPageHeaderDTO;Ljava/lang/String;)Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageHeader/presentation/HotelsPageHeaderVO$StateWrapper;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageHeader/data/HotelsPageHeaderDTO$PriceInfo;", "", "isPremium", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageHeader/presentation/HotelsPageHeaderVO$PriceInfo;", "mapPriceInfo", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageHeader/data/HotelsPageHeaderDTO$PriceInfo;ZLjava/lang/String;)Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageHeader/presentation/HotelsPageHeaderVO$PriceInfo;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageHeader/data/HotelsPageHeaderDTO$PremiumInfo;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageHeader/presentation/HotelsPageHeaderVO$PremiumInfoVO;", "toVO", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageHeader/data/HotelsPageHeaderDTO$PremiumInfo;)Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageHeader/presentation/HotelsPageHeaderVO$PremiumInfoVO;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageHeader/data/HotelsPageHeaderDTO;Ll20/d;)Ljava/util/List;", "mapAsyncState", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageHeader/data/HotelsPageHeaderDTO;)Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageHeader/presentation/HotelsPageHeaderVO$StateWrapper;", "", "", "radii", "Ljava/util/Map;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsPageHeaderMapper implements Function2<HotelsPageHeaderDTO, d, List<? extends HotelsPageHeaderVO>>, AsyncWidgetStateMapper<HotelsPageHeaderDTO, HotelsPageHeaderVO.StateWrapper> {

    @NotNull
    private final Map<String, Integer> radii = U.j(new Pair("hotelsPageHeader", 0), new Pair("hotelsPageHeaderRounded", 24));

    private final HotelsPageHeaderVO.PriceInfo mapPriceInfo(HotelsPageHeaderDTO.PriceInfo dto, boolean isPremium, String asyncData) {
        r0 = null;
        HotelsPageHeaderVO.PremiumInfoVO premiumInfoVO = null;
        if ((dto != null ? dto.getPrice() : null) == null) {
            return (dto != null ? dto.getSearchParamButton() : null) != null ? new HotelsPageHeaderVO.PriceInfo.CellWrapper(dto.getSearchParamButton()) : asyncData != null ? new HotelsPageHeaderVO.PriceInfo.AsyncPlaceholder(asyncData) : HotelsPageHeaderVO.PriceInfo.Invalid.INSTANCE;
        }
        Price value = dto.getPrice().getValue();
        TextAtom description = dto.getPrice().getDescription();
        HotelsPageHeaderDTO.PremiumInfo premiumInfo = dto.getPrice().getPremiumInfo();
        if (premiumInfo != null) {
            if (!isPremium) {
                premiumInfo = null;
            }
            if (premiumInfo != null) {
                premiumInfoVO = toVO(premiumInfo);
            }
        }
        return new HotelsPageHeaderVO.PriceInfo.PriceWrapper(value, description, premiumInfoVO);
    }

    private final HotelsPageHeaderVO.StateWrapper mapToStateWrapper(HotelsPageHeaderDTO dto, String asyncData) {
        List<Badge> q02 = dto.getMirBadge() != null ? C7714v.q0(dto.getMirBadge(), dto.getBadges()) : dto.getBadges();
        HotelsPageHeaderVO.PriceInfo mapPriceInfo = mapPriceInfo(dto.getPriceInfo(), dto.isPremium(), asyncData);
        boolean z11 = dto.getMirBadge() != null;
        boolean z12 = !q02.isEmpty();
        TextAtom title = dto.getTitle();
        LinkButtonDTO address = dto.getAddress();
        return new HotelsPageHeaderVO.StateWrapper(mapPriceInfo, q02, z11, z12, dto.getStars(), title, address != null ? MapperExtKt.toVO(address) : null, dto.isPremium());
    }

    private final HotelsPageHeaderVO.PremiumInfoVO toVO(HotelsPageHeaderDTO.PremiumInfo premiumInfo) {
        return new HotelsPageHeaderVO.PremiumInfoVO(premiumInfo.getPremiumButton(), premiumInfo.getBackgroundColor(), premiumInfo.getDarkBackgroundColor());
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<HotelsPageHeaderVO> invoke(@NotNull HotelsPageHeaderDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        Integer num = this.radii.get(widgetInfo.c().b());
        if (num == null) {
            return K.f71697a;
        }
        int intValue = num.intValue();
        long hashCode = widgetInfo.d().hashCode();
        HotelsPageHeaderVO.StateWrapper mapToStateWrapper = mapToStateWrapper(state, widgetInfo.c().a());
        Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
        return C7714v.a0(new HotelsPageHeaderVO(hashCode, mapToStateWrapper, intValue, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null));
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetStateMapper
    @NotNull
    public HotelsPageHeaderVO.StateWrapper mapAsyncState(@NotNull HotelsPageHeaderDTO state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return mapToStateWrapper(state, null);
    }
}
