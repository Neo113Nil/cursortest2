package da;

import android.os.Bundle;
import com.sports.insider.R;
import java.util.HashMap;
import y1.c0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f8329a = new HashMap();

    @Override // y1.c0
    public final int a() {
        return R.id.action_global_faqContentFragment;
    }

    public final String b() {
        return (String) this.f8329a.get("destination");
    }

    public final void c(String str) {
        this.f8329a.put("destination", str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f8329a.containsKey("destination") != dVar.f8329a.containsKey("destination")) {
            return false;
        }
        return b() == null ? dVar.b() == null : b().equals(dVar.b());
    }

    @Override // y1.c0
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        HashMap hashMap = this.f8329a;
        if (hashMap.containsKey("destination")) {
            bundle.putString("destination", (String) hashMap.get("destination"));
            return bundle;
        }
        bundle.putString("destination", null);
        return bundle;
    }

    public final int hashCode() {
        return (((b() != null ? b().hashCode() : 0) + 31) * 31) + R.id.action_global_faqContentFragment;
    }

    public final String toString() {
        return "ActionGlobalFaqContentFragment(actionId=2131361877){destination=" + b() + "}";
    }
}
