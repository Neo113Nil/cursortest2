package ru.ozon.app.android.commonwidgets.widgets.curtainContent.presentation;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.commonwidgets.widgets.curtainContent.data.CurtainContentDTO;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/curtainContent/data/CurtainContentDTO;", "dto", "Ll20/d;", "info", "", "Lru/ozon/app/android/commonwidgets/widgets/curtainContent/presentation/CurtainContentVO;", "invoke", "(Lru/ozon/app/android/commonwidgets/widgets/curtainContent/data/CurtainContentDTO;Ll20/d;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class CurtainContentViewMapper$mapper$1 extends AbstractC7737t implements Function2<CurtainContentDTO, d, List<? extends CurtainContentVO>> {
    public static final CurtainContentViewMapper$mapper$1 INSTANCE = new CurtainContentViewMapper$mapper$1();

    CurtainContentViewMapper$mapper$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final List<CurtainContentVO> invoke(CurtainContentDTO dto, d info) {
        boolean isValid;
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(info, "info");
        long hashCode = info.d().hashCode();
        isValid = CurtainContentViewMapperKt.isValid(dto);
        if (!isValid) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        long hashCode2 = info.d().hashCode();
        ImageDTO image = dto.getImage();
        List<TextDTO> titles = dto.getTitles();
        List<ButtonV3DTO> buttons = dto.getButtons();
        Map<String, TokenizedTrackingInfo> trackingInfo = dto.getTrackingInfo();
        return C7714v.a0(new CurtainContentVO(hashCode2, image, titles, buttons, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null));
    }
}
