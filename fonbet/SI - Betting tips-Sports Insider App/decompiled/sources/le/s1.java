package le;

import android.os.Bundle;
import com.sports.insider.R;
import java.util.HashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class s1 implements y1.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f19939a = new HashMap();

    @Override // y1.c0
    public final int a() {
        return R.id.action_payPremiumFragment_to_vipAccessFragment;
    }

    public final int b() {
        return ((Integer) this.f19939a.get("announcementId")).intValue();
    }

    public final String c() {
        return (String) this.f19939a.get("event");
    }

    public final int d() {
        return ((Integer) this.f19939a.get("id")).intValue();
    }

    public final int e() {
        return ((Integer) this.f19939a.get("type")).intValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s1.class != obj.getClass()) {
            return false;
        }
        s1 s1Var = (s1) obj;
        HashMap hashMap = s1Var.f19939a;
        HashMap hashMap2 = this.f19939a;
        if (hashMap2.containsKey("id") != hashMap.containsKey("id") || d() != s1Var.d() || hashMap2.containsKey("event") != hashMap.containsKey("event")) {
            return false;
        }
        if (c() == null ? s1Var.c() == null : c().equals(s1Var.c())) {
            return hashMap2.containsKey("announcementId") == hashMap.containsKey("announcementId") && b() == s1Var.b() && hashMap2.containsKey("type") == hashMap.containsKey("type") && e() == s1Var.e();
        }
        return false;
    }

    @Override // y1.c0
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        HashMap hashMap = this.f19939a;
        if (hashMap.containsKey("id")) {
            bundle.putInt("id", ((Integer) hashMap.get("id")).intValue());
        } else {
            bundle.putInt("id", 0);
        }
        if (hashMap.containsKey("event")) {
            bundle.putString("event", (String) hashMap.get("event"));
        } else {
            bundle.putString("event", null);
        }
        if (hashMap.containsKey("announcementId")) {
            bundle.putInt("announcementId", ((Integer) hashMap.get("announcementId")).intValue());
        } else {
            bundle.putInt("announcementId", -1);
        }
        if (hashMap.containsKey("type")) {
            bundle.putInt("type", ((Integer) hashMap.get("type")).intValue());
            return bundle;
        }
        bundle.putInt("type", 0);
        return bundle;
    }

    public final int hashCode() {
        return ((e() + ((b() + ((((d() + 31) * 31) + (c() != null ? c().hashCode() : 0)) * 31)) * 31)) * 31) + R.id.action_payPremiumFragment_to_vipAccessFragment;
    }

    public final String toString() {
        return "ActionPayPremiumFragmentToVipAccessFragment(actionId=2131361918){id=" + d() + ", event=" + c() + ", announcementId=" + b() + ", type=" + e() + "}";
    }
}
