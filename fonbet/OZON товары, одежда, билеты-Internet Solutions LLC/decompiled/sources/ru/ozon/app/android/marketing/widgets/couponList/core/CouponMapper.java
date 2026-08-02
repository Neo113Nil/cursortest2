package ru.ozon.app.android.marketing.widgets.couponList.core;

import WZ.t;
import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.marketing.widgets.couponList.data.ActionButtonDTO;
import ru.ozon.app.android.marketing.widgets.couponList.data.CouponItemDTO;
import ru.ozon.app.android.marketing.widgets.couponList.data.ProductDTO;
import ru.ozon.app.android.marketing.widgets.couponList.presentation.BaseCouponVO;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.uikit.common.StyleParser;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/marketing/widgets/couponList/core/CouponMapper;", "", "<init>", "()V", "transform", "Lru/ozon/app/android/marketing/widgets/couponList/presentation/BaseCouponVO;", "index", "", "state", "Lru/ozon/app/android/marketing/widgets/couponList/data/CouponItemDTO;", "productSize", "context", "Landroid/content/Context;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CouponMapper {
    @NotNull
    public final BaseCouponVO transform(int index, @NotNull CouponItemDTO state, int productSize, @NotNull Context context) {
        int i11;
        BaseCouponVO.ConditionsVO conditionsVO;
        t tVar;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(context, "context");
        long hashCode = hashCode();
        String name = state.getName();
        String description = state.getDescription();
        String deeplink = state.getDeeplink();
        boolean isPointsVisible = state.isPointsVisible();
        boolean isLargeText = state.isLargeText();
        ActionButtonDTO actionButton = state.getActionButton();
        String deeplink2 = actionButton.getDeeplink();
        String title = actionButton.getTitle();
        Map<String, TokenizedTrackingInfo> trackingInfo = actionButton.getTrackingInfo();
        BaseCouponVO.ActionButtonVO actionButtonVO = new BaseCouponVO.ActionButtonVO(deeplink2, title, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null);
        List<ProductDTO> products = state.getProducts();
        ArrayList arrayList = new ArrayList(C7714v.z(products, 10));
        Iterator<T> it = products.iterator();
        while (it.hasNext()) {
            arrayList.add(new BaseCouponVO.ProductVO(((ProductDTO) it.next()).getImage()));
        }
        String text = state.getConditions().getText();
        StyleParser styleParser = StyleParser.INSTANCE;
        BaseCouponVO.ConditionsVO conditionsVO2 = new BaseCouponVO.ConditionsVO(text, styleParser.parseColor(context, state.getConditions().getColor(), R$color.oz_black));
        boolean active = state.getActive();
        String couponCode = state.getCouponCode();
        int parseColor = styleParser.parseColor(context, state.getAccentColor(), R$color.oz_purple);
        boolean z11 = index % 2 == 0;
        String headerImage = state.getHeaderImage();
        boolean isAdult = state.isAdult();
        Map<String, TokenizedTrackingInfo> trackingInfo2 = state.getTrackingInfo();
        if (trackingInfo2 != null) {
            i11 = parseColor;
            conditionsVO = conditionsVO2;
            tVar = TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo2, Long.valueOf(hashCode), null, 2, null);
        } else {
            i11 = parseColor;
            conditionsVO = conditionsVO2;
            tVar = null;
        }
        return new BaseCouponVO.CouponVO(hashCode, i11, name, headerImage, actionButtonVO, description, isPointsVisible, isLargeText, deeplink, arrayList, conditionsVO, active, couponCode, z11, productSize, isAdult, false, tVar, 65536, null);
    }
}
