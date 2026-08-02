package ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreview.data;

import G.g;
import Ql.c;
import com.google.android.gms.common.internal.ImagesContract;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.video.preload.data.PreloadVideoInfo;
import ru.ozon.moshi.adapters.serialize.collection.JsonCollectionDecoding;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u001eB+\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\"\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreview/data/ReviewGalleryPreviewDTO;", "", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "contentList", "", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreview/data/ReviewGalleryPreviewDTO$MediaContent;", "showMoreButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;)V", "getHeader", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getContentList$annotations", "()V", "getContentList", "()Ljava/util/List;", "getShowMoreButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "MediaContent", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ReviewGalleryPreviewDTO {
    public static final int $stable = 8;

    @NotNull
    private final List<MediaContent> contentList;
    private final TextAtom header;
    private final ButtonV3Atom.LargeBorderlessButton showMoreButton;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\f\rB\u001b\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0002\u000e\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreview/data/ReviewGalleryPreviewDTO$MediaContent;", "", ImagesContract.URL, "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;)V", "getUrl", "()Ljava/lang/String;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "Video", "Image", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreview/data/ReviewGalleryPreviewDTO$MediaContent$Image;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreview/data/ReviewGalleryPreviewDTO$MediaContent$Video;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class MediaContent {
        public static final int $stable = 0;
        private final AtomActionDTO action;

        @NotNull
        private final String url;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreview/data/ReviewGalleryPreviewDTO$MediaContent$Image;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreview/data/ReviewGalleryPreviewDTO$MediaContent;", ImagesContract.URL, "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;)V", "getUrl", "()Ljava/lang/String;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Image extends MediaContent {
            public static final int $stable = 0;
            private final AtomActionDTO action;

            @NotNull
            private final String url;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Image(@NotNull String url, AtomActionDTO atomActionDTO) {
                super(url, atomActionDTO, null);
                Intrinsics.checkNotNullParameter(url, "url");
                this.url = url;
                this.action = atomActionDTO;
            }

            public static /* synthetic */ Image copy$default(Image image, String str, AtomActionDTO atomActionDTO, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = image.url;
                }
                if ((i11 & 2) != 0) {
                    atomActionDTO = image.action;
                }
                return image.copy(str, atomActionDTO);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getUrl() {
                return this.url;
            }

            /* renamed from: component2, reason: from getter */
            public final AtomActionDTO getAction() {
                return this.action;
            }

            @NotNull
            public final Image copy(@NotNull String url, AtomActionDTO action) {
                Intrinsics.checkNotNullParameter(url, "url");
                return new Image(url, action);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Image)) {
                    return false;
                }
                Image image = (Image) other;
                return Intrinsics.d(this.url, image.url) && Intrinsics.d(this.action, image.action);
            }

            @Override // ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreview.data.ReviewGalleryPreviewDTO.MediaContent
            public AtomActionDTO getAction() {
                return this.action;
            }

            @Override // ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreview.data.ReviewGalleryPreviewDTO.MediaContent
            @NotNull
            public String getUrl() {
                return this.url;
            }

            public int hashCode() {
                int hashCode = this.url.hashCode() * 31;
                AtomActionDTO atomActionDTO = this.action;
                return hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode());
            }

            @NotNull
            public String toString() {
                return "Image(url=" + this.url + ", action=" + this.action + ")";
            }
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreview/data/ReviewGalleryPreviewDTO$MediaContent$Video;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreview/data/ReviewGalleryPreviewDTO$MediaContent;", ImagesContract.URL, "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "videoInfo", "Lru/ozon/app/android/video/preload/data/PreloadVideoInfo;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/app/android/video/preload/data/PreloadVideoInfo;)V", "getUrl", "()Ljava/lang/String;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getVideoInfo", "()Lru/ozon/app/android/video/preload/data/PreloadVideoInfo;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Video extends MediaContent {
            public static final int $stable = PreloadVideoInfo.$stable;
            private final AtomActionDTO action;

            @NotNull
            private final String url;
            private final PreloadVideoInfo videoInfo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Video(@NotNull String url, AtomActionDTO atomActionDTO, PreloadVideoInfo preloadVideoInfo) {
                super(url, atomActionDTO, null);
                Intrinsics.checkNotNullParameter(url, "url");
                this.url = url;
                this.action = atomActionDTO;
                this.videoInfo = preloadVideoInfo;
            }

            public static /* synthetic */ Video copy$default(Video video, String str, AtomActionDTO atomActionDTO, PreloadVideoInfo preloadVideoInfo, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = video.url;
                }
                if ((i11 & 2) != 0) {
                    atomActionDTO = video.action;
                }
                if ((i11 & 4) != 0) {
                    preloadVideoInfo = video.videoInfo;
                }
                return video.copy(str, atomActionDTO, preloadVideoInfo);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getUrl() {
                return this.url;
            }

            /* renamed from: component2, reason: from getter */
            public final AtomActionDTO getAction() {
                return this.action;
            }

            /* renamed from: component3, reason: from getter */
            public final PreloadVideoInfo getVideoInfo() {
                return this.videoInfo;
            }

            @NotNull
            public final Video copy(@NotNull String url, AtomActionDTO action, PreloadVideoInfo videoInfo) {
                Intrinsics.checkNotNullParameter(url, "url");
                return new Video(url, action, videoInfo);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Video)) {
                    return false;
                }
                Video video = (Video) other;
                return Intrinsics.d(this.url, video.url) && Intrinsics.d(this.action, video.action) && Intrinsics.d(this.videoInfo, video.videoInfo);
            }

            @Override // ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreview.data.ReviewGalleryPreviewDTO.MediaContent
            public AtomActionDTO getAction() {
                return this.action;
            }

            @Override // ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreview.data.ReviewGalleryPreviewDTO.MediaContent
            @NotNull
            public String getUrl() {
                return this.url;
            }

            public final PreloadVideoInfo getVideoInfo() {
                return this.videoInfo;
            }

            public int hashCode() {
                int hashCode = this.url.hashCode() * 31;
                AtomActionDTO atomActionDTO = this.action;
                int hashCode2 = (hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
                PreloadVideoInfo preloadVideoInfo = this.videoInfo;
                return hashCode2 + (preloadVideoInfo != null ? preloadVideoInfo.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                String str = this.url;
                AtomActionDTO atomActionDTO = this.action;
                PreloadVideoInfo preloadVideoInfo = this.videoInfo;
                StringBuilder c11 = c.c("Video(url=", str, ", action=", atomActionDTO, ", videoInfo=");
                c11.append(preloadVideoInfo);
                c11.append(")");
                return c11.toString();
            }
        }

        public /* synthetic */ MediaContent(String str, AtomActionDTO atomActionDTO, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, atomActionDTO);
        }

        public AtomActionDTO getAction() {
            return this.action;
        }

        @NotNull
        public String getUrl() {
            return this.url;
        }

        private MediaContent(String str, AtomActionDTO atomActionDTO) {
            this.url = str;
            this.action = atomActionDTO;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ReviewGalleryPreviewDTO(TextAtom textAtom, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "image", type = MediaContent.Image.class), @ProtoOneOfSignature(name = "video", type = MediaContent.Video.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends MediaContent> contentList, ButtonV3Atom.LargeBorderlessButton largeBorderlessButton) {
        Intrinsics.checkNotNullParameter(contentList, "contentList");
        this.header = textAtom;
        this.contentList = contentList;
        this.showMoreButton = largeBorderlessButton;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ReviewGalleryPreviewDTO copy$default(ReviewGalleryPreviewDTO reviewGalleryPreviewDTO, TextAtom textAtom, List list, ButtonV3Atom.LargeBorderlessButton largeBorderlessButton, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textAtom = reviewGalleryPreviewDTO.header;
        }
        if ((i11 & 2) != 0) {
            list = reviewGalleryPreviewDTO.contentList;
        }
        if ((i11 & 4) != 0) {
            largeBorderlessButton = reviewGalleryPreviewDTO.showMoreButton;
        }
        return reviewGalleryPreviewDTO.copy(textAtom, list, largeBorderlessButton);
    }

    @JsonCollectionDecoding
    public static /* synthetic */ void getContentList$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final TextAtom getHeader() {
        return this.header;
    }

    @NotNull
    public final List<MediaContent> component2() {
        return this.contentList;
    }

    /* renamed from: component3, reason: from getter */
    public final ButtonV3Atom.LargeBorderlessButton getShowMoreButton() {
        return this.showMoreButton;
    }

    @NotNull
    public final ReviewGalleryPreviewDTO copy(TextAtom header, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "image", type = MediaContent.Image.class), @ProtoOneOfSignature(name = "video", type = MediaContent.Video.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends MediaContent> contentList, ButtonV3Atom.LargeBorderlessButton showMoreButton) {
        Intrinsics.checkNotNullParameter(contentList, "contentList");
        return new ReviewGalleryPreviewDTO(header, contentList, showMoreButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReviewGalleryPreviewDTO)) {
            return false;
        }
        ReviewGalleryPreviewDTO reviewGalleryPreviewDTO = (ReviewGalleryPreviewDTO) other;
        return Intrinsics.d(this.header, reviewGalleryPreviewDTO.header) && Intrinsics.d(this.contentList, reviewGalleryPreviewDTO.contentList) && Intrinsics.d(this.showMoreButton, reviewGalleryPreviewDTO.showMoreButton);
    }

    @NotNull
    public final List<MediaContent> getContentList() {
        return this.contentList;
    }

    public final TextAtom getHeader() {
        return this.header;
    }

    public final ButtonV3Atom.LargeBorderlessButton getShowMoreButton() {
        return this.showMoreButton;
    }

    public int hashCode() {
        TextAtom textAtom = this.header;
        int b11 = g.b((textAtom == null ? 0 : textAtom.hashCode()) * 31, 31, this.contentList);
        ButtonV3Atom.LargeBorderlessButton largeBorderlessButton = this.showMoreButton;
        return b11 + (largeBorderlessButton != null ? largeBorderlessButton.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ReviewGalleryPreviewDTO(header=" + this.header + ", contentList=" + this.contentList + ", showMoreButton=" + this.showMoreButton + ")";
    }
}
