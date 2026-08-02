package ru.ozon.app.android.ugc.core.widgets.reviewStatusInfo.image;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.image.ImageDTO;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "state", "Ll20/d;", "info", "", "Lru/ozon/app/android/ugc/core/widgets/reviewStatusInfo/image/CommonImageVO;", "invoke", "(Ljava/lang/Object;Ll20/d;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class CommonImageSubwidgetKt$commonImageElement$2 extends AbstractC7737t implements Function2<Object, d, List<? extends CommonImageVO>> {
    public static final CommonImageSubwidgetKt$commonImageElement$2 INSTANCE = new CommonImageSubwidgetKt$commonImageElement$2();

    CommonImageSubwidgetKt$commonImageElement$2() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final List<CommonImageVO> invoke(Object state, d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        CommonImageDTO commonImageDTO = (CommonImageDTO) state;
        long hashCode = info.d().hashCode();
        ImageDTO image = commonImageDTO.getImage();
        if (image == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Paddings leftMargin = commonImageDTO.getLeftMargin();
        if (leftMargin == null) {
            leftMargin = Paddings.PADDING_300;
        }
        Paddings paddings = leftMargin;
        Paddings topMargin = commonImageDTO.getTopMargin();
        if (topMargin == null) {
            topMargin = Paddings.PADDING_300;
        }
        Paddings paddings2 = topMargin;
        Paddings rightMargin = commonImageDTO.getRightMargin();
        if (rightMargin == null) {
            rightMargin = Paddings.PADDING_300;
        }
        Paddings paddings3 = rightMargin;
        Paddings bottomMargin = commonImageDTO.getBottomMargin();
        if (bottomMargin == null) {
            bottomMargin = Paddings.NONE;
        }
        return C7714v.a0(new CommonImageVO(hashCode, image, paddings, paddings2, paddings3, bottomMargin));
    }
}
