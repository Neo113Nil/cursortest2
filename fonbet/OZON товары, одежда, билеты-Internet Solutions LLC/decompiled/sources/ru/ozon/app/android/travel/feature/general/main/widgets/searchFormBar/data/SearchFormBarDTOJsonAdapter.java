package ru.ozon.app.android.travel.feature.general.main.widgets.searchFormBar.data;

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
import ru.ozon.app.android.travel.feature.general.main.widgets.searchFormBar.data.SearchFormBarDTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018R\u001e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/searchFormBar/data/SearchFormBarDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/general/main/widgets/searchFormBar/data/SearchFormBarDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/general/main/widgets/searchFormBar/data/SearchFormBarDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/general/main/widgets/searchFormBar/data/SearchFormBarDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/general/main/widgets/searchFormBar/data/SearchFormBarDTO$Bar;", "barAdapter", "nullableStringAdapter", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "nullableCommonControlSettingsAdapter", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "cornerRadiusAtEnumNullFallbackAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SearchFormBarDTOJsonAdapter extends JsonAdapter<SearchFormBarDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<SearchFormBarDTO.Bar> barAdapter;
    private volatile Constructor<SearchFormBarDTO> constructorRef;

    @NotNull
    private final JsonAdapter<CornerRadius> cornerRadiusAtEnumNullFallbackAdapter;

    @NotNull
    private final JsonAdapter<CommonControlSettings> nullableCommonControlSettingsAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public SearchFormBarDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("backgroundColor", "bar", "leftPatchColor", "rightPatchColor", "commonSettings", "cornerRadius");
        M m11 = M.f71699a;
        this.stringAdapter = moshi.f(String.class, m11, "backgroundColor");
        this.barAdapter = moshi.f(SearchFormBarDTO.Bar.class, m11, "bar");
        this.nullableStringAdapter = moshi.f(String.class, m11, "leftPatchColor");
        this.nullableCommonControlSettingsAdapter = moshi.f(CommonControlSettings.class, m11, "commonSettings");
        this.cornerRadiusAtEnumNullFallbackAdapter = moshi.f(CornerRadius.class, e0.h(new EnumNullFallback() { // from class: ru.ozon.app.android.travel.feature.general.main.widgets.searchFormBar.data.SearchFormBarDTOJsonAdapter$annotationImpl$ru_ozon_uni_atoms_parsing_adapter_annotation_EnumNullFallback$0
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
        return b.c(38, "GeneratedJsonAdapter(SearchFormBarDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public SearchFormBarDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i11 = -1;
        String str = null;
        SearchFormBarDTO.Bar bar = null;
        String str2 = null;
        String str3 = null;
        CommonControlSettings commonControlSettings = null;
        CornerRadius cornerRadius = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("backgroundColor", "backgroundColor", reader);
                    }
                    break;
                case 1:
                    bar = this.barAdapter.fromJson(reader);
                    if (bar == null) {
                        throw c.q("bar", "bar", reader);
                    }
                    break;
                case 2:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 3:
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 4:
                    commonControlSettings = this.nullableCommonControlSettingsAdapter.fromJson(reader);
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
            CommonControlSettings commonControlSettings2 = commonControlSettings;
            String str4 = str3;
            String str5 = str2;
            SearchFormBarDTO.Bar bar2 = bar;
            String str6 = str;
            if (str6 == null) {
                throw c.j("backgroundColor", "backgroundColor", reader);
            }
            if (bar2 == null) {
                throw c.j("bar", "bar", reader);
            }
            Intrinsics.g(cornerRadius, "null cannot be cast to non-null type ru.ozon.uni.atoms.data.common.CornerRadius");
            return new SearchFormBarDTO(str6, bar2, str5, str4, commonControlSettings2, cornerRadius);
        }
        CommonControlSettings commonControlSettings3 = commonControlSettings;
        String str7 = str3;
        String str8 = str2;
        SearchFormBarDTO.Bar bar3 = bar;
        String str9 = str;
        Constructor<SearchFormBarDTO> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = SearchFormBarDTO.class.getDeclaredConstructor(String.class, SearchFormBarDTO.Bar.class, String.class, String.class, CommonControlSettings.class, CornerRadius.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        Constructor<SearchFormBarDTO> constructor2 = constructor;
        if (str9 == null) {
            throw c.j("backgroundColor", "backgroundColor", reader);
        }
        if (bar3 == null) {
            throw c.j("bar", "bar", reader);
        }
        SearchFormBarDTO newInstance = constructor2.newInstance(str9, bar3, str8, str7, commonControlSettings3, cornerRadius, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, SearchFormBarDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("backgroundColor");
        this.stringAdapter.mo44toJson(writer, (x) value.getBackgroundColor());
        writer.w("bar");
        this.barAdapter.mo44toJson(writer, (x) value.getBar());
        writer.w("leftPatchColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getLeftPatchColor());
        writer.w("rightPatchColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getRightPatchColor());
        writer.w("commonSettings");
        this.nullableCommonControlSettingsAdapter.mo44toJson(writer, (x) value.getCommonSettings());
        writer.w("cornerRadius");
        this.cornerRadiusAtEnumNullFallbackAdapter.mo44toJson(writer, (x) value.getCornerRadius());
        writer.p();
    }
}
