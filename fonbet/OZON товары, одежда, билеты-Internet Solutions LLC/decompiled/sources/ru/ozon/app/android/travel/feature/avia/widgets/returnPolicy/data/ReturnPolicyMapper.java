package ru.ozon.app.android.travel.feature.avia.widgets.returnPolicy.data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.widgets.returnPolicy.data.ReturnPolicyDTO;
import ru.ozon.app.android.travel.feature.avia.widgets.returnPolicy.presentation.ReturnPolicyVO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000b\u001a\u00020\u000e*\u00020\rH\u0002¢\u0006\u0004\b\u000b\u0010\u000fJ*\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0010\u001a\u00020\u00022\n\u0010\u0012\u001a\u00060\u0003j\u0002`\u0011H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/returnPolicy/data/ReturnPolicyMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/avia/widgets/returnPolicy/data/ReturnPolicyDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/avia/widgets/returnPolicy/presentation/ReturnPolicyVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/travel/feature/avia/widgets/returnPolicy/data/ReturnPolicyDTO$TabDTO;", "Lru/ozon/app/android/travel/feature/avia/widgets/returnPolicy/presentation/ReturnPolicyVO$TabVO;", "toVO", "(Lru/ozon/app/android/travel/feature/avia/widgets/returnPolicy/data/ReturnPolicyDTO$TabDTO;)Lru/ozon/app/android/travel/feature/avia/widgets/returnPolicy/presentation/ReturnPolicyVO$TabVO;", "Lru/ozon/app/android/travel/feature/avia/widgets/returnPolicy/data/ReturnPolicyDTO$TabDTO$ReturnPolicyItemDTO;", "Lru/ozon/app/android/travel/feature/avia/widgets/returnPolicy/presentation/ReturnPolicyVO$TabVO$ReturnPolicyItemVO;", "(Lru/ozon/app/android/travel/feature/avia/widgets/returnPolicy/data/ReturnPolicyDTO$TabDTO$ReturnPolicyItemDTO;)Lru/ozon/app/android/travel/feature/avia/widgets/returnPolicy/presentation/ReturnPolicyVO$TabVO$ReturnPolicyItemVO;", "dto", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/avia/widgets/returnPolicy/data/ReturnPolicyDTO;Ll20/d;)Ljava/util/List;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ReturnPolicyMapper implements Function2<ReturnPolicyDTO, d, List<? extends ReturnPolicyVO>> {
    private final ReturnPolicyVO.TabVO toVO(ReturnPolicyDTO.TabDTO tabDTO) {
        String title = tabDTO.getTitle();
        ReturnPolicyVO.TabVO.ReturnPolicyItemVO vo = toVO(tabDTO.getReturnPolicy());
        Boolean isSelected = tabDTO.isSelected();
        return new ReturnPolicyVO.TabVO(title, vo, isSelected != null ? isSelected.booleanValue() : false);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<ReturnPolicyVO> invoke(@NotNull ReturnPolicyDTO dto, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        Iterator<ReturnPolicyDTO.TabDTO> it = dto.getTabs().iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            }
            if (Intrinsics.d(it.next().isSelected(), Boolean.TRUE)) {
                break;
            }
            i11++;
        }
        long hashCode = widgetInfo.d().hashCode();
        TextAtom title = dto.getTitle();
        List<ReturnPolicyDTO.TabDTO> tabs = dto.getTabs();
        ArrayList arrayList = new ArrayList(C7714v.z(tabs, 10));
        Iterator<T> it2 = tabs.iterator();
        while (it2.hasNext()) {
            arrayList.add(toVO((ReturnPolicyDTO.TabDTO) it2.next()));
        }
        return C7714v.a0(new ReturnPolicyVO(hashCode, title, arrayList, i11 >= 0 ? i11 : 0));
    }

    private final ReturnPolicyVO.TabVO.ReturnPolicyItemVO toVO(ReturnPolicyDTO.TabDTO.ReturnPolicyItemDTO returnPolicyItemDTO) {
        return new ReturnPolicyVO.TabVO.ReturnPolicyItemVO(returnPolicyItemDTO.getAccentPlaq(), returnPolicyItemDTO.getIcon(), returnPolicyItemDTO.getRoute(), returnPolicyItemDTO.getPolicyText());
    }
}
