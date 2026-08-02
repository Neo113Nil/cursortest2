package pe;

import android.os.Bundle;
import com.sports.insider.R;
import java.util.HashMap;
import y1.c0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class m implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f21849a = new HashMap();

    @Override // y1.c0
    public final int a() {
        return R.id.action_allPredictionsFragment_to_faqSearchFragment;
    }

    public final String b() {
        return (String) this.f21849a.get("searchBet");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        if (this.f21849a.containsKey("searchBet") != mVar.f21849a.containsKey("searchBet")) {
            return false;
        }
        return b() == null ? mVar.b() == null : b().equals(mVar.b());
    }

    @Override // y1.c0
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        HashMap hashMap = this.f21849a;
        if (hashMap.containsKey("searchBet")) {
            bundle.putString("searchBet", (String) hashMap.get("searchBet"));
            return bundle;
        }
        bundle.putString("searchBet", null);
        return bundle;
    }

    public final int hashCode() {
        return (((b() != null ? b().hashCode() : 0) + 31) * 31) + R.id.action_allPredictionsFragment_to_faqSearchFragment;
    }

    public final String toString() {
        return "ActionAllPredictionsFragmentToFaqSearchFragment(actionId=2131361848){searchBet=" + b() + "}";
    }
}
