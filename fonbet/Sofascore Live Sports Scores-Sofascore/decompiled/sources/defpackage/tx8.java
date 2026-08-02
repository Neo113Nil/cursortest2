package defpackage;

import com.google.android.gms.internal.ads.s;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class tx8 {
    public final List a;
    public final List b;

    public tx8(s sVar) {
        sVar.getClass();
        km5 km5Var = km5.a;
        km5Var.getClass();
        this.a = sVar;
        this.b = km5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tx8)) {
            return false;
        }
        List list = this.a;
        int size = list.size();
        tx8 tx8Var = (tx8) obj;
        List list2 = tx8Var.b;
        List list3 = tx8Var.a;
        if (size == list3.size()) {
            List list4 = this.b;
            if (list4.size() == list2.size() && new HashSet(list).equals(new HashSet(list3)) && new HashSet(list4).equals(new HashSet(list2))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        return "GetTopicsResponse: Topics=" + this.a + ", EncryptedTopics=" + this.b;
    }
}
