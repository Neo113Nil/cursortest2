package ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewProductTile.ReviewProductTileDTO;
import ru.ozon.app.android.storefront.core.socialAtoms.iconButton.SocialIconButtonDTO;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;

@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R(\u0010&\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020%\u0018\u00010$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0019R\u001c\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0019R\u001c\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010)0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\u0019R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\u0019R\u001c\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010,0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010\u0019R\u001c\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010.0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010\u0019R\u001a\u00101\u001a\b\u0012\u0004\u0012\u0002000\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010\u0019R\u001e\u00103\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104¨\u00065"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO_ReviewGalleryV2ItemJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$ContentWrapper;", "contentWrapperAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$ReviewUser;", "nullableReviewUserAdapter", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewProductTile/ReviewProductTileDTO;", "nullableReviewProductTileDTOAdapter", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$ProductRatingDTO;", "nullableProductRatingDTOAdapter", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$ReviewsRightPanelDTO;", "nullableReviewsRightPanelDTOAdapter", "Lru/ozon/app/android/storefront/core/socialAtoms/iconButton/SocialIconButtonDTO;", "nullableSocialIconButtonDTOAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "nullableBadgeDTOAdapter", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$SocialUser;", "nullableSocialUserAdapter", "stringAdapter", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "nullableAtomActionDTOAdapter", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$ItemsContainerDTO;", "nullableItemsContainerDTOAdapter", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$VideoControlsMode;", "videoControlsModeAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ReviewGalleryV2DTO_ReviewGalleryV2ItemJsonAdapter extends JsonAdapter<ReviewGalleryV2DTO.ReviewGalleryV2Item> {
    public static final int $stable = 8;
    private volatile Constructor<ReviewGalleryV2DTO.ReviewGalleryV2Item> constructorRef;

    @NotNull
    private final JsonAdapter<ReviewGalleryV2DTO.ReviewGalleryV2Item.ContentWrapper> contentWrapperAdapter;

    @NotNull
    private final JsonAdapter<AtomActionDTO> nullableAtomActionDTOAdapter;

    @NotNull
    private final JsonAdapter<BadgeDTO> nullableBadgeDTOAdapter;

    @NotNull
    private final JsonAdapter<ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO> nullableItemsContainerDTOAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<ReviewGalleryV2DTO.ReviewGalleryV2Item.ProductRatingDTO> nullableProductRatingDTOAdapter;

    @NotNull
    private final JsonAdapter<ReviewProductTileDTO> nullableReviewProductTileDTOAdapter;

    @NotNull
    private final JsonAdapter<ReviewGalleryV2DTO.ReviewGalleryV2Item.ReviewUser> nullableReviewUserAdapter;

    @NotNull
    private final JsonAdapter<ReviewGalleryV2DTO.ReviewGalleryV2Item.ReviewsRightPanelDTO> nullableReviewsRightPanelDTOAdapter;

    @NotNull
    private final JsonAdapter<SocialIconButtonDTO> nullableSocialIconButtonDTOAdapter;

    @NotNull
    private final JsonAdapter<ReviewGalleryV2DTO.ReviewGalleryV2Item.SocialUser> nullableSocialUserAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    @NotNull
    private final JsonAdapter<ReviewGalleryV2DTO.ReviewGalleryV2Item.VideoControlsMode> videoControlsModeAdapter;

    public ReviewGalleryV2DTO_ReviewGalleryV2ItemJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("content", "user", ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME, "rating", "rightPanel", "closeButton", "trackingInfo", "prevTrackingInfo", "nextTrackingInfo", "badge", ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.SOCIAL_USER_FIELD_NAME, "reviewUuid", "contentViewAction", "topMediaItems", "bottomMediaItems", "bottomItems", "videoControlsMode");
        M m11 = M.f71699a;
        this.contentWrapperAdapter = moshi.f(ReviewGalleryV2DTO.ReviewGalleryV2Item.ContentWrapper.class, m11, "content");
        this.nullableReviewUserAdapter = moshi.f(ReviewGalleryV2DTO.ReviewGalleryV2Item.ReviewUser.class, m11, "user");
        this.nullableReviewProductTileDTOAdapter = moshi.f(ReviewProductTileDTO.class, m11, ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME);
        this.nullableProductRatingDTOAdapter = moshi.f(ReviewGalleryV2DTO.ReviewGalleryV2Item.ProductRatingDTO.class, m11, "rating");
        this.nullableReviewsRightPanelDTOAdapter = moshi.f(ReviewGalleryV2DTO.ReviewGalleryV2Item.ReviewsRightPanelDTO.class, m11, "rightPanel");
        this.nullableSocialIconButtonDTOAdapter = moshi.f(SocialIconButtonDTO.class, m11, "closeButton");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
        this.nullableBadgeDTOAdapter = moshi.f(BadgeDTO.class, m11, "badge");
        this.nullableSocialUserAdapter = moshi.f(ReviewGalleryV2DTO.ReviewGalleryV2Item.SocialUser.class, m11, ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.SOCIAL_USER_FIELD_NAME);
        this.stringAdapter = moshi.f(String.class, m11, "reviewUuid");
        this.nullableAtomActionDTOAdapter = moshi.f(AtomActionDTO.class, m11, "contentViewAction");
        this.nullableItemsContainerDTOAdapter = moshi.f(ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.class, m11, "topMediaItems");
        this.videoControlsModeAdapter = moshi.f(ReviewGalleryV2DTO.ReviewGalleryV2Item.VideoControlsMode.class, m11, "videoControlsMode");
    }

    @NotNull
    public String toString() {
        return b.c(60, "GeneratedJsonAdapter(ReviewGalleryV2DTO.ReviewGalleryV2Item)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ReviewGalleryV2DTO.ReviewGalleryV2Item fromJson(@NotNull n reader) {
        int i11;
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        ReviewGalleryV2DTO.ReviewGalleryV2Item.VideoControlsMode videoControlsMode = null;
        int i12 = -1;
        ReviewGalleryV2DTO.ReviewGalleryV2Item.ContentWrapper contentWrapper = null;
        ReviewGalleryV2DTO.ReviewGalleryV2Item.ReviewUser reviewUser = null;
        ReviewProductTileDTO reviewProductTileDTO = null;
        ReviewGalleryV2DTO.ReviewGalleryV2Item.ProductRatingDTO productRatingDTO = null;
        ReviewGalleryV2DTO.ReviewGalleryV2Item.ReviewsRightPanelDTO reviewsRightPanelDTO = null;
        SocialIconButtonDTO socialIconButtonDTO = null;
        Map<String, TokenizedTrackingInfo> map = null;
        Map<String, TokenizedTrackingInfo> map2 = null;
        Map<String, TokenizedTrackingInfo> map3 = null;
        BadgeDTO badgeDTO = null;
        ReviewGalleryV2DTO.ReviewGalleryV2Item.SocialUser socialUser = null;
        String str = null;
        AtomActionDTO atomActionDTO = null;
        ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO itemsContainerDTO = null;
        ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO itemsContainerDTO2 = null;
        ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO itemsContainerDTO3 = null;
        while (true) {
            ReviewGalleryV2DTO.ReviewGalleryV2Item.ContentWrapper contentWrapper2 = contentWrapper;
            ReviewGalleryV2DTO.ReviewGalleryV2Item.ReviewUser reviewUser2 = reviewUser;
            if (!reader.hasNext()) {
                reader.endObject();
                if (i12 == -65537) {
                    if (contentWrapper2 == null) {
                        throw c.j("content", "content", reader);
                    }
                    if (str == null) {
                        throw c.j("reviewUuid", "reviewUuid", reader);
                    }
                    Intrinsics.g(videoControlsMode, "null cannot be cast to non-null type ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO.ReviewGalleryV2Item.VideoControlsMode");
                    Map<String, TokenizedTrackingInfo> map4 = map2;
                    Map<String, TokenizedTrackingInfo> map5 = map;
                    SocialIconButtonDTO socialIconButtonDTO2 = socialIconButtonDTO;
                    ReviewGalleryV2DTO.ReviewGalleryV2Item.ReviewsRightPanelDTO reviewsRightPanelDTO2 = reviewsRightPanelDTO;
                    return new ReviewGalleryV2DTO.ReviewGalleryV2Item(contentWrapper2, reviewUser2, reviewProductTileDTO, productRatingDTO, reviewsRightPanelDTO2, socialIconButtonDTO2, map5, map4, map3, badgeDTO, socialUser, str, atomActionDTO, itemsContainerDTO, itemsContainerDTO2, itemsContainerDTO3, videoControlsMode);
                }
                Map<String, TokenizedTrackingInfo> map6 = map3;
                ReviewGalleryV2DTO.ReviewGalleryV2Item.VideoControlsMode videoControlsMode2 = videoControlsMode;
                Map<String, TokenizedTrackingInfo> map7 = map2;
                Map<String, TokenizedTrackingInfo> map8 = map;
                SocialIconButtonDTO socialIconButtonDTO3 = socialIconButtonDTO;
                ReviewGalleryV2DTO.ReviewGalleryV2Item.ReviewsRightPanelDTO reviewsRightPanelDTO3 = reviewsRightPanelDTO;
                ReviewGalleryV2DTO.ReviewGalleryV2Item.ProductRatingDTO productRatingDTO2 = productRatingDTO;
                ReviewProductTileDTO reviewProductTileDTO2 = reviewProductTileDTO;
                Constructor<ReviewGalleryV2DTO.ReviewGalleryV2Item> constructor = this.constructorRef;
                if (constructor == null) {
                    i11 = i12;
                    constructor = ReviewGalleryV2DTO.ReviewGalleryV2Item.class.getDeclaredConstructor(ReviewGalleryV2DTO.ReviewGalleryV2Item.ContentWrapper.class, ReviewGalleryV2DTO.ReviewGalleryV2Item.ReviewUser.class, ReviewProductTileDTO.class, ReviewGalleryV2DTO.ReviewGalleryV2Item.ProductRatingDTO.class, ReviewGalleryV2DTO.ReviewGalleryV2Item.ReviewsRightPanelDTO.class, SocialIconButtonDTO.class, Map.class, Map.class, Map.class, BadgeDTO.class, ReviewGalleryV2DTO.ReviewGalleryV2Item.SocialUser.class, String.class, AtomActionDTO.class, ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.class, ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.class, ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.class, ReviewGalleryV2DTO.ReviewGalleryV2Item.VideoControlsMode.class, Integer.TYPE, c.f34864d);
                    this.constructorRef = constructor;
                    Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
                } else {
                    i11 = i12;
                }
                if (contentWrapper2 == null) {
                    throw c.j("content", "content", reader);
                }
                if (str == null) {
                    throw c.j("reviewUuid", "reviewUuid", reader);
                }
                ReviewGalleryV2DTO.ReviewGalleryV2Item newInstance = constructor.newInstance(contentWrapper2, reviewUser2, reviewProductTileDTO2, productRatingDTO2, reviewsRightPanelDTO3, socialIconButtonDTO3, map8, map7, map6, badgeDTO, socialUser, str, atomActionDTO, itemsContainerDTO, itemsContainerDTO2, itemsContainerDTO3, videoControlsMode2, Integer.valueOf(i11), null);
                Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
                return newInstance;
            }
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    contentWrapper = contentWrapper2;
                    reviewUser = reviewUser2;
                case 0:
                    ReviewGalleryV2DTO.ReviewGalleryV2Item.ContentWrapper fromJson = this.contentWrapperAdapter.fromJson(reader);
                    if (fromJson == null) {
                        throw c.q("content", "content", reader);
                    }
                    contentWrapper = fromJson;
                    reviewUser = reviewUser2;
                case 1:
                    reviewUser = this.nullableReviewUserAdapter.fromJson(reader);
                    contentWrapper = contentWrapper2;
                case 2:
                    reviewProductTileDTO = this.nullableReviewProductTileDTOAdapter.fromJson(reader);
                    contentWrapper = contentWrapper2;
                    reviewUser = reviewUser2;
                case 3:
                    productRatingDTO = this.nullableProductRatingDTOAdapter.fromJson(reader);
                    contentWrapper = contentWrapper2;
                    reviewUser = reviewUser2;
                case 4:
                    reviewsRightPanelDTO = this.nullableReviewsRightPanelDTOAdapter.fromJson(reader);
                    contentWrapper = contentWrapper2;
                    reviewUser = reviewUser2;
                case 5:
                    socialIconButtonDTO = this.nullableSocialIconButtonDTOAdapter.fromJson(reader);
                    contentWrapper = contentWrapper2;
                    reviewUser = reviewUser2;
                case 6:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    contentWrapper = contentWrapper2;
                    reviewUser = reviewUser2;
                case 7:
                    map2 = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    contentWrapper = contentWrapper2;
                    reviewUser = reviewUser2;
                case 8:
                    map3 = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    contentWrapper = contentWrapper2;
                    reviewUser = reviewUser2;
                case 9:
                    badgeDTO = this.nullableBadgeDTOAdapter.fromJson(reader);
                    contentWrapper = contentWrapper2;
                    reviewUser = reviewUser2;
                case 10:
                    socialUser = this.nullableSocialUserAdapter.fromJson(reader);
                    contentWrapper = contentWrapper2;
                    reviewUser = reviewUser2;
                case 11:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("reviewUuid", "reviewUuid", reader);
                    }
                    contentWrapper = contentWrapper2;
                    reviewUser = reviewUser2;
                case 12:
                    atomActionDTO = this.nullableAtomActionDTOAdapter.fromJson(reader);
                    contentWrapper = contentWrapper2;
                    reviewUser = reviewUser2;
                case 13:
                    itemsContainerDTO = this.nullableItemsContainerDTOAdapter.fromJson(reader);
                    contentWrapper = contentWrapper2;
                    reviewUser = reviewUser2;
                case 14:
                    itemsContainerDTO2 = this.nullableItemsContainerDTOAdapter.fromJson(reader);
                    contentWrapper = contentWrapper2;
                    reviewUser = reviewUser2;
                case 15:
                    itemsContainerDTO3 = this.nullableItemsContainerDTOAdapter.fromJson(reader);
                    contentWrapper = contentWrapper2;
                    reviewUser = reviewUser2;
                case 16:
                    videoControlsMode = this.videoControlsModeAdapter.fromJson(reader);
                    if (videoControlsMode == null) {
                        throw c.q("videoControlsMode", "videoControlsMode", reader);
                    }
                    contentWrapper = contentWrapper2;
                    reviewUser = reviewUser2;
                    i12 = -65537;
                default:
                    contentWrapper = contentWrapper2;
                    reviewUser = reviewUser2;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ReviewGalleryV2DTO.ReviewGalleryV2Item value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("content");
        this.contentWrapperAdapter.mo44toJson(writer, (x) value.getContent());
        writer.w("user");
        this.nullableReviewUserAdapter.mo44toJson(writer, (x) value.getUser());
        writer.w(ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME);
        this.nullableReviewProductTileDTOAdapter.mo44toJson(writer, (x) value.getProduct());
        writer.w("rating");
        this.nullableProductRatingDTOAdapter.mo44toJson(writer, (x) value.getRating());
        writer.w("rightPanel");
        this.nullableReviewsRightPanelDTOAdapter.mo44toJson(writer, (x) value.getRightPanel());
        writer.w("closeButton");
        this.nullableSocialIconButtonDTOAdapter.mo44toJson(writer, (x) value.getCloseButton());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.w("prevTrackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getPrevTrackingInfo());
        writer.w("nextTrackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getNextTrackingInfo());
        writer.w("badge");
        this.nullableBadgeDTOAdapter.mo44toJson(writer, (x) value.getBadge());
        writer.w(ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.SOCIAL_USER_FIELD_NAME);
        this.nullableSocialUserAdapter.mo44toJson(writer, (x) value.getSocialUser());
        writer.w("reviewUuid");
        this.stringAdapter.mo44toJson(writer, (x) value.getReviewUuid());
        writer.w("contentViewAction");
        this.nullableAtomActionDTOAdapter.mo44toJson(writer, (x) value.getContentViewAction());
        writer.w("topMediaItems");
        this.nullableItemsContainerDTOAdapter.mo44toJson(writer, (x) value.getTopMediaItems());
        writer.w("bottomMediaItems");
        this.nullableItemsContainerDTOAdapter.mo44toJson(writer, (x) value.getBottomMediaItems());
        writer.w("bottomItems");
        this.nullableItemsContainerDTOAdapter.mo44toJson(writer, (x) value.getBottomItems());
        writer.w("videoControlsMode");
        this.videoControlsModeAdapter.mo44toJson(writer, (x) value.getVideoControlsMode());
        writer.p();
    }
}
