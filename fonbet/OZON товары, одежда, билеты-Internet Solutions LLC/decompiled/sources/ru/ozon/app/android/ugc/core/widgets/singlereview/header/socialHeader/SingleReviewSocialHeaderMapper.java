package ru.ozon.app.android.ugc.core.widgets.singlereview.header.socialHeader;

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
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000b\u001a\u00020\u0005*\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0014\u001a\u00020\u0011*\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J&\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/header/socialHeader/SingleReviewSocialHeaderMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/header/socialHeader/SingleReviewSocialHeaderDO;", "Ll20/d;", "", "Lru/ozon/app/android/ugc/core/widgets/singlereview/header/socialHeader/SingleReviewSocialHeaderVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/prefetch/SingleReviewPrefetcher;", "imagePrefetcher", "<init>", "(Lru/ozon/app/android/ugc/core/widgets/singlereview/prefetch/SingleReviewPrefetcher;)V", "getSocialHeaderVO", "(Lru/ozon/app/android/ugc/core/widgets/singlereview/header/socialHeader/SingleReviewSocialHeaderDO;)Lru/ozon/app/android/ugc/core/widgets/singlereview/header/socialHeader/SingleReviewSocialHeaderVO;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$HeaderDTO$SocialHeader;", "", "prefetchUserAvatar", "(Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$HeaderDTO$SocialHeader;)V", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "", "isPaddingBottomEnabled", "addBottomPadding", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;Z)Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/ugc/core/widgets/singlereview/header/socialHeader/SingleReviewSocialHeaderDO;Ll20/d;)Ljava/util/List;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/prefetch/SingleReviewPrefetcher;", "", "defaultIconSize", "I", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SingleReviewSocialHeaderMapper implements Function2<SingleReviewSocialHeaderDO, d, List<? extends SingleReviewSocialHeaderVO>> {
    private final int defaultIconSize;

    @NotNull
    private final SingleReviewPrefetcher imagePrefetcher;

    public SingleReviewSocialHeaderMapper(@NotNull SingleReviewPrefetcher imagePrefetcher) {
        Intrinsics.checkNotNullParameter(imagePrefetcher, "imagePrefetcher");
        this.imagePrefetcher = imagePrefetcher;
        this.defaultIconSize = ResourceExtKt.toPx(IconDTO.IconSize.SIZE_500.getSizeShape());
    }

    private final CellDTO addBottomPadding(CellDTO cellDTO, boolean z11) {
        CellDTO.Settings settings;
        CellDTO.Settings settings2 = cellDTO.getSettings();
        if (settings2 != null) {
            settings = CellDTO.Settings.copy$default(settings2, null, z11 ? CommonCellSettings.LayoutPadding.PADDING_500 : CommonCellSettings.LayoutPadding.NONE, null, null, null, null, null, null, null, null, null, 2045, null);
        } else {
            settings = null;
        }
        return CellDTO.copy$default(cellDTO, null, settings, null, null, null, 29, null);
    }

    private final SingleReviewSocialHeaderVO getSocialHeaderVO(SingleReviewSocialHeaderDO singleReviewSocialHeaderDO) {
        SingleReviewDTO.HeaderDTO.SocialHeader socialHeader = singleReviewSocialHeaderDO.getSocialHeader();
        if (socialHeader == null) {
            throw new IllegalStateException("Required value was null.");
        }
        long hashCode = singleReviewSocialHeaderDO.getUuid().hashCode();
        prefetchUserAvatar(socialHeader);
        long hashCode2 = (hashCode + "_socialHeader").hashCode();
        CellDTO addBottomPadding = addBottomPadding(socialHeader.getSubscribe(), singleReviewSocialHeaderDO.getIsPaddingBottomEnabled());
        CellDTO addBottomPadding2 = addBottomPadding(socialHeader.getSubscribed(), singleReviewSocialHeaderDO.getIsPaddingBottomEnabled());
        boolean isSubscribed = socialHeader.isSubscribed();
        Map<String, TokenizedTrackingInfo> trackingInfo = singleReviewSocialHeaderDO.getTrackingInfo();
        t tokenizedEvent$default = trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null;
        Map<String, TokenizedTrackingInfo> tileReviewTracking = singleReviewSocialHeaderDO.getTileReviewTracking();
        t tokenizedEvent$default2 = tileReviewTracking != null ? TrackingInfoMapperKt.toTokenizedEvent$default(tileReviewTracking, Long.valueOf(hashCode), null, 2, null) : null;
        Boolean isTopAuthor = socialHeader.isTopAuthor();
        return new SingleReviewSocialHeaderVO(hashCode2, addBottomPadding, addBottomPadding2, isSubscribed, tokenizedEvent$default, tokenizedEvent$default2, isTopAuthor != null ? isTopAuthor.booleanValue() : false);
    }

    private final void prefetchUserAvatar(SingleReviewDTO.HeaderDTO.SocialHeader socialHeader) {
        IconDTO.IconSize size;
        CellDTO.LeftBlock leftBlock = socialHeader.getSubscribe().getLeftBlock();
        IconDTO icon = leftBlock != null ? leftBlock.getIcon() : null;
        this.imagePrefetcher.prefetchSquareImage(icon != null ? icon.getBackgroundImage() : null, Integer.valueOf((icon == null || (size = icon.getSize()) == null) ? this.defaultIconSize : ResourceExtKt.toPx(size.getSizeShape())));
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<SingleReviewSocialHeaderVO> invoke(@NotNull SingleReviewSocialHeaderDO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(getSocialHeaderVO(state));
    }
}
