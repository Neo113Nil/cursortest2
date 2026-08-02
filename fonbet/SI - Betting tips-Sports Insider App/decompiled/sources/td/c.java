package td;

import android.os.Bundle;
import androidx.annotation.NonNull;
import java.util.HashMap;
import y1.i;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c implements i {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f23859a = new HashMap();

    @NonNull
    public static c fromBundle(@NonNull Bundle bundle) {
        c cVar = new c();
        bundle.setClassLoader(c.class.getClassLoader());
        boolean containsKey = bundle.containsKey("searchBet");
        HashMap hashMap = cVar.f23859a;
        if (containsKey) {
            hashMap.put("searchBet", bundle.getString("searchBet"));
            return cVar;
        }
        hashMap.put("searchBet", null);
        return cVar;
    }

    public final String a() {
        return (String) this.f23859a.get("searchBet");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f23859a.containsKey("searchBet") != cVar.f23859a.containsKey("searchBet")) {
            return false;
        }
        return a() == null ? cVar.a() == null : a().equals(cVar.a());
    }

    public final int hashCode() {
        return 31 + (a() != null ? a().hashCode() : 0);
    }

    public final String toString() {
        return "FaqSearchFragmentArgs{searchBet=" + a() + "}";
    }
}
