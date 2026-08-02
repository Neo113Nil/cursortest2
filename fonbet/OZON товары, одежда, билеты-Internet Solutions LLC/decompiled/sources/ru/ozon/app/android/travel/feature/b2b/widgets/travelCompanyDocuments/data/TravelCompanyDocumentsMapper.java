package ru.ozon.app.android.travel.feature.b2b.widgets.travelCompanyDocuments.data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.disclaimer.DisclaimerAtom;
import ru.ozon.app.android.travel.feature.b2b.widgets.travelCompanyDocuments.data.TravelCompanyDocumentsDTO;
import ru.ozon.app.android.travel.feature.b2b.widgets.travelCompanyDocuments.presentation.TravelCompanyDocumentVO;
import ru.ozon.app.android.travel.feature.b2b.widgets.travelCompanyDocuments.presentation.TravelCompanyDocumentsDetailsVO;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\f\u001a\u0004\u0018\u00010\u000f2\b\u0010\t\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\f\u0010\u0010J*\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0011\u001a\u00020\u00022\n\u0010\u0013\u001a\u00060\u0003j\u0002`\u0012H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/widgets/travelCompanyDocuments/data/TravelCompanyDocumentsMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/b2b/widgets/travelCompanyDocuments/data/TravelCompanyDocumentsDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/b2b/widgets/travelCompanyDocuments/presentation/TravelCompanyDocumentsDetailsVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "dto", "", "stateId", "mapToVO", "(Lru/ozon/app/android/travel/feature/b2b/widgets/travelCompanyDocuments/data/TravelCompanyDocumentsDTO;Ljava/lang/String;)Lru/ozon/app/android/travel/feature/b2b/widgets/travelCompanyDocuments/presentation/TravelCompanyDocumentsDetailsVO;", "Lru/ozon/app/android/travel/feature/b2b/widgets/travelCompanyDocuments/data/TravelCompanyDocumentsDTO$CompanyDocumentDTO;", "Lru/ozon/app/android/travel/feature/b2b/widgets/travelCompanyDocuments/presentation/TravelCompanyDocumentVO;", "(Lru/ozon/app/android/travel/feature/b2b/widgets/travelCompanyDocuments/data/TravelCompanyDocumentsDTO$CompanyDocumentDTO;)Lru/ozon/app/android/travel/feature/b2b/widgets/travelCompanyDocuments/presentation/TravelCompanyDocumentVO;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/b2b/widgets/travelCompanyDocuments/data/TravelCompanyDocumentsDTO;Ll20/d;)Ljava/util/List;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TravelCompanyDocumentsMapper implements Function2<TravelCompanyDocumentsDTO, d, List<? extends TravelCompanyDocumentsDetailsVO>> {
    private final TravelCompanyDocumentsDetailsVO mapToVO(TravelCompanyDocumentsDTO dto, String stateId) {
        long hashCode = stateId.hashCode();
        DisclaimerAtom disclaimer = dto.getDisclaimer();
        TravelCompanyDocumentVO mapToVO = mapToVO(dto.getAllDocumentsLink());
        List<TravelCompanyDocumentsDTO.CompanyDocumentDTO> documents = dto.getDocuments();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = documents.iterator();
        while (it.hasNext()) {
            TravelCompanyDocumentVO mapToVO2 = mapToVO((TravelCompanyDocumentsDTO.CompanyDocumentDTO) it.next());
            if (mapToVO2 != null) {
                arrayList.add(mapToVO2);
            }
        }
        return new TravelCompanyDocumentsDetailsVO(hashCode, disclaimer, mapToVO, arrayList);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<TravelCompanyDocumentsDetailsVO> invoke(@NotNull TravelCompanyDocumentsDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(mapToVO(state, widgetInfo.d()));
    }

    private final TravelCompanyDocumentVO mapToVO(TravelCompanyDocumentsDTO.CompanyDocumentDTO dto) {
        if (dto != null) {
            return new TravelCompanyDocumentVO(dto.hashCode(), dto.getText(), dto.getButton());
        }
        return null;
    }
}
