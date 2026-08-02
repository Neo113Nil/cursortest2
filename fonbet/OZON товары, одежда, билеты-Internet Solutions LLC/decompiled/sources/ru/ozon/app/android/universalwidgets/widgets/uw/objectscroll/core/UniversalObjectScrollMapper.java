package ru.ozon.app.android.universalwidgets.widgets.uw.objectscroll.core;

import android.content.Context;
import android.content.res.Resources;
import android.text.StaticLayout;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
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
import ru.ozon.app.android.composer.imageprefetch.PrefetchUtilsKt;
import ru.ozon.app.android.composer.imageprefetch.PrefetchableImage;
import ru.ozon.app.android.pikazon.image.ImageSize;
import ru.ozon.app.android.pikazon.preload.ImagePrefetcher;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.app.android.universalwidgets.widgets.uw.objectscroll.data.UniversalObjectScrollDTO;
import ru.ozon.app.android.universalwidgets.widgets.uw.objectscroll.presentation.UniversalObjectScrollVO;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.image.ImageSizeKt;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B+\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0012\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0012\u001a\u00020\u0017*\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0012\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010\"\u001a\u00020!2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001d2\u0006\u0010 \u001a\u00020\u001aH\u0002¢\u0006\u0004\b\"\u0010#J\u001f\u0010(\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b(\u0010)J*\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010*\u001a\u00020\u00022\n\u0010,\u001a\u00060\u0003j\u0002`+H\u0096\u0002¢\u0006\u0004\b-\u0010.R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010/R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00100R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00104\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00106\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00105¨\u00067"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/objectscroll/core/UniversalObjectScrollMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/universalwidgets/widgets/uw/objectscroll/data/UniversalObjectScrollDTO$ObjectScrollNew;", "Ll20/d;", "", "Lru/ozon/app/android/universalwidgets/widgets/uw/objectscroll/presentation/UniversalObjectScrollVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Landroid/content/Context;", "context", "Lru/ozon/app/android/pikazon/preload/ImagePrefetcher;", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "imagePrefetcher", "Lru/ozon/app/android/composer/imageprefetch/PrefetchableImage;", "imagePlaceholderPrefetcher", "<init>", "(Landroid/content/Context;Lru/ozon/app/android/pikazon/preload/ImagePrefetcher;Lru/ozon/app/android/pikazon/preload/ImagePrefetcher;)V", "", "widgetId", "toVO", "(Lru/ozon/app/android/universalwidgets/widgets/uw/objectscroll/data/UniversalObjectScrollDTO$ObjectScrollNew;J)Lru/ozon/app/android/universalwidgets/widgets/uw/objectscroll/presentation/UniversalObjectScrollVO;", "Lru/ozon/app/android/universalwidgets/widgets/uw/objectscroll/data/UniversalObjectScrollDTO$ObjectScrollNew$ObjectScrollNewItemDTO;", "", "isAdditionalInsetsNeeded", "Lru/ozon/app/android/universalwidgets/widgets/uw/objectscroll/presentation/UniversalObjectScrollVO$ObjectScrollNewItemVO;", "(Lru/ozon/app/android/universalwidgets/widgets/uw/objectscroll/data/UniversalObjectScrollDTO$ObjectScrollNew$ObjectScrollNewItemDTO;JLjava/lang/Boolean;)Lru/ozon/app/android/universalwidgets/widgets/uw/objectscroll/presentation/UniversalObjectScrollVO$ObjectScrollNewItemVO;", "firstItem", "", "getImageHeight", "(Lru/ozon/app/android/universalwidgets/widgets/uw/objectscroll/data/UniversalObjectScrollDTO$ObjectScrollNew$ObjectScrollNewItemDTO;)I", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "imageWidth", "", "updateMaxHeight", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;I)V", "Landroid/content/res/Resources;", "resources", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "padding", "getDimension", "(Landroid/content/res/Resources;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;)I", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/universalwidgets/widgets/uw/objectscroll/data/UniversalObjectScrollDTO$ObjectScrollNew;Ll20/d;)Ljava/util/List;", "Landroid/content/Context;", "Lru/ozon/app/android/pikazon/preload/ImagePrefetcher;", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "textAtomView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "maxTitleHeight", "I", "maxSubtitleHeight", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UniversalObjectScrollMapper implements Function2<UniversalObjectScrollDTO.ObjectScrollNew, d, List<? extends UniversalObjectScrollVO>> {

    @NotNull
    private final Context context;

    @NotNull
    private final ImagePrefetcher<PrefetchableImage> imagePlaceholderPrefetcher;

    @NotNull
    private final ImagePrefetcher<ImageDTO> imagePrefetcher;
    private int maxSubtitleHeight;
    private int maxTitleHeight;

    @NotNull
    private final TextAtomV2View textAtomView;

    public UniversalObjectScrollMapper(@NotNull Context context, @NotNull ImagePrefetcher<ImageDTO> imagePrefetcher, @NotNull ImagePrefetcher<PrefetchableImage> imagePlaceholderPrefetcher) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(imagePrefetcher, "imagePrefetcher");
        Intrinsics.checkNotNullParameter(imagePlaceholderPrefetcher, "imagePlaceholderPrefetcher");
        this.context = context;
        this.imagePrefetcher = imagePrefetcher;
        this.imagePlaceholderPrefetcher = imagePlaceholderPrefetcher;
        this.textAtomView = new TextAtomV2View(context, null, 0, 6, null);
    }

    private final int getDimension(Resources resources, CommonCellSettings.LayoutPadding padding) {
        return (int) resources.getDimension(padding.getCellLayoutPadding());
    }

    private final int getImageHeight(UniversalObjectScrollDTO.ObjectScrollNew.ObjectScrollNewItemDTO firstItem) {
        Integer imageWidth = firstItem.getImage().getImageWidth();
        int px = imageWidth != null ? UiExtKt.toPx(imageWidth.intValue()) : 0;
        if (firstItem.getImage().getAspectRatio() == null) {
            return 0;
        }
        return (int) (px / (r3.getWidthRatio() / r3.getHeightRatio()));
    }

    private final UniversalObjectScrollVO toVO(UniversalObjectScrollDTO.ObjectScrollNew objectScrollNew, long j11) {
        Boolean isTopRounded = objectScrollNew.isTopRounded();
        boolean booleanValue = isTopRounded != null ? isTopRounded.booleanValue() : false;
        Boolean isBottomRounded = objectScrollNew.isBottomRounded();
        boolean booleanValue2 = isBottomRounded != null ? isBottomRounded.booleanValue() : false;
        String backgroundColor = objectScrollNew.getBackgroundColor();
        List<UniversalObjectScrollDTO.ObjectScrollNew.ObjectScrollNewItemDTO> items = objectScrollNew.getItems();
        ArrayList arrayList = new ArrayList(C7714v.z(items, 10));
        Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(toVO((UniversalObjectScrollDTO.ObjectScrollNew.ObjectScrollNewItemDTO) it.next(), j11, objectScrollNew.isAdditionalInsetsNeeded()));
        }
        Map<String, TokenizedTrackingInfo> trackingInfo = objectScrollNew.getTrackingInfo();
        UniversalObjectScrollVO universalObjectScrollVO = new UniversalObjectScrollVO(j11, booleanValue, booleanValue2, backgroundColor, arrayList, null, 0, 0, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null, 224, null);
        universalObjectScrollVO.setMaxHeight(this.maxTitleHeight + this.maxSubtitleHeight);
        if (!objectScrollNew.getItems().isEmpty()) {
            universalObjectScrollVO.setImageHeight(getImageHeight(objectScrollNew.getItems().get(0)));
        }
        return universalObjectScrollVO;
    }

    private final void updateMaxHeight(TextDTO title, TextDTO subtitle, int imageWidth) {
        this.textAtomView.setMaxWidth(imageWidth);
        if (title != null) {
            TextHolderKt.bind$default(this.textAtomView, title, null, 2, null);
            StaticLayout.Builder ellipsize = StaticLayout.Builder.obtain(title.getText(), 0, title.getText().length(), this.textAtomView.getPaint(), imageWidth).setEllipsize(TextUtils.TruncateAt.END);
            Integer numberOfLines = title.getNumberOfLines();
            StaticLayout build = ellipsize.setMaxLines(numberOfLines != null ? numberOfLines.intValue() : 0).build();
            Intrinsics.checkNotNullExpressionValue(build, "build(...)");
            Resources resources = this.context.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            CommonCellSettings.LayoutPadding topPadding = title.getTopPadding();
            if (topPadding == null) {
                topPadding = CommonCellSettings.LayoutPadding.NONE;
            }
            int dimension = getDimension(resources, topPadding);
            Resources resources2 = this.context.getResources();
            Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
            CommonCellSettings.LayoutPadding bottomPadding = title.getBottomPadding();
            if (bottomPadding == null) {
                bottomPadding = CommonCellSettings.LayoutPadding.NONE;
            }
            int height = build.getHeight() + dimension + getDimension(resources2, bottomPadding);
            if (height > this.maxTitleHeight) {
                this.maxTitleHeight = height;
            }
        }
        if (subtitle != null) {
            TextHolderKt.bind$default(this.textAtomView, subtitle, null, 2, null);
            StaticLayout.Builder ellipsize2 = StaticLayout.Builder.obtain(subtitle.getText(), 0, subtitle.getText().length(), this.textAtomView.getPaint(), imageWidth).setEllipsize(TextUtils.TruncateAt.END);
            Integer numberOfLines2 = subtitle.getNumberOfLines();
            StaticLayout build2 = ellipsize2.setMaxLines(numberOfLines2 != null ? numberOfLines2.intValue() : 0).build();
            Intrinsics.checkNotNullExpressionValue(build2, "build(...)");
            Resources resources3 = this.context.getResources();
            Intrinsics.checkNotNullExpressionValue(resources3, "getResources(...)");
            CommonCellSettings.LayoutPadding topPadding2 = subtitle.getTopPadding();
            if (topPadding2 == null) {
                topPadding2 = CommonCellSettings.LayoutPadding.NONE;
            }
            int dimension2 = getDimension(resources3, topPadding2);
            Resources resources4 = this.context.getResources();
            Intrinsics.checkNotNullExpressionValue(resources4, "getResources(...)");
            CommonCellSettings.LayoutPadding bottomPadding2 = subtitle.getBottomPadding();
            if (bottomPadding2 == null) {
                bottomPadding2 = CommonCellSettings.LayoutPadding.NONE;
            }
            int height2 = build2.getHeight() + dimension2 + getDimension(resources4, bottomPadding2);
            if (height2 > this.maxSubtitleHeight) {
                this.maxSubtitleHeight = height2;
            }
        }
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<UniversalObjectScrollVO> invoke(@NotNull UniversalObjectScrollDTO.ObjectScrollNew state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVO(state, widgetInfo.d().hashCode()));
    }

    private final UniversalObjectScrollVO.ObjectScrollNewItemVO toVO(UniversalObjectScrollDTO.ObjectScrollNew.ObjectScrollNewItemDTO objectScrollNewItemDTO, long j11, Boolean bool) {
        ImageSize imageSize;
        TextDTO title = objectScrollNewItemDTO.getTitle();
        TextDTO subtitle = objectScrollNewItemDTO.getSubtitle();
        Integer imageWidth = objectScrollNewItemDTO.getImage().getImageWidth();
        updateMaxHeight(title, subtitle, imageWidth != null ? UiExtKt.toPx(imageWidth.intValue()) : 0);
        Boolean isAdult = objectScrollNewItemDTO.isAdult();
        boolean booleanValue = isAdult != null ? isAdult.booleanValue() : false;
        PrefetchUtilsKt.prefetchImage(this.context, objectScrollNewItemDTO.getImage(), this.imagePrefetcher);
        if (booleanValue && objectScrollNewItemDTO.getBlurPlaceholderImage() != null && (imageSize = ImageSizeKt.getImageSize(objectScrollNewItemDTO.getImage())) != null) {
            PrefetchUtilsKt.prefetchImage(this.context, new PrefetchableImage(UiExtKt.toPx(imageSize.getWidth(), this.context), UiExtKt.toPx(imageSize.getHeight(), this.context), objectScrollNewItemDTO.getBlurPlaceholderImage()), this.imagePlaceholderPrefetcher);
        }
        Boolean isAdult2 = objectScrollNewItemDTO.isAdult();
        boolean booleanValue2 = isAdult2 != null ? isAdult2.booleanValue() : false;
        ImageDTO image = objectScrollNewItemDTO.getImage();
        TextDTO title2 = objectScrollNewItemDTO.getTitle();
        TextDTO subtitle2 = objectScrollNewItemDTO.getSubtitle();
        String blurPlaceholderImage = objectScrollNewItemDTO.getBlurPlaceholderImage();
        BadgeDTO adBadge = objectScrollNewItemDTO.getAdBadge();
        boolean booleanValue3 = bool != null ? bool.booleanValue() : false;
        AtomActionDTO action = objectScrollNewItemDTO.getAction();
        AtomAction atomAction = action != null ? AtomActionMapperKt.toAtomAction(action, objectScrollNewItemDTO.getTrackingInfo()) : null;
        Map<String, TokenizedTrackingInfo> trackingInfo = objectScrollNewItemDTO.getTrackingInfo();
        return new UniversalObjectScrollVO.ObjectScrollNewItemVO(booleanValue2, booleanValue, image, title2, subtitle2, blurPlaceholderImage, adBadge, booleanValue3, atomAction, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null);
    }
}
