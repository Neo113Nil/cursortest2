package defpackage;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class g89 {
    public final String a;
    public final List b;

    public g89(String str, List list) {
        Object obj;
        String str2;
        str.getClass();
        list.getClass();
        this.a = str;
        this.b = list;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (Intrinsics.c(((h89) obj).a, CampaignEx.JSON_KEY_AD_Q)) {
                    break;
                }
            }
        }
        h89 h89Var = (h89) obj;
        if (h89Var == null || (str2 = h89Var.b) == null) {
            return;
        }
        b.f(str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g89)) {
            return false;
        }
        g89 g89Var = (g89) obj;
        return Intrinsics.c(this.a, g89Var.a) && Intrinsics.c(this.b, g89Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HeaderValue(value=");
        sb.append(this.a);
        sb.append(", params=");
        return fc6.p(sb, this.b, ')');
    }
}
