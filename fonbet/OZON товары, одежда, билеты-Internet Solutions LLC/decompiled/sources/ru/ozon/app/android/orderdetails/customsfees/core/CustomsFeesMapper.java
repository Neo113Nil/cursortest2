package ru.ozon.app.android.orderdetails.customsfees.core;

import Lh.b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cscore.orderdetails.molecule.images.presentation.ImagesVO;
import ru.ozon.app.android.cscore.orderdetails.molecule.images.presentation.ImagesVOKt;
import ru.ozon.app.android.orderdetails.customsfees.data.CustomsFeesDTO;
import ru.ozon.app.android.orderdetails.customsfees.presentation.FeeVO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\b\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u00020\u0005*\u00020\t2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ&\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/orderdetails/customsfees/core/CustomsFeesMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/orderdetails/customsfees/data/CustomsFeesDTO;", "Ll20/d;", "", "Lru/ozon/app/android/orderdetails/customsfees/presentation/FeeVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/orderdetails/customsfees/data/CustomsFeesDTO$FeeDTO;", "", "id", "toVo", "(Lru/ozon/app/android/orderdetails/customsfees/data/CustomsFeesDTO$FeeDTO;J)Lru/ozon/app/android/orderdetails/customsfees/presentation/FeeVO;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/orderdetails/customsfees/data/CustomsFeesDTO;Ll20/d;)Ljava/util/List;", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CustomsFeesMapper implements Function2<CustomsFeesDTO, d, List<? extends FeeVO>> {
    private final FeeVO toVo(CustomsFeesDTO.FeeDTO feeDTO, long j11) {
        ArrayList y11 = C7714v.y(ImagesVOKt.toVo(feeDTO.getImages()).getImages(), 4);
        TextDTO title = feeDTO.getTitle();
        TextDTO copyText = feeDTO.getCopyText();
        IconDTO copyIcon = feeDTO.getCopyIcon();
        AtomActionDTO copyAction = feeDTO.getCopyAction();
        AtomAction atomAction = copyAction != null ? AtomActionMapperKt.toAtomAction(copyAction, null) : null;
        TextDTO subtitle = feeDTO.getSubtitle();
        List list = (List) C7714v.Q(0, y11);
        ImagesVO imagesVO = list != null ? new ImagesVO(list, null, null, 4, null) : null;
        List list2 = (List) C7714v.Q(1, y11);
        return new FeeVO(j11, title, copyText, copyIcon, atomAction, subtitle, imagesVO, list2 != null ? new ImagesVO(list2, null, null, 4, null) : null, feeDTO.getButton());
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<FeeVO> invoke(@NotNull CustomsFeesDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        List<CustomsFeesDTO.FeeDTO> fees = state.getFees();
        ArrayList arrayList = new ArrayList(C7714v.z(fees, 10));
        int i11 = 0;
        for (Object obj : fees) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            arrayList.add(toVo((CustomsFeesDTO.FeeDTO) obj, b.a(i11, widgetInfo.d(), "_")));
            i11 = i12;
        }
        return arrayList;
    }
}
