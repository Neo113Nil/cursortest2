package ue;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.sports.insider.data.repository.room.billing.PurchaseSubsTable;
import java.util.HashMap;
import y1.i;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b implements i {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f24247a = new HashMap();

    @NonNull
    public static b fromBundle(@NonNull Bundle bundle) {
        b bVar = new b();
        bundle.setClassLoader(b.class.getClassLoader());
        if (!bundle.containsKey(PurchaseSubsTable.skuColumn)) {
            throw new IllegalArgumentException("Required argument \"sku\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString(PurchaseSubsTable.skuColumn);
        if (string == null) {
            throw new IllegalArgumentException("Argument \"sku\" is marked as non-null but was passed a null value.");
        }
        HashMap hashMap = bVar.f24247a;
        hashMap.put(PurchaseSubsTable.skuColumn, string);
        if (bundle.containsKey("id")) {
            d9.e.t(bundle, "id", hashMap, "id");
        } else {
            hashMap.put("id", -1);
        }
        if (bundle.containsKey("announcementId")) {
            d9.e.t(bundle, "announcementId", hashMap, "announcementId");
        } else {
            hashMap.put("announcementId", -1);
        }
        if (bundle.containsKey("microPrice")) {
            hashMap.put("microPrice", Long.valueOf(bundle.getLong("microPrice")));
        } else {
            hashMap.put("microPrice", 0L);
        }
        if (bundle.containsKey("currency")) {
            hashMap.put("currency", bundle.getString("currency"));
        } else {
            hashMap.put("currency", null);
        }
        if (bundle.containsKey("paramAddsKey")) {
            hashMap.put("paramAddsKey", bundle.getString("paramAddsKey"));
        } else {
            hashMap.put("paramAddsKey", null);
        }
        if (bundle.containsKey("typeSubs")) {
            hashMap.put("typeSubs", bundle.getString("typeSubs"));
        } else {
            hashMap.put("typeSubs", null);
        }
        if (bundle.containsKey("paramAddsValue")) {
            hashMap.put("paramAddsValue", bundle.getString("paramAddsValue"));
            return bVar;
        }
        hashMap.put("paramAddsValue", null);
        return bVar;
    }

    public final int a() {
        return ((Integer) this.f24247a.get("announcementId")).intValue();
    }

    public final String b() {
        return (String) this.f24247a.get("currency");
    }

    public final int c() {
        return ((Integer) this.f24247a.get("id")).intValue();
    }

    public final long d() {
        return ((Long) this.f24247a.get("microPrice")).longValue();
    }

    public final String e() {
        return (String) this.f24247a.get("paramAddsKey");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        HashMap hashMap = bVar.f24247a;
        HashMap hashMap2 = this.f24247a;
        if (hashMap2.containsKey(PurchaseSubsTable.skuColumn) != hashMap.containsKey(PurchaseSubsTable.skuColumn)) {
            return false;
        }
        if (g() == null ? bVar.g() != null : !g().equals(bVar.g())) {
            return false;
        }
        if (hashMap2.containsKey("id") != hashMap.containsKey("id") || c() != bVar.c() || hashMap2.containsKey("announcementId") != hashMap.containsKey("announcementId") || a() != bVar.a() || hashMap2.containsKey("microPrice") != hashMap.containsKey("microPrice") || d() != bVar.d() || hashMap2.containsKey("currency") != hashMap.containsKey("currency")) {
            return false;
        }
        if (b() == null ? bVar.b() != null : !b().equals(bVar.b())) {
            return false;
        }
        if (hashMap2.containsKey("paramAddsKey") != hashMap.containsKey("paramAddsKey")) {
            return false;
        }
        if (e() == null ? bVar.e() != null : !e().equals(bVar.e())) {
            return false;
        }
        if (hashMap2.containsKey("typeSubs") != hashMap.containsKey("typeSubs")) {
            return false;
        }
        if (h() == null ? bVar.h() != null : !h().equals(bVar.h())) {
            return false;
        }
        if (hashMap2.containsKey("paramAddsValue") != hashMap.containsKey("paramAddsValue")) {
            return false;
        }
        return f() == null ? bVar.f() == null : f().equals(bVar.f());
    }

    public final String f() {
        return (String) this.f24247a.get("paramAddsValue");
    }

    public final String g() {
        return (String) this.f24247a.get(PurchaseSubsTable.skuColumn);
    }

    public final String h() {
        return (String) this.f24247a.get("typeSubs");
    }

    public final int hashCode() {
        return ((((((((((a() + ((c() + (((g() != null ? g().hashCode() : 0) + 31) * 31)) * 31)) * 31) + ((int) (d() ^ (d() >>> 32)))) * 31) + (b() != null ? b().hashCode() : 0)) * 31) + (e() != null ? e().hashCode() : 0)) * 31) + (h() != null ? h().hashCode() : 0)) * 31) + (f() != null ? f().hashCode() : 0);
    }

    public final String toString() {
        return "ViewCloudFragmentArgs{sku=" + g() + ", id=" + c() + ", announcementId=" + a() + ", microPrice=" + d() + ", currency=" + b() + ", paramAddsKey=" + e() + ", typeSubs=" + h() + ", paramAddsValue=" + f() + "}";
    }
}
