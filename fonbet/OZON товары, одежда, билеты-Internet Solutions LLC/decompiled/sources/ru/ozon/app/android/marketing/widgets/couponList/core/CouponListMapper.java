package ru.ozon.app.android.marketing.widgets.couponList.core;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.couponList.data.CouponItemDTO;
import ru.ozon.app.android.marketing.widgets.couponList.data.CouponListDTO;
import ru.ozon.app.android.marketing.widgets.couponList.presentation.BaseCouponVO;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00022\n\u0010\u000f\u001a\u00060\u0003j\u0002`\u000eH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0012R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/marketing/widgets/couponList/core/CouponListMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/marketing/widgets/couponList/data/CouponListDTO;", "Ll20/d;", "", "Lru/ozon/app/android/marketing/widgets/couponList/presentation/BaseCouponVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Lru/ozon/app/android/marketing/widgets/couponList/core/CouponMapper;", "couponMapper", "Landroid/content/Context;", "context", "<init>", "(Lru/ozon/app/android/marketing/widgets/couponList/core/CouponMapper;Landroid/content/Context;)V", "dto", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/marketing/widgets/couponList/data/CouponListDTO;Ll20/d;)Ljava/util/List;", "Lru/ozon/app/android/marketing/widgets/couponList/core/CouponMapper;", "Landroid/content/Context;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CouponListMapper implements Function2<CouponListDTO, d, List<? extends BaseCouponVO>> {

    @NotNull
    private final Context context;

    @NotNull
    private final CouponMapper couponMapper;

    public CouponListMapper(@NotNull CouponMapper couponMapper, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(couponMapper, "couponMapper");
        Intrinsics.checkNotNullParameter(context, "context");
        this.couponMapper = couponMapper;
        this.context = context;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<BaseCouponVO> invoke(@NotNull CouponListDTO dto, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        int px = (((this.context.getResources().getDisplayMetrics().widthPixels / 2) - ResourceExtKt.toPx(20)) - (ResourceExtKt.toPx(2) * 4)) / 3;
        List<CouponItemDTO> items = dto.getItems();
        ArrayList arrayList = new ArrayList(C7714v.z(items, 10));
        int i11 = 0;
        for (Object obj : items) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            arrayList.add(this.couponMapper.transform(i11, (CouponItemDTO) obj, px, this.context));
            i11 = i12;
        }
        ArrayList W02 = C7714v.W0(arrayList);
        if (W02.size() % 2 != 0) {
            long j11 = -1672388486;
            BaseCouponVO baseCouponVO = (BaseCouponVO) C7714v.Z(W02);
            W02.add(new BaseCouponVO.EmptyCouponVO(j11, baseCouponVO != null ? baseCouponVO.getBackgroundColor() : 0, null));
        }
        return W02;
    }
}
