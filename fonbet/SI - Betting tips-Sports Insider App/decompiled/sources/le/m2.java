package le;

import android.os.Bundle;
import androidx.annotation.NonNull;
import java.util.HashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class m2 implements y1.i {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f19885a = new HashMap();

    @NonNull
    public static m2 fromBundle(@NonNull Bundle bundle) {
        m2 m2Var = new m2();
        bundle.setClassLoader(m2.class.getClassLoader());
        boolean containsKey = bundle.containsKey("id");
        HashMap hashMap = m2Var.f19885a;
        if (containsKey) {
            d9.e.t(bundle, "id", hashMap, "id");
        } else {
            hashMap.put("id", 0);
        }
        if (bundle.containsKey("event")) {
            hashMap.put("event", bundle.getString("event"));
        } else {
            hashMap.put("event", null);
        }
        if (bundle.containsKey("announcementId")) {
            d9.e.t(bundle, "announcementId", hashMap, "announcementId");
        } else {
            hashMap.put("announcementId", -1);
        }
        if (bundle.containsKey("type")) {
            d9.e.t(bundle, "type", hashMap, "type");
            return m2Var;
        }
        hashMap.put("type", 0);
        return m2Var;
    }

    public final int a() {
        return ((Integer) this.f19885a.get("announcementId")).intValue();
    }

    public final String b() {
        return (String) this.f19885a.get("event");
    }

    public final int c() {
        return ((Integer) this.f19885a.get("id")).intValue();
    }

    public final int d() {
        return ((Integer) this.f19885a.get("type")).intValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m2.class != obj.getClass()) {
            return false;
        }
        m2 m2Var = (m2) obj;
        HashMap hashMap = m2Var.f19885a;
        HashMap hashMap2 = this.f19885a;
        if (hashMap2.containsKey("id") != hashMap.containsKey("id") || c() != m2Var.c() || hashMap2.containsKey("event") != hashMap.containsKey("event")) {
            return false;
        }
        if (b() == null ? m2Var.b() == null : b().equals(m2Var.b())) {
            return hashMap2.containsKey("announcementId") == hashMap.containsKey("announcementId") && a() == m2Var.a() && hashMap2.containsKey("type") == hashMap.containsKey("type") && d() == m2Var.d();
        }
        return false;
    }

    public final int hashCode() {
        return d() + ((a() + ((((c() + 31) * 31) + (b() != null ? b().hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "VipAccessFragmentArgs{id=" + c() + ", event=" + b() + ", announcementId=" + a() + ", type=" + d() + "}";
    }
}
