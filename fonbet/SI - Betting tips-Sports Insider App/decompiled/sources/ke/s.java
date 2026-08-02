package ke;

import android.os.Bundle;
import androidx.annotation.NonNull;
import java.util.HashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class s implements y1.i {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f19058a = new HashMap();

    @NonNull
    public static s fromBundle(@NonNull Bundle bundle) {
        s sVar = new s();
        bundle.setClassLoader(s.class.getClassLoader());
        boolean containsKey = bundle.containsKey("startBoard");
        HashMap hashMap = sVar.f19058a;
        if (containsKey) {
            d9.e.t(bundle, "startBoard", hashMap, "startBoard");
        } else {
            hashMap.put("startBoard", 0);
        }
        if (bundle.containsKey("startAuthInApp")) {
            d9.e.t(bundle, "startAuthInApp", hashMap, "startAuthInApp");
        } else {
            hashMap.put("startAuthInApp", 0);
        }
        if (bundle.containsKey("httpCode")) {
            d9.e.t(bundle, "httpCode", hashMap, "httpCode");
        } else {
            hashMap.put("httpCode", -1);
        }
        if (bundle.containsKey("stateKey")) {
            hashMap.put("stateKey", bundle.getString("stateKey"));
        } else {
            hashMap.put("stateKey", null);
        }
        if (bundle.containsKey("eMsgKey")) {
            hashMap.put("eMsgKey", bundle.getString("eMsgKey"));
            return sVar;
        }
        hashMap.put("eMsgKey", null);
        return sVar;
    }

    public final String a() {
        return (String) this.f19058a.get("eMsgKey");
    }

    public final int b() {
        return ((Integer) this.f19058a.get("httpCode")).intValue();
    }

    public final int c() {
        return ((Integer) this.f19058a.get("startAuthInApp")).intValue();
    }

    public final int d() {
        return ((Integer) this.f19058a.get("startBoard")).intValue();
    }

    public final String e() {
        return (String) this.f19058a.get("stateKey");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s.class != obj.getClass()) {
            return false;
        }
        s sVar = (s) obj;
        HashMap hashMap = sVar.f19058a;
        HashMap hashMap2 = this.f19058a;
        if (hashMap2.containsKey("startBoard") != hashMap.containsKey("startBoard") || d() != sVar.d() || hashMap2.containsKey("startAuthInApp") != hashMap.containsKey("startAuthInApp") || c() != sVar.c() || hashMap2.containsKey("httpCode") != hashMap.containsKey("httpCode") || b() != sVar.b() || hashMap2.containsKey("stateKey") != hashMap.containsKey("stateKey")) {
            return false;
        }
        if (e() == null ? sVar.e() != null : !e().equals(sVar.e())) {
            return false;
        }
        if (hashMap2.containsKey("eMsgKey") != hashMap.containsKey("eMsgKey")) {
            return false;
        }
        return a() == null ? sVar.a() == null : a().equals(sVar.a());
    }

    public final int hashCode() {
        return ((((b() + ((c() + ((d() + 31) * 31)) * 31)) * 31) + (e() != null ? e().hashCode() : 0)) * 31) + (a() != null ? a().hashCode() : 0);
    }

    public final String toString() {
        return "NoEthernetFragmentArgs{startBoard=" + d() + ", startAuthInApp=" + c() + ", httpCode=" + b() + ", stateKey=" + e() + ", eMsgKey=" + a() + "}";
    }
}
