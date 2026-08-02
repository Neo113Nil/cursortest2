package ru.ozon.app.android.regulardraw.widgets.daily.core;

import Bk.C2638a;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.regulardraw.ui.button.MorkovskShadowButtonDTO;
import ru.ozon.app.android.regulardraw.widgets.daily.data.DailyDTO;
import ru.ozon.app.android.regulardraw.widgets.daily.data.DailyVO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00122*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006:\u0001\u0012B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00022\n\u0010\u000f\u001a\u00060\u0003j\u0002`\u000eH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/daily/core/DailyMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/regulardraw/widgets/daily/data/DailyDTO;", "Ll20/d;", "", "Lru/ozon/app/android/regulardraw/widgets/daily/data/DailyVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/regulardraw/widgets/daily/data/DailyDTO$Timer;", "Lru/ozon/app/android/regulardraw/widgets/daily/data/DailyVO$Timer;", "map", "(Lru/ozon/app/android/regulardraw/widgets/daily/data/DailyDTO$Timer;)Lru/ozon/app/android/regulardraw/widgets/daily/data/DailyVO$Timer;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/regulardraw/widgets/daily/data/DailyDTO;Ll20/d;)Ljava/util/List;", "Companion", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DailyMapper implements Function2<DailyDTO, d, List<? extends DailyVO>> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/daily/core/DailyMapper$Companion;", "", "<init>", "()V", "MILLISECONDS_TO_SECONDS", "", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private final DailyVO.Timer map(DailyDTO.Timer timer) {
        return new DailyVO.Timer(timer.getTitle(), timer.getSecondsLeft(), (timer.getSecondsLeft() * 1000) + C2638a.a(), AtomActionMapperKt.toAtomAction(timer.getOnTimerEndAction(), timer.getTrackingInfo()));
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<DailyVO> invoke(@NotNull DailyDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        String bannerImage = state.getBannerImage();
        String title = state.getTitle();
        List<String> dailyList = state.getDailyList();
        DailyDTO.Timer timer = state.getTimer();
        DailyVO.Timer map = timer != null ? map(timer) : null;
        MorkovskShadowButtonDTO button = state.getButton();
        Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
        return C7714v.a0(new DailyVO(hashCode, bannerImage, title, dailyList, map, button, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null));
    }
}
