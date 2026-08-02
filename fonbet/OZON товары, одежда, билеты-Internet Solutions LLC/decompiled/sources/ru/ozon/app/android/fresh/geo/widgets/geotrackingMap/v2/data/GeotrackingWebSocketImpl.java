package ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.data;

import Ae.C2399j;
import Ae.C2405m;
import Ae.InterfaceC2395h;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.domain.GeotrackingMessage;
import ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.domain.GeotrackingSocketEvent;
import ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.domain.GeotrackingWebSocket;
import ru.ozon.app.android.fresh.geo.widgets.orderStatus.v3.presentation.OrderStatusEnumVO;
import ru.ozon.app.android.network.websockets.OzonWebSocketFactory;
import ru.ozon.app.android.network.websockets.OzonWebSocketUrl;
import ru.ozon.app.android.network.websockets.SocketEvent;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0096@¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001eR\u0018\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001fR\u0018\u0010 \u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006#"}, d2 = {"Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/data/GeotrackingWebSocketImpl;", "Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/domain/GeotrackingWebSocket;", "Lru/ozon/app/android/network/websockets/OzonWebSocketFactory;", "ozonWebSocketFactory", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "<init>", "(Lru/ozon/app/android/network/websockets/OzonWebSocketFactory;Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)V", "Lru/ozon/app/android/network/websockets/SocketEvent$Message;", "socketMessage", "LAe/h;", "Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/domain/GeotrackingSocketEvent;", "mapSocketMessage", "(Lru/ozon/app/android/network/websockets/SocketEvent$Message;)LAe/h;", "Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/data/CourierLocation;", "current", "previous", "", "calculateDirection", "(Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/data/CourierLocation;Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/data/CourierLocation;)D", "", "connectionUrl", "eventFlow", "(Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "latitude", "longitude", "", "initCourierLocation", "(DD)V", "Lru/ozon/app/android/network/websockets/OzonWebSocketFactory;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "lastCourierLocation", "Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/data/CourierLocation;", "Companion", "widgets-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class GeotrackingWebSocketImpl implements GeotrackingWebSocket {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final JsonParser jsonDeserializer;
    private CourierLocation lastCourierLocation;

    @NotNull
    private final OzonWebSocketFactory ozonWebSocketFactory;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/data/GeotrackingWebSocketImpl$Companion;", "", "<init>", "()V", "ORDER_STATUS_FIELD", "", "COURIER_LOCATION_FIELD", "COURIER_DIRECTION_FIELD", "COURIER_MODIFICATION_TYPE_FIELD", "NEEDS_PAGE_REFRESH", "DEFAULT_DIRECTION_ANGLE", "", "widgets-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public GeotrackingWebSocketImpl(@NotNull OzonWebSocketFactory ozonWebSocketFactory, @NotNull JsonParser jsonDeserializer) {
        Intrinsics.checkNotNullParameter(ozonWebSocketFactory, "ozonWebSocketFactory");
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        this.ozonWebSocketFactory = ozonWebSocketFactory;
        this.jsonDeserializer = jsonDeserializer;
    }

    private final double calculateDirection(CourierLocation current, CourierLocation previous) {
        if (previous != null) {
            return (Math.toDegrees(Math.atan2(current.getLongitude() - previous.getLongitude(), current.getLatitude() - previous.getLatitude())) + 360.0d) % 360.0d;
        }
        return 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC2395h<GeotrackingSocketEvent> mapSocketMessage(SocketEvent.Message socketMessage) {
        String string;
        JSONObject json = socketMessage.getJson();
        String optString = json.optString("orderStatus");
        Intrinsics.checkNotNullExpressionValue(optString, "optString(...)");
        if (optString.length() > 0) {
            OrderStatusEnumVO.Companion companion = OrderStatusEnumVO.INSTANCE;
            String string2 = json.getString("orderStatus");
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return new C2405m(new GeotrackingSocketEvent.OnNewMessageReceived(new GeotrackingMessage.OrderStatus(companion.fromValue(string2))));
        }
        if (json.optJSONObject("courierLocation") == null) {
            return json.optBoolean("needsPageRefresh") ? new C2405m(new GeotrackingSocketEvent.OnNewMessageReceived(new GeotrackingMessage.NeedsPageRefresh(json.getBoolean("needsPageRefresh")))) : C2399j.t();
        }
        JsonParser jsonParser = this.jsonDeserializer;
        String string3 = json.getString("courierLocation");
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        CourierLocation courierLocation = (CourierLocation) jsonParser.fromJson(string3, CourierLocation.class);
        JSONObject jSONObject = json.has("direction") ? json : null;
        double calculateDirection = (jSONObject == null || (string = jSONObject.getString("direction")) == null) ? calculateDirection(courierLocation, this.lastCourierLocation) : ((Number) this.jsonDeserializer.fromJson(string, Double.TYPE)).doubleValue();
        if (!json.has("modificationType")) {
            json = null;
        }
        String string4 = json != null ? json.getString("modificationType") : null;
        this.lastCourierLocation = courierLocation;
        return new C2405m(new GeotrackingSocketEvent.OnNewMessageReceived(new GeotrackingMessage.CourierLocation(courierLocation.getLatitude(), courierLocation.getLongitude(), calculateDirection, string4)));
    }

    @Override // ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.domain.GeotrackingWebSocket
    public Object eventFlow(@NotNull final String str, @NotNull d<? super InterfaceC2395h<? extends GeotrackingSocketEvent>> dVar) {
        return C2399j.y(Fe.d.a(this.ozonWebSocketFactory.create(new OzonWebSocketUrl() { // from class: ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.data.GeotrackingWebSocketImpl$eventFlow$2
            @Override // ru.ozon.app.android.network.websockets.OzonWebSocketUrl
            public Map<String, String> getHeaders() {
                return OzonWebSocketUrl.DefaultImpls.getHeaders(this);
            }

            @Override // ru.ozon.app.android.network.websockets.OzonWebSocketUrl
            /* renamed from: getUrl, reason: from getter */
            public String get$connectionUrl() {
                return str;
            }
        }).getSocketEvents()), new GeotrackingWebSocketImpl$eventFlow$4(this, null));
    }

    @Override // ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.domain.GeotrackingWebSocket
    public void initCourierLocation(double latitude, double longitude) {
        this.lastCourierLocation = new CourierLocation(latitude, longitude);
    }
}
