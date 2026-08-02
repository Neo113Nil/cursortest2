package ru.ozon.app.android.travel.feature.general.main.widgets.searchForm.v4.data;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.main.widgets.searchForm.v4.data.SearchFormV4DTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v4/data/SearchFormV4DTO_LocationsJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v4/data/SearchFormV4DTO$Locations;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v4/data/SearchFormV4DTO$Locations;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v4/data/SearchFormV4DTO$Locations;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v4/data/SearchFormV4DTO$TextField;", "textFieldAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableTextFieldAdapter", "stringAdapter", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "nullableIconButtonV3DTOAdapter", "nullableStringAdapter", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "cornerRadiusAtEnumNullFallbackAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SearchFormV4DTO_LocationsJsonAdapter extends JsonAdapter<SearchFormV4DTO.Locations> {
    public static final int $stable = 8;
    private volatile Constructor<SearchFormV4DTO.Locations> constructorRef;

    @NotNull
    private final JsonAdapter<CornerRadius> cornerRadiusAtEnumNullFallbackAdapter;

    @NotNull
    private final JsonAdapter<IconButtonV3DTO> nullableIconButtonV3DTOAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<SearchFormV4DTO.TextField> nullableTextFieldAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    @NotNull
    private final JsonAdapter<SearchFormV4DTO.TextField> textFieldAdapter;

    public SearchFormV4DTO_LocationsJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("topLocation", "bottomLocation", "backgroundColor", "swapButton", "separatorColor", "cornerRadius");
        M m11 = M.f71699a;
        this.textFieldAdapter = moshi.f(SearchFormV4DTO.TextField.class, m11, "topLocation");
        this.nullableTextFieldAdapter = moshi.f(SearchFormV4DTO.TextField.class, m11, "bottomLocation");
        this.stringAdapter = moshi.f(String.class, m11, "backgroundColor");
        this.nullableIconButtonV3DTOAdapter = moshi.f(IconButtonV3DTO.class, m11, "swapButton");
        this.nullableStringAdapter = moshi.f(String.class, m11, "separatorColor");
        this.cornerRadiusAtEnumNullFallbackAdapter = moshi.f(CornerRadius.class, e0.h(new EnumNullFallback() { // from class: ru.ozon.app.android.travel.feature.general.main.widgets.searchForm.v4.data.SearchFormV4DTO_LocationsJsonAdapter$annotationImpl$ru_ozon_uni_atoms_parsing_adapter_annotation_EnumNullFallback$0
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
    }

    @NotNull
    public String toString() {
        return b.c(47, "GeneratedJsonAdapter(SearchFormV4DTO.Locations)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public SearchFormV4DTO.Locations fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i11 = -1;
        SearchFormV4DTO.TextField textField = null;
        SearchFormV4DTO.TextField textField2 = null;
        String str = null;
        IconButtonV3DTO iconButtonV3DTO = null;
        String str2 = null;
        CornerRadius cornerRadius = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    textField = this.textFieldAdapter.fromJson(reader);
                    if (textField == null) {
                        throw c.q("topLocation", "topLocation", reader);
                    }
                    break;
                case 1:
                    textField2 = this.nullableTextFieldAdapter.fromJson(reader);
                    break;
                case 2:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("backgroundColor", "backgroundColor", reader);
                    }
                    break;
                case 3:
                    iconButtonV3DTO = this.nullableIconButtonV3DTOAdapter.fromJson(reader);
                    break;
                case 4:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 5:
                    cornerRadius = this.cornerRadiusAtEnumNullFallbackAdapter.fromJson(reader);
                    if (cornerRadius == null) {
                        throw c.q("cornerRadius", "cornerRadius", reader);
                    }
                    i11 = -33;
                    break;
            }
        }
        reader.endObject();
        if (i11 == -33) {
            String str3 = str2;
            IconButtonV3DTO iconButtonV3DTO2 = iconButtonV3DTO;
            String str4 = str;
            SearchFormV4DTO.TextField textField3 = textField2;
            SearchFormV4DTO.TextField textField4 = textField;
            if (textField4 == null) {
                throw c.j("topLocation", "topLocation", reader);
            }
            if (str4 == null) {
                throw c.j("backgroundColor", "backgroundColor", reader);
            }
            Intrinsics.g(cornerRadius, "null cannot be cast to non-null type ru.ozon.uni.atoms.data.common.CornerRadius");
            return new SearchFormV4DTO.Locations(textField4, textField3, str4, iconButtonV3DTO2, str3, cornerRadius);
        }
        String str5 = str2;
        IconButtonV3DTO iconButtonV3DTO3 = iconButtonV3DTO;
        String str6 = str;
        SearchFormV4DTO.TextField textField5 = textField2;
        SearchFormV4DTO.TextField textField6 = textField;
        Constructor<SearchFormV4DTO.Locations> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = SearchFormV4DTO.Locations.class.getDeclaredConstructor(SearchFormV4DTO.TextField.class, SearchFormV4DTO.TextField.class, String.class, IconButtonV3DTO.class, String.class, CornerRadius.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        Constructor<SearchFormV4DTO.Locations> constructor2 = constructor;
        if (textField6 == null) {
            throw c.j("topLocation", "topLocation", reader);
        }
        if (str6 == null) {
            throw c.j("backgroundColor", "backgroundColor", reader);
        }
        SearchFormV4DTO.Locations newInstance = constructor2.newInstance(textField6, textField5, str6, iconButtonV3DTO3, str5, cornerRadius, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, SearchFormV4DTO.Locations value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("topLocation");
        this.textFieldAdapter.mo44toJson(writer, (x) value.getTopLocation());
        writer.w("bottomLocation");
        this.nullableTextFieldAdapter.mo44toJson(writer, (x) value.getBottomLocation());
        writer.w("backgroundColor");
        this.stringAdapter.mo44toJson(writer, (x) value.getBackgroundColor());
        writer.w("swapButton");
        this.nullableIconButtonV3DTOAdapter.mo44toJson(writer, (x) value.getSwapButton());
        writer.w("separatorColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getSeparatorColor());
        writer.w("cornerRadius");
        this.cornerRadiusAtEnumNullFallbackAdapter.mo44toJson(writer, (x) value.getCornerRadius());
        writer.p();
    }
}
