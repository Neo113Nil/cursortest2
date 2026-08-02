package ru.ozon.app.android.ugc.widgets.reviewsPreview.data;

import B0.C2454a;
import G.g;
import Nh.a;
import P4.f;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.reviewsPreview.common.ReviewsPreviewTileVO;
import ru.ozon.app.android.ugc.widgets.reviewsPreview.data.ReviewsPreviewDTO;
import ru.ozon.app.android.video.preload.data.PreloadVideoInfo;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003:\u0002\b\tR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewsPreview/data/ReviewsPreviewVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "Lru/ozon/app/android/ugc/widgets/reviewsPreview/data/CommonVO;", "Lru/ozon/app/android/ugc/widgets/reviewsPreview/common/ReviewsPreviewTileVO;", "getTile", "()Lru/ozon/app/android/ugc/widgets/reviewsPreview/common/ReviewsPreviewTileVO;", "tile", "ReviewsPreviewImageVO", "ReviewsPreviewVideoVO", "Lru/ozon/app/android/ugc/widgets/reviewsPreview/data/ReviewsPreviewVO$ReviewsPreviewImageVO;", "Lru/ozon/app/android/ugc/widgets/reviewsPreview/data/ReviewsPreviewVO$ReviewsPreviewVideoVO;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface ReviewsPreviewVO extends c, CommonVO {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static Integer getScrollWidgetKey(@NotNull ReviewsPreviewVO reviewsPreviewVO) {
            return null;
        }

        public static int getViewItemKey(@NotNull ReviewsPreviewVO reviewsPreviewVO) {
            return reviewsPreviewVO.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b$\b\u0087\b\u0018\u00002\u00020\u0001B\u008d\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0017\u001a\u00020\u000e\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010(R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010+R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b,\u0010+R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b.\u0010/R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u00100\u001a\u0004\b1\u00102R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u00103\u001a\u0004\b4\u00105R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u00103\u001a\u0004\b6\u00105R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u00107\u001a\u0004\b8\u00109R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010:\u001a\u0004\b;\u0010<R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010=\u001a\u0004\b>\u0010?R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010=\u001a\u0004\b@\u0010?R\u001a\u0010\u0016\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010A\u001a\u0004\bB\u0010\u001dR\u0017\u0010\u0017\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0017\u00107\u001a\u0004\bC\u00109R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010D\u001a\u0004\bE\u0010F¨\u0006G"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewsPreview/data/ReviewsPreviewVO$ReviewsPreviewImageVO;", "Lru/ozon/app/android/ugc/widgets/reviewsPreview/data/ReviewsPreviewVO;", "", "id", "Lru/ozon/uni/atoms/af/AtomAction;", "clickAction", "viewedItemAction", "Lru/ozon/app/android/video/preload/data/PreloadVideoInfo;", "fullVideoInfo", "Lru/ozon/app/android/ugc/widgets/reviewsPreview/common/ReviewsPreviewTileVO;", "tile", "LWZ/t;", "itemTokenizedEvent", "tokenizedEvent", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "cornerImage", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "cornerRadius", "Lru/ozon/uni/atoms/data/common/Paddings;", "horizontalPadding", "itemSpacing", "", "widgetBackgroundColor", "image", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "playIcon", "<init>", "(JLru/ozon/uni/atoms/af/AtomAction;Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/app/android/video/preload/data/PreloadVideoInfo;Lru/ozon/app/android/ugc/widgets/reviewsPreview/common/ReviewsPreviewTileVO;LWZ/t;LWZ/t;Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/common/CornerRadius;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Ljava/lang/String;Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/af/AtomAction;", "getClickAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "getViewedItemAction", "Lru/ozon/app/android/video/preload/data/PreloadVideoInfo;", "getFullVideoInfo", "()Lru/ozon/app/android/video/preload/data/PreloadVideoInfo;", "Lru/ozon/app/android/ugc/widgets/reviewsPreview/common/ReviewsPreviewTileVO;", "getTile", "()Lru/ozon/app/android/ugc/widgets/reviewsPreview/common/ReviewsPreviewTileVO;", "LWZ/t;", "getItemTokenizedEvent", "()LWZ/t;", "getTokenizedEvent", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "getCornerImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "getCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "Lru/ozon/uni/atoms/data/common/Paddings;", "getHorizontalPadding", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getItemSpacing", "Ljava/lang/String;", "getWidgetBackgroundColor", "getImage", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getPlayIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ReviewsPreviewImageVO implements ReviewsPreviewVO {
        private final AtomAction clickAction;
        private final ImageDTO cornerImage;
        private final CornerRadius cornerRadius;
        private final PreloadVideoInfo fullVideoInfo;
        private final Paddings horizontalPadding;
        private final long id;

        @NotNull
        private final ImageDTO image;
        private final Paddings itemSpacing;
        private final t itemTokenizedEvent;
        private final IconDTO playIcon;
        private final ReviewsPreviewTileVO tile;
        private final t tokenizedEvent;
        private final AtomAction viewedItemAction;

        @NotNull
        private final String widgetBackgroundColor;

        public ReviewsPreviewImageVO(long j11, AtomAction atomAction, AtomAction atomAction2, PreloadVideoInfo preloadVideoInfo, ReviewsPreviewTileVO reviewsPreviewTileVO, t tVar, t tVar2, ImageDTO imageDTO, CornerRadius cornerRadius, Paddings paddings, Paddings paddings2, @NotNull String widgetBackgroundColor, @NotNull ImageDTO image, IconDTO iconDTO) {
            Intrinsics.checkNotNullParameter(widgetBackgroundColor, "widgetBackgroundColor");
            Intrinsics.checkNotNullParameter(image, "image");
            this.id = j11;
            this.clickAction = atomAction;
            this.viewedItemAction = atomAction2;
            this.fullVideoInfo = preloadVideoInfo;
            this.tile = reviewsPreviewTileVO;
            this.itemTokenizedEvent = tVar;
            this.tokenizedEvent = tVar2;
            this.cornerImage = imageDTO;
            this.cornerRadius = cornerRadius;
            this.horizontalPadding = paddings;
            this.itemSpacing = paddings2;
            this.widgetBackgroundColor = widgetBackgroundColor;
            this.image = image;
            this.playIcon = iconDTO;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ReviewsPreviewImageVO)) {
                return false;
            }
            ReviewsPreviewImageVO reviewsPreviewImageVO = (ReviewsPreviewImageVO) other;
            return this.id == reviewsPreviewImageVO.id && Intrinsics.d(this.clickAction, reviewsPreviewImageVO.clickAction) && Intrinsics.d(this.viewedItemAction, reviewsPreviewImageVO.viewedItemAction) && Intrinsics.d(this.fullVideoInfo, reviewsPreviewImageVO.fullVideoInfo) && Intrinsics.d(this.tile, reviewsPreviewImageVO.tile) && Intrinsics.d(this.itemTokenizedEvent, reviewsPreviewImageVO.itemTokenizedEvent) && Intrinsics.d(this.tokenizedEvent, reviewsPreviewImageVO.tokenizedEvent) && Intrinsics.d(this.cornerImage, reviewsPreviewImageVO.cornerImage) && this.cornerRadius == reviewsPreviewImageVO.cornerRadius && this.horizontalPadding == reviewsPreviewImageVO.horizontalPadding && this.itemSpacing == reviewsPreviewImageVO.itemSpacing && Intrinsics.d(this.widgetBackgroundColor, reviewsPreviewImageVO.widgetBackgroundColor) && Intrinsics.d(this.image, reviewsPreviewImageVO.image) && Intrinsics.d(this.playIcon, reviewsPreviewImageVO.playIcon);
        }

        public AtomAction getClickAction() {
            return this.clickAction;
        }

        public ImageDTO getCornerImage() {
            return this.cornerImage;
        }

        public CornerRadius getCornerRadius() {
            return this.cornerRadius;
        }

        public PreloadVideoInfo getFullVideoInfo() {
            return this.fullVideoInfo;
        }

        @Override // ru.ozon.app.android.ugc.widgets.reviewsPreview.data.CommonVO
        public Paddings getHorizontalPadding() {
            return this.horizontalPadding;
        }

        @Override // l20.c
        public long getId() {
            return this.id;
        }

        @NotNull
        public final ImageDTO getImage() {
            return this.image;
        }

        @Override // ru.ozon.app.android.ugc.widgets.reviewsPreview.data.CommonVO
        public Paddings getItemSpacing() {
            return this.itemSpacing;
        }

        public t getItemTokenizedEvent() {
            return this.itemTokenizedEvent;
        }

        public final IconDTO getPlayIcon() {
            return this.playIcon;
        }

        @Override // l20.c
        public Integer getScrollWidgetKey() {
            return DefaultImpls.getScrollWidgetKey(this);
        }

        @Override // ru.ozon.app.android.ugc.widgets.reviewsPreview.data.ReviewsPreviewVO
        public ReviewsPreviewTileVO getTile() {
            return this.tile;
        }

        public t getTokenizedEvent() {
            return this.tokenizedEvent;
        }

        @Override // l20.c
        public int getViewItemKey() {
            return DefaultImpls.getViewItemKey(this);
        }

        public AtomAction getViewedItemAction() {
            return this.viewedItemAction;
        }

        @Override // ru.ozon.app.android.ugc.widgets.reviewsPreview.data.CommonVO
        @NotNull
        public String getWidgetBackgroundColor() {
            return this.widgetBackgroundColor;
        }

        public int hashCode() {
            int hashCode = Long.hashCode(this.id) * 31;
            AtomAction atomAction = this.clickAction;
            int hashCode2 = (hashCode + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
            AtomAction atomAction2 = this.viewedItemAction;
            int hashCode3 = (hashCode2 + (atomAction2 == null ? 0 : atomAction2.hashCode())) * 31;
            PreloadVideoInfo preloadVideoInfo = this.fullVideoInfo;
            int hashCode4 = (hashCode3 + (preloadVideoInfo == null ? 0 : preloadVideoInfo.hashCode())) * 31;
            ReviewsPreviewTileVO reviewsPreviewTileVO = this.tile;
            int hashCode5 = (hashCode4 + (reviewsPreviewTileVO == null ? 0 : reviewsPreviewTileVO.hashCode())) * 31;
            t tVar = this.itemTokenizedEvent;
            int hashCode6 = (hashCode5 + (tVar == null ? 0 : tVar.hashCode())) * 31;
            t tVar2 = this.tokenizedEvent;
            int hashCode7 = (hashCode6 + (tVar2 == null ? 0 : tVar2.hashCode())) * 31;
            ImageDTO imageDTO = this.cornerImage;
            int hashCode8 = (hashCode7 + (imageDTO == null ? 0 : imageDTO.hashCode())) * 31;
            CornerRadius cornerRadius = this.cornerRadius;
            int hashCode9 = (hashCode8 + (cornerRadius == null ? 0 : cornerRadius.hashCode())) * 31;
            Paddings paddings = this.horizontalPadding;
            int hashCode10 = (hashCode9 + (paddings == null ? 0 : paddings.hashCode())) * 31;
            Paddings paddings2 = this.itemSpacing;
            int b11 = a.b(this.image, g.a((hashCode10 + (paddings2 == null ? 0 : paddings2.hashCode())) * 31, 31, this.widgetBackgroundColor), 31);
            IconDTO iconDTO = this.playIcon;
            return b11 + (iconDTO != null ? iconDTO.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "ReviewsPreviewImageVO(id=" + this.id + ", clickAction=" + this.clickAction + ", viewedItemAction=" + this.viewedItemAction + ", fullVideoInfo=" + this.fullVideoInfo + ", tile=" + this.tile + ", itemTokenizedEvent=" + this.itemTokenizedEvent + ", tokenizedEvent=" + this.tokenizedEvent + ", cornerImage=" + this.cornerImage + ", cornerRadius=" + this.cornerRadius + ", horizontalPadding=" + this.horizontalPadding + ", itemSpacing=" + this.itemSpacing + ", widgetBackgroundColor=" + this.widgetBackgroundColor + ", image=" + this.image + ", playIcon=" + this.playIcon + ")";
        }
    }

    @Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b+\b\u0087\b\u0018\u00002\u00020\u0001B¿\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0017\u001a\u00020\u000e\u0012\u0006\u0010\u0018\u001a\u00020\t\u0012\u0006\u0010\u0019\u001a\u00020\u0015\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010 \u001a\u00020\u0002¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b*\u0010+R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010.R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b0\u00101R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b2\u00101R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u00103\u001a\u0004\b4\u00105R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u00106\u001a\u0004\b7\u00108R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u00109\u001a\u0004\b:\u0010;R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u00109\u001a\u0004\b<\u0010;R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010=\u001a\u0004\b>\u0010?R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010@\u001a\u0004\bA\u0010BR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010C\u001a\u0004\bD\u0010ER\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010C\u001a\u0004\bF\u0010ER\u001a\u0010\u0016\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010G\u001a\u0004\bH\u0010$R\u0017\u0010\u0017\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0017\u0010=\u001a\u0004\bI\u0010?R\u0017\u0010\u0018\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0018\u00106\u001a\u0004\bJ\u00108R\u0017\u0010\u0019\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0019\u0010G\u001a\u0004\bK\u0010$R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u001a\u00109\u001a\u0004\bL\u0010;R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u001b\u00109\u001a\u0004\bM\u0010;R\u0017\u0010\u001d\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010N\u001a\u0004\bO\u0010PR\u0017\u0010\u001f\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010Q\u001a\u0004\bR\u0010&R\u0017\u0010 \u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010,\u001a\u0004\bS\u0010.¨\u0006T"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewsPreview/data/ReviewsPreviewVO$ReviewsPreviewVideoVO;", "Lru/ozon/app/android/ugc/widgets/reviewsPreview/data/ReviewsPreviewVO;", "", "id", "Lru/ozon/uni/atoms/af/AtomAction;", "clickAction", "viewedItemAction", "Lru/ozon/app/android/ugc/widgets/reviewsPreview/common/ReviewsPreviewTileVO;", "tile", "Lru/ozon/app/android/video/preload/data/PreloadVideoInfo;", "fullVideoInfo", "LWZ/t;", "itemTokenizedEvent", "tokenizedEvent", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "cornerImage", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "cornerRadius", "Lru/ozon/uni/atoms/data/common/Paddings;", "horizontalPadding", "itemSpacing", "", "widgetBackgroundColor", "preview", "videoInfo", "paranjaColor", "videoStartEvent", "videoEndEvent", "Lru/ozon/app/android/ugc/widgets/reviewsPreview/data/ReviewsPreviewDTO$PlaybackType;", "playbackType", "", "blockIndex", "pairId", "<init>", "(JLru/ozon/uni/atoms/af/AtomAction;Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/app/android/ugc/widgets/reviewsPreview/common/ReviewsPreviewTileVO;Lru/ozon/app/android/video/preload/data/PreloadVideoInfo;LWZ/t;LWZ/t;Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/common/CornerRadius;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Ljava/lang/String;Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/app/android/video/preload/data/PreloadVideoInfo;Ljava/lang/String;LWZ/t;LWZ/t;Lru/ozon/app/android/ugc/widgets/reviewsPreview/data/ReviewsPreviewDTO$PlaybackType;IJ)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/af/AtomAction;", "getClickAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "getViewedItemAction", "Lru/ozon/app/android/ugc/widgets/reviewsPreview/common/ReviewsPreviewTileVO;", "getTile", "()Lru/ozon/app/android/ugc/widgets/reviewsPreview/common/ReviewsPreviewTileVO;", "Lru/ozon/app/android/video/preload/data/PreloadVideoInfo;", "getFullVideoInfo", "()Lru/ozon/app/android/video/preload/data/PreloadVideoInfo;", "LWZ/t;", "getItemTokenizedEvent", "()LWZ/t;", "getTokenizedEvent", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "getCornerImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "getCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "Lru/ozon/uni/atoms/data/common/Paddings;", "getHorizontalPadding", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getItemSpacing", "Ljava/lang/String;", "getWidgetBackgroundColor", "getPreview", "getVideoInfo", "getParanjaColor", "getVideoStartEvent", "getVideoEndEvent", "Lru/ozon/app/android/ugc/widgets/reviewsPreview/data/ReviewsPreviewDTO$PlaybackType;", "getPlaybackType", "()Lru/ozon/app/android/ugc/widgets/reviewsPreview/data/ReviewsPreviewDTO$PlaybackType;", "I", "getBlockIndex", "getPairId", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ReviewsPreviewVideoVO implements ReviewsPreviewVO {
        private final int blockIndex;
        private final AtomAction clickAction;
        private final ImageDTO cornerImage;
        private final CornerRadius cornerRadius;
        private final PreloadVideoInfo fullVideoInfo;
        private final Paddings horizontalPadding;
        private final long id;
        private final Paddings itemSpacing;
        private final t itemTokenizedEvent;
        private final long pairId;

        @NotNull
        private final String paranjaColor;

        @NotNull
        private final ReviewsPreviewDTO.PlaybackType playbackType;

        @NotNull
        private final ImageDTO preview;
        private final ReviewsPreviewTileVO tile;
        private final t tokenizedEvent;
        private final t videoEndEvent;

        @NotNull
        private final PreloadVideoInfo videoInfo;
        private final t videoStartEvent;
        private final AtomAction viewedItemAction;

        @NotNull
        private final String widgetBackgroundColor;

        public ReviewsPreviewVideoVO(long j11, AtomAction atomAction, AtomAction atomAction2, ReviewsPreviewTileVO reviewsPreviewTileVO, PreloadVideoInfo preloadVideoInfo, t tVar, t tVar2, ImageDTO imageDTO, CornerRadius cornerRadius, Paddings paddings, Paddings paddings2, @NotNull String widgetBackgroundColor, @NotNull ImageDTO preview, @NotNull PreloadVideoInfo videoInfo, @NotNull String paranjaColor, t tVar3, t tVar4, @NotNull ReviewsPreviewDTO.PlaybackType playbackType, int i11, long j12) {
            Intrinsics.checkNotNullParameter(widgetBackgroundColor, "widgetBackgroundColor");
            Intrinsics.checkNotNullParameter(preview, "preview");
            Intrinsics.checkNotNullParameter(videoInfo, "videoInfo");
            Intrinsics.checkNotNullParameter(paranjaColor, "paranjaColor");
            Intrinsics.checkNotNullParameter(playbackType, "playbackType");
            this.id = j11;
            this.clickAction = atomAction;
            this.viewedItemAction = atomAction2;
            this.tile = reviewsPreviewTileVO;
            this.fullVideoInfo = preloadVideoInfo;
            this.itemTokenizedEvent = tVar;
            this.tokenizedEvent = tVar2;
            this.cornerImage = imageDTO;
            this.cornerRadius = cornerRadius;
            this.horizontalPadding = paddings;
            this.itemSpacing = paddings2;
            this.widgetBackgroundColor = widgetBackgroundColor;
            this.preview = preview;
            this.videoInfo = videoInfo;
            this.paranjaColor = paranjaColor;
            this.videoStartEvent = tVar3;
            this.videoEndEvent = tVar4;
            this.playbackType = playbackType;
            this.blockIndex = i11;
            this.pairId = j12;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ReviewsPreviewVideoVO)) {
                return false;
            }
            ReviewsPreviewVideoVO reviewsPreviewVideoVO = (ReviewsPreviewVideoVO) other;
            return this.id == reviewsPreviewVideoVO.id && Intrinsics.d(this.clickAction, reviewsPreviewVideoVO.clickAction) && Intrinsics.d(this.viewedItemAction, reviewsPreviewVideoVO.viewedItemAction) && Intrinsics.d(this.tile, reviewsPreviewVideoVO.tile) && Intrinsics.d(this.fullVideoInfo, reviewsPreviewVideoVO.fullVideoInfo) && Intrinsics.d(this.itemTokenizedEvent, reviewsPreviewVideoVO.itemTokenizedEvent) && Intrinsics.d(this.tokenizedEvent, reviewsPreviewVideoVO.tokenizedEvent) && Intrinsics.d(this.cornerImage, reviewsPreviewVideoVO.cornerImage) && this.cornerRadius == reviewsPreviewVideoVO.cornerRadius && this.horizontalPadding == reviewsPreviewVideoVO.horizontalPadding && this.itemSpacing == reviewsPreviewVideoVO.itemSpacing && Intrinsics.d(this.widgetBackgroundColor, reviewsPreviewVideoVO.widgetBackgroundColor) && Intrinsics.d(this.preview, reviewsPreviewVideoVO.preview) && Intrinsics.d(this.videoInfo, reviewsPreviewVideoVO.videoInfo) && Intrinsics.d(this.paranjaColor, reviewsPreviewVideoVO.paranjaColor) && Intrinsics.d(this.videoStartEvent, reviewsPreviewVideoVO.videoStartEvent) && Intrinsics.d(this.videoEndEvent, reviewsPreviewVideoVO.videoEndEvent) && this.playbackType == reviewsPreviewVideoVO.playbackType && this.blockIndex == reviewsPreviewVideoVO.blockIndex && this.pairId == reviewsPreviewVideoVO.pairId;
        }

        public final int getBlockIndex() {
            return this.blockIndex;
        }

        public AtomAction getClickAction() {
            return this.clickAction;
        }

        public ImageDTO getCornerImage() {
            return this.cornerImage;
        }

        public CornerRadius getCornerRadius() {
            return this.cornerRadius;
        }

        public PreloadVideoInfo getFullVideoInfo() {
            return this.fullVideoInfo;
        }

        @Override // ru.ozon.app.android.ugc.widgets.reviewsPreview.data.CommonVO
        public Paddings getHorizontalPadding() {
            return this.horizontalPadding;
        }

        @Override // l20.c
        public long getId() {
            return this.id;
        }

        @Override // ru.ozon.app.android.ugc.widgets.reviewsPreview.data.CommonVO
        public Paddings getItemSpacing() {
            return this.itemSpacing;
        }

        public t getItemTokenizedEvent() {
            return this.itemTokenizedEvent;
        }

        public final long getPairId() {
            return this.pairId;
        }

        @NotNull
        public final String getParanjaColor() {
            return this.paranjaColor;
        }

        @NotNull
        public final ReviewsPreviewDTO.PlaybackType getPlaybackType() {
            return this.playbackType;
        }

        @NotNull
        public final ImageDTO getPreview() {
            return this.preview;
        }

        @Override // l20.c
        public Integer getScrollWidgetKey() {
            return DefaultImpls.getScrollWidgetKey(this);
        }

        @Override // ru.ozon.app.android.ugc.widgets.reviewsPreview.data.ReviewsPreviewVO
        public ReviewsPreviewTileVO getTile() {
            return this.tile;
        }

        public t getTokenizedEvent() {
            return this.tokenizedEvent;
        }

        public final t getVideoEndEvent() {
            return this.videoEndEvent;
        }

        @NotNull
        public final PreloadVideoInfo getVideoInfo() {
            return this.videoInfo;
        }

        public final t getVideoStartEvent() {
            return this.videoStartEvent;
        }

        @Override // l20.c
        public int getViewItemKey() {
            return DefaultImpls.getViewItemKey(this);
        }

        public AtomAction getViewedItemAction() {
            return this.viewedItemAction;
        }

        @Override // ru.ozon.app.android.ugc.widgets.reviewsPreview.data.CommonVO
        @NotNull
        public String getWidgetBackgroundColor() {
            return this.widgetBackgroundColor;
        }

        public int hashCode() {
            int hashCode = Long.hashCode(this.id) * 31;
            AtomAction atomAction = this.clickAction;
            int hashCode2 = (hashCode + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
            AtomAction atomAction2 = this.viewedItemAction;
            int hashCode3 = (hashCode2 + (atomAction2 == null ? 0 : atomAction2.hashCode())) * 31;
            ReviewsPreviewTileVO reviewsPreviewTileVO = this.tile;
            int hashCode4 = (hashCode3 + (reviewsPreviewTileVO == null ? 0 : reviewsPreviewTileVO.hashCode())) * 31;
            PreloadVideoInfo preloadVideoInfo = this.fullVideoInfo;
            int hashCode5 = (hashCode4 + (preloadVideoInfo == null ? 0 : preloadVideoInfo.hashCode())) * 31;
            t tVar = this.itemTokenizedEvent;
            int hashCode6 = (hashCode5 + (tVar == null ? 0 : tVar.hashCode())) * 31;
            t tVar2 = this.tokenizedEvent;
            int hashCode7 = (hashCode6 + (tVar2 == null ? 0 : tVar2.hashCode())) * 31;
            ImageDTO imageDTO = this.cornerImage;
            int hashCode8 = (hashCode7 + (imageDTO == null ? 0 : imageDTO.hashCode())) * 31;
            CornerRadius cornerRadius = this.cornerRadius;
            int hashCode9 = (hashCode8 + (cornerRadius == null ? 0 : cornerRadius.hashCode())) * 31;
            Paddings paddings = this.horizontalPadding;
            int hashCode10 = (hashCode9 + (paddings == null ? 0 : paddings.hashCode())) * 31;
            Paddings paddings2 = this.itemSpacing;
            int a11 = g.a((this.videoInfo.hashCode() + a.b(this.preview, g.a((hashCode10 + (paddings2 == null ? 0 : paddings2.hashCode())) * 31, 31, this.widgetBackgroundColor), 31)) * 31, 31, this.paranjaColor);
            t tVar3 = this.videoStartEvent;
            int hashCode11 = (a11 + (tVar3 == null ? 0 : tVar3.hashCode())) * 31;
            t tVar4 = this.videoEndEvent;
            return Long.hashCode(this.pairId) + C2454a.a(this.blockIndex, (this.playbackType.hashCode() + ((hashCode11 + (tVar4 != null ? tVar4.hashCode() : 0)) * 31)) * 31, 31);
        }

        @NotNull
        public String toString() {
            long j11 = this.id;
            AtomAction atomAction = this.clickAction;
            AtomAction atomAction2 = this.viewedItemAction;
            ReviewsPreviewTileVO reviewsPreviewTileVO = this.tile;
            PreloadVideoInfo preloadVideoInfo = this.fullVideoInfo;
            t tVar = this.itemTokenizedEvent;
            t tVar2 = this.tokenizedEvent;
            ImageDTO imageDTO = this.cornerImage;
            CornerRadius cornerRadius = this.cornerRadius;
            Paddings paddings = this.horizontalPadding;
            Paddings paddings2 = this.itemSpacing;
            String str = this.widgetBackgroundColor;
            ImageDTO imageDTO2 = this.preview;
            PreloadVideoInfo preloadVideoInfo2 = this.videoInfo;
            String str2 = this.paranjaColor;
            t tVar3 = this.videoStartEvent;
            t tVar4 = this.videoEndEvent;
            ReviewsPreviewDTO.PlaybackType playbackType = this.playbackType;
            int i11 = this.blockIndex;
            long j12 = this.pairId;
            StringBuilder sb2 = new StringBuilder("ReviewsPreviewVideoVO(id=");
            sb2.append(j11);
            sb2.append(", clickAction=");
            sb2.append(atomAction);
            sb2.append(", viewedItemAction=");
            sb2.append(atomAction2);
            sb2.append(", tile=");
            sb2.append(reviewsPreviewTileVO);
            sb2.append(", fullVideoInfo=");
            sb2.append(preloadVideoInfo);
            sb2.append(", itemTokenizedEvent=");
            sb2.append(tVar);
            sb2.append(", tokenizedEvent=");
            sb2.append(tVar2);
            sb2.append(", cornerImage=");
            sb2.append(imageDTO);
            sb2.append(", cornerRadius=");
            sb2.append(cornerRadius);
            sb2.append(", horizontalPadding=");
            sb2.append(paddings);
            sb2.append(", itemSpacing=");
            sb2.append(paddings2);
            sb2.append(", widgetBackgroundColor=");
            sb2.append(str);
            sb2.append(", preview=");
            sb2.append(imageDTO2);
            sb2.append(", videoInfo=");
            sb2.append(preloadVideoInfo2);
            Bi.a.f(sb2, ", paranjaColor=", str2, ", videoStartEvent=", tVar3);
            sb2.append(", videoEndEvent=");
            sb2.append(tVar4);
            sb2.append(", playbackType=");
            sb2.append(playbackType);
            sb2.append(", blockIndex=");
            sb2.append(i11);
            sb2.append(", pairId=");
            return f.a(j12, ")", sb2);
        }
    }

    ReviewsPreviewTileVO getTile();
}
