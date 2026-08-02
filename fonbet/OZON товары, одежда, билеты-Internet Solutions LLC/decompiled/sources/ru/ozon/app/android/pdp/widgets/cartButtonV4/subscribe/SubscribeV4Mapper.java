package ru.ozon.app.android.pdp.widgets.cartButtonV4.subscribe;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.CartButtonV4Dto;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonV4/subscribe/SubscribeV4Mapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto;", "Ll20/d;", "", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/subscribe/SubscribeVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "dto", "widgetInfo", "invoke", "(Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto;Ll20/d;)Ljava/util/List;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SubscribeV4Mapper implements Function2<CartButtonV4Dto, d, List<? extends SubscribeVO>> {
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<SubscribeVO> invoke(@NotNull CartButtonV4Dto dto, @NotNull d widgetInfo) {
        List<SubscribeVO> a02;
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        CartButtonV4Dto.Configuration configuration = dto.getConfiguration();
        CartButtonV4Dto.Configuration.SubscribeData subscribeData = configuration instanceof CartButtonV4Dto.Configuration.SubscribeData ? (CartButtonV4Dto.Configuration.SubscribeData) configuration : null;
        return (subscribeData == null || (a02 = C7714v.a0(new SubscribeVO((long) widgetInfo.d().hashCode(), dto.getSku(), subscribeData.isSubscribed(), subscribeData.getSubscribe(), null, subscribeData.getUnsubscribe(), null, dto.getNeedsShadow(), dto.getStyle(), subscribeData.getPriorityColors()))) == null) ? K.f71697a : a02;
    }
}
