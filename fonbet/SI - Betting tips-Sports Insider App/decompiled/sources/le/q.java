package le;

import android.os.Bundle;
import androidx.annotation.NonNull;
import java.util.HashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class q implements y1.i {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f19910a = new HashMap();

    @NonNull
    public static q fromBundle(@NonNull Bundle bundle) {
        q qVar = new q();
        bundle.setClassLoader(q.class.getClassLoader());
        boolean containsKey = bundle.containsKey("announcementId");
        HashMap hashMap = qVar.f19910a;
        if (containsKey) {
            d9.e.t(bundle, "announcementId", hashMap, "announcementId");
            return qVar;
        }
        hashMap.put("announcementId", -1);
        return qVar;
    }

    public final int a() {
        return ((Integer) this.f19910a.get("announcementId")).intValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        return this.f19910a.containsKey("announcementId") == qVar.f19910a.containsKey("announcementId") && a() == qVar.a();
    }

    public final int hashCode() {
        return a() + 31;
    }

    public final String toString() {
        return "LivePayFragmentArgs{announcementId=" + a() + "}";
    }
}
