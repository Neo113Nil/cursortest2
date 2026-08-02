package ru.ozon.app.android.product.common.richheader.presentation;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.product.common.richheader.data.RichHeaderDTO;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.avatar.Avatar;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.v3.mappers.BadgeMapperKt;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\n\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/product/common/richheader/data/RichHeaderDTO;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "Lru/ozon/app/android/product/common/richheader/presentation/RichHeaderVO;", "toVO", "(Lru/ozon/app/android/product/common/richheader/data/RichHeaderDTO;Ll20/d;)Lru/ozon/app/android/product/common/richheader/presentation/RichHeaderVO;", "product_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MapperKt {
    @NotNull
    public static final RichHeaderVO toVO(@NotNull RichHeaderDTO richHeaderDTO, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(richHeaderDTO, "<this>");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = richHeaderDTO.hashCode();
        String image = richHeaderDTO.getImage();
        Float heightRatio = richHeaderDTO.getHeightRatio();
        float floatValue = heightRatio != null ? heightRatio.floatValue() : 0.625f;
        Avatar avatar = richHeaderDTO.getAvatar();
        TextAtom title = richHeaderDTO.getTitle();
        TextAtom subtitle = richHeaderDTO.getSubtitle();
        AtomActionDTO action = richHeaderDTO.getAction();
        Map<String, TokenizedTrackingInfo> trackingInfo = richHeaderDTO.getTrackingInfo();
        TestInfo testInfo = richHeaderDTO.getTestInfo();
        Badge badge = richHeaderDTO.getBadge();
        RichHeaderVO richHeaderVO = new RichHeaderVO(hashCode, image, floatValue, avatar, title, subtitle, action, trackingInfo, testInfo, badge != null ? BadgeMapperKt.mapToDsBadge(badge) : null);
        String a11 = widgetInfo.a();
        richHeaderVO.setAdditionalBottomPadding(Intrinsics.d(a11, "products.skuGrid3") ? ResourceExtKt.toPx(12) : Intrinsics.d(a11, "products.skuScroll") ? ResourceExtKt.toPx(4) : 0);
        return richHeaderVO;
    }
}
