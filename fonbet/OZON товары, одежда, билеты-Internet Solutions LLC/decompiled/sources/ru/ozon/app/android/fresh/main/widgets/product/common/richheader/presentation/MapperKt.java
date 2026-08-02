package ru.ozon.app.android.fresh.main.widgets.product.common.richheader.presentation;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.main.widgets.product.common.richheader.data.RichHeaderDTO;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toVO", "Lru/ozon/app/android/fresh/main/widgets/product/common/richheader/presentation/RichHeaderVO;", "Lru/ozon/app/android/fresh/main/widgets/product/common/richheader/data/RichHeaderDTO;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class MapperKt {
    @NotNull
    public static final RichHeaderVO toVO(@NotNull RichHeaderDTO richHeaderDTO) {
        Intrinsics.checkNotNullParameter(richHeaderDTO, "<this>");
        long hashCode = richHeaderDTO.hashCode();
        String image = richHeaderDTO.getImage();
        Float heightRatio = richHeaderDTO.getHeightRatio();
        return new RichHeaderVO(hashCode, image, heightRatio != null ? heightRatio.floatValue() : 0.625f, richHeaderDTO.getAvatar(), richHeaderDTO.getTitle(), richHeaderDTO.getSubtitle(), richHeaderDTO.getAction(), richHeaderDTO.getTrackingInfo(), richHeaderDTO.getTestInfo());
    }
}
