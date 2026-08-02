package da;

import android.os.Bundle;
import com.sports.insider.R;
import com.sports.insider.data.repository.room.billing.PurchaseSubsTable;
import java.util.HashMap;
import y1.c0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class o implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f8340a;

    public o(String str) {
        HashMap hashMap = new HashMap();
        this.f8340a = hashMap;
        if (str == null) {
            throw new IllegalArgumentException("Argument \"sku\" is marked as non-null but was passed a null value.");
        }
        hashMap.put(PurchaseSubsTable.skuColumn, str);
    }

    @Override // y1.c0
    public final int a() {
        return R.id.action_global_viewCloudFragment;
    }

    public final int b() {
        return ((Integer) this.f8340a.get("announcementId")).intValue();
    }

    public final String c() {
        return (String) this.f8340a.get("currency");
    }

    public final int d() {
        return ((Integer) this.f8340a.get("id")).intValue();
    }

    public final long e() {
        return ((Long) this.f8340a.get("microPrice")).longValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o.class != obj.getClass()) {
            return false;
        }
        o oVar = (o) obj;
        HashMap hashMap = oVar.f8340a;
        HashMap hashMap2 = this.f8340a;
        if (hashMap2.containsKey(PurchaseSubsTable.skuColumn) != hashMap.containsKey(PurchaseSubsTable.skuColumn)) {
            return false;
        }
        if (h() == null ? oVar.h() != null : !h().equals(oVar.h())) {
            return false;
        }
        if (hashMap2.containsKey("id") != hashMap.containsKey("id") || d() != oVar.d() || hashMap2.containsKey("announcementId") != hashMap.containsKey("announcementId") || b() != oVar.b() || hashMap2.containsKey("microPrice") != hashMap.containsKey("microPrice") || e() != oVar.e() || hashMap2.containsKey("currency") != hashMap.containsKey("currency")) {
            return false;
        }
        if (c() == null ? oVar.c() != null : !c().equals(oVar.c())) {
            return false;
        }
        if (hashMap2.containsKey("paramAddsKey") != hashMap.containsKey("paramAddsKey")) {
            return false;
        }
        if (f() == null ? oVar.f() != null : !f().equals(oVar.f())) {
            return false;
        }
        if (hashMap2.containsKey("typeSubs") != hashMap.containsKey("typeSubs")) {
            return false;
        }
        if (i() == null ? oVar.i() != null : !i().equals(oVar.i())) {
            return false;
        }
        if (hashMap2.containsKey("paramAddsValue") != hashMap.containsKey("paramAddsValue")) {
            return false;
        }
        return g() == null ? oVar.g() == null : g().equals(oVar.g());
    }

    public final String f() {
        return (String) this.f8340a.get("paramAddsKey");
    }

    public final String g() {
        return (String) this.f8340a.get("paramAddsValue");
    }

    @Override // y1.c0
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        HashMap hashMap = this.f8340a;
        if (hashMap.containsKey(PurchaseSubsTable.skuColumn)) {
            bundle.putString(PurchaseSubsTable.skuColumn, (String) hashMap.get(PurchaseSubsTable.skuColumn));
        }
        if (hashMap.containsKey("id")) {
            bundle.putInt("id", ((Integer) hashMap.get("id")).intValue());
        } else {
            bundle.putInt("id", -1);
        }
        if (hashMap.containsKey("announcementId")) {
            bundle.putInt("announcementId", ((Integer) hashMap.get("announcementId")).intValue());
        } else {
            bundle.putInt("announcementId", -1);
        }
        if (hashMap.containsKey("microPrice")) {
            bundle.putLong("microPrice", ((Long) hashMap.get("microPrice")).longValue());
        } else {
            bundle.putLong("microPrice", 0L);
        }
        if (hashMap.containsKey("currency")) {
            bundle.putString("currency", (String) hashMap.get("currency"));
        } else {
            bundle.putString("currency", null);
        }
        if (hashMap.containsKey("paramAddsKey")) {
            bundle.putString("paramAddsKey", (String) hashMap.get("paramAddsKey"));
        } else {
            bundle.putString("paramAddsKey", null);
        }
        if (hashMap.containsKey("typeSubs")) {
            bundle.putString("typeSubs", (String) hashMap.get("typeSubs"));
        } else {
            bundle.putString("typeSubs", null);
        }
        if (hashMap.containsKey("paramAddsValue")) {
            bundle.putString("paramAddsValue", (String) hashMap.get("paramAddsValue"));
            return bundle;
        }
        bundle.putString("paramAddsValue", null);
        return bundle;
    }

    public final String h() {
        return (String) this.f8340a.get(PurchaseSubsTable.skuColumn);
    }

    public final int hashCode() {
        return ((((((((((((b() + ((d() + (((h() != null ? h().hashCode() : 0) + 31) * 31)) * 31)) * 31) + ((int) (e() ^ (e() >>> 32)))) * 31) + (c() != null ? c().hashCode() : 0)) * 31) + (f() != null ? f().hashCode() : 0)) * 31) + (i() != null ? i().hashCode() : 0)) * 31) + (g() != null ? g().hashCode() : 0)) * 31) + R.id.action_global_viewCloudFragment;
    }

    public final String i() {
        return (String) this.f8340a.get("typeSubs");
    }

    public final void j(int i5) {
        this.f8340a.put("announcementId", Integer.valueOf(i5));
    }

    public final void k(String str) {
        this.f8340a.put("currency", str);
    }

    public final void l(long j) {
        this.f8340a.put("microPrice", Long.valueOf(j));
    }

    public final void m(String str) {
        this.f8340a.put("typeSubs", str);
    }

    public final String toString() {
        return "ActionGlobalViewCloudFragment(actionId=2131361895){sku=" + h() + ", id=" + d() + ", announcementId=" + b() + ", microPrice=" + e() + ", currency=" + c() + ", paramAddsKey=" + f() + ", typeSubs=" + i() + ", paramAddsValue=" + g() + "}";
    }
}
