package ru.ozon.app.android.pdp.widgets.cartButtonQuant.doubleCart;

import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.text.h;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u001a)\u0010\u0005\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0012\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0001\"\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/uni/atoms/data/AtomActionDTO;", "", "", "ids", "", "getSkuParamsWithIds", "(Lru/ozon/uni/atoms/data/AtomActionDTO;[Ljava/lang/String;)Ljava/lang/Long;", "pdp_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DoubleCartQuantMapperKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Long getSkuParamsWithIds(AtomActionDTO atomActionDTO, String... strArr) {
        Map<String, String> params;
        String str;
        if (!C7705l.m(strArr, atomActionDTO.getId()) || (params = atomActionDTO.getParams()) == null || (str = params.get("sku")) == null) {
            return null;
        }
        return h.y0(str);
    }
}
