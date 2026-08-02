package ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.core;

import Sc.InterfaceC4008j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.pdp.ui.configurators.ugc.data.ReviewGalleryPreviewResponse;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.data.ReviewGalleryPreviewV2DTO;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.presentation.ReviewGalleryPreviewV2VO;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.presentation.imagePrefetch.PreviewGalleryImagePrefetcher;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.presentation.imagePrefetch.PreviewItemSizeSetter;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0001\u0018\u0000 \u00182*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006:\u0001\u0018B\u001d\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ&\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0012R\u001b\u0010\u0017\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/core/ReviewGalleryPreviewV2Mapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/data/ReviewGalleryPreviewV2DTO;", "Ll20/d;", "", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/ReviewGalleryPreviewV2VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/imagePrefetch/PreviewItemSizeSetter;", "previewItemSizeSetter", "LSc/j;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/imagePrefetch/PreviewGalleryImagePrefetcher;", "photoPrefetcherLazy", "<init>", "(Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/imagePrefetch/PreviewItemSizeSetter;LSc/j;)V", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/data/ReviewGalleryPreviewV2DTO;Ll20/d;)Ljava/util/List;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/imagePrefetch/PreviewItemSizeSetter;", "photoPrefetcher$delegate", "LSc/j;", "getPhotoPrefetcher", "()Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/imagePrefetch/PreviewGalleryImagePrefetcher;", "photoPrefetcher", "Companion", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReviewGalleryPreviewV2Mapper implements Function2<ReviewGalleryPreviewV2DTO, d, List<? extends ReviewGalleryPreviewV2VO>> {

    /* renamed from: photoPrefetcher$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j photoPrefetcher;

    @NotNull
    private final PreviewItemSizeSetter previewItemSizeSetter;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/core/ReviewGalleryPreviewV2Mapper$Companion;", "", "<init>", "()V", "FIRST_PREFETCH_START_INDEX", "", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public ReviewGalleryPreviewV2Mapper(@NotNull PreviewItemSizeSetter previewItemSizeSetter, @NotNull InterfaceC4008j<PreviewGalleryImagePrefetcher> photoPrefetcherLazy) {
        Intrinsics.checkNotNullParameter(previewItemSizeSetter, "previewItemSizeSetter");
        Intrinsics.checkNotNullParameter(photoPrefetcherLazy, "photoPrefetcherLazy");
        this.previewItemSizeSetter = previewItemSizeSetter;
        this.photoPrefetcher = photoPrefetcherLazy;
    }

    private final PreviewGalleryImagePrefetcher getPhotoPrefetcher() {
        return (PreviewGalleryImagePrefetcher) this.photoPrefetcher.getValue();
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<ReviewGalleryPreviewV2VO> invoke(@NotNull ReviewGalleryPreviewV2DTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = state.getItems().hashCode();
        List<ReviewGalleryPreviewResponse.ItemDTO> items = state.getItems();
        ArrayList arrayList = new ArrayList(C7714v.z(items, 10));
        Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(ReviewGalleryPreviewV2MapperKt.toVO((ReviewGalleryPreviewResponse.ItemDTO) it.next(), Long.valueOf(hashCode)));
        }
        ReviewGalleryPreviewV2VO.ItemVO itemVO = (ReviewGalleryPreviewV2VO.ItemVO) C7714v.M(arrayList);
        if (itemVO != null) {
            this.previewItemSizeSetter.setupPreviewItemsSize(itemVO);
        }
        getPhotoPrefetcher().prefetchItemsFromIndex(arrayList, 3);
        ButtonV3DTO showMore = state.getShowMore();
        AtomActionDTO nextItemsAction = state.getNextItemsAction();
        AtomAction atomAction = nextItemsAction != null ? AtomActionMapperKt.toAtomAction(nextItemsAction, null) : null;
        Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
        return C7714v.a0(new ReviewGalleryPreviewV2VO(hashCode, arrayList, showMore, atomAction, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null));
    }
}
