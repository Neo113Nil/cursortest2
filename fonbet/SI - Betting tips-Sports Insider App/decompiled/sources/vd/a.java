package vd;

import android.os.Bundle;
import androidx.annotation.NonNull;
import java.util.HashMap;
import y1.i;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a implements i {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f24553a = new HashMap();

    @NonNull
    public static a fromBundle(@NonNull Bundle bundle) {
        a aVar = new a();
        bundle.setClassLoader(a.class.getClassLoader());
        boolean containsKey = bundle.containsKey("destination");
        HashMap hashMap = aVar.f24553a;
        if (containsKey) {
            hashMap.put("destination", bundle.getString("destination"));
            return aVar;
        }
        hashMap.put("destination", null);
        return aVar;
    }

    public final String a() {
        return (String) this.f24553a.get("destination");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f24553a.containsKey("destination") != aVar.f24553a.containsKey("destination")) {
            return false;
        }
        return a() == null ? aVar.a() == null : a().equals(aVar.a());
    }

    public final int hashCode() {
        return 31 + (a() != null ? a().hashCode() : 0);
    }

    public final String toString() {
        return "AcademyContentFragmentArgs{destination=" + a() + "}";
    }
}
