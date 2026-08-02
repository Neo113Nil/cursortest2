package ru.ozon.app.android.travel.feature.general.common.widgets.travelTextWithSubtitle.data;

import android.content.Context;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.common.widgets.travelTextWithSubtitle.presentation.TravelTextWithSubtitleVO;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ*\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000b\u001a\u00020\u00022\n\u0010\r\u001a\u00060\u0003j\u0002`\fH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/travelTextWithSubtitle/data/TravelTextWithSubtitleMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelTextWithSubtitle/data/TravelTextWithSubtitleDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelTextWithSubtitle/presentation/TravelTextWithSubtitleVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/general/common/widgets/travelTextWithSubtitle/data/TravelTextWithSubtitleDTO;Ll20/d;)Ljava/util/List;", "Landroid/content/Context;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelTextWithSubtitleMapper implements Function2<TravelTextWithSubtitleDTO, d, List<? extends TravelTextWithSubtitleVO>> {

    @NotNull
    private final Context context;

    public TravelTextWithSubtitleMapper(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<TravelTextWithSubtitleVO> invoke(@NotNull TravelTextWithSubtitleDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        TextAtom title = state.getTitle();
        TextAtom subtitle = state.getSubtitle();
        Integer offsetTop = state.getOffsetTop();
        int px = offsetTop != null ? ResourceExtKt.toPx(offsetTop.intValue(), this.context) : 0;
        Integer offsetBottom = state.getOffsetBottom();
        int px2 = offsetBottom != null ? ResourceExtKt.toPx(offsetBottom.intValue(), this.context) : 0;
        Integer offsetBetween = state.getOffsetBetween();
        int px3 = offsetBetween != null ? ResourceExtKt.toPx(offsetBetween.intValue(), this.context) : 0;
        Integer offsetHorizontal = state.getOffsetHorizontal();
        return C7714v.a0(new TravelTextWithSubtitleVO(hashCode, title, subtitle, px, px2, offsetHorizontal != null ? ResourceExtKt.toPx(offsetHorizontal.intValue(), this.context) : 0, px3, state.isCentered(), state.getBackgroundColor()));
    }
}
