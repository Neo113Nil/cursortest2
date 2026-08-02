package da;

import android.os.Bundle;
import com.sports.insider.R;
import java.util.HashMap;
import y1.c0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f8332a = new HashMap();

    @Override // y1.c0
    public final int a() {
        return R.id.action_global_payExpressFragment;
    }

    public final int b() {
        return ((Integer) this.f8332a.get("announcementId")).intValue();
    }

    public final int c() {
        return ((Integer) this.f8332a.get("id")).intValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        HashMap hashMap = gVar.f8332a;
        HashMap hashMap2 = this.f8332a;
        return hashMap2.containsKey("id") == hashMap.containsKey("id") && c() == gVar.c() && hashMap2.containsKey("announcementId") == hashMap.containsKey("announcementId") && b() == gVar.b();
    }

    @Override // y1.c0
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        HashMap hashMap = this.f8332a;
        if (hashMap.containsKey("id")) {
            bundle.putInt("id", ((Integer) hashMap.get("id")).intValue());
        } else {
            bundle.putInt("id", 0);
        }
        if (hashMap.containsKey("announcementId")) {
            bundle.putInt("announcementId", ((Integer) hashMap.get("announcementId")).intValue());
            return bundle;
        }
        bundle.putInt("announcementId", -1);
        return bundle;
    }

    public final int hashCode() {
        return ((b() + ((c() + 31) * 31)) * 31) + R.id.action_global_payExpressFragment;
    }

    public final String toString() {
        return "ActionGlobalPayExpressFragment(actionId=2131361884){id=" + c() + ", announcementId=" + b() + "}";
    }
}
