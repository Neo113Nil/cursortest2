package ru.ozon.app.android.common.filterWidgets.filters.presentation;

import B0.C2454a;
import UZ.a;
import UZ.d;
import WZ.e;
import WZ.g;
import WZ.t;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.TimeRangeFilterCustomActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductContainerDTO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ%\u0010\u000e\u001a\u00020\r2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000b¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filters/presentation/TimeRangeFilterCustomActionHandler;", "", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "defaultActionHandler", "<init>", "(Lru/ozon/app/android/composer/ComposerReferences;Lkotlin/jvm/functions/Function1;)V", "", "", "params", "LWZ/e;", "getDataModifier", "(Ljava/util/Map;)LWZ/e;", "action", "", "widgetId", "originalUrl", "handle", "(Lru/ozon/uni/atoms/af/AtomAction;JLjava/lang/String;)V", "Lru/ozon/app/android/composer/ComposerReferences;", "Lkotlin/jvm/functions/Function1;", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TimeRangeFilterCustomActionHandler {

    @NotNull
    private final Function1<AtomAction, Unit> defaultActionHandler;

    @NotNull
    private final ComposerReferences references;

    /* JADX WARN: Multi-variable type inference failed */
    public TimeRangeFilterCustomActionHandler(@NotNull ComposerReferences references, @NotNull Function1<? super AtomAction, Unit> defaultActionHandler) {
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(defaultActionHandler, "defaultActionHandler");
        this.references = references;
        this.defaultActionHandler = defaultActionHandler;
    }

    private final e getDataModifier(final Map<String, String> params) {
        return new e() { // from class: Kq.c
            @Override // WZ.e
            public final g modifyParams(UZ.a aVar, g gVar) {
                g dataModifier$lambda$3;
                dataModifier$lambda$3 = TimeRangeFilterCustomActionHandler.getDataModifier$lambda$3(params, (d) aVar, gVar);
                return dataModifier$lambda$3;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g getDataModifier$lambda$3(Map map, a aVar, g customizedEventParams) {
        Intrinsics.checkNotNullParameter(aVar, "<unused var>");
        Intrinsics.checkNotNullParameter(customizedEventParams, "customizedEventParams");
        String str = map != null ? (String) map.get("fromValue") : null;
        String str2 = map != null ? (String) map.get("toValue") : null;
        Map<String, Object> b11 = customizedEventParams.b();
        if (b11 == null) {
            b11 = U.c();
        }
        LinkedHashMap u11 = U.u(b11);
        u11.put("filterValue", str + ProductContainerDTO.RATIO_DELIMITER + str2);
        return g.a(customizedEventParams, u11, null, 2);
    }

    public final void handle(@NotNull AtomAction action, long widgetId, @NotNull String originalUrl) {
        t mapToTokenizedEvent$default;
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(originalUrl, "originalUrl");
        if (!(action instanceof AtomAction.Click)) {
            this.defaultActionHandler.invoke(action);
            return;
        }
        AtomAction.Click click = (AtomAction.Click) action;
        String link = click.getLink();
        if (link != null) {
            InterfaceC7851b.a.a(this.references.getController(), link, C2454a.b("originalUrl", originalUrl), null, null, 12);
        }
        Map<String, TokenizedTrackingInfo> trackingInfo = click.getTrackingInfo();
        if (trackingInfo == null || (mapToTokenizedEvent$default = TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(widgetId), null, 2, null)) == null) {
            return;
        }
        TokenizedAnalyticsExtensionsKt.processNonViewEvents(this.references.getTokenizedAnalytics(), mapToTokenizedEvent$default, getDataModifier(click.getParams()));
    }
}
