package ru.ozon.app.android.marketing.widgets.blackFridayStatus.presentation.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.blackFridayStatus.data.ImageDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"toVo", "Lru/ozon/app/android/marketing/widgets/blackFridayStatus/presentation/model/ImageVO;", "Lru/ozon/app/android/marketing/widgets/blackFridayStatus/data/ImageDTO;", "marketing_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ImageVOKt {
    @NotNull
    public static final ImageVO toVo(@NotNull ImageDTO imageDTO) {
        Intrinsics.checkNotNullParameter(imageDTO, "<this>");
        String link = imageDTO.getLink();
        AtomActionDTO action = imageDTO.getAction();
        return new ImageVO(link, action != null ? AtomActionMapperKt.toAtomAction(action, imageDTO.getTrackingInfo()) : null);
    }
}
