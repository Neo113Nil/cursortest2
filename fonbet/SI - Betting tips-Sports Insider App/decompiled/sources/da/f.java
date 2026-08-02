package da;

import android.os.Bundle;
import com.sports.insider.R;
import java.util.HashMap;
import y1.c0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f8331a = new HashMap();

    @Override // y1.c0
    public final int a() {
        return R.id.action_global_livePayFragment;
    }

    public final int b() {
        return ((Integer) this.f8331a.get("announcementId")).intValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        return this.f8331a.containsKey("announcementId") == fVar.f8331a.containsKey("announcementId") && b() == fVar.b();
    }

    @Override // y1.c0
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        HashMap hashMap = this.f8331a;
        if (hashMap.containsKey("announcementId")) {
            bundle.putInt("announcementId", ((Integer) hashMap.get("announcementId")).intValue());
            return bundle;
        }
        bundle.putInt("announcementId", -1);
        return bundle;
    }

    public final int hashCode() {
        return ((b() + 31) * 31) + R.id.action_global_livePayFragment;
    }

    public final String toString() {
        return "ActionGlobalLivePayFragment(actionId=2131361882){announcementId=" + b() + "}";
    }
}
