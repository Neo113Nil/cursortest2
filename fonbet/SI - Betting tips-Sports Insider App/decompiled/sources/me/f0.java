package me;

import android.os.Bundle;
import com.sports.insider.R;
import java.util.HashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f0 implements y1.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f20649a = new HashMap();

    @Override // y1.c0
    public final int a() {
        return R.id.action_premiumFragment_to_faqSearchFragment;
    }

    public final String b() {
        return (String) this.f20649a.get("searchBet");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f0.class != obj.getClass()) {
            return false;
        }
        f0 f0Var = (f0) obj;
        if (this.f20649a.containsKey("searchBet") != f0Var.f20649a.containsKey("searchBet")) {
            return false;
        }
        return b() == null ? f0Var.b() == null : b().equals(f0Var.b());
    }

    @Override // y1.c0
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        HashMap hashMap = this.f20649a;
        if (hashMap.containsKey("searchBet")) {
            bundle.putString("searchBet", (String) hashMap.get("searchBet"));
            return bundle;
        }
        bundle.putString("searchBet", null);
        return bundle;
    }

    public final int hashCode() {
        return (((b() != null ? b().hashCode() : 0) + 31) * 31) + R.id.action_premiumFragment_to_faqSearchFragment;
    }

    public final String toString() {
        return "ActionPremiumFragmentToFaqSearchFragment(actionId=2131361922){searchBet=" + b() + "}";
    }
}
