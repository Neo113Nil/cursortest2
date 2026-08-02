package defpackage;

import com.appsflyer.internal.i;
import java.io.Serializable;
import java.util.List;
import kotlin.collections.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class pui implements Serializable {
    public final List a;

    public pui(List list, boolean z) {
        list.getClass();
        n1k K = jaa.K(list, new kz2(66.7d, 100.0d));
        int intValue = ((Number) K.a).intValue();
        int intValue2 = ((Number) K.b).intValue();
        int intValue3 = ((Number) K.c).intValue();
        n1k K2 = jaa.K(list, new kz2(33.3d, 66.7d));
        int intValue4 = ((Number) K2.a).intValue();
        int intValue5 = ((Number) K2.b).intValue();
        int intValue6 = ((Number) K2.c).intValue();
        n1k K3 = jaa.K(list, new kz2(0.0d, 33.3d));
        int intValue7 = ((Number) K3.a).intValue();
        int intValue8 = ((Number) K3.b).intValue();
        int intValue9 = ((Number) K3.c).intValue();
        List j = z ? b.j(Integer.valueOf(intValue), Integer.valueOf(intValue4), Integer.valueOf(intValue7), Integer.valueOf(intValue2), Integer.valueOf(intValue5), Integer.valueOf(intValue8), Integer.valueOf(intValue3), Integer.valueOf(intValue6), Integer.valueOf(intValue9)) : b.j(Integer.valueOf(intValue9), Integer.valueOf(intValue6), Integer.valueOf(intValue3), Integer.valueOf(intValue8), Integer.valueOf(intValue5), Integer.valueOf(intValue2), Integer.valueOf(intValue7), Integer.valueOf(intValue4), Integer.valueOf(intValue));
        j.getClass();
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pui) && this.a.equals(((pui) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return i.i("TeamAttackingAreas(allValues=", ")", this.a);
    }
}
