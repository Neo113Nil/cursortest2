package ru.ozon.app.android.fresh.feature.b2b.widgets.edoProviders.v1.presentation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.feature.b2b.widgets.edoProviders.v1.data.EdoProvidersDTO;
import ru.ozon.app.android.fresh.feature.b2b.widgets.edoProviders.v1.presentation.EdoProvidersVO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\t\b\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000b\u001a\u00020\u000e*\u00020\rH\u0002¢\u0006\u0004\b\u000b\u0010\u000fJ&\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v1/presentation/EdoProvidersMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v1/data/EdoProvidersDTO;", "Ll20/d;", "", "Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v1/presentation/EdoProvidersVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v1/data/EdoProvidersDTO$EdoInfoDTO;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v1/presentation/EdoProvidersVO$EdoInfoVO;", "toVO", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v1/data/EdoProvidersDTO$EdoInfoDTO;)Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v1/presentation/EdoProvidersVO$EdoInfoVO;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v1/data/EdoProvidersDTO$EdoInfoRemoveButtonDTO;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v1/presentation/EdoProvidersVO$EdoInfoRemoveButtonVO;", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v1/data/EdoProvidersDTO$EdoInfoRemoveButtonDTO;)Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v1/presentation/EdoProvidersVO$EdoInfoRemoveButtonVO;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v1/data/EdoProvidersDTO;Ll20/d;)Ljava/util/List;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class EdoProvidersMapper implements Function2<EdoProvidersDTO, d, List<? extends EdoProvidersVO>> {
    private final EdoProvidersVO.EdoInfoVO toVO(EdoProvidersDTO.EdoInfoDTO edoInfoDTO) {
        return new EdoProvidersVO.EdoInfoVO(edoInfoDTO.getTitle(), toVO(edoInfoDTO.getRemoveButton()), edoInfoDTO.getEdoId(), edoInfoDTO.getInfoBadge());
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<EdoProvidersVO> invoke(@NotNull EdoProvidersDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        TextDTO title = state.getTitle();
        List<EdoProvidersDTO.EdoInfoDTO> edoInfoList = state.getEdoInfoList();
        ArrayList arrayList = new ArrayList(C7714v.z(edoInfoList, 10));
        Iterator<T> it = edoInfoList.iterator();
        while (it.hasNext()) {
            arrayList.add(toVO((EdoProvidersDTO.EdoInfoDTO) it.next()));
        }
        return C7714v.a0(new EdoProvidersVO(hashCode, title, arrayList, state.getAddEdo()));
    }

    private final EdoProvidersVO.EdoInfoRemoveButtonVO toVO(EdoProvidersDTO.EdoInfoRemoveButtonDTO edoInfoRemoveButtonDTO) {
        String icon = edoInfoRemoveButtonDTO.getIcon();
        AtomActionDTO action = edoInfoRemoveButtonDTO.getAction();
        return new EdoProvidersVO.EdoInfoRemoveButtonVO(icon, action != null ? AtomActionMapperKt.toAtomAction(action, edoInfoRemoveButtonDTO.getTrackingInfo()) : null);
    }
}
