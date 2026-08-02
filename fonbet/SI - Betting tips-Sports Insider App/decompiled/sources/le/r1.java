package le;

import android.os.Bundle;
import com.sports.insider.R;
import java.util.HashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class r1 implements y1.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f19927a = new HashMap();

    @Override // y1.c0
    public final int a() {
        return R.id.action_payPremiumFragment_to_premiumFragment;
    }

    public final int b() {
        return ((Integer) this.f19927a.get("id")).intValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r1.class != obj.getClass()) {
            return false;
        }
        r1 r1Var = (r1) obj;
        return this.f19927a.containsKey("id") == r1Var.f19927a.containsKey("id") && b() == r1Var.b();
    }

    @Override // y1.c0
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        HashMap hashMap = this.f19927a;
        if (hashMap.containsKey("id")) {
            bundle.putInt("id", ((Integer) hashMap.get("id")).intValue());
            return bundle;
        }
        bundle.putInt("id", 0);
        return bundle;
    }

    public final int hashCode() {
        return ((b() + 31) * 31) + R.id.action_payPremiumFragment_to_premiumFragment;
    }

    public final String toString() {
        return "ActionPayPremiumFragmentToPremiumFragment(actionId=2131361917){id=" + b() + "}";
    }
}
