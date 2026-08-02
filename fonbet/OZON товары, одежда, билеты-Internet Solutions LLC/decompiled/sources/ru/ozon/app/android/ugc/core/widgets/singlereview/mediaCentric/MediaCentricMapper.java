package ru.ozon.app.android.ugc.core.widgets.singlereview.mediaCentric;

import WZ.t;
import android.content.Context;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewProductTile.ReviewProductTileDTO;
import ru.ozon.app.android.pdp.ui.configurators.ugc.singleReview.SingleReviewDTO;
import ru.ozon.app.android.ugc.core.widgets.singlereview.mediaCentric.presentation.MediaCentricVO;
import ru.ozon.app.android.ugc.core.widgets.singlereview.prefetch.SingleReviewPrefetcher;
import ru.ozon.app.android.video.preload.data.PreloadVideoInfo;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.image.ImageAspectRatio;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000e\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\r\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004*\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ&\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010 R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/MediaCentricMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/MediaCentricDO;", "Ll20/d;", "", "Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/presentation/MediaCentricVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/prefetch/SingleReviewPrefetcher;", "imagePrefetcher", "Landroid/content/Context;", "context", "<init>", "(Lru/ozon/app/android/ugc/core/widgets/singlereview/prefetch/SingleReviewPrefetcher;Landroid/content/Context;)V", "widgetInfo", "getMediaCentricVO", "(Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/MediaCentricDO;Ll20/d;)Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/presentation/MediaCentricVO;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$MediaCentricDTO;", "", "voId", "Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/presentation/MediaCentricVO$MediaItemVO;", "getMediaItemsVO", "(Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$MediaCentricDTO;J)Ljava/util/List;", "", ImagesContract.URL, "Lru/ozon/uni/atoms/data/image/ImageAspectRatio;", "aspectRatio", "", "prefetchFirstImage", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/image/ImageAspectRatio;)V", "state", "invoke", "(Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/MediaCentricDO;Ll20/d;)Ljava/util/List;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/prefetch/SingleReviewPrefetcher;", "Landroid/content/Context;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MediaCentricMapper implements Function2<MediaCentricDO, d, List<? extends MediaCentricVO>> {

    @NotNull
    private final Context context;

    @NotNull
    private final SingleReviewPrefetcher imagePrefetcher;

    public MediaCentricMapper(@NotNull SingleReviewPrefetcher imagePrefetcher, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(imagePrefetcher, "imagePrefetcher");
        Intrinsics.checkNotNullParameter(context, "context");
        this.imagePrefetcher = imagePrefetcher;
        this.context = context;
    }

    private final MediaCentricVO getMediaCentricVO(MediaCentricDO mediaCentricDO, d dVar) {
        SingleReviewDTO.MediaCentricDTO mediaCentric = mediaCentricDO.getMediaCentric();
        if (mediaCentric == null) {
            throw new IllegalStateException("Required value was null.");
        }
        long hashCode = mediaCentricDO.getUuid().hashCode();
        long hashCode2 = (dVar.d() + mediaCentricDO.getUuid() + "mediaCentric").hashCode();
        List<MediaCentricVO.MediaItemVO> mediaItemsVO = getMediaItemsVO(mediaCentric, hashCode2);
        List<ReviewProductTileDTO> products = mediaCentric.getProducts();
        ImageAspectRatio aspectRatio = mediaCentric.getAspectRatio();
        Map<String, TokenizedTrackingInfo> trackingInfo = mediaCentricDO.getTrackingInfo();
        t tokenizedEvent$default = trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null;
        AtomActionDTO reviewViewAction = mediaCentric.getReviewViewAction();
        return new MediaCentricVO(hashCode2, mediaItemsVO, products, aspectRatio, 0, tokenizedEvent$default, reviewViewAction != null ? AtomActionMapperKt.toAtomAction(reviewViewAction, null) : null, 16, null);
    }

    private final List<MediaCentricVO.MediaItemVO> getMediaItemsVO(SingleReviewDTO.MediaCentricDTO mediaCentricDTO, long j11) {
        Object video;
        List<Object> mediaItems = mediaCentricDTO.getMediaItems();
        ArrayList arrayList = new ArrayList(C7714v.z(mediaItems, 10));
        int i11 = 0;
        for (Object obj : mediaItems) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            boolean z11 = i11 == 0;
            if (obj instanceof SingleReviewDTO.MediaCentricDTO.Image) {
                if (i11 == 0) {
                    prefetchFirstImage(((SingleReviewDTO.MediaCentricDTO.Image) obj).getUrl(), mediaCentricDTO.getAspectRatio());
                }
                SingleReviewDTO.MediaCentricDTO.Image image = (SingleReviewDTO.MediaCentricDTO.Image) obj;
                ImageDTO imageDTO = new ImageDTO(image.getUrl(), UniColors.LAYER_SURFACE.getToken(), mediaCentricDTO.getAspectRatio(), true, null, null, null, null, null, null, null, null, null, null, null, null, 65520, null);
                AtomAction atomAction = AtomActionMapperKt.toAtomAction(image.getClickAction(), image.getTrackingInfo());
                Map<String, TokenizedTrackingInfo> trackingInfo = image.getTrackingInfo();
                video = new MediaCentricVO.MediaItemVO.Image(i11, atomAction, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null, z11, imageDTO);
            } else {
                if (!(obj instanceof SingleReviewDTO.MediaCentricDTO.Video)) {
                    throw new IllegalArgumentException("Unknown item type");
                }
                SingleReviewDTO.MediaCentricDTO.Video video2 = (SingleReviewDTO.MediaCentricDTO.Video) obj;
                PreloadVideoInfo video3 = video2.getVideo();
                PreloadVideoInfo fullVideoInfo = video2.getFullVideoInfo();
                AtomAction atomAction2 = AtomActionMapperKt.toAtomAction(video2.getClickAction(), video2.getTrackingInfo());
                ImageDTO preview = video2.getPreview();
                Map<String, TokenizedTrackingInfo> trackingInfo2 = video2.getTrackingInfo();
                t tokenizedEvent$default = trackingInfo2 != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo2, Long.valueOf(j11), null, 2, null) : null;
                Map<String, TokenizedTrackingInfo> videoStartTrackingInfo = video2.getVideoStartTrackingInfo();
                t tokenizedEvent$default2 = videoStartTrackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(videoStartTrackingInfo, Long.valueOf(j11), null, 2, null) : null;
                Map<String, TokenizedTrackingInfo> videoEndTrackingInfo = video2.getVideoEndTrackingInfo();
                video = new MediaCentricVO.MediaItemVO.Video(i11, atomAction2, tokenizedEvent$default, z11, false, video3, fullVideoInfo, preview, tokenizedEvent$default2, videoEndTrackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(videoEndTrackingInfo, Long.valueOf(j11), null, 2, null) : null, 16, null);
            }
            arrayList.add(video);
            i11 = i12;
        }
        return arrayList;
    }

    private final void prefetchFirstImage(String url, ImageAspectRatio aspectRatio) {
        int intValue = ResourceExtKt.getDisplaySizePx(this.context).e().intValue();
        this.imagePrefetcher.prefetchRectImage(url, Integer.valueOf(intValue), Integer.valueOf((int) ((aspectRatio.getHeightRatio() / aspectRatio.getWidthRatio()) * intValue)));
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<MediaCentricVO> invoke(@NotNull MediaCentricDO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(getMediaCentricVO(state, widgetInfo));
    }
}
