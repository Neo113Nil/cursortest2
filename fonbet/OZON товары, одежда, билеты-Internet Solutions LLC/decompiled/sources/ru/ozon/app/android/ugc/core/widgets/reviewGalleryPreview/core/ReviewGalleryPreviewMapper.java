package ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreview.core;

import Sc.o;
import android.content.Context;
import android.content.res.Resources;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.pikazon.preload.ImagePrefetcher;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreview.data.ReviewGalleryPreviewDTO;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreview.presentation.ReviewGalleryPreviewVO;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.v3.mappers.TextMapperKt;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\r\b\u0001\u0018\u0000  2*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006:\u0001 B\u001f\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\n*\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0016J&\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001cR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreview/core/ReviewGalleryPreviewMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreview/data/ReviewGalleryPreviewDTO;", "Ll20/d;", "", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreview/presentation/ReviewGalleryPreviewVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Landroid/content/Context;", "context", "Lru/ozon/app/android/pikazon/preload/ImagePrefetcher;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreview/presentation/ReviewGalleryPreviewVO$ImagePrefetchVO;", "imagePrefetcher", "<init>", "(Landroid/content/Context;Lru/ozon/app/android/pikazon/preload/ImagePrefetcher;)V", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreview/data/ReviewGalleryPreviewDTO$MediaContent;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreview/presentation/ReviewGalleryPreviewVO$MediaContentVO;", "toVO", "(Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreview/data/ReviewGalleryPreviewDTO$MediaContent;)Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreview/presentation/ReviewGalleryPreviewVO$MediaContentVO;", "toImagePrefetchVO", "(Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreview/presentation/ReviewGalleryPreviewVO$MediaContentVO;)Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreview/presentation/ReviewGalleryPreviewVO$ImagePrefetchVO;", "", "getImageSize", "()I", "getPortraitModeScreenWidth", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreview/data/ReviewGalleryPreviewDTO;Ll20/d;)Ljava/util/List;", "Landroid/content/Context;", "Lru/ozon/app/android/pikazon/preload/ImagePrefetcher;", "imageSize", "I", "Companion", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReviewGalleryPreviewMapper implements Function2<ReviewGalleryPreviewDTO, d, List<? extends ReviewGalleryPreviewVO>> {
    private static final int dividerWidth;
    private static final int galleryMargin;

    @NotNull
    private final Context context;

    @NotNull
    private final ImagePrefetcher<ReviewGalleryPreviewVO.ImagePrefetchVO> imagePrefetcher;
    private final int imageSize;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreview/core/ReviewGalleryPreviewMapper$Companion;", "", "<init>", "()V", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Dimens dimens = Dimens.INSTANCE;
        galleryMargin = dimens.getDP_16();
        dividerWidth = dimens.getDP_4();
    }

    public ReviewGalleryPreviewMapper(@NotNull Context context, @NotNull ImagePrefetcher<ReviewGalleryPreviewVO.ImagePrefetchVO> imagePrefetcher) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(imagePrefetcher, "imagePrefetcher");
        this.context = context;
        this.imagePrefetcher = imagePrefetcher;
        this.imageSize = getImageSize();
    }

    private final int getImageSize() {
        return ((getPortraitModeScreenWidth() - (galleryMargin * 2)) - (dividerWidth * 3)) / 4;
    }

    private final int getPortraitModeScreenWidth() {
        Resources resources = this.context.getResources();
        return resources.getConfiguration().orientation == 1 ? resources.getDisplayMetrics().widthPixels : resources.getDisplayMetrics().heightPixels;
    }

    private final ReviewGalleryPreviewVO.ImagePrefetchVO toImagePrefetchVO(ReviewGalleryPreviewVO.MediaContentVO mediaContentVO) {
        return new ReviewGalleryPreviewVO.ImagePrefetchVO(mediaContentVO.getUrl(), mediaContentVO.getImageSize());
    }

    private final ReviewGalleryPreviewVO.MediaContentVO toVO(ReviewGalleryPreviewDTO.MediaContent mediaContent) {
        if (mediaContent instanceof ReviewGalleryPreviewDTO.MediaContent.Video) {
            ReviewGalleryPreviewDTO.MediaContent.Video video = (ReviewGalleryPreviewDTO.MediaContent.Video) mediaContent;
            return new ReviewGalleryPreviewVO.MediaContentVO.VideoVO(video.getUrl(), video.getAction(), this.imageSize, video.getVideoInfo());
        }
        if (!(mediaContent instanceof ReviewGalleryPreviewDTO.MediaContent.Image)) {
            throw new o();
        }
        ReviewGalleryPreviewDTO.MediaContent.Image image = (ReviewGalleryPreviewDTO.MediaContent.Image) mediaContent;
        return new ReviewGalleryPreviewVO.MediaContentVO.ImageVO(image.getUrl(), image.getAction(), this.imageSize);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<ReviewGalleryPreviewVO> invoke(@NotNull ReviewGalleryPreviewDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        List<ReviewGalleryPreviewDTO.MediaContent> contentList = state.getContentList();
        ArrayList arrayList = new ArrayList(C7714v.z(contentList, 10));
        Iterator<T> it = contentList.iterator();
        while (it.hasNext()) {
            arrayList.add(toVO((ReviewGalleryPreviewDTO.MediaContent) it.next()));
        }
        ImagePrefetcher<ReviewGalleryPreviewVO.ImagePrefetchVO> imagePrefetcher = this.imagePrefetcher;
        Context context = this.context;
        List K02 = C7714v.K0(arrayList, 4);
        ArrayList arrayList2 = new ArrayList(C7714v.z(K02, 10));
        Iterator it2 = K02.iterator();
        while (it2.hasNext()) {
            arrayList2.add(toImagePrefetchVO((ReviewGalleryPreviewVO.MediaContentVO) it2.next()));
        }
        imagePrefetcher.prefetch(context, arrayList2);
        long hashCode = widgetInfo.d().hashCode();
        TextAtom header = state.getHeader();
        return C7714v.a0(new ReviewGalleryPreviewVO(hashCode, header != null ? TextMapperKt.getDsTextAtom(header) : null, arrayList, state.getShowMoreButton()));
    }
}
