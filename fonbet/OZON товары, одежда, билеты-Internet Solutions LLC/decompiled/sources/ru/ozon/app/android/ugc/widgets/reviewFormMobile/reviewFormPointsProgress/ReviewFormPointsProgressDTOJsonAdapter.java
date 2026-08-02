package ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormPointsProgress;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.presentation.HigherPointsTerms;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormPointsProgress.ReviewFormPointsProgressDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R&\u0010\u001e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019¨\u0006!"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormPointsProgress/ReviewFormPointsProgressDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormPointsProgress/ReviewFormPointsProgressDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormPointsProgress/ReviewFormPointsProgressDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormPointsProgress/ReviewFormPointsProgressDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "cellDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "stringAdapter", "", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormPointsProgress/ReviewFormPointsProgressDTO$FieldType;", "", "mapOfFieldTypeIntAdapter", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/HigherPointsTerms;", "nullableHigherPointsTermsAdapter", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReviewFormPointsProgressDTOJsonAdapter extends JsonAdapter<ReviewFormPointsProgressDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<CellDTO> cellDTOAdapter;

    @NotNull
    private final JsonAdapter<Map<ReviewFormPointsProgressDTO.FieldType, Integer>> mapOfFieldTypeIntAdapter;

    @NotNull
    private final JsonAdapter<HigherPointsTerms> nullableHigherPointsTermsAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public ReviewFormPointsProgressDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("pointsCell", "progressBarColor", "pointsMap", "higherPointsTerms");
        M m11 = M.f71699a;
        this.cellDTOAdapter = moshi.f(CellDTO.class, m11, "pointsCell");
        this.stringAdapter = moshi.f(String.class, m11, "progressBarColor");
        this.mapOfFieldTypeIntAdapter = moshi.f(D.e(Map.class, ReviewFormPointsProgressDTO.FieldType.class, Integer.class), m11, "pointsMap");
        this.nullableHigherPointsTermsAdapter = moshi.f(HigherPointsTerms.class, m11, "higherPointsTerms");
    }

    @NotNull
    public String toString() {
        return b.c(49, "GeneratedJsonAdapter(ReviewFormPointsProgressDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ReviewFormPointsProgressDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        CellDTO cellDTO = null;
        String str = null;
        Map<ReviewFormPointsProgressDTO.FieldType, Integer> map = null;
        HigherPointsTerms higherPointsTerms = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                cellDTO = this.cellDTOAdapter.fromJson(reader);
                if (cellDTO == null) {
                    throw c.q("pointsCell", "pointsCell", reader);
                }
            } else if (v11 == 1) {
                str = this.stringAdapter.fromJson(reader);
                if (str == null) {
                    throw c.q("progressBarColor", "progressBarColor", reader);
                }
            } else if (v11 == 2) {
                map = this.mapOfFieldTypeIntAdapter.fromJson(reader);
                if (map == null) {
                    throw c.q("pointsMap", "pointsMap", reader);
                }
            } else if (v11 == 3) {
                higherPointsTerms = this.nullableHigherPointsTermsAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (cellDTO == null) {
            throw c.j("pointsCell", "pointsCell", reader);
        }
        if (str == null) {
            throw c.j("progressBarColor", "progressBarColor", reader);
        }
        if (map != null) {
            return new ReviewFormPointsProgressDTO(cellDTO, str, map, higherPointsTerms);
        }
        throw c.j("pointsMap", "pointsMap", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ReviewFormPointsProgressDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("pointsCell");
        this.cellDTOAdapter.mo44toJson(writer, (x) value.getPointsCell());
        writer.w("progressBarColor");
        this.stringAdapter.mo44toJson(writer, (x) value.getProgressBarColor());
        writer.w("pointsMap");
        this.mapOfFieldTypeIntAdapter.mo44toJson(writer, (x) value.getPointsMap());
        writer.w("higherPointsTerms");
        this.nullableHigherPointsTermsAdapter.mo44toJson(writer, (x) value.getHigherPointsTerms());
        writer.p();
    }
}
