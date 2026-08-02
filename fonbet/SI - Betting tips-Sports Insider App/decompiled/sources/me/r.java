package me;

import android.os.Bundle;
import androidx.annotation.NonNull;
import java.util.HashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class r implements y1.i {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f20678a = new HashMap();

    @NonNull
    public static r fromBundle(@NonNull Bundle bundle) {
        r rVar = new r();
        bundle.setClassLoader(r.class.getClassLoader());
        boolean containsKey = bundle.containsKey("id");
        HashMap hashMap = rVar.f20678a;
        if (containsKey) {
            d9.e.t(bundle, "id", hashMap, "id");
            return rVar;
        }
        hashMap.put("id", 0);
        return rVar;
    }

    public final int a() {
        return ((Integer) this.f20678a.get("id")).intValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r.class != obj.getClass()) {
            return false;
        }
        r rVar = (r) obj;
        return this.f20678a.containsKey("id") == rVar.f20678a.containsKey("id") && a() == rVar.a();
    }

    public final int hashCode() {
        return a() + 31;
    }

    public final String toString() {
        return "PredictionFragmentArgs{id=" + a() + "}";
    }
}
