package ru.ozon.app.android.marketing.widgets.sellerActionsPreview.core;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.utils.CornersConfig;
import ru.ozon.app.android.marketing.widgets.sellerActionsPreview.data.SellerActionsPreviewDTO;
import ru.ozon.app.android.marketing.widgets.sellerActionsPreview.data.SellerActionsPreviewDtoWrapper;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJP\u0010\u000b\u001a\u00020\f*\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\nH\u0002JH\u0010\u0017\u001a\u00020\f*\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/marketing/widgets/sellerActionsPreview/core/SellerActionsPreviewDtoToDtoWrapperMapper;", "", "<init>", "()V", "map", "", "Lru/ozon/app/android/marketing/widgets/sellerActionsPreview/data/SellerActionsPreviewDtoWrapper;", "dto", "Lru/ozon/app/android/marketing/widgets/sellerActionsPreview/data/SellerActionsPreviewDTO;", "isAsync", "", "addFirstCell", "", "", "cell", "horizontalPadding", "", "verticalPadding", "horizontalMargin", "containerBgColor", "", "widgetBackgroundColor", "hasSecondCell", "addSecondCell", "Companion", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SellerActionsPreviewDtoToDtoWrapperMapper {
    private final void addFirstCell(List<SellerActionsPreviewDtoWrapper<?>> list, Object obj, int i11, int i12, int i13, String str, String str2, boolean z11) {
        if (obj instanceof CellDTO) {
            CellDTO cellDTO = (CellDTO) obj;
            list.add(new SellerActionsPreviewDtoWrapper.DsCell(1, cellDTO, i11, i12, i13, str, str2, z11 ? CornersConfig.TOP : CornersConfig.ALL, cellDTO.getTrackingInfo()));
            return;
        }
        if (obj instanceof SellerActionsPreviewDTO.LadderCell) {
            SellerActionsPreviewDTO.LadderCell ladderCell = (SellerActionsPreviewDTO.LadderCell) obj;
            boolean z12 = ladderCell.getProgressLadder() != null;
            list.add(new SellerActionsPreviewDtoWrapper.ProgressLadderCell(2, ladderCell.getTitle(), ladderCell.getIconLeft(), ladderCell.getIconRight(), i11, i12, i13, str, str2, ladderCell.getAction(), (z12 || z11) ? CornersConfig.TOP : CornersConfig.ALL, ladderCell.getTrackingInfo()));
            if (ladderCell.getProgressLadder() != null) {
                list.add(new SellerActionsPreviewDtoWrapper.ProgressLadder(3, ladderCell.getProgressLadder(), i11, i12, i13, str, str2, ladderCell.getAction(), z11 ? CornersConfig.NONE : CornersConfig.BOTTOM, ladderCell.getTrackingInfo()));
            }
            if (z11) {
                list.add(new SellerActionsPreviewDtoWrapper.Separator(4, i11, i12, i13, str));
            }
        }
    }

    private final void addSecondCell(List<SellerActionsPreviewDtoWrapper<?>> list, Object obj, int i11, int i12, int i13, String str, String str2) {
        if (obj instanceof CellDTO) {
            CellDTO cellDTO = (CellDTO) obj;
            list.add(new SellerActionsPreviewDtoWrapper.DsCell(5, cellDTO, i11, i12, i13, str, str2, CornersConfig.BOTTOM, cellDTO.getTrackingInfo()));
            return;
        }
        if (obj instanceof SellerActionsPreviewDTO.LadderCell) {
            SellerActionsPreviewDTO.LadderCell ladderCell = (SellerActionsPreviewDTO.LadderCell) obj;
            boolean z11 = ladderCell.getProgressLadder() != null;
            list.add(new SellerActionsPreviewDtoWrapper.ProgressLadderCell(6, ladderCell.getTitle(), ladderCell.getIconLeft(), ladderCell.getIconRight(), i11, i12, i13, str, str2, ladderCell.getAction(), z11 ? CornersConfig.NONE : CornersConfig.BOTTOM, ladderCell.getTrackingInfo()));
            if (ladderCell.getProgressLadder() != null) {
                list.add(new SellerActionsPreviewDtoWrapper.ProgressLadder(7, ladderCell.getProgressLadder(), i11, i12, i13, str, str2, ladderCell.getAction(), CornersConfig.BOTTOM, ladderCell.getTrackingInfo()));
            }
        }
    }

    @NotNull
    public final List<SellerActionsPreviewDtoWrapper<?>> map(@NotNull SellerActionsPreviewDTO dto, boolean isAsync) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        ArrayList arrayList = new ArrayList();
        if (!isAsync) {
            arrayList.add(SellerActionsPreviewDtoWrapper.Async.INSTANCE);
        }
        Integer horizontalPadding = dto.getHorizontalPadding();
        int px = UiExtKt.toPx(horizontalPadding != null ? horizontalPadding.intValue() : 8);
        Integer horizontalMargin = dto.getHorizontalMargin();
        int px2 = UiExtKt.toPx(horizontalMargin != null ? horizontalMargin.intValue() : 8);
        Integer verticalPadding = dto.getVerticalPadding();
        int px3 = UiExtKt.toPx(verticalPadding != null ? verticalPadding.intValue() : 8);
        String backgroundColor = dto.getBackgroundColor();
        if (backgroundColor == null) {
            backgroundColor = UniColors.LAYER_FLOOR_1.getToken();
        }
        String str = backgroundColor;
        String containerBgColor = dto.getContainerBgColor();
        if (containerBgColor == null) {
            containerBgColor = UniColors.LAYER_FLOOR_0.getToken();
        }
        String str2 = containerBgColor;
        boolean z11 = dto.getCellSecond() != null;
        addFirstCell(arrayList, dto.getCellFirst(), px, px3, px2, str2, str, z11);
        if (z11) {
            addSecondCell(arrayList, dto.getCellSecond(), px, px3, px2, str2, str);
        }
        return arrayList;
    }
}
