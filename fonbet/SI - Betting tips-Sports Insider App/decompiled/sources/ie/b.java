package ie;

import android.os.Bundle;
import com.sports.insider.R;
import java.util.HashMap;
import y1.c0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f11235a = new HashMap();

    @Override // y1.c0
    public final int a() {
        return R.id.action_newsFragment_to_showNewsFragment;
    }

    public final int b() {
        return ((Integer) this.f11235a.get("newsId")).intValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f11235a.containsKey("newsId") == bVar.f11235a.containsKey("newsId") && b() == bVar.b();
    }

    @Override // y1.c0
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        HashMap hashMap = this.f11235a;
        if (hashMap.containsKey("newsId")) {
            bundle.putInt("newsId", ((Integer) hashMap.get("newsId")).intValue());
            return bundle;
        }
        bundle.putInt("newsId", 0);
        return bundle;
    }

    public final int hashCode() {
        return ((b() + 31) * 31) + R.id.action_newsFragment_to_showNewsFragment;
    }

    public final String toString() {
        return "ActionNewsFragmentToShowNewsFragment(actionId=2131361911){newsId=" + b() + "}";
    }
}
