package ru.ozon.app.android.ugc.widgets.reviewTiles.data;

import C.o0;
import G.g;
import Nh.a;
import Tl.b;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.video.preload.data.PreloadVideoInfo;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0003,-.BI\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b&\u0010\u0014R\u001f\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010*\u001a\u0004\b+\u0010\u0016¨\u0006/"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewTiles/data/ReviewTilesVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "Lru/ozon/app/android/ugc/widgets/reviewTiles/data/ReviewTilesVO$Content;", "items", "Lru/ozon/uni/atoms/data/common/Paddings;", "horizontalPadding", "", "backgroundColor", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "", "height", "<init>", "(JLjava/util/List;Lru/ozon/uni/atoms/data/common/Paddings;Ljava/lang/String;LWZ/t;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "Lru/ozon/uni/atoms/data/common/Paddings;", "getHorizontalPadding", "()Lru/ozon/uni/atoms/data/common/Paddings;", "Ljava/lang/String;", "getBackgroundColor", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "I", "getHeight", "Content", "AuthorAvatar", "ReviewDescription", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ReviewTilesVO implements c {
    private final String backgroundColor;
    private final int height;
    private final Paddings horizontalPadding;
    private final long id;

    @NotNull
    private final List<Content> items;
    private final t tokenizedEvent;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewTiles/data/ReviewTilesVO$AuthorAvatar;", "", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "icon", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badge", "<init>", "(Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "Companion", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AuthorAvatar {
        private final BadgeDTO badge;
        private final IconDTO icon;

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = IconDTO.$stable;

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewTiles/data/ReviewTilesVO$AuthorAvatar$Companion;", "", "<init>", "()V", "empty", "Lru/ozon/app/android/ugc/widgets/reviewTiles/data/ReviewTilesVO$AuthorAvatar;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final AuthorAvatar empty() {
                return new AuthorAvatar(null, null);
            }

            private Companion() {
            }
        }

        public AuthorAvatar(IconDTO iconDTO, BadgeDTO badgeDTO) {
            this.icon = iconDTO;
            this.badge = badgeDTO;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AuthorAvatar)) {
                return false;
            }
            AuthorAvatar authorAvatar = (AuthorAvatar) other;
            return Intrinsics.d(this.icon, authorAvatar.icon) && Intrinsics.d(this.badge, authorAvatar.badge);
        }

        public final BadgeDTO getBadge() {
            return this.badge;
        }

        public final IconDTO getIcon() {
            return this.icon;
        }

        public int hashCode() {
            IconDTO iconDTO = this.icon;
            int hashCode = (iconDTO == null ? 0 : iconDTO.hashCode()) * 31;
            BadgeDTO badgeDTO = this.badge;
            return hashCode + (badgeDTO != null ? badgeDTO.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "AuthorAvatar(icon=" + this.icon + ", badge=" + this.badge + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewTiles/data/ReviewTilesVO$Content;", "", "Media", "More", "Lru/ozon/app/android/ugc/widgets/reviewTiles/data/ReviewTilesVO$Content$Media;", "Lru/ozon/app/android/ugc/widgets/reviewTiles/data/ReviewTilesVO$Content$More;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Content {

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0012\u0013R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\u0082\u0001\u0002\u0014\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewTiles/data/ReviewTilesVO$Content$Media;", "Lru/ozon/app/android/ugc/widgets/reviewTiles/data/ReviewTilesVO$Content;", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "image", "Lru/ozon/app/android/ugc/widgets/reviewTiles/data/ReviewTilesVO$AuthorAvatar;", "getAuthorAvatar", "()Lru/ozon/app/android/ugc/widgets/reviewTiles/data/ReviewTilesVO$AuthorAvatar;", "authorAvatar", "Lru/ozon/app/android/ugc/widgets/reviewTiles/data/ReviewTilesVO$ReviewDescription;", "getReviewDescription", "()Lru/ozon/app/android/ugc/widgets/reviewTiles/data/ReviewTilesVO$ReviewDescription;", "reviewDescription", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getPlayIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "playIcon", "Image", "Video", "Lru/ozon/app/android/ugc/widgets/reviewTiles/data/ReviewTilesVO$Content$Media$Image;", "Lru/ozon/app/android/ugc/widgets/reviewTiles/data/ReviewTilesVO$Content$Media$Video;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public interface Media extends Content {

            @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u000e\u0010\u0011\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR&\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010*\u001a\u0004\b+\u0010,R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010-\u001a\u0004\b.\u0010/R\u001f\u0010\u0011\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00100\u001a\u0004\b1\u00102¨\u00063"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewTiles/data/ReviewTilesVO$Content$Media$Image;", "Lru/ozon/app/android/ugc/widgets/reviewTiles/data/ReviewTilesVO$Content$Media;", "Lkotlin/Pair;", "", "size", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "image", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "Lru/ozon/app/android/ugc/widgets/reviewTiles/data/ReviewTilesVO$AuthorAvatar;", "authorAvatar", "Lru/ozon/app/android/ugc/widgets/reviewTiles/data/ReviewTilesVO$ReviewDescription;", "reviewDescription", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "playIcon", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(Lkotlin/Pair;Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/app/android/ugc/widgets/reviewTiles/data/ReviewTilesVO$AuthorAvatar;Lru/ozon/app/android/ugc/widgets/reviewTiles/data/ReviewTilesVO$ReviewDescription;Lru/ozon/uni/atoms/data/icon/IconDTO;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lkotlin/Pair;", "getSize", "()Lkotlin/Pair;", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/app/android/ugc/widgets/reviewTiles/data/ReviewTilesVO$AuthorAvatar;", "getAuthorAvatar", "()Lru/ozon/app/android/ugc/widgets/reviewTiles/data/ReviewTilesVO$AuthorAvatar;", "Lru/ozon/app/android/ugc/widgets/reviewTiles/data/ReviewTilesVO$ReviewDescription;", "getReviewDescription", "()Lru/ozon/app/android/ugc/widgets/reviewTiles/data/ReviewTilesVO$ReviewDescription;", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getPlayIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class Image implements Media {
                private final AtomAction action;

                @NotNull
                private final AuthorAvatar authorAvatar;

                @NotNull
                private final ImageDTO image;
                private final IconDTO playIcon;

                @NotNull
                private final ReviewDescription reviewDescription;

                @NotNull
                private final Pair<Integer, Integer> size;
                private final t tokenizedEvent;

                public Image(@NotNull Pair<Integer, Integer> size, @NotNull ImageDTO image, AtomAction atomAction, @NotNull AuthorAvatar authorAvatar, @NotNull ReviewDescription reviewDescription, IconDTO iconDTO, t tVar) {
                    Intrinsics.checkNotNullParameter(size, "size");
                    Intrinsics.checkNotNullParameter(image, "image");
                    Intrinsics.checkNotNullParameter(authorAvatar, "authorAvatar");
                    Intrinsics.checkNotNullParameter(reviewDescription, "reviewDescription");
                    this.size = size;
                    this.image = image;
                    this.action = atomAction;
                    this.authorAvatar = authorAvatar;
                    this.reviewDescription = reviewDescription;
                    this.playIcon = iconDTO;
                    this.tokenizedEvent = tVar;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Image)) {
                        return false;
                    }
                    Image image = (Image) other;
                    return Intrinsics.d(this.size, image.size) && Intrinsics.d(this.image, image.image) && Intrinsics.d(this.action, image.action) && Intrinsics.d(this.authorAvatar, image.authorAvatar) && Intrinsics.d(this.reviewDescription, image.reviewDescription) && Intrinsics.d(this.playIcon, image.playIcon) && Intrinsics.d(this.tokenizedEvent, image.tokenizedEvent);
                }

                public AtomAction getAction() {
                    return this.action;
                }

                @Override // ru.ozon.app.android.ugc.widgets.reviewTiles.data.ReviewTilesVO.Content.Media
                @NotNull
                public AuthorAvatar getAuthorAvatar() {
                    return this.authorAvatar;
                }

                @Override // ru.ozon.app.android.ugc.widgets.reviewTiles.data.ReviewTilesVO.Content.Media
                @NotNull
                public ImageDTO getImage() {
                    return this.image;
                }

                @Override // ru.ozon.app.android.ugc.widgets.reviewTiles.data.ReviewTilesVO.Content.Media
                public IconDTO getPlayIcon() {
                    return this.playIcon;
                }

                @Override // ru.ozon.app.android.ugc.widgets.reviewTiles.data.ReviewTilesVO.Content.Media
                @NotNull
                public ReviewDescription getReviewDescription() {
                    return this.reviewDescription;
                }

                @NotNull
                public Pair<Integer, Integer> getSize() {
                    return this.size;
                }

                public final t getTokenizedEvent() {
                    return this.tokenizedEvent;
                }

                public int hashCode() {
                    int b11 = a.b(this.image, this.size.hashCode() * 31, 31);
                    AtomAction atomAction = this.action;
                    int hashCode = (this.reviewDescription.hashCode() + ((this.authorAvatar.hashCode() + ((b11 + (atomAction == null ? 0 : atomAction.hashCode())) * 31)) * 31)) * 31;
                    IconDTO iconDTO = this.playIcon;
                    int hashCode2 = (hashCode + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
                    t tVar = this.tokenizedEvent;
                    return hashCode2 + (tVar != null ? tVar.hashCode() : 0);
                }

                @NotNull
                public String toString() {
                    Pair<Integer, Integer> pair = this.size;
                    ImageDTO imageDTO = this.image;
                    AtomAction atomAction = this.action;
                    AuthorAvatar authorAvatar = this.authorAvatar;
                    ReviewDescription reviewDescription = this.reviewDescription;
                    IconDTO iconDTO = this.playIcon;
                    t tVar = this.tokenizedEvent;
                    StringBuilder sb2 = new StringBuilder("Image(size=");
                    sb2.append(pair);
                    sb2.append(", image=");
                    sb2.append(imageDTO);
                    sb2.append(", action=");
                    sb2.append(atomAction);
                    sb2.append(", authorAvatar=");
                    sb2.append(authorAvatar);
                    sb2.append(", reviewDescription=");
                    sb2.append(reviewDescription);
                    sb2.append(", playIcon=");
                    sb2.append(iconDTO);
                    sb2.append(", tokenizedEvent=");
                    return b.d(sb2, tVar, ")");
                }
            }

            @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\u000e\u0010\u0014\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R&\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010-\u001a\u0004\b.\u0010/R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u00100\u001a\u0004\b1\u00102R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00103\u001a\u0004\b4\u00105R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0011\u00103\u001a\u0004\b6\u00105R\u001f\u0010\u0014\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u00107\u001a\u0004\b8\u00109¨\u0006:"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewTiles/data/ReviewTilesVO$Content$Media$Video;", "Lru/ozon/app/android/ugc/widgets/reviewTiles/data/ReviewTilesVO$Content$Media;", "Lkotlin/Pair;", "", "size", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "image", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "Lru/ozon/app/android/ugc/widgets/reviewTiles/data/ReviewTilesVO$AuthorAvatar;", "authorAvatar", "Lru/ozon/app/android/ugc/widgets/reviewTiles/data/ReviewTilesVO$ReviewDescription;", "reviewDescription", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "playIcon", "Lru/ozon/app/android/video/preload/data/PreloadVideoInfo;", "videoInfo", "fullVideoInfo", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(Lkotlin/Pair;Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/app/android/ugc/widgets/reviewTiles/data/ReviewTilesVO$AuthorAvatar;Lru/ozon/app/android/ugc/widgets/reviewTiles/data/ReviewTilesVO$ReviewDescription;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/app/android/video/preload/data/PreloadVideoInfo;Lru/ozon/app/android/video/preload/data/PreloadVideoInfo;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lkotlin/Pair;", "getSize", "()Lkotlin/Pair;", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/app/android/ugc/widgets/reviewTiles/data/ReviewTilesVO$AuthorAvatar;", "getAuthorAvatar", "()Lru/ozon/app/android/ugc/widgets/reviewTiles/data/ReviewTilesVO$AuthorAvatar;", "Lru/ozon/app/android/ugc/widgets/reviewTiles/data/ReviewTilesVO$ReviewDescription;", "getReviewDescription", "()Lru/ozon/app/android/ugc/widgets/reviewTiles/data/ReviewTilesVO$ReviewDescription;", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getPlayIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Lru/ozon/app/android/video/preload/data/PreloadVideoInfo;", "getVideoInfo", "()Lru/ozon/app/android/video/preload/data/PreloadVideoInfo;", "getFullVideoInfo", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class Video implements Media {
                private final AtomAction action;

                @NotNull
                private final AuthorAvatar authorAvatar;
                private final PreloadVideoInfo fullVideoInfo;

                @NotNull
                private final ImageDTO image;
                private final IconDTO playIcon;

                @NotNull
                private final ReviewDescription reviewDescription;

                @NotNull
                private final Pair<Integer, Integer> size;
                private final t tokenizedEvent;
                private final PreloadVideoInfo videoInfo;

                public Video(@NotNull Pair<Integer, Integer> size, @NotNull ImageDTO image, AtomAction atomAction, @NotNull AuthorAvatar authorAvatar, @NotNull ReviewDescription reviewDescription, IconDTO iconDTO, PreloadVideoInfo preloadVideoInfo, PreloadVideoInfo preloadVideoInfo2, t tVar) {
                    Intrinsics.checkNotNullParameter(size, "size");
                    Intrinsics.checkNotNullParameter(image, "image");
                    Intrinsics.checkNotNullParameter(authorAvatar, "authorAvatar");
                    Intrinsics.checkNotNullParameter(reviewDescription, "reviewDescription");
                    this.size = size;
                    this.image = image;
                    this.action = atomAction;
                    this.authorAvatar = authorAvatar;
                    this.reviewDescription = reviewDescription;
                    this.playIcon = iconDTO;
                    this.videoInfo = preloadVideoInfo;
                    this.fullVideoInfo = preloadVideoInfo2;
                    this.tokenizedEvent = tVar;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Video)) {
                        return false;
                    }
                    Video video = (Video) other;
                    return Intrinsics.d(this.size, video.size) && Intrinsics.d(this.image, video.image) && Intrinsics.d(this.action, video.action) && Intrinsics.d(this.authorAvatar, video.authorAvatar) && Intrinsics.d(this.reviewDescription, video.reviewDescription) && Intrinsics.d(this.playIcon, video.playIcon) && Intrinsics.d(this.videoInfo, video.videoInfo) && Intrinsics.d(this.fullVideoInfo, video.fullVideoInfo) && Intrinsics.d(this.tokenizedEvent, video.tokenizedEvent);
                }

                public AtomAction getAction() {
                    return this.action;
                }

                @Override // ru.ozon.app.android.ugc.widgets.reviewTiles.data.ReviewTilesVO.Content.Media
                @NotNull
                public AuthorAvatar getAuthorAvatar() {
                    return this.authorAvatar;
                }

                public final PreloadVideoInfo getFullVideoInfo() {
                    return this.fullVideoInfo;
                }

                @Override // ru.ozon.app.android.ugc.widgets.reviewTiles.data.ReviewTilesVO.Content.Media
                @NotNull
                public ImageDTO getImage() {
                    return this.image;
                }

                @Override // ru.ozon.app.android.ugc.widgets.reviewTiles.data.ReviewTilesVO.Content.Media
                public IconDTO getPlayIcon() {
                    return this.playIcon;
                }

                @Override // ru.ozon.app.android.ugc.widgets.reviewTiles.data.ReviewTilesVO.Content.Media
                @NotNull
                public ReviewDescription getReviewDescription() {
                    return this.reviewDescription;
                }

                @NotNull
                public Pair<Integer, Integer> getSize() {
                    return this.size;
                }

                public final t getTokenizedEvent() {
                    return this.tokenizedEvent;
                }

                public final PreloadVideoInfo getVideoInfo() {
                    return this.videoInfo;
                }

                public int hashCode() {
                    int b11 = a.b(this.image, this.size.hashCode() * 31, 31);
                    AtomAction atomAction = this.action;
                    int hashCode = (this.reviewDescription.hashCode() + ((this.authorAvatar.hashCode() + ((b11 + (atomAction == null ? 0 : atomAction.hashCode())) * 31)) * 31)) * 31;
                    IconDTO iconDTO = this.playIcon;
                    int hashCode2 = (hashCode + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
                    PreloadVideoInfo preloadVideoInfo = this.videoInfo;
                    int hashCode3 = (hashCode2 + (preloadVideoInfo == null ? 0 : preloadVideoInfo.hashCode())) * 31;
                    PreloadVideoInfo preloadVideoInfo2 = this.fullVideoInfo;
                    int hashCode4 = (hashCode3 + (preloadVideoInfo2 == null ? 0 : preloadVideoInfo2.hashCode())) * 31;
                    t tVar = this.tokenizedEvent;
                    return hashCode4 + (tVar != null ? tVar.hashCode() : 0);
                }

                @NotNull
                public String toString() {
                    Pair<Integer, Integer> pair = this.size;
                    ImageDTO imageDTO = this.image;
                    AtomAction atomAction = this.action;
                    AuthorAvatar authorAvatar = this.authorAvatar;
                    ReviewDescription reviewDescription = this.reviewDescription;
                    IconDTO iconDTO = this.playIcon;
                    PreloadVideoInfo preloadVideoInfo = this.videoInfo;
                    PreloadVideoInfo preloadVideoInfo2 = this.fullVideoInfo;
                    t tVar = this.tokenizedEvent;
                    StringBuilder sb2 = new StringBuilder("Video(size=");
                    sb2.append(pair);
                    sb2.append(", image=");
                    sb2.append(imageDTO);
                    sb2.append(", action=");
                    sb2.append(atomAction);
                    sb2.append(", authorAvatar=");
                    sb2.append(authorAvatar);
                    sb2.append(", reviewDescription=");
                    sb2.append(reviewDescription);
                    sb2.append(", playIcon=");
                    sb2.append(iconDTO);
                    sb2.append(", videoInfo=");
                    sb2.append(preloadVideoInfo);
                    sb2.append(", fullVideoInfo=");
                    sb2.append(preloadVideoInfo2);
                    sb2.append(", tokenizedEvent=");
                    return b.d(sb2, tVar, ")");
                }
            }

            @NotNull
            AuthorAvatar getAuthorAvatar();

            @NotNull
            ImageDTO getImage();

            IconDTO getPlayIcon();

            @NotNull
            ReviewDescription getReviewDescription();
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewTiles/data/ReviewTilesVO$Content$More;", "Lru/ozon/app/android/ugc/widgets/reviewTiles/data/ReviewTilesVO$Content;", "Lru/ozon/uni/atoms/af/AtomAction;", "openFullViewAction", "<init>", "(Lru/ozon/uni/atoms/af/AtomAction;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/af/AtomAction;", "getOpenFullViewAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class More implements Content {
            public static final int $stable = AtomAction.$stable;

            @NotNull
            private final AtomAction openFullViewAction;

            public More(@NotNull AtomAction openFullViewAction) {
                Intrinsics.checkNotNullParameter(openFullViewAction, "openFullViewAction");
                this.openFullViewAction = openFullViewAction;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof More) && Intrinsics.d(this.openFullViewAction, ((More) other).openFullViewAction);
            }

            @NotNull
            public final AtomAction getOpenFullViewAction() {
                return this.openFullViewAction;
            }

            public int hashCode() {
                return this.openFullViewAction.hashCode();
            }

            @NotNull
            public String toString() {
                return Kk.c.e("More(openFullViewAction=", ")", this.openFullViewAction);
            }
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewTiles/data/ReviewTilesVO$ReviewDescription;", "", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "price", "Lru/ozon/uni/atoms/data/text/TextDTO;", "text", "", "gradientColor", "<init>", "(Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "getPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Ljava/lang/String;", "getGradientColor", "Companion", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ReviewDescription {
        private final String gradientColor;
        private final PriceDTO price;
        private final TextDTO text;

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = PriceDTO.$stable;

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewTiles/data/ReviewTilesVO$ReviewDescription$Companion;", "", "<init>", "()V", "empty", "Lru/ozon/app/android/ugc/widgets/reviewTiles/data/ReviewTilesVO$ReviewDescription;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final ReviewDescription empty() {
                return new ReviewDescription(null, null, null);
            }

            private Companion() {
            }
        }

        public ReviewDescription(PriceDTO priceDTO, TextDTO textDTO, String str) {
            this.price = priceDTO;
            this.text = textDTO;
            this.gradientColor = str;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ReviewDescription)) {
                return false;
            }
            ReviewDescription reviewDescription = (ReviewDescription) other;
            return Intrinsics.d(this.price, reviewDescription.price) && Intrinsics.d(this.text, reviewDescription.text) && Intrinsics.d(this.gradientColor, reviewDescription.gradientColor);
        }

        public final String getGradientColor() {
            return this.gradientColor;
        }

        public final PriceDTO getPrice() {
            return this.price;
        }

        public final TextDTO getText() {
            return this.text;
        }

        public int hashCode() {
            PriceDTO priceDTO = this.price;
            int hashCode = (priceDTO == null ? 0 : priceDTO.hashCode()) * 31;
            TextDTO textDTO = this.text;
            int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
            String str = this.gradientColor;
            return hashCode2 + (str != null ? str.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            PriceDTO priceDTO = this.price;
            TextDTO textDTO = this.text;
            String str = this.gradientColor;
            StringBuilder sb2 = new StringBuilder("ReviewDescription(price=");
            sb2.append(priceDTO);
            sb2.append(", text=");
            sb2.append(textDTO);
            sb2.append(", gradientColor=");
            return o0.c(sb2, str, ")");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ReviewTilesVO(long j11, @NotNull List<? extends Content> items, Paddings paddings, String str, t tVar, int i11) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.id = j11;
        this.items = items;
        this.horizontalPadding = paddings;
        this.backgroundColor = str;
        this.tokenizedEvent = tVar;
        this.height = i11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReviewTilesVO)) {
            return false;
        }
        ReviewTilesVO reviewTilesVO = (ReviewTilesVO) other;
        return this.id == reviewTilesVO.id && Intrinsics.d(this.items, reviewTilesVO.items) && this.horizontalPadding == reviewTilesVO.horizontalPadding && Intrinsics.d(this.backgroundColor, reviewTilesVO.backgroundColor) && Intrinsics.d(this.tokenizedEvent, reviewTilesVO.tokenizedEvent) && this.height == reviewTilesVO.height;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final int getHeight() {
        return this.height;
    }

    public final Paddings getHorizontalPadding() {
        return this.horizontalPadding;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final List<Content> getItems() {
        return this.items;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int b11 = g.b(Long.hashCode(this.id) * 31, 31, this.items);
        Paddings paddings = this.horizontalPadding;
        int hashCode = (b11 + (paddings == null ? 0 : paddings.hashCode())) * 31;
        String str = this.backgroundColor;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        return Integer.hashCode(this.height) + ((hashCode2 + (tVar != null ? tVar.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<Content> list = this.items;
        Paddings paddings = this.horizontalPadding;
        String str = this.backgroundColor;
        t tVar = this.tokenizedEvent;
        int i11 = this.height;
        StringBuilder b11 = Lh.b.b(j11, "ReviewTilesVO(id=", ", items=", list);
        b11.append(", horizontalPadding=");
        b11.append(paddings);
        b11.append(", backgroundColor=");
        b11.append(str);
        b11.append(", tokenizedEvent=");
        b11.append(tVar);
        b11.append(", height=");
        b11.append(i11);
        b11.append(")");
        return b11.toString();
    }
}
