package ru.ozon.app.android.fresh.main.widgets.customCell.presentation;

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
import ru.ozon.app.android.fresh.main.utils.ExtentionsKt;
import ru.ozon.app.android.fresh.main.widgets.customCell.data.CustomCellDTO;
import ru.ozon.app.android.fresh.main.widgets.customCell.presentation.CustomCellVO;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\t\b\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\n\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\t\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\n\u001a\u00020\r*\u00020\fH\u0002¢\u0006\u0004\b\n\u0010\u000eJ&\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/customCell/presentation/CustomCellMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/fresh/main/widgets/customCell/data/CustomCellDTO;", "Ll20/d;", "", "Lru/ozon/app/android/fresh/main/widgets/customCell/presentation/CustomCellVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "widgetInfo", "toVO", "(Lru/ozon/app/android/fresh/main/widgets/customCell/data/CustomCellDTO;Ll20/d;)Lru/ozon/app/android/fresh/main/widgets/customCell/presentation/CustomCellVO;", "Lru/ozon/app/android/fresh/main/widgets/customCell/data/CustomCellDTO$PaddingsDTO;", "Lru/ozon/app/android/fresh/main/widgets/customCell/presentation/CustomCellVO$PaddingsVO;", "(Lru/ozon/app/android/fresh/main/widgets/customCell/data/CustomCellDTO$PaddingsDTO;)Lru/ozon/app/android/fresh/main/widgets/customCell/presentation/CustomCellVO$PaddingsVO;", "state", "invoke", "(Lru/ozon/app/android/fresh/main/widgets/customCell/data/CustomCellDTO;Ll20/d;)Ljava/util/List;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CustomCellMapper implements Function2<CustomCellDTO, d, List<? extends CustomCellVO>> {
    /* JADX WARN: Multi-variable type inference failed */
    private final CustomCellVO toVO(CustomCellDTO customCellDTO, d dVar) {
        AtomAction atomAction;
        String str;
        long id2 = ExtentionsKt.getId(dVar);
        CellDTO cell = customCellDTO.getCell();
        CustomCellDTO.RightBlock block = customCellDTO.getBlock();
        CustomCellVO.PaddingsVO vo = toVO(customCellDTO.getSpacers());
        AtomActionDTO action = customCellDTO.getAction();
        if (action != null) {
            atomAction = AtomActionMapperKt.toAtomAction(action, null);
            str = null;
        } else {
            atomAction = null;
            str = null;
        }
        String backgroundColor = customCellDTO.getBackgroundColor();
        String str2 = str;
        CustomCellDTO.CustomBackground contentColor = customCellDTO.getContentColor();
        Map<String, TokenizedTrackingInfo> trackingInfo = customCellDTO.getTrackingInfo();
        t tVar = str2;
        if (trackingInfo != null) {
            tVar = TrackingInfoMapperKt.mapToTokenizedEvent(trackingInfo, Long.valueOf(ExtentionsKt.getId(dVar)), str2);
        }
        return new CustomCellVO(id2, cell, block, vo, atomAction, backgroundColor, contentColor, tVar);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<CustomCellVO> invoke(@NotNull CustomCellDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVO(state, widgetInfo));
    }

    private final CustomCellVO.PaddingsVO toVO(CustomCellDTO.PaddingsDTO paddingsDTO) {
        return new CustomCellVO.PaddingsVO(UiExtKt.toPx(paddingsDTO.getHorizontal().getPx()), UiExtKt.toPx(paddingsDTO.getTop().getPx()), UiExtKt.toPx(paddingsDTO.getBottom().getPx()));
    }
}
