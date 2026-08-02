package vd;

import android.os.Bundle;
import androidx.annotation.NonNull;
import java.util.HashMap;
import y1.i;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b implements i {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f24554a = new HashMap();

    @NonNull
    public static b fromBundle(@NonNull Bundle bundle) {
        b bVar = new b();
        bundle.setClassLoader(b.class.getClassLoader());
        boolean containsKey = bundle.containsKey("destination");
        HashMap hashMap = bVar.f24554a;
        if (containsKey) {
            hashMap.put("destination", bundle.getString("destination"));
            return bVar;
        }
        hashMap.put("destination", null);
        return bVar;
    }

    public final String a() {
        return (String) this.f24554a.get("destination");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f24554a.containsKey("destination") != bVar.f24554a.containsKey("destination")) {
            return false;
        }
        return a() == null ? bVar.a() == null : a().equals(bVar.a());
    }

    public final int hashCode() {
        return 31 + (a() != null ? a().hashCode() : 0);
    }

    public final String toString() {
        return "FaqContentFragmentArgs{destination=" + a() + "}";
    }
}
