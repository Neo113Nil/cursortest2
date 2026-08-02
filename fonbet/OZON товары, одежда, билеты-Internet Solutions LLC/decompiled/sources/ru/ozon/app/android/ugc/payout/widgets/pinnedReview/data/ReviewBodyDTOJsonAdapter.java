package ru.ozon.app.android.ugc.payout.widgets.pinnedReview.data;

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
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.payout.widgets.pinnedReview.data.ReviewBodyDTO;
import ru.ozon.uni.atoms.data.cell.IconTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\"\u0010\u0019\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\"\u0010\u001c\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\"\u0010\u001e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001aR\"\u0010 \u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001a¨\u0006!"}, d2 = {"Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/data/ReviewBodyDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/data/ReviewBodyDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/data/ReviewBodyDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/data/ReviewBodyDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "Lru/ozon/uni/atoms/data/cell/IconTitleSubtitleCellDTO;", "nullableListOfIconTitleSubtitleCellDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/data/ReviewBodyDTO$MediaDTO;", "nullableListOfMediaDTOAdapter", "Lru/ozon/uni/atoms/data/text/TextDTO;", "nullableListOfTextDTOAdapter", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "nullableListOfBadgeDTOAdapter", "payout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReviewBodyDTOJsonAdapter extends JsonAdapter<ReviewBodyDTO> {

    @NotNull
    private final JsonAdapter<List<BadgeDTO>> nullableListOfBadgeDTOAdapter;

    @NotNull
    private final JsonAdapter<List<IconTitleSubtitleCellDTO>> nullableListOfIconTitleSubtitleCellDTOAdapter;

    @NotNull
    private final JsonAdapter<List<ReviewBodyDTO.MediaDTO>> nullableListOfMediaDTOAdapter;

    @NotNull
    private final JsonAdapter<List<TextDTO>> nullableListOfTextDTOAdapter;

    @NotNull
    private final n.a options;

    public ReviewBodyDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("content", "mediaPreviews", "contextReviews", "badges");
        b e11 = D.e(List.class, IconTitleSubtitleCellDTO.class);
        M m11 = M.f71699a;
        this.nullableListOfIconTitleSubtitleCellDTOAdapter = moshi.f(e11, m11, "content");
        this.nullableListOfMediaDTOAdapter = moshi.f(D.e(List.class, ReviewBodyDTO.MediaDTO.class), m11, "mediaPreviews");
        this.nullableListOfTextDTOAdapter = moshi.f(D.e(List.class, TextDTO.class), m11, "contextReviews");
        this.nullableListOfBadgeDTOAdapter = moshi.f(D.e(List.class, BadgeDTO.class), m11, "badges");
    }

    @NotNull
    public String toString() {
        return Ak.b.c(35, "GeneratedJsonAdapter(ReviewBodyDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ReviewBodyDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        List<IconTitleSubtitleCellDTO> list = null;
        List<ReviewBodyDTO.MediaDTO> list2 = null;
        List<TextDTO> list3 = null;
        List<BadgeDTO> list4 = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                list = this.nullableListOfIconTitleSubtitleCellDTOAdapter.fromJson(reader);
            } else if (v11 == 1) {
                list2 = this.nullableListOfMediaDTOAdapter.fromJson(reader);
            } else if (v11 == 2) {
                list3 = this.nullableListOfTextDTOAdapter.fromJson(reader);
            } else if (v11 == 3) {
                list4 = this.nullableListOfBadgeDTOAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        return new ReviewBodyDTO(list, list2, list3, list4);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ReviewBodyDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("content");
        this.nullableListOfIconTitleSubtitleCellDTOAdapter.mo44toJson(writer, (x) value.getContent());
        writer.w("mediaPreviews");
        this.nullableListOfMediaDTOAdapter.mo44toJson(writer, (x) value.getMediaPreviews());
        writer.w("contextReviews");
        this.nullableListOfTextDTOAdapter.mo44toJson(writer, (x) value.getContextReviews());
        writer.w("badges");
        this.nullableListOfBadgeDTOAdapter.mo44toJson(writer, (x) value.getBadges());
        writer.p();
    }
}
