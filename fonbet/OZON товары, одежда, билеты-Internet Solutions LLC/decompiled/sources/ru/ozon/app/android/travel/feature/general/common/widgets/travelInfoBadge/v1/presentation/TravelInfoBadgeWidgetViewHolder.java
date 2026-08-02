package ru.ozon.app.android.travel.feature.general.common.widgets.travelInfoBadge.v1.presentation;

import W10.c;
import WZ.l;
import WZ.t;
import android.content.Context;
import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.travel.molecules.view.infoBadge.InfoBadgeView;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B#\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\u0010\n\u001a\u00060\bj\u0002`\t¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u00022\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000fH\u0014¢\u0006\u0004\b\u0012\u0010\u0013J3\u0010\u001a\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u00022\n\u0010\u0016\u001a\u00060\u0014j\u0002`\u00152\u000e\u0010\u0019\u001a\n\u0018\u00010\u0017j\u0004\u0018\u0001`\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0018\u0010\n\u001a\u00060\bj\u0002`\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001cR \u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00110\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010\"\u001a\u0004\u0018\u00010!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/travelInfoBadge/v1/presentation/TravelInfoBadgeWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelInfoBadge/v1/presentation/TravelInfoBadgeVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "bind", "(Lru/ozon/app/android/travel/feature/general/common/widgets/travelInfoBadge/v1/presentation/TravelInfoBadgeVO;Ll20/d;)V", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/travel/feature/general/common/widgets/travelInfoBadge/v1/presentation/TravelInfoBadgeVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "LWZ/l;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/travel/molecules/view/infoBadge/InfoBadgeView;", "infoBadgeView", "Lru/ozon/app/android/travel/molecules/view/infoBadge/InfoBadgeView;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelInfoBadgeWidgetViewHolder extends k<TravelInfoBadgeVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;
    private final InfoBadgeView infoBadgeView;

    @NotNull
    private final l tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelInfoBadgeWidgetViewHolder(@NotNull View containerView, @NotNull ComposerReferences references, @NotNull l tokenizedAnalytics) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.actionHandler = new ActionHandler.Builder(references, this).buildHandler();
        InfoBadgeView infoBadgeView = null;
        InfoBadgeView infoBadgeView2 = containerView instanceof InfoBadgeView ? (InfoBadgeView) containerView : null;
        if (infoBadgeView2 != null) {
            Context context = infoBadgeView2.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            int px = UiExtKt.toPx(20, context);
            Context context2 = infoBadgeView2.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            int px2 = UiExtKt.toPx(16, context2);
            Context context3 = infoBadgeView2.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            int px3 = UiExtKt.toPx(12, context3);
            Context context4 = infoBadgeView2.getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
            infoBadgeView2.setWrapper(ThemeExtKt.themeColor(context4, R$attr.layerFloor1), Integer.valueOf(px3), Integer.valueOf(px2), Integer.valueOf(px3), Integer.valueOf(px3));
            infoBadgeView2.setPadding(px2, px, px2, px);
            infoBadgeView2.setIconSize(24);
            infoBadgeView2.setTextStartMargin(8);
            infoBadgeView = infoBadgeView2;
        }
        this.infoBadgeView = infoBadgeView;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull TravelInfoBadgeVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        InfoBadgeView infoBadgeView = this.infoBadgeView;
        if (infoBadgeView != null) {
            infoBadgeView.bind(item.getInfoBadge(), this.actionHandler);
        }
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull TravelInfoBadgeVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((TravelInfoBadgeWidgetViewHolder) item, trackingData, viewedPond);
        t viewEvent = item.getViewEvent();
        if (viewEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, viewEvent, null, 2, null);
        }
    }
}
