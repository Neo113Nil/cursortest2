package ke;

import android.os.Bundle;
import com.sports.insider.R;
import java.util.HashMap;
import y1.c0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class k implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f19040a = new HashMap();

    @Override // y1.c0
    public final int a() {
        return R.id.action_identifyFragment_to_noEthernetFragment;
    }

    public final String b() {
        return (String) this.f19040a.get("eMsgKey");
    }

    public final int c() {
        return ((Integer) this.f19040a.get("httpCode")).intValue();
    }

    public final int d() {
        return ((Integer) this.f19040a.get("startAuthInApp")).intValue();
    }

    public final int e() {
        return ((Integer) this.f19040a.get("startBoard")).intValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        HashMap hashMap = kVar.f19040a;
        HashMap hashMap2 = this.f19040a;
        if (hashMap2.containsKey("startBoard") != hashMap.containsKey("startBoard") || e() != kVar.e() || hashMap2.containsKey("startAuthInApp") != hashMap.containsKey("startAuthInApp") || d() != kVar.d() || hashMap2.containsKey("httpCode") != hashMap.containsKey("httpCode") || c() != kVar.c() || hashMap2.containsKey("stateKey") != hashMap.containsKey("stateKey")) {
            return false;
        }
        if (f() == null ? kVar.f() != null : !f().equals(kVar.f())) {
            return false;
        }
        if (hashMap2.containsKey("eMsgKey") != hashMap.containsKey("eMsgKey")) {
            return false;
        }
        return b() == null ? kVar.b() == null : b().equals(kVar.b());
    }

    public final String f() {
        return (String) this.f19040a.get("stateKey");
    }

    @Override // y1.c0
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        HashMap hashMap = this.f19040a;
        if (hashMap.containsKey("startBoard")) {
            bundle.putInt("startBoard", ((Integer) hashMap.get("startBoard")).intValue());
        } else {
            bundle.putInt("startBoard", 0);
        }
        if (hashMap.containsKey("startAuthInApp")) {
            bundle.putInt("startAuthInApp", ((Integer) hashMap.get("startAuthInApp")).intValue());
        } else {
            bundle.putInt("startAuthInApp", 0);
        }
        if (hashMap.containsKey("httpCode")) {
            bundle.putInt("httpCode", ((Integer) hashMap.get("httpCode")).intValue());
        } else {
            bundle.putInt("httpCode", -1);
        }
        if (hashMap.containsKey("stateKey")) {
            bundle.putString("stateKey", (String) hashMap.get("stateKey"));
        } else {
            bundle.putString("stateKey", null);
        }
        if (hashMap.containsKey("eMsgKey")) {
            bundle.putString("eMsgKey", (String) hashMap.get("eMsgKey"));
            return bundle;
        }
        bundle.putString("eMsgKey", null);
        return bundle;
    }

    public final int hashCode() {
        return ((((((c() + ((d() + ((e() + 31) * 31)) * 31)) * 31) + (f() != null ? f().hashCode() : 0)) * 31) + (b() != null ? b().hashCode() : 0)) * 31) + R.id.action_identifyFragment_to_noEthernetFragment;
    }

    public final String toString() {
        return "ActionIdentifyFragmentToNoEthernetFragment(actionId=2131361903){startBoard=" + e() + ", startAuthInApp=" + d() + ", httpCode=" + c() + ", stateKey=" + f() + ", eMsgKey=" + b() + "}";
    }
}
