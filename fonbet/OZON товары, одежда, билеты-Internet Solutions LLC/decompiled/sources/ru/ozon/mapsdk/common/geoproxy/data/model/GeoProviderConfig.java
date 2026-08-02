package ru.ozon.mapsdk.common.geoproxy.data.model;

import B0.C2454a;
import J8.b;
import N3.C3660k;
import V.e;
import Xc.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.Gson;
import he0.C6943a;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.mapsdk.common.geoproxy.data.model.GeoProviderConfig;
import spay.sdk.domain.model.FraudMonInfo;
import te0.C9867b;
import ue0.C10044a;
import ue0.InterfaceC10046c;
import we0.C10543B;
import we0.m;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\"\b\u0086\b\u0018\u0000 q2\u00020\u0001:\u0004qrstBç\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\tH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\tH\u0016¢\u0006\u0004\b\"\u0010#J\u0015\u0010&\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010$¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u0004\u0018\u00010(¢\u0006\u0004\b)\u0010*J\u0015\u0010,\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010$¢\u0006\u0004\b,\u0010'J\u0015\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010$¢\u0006\u0004\b-\u0010'J\u0015\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010$¢\u0006\u0004\b.\u0010'J\u0015\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010$¢\u0006\u0004\b/\u0010'J\u0012\u00100\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b0\u00101J\u0012\u00102\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b2\u00101J\u0012\u00103\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b3\u00104J\u0012\u00105\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b5\u00104J\u0012\u00106\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b6\u00101J\u0012\u00107\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b7\u00108J\u0012\u00109\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b9\u00101J\u0012\u0010:\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b:\u00101J\u0012\u0010;\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b;\u00101J\u0012\u0010=\u001a\u0004\u0018\u00010\u0002HÀ\u0003¢\u0006\u0004\b<\u00101J\u0012\u0010?\u001a\u0004\u0018\u00010\u0002HÀ\u0003¢\u0006\u0004\b>\u00101J\u0012\u0010A\u001a\u0004\u0018\u00010\u0002HÀ\u0003¢\u0006\u0004\b@\u00101J\u0012\u0010C\u001a\u0004\u0018\u00010\u0002HÀ\u0003¢\u0006\u0004\bB\u00101J\u0012\u0010E\u001a\u0004\u0018\u00010\u0002HÀ\u0003¢\u0006\u0004\bD\u00101J\u0012\u0010F\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bF\u00101J\u0012\u0010G\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\bG\u0010HJ\u0012\u0010I\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bI\u00101J\u0012\u0010J\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bJ\u00101J\u0010\u0010K\u001a\u00020\u0018HÆ\u0003¢\u0006\u0004\bK\u0010LJò\u0001\u0010M\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u0018HÆ\u0001¢\u0006\u0004\bM\u0010NJ\u0010\u0010O\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bO\u00101J\u0010\u0010P\u001a\u00020\tHÖ\u0001¢\u0006\u0004\bP\u0010#J\u001a\u0010T\u001a\u00020S2\b\u0010R\u001a\u0004\u0018\u00010QHÖ\u0003¢\u0006\u0004\bT\u0010UJ!\u0010W\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010$2\b\u0010V\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\bW\u0010XR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010Y\u001a\u0004\bZ\u00101R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010Y\u001a\u0004\b[\u00101R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\\\u001a\u0004\b]\u00104R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\\\u001a\u0004\b^\u00104R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010Y\u001a\u0004\b_\u00101R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010`\u001a\u0004\ba\u00108R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010Y\u001a\u0004\bb\u00101R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010Y\u001a\u0004\bc\u00101R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010Y\u001a\u0004\bd\u00101R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010Y\u001a\u0004\be\u00101R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010Y\u001a\u0004\bf\u00101R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010Y\u001a\u0004\bg\u00101R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010Y\u001a\u0004\bh\u00101R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010Y\u001a\u0004\bi\u00101R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010Y\u001a\u0004\bj\u00101R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010k\u001a\u0004\bl\u0010HR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010Y\u001a\u0004\bm\u00101R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010Y\u001a\u0004\bn\u00101R\u001a\u0010\u0019\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010o\u001a\u0004\bp\u0010L¨\u0006u"}, d2 = {"Lru/ozon/mapsdk/common/geoproxy/data/model/GeoProviderConfig;", "Landroid/os/Parcelable;", "", "logo", "logoMobile", "", "maxZoom", "minZoom", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "tileSize", "tileUrl", "key", "mode", "suggestPreferredProvider", "geocodePreferredProvider", "revGeocodePreferredProvider", "allowedLocations", "copyrights", "features", "Lru/ozon/mapsdk/common/geoproxy/data/model/GeoProviderConfig$ProviderSuggest;", "suggest", "suggestProvider", "locale", "Lru/ozon/mapsdk/common/geoproxy/data/model/GeoProviderConfig$SdkType;", "sdkType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/mapsdk/common/geoproxy/data/model/GeoProviderConfig$ProviderSuggest;Ljava/lang/String;Ljava/lang/String;Lru/ozon/mapsdk/common/geoproxy/data/model/GeoProviderConfig$SdkType;)V", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "Lru/ozon/mapsdk/common/geoproxy/data/model/GeoProviderConfig$Copyright;", "parseCopyrights", "()Ljava/util/List;", "Lru/ozon/mapsdk/common/geoproxy/data/model/VectorData;", "parseVector", "()Lru/ozon/mapsdk/common/geoproxy/data/model/VectorData;", "Lwe0/B;", "parseAllowedLocation", "parseSuggestPreferredProvider", "parseGeocodePreferredProvider", "parseRevGeocodePreferredProvider", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Double;", "component4", "component5", "component6", "()Ljava/lang/Integer;", "component7", "component8", "component9", "component10$mapsdk_fullFirebaseOpenglRelease", "component10", "component11$mapsdk_fullFirebaseOpenglRelease", "component11", "component12$mapsdk_fullFirebaseOpenglRelease", "component12", "component13$mapsdk_fullFirebaseOpenglRelease", "component13", "component14$mapsdk_fullFirebaseOpenglRelease", "component14", "component15", "component16", "()Lru/ozon/mapsdk/common/geoproxy/data/model/GeoProviderConfig$ProviderSuggest;", "component17", "component18", "component19", "()Lru/ozon/mapsdk/common/geoproxy/data/model/GeoProviderConfig$SdkType;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/mapsdk/common/geoproxy/data/model/GeoProviderConfig$ProviderSuggest;Ljava/lang/String;Ljava/lang/String;Lru/ozon/mapsdk/common/geoproxy/data/model/GeoProviderConfig$SdkType;)Lru/ozon/mapsdk/common/geoproxy/data/model/GeoProviderConfig;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "json", "parseStringList", "(Ljava/lang/String;)Ljava/util/List;", "Ljava/lang/String;", "getLogo", "getLogoMobile", "Ljava/lang/Double;", "getMaxZoom", "getMinZoom", "getName", "Ljava/lang/Integer;", "getTileSize", "getTileUrl", "getKey", "getMode", "getSuggestPreferredProvider$mapsdk_fullFirebaseOpenglRelease", "getGeocodePreferredProvider$mapsdk_fullFirebaseOpenglRelease", "getRevGeocodePreferredProvider$mapsdk_fullFirebaseOpenglRelease", "getAllowedLocations$mapsdk_fullFirebaseOpenglRelease", "getCopyrights$mapsdk_fullFirebaseOpenglRelease", "getFeatures", "Lru/ozon/mapsdk/common/geoproxy/data/model/GeoProviderConfig$ProviderSuggest;", "getSuggest", "getSuggestProvider", "getLocale", "Lru/ozon/mapsdk/common/geoproxy/data/model/GeoProviderConfig$SdkType;", "getSdkType", "CREATOR", "SdkType", "ProviderSuggest", "Copyright", "mapsdk_fullFirebaseOpenglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class GeoProviderConfig implements Parcelable {

    /* renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final GeoProviderConfig defaultLibre;

    @NotNull
    private static final GeoProviderConfig defaultYandex;
    private final String allowedLocations;
    private final String copyrights;
    private final String features;
    private final String geocodePreferredProvider;
    private final String key;
    private final String locale;
    private final String logo;
    private final String logoMobile;
    private final Double maxZoom;
    private final Double minZoom;
    private final String mode;
    private final String name;
    private final String revGeocodePreferredProvider;

    @b("sdk")
    @NotNull
    private final SdkType sdkType;
    private final ProviderSuggest suggest;
    private final String suggestPreferredProvider;
    private final String suggestProvider;
    private final Integer tileSize;
    private final String tileUrl;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\fR\u0011\u0010\r\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u0012"}, d2 = {"Lru/ozon/mapsdk/common/geoproxy/data/model/GeoProviderConfig$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lru/ozon/mapsdk/common/geoproxy/data/model/GeoProviderConfig;", "<init>", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lru/ozon/mapsdk/common/geoproxy/data/model/GeoProviderConfig;", "defaultYandex", "getDefaultYandex", "()Lru/ozon/mapsdk/common/geoproxy/data/model/GeoProviderConfig;", "defaultLibre", "getDefaultLibre", "mapsdk_fullFirebaseOpenglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.mapsdk.common.geoproxy.data.model.GeoProviderConfig$CREATOR, reason: from kotlin metadata */
    public static final class Companion implements Parcelable.Creator<GeoProviderConfig> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final GeoProviderConfig getDefaultLibre() {
            return GeoProviderConfig.defaultLibre;
        }

        @NotNull
        public final GeoProviderConfig getDefaultYandex() {
            return GeoProviderConfig.defaultYandex;
        }

        private Companion() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public GeoProviderConfig createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Gson a11 = C6943a.a();
            String readString = parcel.readString();
            Intrinsics.f(readString);
            Object d11 = a11.d(readString, GeoProviderConfig.class);
            Intrinsics.checkNotNullExpressionValue(d11, "fromJson(...)");
            return (GeoProviderConfig) d11;
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public GeoProviderConfig[] newArray(int size) {
            return new GeoProviderConfig[size];
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/mapsdk/common/geoproxy/data/model/GeoProviderConfig$Copyright;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", ImagesContract.URL, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getUrl", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "mapsdk_fullFirebaseOpenglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class Copyright {

        @NotNull
        private final String title;

        @NotNull
        private final String url;

        public Copyright(@NotNull String title, @NotNull String url) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(url, "url");
            this.title = title;
            this.url = url;
        }

        public static /* synthetic */ Copyright copy$default(Copyright copyright, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = copyright.title;
            }
            if ((i11 & 2) != 0) {
                str2 = copyright.url;
            }
            return copyright.copy(str, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        @NotNull
        public final Copyright copy(@NotNull String title, @NotNull String url) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(url, "url");
            return new Copyright(title, url);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Copyright)) {
                return false;
            }
            Copyright copyright = (Copyright) other;
            return Intrinsics.d(this.title, copyright.title) && Intrinsics.d(this.url, copyright.url);
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return this.url.hashCode() + (this.title.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return e.a("Copyright(title=", this.title, ", url=", this.url, ")");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/ozon/mapsdk/common/geoproxy/data/model/GeoProviderConfig$ProviderSuggest;", "", "<init>", "(Ljava/lang/String;I)V", "BACKEND", "mapsdk_fullFirebaseOpenglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ProviderSuggest {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ ProviderSuggest[] $VALUES;
        public static final ProviderSuggest BACKEND = new ProviderSuggest("BACKEND", 0);

        private static final /* synthetic */ ProviderSuggest[] $values() {
            return new ProviderSuggest[]{BACKEND};
        }

        static {
            ProviderSuggest[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Xc.b.a($values);
        }

        private ProviderSuggest(String str, int i11) {
        }

        @NotNull
        public static a<ProviderSuggest> getEntries() {
            return $ENTRIES;
        }

        public static ProviderSuggest valueOf(String str) {
            return (ProviderSuggest) Enum.valueOf(ProviderSuggest.class, str);
        }

        public static ProviderSuggest[] values() {
            return (ProviderSuggest[]) $VALUES.clone();
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b&\u0018\u0000 \u00132\u00020\u0001:\u0004\u0013\u0014\u0015\u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tH\u0016J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0010J\u0006\u0010\u0012\u001a\u00020\u0010R\u0012\u0010\u0004\u001a\u00020\u0005X \u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, d2 = {"Lru/ozon/mapsdk/common/geoproxy/data/model/GeoProviderConfig$SdkType;", "Landroid/os/Parcelable;", "<init>", "()V", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "getName$mapsdk_fullFirebaseOpenglRelease", "()Ljava/lang/String;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "isYandex", "", "isMapLibre", "isFallback", "Companion", "Yandex", "MapLibre", "Unknown", "mapsdk_fullFirebaseOpenglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class SdkType implements Parcelable {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        public static final Parcelable.Creator<SdkType> CREATOR = new Parcelable.Creator<SdkType>() { // from class: ru.ozon.mapsdk.common.geoproxy.data.model.GeoProviderConfig$SdkType$Companion$CREATOR$1
            @Override // android.os.Parcelable.Creator
            public GeoProviderConfig.SdkType createFromParcel(Parcel source) {
                Intrinsics.checkNotNullParameter(source, "source");
                Gson a11 = C6943a.a();
                String readString = source.readString();
                Intrinsics.f(readString);
                return (GeoProviderConfig.SdkType) a11.d(readString, GeoProviderConfig.SdkType.class);
            }

            @Override // android.os.Parcelable.Creator
            public GeoProviderConfig.SdkType[] newArray(int size) {
                return new GeoProviderConfig.SdkType[size];
            }
        };

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tR\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/ozon/mapsdk/common/geoproxy/data/model/GeoProviderConfig$SdkType$Companion;", "", "<init>", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lru/ozon/mapsdk/common/geoproxy/data/model/GeoProviderConfig$SdkType;", "fromName", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "mapsdk_fullFirebaseOpenglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final SdkType fromName(@NotNull String name) {
                Intrinsics.checkNotNullParameter(name, "name");
                GeoProviderConfig$SdkType$Companion$fromName$select$1 geoProviderConfig$SdkType$Companion$fromName$select$1 = GeoProviderConfig$SdkType$Companion$fromName$select$1.INSTANCE;
                SdkType invoke = geoProviderConfig$SdkType$Companion$fromName$select$1.invoke((GeoProviderConfig$SdkType$Companion$fromName$select$1) name);
                if (invoke != null) {
                    return invoke;
                }
                String upperCase = name.toUpperCase();
                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                SdkType invoke2 = geoProviderConfig$SdkType$Companion$fromName$select$1.invoke((GeoProviderConfig$SdkType$Companion$fromName$select$1) upperCase);
                return invoke2 == null ? Unknown.INSTANCE : invoke2;
            }

            private Companion() {
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0090D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lru/ozon/mapsdk/common/geoproxy/data/model/GeoProviderConfig$SdkType$MapLibre;", "Lru/ozon/mapsdk/common/geoproxy/data/model/GeoProviderConfig$SdkType;", "<init>", "()V", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "getName$mapsdk_fullFirebaseOpenglRelease", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "toString", "mapsdk_fullFirebaseOpenglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class MapLibre extends SdkType {

            @NotNull
            public static final MapLibre INSTANCE = new MapLibre();

            @NotNull
            private static final String name = "MAPS";

            private MapLibre() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof MapLibre);
            }

            @Override // ru.ozon.mapsdk.common.geoproxy.data.model.GeoProviderConfig.SdkType
            @NotNull
            public String getName$mapsdk_fullFirebaseOpenglRelease() {
                return name;
            }

            public int hashCode() {
                return -1977417756;
            }

            @NotNull
            public String toString() {
                return "MapLibre";
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0090D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lru/ozon/mapsdk/common/geoproxy/data/model/GeoProviderConfig$SdkType$Unknown;", "Lru/ozon/mapsdk/common/geoproxy/data/model/GeoProviderConfig$SdkType;", "<init>", "()V", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "getName$mapsdk_fullFirebaseOpenglRelease", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "toString", "mapsdk_fullFirebaseOpenglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Unknown extends SdkType {

            @NotNull
            public static final Unknown INSTANCE = new Unknown();

            @NotNull
            private static final String name = FraudMonInfo.UNKNOWN;

            private Unknown() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Unknown);
            }

            @Override // ru.ozon.mapsdk.common.geoproxy.data.model.GeoProviderConfig.SdkType
            @NotNull
            public String getName$mapsdk_fullFirebaseOpenglRelease() {
                return name;
            }

            public int hashCode() {
                return 754550498;
            }

            @NotNull
            public String toString() {
                return "Unknown";
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0090D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lru/ozon/mapsdk/common/geoproxy/data/model/GeoProviderConfig$SdkType$Yandex;", "Lru/ozon/mapsdk/common/geoproxy/data/model/GeoProviderConfig$SdkType;", "<init>", "()V", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "getName$mapsdk_fullFirebaseOpenglRelease", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "toString", "mapsdk_fullFirebaseOpenglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Yandex extends SdkType {

            @NotNull
            public static final Yandex INSTANCE = new Yandex();

            @NotNull
            private static final String name = "YANDEX";

            private Yandex() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Yandex);
            }

            @Override // ru.ozon.mapsdk.common.geoproxy.data.model.GeoProviderConfig.SdkType
            @NotNull
            public String getName$mapsdk_fullFirebaseOpenglRelease() {
                return name;
            }

            public int hashCode() {
                return 1096761945;
            }

            @NotNull
            public String toString() {
                return "Yandex";
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @NotNull
        public abstract String getName$mapsdk_fullFirebaseOpenglRelease();

        public final boolean isFallback() {
            return equals(Unknown.INSTANCE);
        }

        public final boolean isMapLibre() {
            return equals(MapLibre.INSTANCE);
        }

        public final boolean isYandex() {
            return equals(Yandex.INSTANCE);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(C6943a.a().l(this, SdkType.class));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        defaultYandex = new GeoProviderConfig(null, str, null, null, "Yandex default", null, null, str2, str3, str4, str5, str6, str7, str8, null, null, null, str9, SdkType.Yandex.INSTANCE, 262127, null);
        SdkType.MapLibre mapLibre = SdkType.MapLibre.INSTANCE;
        defaultLibre = new GeoProviderConfig(str, "https://st.ozone.ru/s3/maps-sdk-static/logo/ozon-logo.png", Double.valueOf(19.0d), Double.valueOf(2.0d), "Libre default", 256, str2, str3, str4, str5, str6, str7, str8, "[{\"title\": \"© Ozon\", \"url\": \"https://docs.ozon.ru/legal/terms-of-use/site/maps\"}]", "{\n    \"vector\": {\n        \"newFields\": {\n            \"maxZoom\": \"20\",\n            \"minZoom\": \"1\",\n            \"sdk\": \"maplibre\",\n            \"tileSize\": \"512\",\n            \"tileUrl\": \"https://cdn1.ozone.ru/vtiles/tile/{z}/{x}/{y}.pp.pbf\",\n            \"styleUrl\": \"https://st.ozone.ru/s3/maps-sdk-static/vector-style-prod-3d-v0.0.0.json\"\n        }\n    }\n}", null == true ? 1 : 0, str9, null, mapLibre, 237441, null);
    }

    public GeoProviderConfig(String str, String str2, Double d11, Double d12, String str3, Integer num, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, ProviderSuggest providerSuggest, String str13, String str14, @NotNull SdkType sdkType) {
        Intrinsics.checkNotNullParameter(sdkType, "sdkType");
        this.logo = str;
        this.logoMobile = str2;
        this.maxZoom = d11;
        this.minZoom = d12;
        this.name = str3;
        this.tileSize = num;
        this.tileUrl = str4;
        this.key = str5;
        this.mode = str6;
        this.suggestPreferredProvider = str7;
        this.geocodePreferredProvider = str8;
        this.revGeocodePreferredProvider = str9;
        this.allowedLocations = str10;
        this.copyrights = str11;
        this.features = str12;
        this.suggest = providerSuggest;
        this.suggestProvider = str13;
        this.locale = str14;
        this.sdkType = sdkType;
    }

    public static /* synthetic */ GeoProviderConfig copy$default(GeoProviderConfig geoProviderConfig, String str, String str2, Double d11, Double d12, String str3, Integer num, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, ProviderSuggest providerSuggest, String str13, String str14, SdkType sdkType, int i11, Object obj) {
        SdkType sdkType2;
        String str15;
        String str16 = (i11 & 1) != 0 ? geoProviderConfig.logo : str;
        String str17 = (i11 & 2) != 0 ? geoProviderConfig.logoMobile : str2;
        Double d13 = (i11 & 4) != 0 ? geoProviderConfig.maxZoom : d11;
        Double d14 = (i11 & 8) != 0 ? geoProviderConfig.minZoom : d12;
        String str18 = (i11 & 16) != 0 ? geoProviderConfig.name : str3;
        Integer num2 = (i11 & 32) != 0 ? geoProviderConfig.tileSize : num;
        String str19 = (i11 & 64) != 0 ? geoProviderConfig.tileUrl : str4;
        String str20 = (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? geoProviderConfig.key : str5;
        String str21 = (i11 & 256) != 0 ? geoProviderConfig.mode : str6;
        String str22 = (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? geoProviderConfig.suggestPreferredProvider : str7;
        String str23 = (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? geoProviderConfig.geocodePreferredProvider : str8;
        String str24 = (i11 & 2048) != 0 ? geoProviderConfig.revGeocodePreferredProvider : str9;
        String str25 = (i11 & 4096) != 0 ? geoProviderConfig.allowedLocations : str10;
        String str26 = (i11 & 8192) != 0 ? geoProviderConfig.copyrights : str11;
        String str27 = str16;
        String str28 = (i11 & 16384) != 0 ? geoProviderConfig.features : str12;
        ProviderSuggest providerSuggest2 = (i11 & 32768) != 0 ? geoProviderConfig.suggest : providerSuggest;
        String str29 = (i11 & 65536) != 0 ? geoProviderConfig.suggestProvider : str13;
        String str30 = (i11 & 131072) != 0 ? geoProviderConfig.locale : str14;
        if ((i11 & 262144) != 0) {
            str15 = str30;
            sdkType2 = geoProviderConfig.sdkType;
        } else {
            sdkType2 = sdkType;
            str15 = str30;
        }
        return geoProviderConfig.copy(str27, str17, d13, d14, str18, num2, str19, str20, str21, str22, str23, str24, str25, str26, str28, providerSuggest2, str29, str15, sdkType2);
    }

    private final List<String> parseStringList(String json) {
        if (json == null) {
            return null;
        }
        Type type = new com.google.gson.reflect.a<List<? extends String>>() { // from class: ru.ozon.mapsdk.common.geoproxy.data.model.GeoProviderConfig$parseStringList$type$1
        }.getType();
        Gson a11 = C6943a.a();
        a11.getClass();
        return (List) a11.c(new StringReader(json), com.google.gson.reflect.a.get(type));
    }

    /* renamed from: component1, reason: from getter */
    public final String getLogo() {
        return this.logo;
    }

    /* renamed from: component10$mapsdk_fullFirebaseOpenglRelease, reason: from getter */
    public final String getSuggestPreferredProvider() {
        return this.suggestPreferredProvider;
    }

    /* renamed from: component11$mapsdk_fullFirebaseOpenglRelease, reason: from getter */
    public final String getGeocodePreferredProvider() {
        return this.geocodePreferredProvider;
    }

    /* renamed from: component12$mapsdk_fullFirebaseOpenglRelease, reason: from getter */
    public final String getRevGeocodePreferredProvider() {
        return this.revGeocodePreferredProvider;
    }

    /* renamed from: component13$mapsdk_fullFirebaseOpenglRelease, reason: from getter */
    public final String getAllowedLocations() {
        return this.allowedLocations;
    }

    /* renamed from: component14$mapsdk_fullFirebaseOpenglRelease, reason: from getter */
    public final String getCopyrights() {
        return this.copyrights;
    }

    /* renamed from: component15, reason: from getter */
    public final String getFeatures() {
        return this.features;
    }

    /* renamed from: component16, reason: from getter */
    public final ProviderSuggest getSuggest() {
        return this.suggest;
    }

    /* renamed from: component17, reason: from getter */
    public final String getSuggestProvider() {
        return this.suggestProvider;
    }

    /* renamed from: component18, reason: from getter */
    public final String getLocale() {
        return this.locale;
    }

    @NotNull
    /* renamed from: component19, reason: from getter */
    public final SdkType getSdkType() {
        return this.sdkType;
    }

    /* renamed from: component2, reason: from getter */
    public final String getLogoMobile() {
        return this.logoMobile;
    }

    /* renamed from: component3, reason: from getter */
    public final Double getMaxZoom() {
        return this.maxZoom;
    }

    /* renamed from: component4, reason: from getter */
    public final Double getMinZoom() {
        return this.minZoom;
    }

    /* renamed from: component5, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component6, reason: from getter */
    public final Integer getTileSize() {
        return this.tileSize;
    }

    /* renamed from: component7, reason: from getter */
    public final String getTileUrl() {
        return this.tileUrl;
    }

    /* renamed from: component8, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* renamed from: component9, reason: from getter */
    public final String getMode() {
        return this.mode;
    }

    @NotNull
    public final GeoProviderConfig copy(String logo, String logoMobile, Double maxZoom, Double minZoom, String name, Integer tileSize, String tileUrl, String key, String mode, String suggestPreferredProvider, String geocodePreferredProvider, String revGeocodePreferredProvider, String allowedLocations, String copyrights, String features, ProviderSuggest suggest, String suggestProvider, String locale, @NotNull SdkType sdkType) {
        Intrinsics.checkNotNullParameter(sdkType, "sdkType");
        return new GeoProviderConfig(logo, logoMobile, maxZoom, minZoom, name, tileSize, tileUrl, key, mode, suggestPreferredProvider, geocodePreferredProvider, revGeocodePreferredProvider, allowedLocations, copyrights, features, suggest, suggestProvider, locale, sdkType);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GeoProviderConfig)) {
            return false;
        }
        GeoProviderConfig geoProviderConfig = (GeoProviderConfig) other;
        return Intrinsics.d(this.logo, geoProviderConfig.logo) && Intrinsics.d(this.logoMobile, geoProviderConfig.logoMobile) && Intrinsics.d(this.maxZoom, geoProviderConfig.maxZoom) && Intrinsics.d(this.minZoom, geoProviderConfig.minZoom) && Intrinsics.d(this.name, geoProviderConfig.name) && Intrinsics.d(this.tileSize, geoProviderConfig.tileSize) && Intrinsics.d(this.tileUrl, geoProviderConfig.tileUrl) && Intrinsics.d(this.key, geoProviderConfig.key) && Intrinsics.d(this.mode, geoProviderConfig.mode) && Intrinsics.d(this.suggestPreferredProvider, geoProviderConfig.suggestPreferredProvider) && Intrinsics.d(this.geocodePreferredProvider, geoProviderConfig.geocodePreferredProvider) && Intrinsics.d(this.revGeocodePreferredProvider, geoProviderConfig.revGeocodePreferredProvider) && Intrinsics.d(this.allowedLocations, geoProviderConfig.allowedLocations) && Intrinsics.d(this.copyrights, geoProviderConfig.copyrights) && Intrinsics.d(this.features, geoProviderConfig.features) && this.suggest == geoProviderConfig.suggest && Intrinsics.d(this.suggestProvider, geoProviderConfig.suggestProvider) && Intrinsics.d(this.locale, geoProviderConfig.locale) && Intrinsics.d(this.sdkType, geoProviderConfig.sdkType);
    }

    public final String getAllowedLocations$mapsdk_fullFirebaseOpenglRelease() {
        return this.allowedLocations;
    }

    public final String getCopyrights$mapsdk_fullFirebaseOpenglRelease() {
        return this.copyrights;
    }

    public final String getFeatures() {
        return this.features;
    }

    public final String getGeocodePreferredProvider$mapsdk_fullFirebaseOpenglRelease() {
        return this.geocodePreferredProvider;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getLocale() {
        return this.locale;
    }

    public final String getLogo() {
        return this.logo;
    }

    public final String getLogoMobile() {
        return this.logoMobile;
    }

    public final Double getMaxZoom() {
        return this.maxZoom;
    }

    public final Double getMinZoom() {
        return this.minZoom;
    }

    public final String getMode() {
        return this.mode;
    }

    public final String getName() {
        return this.name;
    }

    public final String getRevGeocodePreferredProvider$mapsdk_fullFirebaseOpenglRelease() {
        return this.revGeocodePreferredProvider;
    }

    @NotNull
    public final SdkType getSdkType() {
        return this.sdkType;
    }

    public final ProviderSuggest getSuggest() {
        return this.suggest;
    }

    public final String getSuggestPreferredProvider$mapsdk_fullFirebaseOpenglRelease() {
        return this.suggestPreferredProvider;
    }

    public final String getSuggestProvider() {
        return this.suggestProvider;
    }

    public final Integer getTileSize() {
        return this.tileSize;
    }

    public final String getTileUrl() {
        return this.tileUrl;
    }

    public int hashCode() {
        String str = this.logo;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.logoMobile;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d11 = this.maxZoom;
        int hashCode3 = (hashCode2 + (d11 == null ? 0 : d11.hashCode())) * 31;
        Double d12 = this.minZoom;
        int hashCode4 = (hashCode3 + (d12 == null ? 0 : d12.hashCode())) * 31;
        String str3 = this.name;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.tileSize;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.tileUrl;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.key;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.mode;
        int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.suggestPreferredProvider;
        int hashCode10 = (hashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.geocodePreferredProvider;
        int hashCode11 = (hashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.revGeocodePreferredProvider;
        int hashCode12 = (hashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.allowedLocations;
        int hashCode13 = (hashCode12 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.copyrights;
        int hashCode14 = (hashCode13 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.features;
        int hashCode15 = (hashCode14 + (str12 == null ? 0 : str12.hashCode())) * 31;
        ProviderSuggest providerSuggest = this.suggest;
        int hashCode16 = (hashCode15 + (providerSuggest == null ? 0 : providerSuggest.hashCode())) * 31;
        String str13 = this.suggestProvider;
        int hashCode17 = (hashCode16 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.locale;
        return this.sdkType.hashCode() + ((hashCode17 + (str14 != null ? str14.hashCode() : 0)) * 31);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b8, code lost:
    
        r4 = (java.util.List) kotlin.collections.C7714v.K(r5);
        r5 = kotlin.collections.C7714v.E0(r5, new kotlin.ranges.IntRange(1, kotlin.collections.C7714v.P(r3), 1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00cf, code lost:
    
        if (r4.isEmpty() == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d8, code lost:
    
        if (r3.isEmpty() != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00da, code lost:
    
        r2.add(new we0.C10543B(r4, r5));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<C10543B> parseAllowedLocation() {
        if (this.allowedLocations != null) {
            try {
                Type type = new com.google.gson.reflect.a<List<? extends List<? extends List<? extends List<? extends Double>>>>>() { // from class: ru.ozon.mapsdk.common.geoproxy.data.model.GeoProviderConfig$parseAllowedLocation$type$1
                }.getType();
                Gson a11 = C6943a.a();
                String str = this.allowedLocations;
                a11.getClass();
                Object c11 = str == null ? null : a11.c(new StringReader(str), com.google.gson.reflect.a.get(type));
                Tc.b builder = C7714v.B();
                loop0: for (List list : (List) c11) {
                    List list2 = list;
                    ArrayList arrayList = new ArrayList(C7714v.z(list2, 10));
                    Iterator it = list2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        List<List> list3 = (List) it.next();
                        ArrayList arrayList2 = new ArrayList(C7714v.z(list3, 10));
                        for (List list4 : list3) {
                            if (list4.isEmpty() || list4.get(0) == null || list4.get(1) == null) {
                                break loop0;
                            }
                            Object obj = list4.get(0);
                            Intrinsics.f(obj);
                            double doubleValue = ((Number) obj).doubleValue();
                            Object obj2 = list4.get(1);
                            Intrinsics.f(obj2);
                            arrayList2.add(new m(doubleValue, ((Number) obj2).doubleValue()));
                        }
                        arrayList.add(arrayList2);
                    }
                }
                Intrinsics.checkNotNullParameter(builder, "builder");
                return builder.B();
            } catch (Exception e11) {
                C9867b c9867b = C9867b.f99466a;
                C9867b.f("Error while parsing allowed locations", new C10044a(e11), InterfaceC10046c.a.ERROR);
                return null;
            }
        }
        return null;
    }

    public final List<Copyright> parseCopyrights() {
        if (this.copyrights == null) {
            return null;
        }
        Type type = new com.google.gson.reflect.a<List<? extends Copyright>>() { // from class: ru.ozon.mapsdk.common.geoproxy.data.model.GeoProviderConfig$parseCopyrights$type$1
        }.getType();
        Gson a11 = C6943a.a();
        String str = this.copyrights;
        a11.getClass();
        return (List) (str != null ? a11.c(new StringReader(str), com.google.gson.reflect.a.get(type)) : null);
    }

    public final List<String> parseGeocodePreferredProvider() {
        return parseStringList(this.geocodePreferredProvider);
    }

    public final List<String> parseRevGeocodePreferredProvider() {
        return parseStringList(this.revGeocodePreferredProvider);
    }

    public final List<String> parseSuggestPreferredProvider() {
        return parseStringList(this.suggestPreferredProvider);
    }

    public final VectorData parseVector() {
        String str = this.features;
        if (str == null) {
            return null;
        }
        Type type = new com.google.gson.reflect.a<FeaturesField>() { // from class: ru.ozon.mapsdk.common.geoproxy.data.model.GeoProviderConfig$parseVector$1$type$1
        }.getType();
        Gson a11 = C6943a.a();
        a11.getClass();
        return ((FeaturesField) a11.c(new StringReader(str), com.google.gson.reflect.a.get(type))).getVector().getNewFields();
    }

    @NotNull
    public String toString() {
        String str = this.logo;
        String str2 = this.logoMobile;
        Double d11 = this.maxZoom;
        Double d12 = this.minZoom;
        String str3 = this.name;
        Integer num = this.tileSize;
        String str4 = this.tileUrl;
        String str5 = this.key;
        String str6 = this.mode;
        String str7 = this.suggestPreferredProvider;
        String str8 = this.geocodePreferredProvider;
        String str9 = this.revGeocodePreferredProvider;
        String str10 = this.allowedLocations;
        String str11 = this.copyrights;
        String str12 = this.features;
        ProviderSuggest providerSuggest = this.suggest;
        String str13 = this.suggestProvider;
        String str14 = this.locale;
        SdkType sdkType = this.sdkType;
        StringBuilder d13 = C3660k.d("GeoProviderConfig(logo=", str, ", logoMobile=", str2, ", maxZoom=");
        d13.append(d11);
        d13.append(", minZoom=");
        d13.append(d12);
        d13.append(", name=");
        C2454a.f(num, str3, ", tileSize=", ", tileUrl=", d13);
        Nh.a.h(d13, str4, ", key=", str5, ", mode=");
        Nh.a.h(d13, str6, ", suggestPreferredProvider=", str7, ", geocodePreferredProvider=");
        Nh.a.h(d13, str8, ", revGeocodePreferredProvider=", str9, ", allowedLocations=");
        Nh.a.h(d13, str10, ", copyrights=", str11, ", features=");
        d13.append(str12);
        d13.append(", suggest=");
        d13.append(providerSuggest);
        d13.append(", suggestProvider=");
        Nh.a.h(d13, str13, ", locale=", str14, ", sdkType=");
        d13.append(sdkType);
        d13.append(")");
        return d13.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(C6943a.a().k(this));
    }

    public /* synthetic */ GeoProviderConfig(String str, String str2, Double d11, Double d12, String str3, Integer num, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, ProviderSuggest providerSuggest, String str13, String str14, SdkType sdkType, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : d11, (i11 & 8) != 0 ? null : d12, str3, (i11 & 32) != 0 ? null : num, (i11 & 64) != 0 ? null : str4, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : str5, (i11 & 256) != 0 ? null : str6, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : str7, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : str8, (i11 & 2048) != 0 ? null : str9, (i11 & 4096) != 0 ? null : str10, (i11 & 8192) != 0 ? null : str11, (i11 & 16384) != 0 ? null : str12, (32768 & i11) != 0 ? null : providerSuggest, (65536 & i11) != 0 ? null : str13, (131072 & i11) != 0 ? null : str14, (i11 & 262144) != 0 ? SdkType.Unknown.INSTANCE : sdkType);
    }
}
