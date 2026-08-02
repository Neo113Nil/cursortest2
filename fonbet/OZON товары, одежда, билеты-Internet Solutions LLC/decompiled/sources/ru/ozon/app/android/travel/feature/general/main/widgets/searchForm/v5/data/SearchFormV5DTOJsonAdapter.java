package ru.ozon.app.android.travel.feature.general.main.widgets.searchForm.v5.data;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.feature.general.main.widgets.searchForm.v5.data.SearchFormV5DTO;
import ru.ozon.app.android.travel.molecules.dto.iconField.IconFieldDTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R(\u0010$\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020#\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0019R\u001c\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0019R\u001e\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v5/data/SearchFormV5DTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v5/data/SearchFormV5DTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v5/data/SearchFormV5DTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v5/data/SearchFormV5DTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v5/data/SearchFormV5DTO$Locations;", "nullableLocationsAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/molecules/dto/iconField/IconFieldDTO;", "nullableIconFieldDTOAdapter", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "buttonV3DTOAdapter", "stringAdapter", "nullableStringAdapter", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "nullableCellDTOAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "cornerRadiusAtEnumNullFallbackAdapter", "Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v5/data/SearchFormV5DTO$AsyncFetchConfig;", "nullableAsyncFetchConfigAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SearchFormV5DTOJsonAdapter extends JsonAdapter<SearchFormV5DTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<ButtonV3DTO> buttonV3DTOAdapter;
    private volatile Constructor<SearchFormV5DTO> constructorRef;

    @NotNull
    private final JsonAdapter<CornerRadius> cornerRadiusAtEnumNullFallbackAdapter;

    @NotNull
    private final JsonAdapter<SearchFormV5DTO.AsyncFetchConfig> nullableAsyncFetchConfigAdapter;

    @NotNull
    private final JsonAdapter<CellDTO> nullableCellDTOAdapter;

    @NotNull
    private final JsonAdapter<IconFieldDTO> nullableIconFieldDTOAdapter;

    @NotNull
    private final JsonAdapter<SearchFormV5DTO.Locations> nullableLocationsAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public SearchFormV5DTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("locations", "dateField", "rightField", "touristField", "searchButton", "backgroundColor", "leftPatchColor", "rightPatchColor", "toggleCell", "trackingInfo", "cornerRadius", "asyncFetchConfig");
        M m11 = M.f71699a;
        this.nullableLocationsAdapter = moshi.f(SearchFormV5DTO.Locations.class, m11, "locations");
        this.nullableIconFieldDTOAdapter = moshi.f(IconFieldDTO.class, m11, "dateField");
        this.buttonV3DTOAdapter = moshi.f(ButtonV3DTO.class, m11, "searchButton");
        this.stringAdapter = moshi.f(String.class, m11, "backgroundColor");
        this.nullableStringAdapter = moshi.f(String.class, m11, "leftPatchColor");
        this.nullableCellDTOAdapter = moshi.f(CellDTO.class, m11, "toggleCell");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
        this.cornerRadiusAtEnumNullFallbackAdapter = moshi.f(CornerRadius.class, e0.h(new EnumNullFallback() { // from class: ru.ozon.app.android.travel.feature.general.main.widgets.searchForm.v5.data.SearchFormV5DTOJsonAdapter$annotationImpl$ru_ozon_uni_atoms_parsing_adapter_annotation_EnumNullFallback$0
            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return EnumNullFallback.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                return obj instanceof EnumNullFallback;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return 0;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                return "@ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback()";
            }
        }), "cornerRadius");
        this.nullableAsyncFetchConfigAdapter = moshi.f(SearchFormV5DTO.AsyncFetchConfig.class, m11, "asyncFetchConfig");
    }

    @NotNull
    public String toString() {
        return b.c(37, "GeneratedJsonAdapter(SearchFormV5DTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public SearchFormV5DTO fromJson(@NotNull n reader) {
        int i11;
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i12 = -1;
        SearchFormV5DTO.Locations locations = null;
        IconFieldDTO iconFieldDTO = null;
        IconFieldDTO iconFieldDTO2 = null;
        IconFieldDTO iconFieldDTO3 = null;
        ButtonV3DTO buttonV3DTO = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        CellDTO cellDTO = null;
        Map<String, TokenizedTrackingInfo> map = null;
        CornerRadius cornerRadius = null;
        SearchFormV5DTO.AsyncFetchConfig asyncFetchConfig = null;
        while (reader.hasNext()) {
            SearchFormV5DTO.Locations locations2 = locations;
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    locations = this.nullableLocationsAdapter.fromJson(reader);
                    continue;
                case 1:
                    iconFieldDTO = this.nullableIconFieldDTOAdapter.fromJson(reader);
                    break;
                case 2:
                    iconFieldDTO2 = this.nullableIconFieldDTOAdapter.fromJson(reader);
                    break;
                case 3:
                    iconFieldDTO3 = this.nullableIconFieldDTOAdapter.fromJson(reader);
                    break;
                case 4:
                    buttonV3DTO = this.buttonV3DTOAdapter.fromJson(reader);
                    if (buttonV3DTO == null) {
                        throw c.q("searchButton", "searchButton", reader);
                    }
                    break;
                case 5:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("backgroundColor", "backgroundColor", reader);
                    }
                    break;
                case 6:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 7:
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 8:
                    cellDTO = this.nullableCellDTOAdapter.fromJson(reader);
                    break;
                case 9:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
                case 10:
                    cornerRadius = this.cornerRadiusAtEnumNullFallbackAdapter.fromJson(reader);
                    if (cornerRadius == null) {
                        throw c.q("cornerRadius", "cornerRadius", reader);
                    }
                    locations = locations2;
                    i12 = -1025;
                    continue;
                case 11:
                    asyncFetchConfig = this.nullableAsyncFetchConfigAdapter.fromJson(reader);
                    break;
            }
            locations = locations2;
        }
        SearchFormV5DTO.Locations locations3 = locations;
        reader.endObject();
        if (i12 == -1025) {
            if (buttonV3DTO == null) {
                throw c.j("searchButton", "searchButton", reader);
            }
            if (str == null) {
                throw c.j("backgroundColor", "backgroundColor", reader);
            }
            Intrinsics.g(cornerRadius, "null cannot be cast to non-null type ru.ozon.uni.atoms.data.common.CornerRadius");
            CellDTO cellDTO2 = cellDTO;
            String str4 = str3;
            String str5 = str2;
            String str6 = str;
            ButtonV3DTO buttonV3DTO2 = buttonV3DTO;
            return new SearchFormV5DTO(locations3, iconFieldDTO, iconFieldDTO2, iconFieldDTO3, buttonV3DTO2, str6, str5, str4, cellDTO2, map, cornerRadius, asyncFetchConfig);
        }
        Constructor<SearchFormV5DTO> constructor = this.constructorRef;
        if (constructor == null) {
            i11 = i12;
            constructor = SearchFormV5DTO.class.getDeclaredConstructor(SearchFormV5DTO.Locations.class, IconFieldDTO.class, IconFieldDTO.class, IconFieldDTO.class, ButtonV3DTO.class, String.class, String.class, String.class, CellDTO.class, Map.class, CornerRadius.class, SearchFormV5DTO.AsyncFetchConfig.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        } else {
            i11 = i12;
        }
        Constructor<SearchFormV5DTO> constructor2 = constructor;
        if (buttonV3DTO == null) {
            throw c.j("searchButton", "searchButton", reader);
        }
        if (str == null) {
            throw c.j("backgroundColor", "backgroundColor", reader);
        }
        SearchFormV5DTO newInstance = constructor2.newInstance(locations3, iconFieldDTO, iconFieldDTO2, iconFieldDTO3, buttonV3DTO, str, str2, str3, cellDTO, map, cornerRadius, asyncFetchConfig, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, SearchFormV5DTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("locations");
        this.nullableLocationsAdapter.mo44toJson(writer, (x) value.getLocations());
        writer.w("dateField");
        this.nullableIconFieldDTOAdapter.mo44toJson(writer, (x) value.getDateField());
        writer.w("rightField");
        this.nullableIconFieldDTOAdapter.mo44toJson(writer, (x) value.getRightField());
        writer.w("touristField");
        this.nullableIconFieldDTOAdapter.mo44toJson(writer, (x) value.getTouristField());
        writer.w("searchButton");
        this.buttonV3DTOAdapter.mo44toJson(writer, (x) value.getSearchButton());
        writer.w("backgroundColor");
        this.stringAdapter.mo44toJson(writer, (x) value.getBackgroundColor());
        writer.w("leftPatchColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getLeftPatchColor());
        writer.w("rightPatchColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getRightPatchColor());
        writer.w("toggleCell");
        this.nullableCellDTOAdapter.mo44toJson(writer, (x) value.getToggleCell());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.w("cornerRadius");
        this.cornerRadiusAtEnumNullFallbackAdapter.mo44toJson(writer, (x) value.getCornerRadius());
        writer.w("asyncFetchConfig");
        this.nullableAsyncFetchConfigAdapter.mo44toJson(writer, (x) value.getAsyncFetchConfig());
        writer.p();
    }
}
