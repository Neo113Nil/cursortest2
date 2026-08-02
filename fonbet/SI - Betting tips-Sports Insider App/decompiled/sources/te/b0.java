package te;

import android.os.Bundle;
import com.sports.insider.R;
import java.util.HashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b0 implements y1.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f23866a = new HashMap();

    @Override // y1.c0
    public final int a() {
        return R.id.action_supportChat_to_academyContentFragment;
    }

    public final String b() {
        return (String) this.f23866a.get("destination");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b0.class != obj.getClass()) {
            return false;
        }
        b0 b0Var = (b0) obj;
        if (this.f23866a.containsKey("destination") != b0Var.f23866a.containsKey("destination")) {
            return false;
        }
        return b() == null ? b0Var.b() == null : b().equals(b0Var.b());
    }

    @Override // y1.c0
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        HashMap hashMap = this.f23866a;
        if (hashMap.containsKey("destination")) {
            bundle.putString("destination", (String) hashMap.get("destination"));
            return bundle;
        }
        bundle.putString("destination", null);
        return bundle;
    }

    public final int hashCode() {
        return (((b() != null ? b().hashCode() : 0) + 31) * 31) + R.id.action_supportChat_to_academyContentFragment;
    }

    public final String toString() {
        return "ActionSupportChatToAcademyContentFragment(actionId=2131361934){destination=" + b() + "}";
    }
}
