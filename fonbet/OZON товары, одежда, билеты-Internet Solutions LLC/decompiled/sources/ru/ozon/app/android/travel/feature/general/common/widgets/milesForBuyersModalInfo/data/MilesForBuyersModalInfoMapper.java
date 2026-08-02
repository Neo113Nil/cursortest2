package ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyersModalInfo.data;

import WZ.x;
import android.content.Context;
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
import ru.ozon.app.android.atoms.data.progress.ProgressBar;
import ru.ozon.app.android.logger.LoggerExtKt;
import ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyersModalInfo.data.MilesForBuyersModalInfoDTO;
import ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyersModalInfo.presentation.ui.MilesForBuyersModalInfoVO;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00042\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ&\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b!\u0010\"R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/data/MilesForBuyersModalInfoMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/data/MilesForBuyersModalInfoDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/presentation/ui/MilesForBuyersModalInfoVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/data/MilesForBuyersModalInfoDTO$ContentContainerDTO;", "contentContainer", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/presentation/ui/MilesForBuyersModalInfoVO$Content;", "mapContent", "(Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/data/MilesForBuyersModalInfoDTO$ContentContainerDTO;)Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/presentation/ui/MilesForBuyersModalInfoVO$Content;", "", "items", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/presentation/ui/MilesForBuyersModalInfoVO$ContentItem;", "mapItems", "(Ljava/util/List;)Ljava/util/List;", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/data/MilesForBuyersModalInfoDTO$PaddingsDTO;", "paddings", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/presentation/ui/MilesForBuyersModalInfoVO$Paddings;", "mapPaddings", "(Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/data/MilesForBuyersModalInfoDTO$PaddingsDTO;)Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/presentation/ui/MilesForBuyersModalInfoVO$Paddings;", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/data/MilesForBuyersModalInfoDTO$HeaderImageDTO;", "image", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/presentation/ui/MilesForBuyersModalInfoVO$Image;", "mapImage", "(Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/data/MilesForBuyersModalInfoDTO$HeaderImageDTO;)Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/presentation/ui/MilesForBuyersModalInfoVO$Image;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/data/MilesForBuyersModalInfoDTO;Ll20/d;)Ljava/util/List;", "Landroid/content/Context;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MilesForBuyersModalInfoMapper implements Function2<MilesForBuyersModalInfoDTO, d, List<? extends MilesForBuyersModalInfoVO>> {

    @NotNull
    private final Context context;

    public MilesForBuyersModalInfoMapper(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    private final MilesForBuyersModalInfoVO.Content mapContent(MilesForBuyersModalInfoDTO.ContentContainerDTO contentContainer) {
        return new MilesForBuyersModalInfoVO.Content(mapItems(contentContainer.getItems()), mapPaddings(contentContainer.getPaddings()), contentContainer.getBackgroundColor());
    }

    private final MilesForBuyersModalInfoVO.Image mapImage(MilesForBuyersModalInfoDTO.HeaderImageDTO image) {
        return new MilesForBuyersModalInfoVO.Image(image.getImage(), image.getImagePosition() == MilesForBuyersModalInfoDTO.ImagePosition.FOREGROUND, image.isBackgroundHeader());
    }

    private final List<MilesForBuyersModalInfoVO.ContentItem> mapItems(List<? extends Object> items) {
        Object obj;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : items) {
            if (obj2 instanceof TextDTO) {
                TextDTO textDTO = (TextDTO) obj2;
                textDTO.setTagSupported(true);
                obj = new MilesForBuyersModalInfoVO.ContentItem.TextItem(textDTO);
            } else if (obj2 instanceof IconDTO) {
                obj = new MilesForBuyersModalInfoVO.ContentItem.IconItem((IconDTO) obj2);
            } else if (obj2 instanceof MilesForBuyersModalInfoDTO.ProgressDTO) {
                MilesForBuyersModalInfoDTO.ProgressDTO progressDTO = (MilesForBuyersModalInfoDTO.ProgressDTO) obj2;
                ProgressBar progressBar = progressDTO.getProgressBar();
                String progressBackgroundColor = progressDTO.getProgressBackgroundColor();
                Integer progressHeight = progressDTO.getProgressHeight();
                int px = ResourceExtKt.toPx(progressHeight != null ? progressHeight.intValue() : 26, this.context);
                Integer paddingLeft = progressDTO.getPaddingLeft();
                obj = new MilesForBuyersModalInfoVO.ContentItem.ProgressItem(progressBar, progressBackgroundColor, paddingLeft != null ? ResourceExtKt.toPx(paddingLeft.intValue(), this.context) : 0, px);
            } else if (obj2 instanceof MilesForBuyersModalInfoDTO.SeparatorDTO) {
                obj = new MilesForBuyersModalInfoVO.ContentItem.SeparatorItem(ResourceExtKt.toPx(((MilesForBuyersModalInfoDTO.SeparatorDTO) obj2).m1253unboximpl(), this.context));
            } else if (obj2 instanceof CellDTO) {
                obj = new MilesForBuyersModalInfoVO.ContentItem.CellItem((CellDTO) obj2);
            } else {
                LoggerExtKt.sendNonFatal$default(new UnsupportedOperationException("Unsupported item type"), "Unsupported content item type: ".concat(obj2.getClass().getSimpleName()), null, null, 12, null);
                obj = null;
            }
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private final MilesForBuyersModalInfoVO.Paddings mapPaddings(MilesForBuyersModalInfoDTO.PaddingsDTO paddings) {
        Paddings bottom;
        Paddings trailing;
        Paddings leading;
        Paddings top;
        int i11 = 0;
        int px = (paddings == null || (top = paddings.getTop()) == null) ? 0 : ResourceExtKt.toPx(top.getPx(), this.context);
        int px2 = (paddings == null || (leading = paddings.getLeading()) == null) ? 0 : ResourceExtKt.toPx(leading.getPx(), this.context);
        int px3 = (paddings == null || (trailing = paddings.getTrailing()) == null) ? 0 : ResourceExtKt.toPx(trailing.getPx(), this.context);
        if (paddings != null && (bottom = paddings.getBottom()) != null) {
            i11 = ResourceExtKt.toPx(bottom.getPx(), this.context);
        }
        return new MilesForBuyersModalInfoVO.Paddings(px2, px, px3, i11);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<MilesForBuyersModalInfoVO> invoke(@NotNull MilesForBuyersModalInfoDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        MilesForBuyersModalInfoVO.Content mapContent = mapContent(state.getHeaderContainer());
        MilesForBuyersModalInfoVO.Content mapContent2 = mapContent(state.getBodyContainer());
        MilesForBuyersModalInfoDTO.HeaderImageDTO image = state.getImage();
        MilesForBuyersModalInfoVO.Image mapImage = image != null ? mapImage(image) : null;
        Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
        return C7714v.a0(new MilesForBuyersModalInfoVO(hashCode, mapContent, mapContent2, mapImage, trackingInfo != null ? x.b(trackingInfo, Long.valueOf(hashCode), null) : null));
    }
}
