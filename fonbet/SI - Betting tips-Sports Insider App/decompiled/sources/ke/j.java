package ke;

import android.os.Bundle;
import com.sports.insider.R;
import java.util.HashMap;
import y1.c0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class j implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f19039a = new HashMap();

    @Override // y1.c0
    public final int a() {
        return R.id.action_identifyFragment_to_boardSiAcademyFragment;
    }

    public final int b() {
        return ((Integer) this.f19039a.get("startAuthInApp")).intValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        return this.f19039a.containsKey("startAuthInApp") == jVar.f19039a.containsKey("startAuthInApp") && b() == jVar.b();
    }

    @Override // y1.c0
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        HashMap hashMap = this.f19039a;
        if (hashMap.containsKey("startAuthInApp")) {
            bundle.putInt("startAuthInApp", ((Integer) hashMap.get("startAuthInApp")).intValue());
            return bundle;
        }
        bundle.putInt("startAuthInApp", 0);
        return bundle;
    }

    public final int hashCode() {
        return ((b() + 31) * 31) + R.id.action_identifyFragment_to_boardSiAcademyFragment;
    }

    public final String toString() {
        return "ActionIdentifyFragmentToBoardSiAcademyFragment(actionId=2131361902){startAuthInApp=" + b() + "}";
    }
}
