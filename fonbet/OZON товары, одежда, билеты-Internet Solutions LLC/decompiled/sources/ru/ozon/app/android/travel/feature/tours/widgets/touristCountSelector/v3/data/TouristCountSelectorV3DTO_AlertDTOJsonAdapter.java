package ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.data;

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
import ru.ozon.app.android.session.deleteAccount.data.DeleteAccountApiResponse;
import ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.data.TouristCountSelectorV3DTO;
import ru.ozon.uni.android.flashbar.model.Restriction;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/data/TouristCountSelectorV3DTO_AlertDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/data/TouristCountSelectorV3DTO$AlertDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/data/TouristCountSelectorV3DTO$AlertDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/data/TouristCountSelectorV3DTO$AlertDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/data/TouristCountSelectorV3DTO$AlertDTO$BrokenRuleDTO;", "brokenRuleDTOAtEnumNullFallbackAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/android/flashbar/model/Restriction;", "restrictionAdapter", "", "booleanAdapter", "", "nullableIntAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TouristCountSelectorV3DTO_AlertDTOJsonAdapter extends JsonAdapter<TouristCountSelectorV3DTO.AlertDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;

    @NotNull
    private final JsonAdapter<TouristCountSelectorV3DTO.AlertDTO.BrokenRuleDTO> brokenRuleDTOAtEnumNullFallbackAdapter;
    private volatile Constructor<TouristCountSelectorV3DTO.AlertDTO> constructorRef;

    @NotNull
    private final JsonAdapter<Integer> nullableIntAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<Restriction> restrictionAdapter;

    public TouristCountSelectorV3DTO_AlertDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("brokenRule", DeleteAccountApiResponse.Error.TYPE_RESTRICTION, "showAlertNow", AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.brokenRuleDTOAtEnumNullFallbackAdapter = moshi.f(TouristCountSelectorV3DTO.AlertDTO.BrokenRuleDTO.class, e0.h(new EnumNullFallback() { // from class: ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.data.TouristCountSelectorV3DTO_AlertDTOJsonAdapter$annotationImpl$ru_ozon_uni_atoms_parsing_adapter_annotation_EnumNullFallback$0
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
        }), "brokenRule");
        M m11 = M.f71699a;
        this.restrictionAdapter = moshi.f(Restriction.class, m11, DeleteAccountApiResponse.Error.TYPE_RESTRICTION);
        this.booleanAdapter = moshi.f(Boolean.TYPE, m11, "showAlertNow");
        this.nullableIntAdapter = moshi.f(Integer.class, m11, AppMeasurementSdk.ConditionalUserProperty.VALUE);
    }

    @NotNull
    public String toString() {
        return b.c(56, "GeneratedJsonAdapter(TouristCountSelectorV3DTO.AlertDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public TouristCountSelectorV3DTO.AlertDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        TouristCountSelectorV3DTO.AlertDTO.BrokenRuleDTO brokenRuleDTO = null;
        Restriction restriction = null;
        Boolean bool = null;
        Integer num = null;
        int i11 = -1;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                brokenRuleDTO = this.brokenRuleDTOAtEnumNullFallbackAdapter.fromJson(reader);
                if (brokenRuleDTO == null) {
                    throw c.q("brokenRule", "brokenRule", reader);
                }
                i11 = -2;
            } else if (v11 == 1) {
                restriction = this.restrictionAdapter.fromJson(reader);
                if (restriction == null) {
                    throw c.q(DeleteAccountApiResponse.Error.TYPE_RESTRICTION, DeleteAccountApiResponse.Error.TYPE_RESTRICTION, reader);
                }
            } else if (v11 == 2) {
                bool = this.booleanAdapter.fromJson(reader);
                if (bool == null) {
                    throw c.q("showAlertNow", "showAlertNow", reader);
                }
            } else if (v11 == 3) {
                num = this.nullableIntAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (i11 == -2) {
            Intrinsics.g(brokenRuleDTO, "null cannot be cast to non-null type ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.data.TouristCountSelectorV3DTO.AlertDTO.BrokenRuleDTO");
            if (restriction == null) {
                throw c.j(DeleteAccountApiResponse.Error.TYPE_RESTRICTION, DeleteAccountApiResponse.Error.TYPE_RESTRICTION, reader);
            }
            if (bool != null) {
                return new TouristCountSelectorV3DTO.AlertDTO(brokenRuleDTO, restriction, bool.booleanValue(), num);
            }
            throw c.j("showAlertNow", "showAlertNow", reader);
        }
        Constructor<TouristCountSelectorV3DTO.AlertDTO> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = TouristCountSelectorV3DTO.AlertDTO.class.getDeclaredConstructor(TouristCountSelectorV3DTO.AlertDTO.BrokenRuleDTO.class, Restriction.class, Boolean.TYPE, Integer.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (restriction == null) {
            throw c.j(DeleteAccountApiResponse.Error.TYPE_RESTRICTION, DeleteAccountApiResponse.Error.TYPE_RESTRICTION, reader);
        }
        if (bool == null) {
            throw c.j("showAlertNow", "showAlertNow", reader);
        }
        TouristCountSelectorV3DTO.AlertDTO newInstance = constructor.newInstance(brokenRuleDTO, restriction, bool, num, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, TouristCountSelectorV3DTO.AlertDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("brokenRule");
        this.brokenRuleDTOAtEnumNullFallbackAdapter.mo44toJson(writer, (x) value.getBrokenRule());
        writer.w(DeleteAccountApiResponse.Error.TYPE_RESTRICTION);
        this.restrictionAdapter.mo44toJson(writer, (x) value.getRestriction());
        writer.w("showAlertNow");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.getShowAlertNow()));
        writer.w(AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getValue());
        writer.p();
    }
}
