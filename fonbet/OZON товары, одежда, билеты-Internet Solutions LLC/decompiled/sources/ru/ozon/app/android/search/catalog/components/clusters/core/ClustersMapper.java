package ru.ozon.app.android.search.catalog.components.clusters.core;

import WZ.x;
import android.content.Context;
import androidx.recyclerview.widget.m;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
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
import ru.ozon.app.android.search.catalog.components.clusters.data.ClustersDTO;
import ru.ozon.app.android.search.catalog.components.clusters.presentation.ClustersVO;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u001f2*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006:\u0001\u001fB\u0011\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\r\u001a\u00020\f*\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\f*\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\f*\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u0013\u0010\u0011\u001a\u00020\f*\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u000eJ\u0013\u0010\u0012\u001a\u00020\f*\u00020\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u000eJ\u0013\u0010\u0013\u001a\u00020\f*\u00020\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u000eJ\u0015\u0010\u0015\u001a\u00020\f*\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0017\u001a\u00020\f*\u0004\u0018\u00010\f2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J*\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0019\u001a\u00020\u00022\n\u0010\u001b\u001a\u00060\u0003j\u0002`\u001aH\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001e¨\u0006 "}, d2 = {"Lru/ozon/app/android/search/catalog/components/clusters/core/ClustersMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/search/catalog/components/clusters/data/ClustersDTO;", "Ll20/d;", "", "Lru/ozon/app/android/search/catalog/components/clusters/presentation/ClustersVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "", "getCenterBlockMaxWidth", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;)I", "getLeftBlockWidth", "getRightBlockWidth", "getLeftBlockHeight", "getLeftImageSize", "getRightImageSize", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "(Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;)I", "getDimensOrZero", "(Ljava/lang/Integer;Landroid/content/Context;)I", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/search/catalog/components/clusters/data/ClustersDTO;Ll20/d;)Ljava/util/List;", "Landroid/content/Context;", "Companion", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ClustersMapper implements Function2<ClustersDTO, d, List<? extends ClustersVO>> {

    @NotNull
    private final Context context;
    public static final int $stable = 8;
    private static final int maxClusterWidth = UiExtKt.toPx(m.e.DEFAULT_SWIPE_ANIMATION_DURATION);

    public ClustersMapper(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    private final int getCenterBlockMaxWidth(CellDTO cellDTO) {
        int leftBlockWidth = (maxClusterWidth - getLeftBlockWidth(cellDTO)) - getRightBlockWidth(cellDTO);
        CellDTO.Settings settings = cellDTO.getSettings();
        int value = leftBlockWidth - value(settings != null ? settings.getLeftPadding() : null);
        CellDTO.Settings settings2 = cellDTO.getSettings();
        return value - value(settings2 != null ? settings2.getRightPadding() : null);
    }

    private final int getDimensOrZero(Integer num, Context context) {
        if ((num != null && num.intValue() == 0) || num == null) {
            return 0;
        }
        return context.getResources().getDimensionPixelSize(num.intValue());
    }

    private final int getLeftBlockHeight(CellDTO cellDTO) {
        int leftImageSize = getLeftImageSize(cellDTO);
        CellDTO.LeftBlock leftBlock = cellDTO.getLeftBlock();
        return leftImageSize + value(leftBlock != null ? leftBlock.getTopPadding() : null);
    }

    private final int getLeftBlockWidth(CellDTO cellDTO) {
        int leftImageSize = getLeftImageSize(cellDTO);
        CellDTO.LeftBlock leftBlock = cellDTO.getLeftBlock();
        return leftImageSize + value(leftBlock != null ? leftBlock.getRightPadding() : null);
    }

    private final int getLeftImageSize(CellDTO cellDTO) {
        IconDTO icon;
        IconDTO.IconSize size;
        ImageDTO image;
        Integer imageWidth;
        CellDTO.LeftBlock leftBlock = cellDTO.getLeftBlock();
        int i11 = 0;
        int intValue = (leftBlock == null || (image = leftBlock.getImage()) == null || (imageWidth = image.getImageWidth()) == null) ? 0 : imageWidth.intValue();
        CellDTO.LeftBlock leftBlock2 = cellDTO.getLeftBlock();
        if (leftBlock2 != null && (icon = leftBlock2.getIcon()) != null && (size = icon.getSize()) != null) {
            i11 = size.getSize();
        }
        return UiExtKt.toPx(Math.max(intValue, i11));
    }

    private final int getRightBlockWidth(CellDTO cellDTO) {
        int rightImageSize = getRightImageSize(cellDTO);
        CellDTO.RightBlock rightBlock = cellDTO.getRightBlock();
        return rightImageSize + value(rightBlock != null ? rightBlock.getLeftPadding() : null);
    }

    private final int getRightImageSize(CellDTO cellDTO) {
        IconDTO icon;
        IconDTO.IconSize size;
        ImageDTO image;
        Integer imageWidth;
        CellDTO.RightBlock rightBlock = cellDTO.getRightBlock();
        int i11 = 0;
        int intValue = (rightBlock == null || (image = rightBlock.getImage()) == null || (imageWidth = image.getImageWidth()) == null) ? 0 : imageWidth.intValue();
        CellDTO.RightBlock rightBlock2 = cellDTO.getRightBlock();
        if (rightBlock2 != null && (icon = rightBlock2.getIcon()) != null && (size = icon.getSize()) != null) {
            i11 = size.getSize();
        }
        return UiExtKt.toPx(Math.max(intValue, i11));
    }

    private final int value(CommonCellSettings.LayoutPadding layoutPadding) {
        if (layoutPadding != null) {
            return getDimensOrZero(Integer.valueOf(layoutPadding.getCellLayoutPadding()), this.context);
        }
        return 0;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<ClustersVO> invoke(@NotNull ClustersDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        List<CellDTO> clusters = state.getClusters();
        ArrayList arrayList = new ArrayList(C7714v.z(clusters, 10));
        for (CellDTO cellDTO : clusters) {
            arrayList.add(new ClustersVO.ClusterVO(CellDTO.copy$default(cellDTO, CellDTO.CenterBlock.copy$default(cellDTO.getCenterBlock(), CellDTO.CellText.copy$default(cellDTO.getCenterBlock().getTitle(), null, null, null, false, 2, null, 47, null), null, null, null, null, null, 62, null), null, null, null, null, 30, null), getLeftBlockWidth(cellDTO), getLeftBlockHeight(cellDTO), getCenterBlockMaxWidth(cellDTO)));
        }
        Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
        return C7714v.a0(new ClustersVO(hashCode, arrayList, trackingInfo != null ? x.b(trackingInfo, Long.valueOf(hashCode), null) : null));
    }
}
