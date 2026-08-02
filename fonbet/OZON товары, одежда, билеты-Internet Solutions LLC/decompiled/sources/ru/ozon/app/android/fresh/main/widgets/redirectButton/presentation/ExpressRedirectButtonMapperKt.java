package ru.ozon.app.android.fresh.main.widgets.redirectButton.presentation;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.fresh.main.widgets.redirectButton.data.ExpressRedirectButtonDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\n\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/redirectButton/data/ExpressRedirectButtonDTO;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "Lru/ozon/app/android/fresh/main/widgets/redirectButton/presentation/ExpressRedirectButtonVO;", "toVO", "(Lru/ozon/app/android/fresh/main/widgets/redirectButton/data/ExpressRedirectButtonDTO;Ll20/d;)Lru/ozon/app/android/fresh/main/widgets/redirectButton/presentation/ExpressRedirectButtonVO;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ExpressRedirectButtonMapperKt {
    @NotNull
    public static final ExpressRedirectButtonVO toVO(@NotNull ExpressRedirectButtonDTO expressRedirectButtonDTO, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(expressRedirectButtonDTO, "<this>");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        String title = expressRedirectButtonDTO.getTitle();
        String textColor = expressRedirectButtonDTO.getTextColor();
        String backgroundColor = expressRedirectButtonDTO.getBackgroundColor();
        AtomAction atomAction = AtomActionMapperKt.toAtomAction(expressRedirectButtonDTO.getAction(), expressRedirectButtonDTO.getTrackingInfo());
        Map<String, TokenizedTrackingInfo> trackingInfo = expressRedirectButtonDTO.getTrackingInfo();
        return new ExpressRedirectButtonVO(hashCode, title, textColor, backgroundColor, atomAction, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null);
    }
}
