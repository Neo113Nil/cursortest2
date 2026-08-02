package ru.ozon.app.android.ugc.core.widgets.singlereview.translateButton;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.pdp.ui.configurators.ugc.singleReview.SingleReviewDTO;
import ru.ozon.app.android.ugc.core.widgets.singlereview.translateButton.presentation.TranslateButtonVO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/translateButton/TranslateButtonMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/translateButton/TranslateButtonDO;", "Ll20/d;", "", "Lru/ozon/app/android/ugc/core/widgets/singlereview/translateButton/presentation/TranslateButtonVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/ugc/core/widgets/singlereview/translateButton/TranslateButtonDO;Ll20/d;)Ljava/util/List;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TranslateButtonMapper implements Function2<TranslateButtonDO, d, List<? extends TranslateButtonVO>> {
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<TranslateButtonVO> invoke(@NotNull TranslateButtonDO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        SingleReviewDTO.TranslateButtonDTO translateButton = state.getTranslateButton();
        if (translateButton != null) {
            long hashCode = (widgetInfo.d() + state.getUuid() + "translateButton").hashCode();
            long hashCode2 = state.getUuid().hashCode();
            ButtonV3DTO initialButton = translateButton.getInitialButton();
            ButtonV3DTO inProgressButton = translateButton.getInProgressButton();
            ButtonV3DTO finalButton = translateButton.getFinalButton();
            List<SingleReviewDTO.BodySectionDTO> bodySections = state.getBodySections();
            Map<String, TokenizedTrackingInfo> trackingInfo = translateButton.getTrackingInfo();
            List<TranslateButtonVO> a02 = C7714v.a0(new TranslateButtonVO(hashCode, hashCode2, initialButton, inProgressButton, finalButton, null, bodySections, null, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null, translateButton.getTranslateErrorTrackingInfo(), 160, null));
            if (a02 != null) {
                return a02;
            }
        }
        return K.f71697a;
    }
}
