package ru.ozon.app.android.fresh.feature.b2b.widgets.legals.addLegalMobile.data;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.addLegalMobile.data.AddLegalMobileDTO;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.addLegalMobile.presentation.AddLegalMobileVO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.mappers.TextMapperKt;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\t\b\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000b\u001a\u00020\u0010*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000b\u0010\u0011J&\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalMobile/data/AddLegalMobileMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalMobile/data/AddLegalMobileDTO;", "Ll20/d;", "", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalMobile/presentation/AddLegalMobileVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalMobile/data/AddLegalMobileDTO$InputDTO;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalMobile/presentation/AddLegalMobileVO$InputVO;", "toVo", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalMobile/data/AddLegalMobileDTO$InputDTO;)Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalMobile/presentation/AddLegalMobileVO$InputVO;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalMobile/data/AddLegalMobileDTO$AdvantageDTO;", "", "index", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalMobile/presentation/AddLegalMobileVO$AdvantageVO;", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalMobile/data/AddLegalMobileDTO$AdvantageDTO;I)Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalMobile/presentation/AddLegalMobileVO$AdvantageVO;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalMobile/data/AddLegalMobileDTO;Ll20/d;)Ljava/util/List;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddLegalMobileMapper implements Function2<AddLegalMobileDTO, d, List<? extends AddLegalMobileVO>> {
    private final AddLegalMobileVO.InputVO toVo(AddLegalMobileDTO.InputDTO inputDTO) {
        return new AddLegalMobileVO.InputVO(inputDTO.getPlaceholder(), inputDTO.getDeeplink());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<AddLegalMobileVO> invoke(@NotNull AddLegalMobileDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = state.hashCode();
        TextDTO dsTextAtom = TextMapperKt.getDsTextAtom(state.getTitle());
        TextDTO dsTextAtom2 = TextMapperKt.getDsTextAtom(state.getSubtitle());
        AddLegalMobileVO.InputVO vo = toVo(state.getInput());
        List<AddLegalMobileDTO.AdvantageDTO> advantages = state.getAdvantages();
        K k11 = null;
        if (advantages != null) {
            List<AddLegalMobileDTO.AdvantageDTO> list = advantages;
            ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
            int i11 = 0;
            for (Object obj : list) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    C7714v.O0();
                    throw null;
                }
                arrayList.add(toVo((AddLegalMobileDTO.AdvantageDTO) obj, i11));
                i11 = i12;
            }
            k11 = arrayList;
        }
        if (k11 == null) {
            k11 = K.f71697a;
        }
        return C7714v.a0(new AddLegalMobileVO(hashCode, dsTextAtom, dsTextAtom2, vo, k11));
    }

    private final AddLegalMobileVO.AdvantageVO toVo(AddLegalMobileDTO.AdvantageDTO advantageDTO, int i11) {
        return new AddLegalMobileVO.AdvantageVO(String.valueOf(i11 + 1), TextMapperKt.getDsTextAtom(advantageDTO.getTitle()), TextMapperKt.getDsTextAtom(advantageDTO.getSubtitle()));
    }
}
