package le;

import android.os.Bundle;
import androidx.annotation.NonNull;
import java.util.HashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class q1 implements y1.i {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f19916a = new HashMap();

    @NonNull
    public static q1 fromBundle(@NonNull Bundle bundle) {
        q1 q1Var = new q1();
        bundle.setClassLoader(q1.class.getClassLoader());
        boolean containsKey = bundle.containsKey("id");
        HashMap hashMap = q1Var.f19916a;
        if (containsKey) {
            d9.e.t(bundle, "id", hashMap, "id");
        } else {
            hashMap.put("id", 0);
        }
        if (bundle.containsKey("announcementId")) {
            d9.e.t(bundle, "announcementId", hashMap, "announcementId");
            return q1Var;
        }
        hashMap.put("announcementId", -1);
        return q1Var;
    }

    public final int a() {
        return ((Integer) this.f19916a.get("announcementId")).intValue();
    }

    public final int b() {
        return ((Integer) this.f19916a.get("id")).intValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q1.class != obj.getClass()) {
            return false;
        }
        q1 q1Var = (q1) obj;
        HashMap hashMap = q1Var.f19916a;
        HashMap hashMap2 = this.f19916a;
        return hashMap2.containsKey("id") == hashMap.containsKey("id") && b() == q1Var.b() && hashMap2.containsKey("announcementId") == hashMap.containsKey("announcementId") && a() == q1Var.a();
    }

    public final int hashCode() {
        return a() + ((b() + 31) * 31);
    }

    public final String toString() {
        return "PayPremiumFragmentArgs{id=" + b() + ", announcementId=" + a() + "}";
    }
}
