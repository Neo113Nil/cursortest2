package ru.ozon.app.android.fresh.main.widgets.fakeSearchButton.data;

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
import ru.ozon.app.android.fresh.main.utils.ExtentionsKt;
import ru.ozon.app.android.fresh.main.widgets.fakeSearchButton.data.FakeSearchDTO;
import ru.ozon.app.android.fresh.main.widgets.fakeSearchButton.presentation.FakeSearchVO;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\t\b\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000b\u001a\u00020\u000e*\u00020\rH\u0002¢\u0006\u0004\b\u000b\u0010\u000fJ\u0013\u0010\u000b\u001a\u00020\u0011*\u00020\u0010H\u0002¢\u0006\u0004\b\u000b\u0010\u0012J*\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0013\u001a\u00020\u00022\n\u0010\u0015\u001a\u00060\u0003j\u0002`\u0014H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/fakeSearchButton/data/FakeSearchMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/fresh/main/widgets/fakeSearchButton/data/FakeSearchDTO;", "Ll20/d;", "", "Lru/ozon/app/android/fresh/main/widgets/fakeSearchButton/presentation/FakeSearchVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "widgetId", "toVO", "(Lru/ozon/app/android/fresh/main/widgets/fakeSearchButton/data/FakeSearchDTO;J)Lru/ozon/app/android/fresh/main/widgets/fakeSearchButton/presentation/FakeSearchVO;", "Lru/ozon/app/android/fresh/main/widgets/fakeSearchButton/data/FakeSearchDTO$PaddingsDTO;", "Lru/ozon/app/android/fresh/main/widgets/fakeSearchButton/presentation/FakeSearchVO$PaddingsVO;", "(Lru/ozon/app/android/fresh/main/widgets/fakeSearchButton/data/FakeSearchDTO$PaddingsDTO;)Lru/ozon/app/android/fresh/main/widgets/fakeSearchButton/presentation/FakeSearchVO$PaddingsVO;", "Lru/ozon/app/android/fresh/main/widgets/fakeSearchButton/data/FakeSearchDTO$CornersDTO;", "Lru/ozon/app/android/fresh/main/widgets/fakeSearchButton/presentation/FakeSearchVO$CornersVO;", "(Lru/ozon/app/android/fresh/main/widgets/fakeSearchButton/data/FakeSearchDTO$CornersDTO;)Lru/ozon/app/android/fresh/main/widgets/fakeSearchButton/presentation/FakeSearchVO$CornersVO;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/fresh/main/widgets/fakeSearchButton/data/FakeSearchDTO;Ll20/d;)Ljava/util/List;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FakeSearchMapper implements Function2<FakeSearchDTO, d, List<? extends FakeSearchVO>> {
    private final FakeSearchVO toVO(FakeSearchDTO fakeSearchDTO, long j11) {
        TextDTO copy$default = TextDTO.copy$default(fakeSearchDTO.getTitle(), null, TextDTO.TextAlignment.CENTER, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 524285, null);
        IconDTO icon = fakeSearchDTO.getIcon();
        FakeSearchVO.PaddingsVO vo = toVO(fakeSearchDTO.getPaddings());
        AtomAction atomAction = AtomActionMapperKt.toAtomAction(fakeSearchDTO.getAction(), fakeSearchDTO.getTrackingInfo());
        FakeSearchVO.CornersVO vo2 = toVO(fakeSearchDTO.getRoundedCorners());
        String stickyRoundingColor = fakeSearchDTO.getStickyRoundingColor();
        String tintColor = fakeSearchDTO.getTintColor();
        Map<String, TokenizedTrackingInfo> trackingInfo = fakeSearchDTO.getTrackingInfo();
        return new FakeSearchVO(j11, copy$default, icon, vo, atomAction, vo2, stickyRoundingColor, tintColor, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null, fakeSearchDTO.getRightIconButton(), fakeSearchDTO.getShouldSkipStickyAnimation());
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<FakeSearchVO> invoke(@NotNull FakeSearchDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVO(state, ExtentionsKt.getId(widgetInfo)));
    }

    private final FakeSearchVO.PaddingsVO toVO(FakeSearchDTO.PaddingsDTO paddingsDTO) {
        return new FakeSearchVO.PaddingsVO(UiExtKt.toPx(paddingsDTO.getTop().getPx()), UiExtKt.toPx(paddingsDTO.getBottom().getPx()), UiExtKt.toPx(paddingsDTO.getHorizontal().getPx()), UiExtKt.toPx(paddingsDTO.getHorizontalSticky().getPx()));
    }

    private final FakeSearchVO.CornersVO toVO(FakeSearchDTO.CornersDTO cornersDTO) {
        return new FakeSearchVO.CornersVO(UiExtKt.toPxF(cornersDTO.getTop().getPx()), UiExtKt.toPxF(cornersDTO.getBottom().getPx()), UiExtKt.toPxF(cornersDTO.getTopSticky().getPx()), UiExtKt.toPxF(cornersDTO.getBottomSticky().getPx()));
    }
}
