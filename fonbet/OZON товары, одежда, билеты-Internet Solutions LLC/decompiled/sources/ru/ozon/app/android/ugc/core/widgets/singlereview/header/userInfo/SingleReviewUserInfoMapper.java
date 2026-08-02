package ru.ozon.app.android.ugc.core.widgets.singlereview.header.userInfo;

import WZ.t;
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
import ru.ozon.app.android.pdp.ui.configurators.ugc.singleReview.SingleReviewDTO;
import ru.ozon.app.android.ugc.core.widgets.singlereview.prefetch.SingleReviewPrefetcher;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.v3.mappers.TextMapperKt;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000b\u001a\u00020\u0005*\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/header/userInfo/SingleReviewUserInfoMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/header/userInfo/SingleReviewUserInfoDO;", "Ll20/d;", "", "Lru/ozon/app/android/ugc/core/widgets/singlereview/header/userInfo/SingleReviewUserInfoVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/prefetch/SingleReviewPrefetcher;", "imagePrefetcher", "<init>", "(Lru/ozon/app/android/ugc/core/widgets/singlereview/prefetch/SingleReviewPrefetcher;)V", "getReviewHeaderVO", "(Lru/ozon/app/android/ugc/core/widgets/singlereview/header/userInfo/SingleReviewUserInfoDO;)Lru/ozon/app/android/ugc/core/widgets/singlereview/header/userInfo/SingleReviewUserInfoVO;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/ugc/core/widgets/singlereview/header/userInfo/SingleReviewUserInfoDO;Ll20/d;)Ljava/util/List;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/prefetch/SingleReviewPrefetcher;", "", "iconSize", "I", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SingleReviewUserInfoMapper implements Function2<SingleReviewUserInfoDO, d, List<? extends SingleReviewUserInfoVO>> {
    private final int iconSize;

    @NotNull
    private final SingleReviewPrefetcher imagePrefetcher;

    public SingleReviewUserInfoMapper(@NotNull SingleReviewPrefetcher imagePrefetcher) {
        Intrinsics.checkNotNullParameter(imagePrefetcher, "imagePrefetcher");
        this.imagePrefetcher = imagePrefetcher;
        this.iconSize = ResourceExtKt.toPx(IconDTO.IconSize.SIZE_500.getSizeShape());
    }

    private final SingleReviewUserInfoVO getReviewHeaderVO(SingleReviewUserInfoDO singleReviewUserInfoDO) {
        TextAtom externalReview;
        long hashCode = singleReviewUserInfoDO.getUuid().hashCode();
        SingleReviewPrefetcher singleReviewPrefetcher = this.imagePrefetcher;
        SingleReviewDTO.HeaderDTO header = singleReviewUserInfoDO.getHeader();
        singleReviewPrefetcher.prefetchSquareImage(header != null ? header.getAvatarUrl() : null, Integer.valueOf(this.iconSize));
        long hashCode2 = (hashCode + "_userInfo").hashCode();
        SingleReviewDTO.HeaderDTO header2 = singleReviewUserInfoDO.getHeader();
        String title = header2 != null ? header2.getTitle() : null;
        if (title == null) {
            throw new IllegalStateException("Required value was null.");
        }
        SingleReviewDTO.HeaderDTO header3 = singleReviewUserInfoDO.getHeader();
        TextDTO dsTextAtom$default = (header3 == null || (externalReview = header3.getExternalReview()) == null) ? null : TextMapperKt.dsTextAtom$default(externalReview, null, null, null, null, null, null, null, null, null, null, null, true, 2047, null);
        SingleReviewDTO.HeaderDTO header4 = singleReviewUserInfoDO.getHeader();
        String avatarUrl = header4 != null ? header4.getAvatarUrl() : null;
        Map<String, TokenizedTrackingInfo> trackingInfo = singleReviewUserInfoDO.getTrackingInfo();
        t tokenizedEvent$default = trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null;
        Map<String, TokenizedTrackingInfo> tileReviewTracking = singleReviewUserInfoDO.getTileReviewTracking();
        return new SingleReviewUserInfoVO(hashCode2, title, avatarUrl, dsTextAtom$default, tokenizedEvent$default, tileReviewTracking != null ? TrackingInfoMapperKt.toTokenizedEvent$default(tileReviewTracking, Long.valueOf(hashCode), null, 2, null) : null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<SingleReviewUserInfoVO> invoke(@NotNull SingleReviewUserInfoDO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(getReviewHeaderVO(state));
    }
}
