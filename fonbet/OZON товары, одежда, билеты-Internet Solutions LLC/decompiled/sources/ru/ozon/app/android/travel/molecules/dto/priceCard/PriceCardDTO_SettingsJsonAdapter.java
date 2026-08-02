package ru.ozon.app.android.travel.molecules.dto.priceCard;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.dto.priceCard.PriceCardDTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/travel/molecules/dto/priceCard/PriceCardDTO_SettingsJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/molecules/dto/priceCard/PriceCardDTO$Settings;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/molecules/dto/priceCard/PriceCardDTO$Settings;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/molecules/dto/priceCard/PriceCardDTO$Settings;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/common/Paddings;", "paddingsAtEnumNullFallbackAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "cornerRadiusAtEnumNullFallbackAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PriceCardDTO_SettingsJsonAdapter extends JsonAdapter<PriceCardDTO.Settings> {
    private volatile Constructor<PriceCardDTO.Settings> constructorRef;

    @NotNull
    private final JsonAdapter<CornerRadius> cornerRadiusAtEnumNullFallbackAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<Paddings> paddingsAtEnumNullFallbackAdapter;

    public PriceCardDTO_SettingsJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("topPadding", "bottomPadding", "leftPadding", "rightPadding", "cornerRadius");
        this.paddingsAtEnumNullFallbackAdapter = moshi.f(Paddings.class, e0.h(new EnumNullFallback() { // from class: ru.ozon.app.android.travel.molecules.dto.priceCard.PriceCardDTO_SettingsJsonAdapter$annotationImpl$ru_ozon_uni_atoms_parsing_adapter_annotation_EnumNullFallback$0
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
        }), "topPadding");
        this.cornerRadiusAtEnumNullFallbackAdapter = moshi.f(CornerRadius.class, e0.h(new EnumNullFallback() { // from class: ru.ozon.app.android.travel.molecules.dto.priceCard.PriceCardDTO_SettingsJsonAdapter$annotationImpl$ru_ozon_uni_atoms_parsing_adapter_annotation_EnumNullFallback$0
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
        return b.c(43, "GeneratedJsonAdapter(PriceCardDTO.Settings)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public PriceCardDTO.Settings fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Paddings paddings = null;
        Paddings paddings2 = null;
        Paddings paddings3 = null;
        Paddings paddings4 = null;
        CornerRadius cornerRadius = null;
        int i11 = -1;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                paddings = this.paddingsAtEnumNullFallbackAdapter.fromJson(reader);
                if (paddings == null) {
                    throw c.q("topPadding", "topPadding", reader);
                }
                i11 &= -2;
            } else if (v11 == 1) {
                paddings2 = this.paddingsAtEnumNullFallbackAdapter.fromJson(reader);
                if (paddings2 == null) {
                    throw c.q("bottomPadding", "bottomPadding", reader);
                }
                i11 &= -3;
            } else if (v11 == 2) {
                paddings3 = this.paddingsAtEnumNullFallbackAdapter.fromJson(reader);
                if (paddings3 == null) {
                    throw c.q("leftPadding", "leftPadding", reader);
                }
                i11 &= -5;
            } else if (v11 == 3) {
                paddings4 = this.paddingsAtEnumNullFallbackAdapter.fromJson(reader);
                if (paddings4 == null) {
                    throw c.q("rightPadding", "rightPadding", reader);
                }
                i11 &= -9;
            } else if (v11 == 4) {
                cornerRadius = this.cornerRadiusAtEnumNullFallbackAdapter.fromJson(reader);
                if (cornerRadius == null) {
                    throw c.q("cornerRadius", "cornerRadius", reader);
                }
                i11 &= -17;
            } else {
                continue;
            }
        }
        reader.endObject();
        if (i11 != -32) {
            Constructor<PriceCardDTO.Settings> constructor = this.constructorRef;
            if (constructor == null) {
                constructor = PriceCardDTO.Settings.class.getDeclaredConstructor(Paddings.class, Paddings.class, Paddings.class, Paddings.class, CornerRadius.class, Integer.TYPE, c.f34864d);
                this.constructorRef = constructor;
                Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
            }
            PriceCardDTO.Settings newInstance = constructor.newInstance(paddings, paddings2, paddings3, paddings4, cornerRadius, Integer.valueOf(i11), null);
            Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
            return newInstance;
        }
        Intrinsics.g(paddings, "null cannot be cast to non-null type ru.ozon.uni.atoms.data.common.Paddings");
        Intrinsics.g(paddings2, "null cannot be cast to non-null type ru.ozon.uni.atoms.data.common.Paddings");
        Intrinsics.g(paddings3, "null cannot be cast to non-null type ru.ozon.uni.atoms.data.common.Paddings");
        Intrinsics.g(paddings4, "null cannot be cast to non-null type ru.ozon.uni.atoms.data.common.Paddings");
        Intrinsics.g(cornerRadius, "null cannot be cast to non-null type ru.ozon.uni.atoms.data.common.CornerRadius");
        CornerRadius cornerRadius2 = cornerRadius;
        Paddings paddings5 = paddings4;
        return new PriceCardDTO.Settings(paddings, paddings2, paddings3, paddings5, cornerRadius2);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, PriceCardDTO.Settings value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("topPadding");
        this.paddingsAtEnumNullFallbackAdapter.mo44toJson(writer, (x) value.getTopPadding());
        writer.w("bottomPadding");
        this.paddingsAtEnumNullFallbackAdapter.mo44toJson(writer, (x) value.getBottomPadding());
        writer.w("leftPadding");
        this.paddingsAtEnumNullFallbackAdapter.mo44toJson(writer, (x) value.getLeftPadding());
        writer.w("rightPadding");
        this.paddingsAtEnumNullFallbackAdapter.mo44toJson(writer, (x) value.getRightPadding());
        writer.w("cornerRadius");
        this.cornerRadiusAtEnumNullFallbackAdapter.mo44toJson(writer, (x) value.getCornerRadius());
        writer.p();
    }
}
