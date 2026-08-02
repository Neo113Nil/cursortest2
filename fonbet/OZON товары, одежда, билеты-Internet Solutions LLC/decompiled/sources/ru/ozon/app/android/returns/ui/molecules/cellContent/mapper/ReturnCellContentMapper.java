package ru.ozon.app.android.returns.ui.molecules.cellContent.mapper;

import Lh.b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.ui.molecules.cellContent.data.ReturnCellContentDTO;
import ru.ozon.app.android.returns.ui.molecules.cellContent.viewObject.ReturnCellContentVO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000b\u001a\u00020\u0012*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u000b\u0010\u0013J*\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0014\u001a\u00020\u00022\n\u0010\u0016\u001a\u00060\u0003j\u0002`\u0015H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/returns/ui/molecules/cellContent/mapper/ReturnCellContentMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/returns/ui/molecules/cellContent/data/ReturnCellContentDTO;", "Ll20/d;", "", "Lru/ozon/app/android/returns/ui/molecules/cellContent/viewObject/ReturnCellContentVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/returns/ui/molecules/cellContent/data/ReturnCellContentDTO$SeparatorDTO;", "Lru/ozon/app/android/returns/ui/molecules/cellContent/viewObject/ReturnCellContentVO$Separator;", "toVO", "(Lru/ozon/app/android/returns/ui/molecules/cellContent/data/ReturnCellContentDTO$SeparatorDTO;)Lru/ozon/app/android/returns/ui/molecules/cellContent/viewObject/ReturnCellContentVO$Separator;", "Lru/ozon/app/android/returns/ui/molecules/cellContent/data/ReturnCellContentDTO$BalanceRowDTO;", "", "stateId", "", "position", "Lru/ozon/app/android/returns/ui/molecules/cellContent/viewObject/ReturnCellContentVO$BalanceRow;", "(Lru/ozon/app/android/returns/ui/molecules/cellContent/data/ReturnCellContentDTO$BalanceRowDTO;Ljava/lang/String;I)Lru/ozon/app/android/returns/ui/molecules/cellContent/viewObject/ReturnCellContentVO$BalanceRow;", "state", "Lru/ozon/composer/network/widget/item/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/returns/ui/molecules/cellContent/data/ReturnCellContentDTO;Ll20/d;)Ljava/util/List;", "returns_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReturnCellContentMapper implements Function2<ReturnCellContentDTO, d, List<? extends ReturnCellContentVO>> {
    private final ReturnCellContentVO.Separator toVO(ReturnCellContentDTO.SeparatorDTO separatorDTO) {
        Float height = separatorDTO.getHeight();
        float floatValue = height != null ? height.floatValue() : 0.5f;
        String color = separatorDTO.getColor();
        if (color == null) {
            color = UniColors.GRAPHIC_NEUTRAL.getToken();
        }
        return new ReturnCellContentVO.Separator(color, Math.max(floatValue, 0.0f));
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<ReturnCellContentVO> invoke(@NotNull ReturnCellContentDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        String d11 = widgetInfo.d();
        long hashCode = d11.hashCode();
        TextDTO title = state.getTitle();
        List<ReturnCellContentDTO.BalanceRowDTO> rows = state.getRows();
        ArrayList arrayList = new ArrayList(C7714v.z(rows, 10));
        int i11 = 0;
        for (Object obj : rows) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            arrayList.add(toVO((ReturnCellContentDTO.BalanceRowDTO) obj, d11, i11));
            i11 = i12;
        }
        ReturnCellContentVO.Separator vo = toVO(state.getSeparator());
        ReturnCellContentVO.BalanceRow vo2 = toVO(state.getTotal(), d11, -1);
        TextDTO description = state.getDescription();
        List<ButtonV3DTO> buttons = state.getButtons();
        if (buttons == null) {
            buttons = K.f71697a;
        }
        return C7714v.a0(new ReturnCellContentVO(hashCode, title, arrayList, vo, vo2, description, buttons));
    }

    private final ReturnCellContentVO.BalanceRow toVO(ReturnCellContentDTO.BalanceRowDTO balanceRowDTO, String str, int i11) {
        return new ReturnCellContentVO.BalanceRow(b.a(i11, str, "_"), balanceRowDTO.getText(), balanceRowDTO.getPrice());
    }
}
