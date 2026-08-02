package ru.ozon.app.android.ugc.widgets.reviewFormMobile.data;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.islandSeparator.data.IslandSeparatorDTO;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.data.ReviewFormFieldDTO;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormFieldDTO_IslandSeparatorItemDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormFieldDTO$IslandSeparatorItemDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormFieldDTO$IslandSeparatorItemDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormFieldDTO$IslandSeparatorItemDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/android/composerCommonViewKit/islandSeparator/data/IslandSeparatorDTO;", "islandSeparatorDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableBooleanAdapter", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReviewFormFieldDTO_IslandSeparatorItemDTOJsonAdapter extends JsonAdapter<ReviewFormFieldDTO.IslandSeparatorItemDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<IslandSeparatorDTO> islandSeparatorDTOAdapter;

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final n.a options;

    public ReviewFormFieldDTO_IslandSeparatorItemDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("islandSeparator", "isHidden");
        M m11 = M.f71699a;
        this.islandSeparatorDTOAdapter = moshi.f(IslandSeparatorDTO.class, m11, "islandSeparator");
        this.nullableBooleanAdapter = moshi.f(Boolean.class, m11, "isHidden");
    }

    @NotNull
    public String toString() {
        return b.c(63, "GeneratedJsonAdapter(ReviewFormFieldDTO.IslandSeparatorItemDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ReviewFormFieldDTO.IslandSeparatorItemDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        IslandSeparatorDTO islandSeparatorDTO = null;
        Boolean bool = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                islandSeparatorDTO = this.islandSeparatorDTOAdapter.fromJson(reader);
                if (islandSeparatorDTO == null) {
                    throw c.q("islandSeparator", "islandSeparator", reader);
                }
            } else if (v11 == 1) {
                bool = this.nullableBooleanAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (islandSeparatorDTO != null) {
            return new ReviewFormFieldDTO.IslandSeparatorItemDTO(islandSeparatorDTO, bool);
        }
        throw c.j("islandSeparator", "islandSeparator", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ReviewFormFieldDTO.IslandSeparatorItemDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("islandSeparator");
        this.islandSeparatorDTOAdapter.mo44toJson(writer, (x) value.getIslandSeparator());
        writer.w("isHidden");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.isHidden());
        writer.p();
    }
}
