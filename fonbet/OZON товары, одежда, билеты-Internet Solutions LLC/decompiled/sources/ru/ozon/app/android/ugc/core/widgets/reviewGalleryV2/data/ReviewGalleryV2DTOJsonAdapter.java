package ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data;

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
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.moshi.adapters.serialize.collection.JsonCollectionDecoding;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001a¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item;", "listOfReviewGalleryV2ItemAtJsonCollectionDecodingAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableIntAdapter", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$OnBackConfigDTO;", "nullableOnBackConfigDTOAdapter", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ReviewGalleryV2DTOJsonAdapter extends JsonAdapter<ReviewGalleryV2DTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<List<ReviewGalleryV2DTO.ReviewGalleryV2Item>> listOfReviewGalleryV2ItemAtJsonCollectionDecodingAdapter;

    @NotNull
    private final JsonAdapter<Integer> nullableIntAdapter;

    @NotNull
    private final JsonAdapter<ReviewGalleryV2DTO.OnBackConfigDTO> nullableOnBackConfigDTOAdapter;

    @NotNull
    private final n.a options;

    public ReviewGalleryV2DTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("items", "selectedIndex", "onBackConfig");
        this.listOfReviewGalleryV2ItemAtJsonCollectionDecodingAdapter = moshi.f(D.e(List.class, ReviewGalleryV2DTO.ReviewGalleryV2Item.class), e0.h(new JsonCollectionDecoding() { // from class: ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTOJsonAdapter$annotationImpl$ru_ozon_moshi_adapters_serialize_collection_JsonCollectionDecoding$0
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
        M m11 = M.f71699a;
        this.nullableIntAdapter = moshi.f(Integer.class, m11, "selectedIndex");
        this.nullableOnBackConfigDTOAdapter = moshi.f(ReviewGalleryV2DTO.OnBackConfigDTO.class, m11, "onBackConfig");
    }

    @NotNull
    public String toString() {
        return b.c(40, "GeneratedJsonAdapter(ReviewGalleryV2DTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ReviewGalleryV2DTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        List<ReviewGalleryV2DTO.ReviewGalleryV2Item> list = null;
        Integer num = null;
        ReviewGalleryV2DTO.OnBackConfigDTO onBackConfigDTO = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                list = this.listOfReviewGalleryV2ItemAtJsonCollectionDecodingAdapter.fromJson(reader);
                if (list == null) {
                    throw c.q("items", "items", reader);
                }
            } else if (v11 == 1) {
                num = this.nullableIntAdapter.fromJson(reader);
            } else if (v11 == 2) {
                onBackConfigDTO = this.nullableOnBackConfigDTOAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (list != null) {
            return new ReviewGalleryV2DTO(list, num, onBackConfigDTO);
        }
        throw c.j("items", "items", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ReviewGalleryV2DTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("items");
        this.listOfReviewGalleryV2ItemAtJsonCollectionDecodingAdapter.mo44toJson(writer, (x) value.getItems());
        writer.w("selectedIndex");
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getSelectedIndex());
        writer.w("onBackConfig");
        this.nullableOnBackConfigDTOAdapter.mo44toJson(writer, (x) value.getOnBackConfig());
        writer.p();
    }
}
