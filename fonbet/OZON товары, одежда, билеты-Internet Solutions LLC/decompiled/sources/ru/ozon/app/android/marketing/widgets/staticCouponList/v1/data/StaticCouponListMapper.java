package ru.ozon.app.android.marketing.widgets.staticCouponList.v1.data;

import Tc.b;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.marketing.widgets.staticCouponList.v1.data.StaticCouponListDTO;
import ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.StaticCouponListVO;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 #2*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u00062\u00020\u00072\u00020\b2\u00020\t:\u0001#B\u001f\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ&\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J*\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0096\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u001cH\u0096\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ \u0010!\u001a\u00020 2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0002H\u0096\u0001¢\u0006\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/data/StaticCouponListMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/data/StaticCouponListDTO;", "Ll20/d;", "", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/data/StaticCouponListCounterMapper;", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/data/StaticCouponListCouponMapper;", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/data/StaticCouponListCreativeMapper;", "counterMapper", "couponMapper", "creativeMapper", "<init>", "(Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/data/StaticCouponListCounterMapper;Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/data/StaticCouponListCouponMapper;Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/data/StaticCouponListCreativeMapper;)V", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/data/StaticCouponListDTO;Ll20/d;)Ljava/util/List;", "", "widgetId", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/data/StaticCouponListDTO$Counter;", "dto", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/data/StaticCouponListDTO$WordDeclension;", "wordDeclension", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListVO$ContentItem$Badge;", "mapCounter", "(JLru/ozon/app/android/marketing/widgets/staticCouponList/v1/data/StaticCouponListDTO$Counter;Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/data/StaticCouponListDTO$WordDeclension;)Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListVO$ContentItem$Badge;", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/data/StaticCouponListDTO$Coupon;", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListVO$ContentItem$Coupon;", "mapCoupon", "(JLru/ozon/app/android/marketing/widgets/staticCouponList/v1/data/StaticCouponListDTO$Coupon;)Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListVO$ContentItem$Coupon;", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListVO$ContentItem$Creative;", "mapCreative", "(JLru/ozon/app/android/marketing/widgets/staticCouponList/v1/data/StaticCouponListDTO;)Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListVO$ContentItem$Creative;", "Companion", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class StaticCouponListMapper implements Function2<StaticCouponListDTO, d, List<? extends StaticCouponListVO>>, StaticCouponListCounterMapper, StaticCouponListCouponMapper, StaticCouponListCreativeMapper {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private final /* synthetic */ StaticCouponListCounterMapper $$delegate_0;
    private final /* synthetic */ StaticCouponListCouponMapper $$delegate_1;
    private final /* synthetic */ StaticCouponListCreativeMapper $$delegate_2;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/data/StaticCouponListMapper$Companion;", "", "<init>", "()V", "FIRST_COUPON_INDEX", "", "SECOND_COUPON_INDEX", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public StaticCouponListMapper(@NotNull StaticCouponListCounterMapper counterMapper, @NotNull StaticCouponListCouponMapper couponMapper, @NotNull StaticCouponListCreativeMapper creativeMapper) {
        Intrinsics.checkNotNullParameter(counterMapper, "counterMapper");
        Intrinsics.checkNotNullParameter(couponMapper, "couponMapper");
        Intrinsics.checkNotNullParameter(creativeMapper, "creativeMapper");
        this.$$delegate_0 = counterMapper;
        this.$$delegate_1 = couponMapper;
        this.$$delegate_2 = creativeMapper;
    }

    @Override // ru.ozon.app.android.marketing.widgets.staticCouponList.v1.data.StaticCouponListCounterMapper
    public StaticCouponListVO.ContentItem.Badge mapCounter(long widgetId, @NotNull StaticCouponListDTO.Counter dto, @NotNull StaticCouponListDTO.WordDeclension wordDeclension) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(wordDeclension, "wordDeclension");
        return this.$$delegate_0.mapCounter(widgetId, dto, wordDeclension);
    }

    @Override // ru.ozon.app.android.marketing.widgets.staticCouponList.v1.data.StaticCouponListCouponMapper
    @NotNull
    public StaticCouponListVO.ContentItem.Coupon mapCoupon(long widgetId, @NotNull StaticCouponListDTO.Coupon dto) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        return this.$$delegate_1.mapCoupon(widgetId, dto);
    }

    @Override // ru.ozon.app.android.marketing.widgets.staticCouponList.v1.data.StaticCouponListCreativeMapper
    @NotNull
    public StaticCouponListVO.ContentItem.Creative mapCreative(long widgetId, @NotNull StaticCouponListDTO dto) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        return this.$$delegate_2.mapCreative(widgetId, dto);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<StaticCouponListVO> invoke(@NotNull StaticCouponListDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        String bgImage = state.getBgImage();
        b builder = C7714v.B();
        StaticCouponListVO.ContentItem.Badge mapCounter = mapCounter(hashCode, state.getCounter(), state.getWordDeclension());
        if (mapCounter != null) {
            builder.add(mapCounter);
        }
        builder.add(mapCreative(hashCode, state));
        StaticCouponListDTO.Coupon coupon1 = state.getCoupon1();
        if (coupon1 != null) {
            builder.add(mapCoupon(hashCode, coupon1));
        }
        StaticCouponListDTO.Coupon coupon2 = state.getCoupon2();
        if (coupon2 != null) {
            builder.add(mapCoupon(1 + hashCode, coupon2));
        }
        Unit unit = Unit.f71690a;
        Intrinsics.checkNotNullParameter(builder, "builder");
        b B11 = builder.B();
        Map<String, TokenizedTrackingInfo> trackingInfo = state.getCommon().getTrackingInfo();
        return C7714v.a0(new StaticCouponListVO(hashCode, bgImage, B11, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null));
    }
}
