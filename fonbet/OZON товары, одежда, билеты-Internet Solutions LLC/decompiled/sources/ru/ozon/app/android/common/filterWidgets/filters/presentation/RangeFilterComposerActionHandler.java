package ru.ozon.app.android.common.filterWidgets.filters.presentation;

import A00.a;
import B0.C2454a;
import UZ.a;
import UZ.d;
import WZ.e;
import WZ.g;
import WZ.t;
import android.net.Uri;
import com.google.android.gms.common.internal.ImagesContract;
import i10.h;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.RangeFilterComposerActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductContainerDTO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\b\u0000\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\r\u001a\u00020\f2\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001c¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filters/presentation/RangeFilterComposerActionHandler;", "", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "<init>", "(Lru/ozon/app/android/composer/ComposerReferences;)V", "", ImagesContract.URL, "", "params", "modifyUrl", "(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;", "LWZ/e;", "getDataModifier", "(Ljava/util/Map;)LWZ/e;", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "action", "originalUrl", "", "scrollWidgetKey", "scrollY", "", "handle", "(Lru/ozon/uni/atoms/af/AtomAction$Click;Ljava/lang/String;Ljava/lang/Integer;I)V", "", "voId", "trackClick", "(Lru/ozon/uni/atoms/af/AtomAction$Click;J)V", "Lru/ozon/app/android/composer/ComposerReferences;", "Companion", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class RangeFilterComposerActionHandler {

    @NotNull
    private final ComposerReferences refs;

    public RangeFilterComposerActionHandler(@NotNull ComposerReferences refs) {
        Intrinsics.checkNotNullParameter(refs, "refs");
        this.refs = refs;
    }

    private final e getDataModifier(final Map<String, String> params) {
        return new e() { // from class: Kq.b
            @Override // WZ.e
            public final g modifyParams(UZ.a aVar, g gVar) {
                g dataModifier$lambda$3;
                dataModifier$lambda$3 = RangeFilterComposerActionHandler.getDataModifier$lambda$3(params, (d) aVar, gVar);
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

    private final String modifyUrl(String url, Map<String, String> params) {
        String encode = Uri.encode((params != null ? params.get("fromValue") : null) + ";" + (params != null ? params.get("toValue") : null));
        Intrinsics.checkNotNullExpressionValue(encode, "encode(...)");
        return h.X(url, "{value}", encode, false);
    }

    public final void handle(@NotNull AtomAction.Click action, @NotNull String originalUrl, Integer scrollWidgetKey, int scrollY) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(originalUrl, "originalUrl");
        String link = action.getLink();
        if (link != null) {
            InterfaceC7851b.a.a(this.refs.getController(), modifyUrl(link, action.getParams()), C2454a.b("originalUrl", originalUrl), null, scrollWidgetKey != null ? new h.b(new a.C.d(scrollWidgetKey.intValue(), scrollY, 28, false), null, 2) : null, 4);
        }
    }

    public final void trackClick(@NotNull AtomAction.Click action, long voId) {
        t mapToTokenizedEvent$default;
        Intrinsics.checkNotNullParameter(action, "action");
        Map<String, TokenizedTrackingInfo> trackingInfo = action.getTrackingInfo();
        if (trackingInfo == null || (mapToTokenizedEvent$default = TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(voId), null, 2, null)) == null) {
            return;
        }
        TokenizedAnalyticsExtensionsKt.processNonViewEvents(this.refs.getTokenizedAnalytics(), mapToTokenizedEvent$default, getDataModifier(action.getParams()));
    }
}
