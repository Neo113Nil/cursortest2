package ru.ozon.app.android.monetization.widgets.matchShoppingCards.data;

import Ak.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.monetization.widgets.matchShoppingCards.data.MatchShoppingCardsDTO;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/monetization/widgets/matchShoppingCards/data/MatchShoppingCardsDTO_Card_TrackingInfoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/monetization/widgets/matchShoppingCards/data/MatchShoppingCardsDTO$Card$TrackingInfo;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/monetization/widgets/matchShoppingCards/data/MatchShoppingCardsDTO$Card$TrackingInfo;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/monetization/widgets/matchShoppingCards/data/MatchShoppingCardsDTO$Card$TrackingInfo;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableTokenizedTrackingInfoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class MatchShoppingCardsDTO_Card_TrackingInfoJsonAdapter extends JsonAdapter<MatchShoppingCardsDTO.Card.TrackingInfo> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<TokenizedTrackingInfo> nullableTokenizedTrackingInfoAdapter;

    @NotNull
    private final n.a options;

    public MatchShoppingCardsDTO_Card_TrackingInfoJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("click", "view", "like", "dislike", "swipeLeft", "swipeRight", "share");
        this.nullableTokenizedTrackingInfoAdapter = moshi.f(TokenizedTrackingInfo.class, M.f71699a, "click");
    }

    @NotNull
    public String toString() {
        return b.c(61, "GeneratedJsonAdapter(MatchShoppingCardsDTO.Card.TrackingInfo)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public MatchShoppingCardsDTO.Card.TrackingInfo fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        TokenizedTrackingInfo tokenizedTrackingInfo = null;
        TokenizedTrackingInfo tokenizedTrackingInfo2 = null;
        TokenizedTrackingInfo tokenizedTrackingInfo3 = null;
        TokenizedTrackingInfo tokenizedTrackingInfo4 = null;
        TokenizedTrackingInfo tokenizedTrackingInfo5 = null;
        TokenizedTrackingInfo tokenizedTrackingInfo6 = null;
        TokenizedTrackingInfo tokenizedTrackingInfo7 = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    tokenizedTrackingInfo = this.nullableTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
                case 1:
                    tokenizedTrackingInfo2 = this.nullableTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
                case 2:
                    tokenizedTrackingInfo3 = this.nullableTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
                case 3:
                    tokenizedTrackingInfo4 = this.nullableTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
                case 4:
                    tokenizedTrackingInfo5 = this.nullableTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
                case 5:
                    tokenizedTrackingInfo6 = this.nullableTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
                case 6:
                    tokenizedTrackingInfo7 = this.nullableTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        return new MatchShoppingCardsDTO.Card.TrackingInfo(tokenizedTrackingInfo, tokenizedTrackingInfo2, tokenizedTrackingInfo3, tokenizedTrackingInfo4, tokenizedTrackingInfo5, tokenizedTrackingInfo6, tokenizedTrackingInfo7);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, MatchShoppingCardsDTO.Card.TrackingInfo value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("click");
        this.nullableTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getClick());
        writer.w("view");
        this.nullableTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getView());
        writer.w("like");
        this.nullableTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getLike());
        writer.w("dislike");
        this.nullableTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getDislike());
        writer.w("swipeLeft");
        this.nullableTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getSwipeLeft());
        writer.w("swipeRight");
        this.nullableTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getSwipeRight());
        writer.w("share");
        this.nullableTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getShare());
        writer.p();
    }
}
