package ru.ozon.app.android.fresh.chat.widgets.textInput.data;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.fresh.chat.widgets.textInput.presentation.TextInputVO;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\n\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/fresh/chat/widgets/textInput/data/TextInputDTO;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "Lru/ozon/app/android/fresh/chat/widgets/textInput/presentation/TextInputVO;", "toVO", "(Lru/ozon/app/android/fresh/chat/widgets/textInput/data/TextInputDTO;Ll20/d;)Lru/ozon/app/android/fresh/chat/widgets/textInput/presentation/TextInputVO;", "chat_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class TextInputMapperKt {
    @NotNull
    public static final TextInputVO toVO(@NotNull TextInputDTO textInputDTO, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(textInputDTO, "<this>");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        String placeholder = textInputDTO.getPlaceholder();
        AtomActionDTO sendAction = textInputDTO.getSendAction();
        Map<String, TokenizedTrackingInfo> trackingInfo = textInputDTO.getTrackingInfo();
        return new TextInputVO(hashCode, placeholder, sendAction, trackingInfo != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null);
    }
}
