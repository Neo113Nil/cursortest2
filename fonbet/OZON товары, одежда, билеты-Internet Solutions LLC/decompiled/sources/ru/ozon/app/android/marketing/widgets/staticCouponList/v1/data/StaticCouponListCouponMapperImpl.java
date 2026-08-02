package ru.ozon.app.android.marketing.widgets.staticCouponList.v1.data;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.staticCouponList.v1.data.StaticCouponListDTO;
import ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.StaticCouponListBackground;
import ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.StaticCouponListVO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \u00112\u00020\u00012\u00020\u0002:\u0001\u0011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\f\u0010\f\u001a\u00020\r*\u00020\u000bH\u0002J\u0011\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u0010H\u0096\u0001¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/data/StaticCouponListCouponMapperImpl;", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/data/StaticCouponListCouponMapper;", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/data/StaticCouponListBackgroundMapper;", "backgroundMapper", "<init>", "(Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/data/StaticCouponListBackgroundMapper;)V", "mapCoupon", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListVO$ContentItem$Coupon;", "widgetId", "", "dto", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/data/StaticCouponListDTO$Coupon;", "mapStub", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListVO$ContentItem$Coupon$Stub;", "mapBackground", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListBackground;", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/data/StaticCouponListDTO$Background;", "Companion", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class StaticCouponListCouponMapperImpl implements StaticCouponListCouponMapper, StaticCouponListBackgroundMapper {
    private final /* synthetic */ StaticCouponListBackgroundMapper $$delegate_0;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/data/StaticCouponListCouponMapperImpl$Companion;", "", "<init>", "()V", "COUPON_ID", "", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public StaticCouponListCouponMapperImpl(@NotNull StaticCouponListBackgroundMapper backgroundMapper) {
        Intrinsics.checkNotNullParameter(backgroundMapper, "backgroundMapper");
        this.$$delegate_0 = backgroundMapper;
    }

    private final StaticCouponListVO.ContentItem.Coupon.Stub mapStub(StaticCouponListDTO.Coupon coupon) {
        boolean isApplied = coupon.isApplied();
        TextDTO text = coupon.getAppliedStub().getText();
        TextDTO text2 = coupon.getUnAppliedStub().getText();
        StaticCouponListBackground mapBackground = mapBackground(coupon.getBgColor());
        StaticCouponListBackground mapBackground2 = mapBackground(coupon.getAppliedStub().getBgColor());
        CommonControlSettings common = coupon.getUnAppliedStub().getCommon();
        return new StaticCouponListVO.ContentItem.Coupon.Stub(isApplied, text, text2, mapBackground, mapBackground2, common != null ? common.toAtomAction() : null);
    }

    @Override // ru.ozon.app.android.marketing.widgets.staticCouponList.v1.data.StaticCouponListBackgroundMapper
    @NotNull
    public StaticCouponListBackground mapBackground(@NotNull StaticCouponListDTO.Background dto) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        return this.$$delegate_0.mapBackground(dto);
    }

    @Override // ru.ozon.app.android.marketing.widgets.staticCouponList.v1.data.StaticCouponListCouponMapper
    @NotNull
    public StaticCouponListVO.ContentItem.Coupon mapCoupon(long widgetId, @NotNull StaticCouponListDTO.Coupon dto) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        return new StaticCouponListVO.ContentItem.Coupon(widgetId - 103192620, mapBackground(dto.getBgColor()), dto.getTitle(), dto.getSubtitle(), dto.getChevron(), dto.getLeftIcon(), dto.isApplied(), mapStub(dto), dto.getCommon().toAtomAction(), false, UserVerificationMethods.USER_VERIFY_NONE, null);
    }
}
