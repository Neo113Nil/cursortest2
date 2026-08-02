package ru.ozon.app.android.travel.actionhandler.travelGetDirectionsActionHandler;

import Cm.e;
import Lm0.a;
import Pk0.g;
import android.net.Uri;
import com.squareup.moshi.j;
import java.io.IOException;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.navigation.LinkGenerator;
import ru.ozon.app.android.network.utils.UriExtKt;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0002\u0018\u0019B\u0015\b\u0007\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u0004\u0018\u00010\b*\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0016X\u0096D¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/actionhandler/travelGetDirectionsActionHandler/TravelGetDirectionsActionHandler;", "Lru/ozon/app/android/action/custom/CustomActionHandler;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "<init>", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)V", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "Lru/ozon/app/android/travel/actionhandler/travelGetDirectionsActionHandler/TravelGetDirectionsActionHandler$GetDirectionsInfoActionParams;", "getParamsFromBuildRouteRequest", "(Lru/ozon/uni/atoms/af/AtomAction$Click;)Lru/ozon/app/android/travel/actionhandler/travelGetDirectionsActionHandler/TravelGetDirectionsActionHandler$GetDirectionsInfoActionParams;", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;", "handlerRefs", "", "processAction", "(Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;)V", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "", "actionId", "Ljava/lang/String;", "getActionId", "()Ljava/lang/String;", "Companion", "GetDirectionsInfoActionParams", "actionhandler_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TravelGetDirectionsActionHandler extends CustomActionHandler {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final String actionId;

    @NotNull
    private final JsonParser jsonDeserializer;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/travel/actionhandler/travelGetDirectionsActionHandler/TravelGetDirectionsActionHandler$Companion;", "", "<init>", "()V", "BUILD_ROUTE_REQUEST_PARAMS_KEY", "", "INFO_PARAMS_KEY", "actionhandler_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public TravelGetDirectionsActionHandler(@NotNull JsonParser jsonDeserializer) {
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        this.jsonDeserializer = jsonDeserializer;
        this.actionId = "getDirections";
    }

    private final GetDirectionsInfoActionParams getParamsFromBuildRouteRequest(AtomAction.Click click) {
        String str;
        Map<String, String> params = click.getParams();
        if (params != null && (str = params.get("buildRouteRequest")) != null) {
            try {
                return (GetDirectionsInfoActionParams) this.jsonDeserializer.fromJson(str, GetDirectionsInfoActionParams.class);
            } catch (IOException e11) {
                a.f17149a.e(e11);
            }
        }
        return null;
    }

    @Override // Vg.f
    @NotNull
    public String getActionId() {
        return this.actionId;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0048 A[ORIG_RETURN, RETURN] */
    @Override // ru.ozon.app.android.action.custom.CustomActionHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void processAction(@NotNull AtomAction action, @NotNull CustomActionHandler.HandlerReferences handlerRefs) {
        Object obj;
        JsonParser jsonParser;
        Map<String, String> params;
        String str;
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(handlerRefs, "handlerRefs");
        if (action instanceof AtomAction.Click) {
            AtomAction.Click click = (AtomAction.Click) action;
            GetDirectionsInfoActionParams paramsFromBuildRouteRequest = getParamsFromBuildRouteRequest(click);
            if (paramsFromBuildRouteRequest == null) {
                try {
                    jsonParser = this.jsonDeserializer;
                    params = click.getParams();
                } catch (IOException e11) {
                    a.f17149a.e(e11);
                    obj = null;
                }
                if (params != null) {
                    String str2 = params.get("info");
                    if (str2 != null) {
                        str = UriExtKt.base64Decode(str2);
                        if (str == null) {
                        }
                        obj = jsonParser.fromJson(str, (Class<Object>) GetDirectionsInfoActionParams.class);
                        paramsFromBuildRouteRequest = (GetDirectionsInfoActionParams) obj;
                        if (paramsFromBuildRouteRequest == null) {
                            return;
                        }
                    }
                }
                str = "";
                obj = jsonParser.fromJson(str, (Class<Object>) GetDirectionsInfoActionParams.class);
                paramsFromBuildRouteRequest = (GetDirectionsInfoActionParams) obj;
                if (paramsFromBuildRouteRequest == null) {
                }
            }
            Uri mapSelector = LinkGenerator.INSTANCE.mapSelector(paramsFromBuildRouteRequest.getTitle(), paramsFromBuildRouteRequest.getLatitude(), paramsFromBuildRouteRequest.getLongitude());
            ComposerNavigator navigator = handlerRefs.getRefs().getNavigator();
            String uri = mapSelector.toString();
            Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
            ComposerNavigator.DefaultImpls.openDeeplink$default(navigator, uri, null, 2, null);
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/actionhandler/travelGetDirectionsActionHandler/TravelGetDirectionsActionHandler$GetDirectionsInfoActionParams;", "", "latitude", "", "longitude", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "<init>", "(DDLjava/lang/String;)V", "getLatitude", "()D", "getLongitude", "getTitle", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "actionhandler_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final /* data */ class GetDirectionsInfoActionParams {
        private final double latitude;
        private final double longitude;

        @NotNull
        private final String title;

        public GetDirectionsInfoActionParams(double d11, double d12, @NotNull String title) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.latitude = d11;
            this.longitude = d12;
            this.title = title;
        }

        public static /* synthetic */ GetDirectionsInfoActionParams copy$default(GetDirectionsInfoActionParams getDirectionsInfoActionParams, double d11, double d12, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                d11 = getDirectionsInfoActionParams.latitude;
            }
            double d13 = d11;
            if ((i11 & 2) != 0) {
                d12 = getDirectionsInfoActionParams.longitude;
            }
            double d14 = d12;
            if ((i11 & 4) != 0) {
                str = getDirectionsInfoActionParams.title;
            }
            return getDirectionsInfoActionParams.copy(d13, d14, str);
        }

        /* renamed from: component1, reason: from getter */
        public final double getLatitude() {
            return this.latitude;
        }

        /* renamed from: component2, reason: from getter */
        public final double getLongitude() {
            return this.longitude;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        public final GetDirectionsInfoActionParams copy(double latitude, double longitude, @NotNull String title) {
            Intrinsics.checkNotNullParameter(title, "title");
            return new GetDirectionsInfoActionParams(latitude, longitude, title);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GetDirectionsInfoActionParams)) {
                return false;
            }
            GetDirectionsInfoActionParams getDirectionsInfoActionParams = (GetDirectionsInfoActionParams) other;
            return Double.compare(this.latitude, getDirectionsInfoActionParams.latitude) == 0 && Double.compare(this.longitude, getDirectionsInfoActionParams.longitude) == 0 && Intrinsics.d(this.title, getDirectionsInfoActionParams.title);
        }

        public final double getLatitude() {
            return this.latitude;
        }

        public final double getLongitude() {
            return this.longitude;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.title.hashCode() + g.a(Double.hashCode(this.latitude) * 31, 31, this.longitude);
        }

        @NotNull
        public String toString() {
            double d11 = this.latitude;
            double d12 = this.longitude;
            String str = this.title;
            StringBuilder e11 = e.e(d11, "GetDirectionsInfoActionParams(latitude=", ", longitude=");
            e11.append(d12);
            e11.append(", title=");
            e11.append(str);
            e11.append(")");
            return e11.toString();
        }

        public /* synthetic */ GetDirectionsInfoActionParams(double d11, double d12, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(d11, d12, (i11 & 4) != 0 ? "" : str);
        }
    }
}
