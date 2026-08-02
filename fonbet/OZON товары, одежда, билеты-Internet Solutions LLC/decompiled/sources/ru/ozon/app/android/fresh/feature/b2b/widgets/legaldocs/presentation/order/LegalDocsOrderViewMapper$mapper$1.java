package ru.ozon.app.android.fresh.feature.b2b.widgets.legaldocs.presentation.order;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legaldocs.data.LegalDocsDTO;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legaldocs.presentation.order.LegalDocsOrderVO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.v3.mappers.TextMapperKt;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legaldocs/data/LegalDocsDTO;", "dto", "Ll20/d;", "<unused var>", "", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legaldocs/presentation/order/LegalDocsOrderVO;", "invoke", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/legaldocs/data/LegalDocsDTO;Ll20/d;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class LegalDocsOrderViewMapper$mapper$1 extends AbstractC7737t implements Function2<LegalDocsDTO, d, List<? extends LegalDocsOrderVO>> {
    final /* synthetic */ LegalDocsOrderViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LegalDocsOrderViewMapper$mapper$1(LegalDocsOrderViewMapper legalDocsOrderViewMapper) {
        super(2);
        this.this$0 = legalDocsOrderViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final List<LegalDocsOrderVO> invoke(LegalDocsDTO dto, d dVar) {
        TextAtom title;
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(dVar, "<unused var>");
        List<LegalDocsDTO.OrderGroupsDTO> groups = dto.getGroups();
        if (groups == null) {
            return K.f71697a;
        }
        LegalDocsOrderViewMapper legalDocsOrderViewMapper = this.this$0;
        ArrayList arrayList = new ArrayList();
        for (LegalDocsDTO.OrderGroupsDTO orderGroupsDTO : groups) {
            List<LegalDocsDTO.OrderGroupsDTO.OrderDTO> orders = orderGroupsDTO.getOrders();
            ArrayList arrayList2 = new ArrayList(C7714v.z(orders, 10));
            int i11 = 0;
            for (Object obj : orders) {
                int i12 = i11 + 1;
                LegalDocsOrderVO.Status status = null;
                if (i11 < 0) {
                    C7714v.O0();
                    throw null;
                }
                LegalDocsDTO.OrderGroupsDTO.OrderDTO orderDTO = (LegalDocsDTO.OrderGroupsDTO.OrderDTO) obj;
                long hashCode = orderDTO.getId().hashCode();
                TextDTO dsTextAtom = (i11 != 0 || (title = orderGroupsDTO.getTitle()) == null) ? null : TextMapperKt.getDsTextAtom(title);
                TextDTO dsTextAtom2 = TextMapperKt.getDsTextAtom(orderDTO.getTitle());
                TextDTO dsTextAtom3 = TextMapperKt.getDsTextAtom(orderDTO.getDate());
                TextDTO dsTextAtom4 = TextMapperKt.getDsTextAtom(orderDTO.getPrice());
                ButtonV3Atom.SmallIconButton downloadButton = orderDTO.getDownloadButton();
                LegalDocsDTO.OrderGroupsDTO.OrderDTO.StatusDTO status2 = orderDTO.getStatus();
                if (status2 != null) {
                    status = legalDocsOrderViewMapper.toVO(status2);
                }
                arrayList2.add(new LegalDocsOrderVO(hashCode, dsTextAtom, dsTextAtom2, dsTextAtom3, dsTextAtom4, downloadButton, status));
                i11 = i12;
            }
            C7714v.p(arrayList2, arrayList);
        }
        return arrayList;
    }
}
