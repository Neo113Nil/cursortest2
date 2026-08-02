package ie0;

import java.util.Iterator;
import kotlin.collections.C7714v;
import ru.ozon.mapsdk.common.geoproxy.model.Components;

/* loaded from: classes3.dex */
public final class m {
    public static final String a(Components components) {
        Components.Settlement settlement = components.getSettlement();
        Object obj = null;
        String uid = settlement != null ? settlement.getUid() : null;
        Components.City city = components.getCity();
        String uid2 = city != null ? city.getUid() : null;
        Components.District district = components.getDistrict();
        String uid3 = district != null ? district.getUid() : null;
        Components.Region region = components.getRegion();
        String uid4 = region != null ? region.getUid() : null;
        Components.Country country = components.getCountry();
        Iterator it = C7714v.b0(uid, uid2, uid3, uid4, country != null ? country.getUid() : null).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            String str = (String) next;
            if (str != null && str.length() != 0) {
                obj = next;
                break;
            }
        }
        return (String) obj;
    }
}
