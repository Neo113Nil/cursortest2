package kb;

import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.MultiFactorSession;
import com.google.firebase.auth.internal.zzam;

/* loaded from: classes3.dex */
public abstract class E {
    public static Task a(MultiFactorSession multiFactorSession) {
        AbstractC3191o.m(multiFactorSession);
        zzam zzamVar = (zzam) multiFactorSession;
        return FirebaseAuth.getInstance(zzamVar.g().n0()).W(zzamVar);
    }

    public static D b(F f10, String str) {
        return new D((String) AbstractC3191o.m(str), (F) AbstractC3191o.m(f10), null);
    }

    public static D c(String str, String str2) {
        return new D((String) AbstractC3191o.m(str2), null, (String) AbstractC3191o.m(str));
    }
}
