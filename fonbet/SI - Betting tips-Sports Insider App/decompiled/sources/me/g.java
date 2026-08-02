package me;

import android.os.Bundle;
import com.sports.insider.R;
import java.util.HashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g implements y1.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f20650a = new HashMap();

    @Override // y1.c0
    public final int a() {
        return R.id.action_expressFragment_to_faqSearchFragment;
    }

    public final String b() {
        return (String) this.f20650a.get("searchBet");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f20650a.containsKey("searchBet") != gVar.f20650a.containsKey("searchBet")) {
            return false;
        }
        return b() == null ? gVar.b() == null : b().equals(gVar.b());
    }

    @Override // y1.c0
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        HashMap hashMap = this.f20650a;
        if (hashMap.containsKey("searchBet")) {
            bundle.putString("searchBet", (String) hashMap.get("searchBet"));
            return bundle;
        }
        bundle.putString("searchBet", null);
        return bundle;
    }

    public final int hashCode() {
        return (((b() != null ? b().hashCode() : 0) + 31) * 31) + R.id.action_expressFragment_to_faqSearchFragment;
    }

    public final String toString() {
        return "ActionExpressFragmentToFaqSearchFragment(actionId=2131361869){searchBet=" + b() + "}";
    }
}
