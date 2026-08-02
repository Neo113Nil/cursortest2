package ru.ozon.app.android.ugc.payout.widgets.pinnedReview.data;

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
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R(\u0010$\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020#\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019R\u001c\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0019¨\u0006'"}, d2 = {"Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/data/PinnedReviewDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/data/PinnedReviewDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/data/PinnedReviewDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/data/PinnedReviewDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/data/ReviewHeaderDTO;", "reviewHeaderDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/data/ReviewBodyDTO;", "reviewBodyDTOAdapter", "Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/data/ReviewLabelButtonFooterDTO;", "reviewLabelButtonFooterDTOAdapter", "", "booleanAdapter", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "nullableAtomActionDTOAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "nullableCornerRadiusAdapter", "payout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PinnedReviewDTOJsonAdapter extends JsonAdapter<PinnedReviewDTO> {

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;

    @NotNull
    private final JsonAdapter<AtomActionDTO> nullableAtomActionDTOAdapter;

    @NotNull
    private final JsonAdapter<CornerRadius> nullableCornerRadiusAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<ReviewBodyDTO> reviewBodyDTOAdapter;

    @NotNull
    private final JsonAdapter<ReviewHeaderDTO> reviewHeaderDTOAdapter;

    @NotNull
    private final JsonAdapter<ReviewLabelButtonFooterDTO> reviewLabelButtonFooterDTOAdapter;

    public PinnedReviewDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("reviewHeader", "reviewBody", "reviewFooter", "isCollapsed", "action", "trackingInfo", "cornerRadius");
        M m11 = M.f71699a;
        this.reviewHeaderDTOAdapter = moshi.f(ReviewHeaderDTO.class, m11, "reviewHeader");
        this.reviewBodyDTOAdapter = moshi.f(ReviewBodyDTO.class, m11, "reviewBody");
        this.reviewLabelButtonFooterDTOAdapter = moshi.f(ReviewLabelButtonFooterDTO.class, m11, "reviewFooter");
        this.booleanAdapter = moshi.f(Boolean.TYPE, m11, "isCollapsed");
        this.nullableAtomActionDTOAdapter = moshi.f(AtomActionDTO.class, m11, "action");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
        this.nullableCornerRadiusAdapter = moshi.f(CornerRadius.class, m11, "cornerRadius");
    }

    @NotNull
    public String toString() {
        return b.c(37, "GeneratedJsonAdapter(PinnedReviewDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public PinnedReviewDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Boolean bool = null;
        ReviewHeaderDTO reviewHeaderDTO = null;
        ReviewBodyDTO reviewBodyDTO = null;
        ReviewLabelButtonFooterDTO reviewLabelButtonFooterDTO = null;
        AtomActionDTO atomActionDTO = null;
        Map<String, TokenizedTrackingInfo> map = null;
        CornerRadius cornerRadius = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    reviewHeaderDTO = this.reviewHeaderDTOAdapter.fromJson(reader);
                    if (reviewHeaderDTO == null) {
                        throw c.q("reviewHeader", "reviewHeader", reader);
                    }
                    break;
                case 1:
                    reviewBodyDTO = this.reviewBodyDTOAdapter.fromJson(reader);
                    if (reviewBodyDTO == null) {
                        throw c.q("reviewBody", "reviewBody", reader);
                    }
                    break;
                case 2:
                    reviewLabelButtonFooterDTO = this.reviewLabelButtonFooterDTOAdapter.fromJson(reader);
                    if (reviewLabelButtonFooterDTO == null) {
                        throw c.q("reviewFooter", "reviewFooter", reader);
                    }
                    break;
                case 3:
                    bool = this.booleanAdapter.fromJson(reader);
                    if (bool == null) {
                        throw c.q("isCollapsed", "isCollapsed", reader);
                    }
                    break;
                case 4:
                    atomActionDTO = this.nullableAtomActionDTOAdapter.fromJson(reader);
                    break;
                case 5:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
                case 6:
                    cornerRadius = this.nullableCornerRadiusAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (reviewHeaderDTO == null) {
            throw c.j("reviewHeader", "reviewHeader", reader);
        }
        if (reviewBodyDTO == null) {
            throw c.j("reviewBody", "reviewBody", reader);
        }
        if (reviewLabelButtonFooterDTO == null) {
            throw c.j("reviewFooter", "reviewFooter", reader);
        }
        if (bool != null) {
            return new PinnedReviewDTO(reviewHeaderDTO, reviewBodyDTO, reviewLabelButtonFooterDTO, bool.booleanValue(), atomActionDTO, map, cornerRadius);
        }
        throw c.j("isCollapsed", "isCollapsed", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, PinnedReviewDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("reviewHeader");
        this.reviewHeaderDTOAdapter.mo44toJson(writer, (x) value.getReviewHeader());
        writer.w("reviewBody");
        this.reviewBodyDTOAdapter.mo44toJson(writer, (x) value.getReviewBody());
        writer.w("reviewFooter");
        this.reviewLabelButtonFooterDTOAdapter.mo44toJson(writer, (x) value.getReviewFooter());
        writer.w("isCollapsed");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.isCollapsed()));
        writer.w("action");
        this.nullableAtomActionDTOAdapter.mo44toJson(writer, (x) value.getAction());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.w("cornerRadius");
        this.nullableCornerRadiusAdapter.mo44toJson(writer, (x) value.getCornerRadius());
        writer.p();
    }
}
