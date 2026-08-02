package pe;

import android.os.Bundle;
import com.sports.insider.R;
import java.util.HashMap;
import y1.c0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f21830a = new HashMap();

    @Override // y1.c0
    public final int a() {
        return R.id.action_savedPredictionsFragment_to_faqSearchFragment;
    }

    public final String b() {
        return (String) this.f21830a.get("searchBet");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f21830a.containsKey("searchBet") != cVar.f21830a.containsKey("searchBet")) {
            return false;
        }
        return b() == null ? cVar.b() == null : b().equals(cVar.b());
    }

    @Override // y1.c0
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        HashMap hashMap = this.f21830a;
        if (hashMap.containsKey("searchBet")) {
            bundle.putString("searchBet", (String) hashMap.get("searchBet"));
            return bundle;
        }
        bundle.putString("searchBet", null);
        return bundle;
    }

    public final int hashCode() {
        return (((b() != null ? b().hashCode() : 0) + 31) * 31) + R.id.action_savedPredictionsFragment_to_faqSearchFragment;
    }

    public final String toString() {
        return "ActionSavedPredictionsFragmentToFaqSearchFragment(actionId=2131361924){searchBet=" + b() + "}";
    }
}
