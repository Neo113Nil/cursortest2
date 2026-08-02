package se;

import android.os.Bundle;
import androidx.annotation.NonNull;
import java.util.HashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e implements y1.i {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f23526a = new HashMap();

    @NonNull
    public static e fromBundle(@NonNull Bundle bundle) {
        e eVar = new e();
        bundle.setClassLoader(e.class.getClassLoader());
        boolean containsKey = bundle.containsKey("announcementId");
        HashMap hashMap = eVar.f23526a;
        if (containsKey) {
            d9.e.t(bundle, "announcementId", hashMap, "announcementId");
            return eVar;
        }
        hashMap.put("announcementId", -1);
        return eVar;
    }

    public final int a() {
        return ((Integer) this.f23526a.get("announcementId")).intValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return this.f23526a.containsKey("announcementId") == eVar.f23526a.containsKey("announcementId") && a() == eVar.a();
    }

    public final int hashCode() {
        return a() + 31;
    }

    public final String toString() {
        return "ListSubsFragmentArgs{announcementId=" + a() + "}";
    }
}
