package ke;

import android.os.Bundle;
import androidx.annotation.NonNull;
import java.util.HashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d implements y1.i {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f19028a = new HashMap();

    @NonNull
    public static d fromBundle(@NonNull Bundle bundle) {
        d dVar = new d();
        bundle.setClassLoader(d.class.getClassLoader());
        boolean containsKey = bundle.containsKey("startAuthInApp");
        HashMap hashMap = dVar.f19028a;
        if (containsKey) {
            d9.e.t(bundle, "startAuthInApp", hashMap, "startAuthInApp");
            return dVar;
        }
        hashMap.put("startAuthInApp", 0);
        return dVar;
    }

    public final int a() {
        return ((Integer) this.f19028a.get("startAuthInApp")).intValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return this.f19028a.containsKey("startAuthInApp") == dVar.f19028a.containsKey("startAuthInApp") && a() == dVar.a();
    }

    public final int hashCode() {
        return a() + 31;
    }

    public final String toString() {
        return "BoardSiAcademyFragmentArgs{startAuthInApp=" + a() + "}";
    }
}
