package ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation;

import WZ.l;
import WZ.t;
import d20.AbstractC6065b;
import i10.h;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B9\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0012\u0010\r\u001a\u000e\u0012\u0002\b\u00030\u000bj\u0006\u0012\u0002\b\u0003`\f¢\u0006\u0004\b\u000e\u0010\u000fB1\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0012¢\u0006\u0004\b\u000e\u0010\u0014J\u0018\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u001cR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u001dR\u001a\u0010\b\u001a\u00060\u0006j\u0002`\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u001eR \u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010!R\u001c\u0010&\u001a\n\u0018\u00010\"j\u0004\u0018\u0001`#8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/FiltersRefreshActionHandler;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "widgetViewHolder", "<init>", "(Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;Lru/ozon/app/android/composer/throttle/HandlersInhibitor;Lru/ozon/composer/ui/widget/k;)V", "Ll10/i;", "container", "Ld20/b;", "overlayWidgetViewHolder", "(Ll10/i;LWZ/l;Lru/ozon/app/android/composer/throttle/HandlersInhibitor;Ld20/b;)V", "action", "invoke", "(Lru/ozon/uni/atoms/af/AtomAction;)V", "", "voId", "bind", "(J)V", "Ll10/i;", "Lru/ozon/app/android/composer/ComposerReferences;", "LWZ/l;", "defaultActionHandler", "Lkotlin/jvm/functions/Function1;", "Ljava/lang/Long;", "Ll10/b;", "Lru/ozon/app/android/composer/ComposerController;", "getController", "()Ll10/b;", "controller", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FiltersRefreshActionHandler implements Function1<AtomAction, Unit> {
    private ComposerReferences composerReferences;
    private i container;

    @NotNull
    private final Function1<AtomAction, Unit> defaultActionHandler;

    @NotNull
    private l tokenizedAnalytics;
    private Long voId;

    public FiltersRefreshActionHandler(@NotNull ComposerReferences composerReferences, @NotNull l tokenizedAnalytics, @NotNull HandlersInhibitor handlersInhibitor, @NotNull k<?> widgetViewHolder) {
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(handlersInhibitor, "handlersInhibitor");
        Intrinsics.checkNotNullParameter(widgetViewHolder, "widgetViewHolder");
        this.composerReferences = composerReferences;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.defaultActionHandler = new ActionHandler.Builder(composerReferences, widgetViewHolder).enableClickThrottling(handlersInhibitor).buildHandler();
    }

    private final InterfaceC7851b getController() {
        InterfaceC7851b controller;
        ComposerReferences composerReferences = this.composerReferences;
        if (composerReferences != null && (controller = composerReferences.getController()) != null) {
            return controller;
        }
        i iVar = this.container;
        if (iVar != null) {
            return iVar.M();
        }
        return null;
    }

    public final void bind(long voId) {
        this.voId = Long.valueOf(voId);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction atomAction) {
        invoke2(atomAction);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public void invoke2(@NotNull AtomAction action) {
        String link;
        t mapToTokenizedEvent$default;
        Intrinsics.checkNotNullParameter(action, "action");
        Unit unit = null;
        AtomAction.Refresh refresh = action instanceof AtomAction.Refresh ? (AtomAction.Refresh) action : null;
        if (refresh != null && (link = refresh.getLink()) != null) {
            InterfaceC7851b controller = getController();
            if (controller != null) {
                InterfaceC7851b.a.a(controller, link, null, null, new h.b(), 6);
            }
            Map<String, TokenizedTrackingInfo> trackingInfo = ((AtomAction.Refresh) action).getTrackingInfo();
            if (trackingInfo != null && (mapToTokenizedEvent$default = TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, this.voId, null, 2, null)) != null) {
                TokenizedAnalyticsExtensionsKt.processClickEvents$default(this.tokenizedAnalytics, mapToTokenizedEvent$default, null, 2, null);
                unit = Unit.f71690a;
            }
            if (unit != null) {
                return;
            }
        }
        this.defaultActionHandler.invoke(action);
    }

    public FiltersRefreshActionHandler(@NotNull i container, @NotNull l tokenizedAnalytics, @NotNull HandlersInhibitor handlersInhibitor, @NotNull AbstractC6065b<?> overlayWidgetViewHolder) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(handlersInhibitor, "handlersInhibitor");
        Intrinsics.checkNotNullParameter(overlayWidgetViewHolder, "overlayWidgetViewHolder");
        this.container = container;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.defaultActionHandler = new ActionHandler.Builder(container, overlayWidgetViewHolder).enableClickThrottling(handlersInhibitor).buildHandler();
    }
}
