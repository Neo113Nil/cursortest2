package ru.ozon.app.android.marketing.widgets.sellerCategoryList.core;

import java.util.ArrayList;
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
import ru.ozon.app.android.marketing.widgets.sellerCategoryList.data.SellerCategoryListDTO;
import ru.ozon.app.android.marketing.widgets.sellerCategoryList.presentation.vo.CategoryVO;
import ru.ozon.app.android.marketing.widgets.sellerCategoryList.presentation.vo.SellerCategoryListVO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000e2*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006:\u0001\u000eB\u0007¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\n\u0010\u000b\u001a\u00060\u0003j\u0002`\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/marketing/widgets/sellerCategoryList/core/SellerCategoryListMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/marketing/widgets/sellerCategoryList/data/SellerCategoryListDTO;", "Ll20/d;", "", "Lru/ozon/app/android/marketing/widgets/sellerCategoryList/presentation/vo/SellerCategoryListVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "dto", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/marketing/widgets/sellerCategoryList/data/SellerCategoryListDTO;Ll20/d;)Ljava/util/List;", "Companion", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SellerCategoryListMapper implements Function2<SellerCategoryListDTO, d, List<? extends SellerCategoryListVO>> {
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<SellerCategoryListVO> invoke(@NotNull SellerCategoryListDTO dto, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        List<SellerCategoryListDTO.CategoryItemDTO> categoryList = dto.getCategoryList();
        ArrayList arrayList = new ArrayList(C7714v.z(categoryList, 10));
        for (SellerCategoryListDTO.CategoryItemDTO categoryItemDTO : categoryList) {
            long hashCode = categoryItemDTO.hashCode();
            TextAtom name = categoryItemDTO.getName();
            Integer maxLines = categoryItemDTO.getName().getMaxLines();
            arrayList.add(new CategoryVO(hashCode, TextAtom.copy$default(name, null, null, null, Integer.valueOf(maxLines != null ? maxLines.intValue() : 3), null, null, null, 119, null), categoryItemDTO.getBackgroundImage(), AtomActionMapperKt.toAtomAction(categoryItemDTO.getAction(), categoryItemDTO.getTrackingInfo()), categoryItemDTO.isAdult(), false, 32, null));
        }
        long hashCode2 = widgetInfo.d().hashCode();
        long hashCode3 = widgetInfo.d().hashCode();
        Map<String, TokenizedTrackingInfo> trackingInfo = dto.getTrackingInfo();
        return C7714v.a0(new SellerCategoryListVO(hashCode3, arrayList, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode2), null, 2, null) : null));
    }
}
