package ru.ozon.app.android.ugc.core.widgets.listreviews.data;

import Y9.b;
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
import ru.ozon.app.android.pdp.ui.configurators.ugc.singleReview.SingleReviewDTO;
import ru.ozon.app.android.ugc.core.widgets.listreviews.data.ListReviewsDTO;
import ru.ozon.moshi.adapters.serialize.collection.JsonCollectionDecoding;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\"\u0010\u0019\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\"\u0010\u001c\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001a¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/listreviews/data/ListReviewsDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/ugc/core/widgets/listreviews/data/ListReviewsDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/ugc/core/widgets/listreviews/data/ListReviewsDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/ugc/core/widgets/listreviews/data/ListReviewsDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO;", "nullableListOfSingleReviewDTOAtJsonCollectionDecodingAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/ugc/core/widgets/listreviews/data/ListReviewsDTO$Sort;", "nullableListOfSortAdapter", "Lru/ozon/app/android/ugc/core/widgets/listreviews/data/ListReviewsDTO$MoreReviews;", "nullableMoreReviewsAdapter", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ListReviewsDTOJsonAdapter extends JsonAdapter<ListReviewsDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<List<SingleReviewDTO>> nullableListOfSingleReviewDTOAtJsonCollectionDecodingAdapter;

    @NotNull
    private final JsonAdapter<List<ListReviewsDTO.Sort>> nullableListOfSortAdapter;

    @NotNull
    private final JsonAdapter<ListReviewsDTO.MoreReviews> nullableMoreReviewsAdapter;

    @NotNull
    private final n.a options;

    public ListReviewsDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("reviews", "sort", "moreReviews");
        this.nullableListOfSingleReviewDTOAtJsonCollectionDecodingAdapter = moshi.f(D.e(List.class, SingleReviewDTO.class), e0.h(new JsonCollectionDecoding() { // from class: ru.ozon.app.android.ugc.core.widgets.listreviews.data.ListReviewsDTOJsonAdapter$annotationImpl$ru_ozon_moshi_adapters_serialize_collection_JsonCollectionDecoding$0
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
        }), "reviews");
        b e11 = D.e(List.class, ListReviewsDTO.Sort.class);
        M m11 = M.f71699a;
        this.nullableListOfSortAdapter = moshi.f(e11, m11, "sort");
        this.nullableMoreReviewsAdapter = moshi.f(ListReviewsDTO.MoreReviews.class, m11, "moreReviews");
    }

    @NotNull
    public String toString() {
        return Ak.b.c(36, "GeneratedJsonAdapter(ListReviewsDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ListReviewsDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        List<SingleReviewDTO> list = null;
        List<ListReviewsDTO.Sort> list2 = null;
        ListReviewsDTO.MoreReviews moreReviews = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                list = this.nullableListOfSingleReviewDTOAtJsonCollectionDecodingAdapter.fromJson(reader);
            } else if (v11 == 1) {
                list2 = this.nullableListOfSortAdapter.fromJson(reader);
            } else if (v11 == 2) {
                moreReviews = this.nullableMoreReviewsAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        return new ListReviewsDTO(list, list2, moreReviews);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ListReviewsDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("reviews");
        this.nullableListOfSingleReviewDTOAtJsonCollectionDecodingAdapter.mo44toJson(writer, (x) value.getReviews());
        writer.w("sort");
        this.nullableListOfSortAdapter.mo44toJson(writer, (x) value.getSort());
        writer.w("moreReviews");
        this.nullableMoreReviewsAdapter.mo44toJson(writer, (x) value.getMoreReviews());
        writer.p();
    }
}
