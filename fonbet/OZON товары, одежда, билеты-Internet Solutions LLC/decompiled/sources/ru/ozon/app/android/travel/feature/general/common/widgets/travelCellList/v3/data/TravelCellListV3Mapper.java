package ru.ozon.app.android.travel.feature.general.common.widgets.travelCellList.v3.data;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.travel.feature.general.common.widgets.travelCellList.v3.data.TravelCellListV3DTO;
import ru.ozon.app.android.travel.feature.general.common.widgets.travelCellList.v3.presentation.TravelCellListV3VO;
import ru.ozon.app.android.travel.molecules.extensions.DsCellExtensionsKt;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.common.HTMLTagSupport;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ7\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00122\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014JC\u0010\u001c\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJC\u0010'\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\b\u0010\"\u001a\u0004\u0018\u00010\u000b2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020#2\b\u0010&\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b'\u0010(J\u0019\u0010*\u001a\u00020\u00182\b\u0010)\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b*\u0010+J*\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010,\u001a\u00020\u00022\n\u0010.\u001a\u00060\u0003j\u0002`-H\u0096\u0002¢\u0006\u0004\b/\u00100R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00101¨\u00062"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/travelCellList/v3/data/TravelCellListV3Mapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelCellList/v3/data/TravelCellListV3DTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelCellList/v3/presentation/TravelCellListV3VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "stateId", "", "blockIndex", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelCellList/v3/data/TravelCellListV3DTO$CellBlockDTO;", "blockDTO", "commonBackgroundColor", "", "mapBlockToVOs", "(Ljava/lang/String;ILru/ozon/app/android/travel/feature/general/common/widgets/travelCellList/v3/data/TravelCellListV3DTO$CellBlockDTO;Ljava/lang/String;)Ljava/util/List;", "subIndex", "Lru/ozon/uni/atoms/data/AtomDTO;", "atom", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelCellList/v3/presentation/TravelCellListV3VO$LayoutModel;", "layoutModel", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "onboardingApp", "produceVO", "(Ljava/lang/String;IILru/ozon/uni/atoms/data/AtomDTO;Lru/ozon/app/android/travel/feature/general/common/widgets/travelCellList/v3/presentation/TravelCellListV3VO$LayoutModel;Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;)Lru/ozon/app/android/travel/feature/general/common/widgets/travelCellList/v3/presentation/TravelCellListV3VO;", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelCellList/v3/data/TravelCellListV3DTO$ElementMargins;", "margins", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "cornerRadius", "blockBackgroundColor", "", "isFirstCellInBlock", "isLastCellInBlock", "backgroundColor", "produceLayoutModel", "(Lru/ozon/app/android/travel/feature/general/common/widgets/travelCellList/v3/data/TravelCellListV3DTO$ElementMargins;Lru/ozon/uni/atoms/data/common/CornerRadius;Ljava/lang/String;ZZLjava/lang/String;)Lru/ozon/app/android/travel/feature/general/common/widgets/travelCellList/v3/presentation/TravelCellListV3VO$LayoutModel;", "background", "getEmptyLayoutModelWithBackground", "(Ljava/lang/String;)Lru/ozon/app/android/travel/feature/general/common/widgets/travelCellList/v3/presentation/TravelCellListV3VO$LayoutModel;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/general/common/widgets/travelCellList/v3/data/TravelCellListV3DTO;Ll20/d;)Ljava/util/List;", "Landroid/content/Context;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelCellListV3Mapper implements Function2<TravelCellListV3DTO, d, List<? extends TravelCellListV3VO>> {

    @NotNull
    private final Context context;

    public TravelCellListV3Mapper(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    private final TravelCellListV3VO.LayoutModel getEmptyLayoutModelWithBackground(String background) {
        return new TravelCellListV3VO.LayoutModel(background, 0, 0, 0, 0, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1, types: [ru.ozon.uni.atoms.data.AtomDTO] */
    private final List<TravelCellListV3VO> mapBlockToVOs(String stateId, int blockIndex, TravelCellListV3DTO.CellBlockDTO blockDTO, String commonBackgroundColor) {
        boolean z11;
        TravelCellListV3Mapper travelCellListV3Mapper;
        String str;
        TravelCellListV3VO produceVO$default;
        TravelCellListV3VO produceVO$default2;
        ArrayList arrayList = new ArrayList();
        String str2 = commonBackgroundColor;
        TravelCellListV3VO.LayoutModel emptyLayoutModelWithBackground = getEmptyLayoutModelWithBackground(str2);
        TextDTO title = blockDTO.getTitle();
        if (title != null && (produceVO$default2 = produceVO$default(this, stateId, blockIndex, -1, title, emptyLayoutModelWithBackground, null, 32, null)) != null) {
            arrayList.add(produceVO$default2);
        }
        TextDTO subtitle = blockDTO.getSubtitle();
        if (subtitle != null && (produceVO$default = produceVO$default(this, stateId, blockIndex, -2, subtitle, emptyLayoutModelWithBackground, null, 32, null)) != null) {
            arrayList.add(produceVO$default);
        }
        int P11 = C7714v.P(blockDTO.getCells());
        int i11 = 0;
        for (Object obj : blockDTO.getCells()) {
            int i12 = i11 + 1;
            OnBoardingDTO onBoardingDTO = null;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            ?? r15 = (AtomDTO) obj;
            TravelCellListV3DTO.ElementMargins margins = blockDTO.getMargins();
            CornerRadius cornerRadius = blockDTO.getCornerRadius();
            String backgroundColor = blockDTO.getBackgroundColor();
            boolean z12 = i11 == 0;
            if (i11 == P11) {
                z11 = true;
                str = str2;
                travelCellListV3Mapper = this;
            } else {
                z11 = false;
                travelCellListV3Mapper = this;
                str = str2;
            }
            TravelCellListV3VO.LayoutModel produceLayoutModel = travelCellListV3Mapper.produceLayoutModel(margins, cornerRadius, backgroundColor, z12, z11, str);
            if (r15 instanceof HTMLTagSupport) {
                ((HTMLTagSupport) r15).setTagSupported(blockDTO.getEnableHtmlTags());
            }
            boolean z13 = r15 instanceof CellDTO;
            CellDTO cellDTO = r15;
            if (z13) {
                cellDTO = DsCellExtensionsKt.disableAutoToggle((CellDTO) r15);
            }
            CellDTO cellDTO2 = cellDTO;
            if (i11 == blockDTO.getOnboardingIndex()) {
                onBoardingDTO = blockDTO.getOnboardingApp();
            }
            arrayList.add(produceVO(stateId, blockIndex, i11, cellDTO2, produceLayoutModel, onBoardingDTO));
            str2 = commonBackgroundColor;
            i11 = i12;
        }
        return arrayList;
    }

    private final TravelCellListV3VO.LayoutModel produceLayoutModel(TravelCellListV3DTO.ElementMargins margins, CornerRadius cornerRadius, String blockBackgroundColor, boolean isFirstCellInBlock, boolean isLastCellInBlock, String backgroundColor) {
        TravelCellListV3VO.LayoutModel.Background background;
        if (blockBackgroundColor != null) {
            background = new TravelCellListV3VO.LayoutModel.Background(blockBackgroundColor, isFirstCellInBlock ? ResourceExtKt.toPxF(cornerRadius.getPx(), this.context) : 0.0f, isLastCellInBlock ? ResourceExtKt.toPxF(cornerRadius.getPx(), this.context) : 0.0f);
        } else {
            background = null;
        }
        return new TravelCellListV3VO.LayoutModel(backgroundColor, ResourceExtKt.toPx(margins.getLeading().getPx(), this.context), isFirstCellInBlock ? ResourceExtKt.toPx(margins.getTop().getPx(), this.context) : 0, ResourceExtKt.toPx(margins.getTrailing().getPx(), this.context), isLastCellInBlock ? ResourceExtKt.toPx(margins.getBottom().getPx(), this.context) : 0, background);
    }

    private final TravelCellListV3VO produceVO(String stateId, int blockIndex, int subIndex, AtomDTO atom, TravelCellListV3VO.LayoutModel layoutModel, OnBoardingDTO onboardingApp) {
        return new TravelCellListV3VO((stateId + "-" + blockIndex + "-" + subIndex).hashCode(), atom, layoutModel, onboardingApp);
    }

    static /* synthetic */ TravelCellListV3VO produceVO$default(TravelCellListV3Mapper travelCellListV3Mapper, String str, int i11, int i12, AtomDTO atomDTO, TravelCellListV3VO.LayoutModel layoutModel, OnBoardingDTO onBoardingDTO, int i13, Object obj) {
        if ((i13 & 32) != 0) {
            onBoardingDTO = null;
        }
        return travelCellListV3Mapper.produceVO(str, i11, i12, atomDTO, layoutModel, onBoardingDTO);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<TravelCellListV3VO> invoke(@NotNull TravelCellListV3DTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        List<TravelCellListV3DTO.CellBlockDTO> cellBlocks = state.getCellBlocks();
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        for (Object obj : cellBlocks) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            C7714v.p(mapBlockToVOs(widgetInfo.d(), i11, (TravelCellListV3DTO.CellBlockDTO) obj, state.getBackgroundColor()), arrayList);
            i11 = i12;
        }
        return arrayList;
    }
}
