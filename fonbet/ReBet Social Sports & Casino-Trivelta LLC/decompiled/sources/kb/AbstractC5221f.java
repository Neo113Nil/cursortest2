package kb;

import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.EmailAuthCredential;

/* renamed from: kb.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5221f {
    public static AuthCredential a(String str, String str2) {
        AbstractC3191o.g(str);
        AbstractC3191o.g(str2);
        return new EmailAuthCredential(str, str2);
    }

    public static AuthCredential b(String str, String str2) {
        if (EmailAuthCredential.k(str2)) {
            return new EmailAuthCredential(str, null, str2, null, false);
        }
        throw new IllegalArgumentException("Given link is not a valid email link. Please use FirebaseAuth#isSignInWithEmailLink(String) to determine this before calling this function");
    }
}
