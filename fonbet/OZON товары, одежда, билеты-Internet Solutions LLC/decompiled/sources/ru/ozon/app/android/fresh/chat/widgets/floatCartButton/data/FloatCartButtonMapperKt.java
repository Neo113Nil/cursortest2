package ru.ozon.app.android.fresh.chat.widgets.floatCartButton.data;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.fresh.chat.widgets.floatCartButton.presentation.FloatCartButtonVO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, d2 = {"toVO", "Lru/ozon/app/android/fresh/chat/widgets/floatCartButton/presentation/FloatCartButtonVO;", "Lru/ozon/app/android/fresh/chat/widgets/floatCartButton/data/FloatCartButtonDTO;", "widgetId", "", "chat_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FloatCartButtonMapperKt {
    @NotNull
    public static final FloatCartButtonVO toVO(@NotNull FloatCartButtonDTO floatCartButtonDTO, long j11) {
        Intrinsics.checkNotNullParameter(floatCartButtonDTO, "<this>");
        IconDTO icon = floatCartButtonDTO.getIcon();
        TextDTO text = floatCartButtonDTO.getText();
        List<Long> skuList = floatCartButtonDTO.getSkuList();
        String backgroundColor = floatCartButtonDTO.getBackgroundColor();
        AtomAction atomAction = AtomActionMapperKt.toAtomAction(floatCartButtonDTO.getClickAction(), null);
        Map<String, TokenizedTrackingInfo> trackingInfo = floatCartButtonDTO.getTrackingInfo();
        return new FloatCartButtonVO(j11, icon, text, skuList, backgroundColor, atomAction, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null);
    }
}
