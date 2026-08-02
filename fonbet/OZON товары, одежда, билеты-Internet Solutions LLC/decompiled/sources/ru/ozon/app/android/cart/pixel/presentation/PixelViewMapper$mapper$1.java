package ru.ozon.app.android.cart.pixel.presentation;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import ru.ozon.app.android.cart.pixel.data.PixelDTO;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru/ozon/app/android/cart/pixel/data/PixelDTO;", "pixelDTO", "Ll20/d;", "widgetInfo", "", "Lru/ozon/app/android/cart/pixel/presentation/PixelVI;", "invoke", "(Lru/ozon/app/android/cart/pixel/data/PixelDTO;Ll20/d;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes11.dex */
final class PixelViewMapper$mapper$1 extends AbstractC7737t implements Function2<PixelDTO, d, List<? extends PixelVI>> {
    public static final PixelViewMapper$mapper$1 INSTANCE = new PixelViewMapper$mapper$1();

    PixelViewMapper$mapper$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final List<PixelVI> invoke(PixelDTO pixelDTO, d widgetInfo) {
        Intrinsics.checkNotNullParameter(pixelDTO, "pixelDTO");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        String anchor = pixelDTO.getAnchor();
        if (anchor == null) {
            anchor = "";
        }
        return C7714v.a0(new PixelVI(hashCode, anchor));
    }
}
