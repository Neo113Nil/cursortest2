package ru.ozon.app.android.marketing.widgets.blackFridayStatus.core;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.stock.StockBar;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.marketing.widgets.blackFridayStatus.data.BlackFridayStatusDTO;
import ru.ozon.app.android.marketing.widgets.blackFridayStatus.data.ButtonWithTitle;
import ru.ozon.app.android.marketing.widgets.blackFridayStatus.data.TimerWithTitleDTO;
import ru.ozon.app.android.marketing.widgets.blackFridayStatus.presentation.model.ImageVO;
import ru.ozon.app.android.marketing.widgets.blackFridayStatus.presentation.model.ImageVOKt;
import ru.ozon.app.android.marketing.widgets.blackFridayStatus.presentation.model.TimerWithTitleVO;
import ru.ozon.app.android.marketing.widgets.blackFridayStatus.presentation.model.TimerWithTitleVOKt;
import ru.ozon.app.android.marketing.widgets.blackFridayStatus.presentation.texttitle.TextTitleLayoutVO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\t\b\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00022\n\u0010\u000f\u001a\u00060\u0003j\u0002`\u000eH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/marketing/widgets/blackFridayStatus/core/BlackFridayStatusTextTitleMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/marketing/widgets/blackFridayStatus/data/BlackFridayStatusDTO$TextTitleLayout;", "Ll20/d;", "", "Lru/ozon/app/android/marketing/widgets/blackFridayStatus/presentation/texttitle/TextTitleLayoutVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "id", "toVo", "(Lru/ozon/app/android/marketing/widgets/blackFridayStatus/data/BlackFridayStatusDTO$TextTitleLayout;J)Lru/ozon/app/android/marketing/widgets/blackFridayStatus/presentation/texttitle/TextTitleLayoutVO;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/marketing/widgets/blackFridayStatus/data/BlackFridayStatusDTO$TextTitleLayout;Ll20/d;)Ljava/util/List;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class BlackFridayStatusTextTitleMapper implements Function2<BlackFridayStatusDTO.TextTitleLayout, d, List<? extends TextTitleLayoutVO>> {
    private final TextTitleLayoutVO toVo(BlackFridayStatusDTO.TextTitleLayout textTitleLayout, long j11) {
        ImageVO vo = ImageVOKt.toVo(textTitleLayout.getLeftImage());
        TextAtom title = textTitleLayout.getTitle();
        TextAtom subtitle = textTitleLayout.getSubtitle();
        StockBar stockBar = textTitleLayout.getStockBar();
        TimerWithTitleDTO timer = textTitleLayout.getTimer();
        TimerWithTitleVO vo2 = timer != null ? TimerWithTitleVOKt.toVo(timer) : null;
        ButtonWithTitle button = textTitleLayout.getButton();
        Map<String, TokenizedTrackingInfo> trackingInfo = textTitleLayout.getTrackingInfo();
        return new TextTitleLayoutVO(j11, vo, title, subtitle, stockBar, vo2, button, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<TextTitleLayoutVO> invoke(@NotNull BlackFridayStatusDTO.TextTitleLayout state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVo(state, widgetInfo.d().hashCode()));
    }
}
