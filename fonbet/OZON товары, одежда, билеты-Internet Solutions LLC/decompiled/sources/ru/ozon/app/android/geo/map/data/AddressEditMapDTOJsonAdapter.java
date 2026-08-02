package ru.ozon.app.android.geo.map.data;

import Ak.b;
import B0.A0;
import C.C2702w;
import Fj.c;
import N3.C3660k;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import ed.C6345a;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Tombstone;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.geo.map.data.AddressEditMapDTO;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.tabs.TabsDTO;

@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\"\u0010 \u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u001c\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019R\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0019R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0019R\u001c\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010(0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u0019R\"\u0010+\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020*\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\u0019R\u001c\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010,0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010\u0019R(\u00100\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020/\u0018\u00010.0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010\u0019R\u001c\u00102\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010\u0019R\u001c\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010\u0019R\u001c\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001040\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010\u0019R\u001c\u00107\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001060\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010\u0019R\u001c\u00109\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001080\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010\u0019R\u001e\u0010;\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<¨\u0006="}, d2 = {"Lru/ozon/app/android/geo/map/data/AddressEditMapDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/geo/map/data/AddressEditMapDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/geo/map/data/AddressEditMapDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/geo/map/data/AddressEditMapDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "booleanAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$Pin;", "pinAdapter", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "nullableAtomActionDTOAdapter", "", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "nullableListOfBadgeDTOAdapter", "Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$ViewPort;", "nullableViewPortAdapter", "Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$LocationMarker;", "nullableLocationMarkerAdapter", "nullableStringAdapter", "Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$Icons;", "iconsAdapter", "Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$BannerInfo;", "nullableBannerInfoAdapter", "Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$Selector;", "nullableListOfSelectorAdapter", "Lru/ozon/uni/atoms/data/tabs/TabsDTO;", "nullableTabsDTOAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$MetaInfo;", "nullableMetaInfoAdapter", "nullableBooleanAdapter", "Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$MarkerBundle;", "nullableMarkerBundleAtProtoOneOfAtProtoOneOfSignatureAdapter", "Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$MiniAppHeader;", "nullableMiniAppHeaderAdapter", "Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$NumberPVZ;", "nullableNumberPVZAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddressEditMapDTOJsonAdapter extends JsonAdapter<AddressEditMapDTO> {

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<AddressEditMapDTO> constructorRef;

    @NotNull
    private final JsonAdapter<AddressEditMapDTO.Icons> iconsAdapter;

    @NotNull
    private final JsonAdapter<AtomActionDTO> nullableAtomActionDTOAdapter;

    @NotNull
    private final JsonAdapter<AddressEditMapDTO.BannerInfo> nullableBannerInfoAdapter;

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final JsonAdapter<List<BadgeDTO>> nullableListOfBadgeDTOAdapter;

    @NotNull
    private final JsonAdapter<List<AddressEditMapDTO.Selector>> nullableListOfSelectorAdapter;

    @NotNull
    private final JsonAdapter<AddressEditMapDTO.LocationMarker> nullableLocationMarkerAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<AddressEditMapDTO.MarkerBundle> nullableMarkerBundleAtProtoOneOfAtProtoOneOfSignatureAdapter;

    @NotNull
    private final JsonAdapter<AddressEditMapDTO.MetaInfo> nullableMetaInfoAdapter;

    @NotNull
    private final JsonAdapter<AddressEditMapDTO.MiniAppHeader> nullableMiniAppHeaderAdapter;

    @NotNull
    private final JsonAdapter<AddressEditMapDTO.NumberPVZ> nullableNumberPVZAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<TabsDTO> nullableTabsDTOAdapter;

    @NotNull
    private final JsonAdapter<AddressEditMapDTO.ViewPort> nullableViewPortAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<AddressEditMapDTO.Pin> pinAdapter;

    public AddressEditMapDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("showCenterPin", "centerPin", "bottomSheetAction", "bottomSheetBadges", "viewport", "userLocationMarker", "linkTplDragCenter", "linkTplZoomInOut", "icons", "bannerInfo", "selector", "dsTabs", "isNavbarHidden", "navbarTitle", "navbarSubtitle", "trackingInfo", "metaInfo", "geolocationOnInit", "clusterizationEnabled", "isNeedStartClusterization", "mergedPinsActionBaseLink", "actionBaseLink", "markerBundle", "miniAppHeader", "bottomSheetTrackingInfo", "numberPVZ");
        M m11 = M.f71699a;
        this.booleanAdapter = moshi.f(Boolean.TYPE, m11, "showCenterPin");
        this.pinAdapter = moshi.f(AddressEditMapDTO.Pin.class, m11, "centerPin");
        this.nullableAtomActionDTOAdapter = moshi.f(AtomActionDTO.class, m11, "bottomSheetAction");
        this.nullableListOfBadgeDTOAdapter = moshi.f(D.e(List.class, BadgeDTO.class), m11, "bottomSheetBadges");
        this.nullableViewPortAdapter = moshi.f(AddressEditMapDTO.ViewPort.class, m11, "viewport");
        this.nullableLocationMarkerAdapter = moshi.f(AddressEditMapDTO.LocationMarker.class, m11, "userLocationMarker");
        this.nullableStringAdapter = moshi.f(String.class, m11, "linkTplDragCenter");
        this.iconsAdapter = moshi.f(AddressEditMapDTO.Icons.class, m11, "icons");
        this.nullableBannerInfoAdapter = moshi.f(AddressEditMapDTO.BannerInfo.class, m11, "bannerInfo");
        this.nullableListOfSelectorAdapter = moshi.f(D.e(List.class, AddressEditMapDTO.Selector.class), m11, "selector");
        this.nullableTabsDTOAdapter = moshi.f(TabsDTO.class, m11, "dsTabs");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
        this.nullableMetaInfoAdapter = moshi.f(AddressEditMapDTO.MetaInfo.class, m11, "metaInfo");
        this.nullableBooleanAdapter = moshi.f(Boolean.class, m11, "geolocationOnInit");
        final String str = "type";
        ProtoOneOf protoOneOf = new ProtoOneOf(str) { // from class: ru.ozon.app.android.geo.map.data.AddressEditMapDTOJsonAdapter$annotationImpl$ru_ozon_moshi_adapters_serialize_proto_ProtoOneOf$0
            private final /* synthetic */ String label;

            {
                Intrinsics.checkNotNullParameter(str, "label");
                this.label = str;
            }

            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return ProtoOneOf.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                return (obj instanceof ProtoOneOf) && Intrinsics.d(label(), ((ProtoOneOf) obj).label());
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return this.label.hashCode() ^ 161479436;
            }

            @Override // ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf
            public final /* synthetic */ String label() {
                return this.label;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                return A0.b("@ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf(label=", this.label, ")");
            }
        };
        final d b11 = N.b(AddressEditMapDTO.MapObjectCollection.class);
        final String str2 = "mapObjectCollection";
        final String str3 = "";
        Annotation[] elements = {protoOneOf, new ProtoOneOfSignature(str2, str3, b11) { // from class: ru.ozon.app.android.geo.map.data.AddressEditMapDTOJsonAdapter$annotationImpl$ru_ozon_moshi_adapters_serialize_proto_ProtoOneOfSignature$0
            private final /* synthetic */ String fieldName;
            private final /* synthetic */ String name;
            private final /* synthetic */ Class<?> type;

            {
                Intrinsics.checkNotNullParameter(str2, "name");
                Intrinsics.checkNotNullParameter(str3, "fieldName");
                Intrinsics.checkNotNullParameter(b11, "type");
                this.name = str2;
                this.fieldName = str3;
                this.type = C6345a.b(b11);
            }

            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return ProtoOneOfSignature.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                if (!(obj instanceof ProtoOneOfSignature)) {
                    return false;
                }
                ProtoOneOfSignature protoOneOfSignature = (ProtoOneOfSignature) obj;
                return Intrinsics.d(name(), protoOneOfSignature.name()) && Intrinsics.d(fieldName(), protoOneOfSignature.fieldName()) && C2702w.f(protoOneOfSignature, N.b(type()));
            }

            @Override // ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature
            public final /* synthetic */ String fieldName() {
                return this.fieldName;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return (this.name.hashCode() ^ 428460789) + (this.fieldName.hashCode() ^ 1742393307) + (this.type.hashCode() ^ 454102470);
            }

            @Override // ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature
            public final /* synthetic */ String name() {
                return this.name;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                String str4 = this.name;
                String str5 = this.fieldName;
                return c.c(C3660k.d("@ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature(name=", str4, ", fieldName=", str5, ", type="), this.type, ")");
            }

            @Override // ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature
            public final /* synthetic */ Class type() {
                return this.type;
            }
        }};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.nullableMarkerBundleAtProtoOneOfAtProtoOneOfSignatureAdapter = moshi.f(AddressEditMapDTO.MarkerBundle.class, C7705l.j0(elements), "markerBundle");
        this.nullableMiniAppHeaderAdapter = moshi.f(AddressEditMapDTO.MiniAppHeader.class, m11, "miniAppHeader");
        this.nullableNumberPVZAdapter = moshi.f(AddressEditMapDTO.NumberPVZ.class, m11, "numberPVZ");
    }

    @NotNull
    public String toString() {
        return b.c(39, "GeneratedJsonAdapter(AddressEditMapDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public AddressEditMapDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Boolean bool = Boolean.FALSE;
        reader.beginObject();
        int i11 = -1;
        Boolean bool2 = bool;
        Boolean bool3 = bool2;
        AddressEditMapDTO.BannerInfo bannerInfo = null;
        List<AddressEditMapDTO.Selector> list = null;
        AddressEditMapDTO.Pin pin = null;
        AtomActionDTO atomActionDTO = null;
        List<BadgeDTO> list2 = null;
        AddressEditMapDTO.ViewPort viewPort = null;
        AddressEditMapDTO.LocationMarker locationMarker = null;
        String str = null;
        String str2 = null;
        AddressEditMapDTO.Icons icons = null;
        TabsDTO tabsDTO = null;
        String str3 = null;
        String str4 = null;
        Map<String, TokenizedTrackingInfo> map = null;
        AddressEditMapDTO.MetaInfo metaInfo = null;
        Boolean bool4 = null;
        Boolean bool5 = null;
        Boolean bool6 = null;
        String str5 = null;
        String str6 = null;
        AddressEditMapDTO.MarkerBundle markerBundle = null;
        AddressEditMapDTO.MiniAppHeader miniAppHeader = null;
        Map<String, TokenizedTrackingInfo> map2 = null;
        AddressEditMapDTO.NumberPVZ numberPVZ = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    bool2 = this.booleanAdapter.fromJson(reader);
                    if (bool2 == null) {
                        throw Y9.c.q("showCenterPin", "showCenterPin", reader);
                    }
                    i11 &= -2;
                    break;
                case 1:
                    pin = this.pinAdapter.fromJson(reader);
                    if (pin == null) {
                        throw Y9.c.q("centerPin", "centerPin", reader);
                    }
                    break;
                case 2:
                    atomActionDTO = this.nullableAtomActionDTOAdapter.fromJson(reader);
                    break;
                case 3:
                    list2 = this.nullableListOfBadgeDTOAdapter.fromJson(reader);
                    break;
                case 4:
                    viewPort = this.nullableViewPortAdapter.fromJson(reader);
                    break;
                case 5:
                    locationMarker = this.nullableLocationMarkerAdapter.fromJson(reader);
                    break;
                case 6:
                    str = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 7:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 8:
                    icons = this.iconsAdapter.fromJson(reader);
                    if (icons == null) {
                        throw Y9.c.q("icons", "icons", reader);
                    }
                    break;
                case 9:
                    bannerInfo = this.nullableBannerInfoAdapter.fromJson(reader);
                    break;
                case 10:
                    list = this.nullableListOfSelectorAdapter.fromJson(reader);
                    break;
                case 11:
                    tabsDTO = this.nullableTabsDTOAdapter.fromJson(reader);
                    break;
                case 12:
                    bool3 = this.booleanAdapter.fromJson(reader);
                    if (bool3 == null) {
                        throw Y9.c.q("isNavbarHidden", "isNavbarHidden", reader);
                    }
                    i11 &= -4097;
                    break;
                case 13:
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 14:
                    str4 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 15:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
                case 16:
                    metaInfo = this.nullableMetaInfoAdapter.fromJson(reader);
                    break;
                case 17:
                    bool4 = this.nullableBooleanAdapter.fromJson(reader);
                    i11 &= -131073;
                    break;
                case 18:
                    bool5 = this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 19:
                    bool6 = this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 20:
                    str5 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 21:
                    str6 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 22:
                    markerBundle = this.nullableMarkerBundleAtProtoOneOfAtProtoOneOfSignatureAdapter.fromJson(reader);
                    break;
                case 23:
                    miniAppHeader = this.nullableMiniAppHeaderAdapter.fromJson(reader);
                    break;
                case 24:
                    map2 = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
                case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                    numberPVZ = this.nullableNumberPVZAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (i11 == -135170) {
            boolean booleanValue = bool2.booleanValue();
            if (pin == null) {
                throw Y9.c.j("centerPin", "centerPin", reader);
            }
            if (icons == null) {
                throw Y9.c.j("icons", "icons", reader);
            }
            return new AddressEditMapDTO(booleanValue, pin, atomActionDTO, list2, viewPort, locationMarker, str, str2, icons, bannerInfo, list, tabsDTO, bool3.booleanValue(), str3, str4, map, metaInfo, bool4, bool5, bool6, str5, str6, markerBundle, miniAppHeader, map2, numberPVZ);
        }
        Constructor<AddressEditMapDTO> constructor = this.constructorRef;
        if (constructor == null) {
            Class<?> cls = Y9.c.f34864d;
            Class cls2 = Boolean.TYPE;
            constructor = AddressEditMapDTO.class.getDeclaredConstructor(cls2, AddressEditMapDTO.Pin.class, AtomActionDTO.class, List.class, AddressEditMapDTO.ViewPort.class, AddressEditMapDTO.LocationMarker.class, String.class, String.class, AddressEditMapDTO.Icons.class, AddressEditMapDTO.BannerInfo.class, List.class, TabsDTO.class, cls2, String.class, String.class, Map.class, AddressEditMapDTO.MetaInfo.class, Boolean.class, Boolean.class, Boolean.class, String.class, String.class, AddressEditMapDTO.MarkerBundle.class, AddressEditMapDTO.MiniAppHeader.class, Map.class, AddressEditMapDTO.NumberPVZ.class, Integer.TYPE, cls);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (pin == null) {
            throw Y9.c.j("centerPin", "centerPin", reader);
        }
        if (icons == null) {
            throw Y9.c.j("icons", "icons", reader);
        }
        AddressEditMapDTO newInstance = constructor.newInstance(bool2, pin, atomActionDTO, list2, viewPort, locationMarker, str, str2, icons, bannerInfo, list, tabsDTO, bool3, str3, str4, map, metaInfo, bool4, bool5, bool6, str5, str6, markerBundle, miniAppHeader, map2, numberPVZ, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, AddressEditMapDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("showCenterPin");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.getShowCenterPin()));
        writer.w("centerPin");
        this.pinAdapter.mo44toJson(writer, (x) value.getCenterPin());
        writer.w("bottomSheetAction");
        this.nullableAtomActionDTOAdapter.mo44toJson(writer, (x) value.getBottomSheetAction());
        writer.w("bottomSheetBadges");
        this.nullableListOfBadgeDTOAdapter.mo44toJson(writer, (x) value.getBottomSheetBadges());
        writer.w("viewport");
        this.nullableViewPortAdapter.mo44toJson(writer, (x) value.getViewport());
        writer.w("userLocationMarker");
        this.nullableLocationMarkerAdapter.mo44toJson(writer, (x) value.getUserLocationMarker());
        writer.w("linkTplDragCenter");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getLinkTplDragCenter());
        writer.w("linkTplZoomInOut");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getLinkTplZoomInOut());
        writer.w("icons");
        this.iconsAdapter.mo44toJson(writer, (x) value.getIcons());
        writer.w("bannerInfo");
        this.nullableBannerInfoAdapter.mo44toJson(writer, (x) value.getBannerInfo());
        writer.w("selector");
        this.nullableListOfSelectorAdapter.mo44toJson(writer, (x) value.getSelector());
        writer.w("dsTabs");
        this.nullableTabsDTOAdapter.mo44toJson(writer, (x) value.getDsTabs());
        writer.w("isNavbarHidden");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.isNavbarHidden()));
        writer.w("navbarTitle");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getNavbarTitle());
        writer.w("navbarSubtitle");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getNavbarSubtitle());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.w("metaInfo");
        this.nullableMetaInfoAdapter.mo44toJson(writer, (x) value.getMetaInfo());
        writer.w("geolocationOnInit");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.getGeolocationOnInit());
        writer.w("clusterizationEnabled");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.getClusterizationEnabled());
        writer.w("isNeedStartClusterization");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.isNeedStartClusterization());
        writer.w("mergedPinsActionBaseLink");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getMergedPinsActionBaseLink());
        writer.w("actionBaseLink");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getActionBaseLink());
        writer.w("markerBundle");
        this.nullableMarkerBundleAtProtoOneOfAtProtoOneOfSignatureAdapter.mo44toJson(writer, (x) value.getMarkerBundle());
        writer.w("miniAppHeader");
        this.nullableMiniAppHeaderAdapter.mo44toJson(writer, (x) value.getMiniAppHeader());
        writer.w("bottomSheetTrackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getBottomSheetTrackingInfo());
        writer.w("numberPVZ");
        this.nullableNumberPVZAdapter.mo44toJson(writer, (x) value.getNumberPVZ());
        writer.p();
    }
}
