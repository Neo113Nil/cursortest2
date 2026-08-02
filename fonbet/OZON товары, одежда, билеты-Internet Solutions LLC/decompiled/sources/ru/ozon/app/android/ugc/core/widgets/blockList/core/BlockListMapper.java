package ru.ozon.app.android.ugc.core.widgets.blockList.core;

import WZ.t;
import WZ.x;
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
import ru.ozon.app.android.common.cellList.v2.data.CellListV2DTO;
import ru.ozon.app.android.ugc.core.widgets.blockList.data.BlockListDTO;
import ru.ozon.app.android.ugc.core.widgets.blockList.presentation.BlockListVO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\r\u001a\u00020\f*\u00020\t2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00100\u0004*\b\u0012\u0004\u0012\u00020\u000f0\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u0011J\u001b\u0010\r\u001a\u00020\u0013*\u00020\u00122\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u0014J&\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/blockList/core/BlockListMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/ugc/core/widgets/blockList/data/BlockListDTO;", "Ll20/d;", "", "Lru/ozon/app/android/ugc/core/widgets/blockList/presentation/BlockListVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/ugc/core/widgets/blockList/data/BlockListDTO$TopContainer;", "", "widgetId", "Lru/ozon/app/android/ugc/core/widgets/blockList/presentation/BlockListVO$TopContainer;", "toVO", "(Lru/ozon/app/android/ugc/core/widgets/blockList/data/BlockListDTO$TopContainer;J)Lru/ozon/app/android/ugc/core/widgets/blockList/presentation/BlockListVO$TopContainer;", "Lru/ozon/app/android/ugc/core/widgets/blockList/data/BlockListDTO$BlockDTO;", "Lru/ozon/app/android/ugc/core/widgets/blockList/presentation/BlockListVO$BlockVO;", "(Ljava/util/List;J)Ljava/util/List;", "Lru/ozon/app/android/ugc/core/widgets/blockList/data/BlockListDTO$CommonDTO;", "Lru/ozon/app/android/ugc/core/widgets/blockList/presentation/BlockListVO$CommonVO;", "(Lru/ozon/app/android/ugc/core/widgets/blockList/data/BlockListDTO$CommonDTO;J)Lru/ozon/app/android/ugc/core/widgets/blockList/presentation/BlockListVO$CommonVO;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/ugc/core/widgets/blockList/data/BlockListDTO;Ll20/d;)Ljava/util/List;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BlockListMapper implements Function2<BlockListDTO, d, List<? extends BlockListVO>> {
    private final BlockListVO.TopContainer toVO(BlockListDTO.TopContainer topContainer, long j11) {
        return new BlockListVO.TopContainer(toVO(topContainer.getBlocks(), j11), topContainer.isReversed(), topContainer.getVerticalPadding(), topContainer.getHorizontalPadding());
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<BlockListVO> invoke(@NotNull BlockListDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        BlockListVO.TopContainer vo = toVO(state.getTopContainer(), hashCode);
        CellListV2DTO bottomContainer = state.getBottomContainer();
        Paddings horizontalPadding = state.getHorizontalPadding();
        String backgroundColor = state.getBackgroundColor();
        Map<String, TokenizedTrackingInfo> tracking = state.getTracking();
        t tVar = null;
        if (tracking != null) {
            Long valueOf = Long.valueOf(hashCode);
            Intrinsics.checkNotNullParameter(tracking, "<this>");
            tVar = x.b(tracking, valueOf, null);
        }
        return C7714v.a0(new BlockListVO(hashCode, vo, bottomContainer, horizontalPadding, backgroundColor, tVar));
    }

    private final List<BlockListVO.BlockVO> toVO(List<BlockListDTO.BlockDTO> list, long j11) {
        ArrayList arrayList = new ArrayList();
        for (BlockListDTO.BlockDTO blockDTO : list) {
            TextDTO text = blockDTO.getText();
            ImageDTO image = blockDTO.getImage();
            IconDTO icon = blockDTO.getIcon();
            BlockListDTO.CommonDTO common = blockDTO.getCommon();
            arrayList.add(new BlockListVO.BlockVO(text, image, icon, common != null ? toVO(common, j11) : null));
        }
        return arrayList;
    }

    private final BlockListVO.CommonVO toVO(BlockListDTO.CommonDTO commonDTO, long j11) {
        String backgroundColor = commonDTO.getBackgroundColor();
        CornerRadius cornerRadius = commonDTO.getCornerRadius();
        BlockListDTO.LayoutPaddingsDTO paddings = commonDTO.getPaddings();
        t tVar = null;
        Paddings topPadding = paddings != null ? paddings.getTopPadding() : null;
        BlockListDTO.LayoutPaddingsDTO paddings2 = commonDTO.getPaddings();
        Paddings rightPadding = paddings2 != null ? paddings2.getRightPadding() : null;
        BlockListDTO.LayoutPaddingsDTO paddings3 = commonDTO.getPaddings();
        Paddings bottomPadding = paddings3 != null ? paddings3.getBottomPadding() : null;
        BlockListDTO.LayoutPaddingsDTO paddings4 = commonDTO.getPaddings();
        BlockListVO.LayoutPaddingsVO layoutPaddingsVO = new BlockListVO.LayoutPaddingsVO(topPadding, bottomPadding, paddings4 != null ? paddings4.getLeftPadding() : null, rightPadding);
        AtomActionDTO action = commonDTO.getAction();
        AtomAction atomAction = action != null ? AtomActionMapperKt.toAtomAction(action, commonDTO.getTracking()) : null;
        Map<String, TokenizedTrackingInfo> tracking = commonDTO.getTracking();
        if (tracking != null) {
            Long valueOf = Long.valueOf(j11);
            Intrinsics.checkNotNullParameter(tracking, "<this>");
            tVar = x.b(tracking, valueOf, null);
        }
        return new BlockListVO.CommonVO(backgroundColor, cornerRadius, layoutPaddingsVO, atomAction, tVar);
    }
}
