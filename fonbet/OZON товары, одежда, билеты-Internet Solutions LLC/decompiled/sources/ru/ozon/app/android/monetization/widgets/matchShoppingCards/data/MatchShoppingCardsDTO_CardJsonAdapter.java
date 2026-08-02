package ru.ozon.app.android.monetization.widgets.matchShoppingCards.data;

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
import ru.ozon.app.android.monetization.widgets.matchShoppingCards.data.MatchShoppingCardsDTO;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.TestInfo;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019¨\u0006!"}, d2 = {"Lru/ozon/app/android/monetization/widgets/matchShoppingCards/data/MatchShoppingCardsDTO_CardJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/monetization/widgets/matchShoppingCards/data/MatchShoppingCardsDTO$Card;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/monetization/widgets/matchShoppingCards/data/MatchShoppingCardsDTO$Card;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/monetization/widgets/matchShoppingCards/data/MatchShoppingCardsDTO$Card;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/monetization/widgets/matchShoppingCards/data/MatchShoppingCardsDTO$ProductInfo;", "productInfoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "atomActionDTOAdapter", "nullableAtomActionDTOAdapter", "Lru/ozon/app/android/monetization/widgets/matchShoppingCards/data/MatchShoppingCardsDTO$Card$TrackingInfo;", "nullableTrackingInfoAdapter", "Lru/ozon/uni/atoms/data/TestInfo;", "nullableTestInfoAdapter", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class MatchShoppingCardsDTO_CardJsonAdapter extends JsonAdapter<MatchShoppingCardsDTO.Card> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<AtomActionDTO> atomActionDTOAdapter;

    @NotNull
    private final JsonAdapter<AtomActionDTO> nullableAtomActionDTOAdapter;

    @NotNull
    private final JsonAdapter<TestInfo> nullableTestInfoAdapter;

    @NotNull
    private final JsonAdapter<MatchShoppingCardsDTO.Card.TrackingInfo> nullableTrackingInfoAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<MatchShoppingCardsDTO.ProductInfo> productInfoAdapter;

    public MatchShoppingCardsDTO_CardJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a(ReviewGalleryV2DTO.ReviewGalleryV2Item.ProductItemContentDTO.PRODUCT_INFO_FIELD_NAME, "likeAction", "dislikeAction", "shareAction", "trackingInfo", "testInfo");
        M m11 = M.f71699a;
        this.productInfoAdapter = moshi.f(MatchShoppingCardsDTO.ProductInfo.class, m11, ReviewGalleryV2DTO.ReviewGalleryV2Item.ProductItemContentDTO.PRODUCT_INFO_FIELD_NAME);
        this.atomActionDTOAdapter = moshi.f(AtomActionDTO.class, m11, "likeAction");
        this.nullableAtomActionDTOAdapter = moshi.f(AtomActionDTO.class, m11, "dislikeAction");
        this.nullableTrackingInfoAdapter = moshi.f(MatchShoppingCardsDTO.Card.TrackingInfo.class, m11, "trackingInfo");
        this.nullableTestInfoAdapter = moshi.f(TestInfo.class, m11, "testInfo");
    }

    @NotNull
    public String toString() {
        return b.c(48, "GeneratedJsonAdapter(MatchShoppingCardsDTO.Card)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public MatchShoppingCardsDTO.Card fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        MatchShoppingCardsDTO.ProductInfo productInfo = null;
        AtomActionDTO atomActionDTO = null;
        AtomActionDTO atomActionDTO2 = null;
        AtomActionDTO atomActionDTO3 = null;
        MatchShoppingCardsDTO.Card.TrackingInfo trackingInfo = null;
        TestInfo testInfo = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    productInfo = this.productInfoAdapter.fromJson(reader);
                    if (productInfo == null) {
                        throw c.q(ReviewGalleryV2DTO.ReviewGalleryV2Item.ProductItemContentDTO.PRODUCT_INFO_FIELD_NAME, ReviewGalleryV2DTO.ReviewGalleryV2Item.ProductItemContentDTO.PRODUCT_INFO_FIELD_NAME, reader);
                    }
                    break;
                case 1:
                    atomActionDTO = this.atomActionDTOAdapter.fromJson(reader);
                    if (atomActionDTO == null) {
                        throw c.q("likeAction", "likeAction", reader);
                    }
                    break;
                case 2:
                    atomActionDTO2 = this.nullableAtomActionDTOAdapter.fromJson(reader);
                    break;
                case 3:
                    atomActionDTO3 = this.atomActionDTOAdapter.fromJson(reader);
                    if (atomActionDTO3 == null) {
                        throw c.q("shareAction", "shareAction", reader);
                    }
                    break;
                case 4:
                    trackingInfo = this.nullableTrackingInfoAdapter.fromJson(reader);
                    break;
                case 5:
                    testInfo = this.nullableTestInfoAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (productInfo == null) {
            throw c.j(ReviewGalleryV2DTO.ReviewGalleryV2Item.ProductItemContentDTO.PRODUCT_INFO_FIELD_NAME, ReviewGalleryV2DTO.ReviewGalleryV2Item.ProductItemContentDTO.PRODUCT_INFO_FIELD_NAME, reader);
        }
        if (atomActionDTO == null) {
            throw c.j("likeAction", "likeAction", reader);
        }
        if (atomActionDTO3 != null) {
            return new MatchShoppingCardsDTO.Card(productInfo, atomActionDTO, atomActionDTO2, atomActionDTO3, trackingInfo, testInfo);
        }
        throw c.j("shareAction", "shareAction", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, MatchShoppingCardsDTO.Card value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(ReviewGalleryV2DTO.ReviewGalleryV2Item.ProductItemContentDTO.PRODUCT_INFO_FIELD_NAME);
        this.productInfoAdapter.mo44toJson(writer, (x) value.getProductInfo());
        writer.w("likeAction");
        this.atomActionDTOAdapter.mo44toJson(writer, (x) value.getLikeAction());
        writer.w("dislikeAction");
        this.nullableAtomActionDTOAdapter.mo44toJson(writer, (x) value.getDislikeAction());
        writer.w("shareAction");
        this.atomActionDTOAdapter.mo44toJson(writer, (x) value.getShareAction());
        writer.w("trackingInfo");
        this.nullableTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.w("testInfo");
        this.nullableTestInfoAdapter.mo44toJson(writer, (x) value.getTestInfo());
        writer.p();
    }
}
