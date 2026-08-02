package ru.ozon.app.android.travel.feature.avia.widgets.luggageRequirements.v2.data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.widgets.luggageRequirements.v2.data.LuggageRequirementsV2DTO;
import ru.ozon.app.android.travel.feature.avia.widgets.luggageRequirements.v2.presentation.LuggageRequirementsV2VO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000b\u001a\u00020\u000e*\u00020\rH\u0002¢\u0006\u0004\b\u000b\u0010\u000fJ#\u0010\u000b\u001a\u00020\u0015*\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u000b\u0010\u0016J*\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0017\u001a\u00020\u00022\n\u0010\u0019\u001a\u00060\u0003j\u0002`\u0018H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/luggageRequirements/v2/data/LuggageRequirementsV2Mapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/avia/widgets/luggageRequirements/v2/data/LuggageRequirementsV2DTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/avia/widgets/luggageRequirements/v2/presentation/LuggageRequirementsV2VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "stateId", "toVO", "(Lru/ozon/app/android/travel/feature/avia/widgets/luggageRequirements/v2/data/LuggageRequirementsV2DTO;Ljava/lang/String;)Lru/ozon/app/android/travel/feature/avia/widgets/luggageRequirements/v2/presentation/LuggageRequirementsV2VO;", "Lru/ozon/app/android/travel/feature/avia/widgets/luggageRequirements/v2/data/LuggageRequirementsV2DTO$TabDTO;", "Lru/ozon/app/android/travel/feature/avia/widgets/luggageRequirements/v2/presentation/LuggageRequirementsV2VO$TabVO;", "(Lru/ozon/app/android/travel/feature/avia/widgets/luggageRequirements/v2/data/LuggageRequirementsV2DTO$TabDTO;)Lru/ozon/app/android/travel/feature/avia/widgets/luggageRequirements/v2/presentation/LuggageRequirementsV2VO$TabVO;", "Lru/ozon/app/android/travel/feature/avia/widgets/luggageRequirements/v2/data/LuggageRequirementsV2DTO$CompanyRequirementsDTO;", "", "isSeparatorVisible", "", "index", "Lru/ozon/app/android/travel/feature/avia/widgets/luggageRequirements/v2/presentation/LuggageRequirementsV2VO$CompanyRequirementsVO;", "(Lru/ozon/app/android/travel/feature/avia/widgets/luggageRequirements/v2/data/LuggageRequirementsV2DTO$CompanyRequirementsDTO;ZI)Lru/ozon/app/android/travel/feature/avia/widgets/luggageRequirements/v2/presentation/LuggageRequirementsV2VO$CompanyRequirementsVO;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/avia/widgets/luggageRequirements/v2/data/LuggageRequirementsV2DTO;Ll20/d;)Ljava/util/List;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LuggageRequirementsV2Mapper implements Function2<LuggageRequirementsV2DTO, d, List<? extends LuggageRequirementsV2VO>> {
    private final LuggageRequirementsV2VO toVO(LuggageRequirementsV2DTO luggageRequirementsV2DTO, String str) {
        long hashCode = str.hashCode();
        TextAtom title = luggageRequirementsV2DTO.getTitle();
        List<LuggageRequirementsV2DTO.TabDTO> tabs = luggageRequirementsV2DTO.getTabs();
        ArrayList arrayList = new ArrayList(C7714v.z(tabs, 10));
        Iterator<T> it = tabs.iterator();
        while (it.hasNext()) {
            arrayList.add(toVO((LuggageRequirementsV2DTO.TabDTO) it.next()));
        }
        return new LuggageRequirementsV2VO(hashCode, title, arrayList);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<LuggageRequirementsV2VO> invoke(@NotNull LuggageRequirementsV2DTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVO(state, widgetInfo.d()));
    }

    private final LuggageRequirementsV2VO.TabVO toVO(LuggageRequirementsV2DTO.TabDTO tabDTO) {
        String title = tabDTO.getTitle();
        List<LuggageRequirementsV2DTO.CompanyRequirementsDTO> requirements = tabDTO.getRequirements();
        ArrayList arrayList = new ArrayList(C7714v.z(requirements, 10));
        int i11 = 0;
        for (Object obj : requirements) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            arrayList.add(toVO((LuggageRequirementsV2DTO.CompanyRequirementsDTO) obj, i11 != C7714v.P(tabDTO.getRequirements()), i11));
            i11 = i12;
        }
        return new LuggageRequirementsV2VO.TabVO(title, arrayList);
    }

    private final LuggageRequirementsV2VO.CompanyRequirementsVO toVO(LuggageRequirementsV2DTO.CompanyRequirementsDTO companyRequirementsDTO, boolean z11, int i11) {
        return new LuggageRequirementsV2VO.CompanyRequirementsVO(i11, companyRequirementsDTO.getIconUrl(), companyRequirementsDTO.getCompanyName(), companyRequirementsDTO.getHandCarryTitle(), companyRequirementsDTO.getHandCarryText(), companyRequirementsDTO.getLuggageTitle(), companyRequirementsDTO.getLuggageText(), z11);
    }
}
