package ke;

import android.os.Bundle;
import androidx.annotation.NonNull;
import java.util.HashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i implements y1.i {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f19038a = new HashMap();

    @NonNull
    public static i fromBundle(@NonNull Bundle bundle) {
        i iVar = new i();
        bundle.setClassLoader(i.class.getClassLoader());
        boolean containsKey = bundle.containsKey("startBoard");
        HashMap hashMap = iVar.f19038a;
        if (containsKey) {
            d9.e.t(bundle, "startBoard", hashMap, "startBoard");
        } else {
            hashMap.put("startBoard", 0);
        }
        if (bundle.containsKey("startAuthInApp")) {
            d9.e.t(bundle, "startAuthInApp", hashMap, "startAuthInApp");
            return iVar;
        }
        hashMap.put("startAuthInApp", 0);
        return iVar;
    }

    public final int a() {
        return ((Integer) this.f19038a.get("startAuthInApp")).intValue();
    }

    public final int b() {
        return ((Integer) this.f19038a.get("startBoard")).intValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        HashMap hashMap = iVar.f19038a;
        HashMap hashMap2 = this.f19038a;
        return hashMap2.containsKey("startBoard") == hashMap.containsKey("startBoard") && b() == iVar.b() && hashMap2.containsKey("startAuthInApp") == hashMap.containsKey("startAuthInApp") && a() == iVar.a();
    }

    public final int hashCode() {
        return a() + ((b() + 31) * 31);
    }

    public final String toString() {
        return "IdentifyFragmentArgs{startBoard=" + b() + ", startAuthInApp=" + a() + "}";
    }
}
