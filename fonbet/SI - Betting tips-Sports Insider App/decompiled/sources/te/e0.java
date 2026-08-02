package te;

import android.os.Bundle;
import androidx.annotation.NonNull;
import java.util.HashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e0 implements y1.i {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f23872a = new HashMap();

    @NonNull
    public static e0 fromBundle(@NonNull Bundle bundle) {
        e0 e0Var = new e0();
        bundle.setClassLoader(e0.class.getClassLoader());
        boolean containsKey = bundle.containsKey("errorCode");
        HashMap hashMap = e0Var.f23872a;
        if (containsKey) {
            d9.e.t(bundle, "errorCode", hashMap, "errorCode");
            return e0Var;
        }
        hashMap.put("errorCode", -1);
        return e0Var;
    }

    public final int a() {
        return ((Integer) this.f23872a.get("errorCode")).intValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e0.class != obj.getClass()) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return this.f23872a.containsKey("errorCode") == e0Var.f23872a.containsKey("errorCode") && a() == e0Var.a();
    }

    public final int hashCode() {
        return a() + 31;
    }

    public final String toString() {
        return "SupportMailFragmentArgs{errorCode=" + a() + "}";
    }
}
