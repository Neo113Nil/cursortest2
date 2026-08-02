package te;

import android.os.Bundle;
import androidx.annotation.NonNull;
import java.util.HashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a0 implements y1.i {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f23863a = new HashMap();

    @NonNull
    public static a0 fromBundle(@NonNull Bundle bundle) {
        a0 a0Var = new a0();
        bundle.setClassLoader(a0.class.getClassLoader());
        boolean containsKey = bundle.containsKey("errorCode");
        HashMap hashMap = a0Var.f23863a;
        if (containsKey) {
            d9.e.t(bundle, "errorCode", hashMap, "errorCode");
            return a0Var;
        }
        hashMap.put("errorCode", -1);
        return a0Var;
    }

    public final int a() {
        return ((Integer) this.f23863a.get("errorCode")).intValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a0.class != obj.getClass()) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return this.f23863a.containsKey("errorCode") == a0Var.f23863a.containsKey("errorCode") && a() == a0Var.a();
    }

    public final int hashCode() {
        return a() + 31;
    }

    public final String toString() {
        return "SupportChatArgs{errorCode=" + a() + "}";
    }
}
