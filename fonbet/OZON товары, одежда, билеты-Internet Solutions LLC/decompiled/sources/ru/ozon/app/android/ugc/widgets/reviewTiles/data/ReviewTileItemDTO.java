package ru.ozon.app.android.ugc.widgets.reviewTiles.data;

import D40.a;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0017\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bHÆ\u0003JC\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006 "}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewTiles/data/ReviewTileItemDTO;", "", "mediaContent", "Lru/ozon/app/android/ugc/widgets/reviewTiles/data/ReviewsTileMediaContent;", "content", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/app/android/ugc/widgets/reviewTiles/data/ReviewsTileMediaContent;Ljava/lang/Object;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getMediaContent", "()Lru/ozon/app/android/ugc/widgets/reviewTiles/data/ReviewsTileMediaContent;", "getContent", "()Ljava/lang/Object;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ReviewTileItemDTO {
    public static final int $stable = 8;
    private final AtomActionDTO action;
    private final Object content;

    @NotNull
    private final ReviewsTileMediaContent mediaContent;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public ReviewTileItemDTO(@NotNull ReviewsTileMediaContent mediaContent, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(fieldName = "reviewDescription", name = "CONTENT_TYPE_REVIEW_DESCRIPTION", type = ReviewDescription.class), @ProtoOneOfSignature(fieldName = "authorAvatar", name = "CONTENT_TYPE_AUTHOR_AVATAR", type = AuthorAvatar.class)}) @ProtoOneOf(label = "type") Object obj, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(mediaContent, "mediaContent");
        this.mediaContent = mediaContent;
        this.content = obj;
        this.action = atomActionDTO;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ReviewTileItemDTO copy$default(ReviewTileItemDTO reviewTileItemDTO, ReviewsTileMediaContent reviewsTileMediaContent, Object obj, AtomActionDTO atomActionDTO, Map map, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            reviewsTileMediaContent = reviewTileItemDTO.mediaContent;
        }
        if ((i11 & 2) != 0) {
            obj = reviewTileItemDTO.content;
        }
        if ((i11 & 4) != 0) {
            atomActionDTO = reviewTileItemDTO.action;
        }
        if ((i11 & 8) != 0) {
            map = reviewTileItemDTO.trackingInfo;
        }
        return reviewTileItemDTO.copy(reviewsTileMediaContent, obj, atomActionDTO, map);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ReviewsTileMediaContent getMediaContent() {
        return this.mediaContent;
    }

    /* renamed from: component2, reason: from getter */
    public final Object getContent() {
        return this.content;
    }

    /* renamed from: component3, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final Map<String, TokenizedTrackingInfo> component4() {
        return this.trackingInfo;
    }

    @NotNull
    public final ReviewTileItemDTO copy(@NotNull ReviewsTileMediaContent mediaContent, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(fieldName = "reviewDescription", name = "CONTENT_TYPE_REVIEW_DESCRIPTION", type = ReviewDescription.class), @ProtoOneOfSignature(fieldName = "authorAvatar", name = "CONTENT_TYPE_AUTHOR_AVATAR", type = AuthorAvatar.class)}) @ProtoOneOf(label = "type") Object content, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(mediaContent, "mediaContent");
        return new ReviewTileItemDTO(mediaContent, content, action, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReviewTileItemDTO)) {
            return false;
        }
        ReviewTileItemDTO reviewTileItemDTO = (ReviewTileItemDTO) other;
        return Intrinsics.d(this.mediaContent, reviewTileItemDTO.mediaContent) && Intrinsics.d(this.content, reviewTileItemDTO.content) && Intrinsics.d(this.action, reviewTileItemDTO.action) && Intrinsics.d(this.trackingInfo, reviewTileItemDTO.trackingInfo);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final Object getContent() {
        return this.content;
    }

    @NotNull
    public final ReviewsTileMediaContent getMediaContent() {
        return this.mediaContent;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.mediaContent.hashCode() * 31;
        Object obj = this.content;
        int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.action;
        int hashCode3 = (hashCode2 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode3 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        ReviewsTileMediaContent reviewsTileMediaContent = this.mediaContent;
        Object obj = this.content;
        AtomActionDTO atomActionDTO = this.action;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("ReviewTileItemDTO(mediaContent=");
        sb2.append(reviewsTileMediaContent);
        sb2.append(", content=");
        sb2.append(obj);
        sb2.append(", action=");
        return a.d(sb2, atomActionDTO, ", trackingInfo=", map, ")");
    }
}
