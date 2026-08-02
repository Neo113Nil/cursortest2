package ru.ozon.app.android.pdpoldwidgets.widgets.trustFactor.core;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdpoldwidgets.widgets.trustFactor.data.TrustFactorDTO;
import ru.ozon.app.android.pdpoldwidgets.widgets.trustFactor.presentation.TrustFactorVO;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/trustFactor/core/TrustFactorMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/pdpoldwidgets/widgets/trustFactor/data/TrustFactorDTO;", "Ll20/d;", "", "Lru/ozon/app/android/pdpoldwidgets/widgets/trustFactor/presentation/TrustFactorVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "dto", "widgetInfo", "invoke", "(Lru/ozon/app/android/pdpoldwidgets/widgets/trustFactor/data/TrustFactorDTO;Ll20/d;)Ljava/util/List;", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TrustFactorMapper implements Function2<TrustFactorDTO, d, List<? extends TrustFactorVO>> {
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<TrustFactorVO> invoke(@NotNull TrustFactorDTO dto, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        int size = dto.getTrustFactors().size();
        int P11 = C7714v.P(dto.getTrustFactors());
        long hashCode = widgetInfo.d().hashCode();
        List<TrustFactorDTO.TrustFactorItem> trustFactors = dto.getTrustFactors();
        ArrayList arrayList = new ArrayList(C7714v.z(trustFactors, 10));
        int i11 = 0;
        for (Object obj : trustFactors) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            TrustFactorDTO.TrustFactorItem trustFactorItem = (TrustFactorDTO.TrustFactorItem) obj;
            arrayList.add(new TrustFactorVO.TrustFactorItem(size == 1 ? TrustFactorVO.Type.ONLY : (size <= 1 || i11 != 0) ? (size <= 1 || i11 != P11) ? TrustFactorVO.Type.MIDDLE : TrustFactorVO.Type.LAST : TrustFactorVO.Type.FIRST, trustFactorItem.getIcon(), trustFactorItem.getTitle(), trustFactorItem.getDescription(), trustFactorItem.getDeeplink()));
            i11 = i12;
        }
        return C7714v.a0(new TrustFactorVO(hashCode, arrayList));
    }
}
