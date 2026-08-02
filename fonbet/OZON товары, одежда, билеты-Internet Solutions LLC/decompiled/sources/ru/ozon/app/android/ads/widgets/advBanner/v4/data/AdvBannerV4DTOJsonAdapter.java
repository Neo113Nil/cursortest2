package ru.ozon.app.android.ads.widgets.advBanner.v4.data;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ads.widgets.advBanner.v4.data.AdvBannerV4DTO;
import ru.ozon.moshi.adapters.serialize.collection.JsonCollectionDecoding;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R \u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u001c\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019R\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0019¨\u0006&"}, d2 = {"Lru/ozon/app/android/ads/widgets/advBanner/v4/data/AdvBannerV4DTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/ads/widgets/advBanner/v4/data/AdvBannerV4DTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/ads/widgets/advBanner/v4/data/AdvBannerV4DTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/ads/widgets/advBanner/v4/data/AdvBannerV4DTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "nullableDoubleAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/ads/widgets/advBanner/v4/data/AdvBannerV4DTO$DesignTypeDTO;", "designTypeDTOAdapter", "", "Lru/ozon/app/android/ads/widgets/advBanner/v4/data/AdvBannerV4DTO$ItemDTO;", "listOfItemDTOAtJsonCollectionDecodingAdapter", "Lru/ozon/app/android/ads/widgets/advBanner/v4/data/AdvBannerV4DTO$DesignOptionsDTO;", "nullableDesignOptionsDTOAdapter", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "nullableBadgeDTOAdapter", "Lru/ozon/app/android/ads/widgets/advBanner/v4/data/AdvBannerV4DTO$RotationOptions;", "nullableRotationOptionsAdapter", "nullableStringAdapter", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AdvBannerV4DTOJsonAdapter extends JsonAdapter<AdvBannerV4DTO> {

    @NotNull
    private final JsonAdapter<AdvBannerV4DTO.DesignTypeDTO> designTypeDTOAdapter;

    @NotNull
    private final JsonAdapter<List<AdvBannerV4DTO.ItemDTO>> listOfItemDTOAtJsonCollectionDecodingAdapter;

    @NotNull
    private final JsonAdapter<BadgeDTO> nullableBadgeDTOAdapter;

    @NotNull
    private final JsonAdapter<AdvBannerV4DTO.DesignOptionsDTO> nullableDesignOptionsDTOAdapter;

    @NotNull
    private final JsonAdapter<Double> nullableDoubleAdapter;

    @NotNull
    private final JsonAdapter<AdvBannerV4DTO.RotationOptions> nullableRotationOptionsAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    public AdvBannerV4DTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("aspectRation", "designType", "items", "designOptions", "badgeV2", "rotationOptions", "backgroundColor");
        M m11 = M.f71699a;
        this.nullableDoubleAdapter = moshi.f(Double.class, m11, "aspectRation");
        this.designTypeDTOAdapter = moshi.f(AdvBannerV4DTO.DesignTypeDTO.class, m11, "designType");
        this.listOfItemDTOAtJsonCollectionDecodingAdapter = moshi.f(D.e(List.class, AdvBannerV4DTO.ItemDTO.class), e0.h(new JsonCollectionDecoding() { // from class: ru.ozon.app.android.ads.widgets.advBanner.v4.data.AdvBannerV4DTOJsonAdapter$annotationImpl$ru_ozon_moshi_adapters_serialize_collection_JsonCollectionDecoding$0
            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return JsonCollectionDecoding.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                return obj instanceof JsonCollectionDecoding;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return 0;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                return "@ru.ozon.moshi.adapters.serialize.collection.JsonCollectionDecoding()";
            }
        }), "items");
        this.nullableDesignOptionsDTOAdapter = moshi.f(AdvBannerV4DTO.DesignOptionsDTO.class, m11, "designOptions");
        this.nullableBadgeDTOAdapter = moshi.f(BadgeDTO.class, m11, "badgeV2");
        this.nullableRotationOptionsAdapter = moshi.f(AdvBannerV4DTO.RotationOptions.class, m11, "rotationOptions");
        this.nullableStringAdapter = moshi.f(String.class, m11, "backgroundColor");
    }

    @NotNull
    public String toString() {
        return b.c(36, "GeneratedJsonAdapter(AdvBannerV4DTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public AdvBannerV4DTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Double d11 = null;
        AdvBannerV4DTO.DesignTypeDTO designTypeDTO = null;
        List<AdvBannerV4DTO.ItemDTO> list = null;
        AdvBannerV4DTO.DesignOptionsDTO designOptionsDTO = null;
        BadgeDTO badgeDTO = null;
        AdvBannerV4DTO.RotationOptions rotationOptions = null;
        String str = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    d11 = this.nullableDoubleAdapter.fromJson(reader);
                    break;
                case 1:
                    designTypeDTO = this.designTypeDTOAdapter.fromJson(reader);
                    if (designTypeDTO == null) {
                        throw c.q("designType", "designType", reader);
                    }
                    break;
                case 2:
                    list = this.listOfItemDTOAtJsonCollectionDecodingAdapter.fromJson(reader);
                    if (list == null) {
                        throw c.q("items", "items", reader);
                    }
                    break;
                case 3:
                    designOptionsDTO = this.nullableDesignOptionsDTOAdapter.fromJson(reader);
                    break;
                case 4:
                    badgeDTO = this.nullableBadgeDTOAdapter.fromJson(reader);
                    break;
                case 5:
                    rotationOptions = this.nullableRotationOptionsAdapter.fromJson(reader);
                    break;
                case 6:
                    str = this.nullableStringAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (designTypeDTO == null) {
            throw c.j("designType", "designType", reader);
        }
        if (list != null) {
            return new AdvBannerV4DTO(d11, designTypeDTO, list, designOptionsDTO, badgeDTO, rotationOptions, str);
        }
        throw c.j("items", "items", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, AdvBannerV4DTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("aspectRation");
        this.nullableDoubleAdapter.mo44toJson(writer, (x) value.getAspectRation());
        writer.w("designType");
        this.designTypeDTOAdapter.mo44toJson(writer, (x) value.getDesignType());
        writer.w("items");
        this.listOfItemDTOAtJsonCollectionDecodingAdapter.mo44toJson(writer, (x) value.getItems());
        writer.w("designOptions");
        this.nullableDesignOptionsDTOAdapter.mo44toJson(writer, (x) value.getDesignOptions());
        writer.w("badgeV2");
        this.nullableBadgeDTOAdapter.mo44toJson(writer, (x) value.getBadgeV2());
        writer.w("rotationOptions");
        this.nullableRotationOptionsAdapter.mo44toJson(writer, (x) value.getRotationOptions());
        writer.w("backgroundColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getBackgroundColor());
        writer.p();
    }
}
