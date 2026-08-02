package ie;

import android.os.Bundle;
import androidx.annotation.NonNull;
import d9.e;
import java.util.HashMap;
import y1.i;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d implements i {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f11238a = new HashMap();

    @NonNull
    public static d fromBundle(@NonNull Bundle bundle) {
        d dVar = new d();
        bundle.setClassLoader(d.class.getClassLoader());
        boolean containsKey = bundle.containsKey("newsId");
        HashMap hashMap = dVar.f11238a;
        if (containsKey) {
            e.t(bundle, "newsId", hashMap, "newsId");
            return dVar;
        }
        hashMap.put("newsId", 0);
        return dVar;
    }

    public final int a() {
        return ((Integer) this.f11238a.get("newsId")).intValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return this.f11238a.containsKey("newsId") == dVar.f11238a.containsKey("newsId") && a() == dVar.a();
    }

    public final int hashCode() {
        return a() + 31;
    }

    public final String toString() {
        return "ShowNewsFragmentArgs{newsId=" + a() + "}";
    }
}
