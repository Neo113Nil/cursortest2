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
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.data.ReviewFormDTO;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO_DetailedReviewConfigJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$DetailedReviewConfig;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$DetailedReviewConfig;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$DetailedReviewConfig;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "intAdapter", "Lcom/squareup/moshi/JsonAdapter;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReviewFormDTO_DetailedReviewConfigJsonAdapter extends JsonAdapter<ReviewFormDTO.DetailedReviewConfig> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<Integer> intAdapter;

    @NotNull
    private final n.a options;

    public ReviewFormDTO_DetailedReviewConfigJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("commentTextCount", "mediaCount", "points");
        this.intAdapter = moshi.f(Integer.TYPE, M.f71699a, "commentTextCount");
    }

    @NotNull
    public String toString() {
        return b.c(56, "GeneratedJsonAdapter(ReviewFormDTO.DetailedReviewConfig)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ReviewFormDTO.DetailedReviewConfig fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                num = this.intAdapter.fromJson(reader);
                if (num == null) {
                    throw c.q("commentTextCount", "commentTextCount", reader);
                }
            } else if (v11 == 1) {
                num2 = this.intAdapter.fromJson(reader);
                if (num2 == null) {
                    throw c.q("mediaCount", "mediaCount", reader);
                }
            } else if (v11 == 2 && (num3 = this.intAdapter.fromJson(reader)) == null) {
                throw c.q("points", "points", reader);
            }
        }
        reader.endObject();
        if (num == null) {
            throw c.j("commentTextCount", "commentTextCount", reader);
        }
        int intValue = num.intValue();
        if (num2 == null) {
            throw c.j("mediaCount", "mediaCount", reader);
        }
        int intValue2 = num2.intValue();
        if (num3 != null) {
            return new ReviewFormDTO.DetailedReviewConfig(intValue, intValue2, num3.intValue());
        }
        throw c.j("points", "points", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ReviewFormDTO.DetailedReviewConfig value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("commentTextCount");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getCommentTextCount()));
        writer.w("mediaCount");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getMediaCount()));
        writer.w("points");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getPoints()));
        writer.p();
    }
}
