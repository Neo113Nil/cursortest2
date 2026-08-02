package ru.ozon.app.android.fresh.geo.widgets.geotrackingBottomButton.presentation;

import Vg.d;
import W10.c;
import WZ.l;
import WZ.t;
import android.view.View;
import android.widget.LinearLayout;
import d20.AbstractC6064a;
import d20.InterfaceC6068e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.fresh.geo.R$id;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B5\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0018\u0010\u0005\u001a\u00060\u0003j\u0002`\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001dR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR \u0010\"\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00140 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/fresh/geo/widgets/geotrackingBottomButton/presentation/GeotrackingBottomButtonWidgetHolder;", "Ld20/a;", "Lru/ozon/app/android/fresh/geo/widgets/geotrackingBottomButton/presentation/GeotrackingBottomButtonVO;", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Ll10/i;", "container", "Ld20/e;", "Landroid/widget/LinearLayout;", "viewFactory", "<init>", "(LWZ/l;LVg/d;Ll10/i;Ld20/e;)V", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "getButton", "()Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "item", "", "bind", "(Lru/ozon/app/android/fresh/geo/widgets/geotrackingBottomButton/presentation/GeotrackingBottomButtonVO;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/fresh/geo/widgets/geotrackingBottomButton/presentation/GeotrackingBottomButtonVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "LWZ/l;", "button", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "widgets-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class GeotrackingBottomButtonWidgetHolder extends AbstractC6064a<GeotrackingBottomButtonVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;
    private ButtonV3View button;

    @NotNull
    private final l tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GeotrackingBottomButtonWidgetHolder(@NotNull l tokenizedAnalytics, @NotNull d customActionHandlersStoreFactory, @NotNull i container, @NotNull InterfaceC6068e<LinearLayout> viewFactory) {
        super(container, viewFactory);
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(viewFactory, "viewFactory");
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.actionHandler = new ActionHandler.Builder(container, this).customActionHandlers(new GeotrackingBottomButtonWidgetHolder$actionHandler$1(customActionHandlersStoreFactory)).buildHandler();
    }

    private final ButtonV3View getButton() {
        ButtonV3View buttonV3View = this.button;
        if (buttonV3View != null) {
            return buttonV3View;
        }
        View findViewById = getView().findViewById(R$id.geoBottomButtonId);
        ButtonV3View buttonV3View2 = (ButtonV3View) findViewById;
        this.button = buttonV3View2;
        Intrinsics.checkNotNullExpressionValue(findViewById, "also(...)");
        return buttonV3View2;
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull GeotrackingBottomButtonVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ButtonV3HolderKt.bindOrGone(getButton(), item.getButton(), this.actionHandler);
    }

    @Override // d20.AbstractC6065b
    public void trackView(@NotNull GeotrackingBottomButtonVO item, @NotNull c trackingData, @NotNull f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        Intrinsics.checkNotNullParameter(viewedPond, "viewedPond");
        super.trackView((GeotrackingBottomButtonWidgetHolder) item, trackingData, viewedPond);
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, tokenizedEvent, null, 2, null);
        }
    }
}
