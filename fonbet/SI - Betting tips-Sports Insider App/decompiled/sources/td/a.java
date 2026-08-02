package td;

import android.os.Bundle;
import com.sports.insider.R;
import java.util.HashMap;
import y1.c0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f23854a = new HashMap();

    @Override // y1.c0
    public final int a() {
        return R.id.action_academyFragment_to_academyContentFragment;
    }

    public final String b() {
        return (String) this.f23854a.get("destination");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f23854a.containsKey("destination") != aVar.f23854a.containsKey("destination")) {
            return false;
        }
        return b() == null ? aVar.b() == null : b().equals(aVar.b());
    }

    @Override // y1.c0
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        HashMap hashMap = this.f23854a;
        if (hashMap.containsKey("destination")) {
            bundle.putString("destination", (String) hashMap.get("destination"));
            return bundle;
        }
        bundle.putString("destination", null);
        return bundle;
    }

    public final int hashCode() {
        return (((b() != null ? b().hashCode() : 0) + 31) * 31) + R.id.action_academyFragment_to_academyContentFragment;
    }

    public final String toString() {
        return "ActionAcademyFragmentToAcademyContentFragment(actionId=2131361846){destination=" + b() + "}";
    }
}
