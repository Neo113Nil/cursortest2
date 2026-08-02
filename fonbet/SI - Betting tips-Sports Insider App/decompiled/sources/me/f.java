package me;

import android.os.Bundle;
import com.sports.insider.R;
import java.util.HashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f implements y1.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f20648a = new HashMap();

    @Override // y1.c0
    public final int a() {
        return R.id.action_expressFragment_to_faqContentFragment;
    }

    public final String b() {
        return (String) this.f20648a.get("destination");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f20648a.containsKey("destination") != fVar.f20648a.containsKey("destination")) {
            return false;
        }
        return b() == null ? fVar.b() == null : b().equals(fVar.b());
    }

    @Override // y1.c0
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        HashMap hashMap = this.f20648a;
        if (hashMap.containsKey("destination")) {
            bundle.putString("destination", (String) hashMap.get("destination"));
            return bundle;
        }
        bundle.putString("destination", null);
        return bundle;
    }

    public final int hashCode() {
        return (((b() != null ? b().hashCode() : 0) + 31) * 31) + R.id.action_expressFragment_to_faqContentFragment;
    }

    public final String toString() {
        return "ActionExpressFragmentToFaqContentFragment(actionId=2131361868){destination=" + b() + "}";
    }
}
