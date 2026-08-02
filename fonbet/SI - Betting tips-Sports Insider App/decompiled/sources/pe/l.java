package pe;

import android.os.Bundle;
import com.sports.insider.R;
import java.util.HashMap;
import y1.c0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class l implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f21848a = new HashMap();

    @Override // y1.c0
    public final int a() {
        return R.id.action_allPredictionsFragment_to_expressFragment;
    }

    public final int b() {
        return ((Integer) this.f21848a.get("id")).intValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        return this.f21848a.containsKey("id") == lVar.f21848a.containsKey("id") && b() == lVar.b();
    }

    @Override // y1.c0
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        HashMap hashMap = this.f21848a;
        if (hashMap.containsKey("id")) {
            bundle.putInt("id", ((Integer) hashMap.get("id")).intValue());
            return bundle;
        }
        bundle.putInt("id", 0);
        return bundle;
    }

    public final int hashCode() {
        return ((b() + 31) * 31) + R.id.action_allPredictionsFragment_to_expressFragment;
    }

    public final String toString() {
        return "ActionAllPredictionsFragmentToExpressFragment(actionId=2131361847){id=" + b() + "}";
    }
}
