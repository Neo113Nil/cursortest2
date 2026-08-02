package ru.ozon.app.android.monetization.widgets.inputSubmit.data;

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
import ru.ozon.app.android.monetization.widgets.inputSubmit.presentation.InputSubmitVO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/monetization/widgets/inputSubmit/data/InputSubmitMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/monetization/widgets/inputSubmit/data/InputSubmitDTO;", "Ll20/d;", "", "Lru/ozon/app/android/monetization/widgets/inputSubmit/presentation/InputSubmitVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/monetization/widgets/inputSubmit/data/InputSubmitDTO;Ll20/d;)Ljava/util/List;", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class InputSubmitMapper implements Function2<InputSubmitDTO, d, List<? extends InputSubmitVO>> {
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<InputSubmitVO> invoke(@NotNull InputSubmitDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        InputSubmitVO.TextArea textArea = new InputSubmitVO.TextArea(state.getTextArea().getUploadKey(), state.getTextArea().getPlaceholder(), state.getTextArea().getErrorRequiredText());
        ButtonV3DTO button = state.getButton();
        Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
        return C7714v.a0(new InputSubmitVO(hashCode, textArea, button, trackingInfo != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null, state.getTestInfo()));
    }
}
