package ru.ozon.app.android.travel.feature.b2b.widgets.accountBalanceInfo.data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.b2b.widgets.accountBalanceInfo.data.AccountBalanceInfoDTO;
import ru.ozon.app.android.travel.feature.b2b.widgets.accountBalanceInfo.presentation.AccountBalanceInfoVO;
import ru.ozon.app.android.travel.molecules.dto.textInfoCells.TextInfoCellDTO;
import ru.ozon.app.android.travel.molecules.mapper.MapperExtKt;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\n\u0010\u000b\u001a\u00060\u0003j\u0002`\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/widgets/accountBalanceInfo/data/AccountBalanceInfoMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/b2b/widgets/accountBalanceInfo/data/AccountBalanceInfoDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/b2b/widgets/accountBalanceInfo/presentation/AccountBalanceInfoVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/b2b/widgets/accountBalanceInfo/data/AccountBalanceInfoDTO;Ll20/d;)Ljava/util/List;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AccountBalanceInfoMapper implements Function2<AccountBalanceInfoDTO, d, List<? extends AccountBalanceInfoVO>> {
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<AccountBalanceInfoVO> invoke(@NotNull AccountBalanceInfoDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        TextAtom title = state.getTitle();
        ButtonV3Atom.LargeButton largeButton = state.getLargeButton();
        List<AccountBalanceInfoDTO.TextInfoCellsDTO> textElements = state.getTextElements();
        ArrayList arrayList = new ArrayList(C7714v.z(textElements, 10));
        for (AccountBalanceInfoDTO.TextInfoCellsDTO textInfoCellsDTO : textElements) {
            long hashCode2 = textInfoCellsDTO.hashCode();
            List<TextInfoCellDTO> cells = textInfoCellsDTO.getCells();
            ArrayList arrayList2 = new ArrayList(C7714v.z(cells, 10));
            Iterator<T> it = cells.iterator();
            while (it.hasNext()) {
                arrayList2.add(MapperExtKt.toVO((TextInfoCellDTO) it.next()));
            }
            arrayList.add(new AccountBalanceInfoVO.TextInfoCellsVO(hashCode2, arrayList2));
        }
        return C7714v.a0(new AccountBalanceInfoVO(hashCode, title, largeButton, arrayList));
    }
}
