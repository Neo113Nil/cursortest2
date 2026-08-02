package ru.ozon.app.android.fresh.unsorted.widgets.textBlock.v2.presentation;

import WZ.t;
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
import ru.ozon.app.android.fresh.unsorted.widgets.textBlock.v2.data.TextBlockV2DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u0005*\u00020\u00022\n\u0010\n\u001a\u00060\u0003j\u0002`\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00022\n\u0010\n\u001a\u00060\u0003j\u0002`\tH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/textBlock/v2/presentation/TextBlockV2Mapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/fresh/unsorted/widgets/textBlock/v2/data/TextBlockV2DTO;", "Ll20/d;", "", "Lru/ozon/app/android/fresh/unsorted/widgets/textBlock/v2/presentation/TextBlockV2VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "toVO", "(Lru/ozon/app/android/fresh/unsorted/widgets/textBlock/v2/data/TextBlockV2DTO;Ll20/d;)Lru/ozon/app/android/fresh/unsorted/widgets/textBlock/v2/presentation/TextBlockV2VO;", "dto", "invoke", "(Lru/ozon/app/android/fresh/unsorted/widgets/textBlock/v2/data/TextBlockV2DTO;Ll20/d;)Ljava/util/List;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class TextBlockV2Mapper implements Function2<TextBlockV2DTO, d, List<? extends TextBlockV2VO>> {
    private final TextBlockV2VO toVO(TextBlockV2DTO textBlockV2DTO, d dVar) {
        t mapToTokenizedEvent$default;
        long hashCode = dVar.d().hashCode();
        t tVar = null;
        TextDTO copy$default = TextDTO.copy$default(textBlockV2DTO.getText(), null, null, null, null, null, null, null, null, null, null, null, null, null, textBlockV2DTO.isTagSupported(), null, null, null, null, null, 516095, null);
        Map<String, TokenizedTrackingInfo> trackingInfo = textBlockV2DTO.getTrackingInfo();
        if (trackingInfo == null || (mapToTokenizedEvent$default = TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null)) == null) {
            Map<String, TokenizedTrackingInfo> trackingInfo2 = textBlockV2DTO.getText().getTrackingInfo();
            if (trackingInfo2 != null) {
                tVar = TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo2, Long.valueOf(hashCode), null, 2, null);
            }
        } else {
            tVar = mapToTokenizedEvent$default;
        }
        return new TextBlockV2VO(hashCode, copy$default, tVar);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<TextBlockV2VO> invoke(@NotNull TextBlockV2DTO dto, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVO(dto, widgetInfo));
    }
}
