package ru.ozon.app.android.ugc.core.widgets.singlereview.mediaCentric.presentation;

import B0.C2454a;
import G.g;
import Kk.C3532b;
import Ve.C4598rp;
import WZ.t;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewProductTile.ReviewProductTileDTO;
import ru.ozon.app.android.video.preload.data.PreloadVideoInfo;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.image.ImageAspectRatio;
import ru.ozon.uni.atoms.data.image.ImageDTO;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u00012BS\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010#R\u001f\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b$\u0010#R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b&\u0010'R\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010(\u001a\u0004\b)\u0010\u0018\"\u0004\b*\u0010+R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010/\u001a\u0004\b0\u00101¨\u00063"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/presentation/MediaCentricVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/presentation/MediaCentricVO$MediaItemVO;", "mediaItems", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewProductTile/ReviewProductTileDTO;", "products", "Lru/ozon/uni/atoms/data/image/ImageAspectRatio;", "aspectRatio", "", "selectedPosition", "LWZ/t;", "tokenizedEvent", "Lru/ozon/uni/atoms/af/AtomAction;", "reviewViewAction", "<init>", "(JLjava/util/List;Ljava/util/List;Lru/ozon/uni/atoms/data/image/ImageAspectRatio;ILWZ/t;Lru/ozon/uni/atoms/af/AtomAction;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getMediaItems", "()Ljava/util/List;", "getProducts", "Lru/ozon/uni/atoms/data/image/ImageAspectRatio;", "getAspectRatio", "()Lru/ozon/uni/atoms/data/image/ImageAspectRatio;", "I", "getSelectedPosition", "setSelectedPosition", "(I)V", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Lru/ozon/uni/atoms/af/AtomAction;", "getReviewViewAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "MediaItemVO", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class MediaCentricVO implements l20.c {

    @NotNull
    private final ImageAspectRatio aspectRatio;
    private final long id;

    @NotNull
    private final List<MediaItemVO> mediaItems;
    private final List<ReviewProductTileDTO> products;
    private final AtomAction reviewViewAction;
    private int selectedPosition;
    private final t tokenizedEvent;

    /* JADX WARN: Multi-variable type inference failed */
    public MediaCentricVO(long j11, @NotNull List<? extends MediaItemVO> mediaItems, List<ReviewProductTileDTO> list, @NotNull ImageAspectRatio aspectRatio, int i11, t tVar, AtomAction atomAction) {
        Intrinsics.checkNotNullParameter(mediaItems, "mediaItems");
        Intrinsics.checkNotNullParameter(aspectRatio, "aspectRatio");
        this.id = j11;
        this.mediaItems = mediaItems;
        this.products = list;
        this.aspectRatio = aspectRatio;
        this.selectedPosition = i11;
        this.tokenizedEvent = tVar;
        this.reviewViewAction = atomAction;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MediaCentricVO)) {
            return false;
        }
        MediaCentricVO mediaCentricVO = (MediaCentricVO) other;
        return this.id == mediaCentricVO.id && Intrinsics.d(this.mediaItems, mediaCentricVO.mediaItems) && Intrinsics.d(this.products, mediaCentricVO.products) && this.aspectRatio == mediaCentricVO.aspectRatio && this.selectedPosition == mediaCentricVO.selectedPosition && Intrinsics.d(this.tokenizedEvent, mediaCentricVO.tokenizedEvent) && Intrinsics.d(this.reviewViewAction, mediaCentricVO.reviewViewAction);
    }

    @NotNull
    public final ImageAspectRatio getAspectRatio() {
        return this.aspectRatio;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final List<MediaItemVO> getMediaItems() {
        return this.mediaItems;
    }

    public final List<ReviewProductTileDTO> getProducts() {
        return this.products;
    }

    public final AtomAction getReviewViewAction() {
        return this.reviewViewAction;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final int getSelectedPosition() {
        return this.selectedPosition;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int b11 = g.b(Long.hashCode(this.id) * 31, 31, this.mediaItems);
        List<ReviewProductTileDTO> list = this.products;
        int a11 = C2454a.a(this.selectedPosition, (this.aspectRatio.hashCode() + ((b11 + (list == null ? 0 : list.hashCode())) * 31)) * 31, 31);
        t tVar = this.tokenizedEvent;
        int hashCode = (a11 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        AtomAction atomAction = this.reviewViewAction;
        return hashCode + (atomAction != null ? atomAction.hashCode() : 0);
    }

    public final void setSelectedPosition(int i11) {
        this.selectedPosition = i11;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<MediaItemVO> list = this.mediaItems;
        List<ReviewProductTileDTO> list2 = this.products;
        ImageAspectRatio imageAspectRatio = this.aspectRatio;
        int i11 = this.selectedPosition;
        t tVar = this.tokenizedEvent;
        AtomAction atomAction = this.reviewViewAction;
        StringBuilder b11 = Lh.b.b(j11, "MediaCentricVO(id=", ", mediaItems=", list);
        b11.append(", products=");
        b11.append(list2);
        b11.append(", aspectRatio=");
        b11.append(imageAspectRatio);
        b11.append(", selectedPosition=");
        b11.append(i11);
        b11.append(", tokenizedEvent=");
        b11.append(tVar);
        b11.append(", reviewViewAction=");
        b11.append(atomAction);
        b11.append(")");
        return b11.toString();
    }

    public /* synthetic */ MediaCentricVO(long j11, List list, List list2, ImageAspectRatio imageAspectRatio, int i11, t tVar, AtomAction atomAction, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, list, list2, imageAspectRatio, (i12 & 16) != 0 ? 0 : i11, tVar, atomAction);
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\n\u000bR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0002\f\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/presentation/MediaCentricVO$MediaItemVO;", "", "", "getId", "()I", "id", "LWZ/t;", "getViewEvent", "()LWZ/t;", "viewEvent", "Image", "Video", "Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/presentation/MediaCentricVO$MediaItemVO$Image;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/presentation/MediaCentricVO$MediaItemVO$Video;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface MediaItemVO {

        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJD\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b\t\u0010\"R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/presentation/MediaCentricVO$MediaItemVO$Image;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/presentation/MediaCentricVO$MediaItemVO;", "", "id", "Lru/ozon/uni/atoms/af/AtomAction;", "clickAction", "LWZ/t;", "viewEvent", "", "isSelected", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "image", "<init>", "(ILru/ozon/uni/atoms/af/AtomAction;LWZ/t;ZLru/ozon/uni/atoms/data/image/ImageDTO;)V", "copy", "(ILru/ozon/uni/atoms/af/AtomAction;LWZ/t;ZLru/ozon/uni/atoms/data/image/ImageDTO;)Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/presentation/MediaCentricVO$MediaItemVO$Image;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lru/ozon/uni/atoms/af/AtomAction;", "getClickAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getViewEvent", "()LWZ/t;", "Z", "()Z", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Image implements MediaItemVO {

            @NotNull
            private final AtomAction clickAction;
            private final int id;

            @NotNull
            private final ImageDTO image;
            private final boolean isSelected;
            private final t viewEvent;

            public Image(int i11, @NotNull AtomAction clickAction, t tVar, boolean z11, @NotNull ImageDTO image) {
                Intrinsics.checkNotNullParameter(clickAction, "clickAction");
                Intrinsics.checkNotNullParameter(image, "image");
                this.id = i11;
                this.clickAction = clickAction;
                this.viewEvent = tVar;
                this.isSelected = z11;
                this.image = image;
            }

            public static /* synthetic */ Image copy$default(Image image, int i11, AtomAction atomAction, t tVar, boolean z11, ImageDTO imageDTO, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    i11 = image.id;
                }
                if ((i12 & 2) != 0) {
                    atomAction = image.clickAction;
                }
                if ((i12 & 4) != 0) {
                    tVar = image.viewEvent;
                }
                if ((i12 & 8) != 0) {
                    z11 = image.isSelected;
                }
                if ((i12 & 16) != 0) {
                    imageDTO = image.image;
                }
                ImageDTO imageDTO2 = imageDTO;
                t tVar2 = tVar;
                return image.copy(i11, atomAction, tVar2, z11, imageDTO2);
            }

            @NotNull
            public final Image copy(int id2, @NotNull AtomAction clickAction, t viewEvent, boolean isSelected, @NotNull ImageDTO image) {
                Intrinsics.checkNotNullParameter(clickAction, "clickAction");
                Intrinsics.checkNotNullParameter(image, "image");
                return new Image(id2, clickAction, viewEvent, isSelected, image);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Image)) {
                    return false;
                }
                Image image = (Image) other;
                return this.id == image.id && Intrinsics.d(this.clickAction, image.clickAction) && Intrinsics.d(this.viewEvent, image.viewEvent) && this.isSelected == image.isSelected && Intrinsics.d(this.image, image.image);
            }

            @NotNull
            public AtomAction getClickAction() {
                return this.clickAction;
            }

            @Override // ru.ozon.app.android.ugc.core.widgets.singlereview.mediaCentric.presentation.MediaCentricVO.MediaItemVO
            public int getId() {
                return this.id;
            }

            @NotNull
            public final ImageDTO getImage() {
                return this.image;
            }

            @Override // ru.ozon.app.android.ugc.core.widgets.singlereview.mediaCentric.presentation.MediaCentricVO.MediaItemVO
            public t getViewEvent() {
                return this.viewEvent;
            }

            public int hashCode() {
                int a11 = C4598rp.a(this.clickAction, Integer.hashCode(this.id) * 31, 31);
                t tVar = this.viewEvent;
                return this.image.hashCode() + C3532b.a((a11 + (tVar == null ? 0 : tVar.hashCode())) * 31, 31, this.isSelected);
            }

            /* renamed from: isSelected, reason: from getter */
            public boolean getIsSelected() {
                return this.isSelected;
            }

            @NotNull
            public String toString() {
                return "Image(id=" + this.id + ", clickAction=" + this.clickAction + ", viewEvent=" + this.viewEvent + ", isSelected=" + this.isSelected + ", image=" + this.image + ")";
            }
        }

        int getId();

        t getViewEvent();

        @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0012\u0010\u0013J~\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010'\u001a\u0004\b\t\u0010(R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b\n\u0010(R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010)\u001a\u0004\b,\u0010+R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u0010$\u001a\u0004\b0\u0010&R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010$\u001a\u0004\b1\u0010&¨\u00062"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/presentation/MediaCentricVO$MediaItemVO$Video;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/presentation/MediaCentricVO$MediaItemVO;", "", "id", "Lru/ozon/uni/atoms/af/AtomAction;", "clickAction", "LWZ/t;", "viewEvent", "", "isSelected", "isPlaybackAvailable", "Lru/ozon/app/android/video/preload/data/PreloadVideoInfo;", "video", "fullVideoInfo", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "preview", "videoStartEvent", "videoEndEvent", "<init>", "(ILru/ozon/uni/atoms/af/AtomAction;LWZ/t;ZZLru/ozon/app/android/video/preload/data/PreloadVideoInfo;Lru/ozon/app/android/video/preload/data/PreloadVideoInfo;Lru/ozon/uni/atoms/data/image/ImageDTO;LWZ/t;LWZ/t;)V", "copy", "(ILru/ozon/uni/atoms/af/AtomAction;LWZ/t;ZZLru/ozon/app/android/video/preload/data/PreloadVideoInfo;Lru/ozon/app/android/video/preload/data/PreloadVideoInfo;Lru/ozon/uni/atoms/data/image/ImageDTO;LWZ/t;LWZ/t;)Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/presentation/MediaCentricVO$MediaItemVO$Video;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lru/ozon/uni/atoms/af/AtomAction;", "getClickAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getViewEvent", "()LWZ/t;", "Z", "()Z", "Lru/ozon/app/android/video/preload/data/PreloadVideoInfo;", "getVideo", "()Lru/ozon/app/android/video/preload/data/PreloadVideoInfo;", "getFullVideoInfo", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "getPreview", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "getVideoStartEvent", "getVideoEndEvent", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Video implements MediaItemVO {

            @NotNull
            private final AtomAction clickAction;
            private final PreloadVideoInfo fullVideoInfo;
            private final int id;
            private final boolean isPlaybackAvailable;
            private final boolean isSelected;
            private final ImageDTO preview;

            @NotNull
            private final PreloadVideoInfo video;
            private final t videoEndEvent;
            private final t videoStartEvent;
            private final t viewEvent;

            public Video(int i11, @NotNull AtomAction clickAction, t tVar, boolean z11, boolean z12, @NotNull PreloadVideoInfo video, PreloadVideoInfo preloadVideoInfo, ImageDTO imageDTO, t tVar2, t tVar3) {
                Intrinsics.checkNotNullParameter(clickAction, "clickAction");
                Intrinsics.checkNotNullParameter(video, "video");
                this.id = i11;
                this.clickAction = clickAction;
                this.viewEvent = tVar;
                this.isSelected = z11;
                this.isPlaybackAvailable = z12;
                this.video = video;
                this.fullVideoInfo = preloadVideoInfo;
                this.preview = imageDTO;
                this.videoStartEvent = tVar2;
                this.videoEndEvent = tVar3;
            }

            public static /* synthetic */ Video copy$default(Video video, int i11, AtomAction atomAction, t tVar, boolean z11, boolean z12, PreloadVideoInfo preloadVideoInfo, PreloadVideoInfo preloadVideoInfo2, ImageDTO imageDTO, t tVar2, t tVar3, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    i11 = video.id;
                }
                if ((i12 & 2) != 0) {
                    atomAction = video.clickAction;
                }
                if ((i12 & 4) != 0) {
                    tVar = video.viewEvent;
                }
                if ((i12 & 8) != 0) {
                    z11 = video.isSelected;
                }
                if ((i12 & 16) != 0) {
                    z12 = video.isPlaybackAvailable;
                }
                if ((i12 & 32) != 0) {
                    preloadVideoInfo = video.video;
                }
                if ((i12 & 64) != 0) {
                    preloadVideoInfo2 = video.fullVideoInfo;
                }
                if ((i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                    imageDTO = video.preview;
                }
                if ((i12 & 256) != 0) {
                    tVar2 = video.videoStartEvent;
                }
                if ((i12 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                    tVar3 = video.videoEndEvent;
                }
                t tVar4 = tVar2;
                t tVar5 = tVar3;
                PreloadVideoInfo preloadVideoInfo3 = preloadVideoInfo2;
                ImageDTO imageDTO2 = imageDTO;
                boolean z13 = z12;
                PreloadVideoInfo preloadVideoInfo4 = preloadVideoInfo;
                return video.copy(i11, atomAction, tVar, z11, z13, preloadVideoInfo4, preloadVideoInfo3, imageDTO2, tVar4, tVar5);
            }

            @NotNull
            public final Video copy(int id2, @NotNull AtomAction clickAction, t viewEvent, boolean isSelected, boolean isPlaybackAvailable, @NotNull PreloadVideoInfo video, PreloadVideoInfo fullVideoInfo, ImageDTO preview, t videoStartEvent, t videoEndEvent) {
                Intrinsics.checkNotNullParameter(clickAction, "clickAction");
                Intrinsics.checkNotNullParameter(video, "video");
                return new Video(id2, clickAction, viewEvent, isSelected, isPlaybackAvailable, video, fullVideoInfo, preview, videoStartEvent, videoEndEvent);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Video)) {
                    return false;
                }
                Video video = (Video) other;
                return this.id == video.id && Intrinsics.d(this.clickAction, video.clickAction) && Intrinsics.d(this.viewEvent, video.viewEvent) && this.isSelected == video.isSelected && this.isPlaybackAvailable == video.isPlaybackAvailable && Intrinsics.d(this.video, video.video) && Intrinsics.d(this.fullVideoInfo, video.fullVideoInfo) && Intrinsics.d(this.preview, video.preview) && Intrinsics.d(this.videoStartEvent, video.videoStartEvent) && Intrinsics.d(this.videoEndEvent, video.videoEndEvent);
            }

            @NotNull
            public AtomAction getClickAction() {
                return this.clickAction;
            }

            public final PreloadVideoInfo getFullVideoInfo() {
                return this.fullVideoInfo;
            }

            @Override // ru.ozon.app.android.ugc.core.widgets.singlereview.mediaCentric.presentation.MediaCentricVO.MediaItemVO
            public int getId() {
                return this.id;
            }

            public final ImageDTO getPreview() {
                return this.preview;
            }

            @NotNull
            public final PreloadVideoInfo getVideo() {
                return this.video;
            }

            public final t getVideoEndEvent() {
                return this.videoEndEvent;
            }

            public final t getVideoStartEvent() {
                return this.videoStartEvent;
            }

            @Override // ru.ozon.app.android.ugc.core.widgets.singlereview.mediaCentric.presentation.MediaCentricVO.MediaItemVO
            public t getViewEvent() {
                return this.viewEvent;
            }

            public int hashCode() {
                int a11 = C4598rp.a(this.clickAction, Integer.hashCode(this.id) * 31, 31);
                t tVar = this.viewEvent;
                int hashCode = (this.video.hashCode() + C3532b.a(C3532b.a((a11 + (tVar == null ? 0 : tVar.hashCode())) * 31, 31, this.isSelected), 31, this.isPlaybackAvailable)) * 31;
                PreloadVideoInfo preloadVideoInfo = this.fullVideoInfo;
                int hashCode2 = (hashCode + (preloadVideoInfo == null ? 0 : preloadVideoInfo.hashCode())) * 31;
                ImageDTO imageDTO = this.preview;
                int hashCode3 = (hashCode2 + (imageDTO == null ? 0 : imageDTO.hashCode())) * 31;
                t tVar2 = this.videoStartEvent;
                int hashCode4 = (hashCode3 + (tVar2 == null ? 0 : tVar2.hashCode())) * 31;
                t tVar3 = this.videoEndEvent;
                return hashCode4 + (tVar3 != null ? tVar3.hashCode() : 0);
            }

            /* renamed from: isPlaybackAvailable, reason: from getter */
            public final boolean getIsPlaybackAvailable() {
                return this.isPlaybackAvailable;
            }

            /* renamed from: isSelected, reason: from getter */
            public boolean getIsSelected() {
                return this.isSelected;
            }

            @NotNull
            public String toString() {
                return "Video(id=" + this.id + ", clickAction=" + this.clickAction + ", viewEvent=" + this.viewEvent + ", isSelected=" + this.isSelected + ", isPlaybackAvailable=" + this.isPlaybackAvailable + ", video=" + this.video + ", fullVideoInfo=" + this.fullVideoInfo + ", preview=" + this.preview + ", videoStartEvent=" + this.videoStartEvent + ", videoEndEvent=" + this.videoEndEvent + ")";
            }

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public /* synthetic */ Video(int i11, AtomAction atomAction, t tVar, boolean z11, boolean z12, PreloadVideoInfo preloadVideoInfo, PreloadVideoInfo preloadVideoInfo2, ImageDTO imageDTO, t tVar2, t tVar3, int i12, DefaultConstructorMarker defaultConstructorMarker) {
                this(i11, atomAction, tVar, z11, r7, r8, r9, r10, r11, r12);
                t tVar4;
                t tVar5;
                ImageDTO imageDTO2;
                PreloadVideoInfo preloadVideoInfo3;
                PreloadVideoInfo preloadVideoInfo4;
                boolean z13;
                z11 = (i12 & 8) != 0 ? false : z11;
                if ((i12 & 16) != 0) {
                    tVar4 = tVar3;
                    tVar5 = tVar2;
                    imageDTO2 = imageDTO;
                    preloadVideoInfo3 = preloadVideoInfo2;
                    preloadVideoInfo4 = preloadVideoInfo;
                    z13 = false;
                } else {
                    tVar4 = tVar3;
                    tVar5 = tVar2;
                    imageDTO2 = imageDTO;
                    preloadVideoInfo3 = preloadVideoInfo2;
                    preloadVideoInfo4 = preloadVideoInfo;
                    z13 = z12;
                }
            }
        }
    }
}
