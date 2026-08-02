package spay.seamlessAuth.core.data.network.dto;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import spay.seamlessAuth.core.data.network.request.ScopeItem;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001H\u0000¨\u0006\u0004"}, d2 = {"toModelList", "", "Lspay/seamlessAuth/core/data/network/request/ScopeItem;", "Lspay/seamlessAuth/core/data/network/dto/ScopeItemDto;", "SPaySDK_baseRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ScopeItemDtoKt {
    public static final List<ScopeItem> toModelList(List<ScopeItemDto> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((ScopeItemDto) it.next()).toModel());
        }
        return arrayList;
    }
}
