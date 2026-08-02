package le;

import android.os.Bundle;
import androidx.annotation.NonNull;
import java.util.HashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class n0 implements y1.i {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f19889a = new HashMap();

    @NonNull
    public static n0 fromBundle(@NonNull Bundle bundle) {
        n0 n0Var = new n0();
        bundle.setClassLoader(n0.class.getClassLoader());
        boolean containsKey = bundle.containsKey("id");
        HashMap hashMap = n0Var.f19889a;
        if (containsKey) {
            d9.e.t(bundle, "id", hashMap, "id");
        } else {
            hashMap.put("id", 0);
        }
        if (bundle.containsKey("announcementId")) {
            d9.e.t(bundle, "announcementId", hashMap, "announcementId");
            return n0Var;
        }
        hashMap.put("announcementId", -1);
        return n0Var;
    }

    public final int a() {
        return ((Integer) this.f19889a.get("announcementId")).intValue();
    }

    public final int b() {
        return ((Integer) this.f19889a.get("id")).intValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n0.class != obj.getClass()) {
            return false;
        }
        n0 n0Var = (n0) obj;
        HashMap hashMap = n0Var.f19889a;
        HashMap hashMap2 = this.f19889a;
        return hashMap2.containsKey("id") == hashMap.containsKey("id") && b() == n0Var.b() && hashMap2.containsKey("announcementId") == hashMap.containsKey("announcementId") && a() == n0Var.a();
    }

    public final int hashCode() {
        return a() + ((b() + 31) * 31);
    }

    public final String toString() {
        return "PayExpressFragmentArgs{id=" + b() + ", announcementId=" + a() + "}";
    }
}
