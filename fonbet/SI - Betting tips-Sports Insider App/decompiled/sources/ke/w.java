package ke;

import android.os.Bundle;
import com.sports.insider.R;
import java.util.HashMap;
import y1.c0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class w implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f19069a = new HashMap();

    @Override // y1.c0
    public final int a() {
        return R.id.action_sportInsiderFragment_to_identifyFragment;
    }

    public final int b() {
        return ((Integer) this.f19069a.get("startAuthInApp")).intValue();
    }

    public final int c() {
        return ((Integer) this.f19069a.get("startBoard")).intValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w.class != obj.getClass()) {
            return false;
        }
        w wVar = (w) obj;
        HashMap hashMap = wVar.f19069a;
        HashMap hashMap2 = this.f19069a;
        return hashMap2.containsKey("startBoard") == hashMap.containsKey("startBoard") && c() == wVar.c() && hashMap2.containsKey("startAuthInApp") == hashMap.containsKey("startAuthInApp") && b() == wVar.b();
    }

    @Override // y1.c0
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        HashMap hashMap = this.f19069a;
        if (hashMap.containsKey("startBoard")) {
            bundle.putInt("startBoard", ((Integer) hashMap.get("startBoard")).intValue());
        } else {
            bundle.putInt("startBoard", 0);
        }
        if (hashMap.containsKey("startAuthInApp")) {
            bundle.putInt("startAuthInApp", ((Integer) hashMap.get("startAuthInApp")).intValue());
            return bundle;
        }
        bundle.putInt("startAuthInApp", 0);
        return bundle;
    }

    public final int hashCode() {
        return ((b() + ((c() + 31) * 31)) * 31) + R.id.action_sportInsiderFragment_to_identifyFragment;
    }

    public final String toString() {
        return "ActionSportInsiderFragmentToIdentifyFragment(actionId=2131361933){startBoard=" + c() + ", startAuthInApp=" + b() + "}";
    }
}
