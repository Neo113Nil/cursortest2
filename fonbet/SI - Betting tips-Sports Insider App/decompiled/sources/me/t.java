package me;

import android.os.Bundle;
import com.sports.insider.R;
import java.util.HashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class t implements y1.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f20680a = new HashMap();

    @Override // y1.c0
    public final int a() {
        return R.id.action_predictionFragment_to_faqSearchFragment;
    }

    public final String b() {
        return (String) this.f20680a.get("searchBet");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t.class != obj.getClass()) {
            return false;
        }
        t tVar = (t) obj;
        if (this.f20680a.containsKey("searchBet") != tVar.f20680a.containsKey("searchBet")) {
            return false;
        }
        return b() == null ? tVar.b() == null : b().equals(tVar.b());
    }

    @Override // y1.c0
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        HashMap hashMap = this.f20680a;
        if (hashMap.containsKey("searchBet")) {
            bundle.putString("searchBet", (String) hashMap.get("searchBet"));
            return bundle;
        }
        bundle.putString("searchBet", null);
        return bundle;
    }

    public final int hashCode() {
        return (((b() != null ? b().hashCode() : 0) + 31) * 31) + R.id.action_predictionFragment_to_faqSearchFragment;
    }

    public final String toString() {
        return "ActionPredictionFragmentToFaqSearchFragment(actionId=2131361920){searchBet=" + b() + "}";
    }
}
