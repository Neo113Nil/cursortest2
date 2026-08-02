package ru.ozon.app.android.ugc.core.widgets.illustrationButtons.data;

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
import ru.ozon.app.android.ugc.core.widgets.illustrationButtons.data.IllustrationButtonsDTO;
import ru.ozon.app.android.ugc.core.widgets.illustrationButtons.presentation.IllustrationButtonsVO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000b\u001a\u00020\u000e*\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000b\u0010\u000fJ&\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/illustrationButtons/data/IllustrationButtonsMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/ugc/core/widgets/illustrationButtons/data/IllustrationButtonsDTO;", "Ll20/d;", "", "Lru/ozon/app/android/ugc/core/widgets/illustrationButtons/presentation/IllustrationButtonsVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/ugc/core/widgets/illustrationButtons/data/IllustrationButtonsDTO$IllustrationButton;", "Lru/ozon/app/android/ugc/core/widgets/illustrationButtons/presentation/IllustrationButtonsVO$ButtonVO;", "toVO", "(Lru/ozon/app/android/ugc/core/widgets/illustrationButtons/data/IllustrationButtonsDTO$IllustrationButton;)Lru/ozon/app/android/ugc/core/widgets/illustrationButtons/presentation/IllustrationButtonsVO$ButtonVO;", "Lru/ozon/app/android/ugc/core/widgets/illustrationButtons/data/IllustrationButtonsDTO$PaddingsDTO;", "Lru/ozon/app/android/ugc/core/widgets/illustrationButtons/presentation/IllustrationButtonsVO$PaddingsVO;", "(Lru/ozon/app/android/ugc/core/widgets/illustrationButtons/data/IllustrationButtonsDTO$PaddingsDTO;)Lru/ozon/app/android/ugc/core/widgets/illustrationButtons/presentation/IllustrationButtonsVO$PaddingsVO;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/ugc/core/widgets/illustrationButtons/data/IllustrationButtonsDTO;Ll20/d;)Ljava/util/List;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class IllustrationButtonsMapper implements Function2<IllustrationButtonsDTO, d, List<? extends IllustrationButtonsVO>> {
    private final IllustrationButtonsVO.ButtonVO toVO(IllustrationButtonsDTO.IllustrationButton illustrationButton) {
        ImageDTO image = illustrationButton.getImage();
        TextDTO title = illustrationButton.getTitle();
        String backgroundColor = illustrationButton.getBackgroundColor();
        CornerRadius cornerRadius = illustrationButton.getCornerRadius();
        if (cornerRadius == null) {
            cornerRadius = CornerRadius.RADIUS_600;
        }
        float m1866getDpD9Ej5fM = cornerRadius.m1866getDpD9Ej5fM();
        AtomActionDTO action = illustrationButton.getAction();
        return new IllustrationButtonsVO.ButtonVO(image, title, backgroundColor, m1866getDpD9Ej5fM, action != null ? AtomActionMapperKt.toAtomAction(action, illustrationButton.getTracking()) : null, null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<IllustrationButtonsVO> invoke(@NotNull IllustrationButtonsDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        IllustrationButtonsVO.ButtonVO vo = toVO(state.getLeftButton());
        IllustrationButtonsVO.ButtonVO vo2 = toVO(state.getRightButton());
        String backgroundColor = state.getBackgroundColor();
        IllustrationButtonsVO.PaddingsVO vo3 = toVO(state.getPaddings());
        Map<String, TokenizedTrackingInfo> tracking = state.getTracking();
        return C7714v.a0(new IllustrationButtonsVO(hashCode, vo, vo2, backgroundColor, vo3, tracking != null ? TrackingInfoMapperKt.toTokenizedEvent$default(tracking, Long.valueOf(hashCode), null, 2, null) : null));
    }

    private final IllustrationButtonsVO.PaddingsVO toVO(IllustrationButtonsDTO.PaddingsDTO paddingsDTO) {
        if (paddingsDTO == null) {
            Paddings paddings = Paddings.NONE;
            float m1867getDpD9Ej5fM = paddings.m1867getDpD9Ej5fM();
            float m1867getDpD9Ej5fM2 = paddings.m1867getDpD9Ej5fM();
            Paddings paddings2 = Paddings.PADDING_300;
            return new IllustrationButtonsVO.PaddingsVO(m1867getDpD9Ej5fM, m1867getDpD9Ej5fM2, paddings2.m1867getDpD9Ej5fM(), paddings2.m1867getDpD9Ej5fM(), Paddings.PADDING_250.m1867getDpD9Ej5fM(), null);
        }
        Paddings topPadding = paddingsDTO.getTopPadding();
        if (topPadding == null) {
            topPadding = Paddings.NONE;
        }
        float m1867getDpD9Ej5fM3 = topPadding.m1867getDpD9Ej5fM();
        Paddings bottomPadding = paddingsDTO.getBottomPadding();
        if (bottomPadding == null) {
            bottomPadding = Paddings.NONE;
        }
        float m1867getDpD9Ej5fM4 = bottomPadding.m1867getDpD9Ej5fM();
        Paddings leftPadding = paddingsDTO.getLeftPadding();
        if (leftPadding == null) {
            leftPadding = Paddings.PADDING_300;
        }
        float m1867getDpD9Ej5fM5 = leftPadding.m1867getDpD9Ej5fM();
        Paddings rightPadding = paddingsDTO.getRightPadding();
        if (rightPadding == null) {
            rightPadding = Paddings.PADDING_300;
        }
        float m1867getDpD9Ej5fM6 = rightPadding.m1867getDpD9Ej5fM();
        Paddings buttonsPadding = paddingsDTO.getButtonsPadding();
        if (buttonsPadding == null) {
            buttonsPadding = Paddings.PADDING_250;
        }
        return new IllustrationButtonsVO.PaddingsVO(m1867getDpD9Ej5fM3, m1867getDpD9Ej5fM4, m1867getDpD9Ej5fM5, m1867getDpD9Ej5fM6, buttonsPadding.m1867getDpD9Ej5fM(), null);
    }
}
