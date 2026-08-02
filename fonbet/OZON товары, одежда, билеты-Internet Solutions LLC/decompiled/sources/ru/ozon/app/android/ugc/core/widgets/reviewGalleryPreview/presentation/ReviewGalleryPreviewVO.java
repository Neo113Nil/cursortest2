package ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreview.presentation;

import B0.C2454a;
import B90.C2618u;
import G.g;
import K00.b;
import TY.a;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.video.preload.data.PreloadVideoInfo;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002%&B1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreview/presentation/ReviewGalleryPreviewVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", CommentV3DTO.HEADER_FIELD_NAME, "", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreview/presentation/ReviewGalleryPreviewVO$MediaContentVO;", "contentList", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "showMoreButton", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getHeader", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Ljava/util/List;", "getContentList", "()Ljava/util/List;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "getShowMoreButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "MediaContentVO", "ImagePrefetchVO", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ReviewGalleryPreviewVO implements c {

    @NotNull
    private final List<MediaContentVO> contentList;
    private final TextDTO header;
    private final long id;
    private final ButtonV3Atom.LargeBorderlessButton showMoreButton;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u000b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreview/presentation/ReviewGalleryPreviewVO$ImagePrefetchVO;", "", "", ImagesContract.URL, "", "imageSize", "<init>", "(Ljava/lang/String;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUrl", "I", "getImageSize", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ImagePrefetchVO {
        private final int imageSize;

        @NotNull
        private final String url;

        public ImagePrefetchVO(@NotNull String url, int i11) {
            Intrinsics.checkNotNullParameter(url, "url");
            this.url = url;
            this.imageSize = i11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ImagePrefetchVO)) {
                return false;
            }
            ImagePrefetchVO imagePrefetchVO = (ImagePrefetchVO) other;
            return Intrinsics.d(this.url, imagePrefetchVO.url) && this.imageSize == imagePrefetchVO.imageSize;
        }

        public final int getImageSize() {
            return this.imageSize;
        }

        @NotNull
        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return Integer.hashCode(this.imageSize) + (this.url.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return C2618u.f(this.imageSize, "ImagePrefetchVO(url=", this.url, ", imageSize=", ")");
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0010\u0011B#\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u0082\u0001\u0002\u0012\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreview/presentation/ReviewGalleryPreviewVO$MediaContentVO;", "", ImagesContract.URL, "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "imageSize", "", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;I)V", "getUrl", "()Ljava/lang/String;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getImageSize", "()I", "VideoVO", "ImageVO", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreview/presentation/ReviewGalleryPreviewVO$MediaContentVO$ImageVO;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreview/presentation/ReviewGalleryPreviewVO$MediaContentVO$VideoVO;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class MediaContentVO {
        private final AtomActionDTO action;
        private final int imageSize;

        @NotNull
        private final String url;

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\r¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreview/presentation/ReviewGalleryPreviewVO$MediaContentVO$ImageVO;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreview/presentation/ReviewGalleryPreviewVO$MediaContentVO;", "", ImagesContract.URL, "Lru/ozon/uni/atoms/data/AtomActionDTO;", "action", "", "imageSize", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUrl", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "I", "getImageSize", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ImageVO extends MediaContentVO {
            private final AtomActionDTO action;
            private final int imageSize;

            @NotNull
            private final String url;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ImageVO(@NotNull String url, AtomActionDTO atomActionDTO, int i11) {
                super(url, atomActionDTO, i11, null);
                Intrinsics.checkNotNullParameter(url, "url");
                this.url = url;
                this.action = atomActionDTO;
                this.imageSize = i11;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ImageVO)) {
                    return false;
                }
                ImageVO imageVO = (ImageVO) other;
                return Intrinsics.d(this.url, imageVO.url) && Intrinsics.d(this.action, imageVO.action) && this.imageSize == imageVO.imageSize;
            }

            @Override // ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreview.presentation.ReviewGalleryPreviewVO.MediaContentVO
            public AtomActionDTO getAction() {
                return this.action;
            }

            @Override // ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreview.presentation.ReviewGalleryPreviewVO.MediaContentVO
            public int getImageSize() {
                return this.imageSize;
            }

            @Override // ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreview.presentation.ReviewGalleryPreviewVO.MediaContentVO
            @NotNull
            public String getUrl() {
                return this.url;
            }

            public int hashCode() {
                int hashCode = this.url.hashCode() * 31;
                AtomActionDTO atomActionDTO = this.action;
                return Integer.hashCode(this.imageSize) + ((hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31);
            }

            @NotNull
            public String toString() {
                return b.e(this.imageSize, ")", Ql.c.c("ImageVO(url=", this.url, ", action=", this.action, ", imageSize="));
            }
        }

        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u000fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreview/presentation/ReviewGalleryPreviewVO$MediaContentVO$VideoVO;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreview/presentation/ReviewGalleryPreviewVO$MediaContentVO;", "", ImagesContract.URL, "Lru/ozon/uni/atoms/data/AtomActionDTO;", "action", "", "imageSize", "Lru/ozon/app/android/video/preload/data/PreloadVideoInfo;", "videoInfo", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;ILru/ozon/app/android/video/preload/data/PreloadVideoInfo;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUrl", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "I", "getImageSize", "Lru/ozon/app/android/video/preload/data/PreloadVideoInfo;", "getVideoInfo", "()Lru/ozon/app/android/video/preload/data/PreloadVideoInfo;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class VideoVO extends MediaContentVO {
            public static final int $stable = PreloadVideoInfo.$stable;
            private final AtomActionDTO action;
            private final int imageSize;

            @NotNull
            private final String url;
            private final PreloadVideoInfo videoInfo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public VideoVO(@NotNull String url, AtomActionDTO atomActionDTO, int i11, PreloadVideoInfo preloadVideoInfo) {
                super(url, atomActionDTO, i11, null);
                Intrinsics.checkNotNullParameter(url, "url");
                this.url = url;
                this.action = atomActionDTO;
                this.imageSize = i11;
                this.videoInfo = preloadVideoInfo;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof VideoVO)) {
                    return false;
                }
                VideoVO videoVO = (VideoVO) other;
                return Intrinsics.d(this.url, videoVO.url) && Intrinsics.d(this.action, videoVO.action) && this.imageSize == videoVO.imageSize && Intrinsics.d(this.videoInfo, videoVO.videoInfo);
            }

            @Override // ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreview.presentation.ReviewGalleryPreviewVO.MediaContentVO
            public AtomActionDTO getAction() {
                return this.action;
            }

            @Override // ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreview.presentation.ReviewGalleryPreviewVO.MediaContentVO
            public int getImageSize() {
                return this.imageSize;
            }

            @Override // ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreview.presentation.ReviewGalleryPreviewVO.MediaContentVO
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
                int a11 = C2454a.a(this.imageSize, (hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31, 31);
                PreloadVideoInfo preloadVideoInfo = this.videoInfo;
                return a11 + (preloadVideoInfo != null ? preloadVideoInfo.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                String str = this.url;
                AtomActionDTO atomActionDTO = this.action;
                int i11 = this.imageSize;
                PreloadVideoInfo preloadVideoInfo = this.videoInfo;
                StringBuilder c11 = Ql.c.c("VideoVO(url=", str, ", action=", atomActionDTO, ", imageSize=");
                c11.append(i11);
                c11.append(", videoInfo=");
                c11.append(preloadVideoInfo);
                c11.append(")");
                return c11.toString();
            }
        }

        public /* synthetic */ MediaContentVO(String str, AtomActionDTO atomActionDTO, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, atomActionDTO, i11);
        }

        public AtomActionDTO getAction() {
            return this.action;
        }

        public int getImageSize() {
            return this.imageSize;
        }

        @NotNull
        public String getUrl() {
            return this.url;
        }

        private MediaContentVO(String str, AtomActionDTO atomActionDTO, int i11) {
            this.url = str;
            this.action = atomActionDTO;
            this.imageSize = i11;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ReviewGalleryPreviewVO(long j11, TextDTO textDTO, @NotNull List<? extends MediaContentVO> contentList, ButtonV3Atom.LargeBorderlessButton largeBorderlessButton) {
        Intrinsics.checkNotNullParameter(contentList, "contentList");
        this.id = j11;
        this.header = textDTO;
        this.contentList = contentList;
        this.showMoreButton = largeBorderlessButton;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReviewGalleryPreviewVO)) {
            return false;
        }
        ReviewGalleryPreviewVO reviewGalleryPreviewVO = (ReviewGalleryPreviewVO) other;
        return this.id == reviewGalleryPreviewVO.id && Intrinsics.d(this.header, reviewGalleryPreviewVO.header) && Intrinsics.d(this.contentList, reviewGalleryPreviewVO.contentList) && Intrinsics.d(this.showMoreButton, reviewGalleryPreviewVO.showMoreButton);
    }

    @NotNull
    public final List<MediaContentVO> getContentList() {
        return this.contentList;
    }

    public final TextDTO getHeader() {
        return this.header;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final ButtonV3Atom.LargeBorderlessButton getShowMoreButton() {
        return this.showMoreButton;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        TextDTO textDTO = this.header;
        int b11 = g.b((hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31, 31, this.contentList);
        ButtonV3Atom.LargeBorderlessButton largeBorderlessButton = this.showMoreButton;
        return b11 + (largeBorderlessButton != null ? largeBorderlessButton.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextDTO textDTO = this.header;
        List<MediaContentVO> list = this.contentList;
        ButtonV3Atom.LargeBorderlessButton largeBorderlessButton = this.showMoreButton;
        StringBuilder b11 = a.b("ReviewGalleryPreviewVO(id=", j11, ", header=", textDTO);
        b11.append(", contentList=");
        b11.append(list);
        b11.append(", showMoreButton=");
        b11.append(largeBorderlessButton);
        b11.append(")");
        return b11.toString();
    }
}
