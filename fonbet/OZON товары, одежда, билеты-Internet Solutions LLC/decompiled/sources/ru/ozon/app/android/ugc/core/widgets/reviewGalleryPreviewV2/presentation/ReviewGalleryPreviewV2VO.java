package ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.presentation;

import G.g;
import Lh.b;
import Ve.C4598rp;
import WZ.t;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.video.preload.data.PreloadVideoInfo;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001*B;\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010'\u001a\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/ReviewGalleryPreviewV2VO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/ReviewGalleryPreviewV2VO$ItemVO;", "items", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "showMore", "Lru/ozon/uni/atoms/af/AtomAction;", "nextItemsAction", "LWZ/t;", "tokenizedEvent", "<init>", "(JLjava/util/List;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getShowMore", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "Lru/ozon/uni/atoms/af/AtomAction;", "getNextItemsAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "ItemVO", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ReviewGalleryPreviewV2VO implements c {
    private final long id;

    @NotNull
    private final List<ItemVO> items;
    private final AtomAction nextItemsAction;
    private final ButtonV3DTO showMore;
    private final t tokenizedEvent;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJT\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u0013R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010\u0015R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b/\u0010\u0017R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00100\u001a\u0004\b1\u0010\u0019R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u00102\u001a\u0004\b3\u0010\u001b¨\u00064"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/ReviewGalleryPreviewV2VO$ItemVO;", "", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "image", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "icon", "Lru/ozon/uni/atoms/data/text/TextDTO;", "text", "LWZ/t;", "tokenizedEvent", "Lru/ozon/app/android/video/preload/data/PreloadVideoInfo;", "videoInfo", "<init>", "(Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/text/TextDTO;LWZ/t;Lru/ozon/app/android/video/preload/data/PreloadVideoInfo;)V", "component1", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "component2", "()Lru/ozon/uni/atoms/af/AtomAction;", "component3", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "component4", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "component5", "()LWZ/t;", "component6", "()Lru/ozon/app/android/video/preload/data/PreloadVideoInfo;", "copy", "(Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/text/TextDTO;LWZ/t;Lru/ozon/app/android/video/preload/data/PreloadVideoInfo;)Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/ReviewGalleryPreviewV2VO$ItemVO;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "getImage", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getIcon", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getText", "LWZ/t;", "getTokenizedEvent", "Lru/ozon/app/android/video/preload/data/PreloadVideoInfo;", "getVideoInfo", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ItemVO {
        public static final int $stable = 8;

        @NotNull
        private final AtomAction action;
        private final IconButtonV3DTO icon;

        @NotNull
        private final ImageDTO image;
        private final TextDTO text;
        private final t tokenizedEvent;
        private final PreloadVideoInfo videoInfo;

        public ItemVO(@NotNull ImageDTO image, @NotNull AtomAction action, IconButtonV3DTO iconButtonV3DTO, TextDTO textDTO, t tVar, PreloadVideoInfo preloadVideoInfo) {
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(action, "action");
            this.image = image;
            this.action = action;
            this.icon = iconButtonV3DTO;
            this.text = textDTO;
            this.tokenizedEvent = tVar;
            this.videoInfo = preloadVideoInfo;
        }

        public static /* synthetic */ ItemVO copy$default(ItemVO itemVO, ImageDTO imageDTO, AtomAction atomAction, IconButtonV3DTO iconButtonV3DTO, TextDTO textDTO, t tVar, PreloadVideoInfo preloadVideoInfo, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                imageDTO = itemVO.image;
            }
            if ((i11 & 2) != 0) {
                atomAction = itemVO.action;
            }
            if ((i11 & 4) != 0) {
                iconButtonV3DTO = itemVO.icon;
            }
            if ((i11 & 8) != 0) {
                textDTO = itemVO.text;
            }
            if ((i11 & 16) != 0) {
                tVar = itemVO.tokenizedEvent;
            }
            if ((i11 & 32) != 0) {
                preloadVideoInfo = itemVO.videoInfo;
            }
            t tVar2 = tVar;
            PreloadVideoInfo preloadVideoInfo2 = preloadVideoInfo;
            return itemVO.copy(imageDTO, atomAction, iconButtonV3DTO, textDTO, tVar2, preloadVideoInfo2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final ImageDTO getImage() {
            return this.image;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final AtomAction getAction() {
            return this.action;
        }

        /* renamed from: component3, reason: from getter */
        public final IconButtonV3DTO getIcon() {
            return this.icon;
        }

        /* renamed from: component4, reason: from getter */
        public final TextDTO getText() {
            return this.text;
        }

        /* renamed from: component5, reason: from getter */
        public final t getTokenizedEvent() {
            return this.tokenizedEvent;
        }

        /* renamed from: component6, reason: from getter */
        public final PreloadVideoInfo getVideoInfo() {
            return this.videoInfo;
        }

        @NotNull
        public final ItemVO copy(@NotNull ImageDTO image, @NotNull AtomAction action, IconButtonV3DTO icon, TextDTO text, t tokenizedEvent, PreloadVideoInfo videoInfo) {
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(action, "action");
            return new ItemVO(image, action, icon, text, tokenizedEvent, videoInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ItemVO)) {
                return false;
            }
            ItemVO itemVO = (ItemVO) other;
            return Intrinsics.d(this.image, itemVO.image) && Intrinsics.d(this.action, itemVO.action) && Intrinsics.d(this.icon, itemVO.icon) && Intrinsics.d(this.text, itemVO.text) && Intrinsics.d(this.tokenizedEvent, itemVO.tokenizedEvent) && Intrinsics.d(this.videoInfo, itemVO.videoInfo);
        }

        @NotNull
        public final AtomAction getAction() {
            return this.action;
        }

        public final IconButtonV3DTO getIcon() {
            return this.icon;
        }

        @NotNull
        public final ImageDTO getImage() {
            return this.image;
        }

        public final TextDTO getText() {
            return this.text;
        }

        public final t getTokenizedEvent() {
            return this.tokenizedEvent;
        }

        public final PreloadVideoInfo getVideoInfo() {
            return this.videoInfo;
        }

        public int hashCode() {
            int a11 = C4598rp.a(this.action, this.image.hashCode() * 31, 31);
            IconButtonV3DTO iconButtonV3DTO = this.icon;
            int hashCode = (a11 + (iconButtonV3DTO == null ? 0 : iconButtonV3DTO.hashCode())) * 31;
            TextDTO textDTO = this.text;
            int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
            t tVar = this.tokenizedEvent;
            int hashCode3 = (hashCode2 + (tVar == null ? 0 : tVar.hashCode())) * 31;
            PreloadVideoInfo preloadVideoInfo = this.videoInfo;
            return hashCode3 + (preloadVideoInfo != null ? preloadVideoInfo.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "ItemVO(image=" + this.image + ", action=" + this.action + ", icon=" + this.icon + ", text=" + this.text + ", tokenizedEvent=" + this.tokenizedEvent + ", videoInfo=" + this.videoInfo + ")";
        }
    }

    public ReviewGalleryPreviewV2VO(long j11, @NotNull List<ItemVO> items, ButtonV3DTO buttonV3DTO, AtomAction atomAction, t tVar) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.id = j11;
        this.items = items;
        this.showMore = buttonV3DTO;
        this.nextItemsAction = atomAction;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReviewGalleryPreviewV2VO)) {
            return false;
        }
        ReviewGalleryPreviewV2VO reviewGalleryPreviewV2VO = (ReviewGalleryPreviewV2VO) other;
        return this.id == reviewGalleryPreviewV2VO.id && Intrinsics.d(this.items, reviewGalleryPreviewV2VO.items) && Intrinsics.d(this.showMore, reviewGalleryPreviewV2VO.showMore) && Intrinsics.d(this.nextItemsAction, reviewGalleryPreviewV2VO.nextItemsAction) && Intrinsics.d(this.tokenizedEvent, reviewGalleryPreviewV2VO.tokenizedEvent);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final List<ItemVO> getItems() {
        return this.items;
    }

    public final AtomAction getNextItemsAction() {
        return this.nextItemsAction;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final ButtonV3DTO getShowMore() {
        return this.showMore;
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
        ButtonV3DTO buttonV3DTO = this.showMore;
        int hashCode = (b11 + (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode())) * 31;
        AtomAction atomAction = this.nextItemsAction;
        int hashCode2 = (hashCode + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode2 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<ItemVO> list = this.items;
        ButtonV3DTO buttonV3DTO = this.showMore;
        AtomAction atomAction = this.nextItemsAction;
        t tVar = this.tokenizedEvent;
        StringBuilder b11 = b.b(j11, "ReviewGalleryPreviewV2VO(id=", ", items=", list);
        b11.append(", showMore=");
        b11.append(buttonV3DTO);
        b11.append(", nextItemsAction=");
        b11.append(atomAction);
        return Lh.a.b(b11, ", tokenizedEvent=", tVar, ")");
    }
}
