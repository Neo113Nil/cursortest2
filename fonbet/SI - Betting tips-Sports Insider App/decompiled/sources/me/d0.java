package me;

import android.os.Bundle;
import androidx.annotation.NonNull;
import java.util.HashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d0 implements y1.i {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f20645a = new HashMap();

    @NonNull
    public static d0 fromBundle(@NonNull Bundle bundle) {
        d0 d0Var = new d0();
        bundle.setClassLoader(d0.class.getClassLoader());
        boolean containsKey = bundle.containsKey("id");
        HashMap hashMap = d0Var.f20645a;
        if (containsKey) {
            d9.e.t(bundle, "id", hashMap, "id");
            return d0Var;
        }
        hashMap.put("id", 0);
        return d0Var;
    }

    public final int a() {
        return ((Integer) this.f20645a.get("id")).intValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d0.class != obj.getClass()) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return this.f20645a.containsKey("id") == d0Var.f20645a.containsKey("id") && a() == d0Var.a();
    }

    public final int hashCode() {
        return a() + 31;
    }

    public final String toString() {
        return "PremiumFragmentArgs{id=" + a() + "}";
    }
}
